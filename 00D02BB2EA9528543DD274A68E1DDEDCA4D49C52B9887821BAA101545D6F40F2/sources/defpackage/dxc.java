package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
/* compiled from: PG */
/* renamed from: dxc  reason: default package */
/* loaded from: classes6.dex */
public final class dxc {
    public static bnvs a(Frame frame, dad dadVar, @dzsi arlb arlbVar, akqq akqqVar) {
        Pose displayOrientedPose = frame.getCamera().getDisplayOrientedPose();
        akqq f = dadVar.f();
        double radians = Math.toRadians(akqo.h(f, akqqVar));
        double radians2 = Math.toRadians(dadVar.g().d);
        displayOrientedPose.qx();
        float qy = displayOrientedPose.qy();
        displayOrientedPose.qz();
        double atan2 = Math.atan2(-qy, displayOrientedPose.qw());
        double d = atan2 + atan2 + (radians - radians2);
        double e = akqo.e(f, akqqVar);
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        double tz = displayOrientedPose.tz();
        Double.isNaN(tz);
        float f2 = (float) (tz + ((-e) * cos));
        double tx = displayOrientedPose.tx();
        Double.isNaN(tx);
        float f3 = (float) (tx + (e * sin));
        float ty = displayOrientedPose.ty() - 1.5f;
        if (arlbVar != null) {
            ty += arlbVar.a(akqqVar) - arlbVar.a(f);
        }
        return new bnvs(f3, ty, f2);
    }
}
