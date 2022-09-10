package defpackage;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pcg  reason: default package */
/* loaded from: classes7.dex */
public final class pcg {
    static final long a = TimeUnit.DAYS.toMillis(1);
    public static final /* synthetic */ int j = 0;
    public final String b;
    public final bvrb c;
    public final dxio<akfa> d;
    public final cqat e;
    public final bvjj f;
    @dzsi
    public String g;
    public final dbyy<btlu, dehn<duto>> h = dccf.a();
    public dcdc<btlu> i = dcdc.e();
    private final String k;
    private final dawo l;
    private final float m;
    private final buwj n;
    private final ped o;
    private final btvo p;

    public pcg(String str, String str2, dawo dawoVar, float f, buwj buwjVar, bvrb bvrbVar, dxio<akfa> dxioVar, bvjj bvjjVar, ped pedVar, cqat cqatVar, btvo btvoVar) {
        dbsk.s(str);
        this.b = str;
        dbsk.s(str2);
        this.k = str2;
        dbsk.s(dawoVar);
        this.l = dawoVar;
        dbsk.a(f > 0.0f);
        this.m = f;
        dbsk.s(buwjVar);
        this.n = buwjVar;
        dbsk.s(bvrbVar);
        this.c = bvrbVar;
        dbsk.s(dxioVar);
        this.d = dxioVar;
        dbsk.s(bvjjVar);
        this.f = bvjjVar;
        dbsk.s(pedVar);
        this.o = pedVar;
        dbsk.s(cqatVar);
        this.e = cqatVar;
        dbsk.s(btvoVar);
        this.p = btvoVar;
    }

    public static dutq b(@dzsi String str, String str2) {
        if (str == null) {
            return dutq.d;
        }
        dutp bZ = dutq.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dutq dutqVar = (dutq) bZ.b;
        str.getClass();
        int i = dutqVar.a | 1;
        dutqVar.a = i;
        dutqVar.b = str;
        str2.getClass();
        dutqVar.a = i | 16;
        dutqVar.c = str2;
        return bZ.bK();
    }

    public final void a(boolean z) {
        String str = this.g;
        if (str == null) {
            return;
        }
        dcdc<btlu> dcdcVar = this.i;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            btlu btluVar = dcdcVar.get(i);
            String A = this.f.A(bvjk.gh, btluVar, null);
            long x = this.f.x(bvjk.gi, btluVar, Long.MIN_VALUE);
            long j2 = a;
            if ((this.p.getNotificationsParameters().a & 1) != 0) {
                j2 = this.p.getNotificationsParameters().c;
            }
            boolean z2 = str.equals(A) && this.e.b() < x + j2;
            if ((z || !z2) && !this.h.containsKey(btluVar)) {
                dutl bZ = dutm.k.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dutm dutmVar = (dutm) bZ.b;
                dutmVar.a |= 1;
                dutmVar.b = "GMM_VIEW";
                String str2 = this.k;
                dutm dutmVar2 = (dutm) bZ.b;
                str2.getClass();
                int i2 = dutmVar2.a | 16;
                dutmVar2.a = i2;
                dutmVar2.f = str2;
                dutmVar2.c = this.l.p;
                int i3 = i2 | 2;
                dutmVar2.a = i3;
                float f = this.m;
                dutmVar2.a = i3 | 4;
                dutmVar2.d = f;
                String id = TimeZone.getDefault().getID();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dutm dutmVar3 = (dutm) bZ.b;
                id.getClass();
                dutmVar3.a |= 8;
                dutmVar3.e = id;
                dutq b = b(str, this.b);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dutm dutmVar4 = (dutm) bZ.b;
                b.getClass();
                dutmVar4.g = b;
                dutmVar4.a |= 32;
                dlgp a2 = this.o.a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dutm dutmVar5 = (dutm) bZ.b;
                a2.getClass();
                dutmVar5.h = a2;
                int i4 = dutmVar5.a | 64;
                dutmVar5.a = i4;
                dutmVar5.a = i4 | 256;
                dutmVar5.i = false;
                deig d = deig.d();
                this.n.a().e = btluVar;
                deha.q(d, new pce(d, this.n.c().a(bZ.bK(), new pcd(d), bvrj.UI_THREAD)), this.c.h());
                this.h.put(btluVar, d);
                d.Pk(new pcc(this, d, btluVar, str), this.c.h());
            }
        }
    }
}
