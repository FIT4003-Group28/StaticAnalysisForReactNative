package defpackage;
/* compiled from: PG */
/* renamed from: bwau  reason: default package */
/* loaded from: classes4.dex */
public final class bwau extends bvwn<dmhe> {
    private final dxio<araj> b;

    public bwau(dxio<araj> dxioVar) {
        super(dmhe.c);
        this.b = dxioVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmhe dmheVar) {
        ardz ardzVar;
        dmhe dmheVar2 = dmheVar;
        int a = dmhd.a(dmheVar2.a);
        if (a == 0 || a == 1) {
            bvwi c = bvwj.c();
            c.b(drtc.INVALID_ARGUMENT);
            throw c.a();
        }
        arbx f = this.b.a().m().f();
        int a2 = dmhd.a(dmheVar2.a);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            ardzVar = ardz.NONE;
        } else if (i != 2) {
            String valueOf = String.valueOf(Integer.toString(i));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else {
            ardzVar = ardz.MAP;
        }
        f.k(ardzVar);
    }
}
