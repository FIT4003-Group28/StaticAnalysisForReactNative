package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dvl  reason: default package */
/* loaded from: classes6.dex */
public final class dvl extends dvi {
    final ahrn a = new ahrn();
    private final float b;

    public dvl(float f) {
        this.b = f;
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
        this.a.d(0.0f, this.b, (float) Math.toRadians(dadVar.c()));
        return true;
    }
}
