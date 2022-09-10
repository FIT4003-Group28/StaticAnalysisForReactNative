package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ldl  reason: default package */
/* loaded from: classes7.dex */
public class ldl implements lcz {
    private boolean a;
    private boolean b;
    private final View.OnFocusChangeListener c;
    private final ldk d;

    public ldl(kcy kcyVar, View.OnFocusChangeListener onFocusChangeListener, ldk ldkVar) {
        dbsk.s(kcyVar);
        dbsk.s(onFocusChangeListener);
        this.c = onFocusChangeListener;
        dbsk.s(ldkVar);
        this.d = ldkVar;
    }

    @Override // defpackage.lcz
    public Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.lcz
    public cqkl b() {
        kzs kzsVar = (kzs) this.d;
        kzsVar.a.a();
        kzt kztVar = kzsVar.a;
        if (!kztVar.j.b) {
            lak lakVar = kztVar.g;
            lakVar.a(!lakVar.b());
        }
        return cqkl.a;
    }

    @Override // defpackage.lcz
    public Boolean c() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.lcz
    public View.OnFocusChangeListener d() {
        return this.c;
    }

    public void e(boolean z) {
        if (this.a != z) {
            this.a = z;
            cqkx.p(this);
        }
    }

    public void f(boolean z) {
        if (this.b != z) {
            this.b = z;
            cqkx.p(this);
        }
    }
}
