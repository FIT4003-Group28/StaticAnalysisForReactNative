package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.CreateGpgProfileCommand$CreateGPGProfileCommand;
/* compiled from: PG */
/* renamed from: gol  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gol implements ayqb {
    public final /* synthetic */ gom a;
    public final /* synthetic */ CreateGpgProfileCommand$CreateGPGProfileCommand b;
    private final /* synthetic */ int c;

    public /* synthetic */ gol(gom gomVar, CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand) {
        this.a = gomVar;
        this.b = createGpgProfileCommand$CreateGPGProfileCommand;
    }

    public /* synthetic */ gol(gom gomVar, CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand, int i) {
        this.c = i;
        this.a = gomVar;
        this.b = createGpgProfileCommand$CreateGPGProfileCommand;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.c == 0) {
            gom gomVar = this.a;
            CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand = this.b;
            zep.d("Couldn't launch GPG profile flow.", (Throwable) obj);
            aafo aafoVar = gomVar.c;
            CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand = createGpgProfileCommand$CreateGPGProfileCommand.d;
            if (commandExecutorCommandOuterClass$CommandExecutorCommand == null) {
                commandExecutorCommandOuterClass$CommandExecutorCommand = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
            }
            aafoVar.b(commandExecutorCommandOuterClass$CommandExecutorCommand.b);
            return;
        }
        gom gomVar2 = this.a;
        CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand2 = this.b;
        gpg gpgVar = gomVar2.b;
        Activity activity = gomVar2.a;
        Uri parse = Uri.parse((String) obj);
        CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand2 = createGpgProfileCommand$CreateGPGProfileCommand2.c;
        if (commandExecutorCommandOuterClass$CommandExecutorCommand2 == null) {
            commandExecutorCommandOuterClass$CommandExecutorCommand2 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
        }
        apzg b = gom.b(commandExecutorCommandOuterClass$CommandExecutorCommand2);
        CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand3 = createGpgProfileCommand$CreateGPGProfileCommand2.d;
        if (commandExecutorCommandOuterClass$CommandExecutorCommand3 == null) {
            commandExecutorCommandOuterClass$CommandExecutorCommand3 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
        }
        apzg b2 = gom.b(commandExecutorCommandOuterClass$CommandExecutorCommand3);
        CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand4 = createGpgProfileCommand$CreateGPGProfileCommand2.e;
        if (commandExecutorCommandOuterClass$CommandExecutorCommand4 == null) {
            commandExecutorCommandOuterClass$CommandExecutorCommand4 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
        }
        apzg b3 = gom.b(commandExecutorCommandOuterClass$CommandExecutorCommand4);
        gpgVar.c = b;
        gpgVar.d = b2;
        gpgVar.e = b3;
        gpgVar.f = activity.getClass().getName();
        Intent intent = new Intent(activity, UriFlowActivity.class);
        intent.putExtra("URL_EXTRA", parse.toString());
        intent.putExtra("TOKEN_EXTRA", gpgVar.b);
        activity.startActivity(intent);
    }
}
