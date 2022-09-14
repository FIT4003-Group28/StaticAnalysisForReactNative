package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dvo  reason: default package */
/* loaded from: classes6.dex */
public final class dvo extends dvi implements dtx {
    final ahrn a;
    private boolean b = false;

    public dvo(float f, float f2, float f3) {
        ahrn ahrnVar = new ahrn();
        this.a = ahrnVar;
        ahrnVar.d(f, f2, (float) Math.toRadians(f3));
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
        boolean z = this.b;
        this.b = false;
        return z;
    }

    public final void j(float f) {
        this.a.d(0.0f, 1.0f, (float) Math.toRadians(f));
        this.b = true;
    }
}
