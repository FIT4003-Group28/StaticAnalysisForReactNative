package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AccountUnlinkCommandOuterClass$AccountUnlinkCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: goj  reason: default package */
/* loaded from: classes3.dex */
public final class goj implements aafl {
    public final rxs a;
    public final aafo b;
    private final dt c;
    private final afvn d;
    private final vzc e;

    public goj(dt dtVar, rxs rxsVar, vzc vzcVar, afvn afvnVar, aafo aafoVar) {
        this.c = dtVar;
        this.a = rxsVar;
        this.e = vzcVar;
        this.d = afvnVar;
        this.b = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        apzg apzgVar2;
        apzgVar.getClass();
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) apzgVar.qm(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
        apzg apzgVar3 = null;
        String str = (accountUnlinkCommandOuterClass$AccountUnlinkCommand.b & 4) != 0 ? accountUnlinkCommandOuterClass$AccountUnlinkCommand.e : null;
        if (!TextUtils.isEmpty(str)) {
            AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand2 = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) apzgVar.qm(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
            if ((accountUnlinkCommandOuterClass$AccountUnlinkCommand2.b & 1) != 0) {
                apzgVar2 = accountUnlinkCommandOuterClass$AccountUnlinkCommand2.c;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
            } else {
                apzgVar2 = null;
            }
            AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand3 = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) apzgVar.qm(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
            if ((accountUnlinkCommandOuterClass$AccountUnlinkCommand3.b & 2) != 0 && (apzgVar3 = accountUnlinkCommandOuterClass$AccountUnlinkCommand3.d) == null) {
                apzgVar3 = apzg.a;
            }
            if (!this.d.t()) {
                this.b.a(apzgVar3);
                this.a.c();
                return;
            }
            try {
                ylx.n(this.c, anii.h(this.a.e.a.a(rxs.a(), this.e.a(this.d.c()), str, 0), ryj.g, anjk.a), new goi(this, apzgVar3, 1), new goi(this, apzgVar2));
                return;
            } catch (RemoteException | qsc | qsd unused) {
                this.b.a(apzgVar3);
                this.a.c();
                return;
            }
        }
        zep.b("No third party id in AccountUnlinkCommand.");
        this.a.c();
    }
}
