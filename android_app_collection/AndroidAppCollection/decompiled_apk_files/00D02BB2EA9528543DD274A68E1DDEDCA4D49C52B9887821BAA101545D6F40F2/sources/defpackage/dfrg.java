package defpackage;

import com.google.geo.imagery.viewer.api.Swipe;
import com.google.geo.imagery.viewer.api.SwipeSwigJNI;
/* compiled from: PG */
/* renamed from: dfrg  reason: default package */
/* loaded from: classes6.dex */
final class dfrg {
    final /* synthetic */ dfrh a;

    public dfrg(dfrh dfrhVar) {
        this.a = dfrhVar;
    }

    public void setThrow(float f) {
        dftf dftfVar;
        dhjx bK;
        dfuo dfuoVar = this.a.e;
        if (dfuoVar == null) {
            return;
        }
        dfua dfuaVar = dfuoVar.a;
        if (dfuaVar == null) {
            bK = dhjx.f;
        } else {
            Swipe b = dfuaVar.b();
            if (b == null) {
                bK = dhjx.f;
            } else {
                double d = f;
                dhjx dhjxVar = ((dfrr) dfuoVar.b).e;
                byte[] Swipe_dragThrow = SwipeSwigJNI.Swipe_dragThrow(b.a, b, d, dhjxVar == null ? null : dhjxVar.bS());
                if (Swipe_dragThrow == null) {
                    dftfVar = null;
                } else {
                    try {
                        dftfVar = (dftf) dsqw.cq(dftf.d, Swipe_dragThrow);
                    } catch (dsrm e) {
                        throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.PhotoTransition protocol message.", e);
                    }
                }
                if (dfuoVar.e) {
                    bK = dftfVar.c;
                    if (bK == null) {
                        bK = dhjx.f;
                    }
                } else {
                    dhjx dhjxVar2 = dftfVar.c;
                    if (dhjxVar2 == null) {
                        dhjxVar2 = dhjx.f;
                    }
                    dsqp dsqpVar = (dsqp) dhjxVar2.cu(5);
                    dsqpVar.bC(dhjxVar2);
                    dhjw dhjwVar = (dhjw) dsqpVar;
                    if (dhjwVar.c) {
                        dhjwVar.bF();
                        dhjwVar.c = false;
                    }
                    dhjx dhjxVar3 = (dhjx) dhjwVar.b;
                    dhjxVar3.c = null;
                    dhjxVar3.a &= -3;
                    bK = dhjwVar.bK();
                }
            }
        }
        this.a.b.setCamera(bK);
        this.a.c.a();
    }
}
