package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ldd  reason: default package */
/* loaded from: classes7.dex */
public class ldd implements lcv {
    private final kcy a;
    private boolean b;
    private final View.OnFocusChangeListener c;
    private final ldc d;

    public ldd(kcy kcyVar, View.OnFocusChangeListener onFocusChangeListener, ldc ldcVar) {
        dbsk.s(kcyVar);
        this.a = kcyVar;
        dbsk.s(onFocusChangeListener);
        this.c = onFocusChangeListener;
        dbsk.s(ldcVar);
        this.d = ldcVar;
    }

    @Override // defpackage.lcv
    public Boolean a() {
        boolean z = false;
        if (this.b && !b().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.lcv
    public Boolean b() {
        return Boolean.valueOf(((kzr) this.d).a.g.b());
    }

    @Override // defpackage.lcv
    public cqkl c() {
        kzr kzrVar = (kzr) this.d;
        kzrVar.a.a();
        kzrVar.a.g.c(1.0f);
        return cqkl.a;
    }

    @Override // defpackage.lcv
    public cqkl d() {
        kzr kzrVar = (kzr) this.d;
        kzrVar.a.a();
        kzrVar.a.g.c(-1.0f);
        return cqkl.a;
    }

    @Override // defpackage.lcv
    public cqkl e() {
        ldt ldtVar = this.a.c;
        if (ldtVar != null) {
            bvrj.UI_THREAD.c();
            ldz ldzVar = ldtVar.a;
            lkr lkrVar = ldzVar.l;
            if (lkrVar != null) {
                lkrVar.o.k(lkrVar.j.a(new lkk(lkrVar), new lkl(lkrVar)));
            } else {
                les lesVar = ldzVar.k;
                lesVar.k.k(lesVar.h.a(new lek(lesVar), new lel(lesVar)));
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.lcv
    public View.OnFocusChangeListener f() {
        return this.c;
    }

    public void g(boolean z) {
        if (this.b != z) {
            this.b = z;
            cqkx.p(this);
        }
    }
}
