package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
/* compiled from: PG */
/* renamed from: ydo  reason: default package */
/* loaded from: classes4.dex */
public final class ydo {
    public static final /* synthetic */ int c = 0;
    private static final String d = "ydo";
    public final dt a;
    public final azqb b;
    private final afvn e;
    private final Context f;
    private final vzc g;

    public ydo(dt dtVar, azqb azqbVar, vzc vzcVar, afvn afvnVar, Context context) {
        this.a = dtVar;
        this.b = azqbVar;
        this.g = vzcVar;
        this.e = afvnVar;
        this.f = context;
    }

    public final void a(aade aadeVar, ycz yczVar) {
        try {
            Account a = this.g.a(this.e.c());
            dt dtVar = this.a;
            Context context = this.f;
            rwo rwoVar = new rwo();
            rwoVar.b(aadeVar != aade.PRODUCTION ? 3 : 1);
            rwoVar.b = a;
            rwv a2 = rwq.a(context, rwoVar.a());
            WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
            walletCustomTheme.a();
            GetClientTokenRequest getClientTokenRequest = new GetClientTokenRequest(walletCustomTheme, false, 1);
            qsx qsxVar = a2.D;
            rxe rxeVar = new rxe(qsxVar, getClientTokenRequest);
            qsxVar.a(rxeVar);
            ylx.n(dtVar, tjk.e(tnk.h(rxeVar, new rwu())), new ydm(yczVar, 1), new ydm(yczVar));
        } catch (RemoteException | qsc | qsd e) {
            zep.f(d, "Error getting signed-in account", e);
            yczVar.a(e);
        }
    }
}
