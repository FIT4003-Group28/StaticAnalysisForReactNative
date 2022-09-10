package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ldb  reason: default package */
/* loaded from: classes7.dex */
public class ldb implements lcu {
    private boolean a;
    private boolean b;
    private boolean c = true;
    private final lda d;
    @dzsi
    private View.OnFocusChangeListener e;

    public ldb(cqhn cqhnVar, lda ldaVar, boolean z) {
        this.d = ldaVar;
        this.b = z;
    }

    @Override // defpackage.lcu
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.lcu
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.lcu
    @dzsi
    public View.OnFocusChangeListener c() {
        return this.e;
    }

    @Override // defpackage.lcu
    public Boolean d() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.lcu
    public cqkl e() {
        aqzz aqzzVar;
        kza kzaVar = (kza) this.d;
        kzb kzbVar = kzaVar.a.k;
        if (kzbVar != null && (aqzzVar = kzbVar.a) != null) {
            aqzzVar.c();
        }
        lda ldaVar = kzaVar.a.l;
        if (ldaVar != null) {
            ((kzf) ldaVar).a.a();
        }
        return cqkl.a;
    }

    public void f(boolean z) {
        if (this.b != z) {
            this.b = z;
            cqkx.p(this);
        }
    }

    public void g(@dzsi View.OnFocusChangeListener onFocusChangeListener) {
        if (this.e != onFocusChangeListener) {
            this.e = onFocusChangeListener;
            cqkx.p(this);
        }
    }

    public void h(boolean z) {
        this.a = z;
        cqkx.p(this);
    }
}
