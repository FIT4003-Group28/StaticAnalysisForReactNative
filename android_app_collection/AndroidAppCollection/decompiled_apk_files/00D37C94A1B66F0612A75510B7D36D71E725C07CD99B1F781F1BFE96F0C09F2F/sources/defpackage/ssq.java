package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: ssq  reason: default package */
/* loaded from: classes4.dex */
public final class ssq implements tct {
    public final srr a;
    private final /* synthetic */ int b;

    public ssq(srr srrVar) {
        this.a = srrVar;
    }

    public ssq(srr srrVar, int i) {
        this.b = i;
        this.a = srrVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        if (this.b == 0) {
            return awsr.b;
        }
        return awsk.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        if (this.b == 0) {
            final awsr awsrVar = (awsr) obj;
            int i = awsrVar.c;
            if ((i & 1) != 0) {
                final double d = (i & 8) != 0 ? awsrVar.f * 1000.0d : 0.0d;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    srr srrVar = this.a;
                    awnn awnnVar = awsrVar.d;
                    if (awnnVar == null) {
                        awnnVar = awnn.a;
                    }
                    awnn awnnVar2 = awnnVar;
                    int w = awwc.w(awsrVar.e);
                    int i2 = w == 0 ? 1 : w;
                    int v = awwc.v(awsrVar.g);
                    srrVar.f(awnnVar2, i2, d, tcsVar, v == 0 ? 1 : v, awsrVar.h, awsrVar.i);
                    return aynr.f();
                }
                return aynr.t(new aypv() { // from class: ssp
                    @Override // defpackage.aypv
                    public final void a() {
                        ssq ssqVar = ssq.this;
                        awsr awsrVar2 = awsrVar;
                        double d2 = d;
                        tcs tcsVar2 = tcsVar;
                        srr srrVar2 = ssqVar.a;
                        awnn awnnVar3 = awsrVar2.d;
                        if (awnnVar3 == null) {
                            awnnVar3 = awnn.a;
                        }
                        awnn awnnVar4 = awnnVar3;
                        int w2 = awwc.w(awsrVar2.e);
                        if (w2 == 0) {
                            w2 = 1;
                        }
                        int v2 = awwc.v(awsrVar2.g);
                        if (v2 == 0) {
                            v2 = 1;
                        }
                        srrVar2.f(awnnVar4, w2, d2, tcsVar2, v2, awsrVar2.h, awsrVar2.i);
                    }
                }).E(aypa.a());
            }
            return aynr.f();
        }
        awsk awskVar = (awsk) obj;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a();
            return aynr.f();
        }
        final srr srrVar2 = this.a;
        srrVar2.getClass();
        return aynr.t(new aypv() { // from class: ssc
            @Override // defpackage.aypv
            public final void a() {
                srr.this.a();
            }
        }).E(aypa.a());
    }
}
