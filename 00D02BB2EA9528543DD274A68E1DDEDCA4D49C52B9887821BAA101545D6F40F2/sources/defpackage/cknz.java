package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: cknz  reason: default package */
/* loaded from: classes4.dex */
public final class cknz extends bbuq {
    private static final dcqe d = dcqe.c("cknz");
    private final cknx e;
    private int g;
    private String h;
    private final List<bvrt<dwfl>> f = new ArrayList();
    akqi c = null;
    private bvrt<dwge> i = null;
    private boolean j = false;
    private int k = 100;
    private int l = 100;

    public cknz(@dzsi ilo iloVar, cknx cknxVar) {
        this.e = cknxVar;
        w(iloVar);
    }

    private synchronized void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    @Override // defpackage.bbuq
    public final synchronized void a(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.bbuq
    public final int b() {
        return this.g;
    }

    @Override // defpackage.bbuq
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bbuq
    public final int d() {
        return this.f.size();
    }

    @Override // defpackage.bbuq
    @dzsi
    public final dwfl e(int i) {
        if (i < 0 || i >= this.f.size()) {
            return null;
        }
        return this.f.get(i).e((dssr) dwfl.w.cu(7), dwfl.w);
    }

    @Override // defpackage.bbuq
    public final int f(dwfl dwflVar) {
        return this.f.indexOf(bvrt.b(dwflVar));
    }

    @Override // defpackage.bbuq
    public final boolean g() {
        return !this.j;
    }

    @Override // defpackage.bbuq
    public final void h(buti butiVar) {
        ckny cknyVar = new ckny(this);
        if (this.c == null || butiVar == null || !g()) {
            return;
        }
        dwge a = this.e.a(this.c, 20, this.h, this.k, this.l);
        bvrt<dwge> bvrtVar = this.i;
        if (bvrtVar != null && bvrtVar.equals(bvrt.b(a))) {
            return;
        }
        this.i = bvrt.b(a);
        butiVar.a(a, cknyVar, bvrj.UI_THREAD);
    }

    @Override // defpackage.bbuq
    public final void i(int i) {
        bvoo.h("Photos can't be deleted from placemark's photo page.", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void j(Collection<dwfl> collection) {
        bvoo.h("removePhotos is not currently supported", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void k(String str, String str2) {
        bvoo.h("Photos can't be edited from placemark's photo page.", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void l(String str, List<dwfa> list) {
        bvoo.h("Photos can't be edited from placemark's photo page.", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void m(String str, String str2) {
        bvoo.h("Photos can't be edited from placemark's photo page.", new Object[0]);
    }

    public final synchronized void w(@dzsi ilo iloVar) {
        if (iloVar == null) {
            return;
        }
        if (this.c == null) {
            this.c = iloVar.ai();
        }
        if (this.e.b(iloVar) == this.g) {
            return;
        }
        if (!this.f.isEmpty()) {
            return;
        }
        this.g = Math.max(this.f.size(), this.e.b(iloVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[Catch: all -> 0x0053, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000c, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:16:0x002b, B:18:0x002f, B:19:0x0031, B:21:0x0035, B:22:0x0037, B:24:0x003d, B:25:0x0047, B:9:0x0010), top: B:33:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void x(@defpackage.dzsi java.util.List<defpackage.dwfl> r2, @defpackage.dzsi java.lang.String r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r4 != 0) goto L10
            if (r2 == 0) goto L10
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto Lc
            goto L10
        Lc:
            r4 = 0
            r1.j = r4     // Catch: java.lang.Throwable -> L53
            goto L13
        L10:
            r4 = 1
            r1.j = r4     // Catch: java.lang.Throwable -> L53
        L13:
            if (r2 == 0) goto L47
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L53
        L19:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L47
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L53
            dwfl r4 = (defpackage.dwfl) r4     // Catch: java.lang.Throwable -> L53
            boolean r0 = defpackage.cknv.g(r4)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L3d
            dizh r0 = r4.p     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L31
            dizh r0 = defpackage.dizh.j     // Catch: java.lang.Throwable -> L53
        L31:
            dghk r0 = r0.c     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L37
            dghk r0 = defpackage.dghk.g     // Catch: java.lang.Throwable -> L53
        L37:
            int r0 = r0.a     // Catch: java.lang.Throwable -> L53
            r0 = r0 & 4
            if (r0 == 0) goto L19
        L3d:
            java.util.List<bvrt<dwfl>> r0 = r1.f     // Catch: java.lang.Throwable -> L53
            bvrt r4 = defpackage.bvrt.b(r4)     // Catch: java.lang.Throwable -> L53
            r0.add(r4)     // Catch: java.lang.Throwable -> L53
            goto L19
        L47:
            r1.h = r3     // Catch: java.lang.Throwable -> L53
            java.util.List<bvrt<dwfl>> r2 = r1.f     // Catch: java.lang.Throwable -> L53
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L53
            r1.g = r2     // Catch: java.lang.Throwable -> L53
            monitor-exit(r1)
            return
        L53:
            r2 = move-exception
            monitor-exit(r1)
            goto L57
        L56:
            throw r2
        L57:
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cknz.x(java.util.List, java.lang.String, boolean):void");
    }
}
