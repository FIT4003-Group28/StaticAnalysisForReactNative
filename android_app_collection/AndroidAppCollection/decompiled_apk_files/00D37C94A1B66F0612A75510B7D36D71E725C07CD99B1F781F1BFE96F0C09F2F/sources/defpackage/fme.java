package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fme  reason: default package */
/* loaded from: classes3.dex */
public final class fme implements foo {
    final /* synthetic */ avaq a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fmg c;

    public fme(fmg fmgVar, avaq avaqVar, boolean z) {
        this.c = fmgVar;
        this.a = avaqVar;
        this.b = z;
    }

    @Override // defpackage.foo
    public final void a() {
        if (this.c.o(this.a)) {
            this.c.n(this.b);
        }
    }

    @Override // defpackage.foo
    public final void b(asdg asdgVar) {
        fny fnyVar;
        View a;
        argj argjVar;
        if (asdgVar != null) {
            asde asdeVar = asdgVar.f;
            if (asdeVar == null) {
                asdeVar = asde.a;
            }
            if (asdeVar.b != 102716411 || (fnyVar = this.c.d) == null || (a = fnyVar.a()) == null) {
                return;
            }
            akfb akfbVar = this.c.f;
            asde asdeVar2 = asdgVar.f;
            if (asdeVar2 == null) {
                asdeVar2 = asde.a;
            }
            if (asdeVar2.b == 102716411) {
                argjVar = (argj) asdeVar2.c;
            } else {
                argjVar = argj.a;
            }
            asde asdeVar3 = asdgVar.f;
            if (asdeVar3 == null) {
                asdeVar3 = asde.a;
            }
            akfbVar.b(argjVar, a, asdeVar3, this.c.i);
        }
    }

    @Override // defpackage.foo
    public final void c() {
    }
}
