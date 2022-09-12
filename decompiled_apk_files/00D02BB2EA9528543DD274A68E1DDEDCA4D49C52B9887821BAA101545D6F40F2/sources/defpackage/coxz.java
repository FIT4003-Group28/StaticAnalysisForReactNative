package defpackage;

import android.content.Context;
import com.google.android.gms.phenotype.Configurations;
/* compiled from: PG */
/* renamed from: coxz  reason: default package */
/* loaded from: classes.dex */
public final class coxz extends cnof<cnnv> {
    /* JADX INFO: Access modifiers changed from: protected */
    public coxz(Context context) {
        super(context, coxs.a, cnnx.q, cnoe.a);
    }

    public final cpcq<Void> a(final String str, final int i, final String[] strArr, @dzsi final byte[] bArr) {
        cntc builder = cntd.builder();
        builder.a = new cnsr(str, i, strArr, bArr) { // from class: coxt
            private final String a;
            private final int b;
            private final String[] c;
            private final byte[] d;

            {
                this.a = str;
                this.b = i;
                this.c = strArr;
                this.d = bArr;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                String str2 = this.a;
                int i2 = this.b;
                String[] strArr2 = this.c;
                byte[] bArr2 = this.d;
                ((coyi) ((coyj) obj).L()).e(new coxy((cpct) obj2), str2, i2, strArr2, bArr2);
            }
        };
        return c(builder.a());
    }

    public final cpcq<Configurations> b(final String str, final String str2, @dzsi final String str3) {
        cntc builder = cntd.builder();
        builder.a = new cnsr(str, str2, str3) { // from class: coxv
            private final String a;
            private final String b;
            private final String c;

            {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                String str4 = this.a;
                String str5 = this.b;
                String str6 = this.c;
                ((coyi) ((coyj) obj).L()).f(new coxy((cpct) obj2), str4, str5, str6);
            }
        };
        return c(builder.a());
    }

    public final cpcq<Void> k(final String str) {
        cntc builder = cntd.builder();
        builder.a = new cnsr(str) { // from class: coxw
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                String str2 = this.a;
                ((coyi) ((coyj) obj).L()).g(new coxy((cpct) obj2), str2);
            }
        };
        return c(builder.a());
    }
}
