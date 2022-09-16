package defpackage;

import com.google.ar.core.Anchor;
import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* renamed from: dvp  reason: default package */
/* loaded from: classes6.dex */
public final class dvp extends dvi implements dty {
    private final czw a;
    private final akqq b;
    @dzsi
    private Anchor e;
    private double f;
    private boolean c = false;
    private bnvs d = new bnvs(10000.0f, 10000.0f, 10000.0f);
    private bnvs g = new bnvs();

    public dvp(czw czwVar, akqq akqqVar) {
        this.a = czwVar;
        this.b = akqqVar;
    }

    private static Anchor j(Session session, bnvs bnvsVar) {
        try {
            return session.createAnchor(new Pose(new float[]{bnvsVar.e(), bnvsVar.f(), bnvsVar.g()}, new float[]{0.0f, 0.0f, 0.0f, 1.0f}));
        } catch (FatalException e) {
            throw new FatalException("FatalException creating Anchor", e);
        }
    }

    private final boolean n(double d) {
        Anchor anchor = this.e;
        if (anchor == null) {
            bnvs bnvsVar = new bnvs(10000.0f, 10000.0f, 10000.0f);
            if (this.d.equals(bnvsVar)) {
                return false;
            }
            this.d = bnvsVar;
            return true;
        }
        bnvs m = m(anchor.getPose());
        if (this.d.equals(m)) {
            return false;
        }
        if (!this.c) {
            this.d = m;
            return true;
        }
        bnvs bnvsVar2 = new bnvs(m);
        bnvsVar2.l(this.d);
        float d2 = bnvsVar2.d();
        if (d2 < 0.1f || d2 > 100.0f) {
            this.d = m;
            this.c = false;
            return true;
        }
        float min = Math.min(1.0f, (float) d);
        bnvs bnvsVar3 = this.d;
        bnvsVar2.k(min);
        bnvsVar3.h(bnvsVar2);
        return true;
    }

    @Override // defpackage.dtx
    public final float b() {
        return this.d.e();
    }

    @Override // defpackage.dtx
    public final float c() {
        return this.d.f();
    }

    @Override // defpackage.dtx
    public final float d() {
        return this.d.g();
    }

    @Override // defpackage.dtx
    public final float e() {
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float f() {
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float g() {
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float h() {
        return 1.0f;
    }

    @Override // defpackage.dtx
    public final boolean i(Session session, Frame frame, @dzsi dad dadVar, @dzsi arlb arlbVar, double d) {
        if (dadVar == null) {
            return false;
        }
        dte dteVar = this.a.a().b;
        if (dteVar == null) {
            dteVar = dte.w;
        }
        if (!dteVar.d) {
            Anchor anchor = this.e;
            if (anchor != null && anchor.getTrackingState() != TrackingState.TRACKING) {
                this.e.detach();
                this.e = null;
            }
            double d2 = this.f + d;
            this.f = d2;
            if (this.e == null || d2 >= 1.0d) {
                this.f = dcyn.a;
            } else {
                return n(d);
            }
        }
        if (frame.getCamera().getTrackingState() != TrackingState.TRACKING) {
            return false;
        }
        dte dteVar2 = this.a.a().b;
        if (dteVar2 == null) {
            dteVar2 = dte.w;
        }
        if (!dteVar2.d) {
            bnvs a = dxc.a(frame, dadVar, arlbVar, this.b);
            double e = akqo.e(dadVar.f(), this.b);
            dfla b = dadVar.b();
            int i = b.a;
            float f = Float.MAX_VALUE;
            if ((i & 2) != 0 && (i & 4) != 0) {
                f = (float) (b.d + ((e * Math.sin(Math.toRadians(b.c))) / Math.sin(Math.toRadians(180.0d - b.c) / 2.0d)));
            }
            Anchor anchor2 = this.e;
            if (anchor2 == null) {
                this.e = j(session, a);
                this.g.a(0.0f, 0.0f, 0.0f);
            } else {
                bnvs m = m(anchor2.getPose());
                m.l(a);
                float d3 = m.d();
                bnvs bnvsVar = new bnvs(m);
                bnvsVar.l(this.g);
                float d4 = bnvsVar.d();
                if (d3 <= f || d4 >= 2.0f) {
                    this.g = m;
                } else {
                    Anchor anchor3 = this.e;
                    dbsk.s(anchor3);
                    anchor3.detach();
                    this.e = j(session, a);
                    this.g.a(0.0f, 0.0f, 0.0f);
                    this.c = true;
                }
            }
            return n(d);
        }
        bnvs a2 = dxc.a(frame, dadVar, arlbVar, this.b);
        if (a2.equals(this.d)) {
            return false;
        }
        this.d = a2;
        return true;
    }
}
