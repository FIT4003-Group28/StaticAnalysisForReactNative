package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbqn  reason: default package */
/* loaded from: classes3.dex */
public final class bbqn extends bbqf {
    private static int c;
    public final Application a;
    public final apt b;
    private final Executor d;
    private final bvjj e;
    private boolean f = false;

    public bbqn(Application application, Executor executor, bvjj bvjjVar) {
        this.a = application;
        this.d = executor;
        this.e = bvjjVar;
        this.b = apt.a(application);
    }

    private final dcdc<cruz> j(dcdc<? extends bbqp> dcdcVar, dwyd dwydVar, boolean z, bbqm bbqmVar) {
        cruf crufVar;
        if (this.e.m(bvjk.fY, false)) {
            crufVar = cruf.PRECHECK_REJECTED_FILE_TOO_BIG;
        } else {
            crufVar = cruf.PRECHECK_ACCEPTED;
        }
        dcen N = dcep.N();
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            bbqp bbqpVar = dcdcVar.get(i);
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = true != z ? "UPLOAD" : "IMPORT";
            int i2 = c;
            c = i2 + 1;
            objArr[1] = Integer.valueOf(i2);
            String format = String.format(locale, "FAKE_%s:%d", objArr);
            N.b(bbqmVar.a(bbqpVar.d(this.a, dwydVar, dcdc.e(), crwb.y), format));
            cruy bZ = cruz.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cruz cruzVar = (cruz) bZ.b;
            format.getClass();
            int i3 = 1 | cruzVar.a;
            cruzVar.a = i3;
            cruzVar.b = format;
            cruzVar.c = crufVar.l;
            cruzVar.a = 2 | i3;
            F.g(bZ.bK());
        }
        if (crufVar == cruf.PRECHECK_ACCEPTED) {
            final dcep f = N.f();
            this.d.execute(new Runnable(this, f) { // from class: bbqi
                private final bbqn a;
                private final Collection b;

                {
                    this.a = this;
                    this.b = f;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final bbqn bbqnVar = this.a;
                    final Collection collection = this.b;
                    new Handler().postDelayed(new Runnable(bbqnVar, collection) { // from class: bbql
                        private final bbqn a;
                        private final Collection b;

                        {
                            this.a = bbqnVar;
                            this.b = collection;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bbqn bbqnVar2 = this.a;
                            Collection<Intent> collection2 = this.b;
                            collection2.size();
                            for (Intent intent : collection2) {
                                bbqnVar2.b.d(intent);
                            }
                        }
                    }, 5000L);
                }
            });
        }
        return F.f();
    }

    private final void k(dwyd dwydVar, dbsg<bbvh> dbsgVar) {
        this.d.execute(new Runnable(this) { // from class: bbqj
            private final bbqn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(this.a.a, "Photo adding is currently faked. Check logs for details.", 0).show();
            }
        });
        dwydVar.name();
        dbsgVar.h(bbqk.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbqf
    public final dcdc<cruz> a(String str, dwyd dwydVar, dbsg<bbvh> dbsgVar, dcdc<bbpw> dcdcVar) {
        dbsk.b(!dcdcVar.isEmpty(), "Upload photo list cannot be empty.");
        dcdcVar.size();
        k(dwydVar, dbsgVar);
        return j(dcdcVar, dwydVar, false, bbqg.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbqf
    public final dcdc<cruz> b(String str, dwyd dwydVar, dbsg<bbvh> dbsgVar, dcdc<bbpy> dcdcVar) {
        dbsk.b(!dcdcVar.isEmpty(), "Import photo list cannot be empty.");
        dcdcVar.size();
        k(dwydVar, dbsgVar);
        final Intent intent = new Intent("geo.uploader.upload_progress_broadcast_action");
        final crtt bZ = crua.o.bZ();
        crtx crtxVar = crtx.IMPORTED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crua cruaVar = (crua) bZ.b;
        cruaVar.e = crtxVar.l;
        cruaVar.a |= 8;
        return j(dcdcVar, dwydVar, true, new bbqm(intent, bZ) { // from class: bbqh
            private final Intent a;
            private final crtt b;

            {
                this.a = intent;
                this.b = bZ;
            }

            @Override // defpackage.bbqm
            public final Intent a(crts crtsVar, String str2) {
                Intent intent2 = this.a;
                crtt crttVar = this.b;
                String str3 = crtsVar.c;
                if ((((crua) crttVar.b).a & 1) == 0) {
                    if (crttVar.c) {
                        crttVar.bF();
                        crttVar.c = false;
                    }
                    crua cruaVar2 = (crua) crttVar.b;
                    str2.getClass();
                    cruaVar2.a |= 1;
                    cruaVar2.b = str2;
                }
                crtu bZ2 = crtv.e.bZ();
                crtx crtxVar2 = crtx.IMPORTED;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                crtv crtvVar = (crtv) bZ2.b;
                crtvVar.b = crtxVar2.l;
                int i = crtvVar.a | 1;
                crtvVar.a = i;
                str3.getClass();
                int i2 = i | 2;
                crtvVar.a = i2;
                crtvVar.c = str3;
                str3.getClass();
                crtvVar.a = i2 | 4;
                crtvVar.d = str3;
                crtv bK = bZ2.bK();
                if (crttVar.c) {
                    crttVar.bF();
                    crttVar.c = false;
                }
                crua cruaVar3 = (crua) crttVar.b;
                bK.getClass();
                cruaVar3.b();
                cruaVar3.g.add(bK);
                return intent2.putExtra("geo.uploader.upload_state_key", crttVar.bK().bS());
            }
        });
    }

    @Override // defpackage.bbqf
    public final boolean c() {
        return this.f;
    }

    @Override // defpackage.bbqf
    public final void d(boolean z) {
        this.f = z;
    }

    @Override // defpackage.bbqf
    public final dbsg<String> e(String str) {
        return dbpy.a;
    }

    @Override // defpackage.bbqf
    public final dbsg<String> f(String str) {
        return dbpy.a;
    }

    @Override // defpackage.bbqf
    public final dbsg<String> g(String str) {
        return dbpy.a;
    }

    @Override // defpackage.bbqf
    public final int h(String str) {
        return 1;
    }
}
