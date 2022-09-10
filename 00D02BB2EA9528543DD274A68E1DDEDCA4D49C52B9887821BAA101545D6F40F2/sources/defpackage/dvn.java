package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dvn  reason: default package */
/* loaded from: classes6.dex */
public final class dvn extends dvi {
    final ahrn a = new ahrn();
    private final float b;

    public dvn(double d) {
        this.b = (float) Math.toRadians(d);
    }

    @Override // defpackage.dtx
    public final float b() {
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float c() {
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float d() {
        return 0.0f;
    }

    @Override // defpackage.dtx
    public final float e() {
        return this.a.a;
    }

    @Override // defpackage.dtx
    public final float f() {
        return this.a.b;
    }

    @Override // defpackage.dtx
    public final float g() {
        return this.a.c;
    }

    @Override // defpackage.dtx
    public final float h() {
        return this.a.d;
    }

    @Override // defpackage.dtx
    public final boolean i(Session session, Frame frame, @dzsi dad dadVar, @dzsi arlb arlbVar, double d) {
        if (dadVar == null) {
            return false;
        }
        float f = this.b;
        double radians = Math.toRadians(dadVar.g().d);
        Pose displayOrientedPose = frame.getCamera().getDisplayOrientedPose();
        double atan2 = Math.atan2(-displayOrientedPose.qy(), displayOrientedPose.qw());
        ahrn ahrnVar = new ahrn();
        double d2 = f;
        Double.isNaN(d2);
        ahrnVar.d(0.0f, -1.0f, (float) (atan2 + atan2 + (d2 - radians)));
        ahrn ahrnVar2 = this.a;
        ahrnVar2.c(l());
        ahrnVar2.g(ahrnVar2, ahrnVar);
        return true;
    }
}
