package defpackage;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import com.google.geo.imagery.viewer.api.Swipe;
import com.google.geo.imagery.viewer.api.SwipeSwigJNI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfqu  reason: default package */
/* loaded from: classes6.dex */
public final class dfqu {
    public final dfuk a;
    public final dfuh b;
    public final dfrh c;
    public final dfrr d;
    public final dfum e;
    @dzsi
    public final dfqt g;
    public final Executor h;
    public final Executor i;
    @dzsi
    public dfua j;
    private final dfuo l;
    public final List<dfqz> f = new ArrayList();
    public boolean k = false;

    public dfqu(Executor executor, Executor executor2, @dzsi dfua dfuaVar, dfuk dfukVar, dfuh dfuhVar, dfrr dfrrVar, dfrh dfrhVar, dfum dfumVar, dfuo dfuoVar, @dzsi dfqt dfqtVar) {
        this.h = executor;
        this.i = executor2;
        this.j = dfuaVar;
        this.a = dfukVar;
        this.b = dfuhVar;
        this.d = dfrrVar;
        this.e = dfumVar;
        this.l = dfuoVar;
        this.c = dfrhVar;
        this.g = dfqtVar;
    }

    public final boolean a(MotionEvent motionEvent) {
        dftd dftdVar;
        int floor;
        dhjz dhjzVar;
        Swipe b;
        dfrb dfrbVar = new dfrb(this.h, this.i, this.j, this.a, this.b, this.d, this.c, this.e, this.l, this.f, this.g);
        dfua dfuaVar = dfrbVar.d;
        if (dfuaVar == null || dfuaVar.d()) {
            dfrbVar.c();
            return false;
        }
        dftf dftfVar = null;
        byte[] bArr = null;
        dftf dftfVar2 = null;
        if (motionEvent.getActionMasked() == 0) {
            dfsg c = dfrbVar.d.c(dfrbVar.e.e, motionEvent.getX(), motionEvent.getY(), 8L, dfrbVar.m.a());
            if (c != null && (c.a & 2) != 0) {
                boolean f = dfrbVar.i.f();
                dfrbVar.i.g();
                dfuo dfuoVar = dfrbVar.l;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                dfua dfuaVar2 = dfuoVar.a;
                if (dfuaVar2 != null && (b = dfuaVar2.b()) != null) {
                    double d = x;
                    double d2 = y;
                    dftn a = dfuoVar.c.a();
                    dhjx dhjxVar = ((dfrr) dfuoVar.b).e;
                    long j = b.a;
                    byte[] bS = a == null ? null : a.bS();
                    if (dhjxVar != null) {
                        bArr = dhjxVar.bS();
                    }
                    SwipeSwigJNI.Swipe_dragStarted(j, b, d, d2, f, bS, bArr);
                }
                dfrbVar.f.a();
                dfrbVar.i.j();
                return true;
            }
            dfrbVar.c();
            return false;
        }
        if (motionEvent.getActionMasked() == 2) {
            dfuo dfuoVar2 = dfrbVar.l;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            dfua dfuaVar3 = dfuoVar2.a;
            if (dfuaVar3 == null) {
                dhjzVar = dhjz.e;
            } else {
                Swipe b2 = dfuaVar3.b();
                if (b2 == null) {
                    dhjzVar = dhjz.e;
                } else {
                    double d3 = x2;
                    double d4 = y2;
                    dhjx dhjxVar2 = ((dfrr) dfuoVar2.b).e;
                    byte[] Swipe_dragMoved = SwipeSwigJNI.Swipe_dragMoved(b2.a, b2, d3, d4, dhjxVar2 == null ? null : dhjxVar2.bS());
                    if (Swipe_dragMoved != null) {
                        try {
                            dftfVar2 = (dftf) dsqw.cq(dftf.d, Swipe_dragMoved);
                        } catch (dsrm e) {
                            throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.PhotoTransition protocol message.", e);
                        }
                    }
                    dhjx dhjxVar3 = dftfVar2.c;
                    if (dhjxVar3 == null) {
                        dhjxVar3 = dhjx.f;
                    }
                    if ((dhjxVar3.a & 1) != 0) {
                        dhjx dhjxVar4 = dftfVar2.c;
                        if (dhjxVar4 == null) {
                            dhjxVar4 = dhjx.f;
                        }
                        dhjzVar = dhjxVar4.b;
                        if (dhjzVar == null) {
                            dhjzVar = dhjz.e;
                        }
                    } else {
                        dhjzVar = dhjz.e;
                    }
                }
            }
            int i = dhjzVar.a;
            if ((i & 1) != 0 && (i & 2) != 0 && (i & 4) != 0) {
                dfrr dfrrVar = dfrbVar.e;
                dsqp dsqpVar = (dsqp) dhjzVar.cu(5);
                dsqpVar.bC(dhjzVar);
                dhjy dhjyVar = (dhjy) dsqpVar;
                synchronized (dfrrVar.d) {
                    dhjw dhjwVar = dfrrVar.d;
                    if (dhjwVar.c) {
                        dhjwVar.bF();
                        dhjwVar.c = false;
                    }
                    dhjx dhjxVar5 = (dhjx) dhjwVar.b;
                    dhjz bK = dhjyVar.bK();
                    dhjx dhjxVar6 = dhjx.f;
                    bK.getClass();
                    dhjxVar5.b = bK;
                    dhjxVar5.a |= 1;
                    dfrrVar.e = dfrrVar.d.bK();
                }
                dfrbVar.f.a();
                dfrbVar.i.j();
                return true;
            }
        } else if (motionEvent.getActionMasked() == 1) {
            dfuo dfuoVar3 = dfrbVar.l;
            dfua dfuaVar4 = dfuoVar3.a;
            if (dfuaVar4 == null) {
                dftdVar = dftd.d;
            } else {
                Swipe b3 = dfuaVar4.b();
                if (b3 == null) {
                    dftdVar = dftd.d;
                } else {
                    dftn a2 = dfuoVar3.c.a();
                    dhjx dhjxVar7 = ((dfrr) dfuoVar3.b).e;
                    byte[] Swipe_dragEnded = SwipeSwigJNI.Swipe_dragEnded(b3.a, b3, a2 == null ? null : a2.bS(), dhjxVar7 == null ? null : dhjxVar7.bS());
                    if (Swipe_dragEnded != null) {
                        try {
                            dftfVar = (dftf) dsqw.cq(dftf.d, Swipe_dragEnded);
                        } catch (dsrm e2) {
                            throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.PhotoTransition protocol message.", e2);
                        }
                    }
                    dfuoVar3.d = dftfVar.b;
                    dftdVar = dftfVar.a;
                    if (dftdVar == null) {
                        dftdVar = dftd.d;
                    }
                }
            }
            int i2 = dftdVar.a;
            if ((i2 & 2) != 0 && (1 & i2) != 0) {
                dfrh dfrhVar = dfrbVar.i;
                if (dfrhVar.e != null && !dfrhVar.f()) {
                    dfuo dfuoVar4 = dfrhVar.e;
                    if (dfuoVar4.a == null) {
                        floor = 0;
                    } else {
                        double d5 = dfuoVar4.d;
                        Double.isNaN(d5);
                        floor = (int) Math.floor(d5 * 1000.0d);
                    }
                    if (floor > 0) {
                        dfrhVar.e();
                        dfrhVar.g = ObjectAnimator.ofFloat(dfrhVar.i, "throw", 0.0f, 1.0f);
                        dfrhVar.g.setDuration(floor);
                        dfrhVar.g.setInterpolator(dfrh.a);
                        dfrhVar.g.addListener(new dfre(dfrhVar));
                        dfrhVar.g.start();
                    }
                }
                if (!dftdVar.equals(dfrbVar.n)) {
                    dhjz dhjzVar2 = dfrbVar.e.e.b;
                    if (dhjzVar2 == null) {
                        dhjzVar2 = dhjz.e;
                    }
                    return dfrbVar.a(dftdVar, dhjzVar2);
                }
            }
        }
        dfrbVar.c();
        return false;
    }
}
