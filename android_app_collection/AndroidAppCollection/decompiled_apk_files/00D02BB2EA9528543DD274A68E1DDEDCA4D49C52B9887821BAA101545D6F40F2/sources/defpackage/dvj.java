package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dvj  reason: default package */
/* loaded from: classes6.dex */
public final class dvj extends dvi implements dub {
    private boolean a = true;
    private boolean b = true;
    private ahrn c = new ahrn();
    @dzsi
    private ahrn d;

    public dvj() {
    }

    private final void n(Pose pose) {
        bnvs k = k();
        double atan2 = Math.atan2(pose.tx() - k.e(), k.g() - pose.tz());
        ahrn ahrnVar = new ahrn();
        ahrnVar.d(0.0f, -1.0f, (float) atan2);
        ahrn ahrnVar2 = this.c;
        ahrnVar2.c(l());
        ahrnVar2.g(ahrnVar2, ahrnVar);
        ahrn ahrnVar3 = this.d;
        if (ahrnVar3 != null) {
            ahrn ahrnVar4 = this.c;
            ahrnVar4.g(ahrnVar4, ahrnVar3);
            this.c = ahrnVar4;
        }
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
        return this.c.a;
    }

    @Override // defpackage.dtx
    public final float f() {
        return this.c.b;
    }

    @Override // defpackage.dtx
    public final float g() {
        return this.c.c;
    }

    @Override // defpackage.dtx
    public final float h() {
        return this.c.d;
    }

    @Override // defpackage.dtx
    public final boolean i(Session session, Frame frame, @dzsi dad dadVar, @dzsi arlb arlbVar, double d) {
        Pose displayOrientedPose = frame.getCamera().getDisplayOrientedPose();
        dbsk.s(displayOrientedPose);
        if (this.a) {
            n(displayOrientedPose);
        } else {
            if (this.b) {
                n(displayOrientedPose);
            }
            ahrn ahrnVar = new ahrn();
            if (ahrnVar.b(this.c) == 1.0f) {
                return false;
            }
            ahrn ahrnVar2 = this.c;
            ahrnVar2.n(ahrnVar2, ahrnVar, Math.min(1.0f, (float) (d * 12.0d)));
            this.c = ahrnVar2;
        }
        this.b = this.a;
        return true;
    }

    @Override // defpackage.dub
    public final void j(boolean z) {
        this.a = z;
    }

    public dvj(ahrn ahrnVar) {
        this.d = ahrnVar;
    }
}
