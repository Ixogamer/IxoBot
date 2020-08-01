import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.channel.MessageChannel;
import discord4j.core.object.presence.Presence;
import discord4j.core.spec.MessageCreateSpec;

import java.io.File;
import java.util.function.Consumer;

import static discord4j.core.object.presence.Presence.doNotDisturb;


public class Main {
    public static void main(final String[] args) {
        final String token = args[0];
        final DiscordClient client = DiscordClient.create(token);
        final GatewayDiscordClient gateway = client.login().block();
       // final GatewayDiscordClient = client.changePresence(StatusType.DND, ActivityType.WATCHING, "uwu");

        gateway.on(MessageCreateEvent.class).subscribe(event -> {
            final Message message = event.getMessage();
            if ("!ping".equals(message.getContent())) {
                final MessageChannel chan = mesgit remote add origin https://github.com/Ixogamer/IxoBot.git
                git push -u origin mastersage.getChannel().block();
                chan.createMessage("Pong!").block();
            }
        });

        gateway.on(MessageCreateEvent.class).subscribe(event -> {
            final Message message = event.getMessage();
            if ("!drako".equals(message.getContent())) {
                final MessageChannel chan = message.getChannel().block();
                chan.createMessage(new Consumer<MessageCreateSpec>() {
                    @Override
                    public void accept(MessageCreateSpec spec) {
                        try {
                            spec.addFile("Drako.mp4", Main.class.getResourceAsStream("/Drako1.mp4"));
                            {
                            }
                        } catch (Exception e) {
                            System.out.printf("An exception has ocurred.");
                        }
                    }
                }).block();
            }
        });
        System.out.println(new File("ixo.jpg").getAbsolutePath());
        gateway.onDisconnect().block();
    }
}