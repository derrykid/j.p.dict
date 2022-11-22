package jp.project.webRequester;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import jp.project.word.Vocabulary;

import java.io.IOException;

public class VocabularyDeserializer extends JsonDeserializer<Vocabulary> {
    @Override
    public Vocabulary deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonNode rootNode = jsonParser.getCodec().readTree(jsonParser);

        // response json node. This is the root
        JsonNode nodes = rootNode.at("/message");

        // the array of all sub-nodes
        // we get the first node
        JsonNode firstNode = nodes.iterator().next();

        String english = firstNode.at("/key").asText();
        String chinese = firstNode.at("/paraphrase").asText();

        return new Vocabulary(english, chinese);
    }
}
