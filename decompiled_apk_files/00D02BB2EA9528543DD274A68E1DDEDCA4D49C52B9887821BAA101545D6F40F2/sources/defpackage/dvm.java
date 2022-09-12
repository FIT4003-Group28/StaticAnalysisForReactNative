package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dvm  reason: default package */
/* loaded from: classes6.dex */
public final class dvm extends dvi {
    @dzsi
    private Pose a;

    @Override // defpackage.dtx
    public final float b() {
        Pose pose = this.a;
        if (pose != null) {
            return pose.tx();
        }
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float c() {
        Pose pose = this.a;
        if (pose != null) {
            return pose.ty();
        }
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float d() {
        Pose pose = this.a;
        if (pose != null) {
            return pose.tz();
        }
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float e() {
        Pose pose = this.a;
        if (pose != null) {
            return pose.qx();
        }
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float f() {
        Pose pose = this.a;
        if (pose != null) {
            return pose.qy();
        }
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float g() {
        Pose pose = this.a;
        if (pose != null) {
            return pose.qz();
        }
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float h() {
        Pose pose = this.a;
        if (pose != null) {
            return pose.qw();
        }
        return 1.0f;
    }

    @Override // defpackage.dtx
    public final boolean i(Session session, Frame frame, @dzsi dad dadVar, @dzsi arlb arlbVar, double d) {
        this.a = frame.getCamera().getDisplayOrientedPose();
        return true;
    }
}
