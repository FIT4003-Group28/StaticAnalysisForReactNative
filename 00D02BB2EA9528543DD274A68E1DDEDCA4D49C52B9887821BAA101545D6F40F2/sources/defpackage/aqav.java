package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.Lighter;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: aqav  reason: default package */
/* loaded from: classes2.dex */
public final class aqav {
    private static final dcqe c = dcqe.c("aqav");
    public final Lighter a;
    public final cuio b;
    private final cumt d;

    public aqav(Context context, aqak aqakVar, dxio<aqan> dxioVar, dxio<aqao> dxioVar2, final dxio<aqgv> dxioVar3, final btvo btvoVar, bvkx bvkxVar, Executor executor, dxio<akfa> dxioVar4, dxio<CronetEngine> dxioVar5, dxio<bufr> dxioVar6, final dxio<dela> dxioVar7) {
        csuo csuoVar;
        if (btlu.n(dxioVar4.a().j())) {
            bvoo.h("Lighter instance should not be created in Incognito mode", new Object[0]);
        }
        CronetEngine a = dxioVar5.a();
        cumt c2 = cumt.c();
        this.d = c2;
        String valueOf = String.valueOf(bvog.b(context, false));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append(valueOf);
        sb.append("/messaging/photos");
        cuio c3 = cuio.c(sb.toString(), new cukq());
        this.b = c3;
        cuin cuinVar = null;
        aqan a2 = btvoVar.getBusinessMessagingParameters().y ? dxioVar.a() : null;
        if (btvoVar.getBusinessMessagingParameters().D) {
            csuoVar = new csuo(dxioVar3) { // from class: aqar
                private final dxio a;

                {
                    this.a = dxioVar3;
                }

                @Override // defpackage.csuo
                public final String a() {
                    return ((aqgv) this.a.a()).c();
                }
            };
        } else {
            csuoVar = dxioVar7.a() == null ? aqas.a : new csuo(dxioVar7) { // from class: aqat
                private final dxio a;

                {
                    this.a = dxioVar7;
                }

                @Override // defpackage.csuo
                public final String a() {
                    return dbsj.e(FirebaseInstanceId.getInstance((dela) this.a.a()).g("466216207879", "FCM"));
                }
            };
        }
        this.a = Lighter.a(a2, context, csuoVar, dxioVar2.a(), new aqap(new aqau(context)), aqakVar, dxioVar6.a().a() ? new cuin(a) : cuinVar, new csst(c2, c3), new HashMap());
        bvkxVar.k(new Runnable(btvoVar, dxioVar3) { // from class: aqaq
            private final btvo a;
            private final dxio b;

            {
                this.a = btvoVar;
                this.b = dxioVar3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btvo btvoVar2 = this.a;
                dxio dxioVar8 = this.b;
                dkhl dkhlVar = btvoVar2.getBusinessMessagingParameters().G;
                if (dkhlVar == null) {
                    dkhlVar = dkhl.e;
                }
                if (!dkhlVar.c) {
                    ((aqgv) dxioVar8.a()).a();
                }
            }
        }, executor, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    public final csui a() {
        return this.a.j;
    }

    public final csuu b() {
        return this.a.d;
    }

    public final csuk c() {
        return this.a.e;
    }

    public final csug d() {
        return this.a.f;
    }

    public final csum e() {
        return this.a.i;
    }

    public final csuf f() {
        return this.a.g;
    }

    public final csuz g() {
        return this.a.l;
    }

    public final cuiv h() {
        return this.b.b;
    }

    public final ctxo i() {
        return this.a.b;
    }

    public final void j() {
        final Lighter lighter = this.a;
        deew.h(cswe.b(cswe.a(lighter.c).ao, cstu.b().a), new dbrn(lighter) { // from class: cssq
            private final Lighter a;

            {
                this.a = lighter;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Lighter lighter2 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    ctog ctogVar = lighter2.b;
                    ctxm r = ctxn.r();
                    r.g(10022);
                    ctogVar.b(r.a());
                    ctss ctssVar = lighter2.a;
                    cstl.a("Backend");
                    dyeu dyeuVar = ctssVar.d.c;
                    if (!(dyeuVar instanceof dyhi)) {
                        return null;
                    }
                    ((dyhi) dyeuVar).c(true);
                    return null;
                }
                return null;
            }
        }, dege.a);
    }

    public final ctcu k() {
        return this.a.n;
    }

    public final void l() {
    }
}
