package defpackage;

import android.location.Location;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajmp  reason: default package */
/* loaded from: classes2.dex */
public final class ajmp implements dbsz<Location> {
    public int a = 0;
    public dbsg<eapd> b = dbpy.a;
    final /* synthetic */ ajmq c;
    private final dqzg d;
    private final dcep<btlu> e;
    private final boolean f;
    private final dcep<dqym> g;
    private final dbsg<dqxv> h;

    public ajmp(ajmq ajmqVar, dqzg dqzgVar, dcep<btlu> dcepVar, boolean z, dcep<dqym> dcepVar2, dbsg<dqxv> dbsgVar) {
        this.c = ajmqVar;
        this.d = dqzgVar;
        this.e = dcepVar;
        this.f = z;
        this.g = dcepVar2;
        this.h = dbsgVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(Location location) {
        Location location2 = location;
        if (this.h.a() && (((dqxx) this.h.b().b).a & 1) != 0) {
            eaow eaowVar = new eaow(location2.getElapsedRealtimeNanos() / 1000, this.c.e.f() / 1000);
            ajlw ajlwVar = this.c.i;
            String str = ((dqxx) this.h.b().b).b;
            float accuracy = location2.getAccuracy();
            int i = (int) eaowVar.b;
            if (ajlwVar.b()) {
                cjqy cjqyVar = ajlwVar.a;
                cjtk[] cjtkVarArr = new cjtk[1];
                cqat cqatVar = ajlwVar.b;
                ddpn a = ajlw.a(str);
                ddps bZ = ddpt.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddpt ddptVar = (ddpt) bZ.b;
                int i2 = ddptVar.a | 1;
                ddptVar.a = i2;
                ddptVar.b = accuracy;
                ddptVar.a = i2 | 2;
                ddptVar.c = i;
                if (a.c) {
                    a.bF();
                    a.c = false;
                }
                ddpz ddpzVar = (ddpz) a.b;
                ddpt bK = bZ.bK();
                ddpz ddpzVar2 = ddpz.f;
                bK.getClass();
                ddpzVar.c = bK;
                ddpzVar.b = 6;
                cjtkVarArr[0] = new ajlv(cqatVar, a, ajlwVar.a.G());
                cjqyVar.u(cjtkVarArr);
            }
        }
        this.a++;
        this.b = dbsg.i(new eapd(this.c.e.b()));
        if (this.c.f()) {
            this.c.h.a(location2, this.g);
        }
        if (this.h.a() && this.a == 1) {
            ((ckco) this.c.c.a(ckgd.q)).a((int) new eaow(new eapd(((dqxx) this.h.b().b).f), this.b.b()).b);
            bvqd.a(this.c.h(this.e, this.h.b(), 4), this.c.b);
        }
        ahwo ahwoVar = this.c.f;
        if (ahwoVar != null) {
            ahwoVar.b();
        }
        dqze dqzeVar = this.d.a;
        if (dqzeVar == null) {
            dqzeVar = dqze.e;
        }
        if (!dqzeVar.a || !this.c.d.getLocationSharingParameters().d) {
            return;
        }
        dcpd<btlu> it = this.e.iterator();
        while (it.hasNext()) {
            bvqd.a(this.c.j.b(it.next(), this.f, this.g, this.h.h(ajmo.a)), this.c.b);
        }
    }
}
