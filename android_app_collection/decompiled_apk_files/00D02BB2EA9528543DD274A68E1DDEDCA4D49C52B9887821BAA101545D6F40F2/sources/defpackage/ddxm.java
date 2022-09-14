package defpackage;
/* compiled from: PG */
/* renamed from: ddxm  reason: default package */
/* loaded from: classes6.dex */
public final class ddxm extends dsqp<ddxn, ddxm> implements dssk {
    public ddxm() {
        super(ddxn.f);
    }

    public final void a(String str) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddxn ddxnVar = (ddxn) this.b;
        ddxn ddxnVar2 = ddxn.f;
        str.getClass();
        dsrj<String> dsrjVar = ddxnVar.e;
        if (!dsrjVar.a()) {
            ddxnVar.e = dsqw.cl(dsrjVar);
        }
        ddxnVar.e.add(str);
    }
}
