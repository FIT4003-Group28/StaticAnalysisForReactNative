package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ntc  reason: default package */
/* loaded from: classes7.dex */
public final class ntc extends abg<acl> implements cot {
    private final dbsg<Integer> a;
    private final cqlk e;

    public ntc(cqkj cqkjVar, dbsg<Integer> dbsgVar) {
        dbsu dbsuVar = (dbsu) dbsgVar;
        dbsk.g(((Integer) dbsuVar.a).intValue() > 0, "maxItemCount was %s, expected positive", dbsuVar.a);
        this.a = dbsgVar;
        this.e = new cqlk(cqkjVar);
    }

    public final <S extends cqkp> void A(cqiw<S> cqiwVar, S s) {
        if (this.e.d() >= ((Integer) ((dbsu) this.a).a).intValue()) {
            return;
        }
        this.e.a(cqiwVar, s);
    }

    public final void B() {
        this.e.c();
    }

    @Override // defpackage.cot
    public final void a() {
    }

    public final <S extends cqkp> void b(cqiw<S> cqiwVar, dcdc<? extends S> dcdcVar) {
        this.e.c();
        int intValue = this.a.c(Integer.valueOf(dcdcVar.size())).intValue();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            S s = dcdcVar.get(i);
            if (this.e.d() >= intValue) {
                break;
            }
            this.e.a(cqiwVar, s);
        }
        s();
    }

    @Override // defpackage.abg
    public final int c() {
        return this.e.d();
    }

    @Override // defpackage.abg
    public final acl d(ViewGroup viewGroup, int i) {
        return new ntb(this.e.i(viewGroup, i));
    }

    @Override // defpackage.abg
    public final void e(acl aclVar, int i) {
        this.e.j(aclVar.a, i);
    }

    @Override // defpackage.abg
    public final int i(int i) {
        return this.e.f(i);
    }

    @Override // defpackage.abg
    public final void l(acl aclVar) {
        cqlk.k(aclVar.a);
    }

    public final <S extends cqkp, T extends cqkp> void y(cqiw<S> cqiwVar, dcdc<S> dcdcVar, cqiw<T> cqiwVar2, T t) {
        dbsk.s(t);
        int min = Math.min(dcdcVar.size(), ((Integer) ((dbsu) this.a).a).intValue() - 1);
        this.e.c();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            S s = dcdcVar.get(i);
            if (this.e.d() >= min) {
                break;
            }
            this.e.a(cqiwVar, s);
        }
        this.e.a(cqiwVar2, t);
        s();
    }

    public final <S extends cqkp> void z(cqiw<S> cqiwVar, dcdc<? extends S> dcdcVar) {
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            S s = dcdcVar.get(i);
            if (this.e.d() >= ((Integer) ((dbsu) this.a).a).intValue()) {
                return;
            }
            this.e.a(cqiwVar, s);
        }
    }
}
