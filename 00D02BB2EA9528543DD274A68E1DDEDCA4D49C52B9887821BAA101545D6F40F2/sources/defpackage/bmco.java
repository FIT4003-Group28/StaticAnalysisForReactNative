package defpackage;
/* compiled from: PG */
/* renamed from: bmco  reason: default package */
/* loaded from: classes3.dex */
public final class bmco extends dsqp<bmcp, bmco> implements dssk {
    public bmco() {
        super(bmcp.b);
    }

    public final void a(dnfd dnfdVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        bmcp bmcpVar = (bmcp) this.b;
        bmcp bmcpVar2 = bmcp.b;
        dnfdVar.getClass();
        dsrj<dnfd> dsrjVar = bmcpVar.a;
        if (!dsrjVar.a()) {
            bmcpVar.a = dsqw.cl(dsrjVar);
        }
        bmcpVar.a.add(dnfdVar);
    }
}
