package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: yar  reason: default package */
/* loaded from: classes4.dex */
public final class yar {
    public final dt a;
    public final azqb b;
    final Set c = new HashSet();
    private final afvn d;
    private final rwy e;
    private final acrr f;
    private final yjk g;
    private final vzc h;

    public yar(dt dtVar, yjk yjkVar, azqb azqbVar, vzc vzcVar, afvn afvnVar, Context context, acrr acrrVar) {
        this.a = dtVar;
        this.g = yjkVar;
        this.b = azqbVar;
        this.h = vzcVar;
        this.d = afvnVar;
        this.e = new rwy(context);
        this.f = acrrVar;
    }

    public final void a(aade aadeVar, byte[] bArr, byte[] bArr2) {
        rwy rwyVar = this.e;
        rwyVar.d(aadeVar != aade.PRODUCTION ? 0 : 1);
        rwyVar.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
        rwyVar.b(this.h.b(this.d.c()));
        rwyVar.e();
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.a();
        rwyVar.c(walletCustomTheme);
        Intent a = rwyVar.a();
        b(bArr2, 2);
        this.g.a(a, 1900, new yaq(this, bArr2));
    }

    public final void b(byte[] bArr, int i) {
        if (bArr != null) {
            aopa createBuilder = awhe.a.createBuilder();
            aoob x = aoob.x(bArr);
            createBuilder.copyOnWrite();
            awhe awheVar = (awhe) createBuilder.instance;
            awheVar.b |= 2;
            awheVar.d = x;
            createBuilder.copyOnWrite();
            awhe awheVar2 = (awhe) createBuilder.instance;
            awheVar2.c = i - 1;
            awheVar2.b |= 1;
            arrf a = arrh.a();
            a.copyOnWrite();
            ((arrh) a.instance).cu((awhe) createBuilder.mo39build());
            this.f.c((arrh) a.mo39build());
        }
    }
}
