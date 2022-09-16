package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* compiled from: PG */
/* renamed from: aett  reason: default package */
/* loaded from: classes.dex */
public final class aett implements aetv {
    public final aetv a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public aett(aetv aetvVar) {
        this.a = aetvVar;
    }

    private final void A(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.aetv
    public final aflm a() {
        return aflm.a;
    }

    @Override // defpackage.aetv
    public final void b(int i) {
        A(new aetq(this, i, 1));
    }

    @Override // defpackage.aetv
    public final void c(int i) {
        A(new aetq(this, i));
    }

    @Override // defpackage.aeuo
    public final void d() {
        aetv aetvVar = this.a;
        aetvVar.getClass();
        A(new aetp(aetvVar, 1));
    }

    @Override // defpackage.aeuo
    public final void e(FormatStreamModel formatStreamModel, long j, long j2, aeui[] aeuiVarArr) {
        this.a.e(formatStreamModel, j, j2, aeuiVarArr);
    }

    @Override // defpackage.aeuo
    public final void f() {
        aetv aetvVar = this.a;
        aetvVar.getClass();
        A(new aetp(aetvVar));
    }

    @Override // defpackage.aeuo
    public final void g(final afkn afknVar) {
        A(new Runnable() { // from class: aetj
            @Override // java.lang.Runnable
            public final void run() {
                aett aettVar = aett.this;
                aettVar.a.g(afknVar);
            }
        });
    }

    @Override // defpackage.aeuo
    public final void h(final aesr aesrVar) {
        A(new Runnable() { // from class: aeti
            @Override // java.lang.Runnable
            public final void run() {
                aett aettVar = aett.this;
                aettVar.a.h(aesrVar);
            }
        });
    }

    @Override // defpackage.aeuo
    public final void i(final String str, final afip afipVar) {
        A(new Runnable() { // from class: aetn
            @Override // java.lang.Runnable
            public final void run() {
                aett aettVar = aett.this;
                aettVar.a.i(str, afipVar);
            }
        });
    }

    @Override // defpackage.aeuo
    public final void j(final afte afteVar) {
        A(new Runnable() { // from class: aetk
            @Override // java.lang.Runnable
            public final void run() {
                aett aettVar = aett.this;
                aettVar.a.j(afteVar);
            }
        });
    }

    @Override // defpackage.aeuo
    public final void k(final long j, final long j2) {
        A(new Runnable() { // from class: aets
            @Override // java.lang.Runnable
            public final void run() {
                aett aettVar = aett.this;
                aettVar.a.k(j, j2);
            }
        });
    }

    @Override // defpackage.aeuo
    public final void l(final String str) {
        A(new Runnable() { // from class: aetm
            @Override // java.lang.Runnable
            public final void run() {
                aett aettVar = aett.this;
                aettVar.a.l(str);
            }
        });
    }

    @Override // defpackage.aeuo
    public final void m() {
        aetv aetvVar = this.a;
        aetvVar.getClass();
        A(new aetp(aetvVar, 2));
    }

    @Override // defpackage.aeuo
    public final void n() {
        aetv aetvVar = this.a;
        aetvVar.getClass();
        A(new aetp(aetvVar, 3));
    }

    @Override // defpackage.aeuo
    public final void o(long j) {
        A(new aetr(this, j, 1));
    }

    @Override // defpackage.aeuo
    public final void p(final float f) {
        A(new Runnable() { // from class: aeth
            @Override // java.lang.Runnable
            public final void run() {
                aett aettVar = aett.this;
                aettVar.a.p(f);
            }
        });
    }

    @Override // defpackage.aeuo
    public final void q() {
        aetv aetvVar = this.a;
        aetvVar.getClass();
        A(new aetp(aetvVar, 4));
    }

    @Override // defpackage.aeuo
    public final void r() {
        aetv aetvVar = this.a;
        aetvVar.getClass();
        A(new aetp(aetvVar, 5));
    }

    @Override // defpackage.aeuo
    public final void s(long j) {
        A(new aetr(this, j));
    }

    @Override // defpackage.aeuo
    public final void t(long j) {
        A(new aetr(this, j, 2));
    }

    @Override // defpackage.aeuo
    public final void u(long j) {
        A(new aetr(this, j, 3));
    }

    @Override // defpackage.aeuo
    public final void v() {
        aetv aetvVar = this.a;
        aetvVar.getClass();
        A(new aetp(aetvVar, 6));
    }

    @Override // defpackage.aeuo
    public final void w(final String str, final String str2) {
        A(new Runnable() { // from class: aeto
            @Override // java.lang.Runnable
            public final void run() {
                aett aettVar = aett.this;
                aettVar.a.w(str, str2);
            }
        });
    }

    @Override // defpackage.aeuo
    public final void x(int i) {
        A(new aetq(this, i, 2));
    }

    @Override // defpackage.aeuo
    public final void y(long j) {
        A(new aetr(this, j, 4));
    }

    @Override // defpackage.aeuo
    public final void z(final awan awanVar) {
        A(new Runnable() { // from class: aetl
            @Override // java.lang.Runnable
            public final void run() {
                aett aettVar = aett.this;
                aettVar.a.z(awanVar);
            }
        });
    }
}
