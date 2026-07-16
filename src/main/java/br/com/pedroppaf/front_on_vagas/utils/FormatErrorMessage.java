package br.com.pedroppaf.front_on_vagas.utils;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

public class FormatErrorMessage {

    public static String formatErrorMessage(String message) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode rootNode = objectMapper.readTree(message);
            if (rootNode.isArray()) {
                return formatArrayErrorMessage(rootNode);
            }
            return rootNode.asText();
        } catch (Exception e) {
            return message;
        }
    }

    public static String formatArrayErrorMessage(JsonNode arrayNode) {
        StringBuilder formattedMessager = new StringBuilder();
        for (JsonNode node : arrayNode) {
            formattedMessager.append("-").append(node.get("message").asText()).append("\n");
        }
        return formattedMessager.toString();
    }
}
