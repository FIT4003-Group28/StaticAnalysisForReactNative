package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: ssd  reason: default package */
/* loaded from: classes4.dex */
public final class ssd implements tct {
    public final srv a;
    private final /* synthetic */ int b;

    public ssd(srv srvVar) {
        this.a = srvVar;
    }

    public ssd(srv srvVar, int i) {
        this.b = i;
        this.a = srvVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return aqmi.b;
            }
            return aqmp.b;
        }
        return aqmn.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        int i = this.b;
        if (i == 0) {
            aqmn aqmnVar = (aqmn) obj;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a();
                return aynr.f();
            }
            srv srvVar = this.a;
            srvVar.getClass();
            return aynr.t(new ajlg(srvVar, 1)).E(aypa.a());
        } else if (i == 1) {
            final aqmi aqmiVar = (aqmi) obj;
            final srs a = sru.a();
            a.l = 1;
            int i2 = aqmiVar.c;
            if ((i2 & 1) != 0) {
                a.a = aqmiVar.d;
            }
            if ((i2 & 2) != 0) {
                a.b = aqmiVar.e;
            }
            if ((i2 & 4) != 0) {
                a.c = aqmiVar.f;
            }
            if ((i2 & 32) != 0) {
                awmt awmtVar = aqmiVar.i;
                if (awmtVar == null) {
                    awmtVar = awmt.a;
                }
                a.e = awmtVar;
            }
            int i3 = aqmiVar.c;
            if ((i3 & 8) != 0) {
                a.d = aqmiVar.g;
            }
            if ((i3 & 64) != 0) {
                awmt awmtVar2 = aqmiVar.j;
                if (awmtVar2 == null) {
                    awmtVar2 = awmt.a;
                }
                a.f = awmtVar2;
            }
            if ((aqmiVar.c & 512) != 0) {
                aqsz aqszVar = aqmiVar.k;
                if (aqszVar == null) {
                    aqszVar = aqsz.a;
                }
                if ((aqszVar.b & 4) != 0) {
                    aqsz aqszVar2 = aqmiVar.k;
                    if (aqszVar2 == null) {
                        aqszVar2 = aqsz.a;
                    }
                    a.k = aqszVar2.d;
                }
            }
            a.g = tcsVar;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                srv srvVar2 = this.a;
                awnn awnnVar = aqmiVar.h;
                if (awnnVar == null) {
                    awnnVar = awnn.a;
                }
                srvVar2.b(awnnVar, a.a());
                return aynr.f();
            }
            return aynr.t(new aypv(aqmiVar, a, null) { // from class: ssb
                public final /* synthetic */ aqmi a;
                public final /* synthetic */ srs b;

                @Override // defpackage.aypv
                public final void a() {
                    ssd ssdVar = ssd.this;
                    aqmi aqmiVar2 = this.a;
                    srs srsVar = this.b;
                    srv srvVar3 = ssdVar.a;
                    awnn awnnVar2 = aqmiVar2.h;
                    if (awnnVar2 == null) {
                        awnnVar2 = awnn.a;
                    }
                    srvVar3.b(awnnVar2, srsVar.a());
                }
            }).E(aypa.a());
        } else {
            aqmp aqmpVar = (aqmp) obj;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a();
                return aynr.f();
            }
            srv srvVar3 = this.a;
            srvVar3.getClass();
            return aynr.t(new ajlg(srvVar3)).E(aypa.a());
        }
    }
}
