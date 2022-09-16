package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: ssf  reason: default package */
/* loaded from: classes4.dex */
public final class ssf implements tct {
    public final srx a;
    private final /* synthetic */ int b;

    public ssf(srx srxVar) {
        this.a = srxVar;
    }

    public ssf(srx srxVar, int i) {
        this.b = i;
        this.a = srxVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return aqmo.b;
            }
            if (i == 2) {
                return aufh.b;
            }
            return auvc.b;
        }
        return aqmr.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        int i = this.b;
        if (i == 0) {
            aqmr aqmrVar = (aqmr) obj;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a();
                return aynr.f();
            }
            srx srxVar = this.a;
            srxVar.getClass();
            return aynr.t(new sse(srxVar)).E(aypa.a());
        } else if (i == 1) {
            aqmo aqmoVar = (aqmo) obj;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a();
                return aynr.f();
            }
            srx srxVar2 = this.a;
            srxVar2.getClass();
            return aynr.t(new sse(srxVar2, 1)).E(aypa.a());
        } else if (i == 2) {
            final aufh aufhVar = (aufh) obj;
            if ((aufhVar.c & 1) == 0 || tcsVar.a == null) {
                return aynr.f();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                srx srxVar3 = this.a;
                awnn awnnVar = aufhVar.d;
                if (awnnVar == null) {
                    awnnVar = awnn.a;
                }
                srxVar3.b(awnnVar, tcsVar.a);
                return aynr.f();
            }
            return aynr.t(new aypv(aufhVar, tcsVar, null) { // from class: ssn
                public final /* synthetic */ aufh a;
                public final /* synthetic */ tcs b;

                @Override // defpackage.aypv
                public final void a() {
                    ssf ssfVar = ssf.this;
                    aufh aufhVar2 = this.a;
                    tcs tcsVar2 = this.b;
                    srx srxVar4 = ssfVar.a;
                    awnn awnnVar2 = aufhVar2.d;
                    if (awnnVar2 == null) {
                        awnnVar2 = awnn.a;
                    }
                    srxVar4.b(awnnVar2, tcsVar2.a);
                }
            }).E(aypa.a());
        } else {
            final auvc auvcVar = (auvc) obj;
            if ((auvcVar.c & 1) == 0 || tcsVar.a == null) {
                return aynr.f();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                srx srxVar4 = this.a;
                awnn awnnVar2 = auvcVar.d;
                if (awnnVar2 == null) {
                    awnnVar2 = awnn.a;
                }
                srxVar4.b(awnnVar2, tcsVar.a);
                return aynr.f();
            }
            return aynr.t(new aypv(auvcVar, tcsVar, null) { // from class: ssr
                public final /* synthetic */ auvc a;
                public final /* synthetic */ tcs b;

                @Override // defpackage.aypv
                public final void a() {
                    ssf ssfVar = ssf.this;
                    auvc auvcVar2 = this.a;
                    tcs tcsVar2 = this.b;
                    srx srxVar5 = ssfVar.a;
                    awnn awnnVar3 = auvcVar2.d;
                    if (awnnVar3 == null) {
                        awnnVar3 = awnn.a;
                    }
                    srxVar5.b(awnnVar3, tcsVar2.a);
                }
            }).E(aypa.a());
        }
    }
}
