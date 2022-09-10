package defpackage;
/* renamed from: bvwe  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bvwe implements dbrn {
    public static final dbrn a = new bvwe();

    private bvwe() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        bvwj bvwjVar = (bvwj) obj;
        bvoo.f(new RuntimeException("Exception was thrown by the host request handler.", bvwjVar));
        dmft dmftVar = (dmft) dmfu.e.bZ();
        int i = bvwjVar.a().s;
        if (dmftVar.c) {
            dmftVar.bF();
            dmftVar.c = false;
        }
        dmfu dmfuVar = (dmfu) dmftVar.b;
        dmfuVar.a |= 2;
        dmfuVar.c = i;
        String b = bvwjVar.b();
        if (dmftVar.c) {
            dmftVar.bF();
            dmftVar.c = false;
        }
        dmfu dmfuVar2 = (dmfu) dmftVar.b;
        b.getClass();
        dmfuVar2.a |= 4;
        dmfuVar2.d = b;
        return (dmfu) dmftVar.bK();
    }
}
