package defpackage;

import android.content.Intent;
import android.util.Base64;
/* compiled from: PG */
/* renamed from: bfxl  reason: default package */
/* loaded from: classes.dex */
public final class bfxl extends afhx {
    public static final dbsl<afga> a = bfxk.a;
    private final gfq b;
    private final dxio<ache> c;
    private final dxio<blpp> d;
    private final dxio<bsvm> e;
    private final dxio<cfrt> i;
    private final dxio<chnm> j;
    private final dxio<cafi> k;
    private final dxio<btvo> l;
    private final dxio<ausy> m;

    public bfxl(Intent intent, @dzsi String str, gfq gfqVar, dxio<ache> dxioVar, dxio<blpp> dxioVar2, dxio<cfrt> dxioVar3, dxio<chnm> dxioVar4, dxio<cafi> dxioVar5, dxio<bsvm> dxioVar6, dxio<btvo> dxioVar7, dxio<ausy> dxioVar8) {
        super(intent, str, afid.RIDDLER_UGC);
        this.d = dxioVar2;
        this.b = gfqVar;
        this.c = dxioVar;
        this.i = dxioVar3;
        this.j = dxioVar4;
        this.k = dxioVar5;
        this.e = dxioVar6;
        this.l = dxioVar7;
        this.m = dxioVar8;
    }

    private final void d(dlil dlilVar, String str) {
        int a2 = dlik.a(dlilVar.e);
        if (a2 != 0 && a2 == 2) {
            if (this.j.a().n()) {
                if (this.i.a().b()) {
                    this.i.a().a();
                }
                this.j.a().k();
                return;
            }
            this.k.a().k(str, dkcp.CONTRIBUTE);
        }
    }

    @Override // defpackage.afhx
    public final void a() {
        String str;
        blpk blpkVar;
        String stringExtra = this.f.getStringExtra("action_type");
        if ("settings_action".equals(stringExtra)) {
            if (!affw.b(this.f)) {
                this.b.c();
            }
            aujb e = this.m.a().e(dpyv.RIDDLER.dm);
            if (e == null) {
                return;
            }
            this.e.a().m(e.w());
        } else if ("feedback_action".equals(stringExtra)) {
            if (!affw.b(this.f)) {
                this.b.c();
            }
            this.c.a().m("place-questions-notification");
        } else if (!this.f.hasExtra("payload")) {
        } else {
            try {
                byte[] byteArrayExtra = this.f.getByteArrayExtra("payload");
                if (byteArrayExtra == null && this.f.getStringExtra("payload") != null) {
                    byteArrayExtra = Base64.decode(this.f.getStringExtra("payload"), 0);
                }
                dlil dlilVar = (dlil) dsqw.cr(dlil.g, byteArrayExtra, dsqa.c());
                if (!affw.b(this.f)) {
                    this.b.c();
                }
                dvyo bZ = dvyp.e.bZ();
                bZ.a(dlilVar.b);
                blvw blvwVar = new blvw(bZ.bK());
                if ((dlilVar.a & 1) != 0) {
                    dlii dliiVar = dlilVar.c;
                    if (dliiVar == null) {
                        dliiVar = dlii.c;
                    }
                    str = dliiVar.a;
                } else {
                    str = null;
                }
                String str2 = str;
                String stringExtra2 = this.f.getStringExtra("obfuscated_gaia_id");
                akqi f = akqi.f(dlilVar.d);
                if (this.f.getIntExtra("notification_id", dpyv.RIDDLER.dm) == dpyv.RIDDLER.dm) {
                    blpkVar = blpk.NOTIFICATION_RIDDLER;
                } else {
                    blpkVar = blpk.NOTIFICATION_RATE_AND_REVIEW;
                }
                blpk blpkVar2 = blpkVar;
                if (!this.l.a().getEnableFeatureParameters().aY) {
                    this.d.a().p(blvwVar, true, str2, f != null, f, stringExtra2, blpkVar2, 2);
                    d(dlilVar, stringExtra2);
                    return;
                }
                d(dlilVar, stringExtra2);
                this.d.a().i(dlilVar.f, this.l.a().getUgcParameters().J(), blpq.NOTIFICATION_ENTRYPOINT);
            } catch (dsrm e2) {
                bvoo.f(new RuntimeException(e2));
            }
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_RIDDLER;
    }
}
