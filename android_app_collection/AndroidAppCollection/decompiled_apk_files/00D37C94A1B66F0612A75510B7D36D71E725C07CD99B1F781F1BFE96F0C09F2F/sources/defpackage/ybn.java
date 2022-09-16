package defpackage;

import android.content.Intent;
import com.google.android.youtube.R;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ybn  reason: default package */
/* loaded from: classes4.dex */
public final class ybn implements yiu {
    final /* synthetic */ ybo a;
    private final ashp b;
    private final aoob c;

    public ybn(ybo yboVar, ashp ashpVar) {
        this.a = yboVar;
        this.b = ashpVar;
        this.c = ashpVar.n;
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
        byte[] bArr;
        byte[] bArr2;
        apzg apzgVar;
        if (i != 906) {
            return;
        }
        String str = ybo.a;
        boolean z = this.b != null;
        StringBuilder sb = new StringBuilder(129);
        sb.append("Received payment result callback with resultCode: ");
        sb.append(i2);
        sb.append("Start handling payment call back, ypcGetCartResponse not null: ");
        sb.append(z);
        zep.c(str, sb.toString());
        if (this.c != null) {
            acrr acrrVar = this.a.g;
            ybr ybrVar = new ybr();
            ybrVar.a = this.c;
            acrrVar.c(ybrVar.c());
        } else {
            this.a.g.c(new ybr().c());
        }
        String str2 = null;
        byte[] bArr3 = null;
        HashMap hashMap = null;
        if (i2 == -1) {
            ybl yblVar = this.a.l;
            if (yblVar != null) {
                yblVar.d();
            }
            if (this.c != null) {
                acrr acrrVar2 = this.a.g;
                ybr ybrVar2 = new ybr();
                ybrVar2.a = this.c;
                acrrVar2.c(ybrVar2.d());
            } else {
                this.a.g.c(new ybr().d());
            }
            if (this.b.e != 12) {
                if (intent != null) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN");
                    String i3 = aneg.d.i(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN"));
                    bArr2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO");
                    str2 = i3;
                    bArr = byteArrayExtra;
                } else {
                    bArr = null;
                    bArr2 = null;
                }
                this.a.f(str2, bArr2, bArr, this.b);
                return;
            }
            aafo aafoVar = (aafo) this.a.h.get();
            ashp ashpVar = this.b;
            if (ashpVar.e == 12) {
                apzgVar = (apzg) ashpVar.f;
            } else {
                apzgVar = apzg.a;
            }
            if (intent != null) {
                hashMap = new HashMap();
                hashMap.put("FUNDS_GUARANTEE_CALLBACK_CLIENT_DATA", aneg.d.i(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN")));
                hashMap.put("PAYMENTS_PAYLOAD", aneg.d.i(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN")));
                hashMap.put("SERIALIZED_WALLET_EVENT_LOGS", intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO"));
                hashMap.put("SERIALIZED_BACKEND_ANALYTICS_EVENT", intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN"));
            }
            aafoVar.c(apzgVar, hashMap);
        } else if (i2 != 0) {
            if (i2 == 1) {
                this.a.d(new Error(this.a.i.getResources().getString(R.string.payment_wallet_processing_error)));
            } else {
                this.a.d(null);
            }
            if (this.c != null) {
                acrr acrrVar3 = this.a.g;
                ybr ybrVar3 = new ybr();
                ybrVar3.a = this.c;
                ybrVar3.b = 5;
                acrrVar3.c(ybrVar3.b());
            }
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("WalletAPI error result with resultCode: ");
            sb2.append(i2);
            String sb3 = sb2.toString();
            String str3 = ybo.a;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 17 + String.valueOf(sb3).length());
            sb4.append("youtubePayment::");
            sb4.append(str3);
            sb4.append(" ");
            sb4.append(sb3);
            afus.b(1, 11, sb4.toString());
        } else {
            if ((this.b.b & 262144) == 0) {
                this.a.c();
            } else {
                aafo aafoVar2 = (aafo) this.a.h.get();
                apzg apzgVar2 = this.b.r;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar2.a(apzgVar2);
            }
            if (intent != null) {
                bArr3 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN");
            }
            if (bArr3 != null) {
                ybo yboVar = this.a;
                ashp ashpVar2 = this.b;
                abet abetVar = yboVar.c;
                abes abesVar = new abes(abetVar.e, abetVar.a.c());
                abesVar.b = ashpVar2.h;
                abesVar.a = bArr3;
                abesVar.c = true;
                abesVar.k(ashpVar2.l.I());
                yboVar.c.b.e(abesVar, new ybk());
            }
            if (this.c == null) {
                return;
            }
            acrr acrrVar4 = this.a.g;
            ybr ybrVar4 = new ybr();
            ybrVar4.a = this.c;
            acrrVar4.c(ybrVar4.a());
        }
    }
}
