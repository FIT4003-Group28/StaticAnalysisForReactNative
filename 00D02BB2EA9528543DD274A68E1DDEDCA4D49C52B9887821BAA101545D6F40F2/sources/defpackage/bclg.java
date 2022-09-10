package defpackage;

import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: bclg  reason: default package */
/* loaded from: classes3.dex */
public final class bclg extends aljc {
    private final bcln a;
    private final cjqy b;
    private boolean c = false;

    public bclg(bcln bclnVar, cjqy cjqyVar) {
        this.a = bclnVar;
        this.b = cjqyVar;
    }

    @Override // defpackage.alis, defpackage.alir
    public final void e() {
        bwuj b = this.a.b();
        if (b.d()) {
            b.a.j();
        }
    }

    @Override // defpackage.alis, defpackage.alir
    public final void f(float f) {
        bwuj b = this.a.b();
        if (!b.d()) {
            b.a.g(f, 0.0f);
        }
    }

    @Override // defpackage.alis, defpackage.alir
    public final void g(float f, float f2) {
        bwuj b = this.a.b();
        dhjx c = b.c();
        float f3 = c.e;
        dhkd dhkdVar = c.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        float f4 = f * (f3 / dhkdVar.c);
        dhkb dhkbVar = c.c;
        if (dhkbVar == null) {
            dhkbVar = dhkb.e;
        }
        float f5 = dhkbVar.b + f4;
        dhkb dhkbVar2 = c.c;
        if (dhkbVar2 == null) {
            dhkbVar2 = dhkb.e;
        }
        b.a(f5, dhkbVar2.c);
    }

    @Override // defpackage.alis, defpackage.alir
    public final void i() {
        this.c = true;
    }

    @Override // defpackage.alis, defpackage.alir
    public final void j() {
        if (this.c) {
            this.c = false;
        } else {
            this.b.m(new cjte(deaf.DRAG), this.a.a());
        }
    }

    @Override // defpackage.alis, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        this.c = true;
        return false;
    }
}
