package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: iis  reason: default package */
/* loaded from: classes3.dex */
public final class iis implements ajpy {
    public final Object a;
    public final Uri b;
    public final int c;
    private final long d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public iis(defpackage.apsm r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L19
            int r1 = r3.b
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L19
            apsl r1 = r3.j
            if (r1 != 0) goto Lf
            apsl r1 = defpackage.apsl.a
        Lf:
            int r1 = r1.b
            int r1 = defpackage.almu.D(r1)
            if (r1 != 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iis.<init>(apsm):void");
    }

    public static Uri a(apsm apsmVar) {
        if (apsmVar == null) {
            return null;
        }
        String str = apsmVar.e;
        boolean z = true;
        if (apsmVar.l.size() != 0 || (apsmVar.m.size() <= 0 && apsmVar.n.size() <= 0)) {
            z = false;
        }
        return b(str, z);
    }

    public static Uri b(String str, boolean z) {
        return ajqa.g(4, true != z ? "channel/list/view" : "channel/list/edit", str);
    }

    public static void c(aopa aopaVar) {
        long j = ((apsm) aopaVar.instance).o;
        aopaVar.copyOnWrite();
        apsm apsmVar = (apsm) aopaVar.instance;
        apsmVar.b |= 1024;
        apsmVar.o = j + 1;
    }

    @Override // defpackage.ajpy
    public final ajpy e(ajpy ajpyVar) {
        if (ajpyVar instanceof iis) {
            iis iisVar = (iis) ajpyVar;
            return this.d > iisVar.d ? this : iisVar;
        }
        return this;
    }

    public iis(apsm apsmVar, int i) {
        long j = apsmVar.o;
        this.a = apsmVar;
        this.d = j;
        this.c = i;
        this.b = a(apsmVar);
    }
}
