package defpackage;
/* compiled from: PG */
/* renamed from: dwfs  reason: default package */
/* loaded from: classes.dex */
public final class dwfs extends dsqp<dwfv, dwfs> implements dssk {
    public dwfs() {
        super(dwfv.m);
    }

    public final void a(dwfr dwfrVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwfv dwfvVar = (dwfv) this.b;
        dwfv dwfvVar2 = dwfv.m;
        dwfrVar.getClass();
        dwfr dwfrVar2 = dwfvVar.c;
        if (dwfrVar2 != null && dwfrVar2 != dwfr.h) {
            dwfp ca = dwfr.h.ca(dwfvVar.c);
            ca.bC(dwfrVar);
            dwfrVar = ca.bJ();
        }
        dwfvVar.c = dwfrVar;
        dwfvVar.a |= 2;
    }
}
