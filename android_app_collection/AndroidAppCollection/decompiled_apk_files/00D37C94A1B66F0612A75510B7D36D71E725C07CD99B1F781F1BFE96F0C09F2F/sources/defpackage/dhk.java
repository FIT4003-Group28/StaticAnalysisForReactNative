package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: dhk  reason: default package */
/* loaded from: classes3.dex */
public final class dhk extends cyv {
    public dhv n;
    public WeakReference o;
    public daq p;
    public final qwt q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dhk(defpackage.cyv r7) {
        /*
            r6 = this;
            android.content.Context r1 = r7.b
            java.lang.String r2 = r7.c
            tha r3 = r7.l
            aflw r7 = r7.n()
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.m = r7
            qwt r7 = new qwt
            r7.<init>()
            r6.q = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhk.<init>(cyv):void");
    }

    public static dhk o(dhk dhkVar, dhj dhjVar) {
        dhk dhkVar2 = new dhk(dhkVar);
        dhkVar2.n = dhkVar.n;
        dhkVar2.p = dhkVar.p;
        dhkVar2.o = new WeakReference(dhjVar);
        return dhkVar2;
    }

    @Override // defpackage.cyv
    public final void g(ddk ddkVar, String str) {
        dhj dhjVar = (dhj) this.o.get();
        dhv dhvVar = this.n;
        if (dhvVar == null || dhjVar == null) {
            return;
        }
        if (dlm.a) {
            this.n.hashCode();
            String.valueOf(ddkVar.getClass().getName()).length();
        }
        dhvVar.i(dhjVar.i, ddkVar, str);
    }

    @Override // defpackage.cyv
    public final void h(ddk ddkVar, String str) {
        dhj dhjVar = (dhj) this.o.get();
        dhv dhvVar = this.n;
        if (dhvVar == null || dhjVar == null) {
            return;
        }
        if (dlm.a) {
            this.n.hashCode();
            String.valueOf(ddkVar.getClass().getName()).length();
        }
        dhvVar.h(dhjVar.i, ddkVar, str);
    }

    @Override // defpackage.cyv
    public final aflw m() {
        return this.m;
    }
}
