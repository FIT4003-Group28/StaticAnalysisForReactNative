package defpackage;

import android.view.View;
import defpackage.cqkp;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqkg  reason: default package */
/* loaded from: classes5.dex */
public final class cqkg<V extends cqkp> implements cqkf<V> {
    private cqjz<V> a;

    private cqkg(cqjz<V> cqjzVar) {
        this.a = cqjzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V extends cqkp> cqkf<V> k(cqjz<V> cqjzVar) {
        cqkg cqkgVar = new cqkg(cqjzVar);
        cqjzVar.f(cqkgVar);
        return cqkgVar;
    }

    @Override // defpackage.cqkf
    public final cqjz<V> a() {
        return this.a;
    }

    @Override // defpackage.cqkf
    public final void b(cqjz<V> cqjzVar) {
        this.a = cqjzVar;
    }

    @Override // defpackage.cqkf
    public final View c() {
        return this.a.c;
    }

    @Override // defpackage.cqkf
    @dzsi
    public final V d() {
        return this.a.j;
    }

    @Override // defpackage.cqkf
    public final void e(@dzsi V v) {
        if (v == null) {
            f();
        } else {
            this.a.w(v, 2);
        }
    }

    @Override // defpackage.cqkf
    public final void f() {
        this.a.w(null, 2);
    }

    @Override // defpackage.cqkf
    public final void g() {
        this.a.j();
    }

    @Override // defpackage.cqkf
    public final void h() {
        this.a.l();
    }

    @Override // defpackage.cqkf
    public final void i() {
        this.a.g.o().g(this);
    }

    @Override // defpackage.cqkf
    public final cqiw<V> j() {
        return this.a.f;
    }
}
