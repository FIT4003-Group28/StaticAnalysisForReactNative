package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ayxb  reason: default package */
/* loaded from: classes3.dex */
public final class ayxb implements jkh, bzml {
    public final cqkj a;
    public final gga b;
    public final ayxl c;
    public jdi d;
    public jdo e;
    private final gfq f;
    private final bvrb g;
    private final dxio<bzmm> h;

    public ayxb(gga ggaVar, gfq gfqVar, cqkj cqkjVar, bvrb bvrbVar, dxio<bzmm> dxioVar, ayxl ayxlVar) {
        this.b = ggaVar;
        this.f = gfqVar;
        this.a = cqkjVar;
        this.g = bvrbVar;
        this.h = dxioVar;
        this.c = ayxlVar;
    }

    private final boolean h() {
        if (this.b.aZ && i()) {
            this.g.a(new Runnable(this) { // from class: aywy
                private final ayxb a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ayxb ayxbVar = this.a;
                    View g = ayxbVar.g();
                    if (g != null) {
                        cqhu.d(g, izx.c, new ayxa(ayxbVar, g));
                    }
                }
            }, bvrj.UI_THREAD, 500L);
            return true;
        }
        return false;
    }

    private final boolean i() {
        return g() != null;
    }

    private final boolean j() {
        jdi jdiVar = this.d;
        return jdiVar != null && jdiVar.b();
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (g() == null || !jjnVar2.b()) {
            if (!j()) {
                return;
            }
            this.d.f();
        } else if (j()) {
            h();
        } else {
            this.h.a().a(this);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.SAVE_TO_PLACE_LIST;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.b.aZ && i();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return this.h.a().b(dqkc.SAVE_TO_PLACE_LIST) != bzmk.VISIBLE ? bzmk.VISIBLE : bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar == bzmk.REPRESSED) {
            return false;
        }
        return h();
    }

    @dzsi
    public final View g() {
        if (!this.b.aZ) {
            return null;
        }
        fd d = this.f.d();
        if ((d instanceof befx) && d.U()) {
            try {
                return ((befx) d).bU();
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
