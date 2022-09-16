package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.net.Uri;
import android.os.RemoteException;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.CreateGpgProfileCommand$CreateGPGProfileCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gom  reason: default package */
/* loaded from: classes3.dex */
public final class gom implements aafl {
    public final Activity a;
    public final gpg b;
    public final aafo c;
    private final afvn d;
    private final vzc e;

    public gom(Activity activity, gpg gpgVar, vzc vzcVar, afvn afvnVar, aafo aafoVar) {
        this.a = activity;
        this.b = gpgVar;
        this.e = vzcVar;
        this.d = afvnVar;
        this.c = aafoVar;
    }

    public static apzg b(CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand) {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand, commandExecutorCommandOuterClass$CommandExecutorCommand);
        return (apzg) aopcVar.mo39build();
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Account account;
        apzgVar.getClass();
        CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand = (CreateGpgProfileCommand$CreateGPGProfileCommand) apzgVar.qm(CreateGpgProfileCommand$CreateGPGProfileCommand.createGpgProfileCommand);
        try {
            account = this.e.a(this.d.c());
        } catch (RemoteException | qsc | qsd e) {
            zep.d("exception occurred while trying to get account", e);
            account = null;
        }
        if (account == null) {
            aafo aafoVar = this.c;
            CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand = createGpgProfileCommand$CreateGPGProfileCommand.d;
            if (commandExecutorCommandOuterClass$CommandExecutorCommand == null) {
                commandExecutorCommandOuterClass$CommandExecutorCommand = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
            }
            aafoVar.b(commandExecutorCommandOuterClass$CommandExecutorCommand.b);
            return;
        }
        gpg gpgVar = this.b;
        Uri parse = Uri.parse(createGpgProfileCommand$CreateGPGProfileCommand.b);
        gpgVar.b = Long.toString(gpgVar.a.nextLong());
        afvj.a(this.a, account, parse.buildUpon().appendQueryParameter("token", gpgVar.b).build().toString()).F(azpj.c()).y(aypa.a()).U(new gol(this, createGpgProfileCommand$CreateGPGProfileCommand, 1), new gol(this, createGpgProfileCommand$CreateGPGProfileCommand));
    }
}
