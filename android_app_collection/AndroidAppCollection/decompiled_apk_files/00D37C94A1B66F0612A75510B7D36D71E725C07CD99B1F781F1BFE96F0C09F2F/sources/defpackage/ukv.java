package defpackage;

import android.widget.TextView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
/* compiled from: PG */
/* renamed from: ukv  reason: default package */
/* loaded from: classes4.dex */
public final class ukv {
    public final TextView a;
    public final AccountParticleDisc b;
    public final ampq c;
    public final zgd d;
    private final TextView e;
    private final TextView f;

    public ukv(ukw ukwVar, zgd zgdVar, ampq ampqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = ukwVar.h();
        this.e = ukwVar.f();
        this.f = ukwVar.g();
        this.a = ukwVar.e();
        zgdVar.getClass();
        this.d = zgdVar;
        this.c = ampqVar;
    }

    private static String b(String str) {
        return str.replace('-', (char) 8209);
    }

    private static String c(String str) {
        if (str != null) {
            return amps.b(str.trim());
        }
        return null;
    }

    public final void a(final Object obj) {
        String str;
        String str2;
        str = ((ulx) obj).b;
        String c = c(str);
        str2 = ((ulx) obj).c;
        String c2 = c(str2);
        if (c == null) {
            c = c2;
        }
        if (true == uwp.l(c, c2)) {
            c2 = null;
        }
        c.getClass();
        this.e.setText(b(c));
        if (c2 != null) {
            this.f.setText(b(c2));
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        if (this.a != null) {
            this.f.getVisibility();
            this.a.setVisibility(8);
        }
        final AccountParticleDisc accountParticleDisc = this.b;
        umr.b(new Runnable() { // from class: ujv
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
                r0.e();
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
                if (r3.equals(r2) == false) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
                if (r1 != r2) goto L50;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 290
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ujv.run():void");
            }
        });
    }
}
