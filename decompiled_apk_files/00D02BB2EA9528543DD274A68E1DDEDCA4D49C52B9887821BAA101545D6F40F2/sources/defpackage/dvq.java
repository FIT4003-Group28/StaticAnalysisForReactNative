package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dvq  reason: default package */
/* loaded from: classes6.dex */
public final class dvq extends dvi {
    private bnvs a = new bnvs();

    public dvq() {
        dbsk.a(true);
    }

    @Override // defpackage.dtx
    public final float b() {
        return this.a.e();
    }

    @Override // defpackage.dtx
    public final float c() {
        return this.a.f();
    }

    @Override // defpackage.dtx
    public final float d() {
        return this.a.g();
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
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final boolean i(Session session, Frame frame, @dzsi dad dadVar, @dzsi arlb arlbVar, double d) {
        Pose displayOrientedPose = frame.getCamera().getDisplayOrientedPose();
        bnvs k = k();
        if (k.e() != 10000.0f || k.f() != 10000.0f || k.g() != 10000.0f) {
            bnvs m = m(displayOrientedPose);
            m.l(k);
            float d2 = m.d();
            if (d2 > 40.0f) {
                m.k(1.0f - (40.0f / d2));
                this.a = m;
            } else {
                this.a.a(0.0f, 0.0f, 0.0f);
            }
            return true;
        } else if (this.a.e() == 0.0f && this.a.f() == 0.0f && this.a.g() == 0.0f) {
            return false;
        } else {
            this.a.a(0.0f, 0.0f, 0.0f);
            return true;
        }
    }
}
