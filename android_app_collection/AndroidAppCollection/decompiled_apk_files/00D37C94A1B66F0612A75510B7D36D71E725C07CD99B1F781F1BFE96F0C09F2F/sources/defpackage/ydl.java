package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ydl  reason: default package */
/* loaded from: classes4.dex */
public final class ydl {
    public static final String a = "ydl";
    public final dt b;
    public final azqb c;
    public final Set d = new HashSet();
    private final afvn e;
    private final rwz f;
    private final yjk g;
    private final vzc h;

    public ydl(dt dtVar, yjk yjkVar, azqb azqbVar, vzc vzcVar, afvn afvnVar, Context context) {
        this.b = dtVar;
        this.g = yjkVar;
        this.c = azqbVar;
        this.h = vzcVar;
        this.e = afvnVar;
        this.f = new rwz(context);
    }

    public final void a(aade aadeVar, byte[] bArr, byte[] bArr2) {
        try {
            Account a2 = this.h.a(this.e.c());
            rwz rwzVar = this.f;
            rwzVar.d(aadeVar != aade.PRODUCTION ? 3 : 1);
            rwzVar.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
            rwzVar.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr2);
            rwzVar.b(a2);
            rwzVar.e();
            WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
            walletCustomTheme.a();
            rwzVar.c(walletCustomTheme);
            this.g.a(rwzVar.a(), 1901, new ydk(this));
        } catch (RemoteException | qsc | qsd e) {
            zep.f(a, "Error getting signed-in account", e);
        }
    }
}
