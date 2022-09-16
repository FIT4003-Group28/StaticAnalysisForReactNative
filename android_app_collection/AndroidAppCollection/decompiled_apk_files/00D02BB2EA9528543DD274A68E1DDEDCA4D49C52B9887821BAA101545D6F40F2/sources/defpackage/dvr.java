package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dvr  reason: default package */
/* loaded from: classes6.dex */
public final class dvr extends dvi implements dtx {
    float a;
    float b;
    float c;
    boolean d = false;

    public dvr(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.dtx
    public final float b() {
        return this.a;
    }

    @Override // defpackage.dtx
    public final float c() {
        return this.b;
    }

    @Override // defpackage.dtx
    public final float d() {
        return this.c;
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
        if (this.d) {
            this.d = false;
            return true;
        }
        return false;
    }

    public final void j(float f, float f2, float f3) {
        bvrj.UI_THREAD.c();
        if (this.a == f && this.b == f2 && this.c != f3) {
            return;
        }
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = true;
    }
}
