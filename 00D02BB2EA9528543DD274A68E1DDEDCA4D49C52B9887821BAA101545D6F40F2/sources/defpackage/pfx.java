package defpackage;

import android.app.Application;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pfx  reason: default package */
/* loaded from: classes.dex */
public final class pfx implements pez {
    private static final long k = TimeUnit.MINUTES.toMillis(5);
    public final Application a;
    public final cqat b;
    public final btmv c;
    public final btrm d;
    public final dxio<akfa> e;
    public final pft f;
    @dzsi
    public cmva g;
    @dzsi
    public String h;
    public final pfw i = new pfw(this);
    public final cnyf j = new pfv(this);
    private final btmk l;
    @dzsi
    private cmuw m;

    public pfx(Application application, dxio<akfa> dxioVar, btrm btrmVar, cqat cqatVar, btmv btmvVar, btml btmlVar) {
        this.a = application;
        this.e = dxioVar;
        this.d = btrmVar;
        this.b = cqatVar;
        this.c = btmvVar;
        this.l = btmlVar.a(ckip.X);
        this.f = new pft(cqatVar);
    }

    public static ContextDataFilterImpl c(long j) {
        cnye cnyeVar = new cnye();
        cnym cnymVar = new cnym();
        cnymVar.b(j);
        cnymVar.a = new int[]{1};
        cnyeVar.a(1, cnymVar.a());
        return cnyeVar.b();
    }

    @Override // defpackage.pez
    public final synchronized dnwj a(long j, long j2) {
        dnwg bZ;
        List<dnwi> a = this.f.a(j, j2);
        if (a.isEmpty()) {
            this.l.b();
        } else {
            this.l.a();
        }
        bZ = dnwj.b.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnwj dnwjVar = (dnwj) bZ.b;
        dsrj<dnwi> dsrjVar = dnwjVar.a;
        if (!dsrjVar.a()) {
            dnwjVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(a, dnwjVar.a);
        return bZ.bK();
    }

    public final void b() {
        if (this.h == null) {
            this.m = null;
            return;
        }
        Application application = this.a;
        this.m = cmuy.b(application, cmuz.a(application.getPackageName(), this.e.a().m()));
        ContextDataFilterImpl c = c(this.b.b() - k);
        cmuw cmuwVar = this.m;
        if (cmuwVar == null) {
            return;
        }
        cnwb.b(cnyj.c(cmuwVar.i, c), new cmvb()).m(new cpcf(this) { // from class: pfu
            private final pfx a;

            {
                this.a = this;
            }

            @Override // defpackage.cpcf
            public final void a(cpcq cpcqVar) {
                pfx pfxVar = this.a;
                if (!cpcqVar.b()) {
                    cpcqVar.e();
                    return;
                }
                cnyc b = ((cnyk) ((cmvb) cpcqVar.d()).a).b();
                if (b == null) {
                    return;
                }
                for (int i = 0; i < b.c(); i++) {
                    try {
                        pfxVar.f.d(b.e(i));
                    } finally {
                        b.b();
                    }
                }
            }
        });
    }
}
