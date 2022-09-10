package defpackage;
/* renamed from: bvwf  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bvwf implements dbrn {
    public static final dbrn a = new bvwf();

    private bvwf() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Exception exc = (Exception) obj;
        bvoo.f(new RuntimeException("Exception was thrown by the host request handler.", exc));
        dmft dmftVar = (dmft) dmfu.e.bZ();
        int i = drtc.INTERNAL.s;
        if (dmftVar.c) {
            dmftVar.bF();
            dmftVar.c = false;
        }
        dmfu dmfuVar = (dmfu) dmftVar.b;
        dmfuVar.a |= 2;
        dmfuVar.c = i;
        String e = dbsj.e(exc.getMessage());
        if (dmftVar.c) {
            dmftVar.bF();
            dmftVar.c = false;
        }
        dmfu dmfuVar2 = (dmfu) dmftVar.b;
        e.getClass();
        dmfuVar2.a |= 4;
        dmfuVar2.d = e;
        return (dmfu) dmftVar.bK();
    }
}
