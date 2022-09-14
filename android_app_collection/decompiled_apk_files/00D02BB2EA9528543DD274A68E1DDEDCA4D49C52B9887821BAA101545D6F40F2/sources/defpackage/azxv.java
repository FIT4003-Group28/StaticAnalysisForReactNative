package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: azxv  reason: default package */
/* loaded from: classes.dex */
public final class azxv extends azxm<azwc> {
    public static final /* synthetic */ int o = 0;

    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.FREQUENT_TRIP;
    }

    @Override // defpackage.azxm
    public final azwh<azwc> c(byte[] bArr) {
        try {
            return new azwb((dokh) dsqw.cq(dokh.d, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a SyncFrequentTrip proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        dokn doknVar;
        if (doizVar.b == 14) {
            doknVar = (dokn) doizVar.c;
        } else {
            doknVar = dokn.b;
        }
        return dcbg.b(doknVar.a).o(azxr.a).s(new dbrn(this) { // from class: azxs
            private final azxv a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                azxv azxvVar = this.a;
                dokh dokhVar = ((dokm) obj).b;
                if (dokhVar == null) {
                    dokhVar = dokh.d;
                }
                dnls dnlsVar = dokhVar.b;
                if (dnlsVar == null) {
                    dnlsVar = dnls.g;
                }
                return azwj.a(azxvVar, dnlsVar.c);
            }
        }).z();
    }

    @Override // defpackage.azxm
    public final List<azwc> e(doiz doizVar) {
        dokn doknVar;
        if (doizVar.b == 14) {
            doknVar = (dokn) doizVar.c;
        } else {
            doknVar = dokn.b;
        }
        return dcbg.b(doknVar.a).o(azxt.a).s(azxu.a).z();
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azwc azwcVar) {
        return azwcVar.j().bS();
    }
}
