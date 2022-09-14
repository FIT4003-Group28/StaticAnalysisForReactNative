package defpackage;
/* compiled from: PG */
/* renamed from: bwax  reason: default package */
/* loaded from: classes4.dex */
public final class bwax extends bvwn<dmhk> {
    private static final bviw b = bvjk.b;
    private final dxio<bvjj> c;
    private final dxio<akfa> d;

    public bwax(dxio<bvjj> dxioVar, dxio<akfa> dxioVar2) {
        super(dmhk.e);
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmhk dmhkVar) {
        dmhk dmhkVar2 = dmhkVar;
        if (dmhkVar2.a.isEmpty()) {
            bvwi c = bvwj.c();
            c.b(drtc.INVALID_ARGUMENT);
            throw c.a();
        }
        bvjk bvjkVar = new bvjk(dmhkVar2.a, b);
        dmhp dmhpVar = dmhkVar2.b;
        if (dmhpVar == null) {
            dmhpVar = dmhp.c;
        }
        String str = "";
        float f = 0.0f;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        if (!dmhkVar2.c) {
            bvjj a = this.c.a();
            int a2 = dmho.a(dmhpVar.a);
            int i3 = a2 - 1;
            if (a2 == 0) {
                throw null;
            }
            switch (i3) {
                case 0:
                    if (dmhpVar.a == 1) {
                        z = ((Boolean) dmhpVar.b).booleanValue();
                    }
                    a.S(bvjkVar, z);
                    return;
                case 1:
                    if (dmhpVar.a == 2) {
                        f = ((Float) dmhpVar.b).floatValue();
                    }
                    a.U(bvjkVar.kz, null, f);
                    return;
                case 2:
                    if (dmhpVar.a == 3) {
                        i2 = ((Integer) dmhpVar.b).intValue();
                    }
                    a.W(bvjkVar, i2);
                    return;
                case 3:
                    a.Z(bvjkVar, dmhpVar.a == 4 ? ((Long) dmhpVar.b).longValue() : 0L);
                    return;
                case 4:
                    if (dmhpVar.a == 5) {
                        str = (String) dmhpVar.b;
                    }
                    a.ac(bvjkVar, str);
                    return;
                case 5:
                    a.af(bvjkVar, dcep.K((dmhpVar.a == 6 ? (dmhn) dmhpVar.b : dmhn.b).a));
                    return;
                case 6:
                    bvwi c2 = bvwj.c();
                    c2.b(drtc.INVALID_ARGUMENT);
                    throw c2.a();
                default:
                    return;
            }
        }
        bvjj a3 = this.c.a();
        btlu j = this.d.a().j();
        int a4 = dmho.a(dmhpVar.a);
        int i4 = a4 - 1;
        if (a4 == 0) {
            throw null;
        }
        switch (i4) {
            case 0:
                if (dmhpVar.a == 1) {
                    z2 = ((Boolean) dmhpVar.b).booleanValue();
                }
                a3.T(bvjkVar, j, z2);
                return;
            case 1:
                if (dmhpVar.a == 2) {
                    f = ((Float) dmhpVar.b).floatValue();
                }
                a3.U(bvjkVar.kz, bvjj.c(j), f);
                return;
            case 2:
                if (dmhpVar.a == 3) {
                    i = ((Integer) dmhpVar.b).intValue();
                }
                a3.X(bvjkVar, j, i);
                return;
            case 3:
                a3.aa(bvjkVar, j, dmhpVar.a == 4 ? ((Long) dmhpVar.b).longValue() : 0L);
                return;
            case 4:
                if (dmhpVar.a == 5) {
                    str = (String) dmhpVar.b;
                }
                a3.ad(bvjkVar, j, str);
                return;
            case 5:
                a3.ag(bvjkVar, j, dcep.K((dmhpVar.a == 6 ? (dmhn) dmhpVar.b : dmhn.b).a));
                return;
            case 6:
                bvwi c3 = bvwj.c();
                c3.b(drtc.INVALID_ARGUMENT);
                throw c3.a();
            default:
                return;
        }
    }
}
