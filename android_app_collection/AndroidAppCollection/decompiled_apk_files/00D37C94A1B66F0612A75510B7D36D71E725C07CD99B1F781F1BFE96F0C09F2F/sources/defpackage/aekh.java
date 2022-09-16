package defpackage;

import java.util.Set;
import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aekh  reason: default package */
/* loaded from: classes.dex */
public final class aekh implements aelc {
    private final aeks a;

    public aekh(aeks aeksVar) {
        this.a = aeksVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[Catch: all -> 0x00ce, TryCatch #1 {, blocks: (B:7:0x0012, B:8:0x0020, B:10:0x0029, B:12:0x002c, B:14:0x003b, B:16:0x0043, B:18:0x004b, B:50:0x0098, B:54:0x00a0, B:57:0x00a7, B:59:0x00ca, B:61:0x00cc, B:24:0x005e, B:26:0x0064, B:28:0x0068, B:30:0x006e, B:33:0x0076, B:35:0x0079, B:40:0x0082, B:44:0x0088, B:46:0x008e, B:47:0x0095, B:49:0x0097, B:62:0x00cd), top: B:70:0x0012, inners: #0 }] */
    @Override // defpackage.aelc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(byte[] r21, int r22, int r23, java.lang.String r24, int r25, long r26, long r28, java.lang.String r30, long r31) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekh.a(byte[], int, int, java.lang.String, int, long, long, java.lang.String, long):int");
    }

    @Override // defpackage.aelc
    public final orj b(String str) {
        return this.a.a.a(str);
    }

    @Override // defpackage.aelc
    public final aemg c() {
        return this.a.a.p;
    }

    @Override // defpackage.aelc
    public final String d(String str, int i) {
        afhk afhkVar;
        aems aemsVar = this.a.a;
        if (!aemsVar.r.get() && (afhkVar = (afhk) aemsVar.g.get(str)) != null) {
            if (!afhkVar.b.contains(Integer.valueOf(i)) && !afhkVar.b.isEmpty()) {
                return null;
            }
            return afhkVar.a;
        }
        return null;
    }

    @Override // defpackage.aelc
    public final Set e(String str) {
        return this.a.a.b(str);
    }

    @Override // defpackage.aelc
    public final void f() {
        if (this.a.l()) {
            return;
        }
        aeks aeksVar = this.a;
        ayny aynyVar = aeksVar.k;
        if (aynyVar != null) {
            aynyVar.so(new CancellationException("Onesie request cancelled"));
        }
        aeksVar.n.Z();
        aeksVar.b();
    }

    @Override // defpackage.aelc
    public final void g() {
        if (this.a.l()) {
            return;
        }
        this.a.g();
    }

    @Override // defpackage.aelc
    public final void h(aemh aemhVar) {
        aems aemsVar = this.a.a;
        amuk s = amuk.s(aemsVar.k, aemsVar.l);
        int i = ((amxx) s).c;
        for (int i2 = 0; i2 < i; i2++) {
            anlz.A((ankt) s.get(i2), new aemj(aemhVar), aemsVar.p.h ? aemsVar.m : anjk.a);
        }
    }

    @Override // defpackage.aelc
    public final boolean i() {
        return this.a.a.p();
    }

    @Override // defpackage.aelc
    public final boolean j() {
        aeks aeksVar = this.a;
        long j = aeksVar.i.get();
        return j == 0 || j > aeksVar.h.d();
    }

    @Override // defpackage.aelc
    public final int k() {
        return this.a.a.t;
    }

    @Override // defpackage.aelc
    public final boolean l(String str, String str2, long j) {
        orj a;
        aems aemsVar = this.a.a;
        if (aemsVar.r.get()) {
            return false;
        }
        int a2 = ovm.a(str2);
        String c = ovm.c(str2);
        long j2 = j / 1000;
        if (j > 0 && (a = aemsVar.a(str)) != null) {
            return j2 <= a.e && aemsVar.o(str, a2, c);
        }
        aenp aenpVar = (aenp) aemsVar.e.get(aemn.a(str, a2, c));
        if (aenpVar == null || !aenpVar.e.h()) {
            return j == 0 && aemsVar.o(str, a2, c);
        }
        aeno aenoVar = (aeno) aenpVar.e.c();
        return j2 >= aenoVar.a && j2 <= aenoVar.b;
    }
}
