package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cjvm  reason: default package */
/* loaded from: classes.dex */
public final class cjvm {
    public final cqat b;
    public volatile int e;
    public long f;
    public long h;
    public int i;
    public int j;
    public final ckcq k;
    public final ckcq l;
    public final ckcq m;
    public final ckcw n;
    public int p;
    public int q;
    public int r;
    public int s;
    public final int t;
    public final long[] a = new long[100];
    public int[] c = new int[100];
    public volatile boolean d = false;
    public long g = -1;
    public final Set<cjvl> o = dcnm.g();

    public cjvm(int i, cqat cqatVar, ckcw ckcwVar) {
        this.b = cqatVar;
        this.t = i;
        this.k = ((ckcr) ckcwVar.a(ckgh.a)).a();
        this.l = ((ckcr) ckcwVar.a(ckgh.b)).a();
        this.m = ((ckcr) ckcwVar.a(ckgh.c)).a();
        this.n = ckcwVar;
        Thread.currentThread().getName();
    }

    public final void a(cjvl cjvlVar) {
        this.o.add(cjvlVar);
    }

    public final void b(cjvl cjvlVar) {
        this.o.remove(cjvlVar);
    }
}
