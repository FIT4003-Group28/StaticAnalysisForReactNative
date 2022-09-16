package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvmg  reason: default package */
/* loaded from: classes4.dex */
public final class bvmg implements bvmi {
    static final long a = TimeUnit.DAYS.toMillis(1);
    final TelephonyManager b;
    public final bvmh c;
    public final ConcurrentHashMap<bvmf, Boolean> d = new ConcurrentHashMap<>();
    public bvmj e;
    private final cqat f;
    private final bwrg<bvmm> g;
    private final bvkx h;
    private final Executor i;

    public bvmg(Context context, cqat cqatVar, bwrh<bvmm> bwrhVar, bvmh bvmhVar, bvkx bvkxVar, dehq dehqVar) {
        this.f = cqatVar;
        this.h = bvkxVar;
        this.i = dehqVar;
        this.c = bvmhVar;
        bwrg<bvmm> a2 = bwrhVar.a((dssr) bvmm.e.cu(7), bwre.PERSISTENT_FILE, "telephony_file_key");
        this.g = a2;
        this.e = bvmm.e.bZ();
        a2.h(new dbsz(this) { // from class: bvma
            private final bvmg a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                bvmg bvmgVar = this.a;
                bvmm bvmmVar = (bvmm) obj;
                if (bvmmVar != null) {
                    bvmgVar.e = bvmm.e.ca(bvmmVar);
                }
            }
        });
        this.b = (TelephonyManager) context.getSystemService("phone");
    }

    private final String f(bvml bvmlVar, bvmf bvmfVar, Runnable runnable) {
        if (bvmlVar == null || (bvmlVar.a & 1) == 0 || bvmlVar.b.isEmpty()) {
            return "";
        }
        g(bvmlVar, bvmfVar, runnable);
        return bvmlVar.b;
    }

    private final synchronized void g(bvml bvmlVar, final bvmf bvmfVar, final Runnable runnable) {
        Boolean bool = this.d.get(bvmfVar);
        if (bvmlVar.c + a >= this.f.b() || (bool != null && bool.booleanValue())) {
            return;
        }
        this.h.k(new Runnable(this, runnable, bvmfVar) { // from class: bvme
            private final bvmg a;
            private final Runnable b;
            private final bvmf c;

            {
                this.a = this;
                this.b = runnable;
                this.c = bvmfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvmg bvmgVar = this.a;
                Runnable runnable2 = this.b;
                bvmf bvmfVar2 = this.c;
                runnable2.run();
                bvmgVar.d.put(bvmfVar2, false);
            }
        }, this.i, bvkw.ON_STARTUP_FULLY_COMPLETE);
        this.d.put(bvmfVar, true);
    }

    @Override // defpackage.bvmi
    public final String a() {
        bvml bvmlVar = ((bvmm) this.e.b).b;
        if (bvmlVar == null) {
            bvmlVar = bvml.d;
        }
        Runnable runnable = new Runnable(this) { // from class: bvmb
            private final bvmg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvmg bvmgVar = this.a;
                String simCountryIso = bvmgVar.b.getSimCountryIso();
                bvmj bvmjVar = bvmgVar.e;
                bvml d = bvmgVar.d(simCountryIso);
                if (bvmjVar.c) {
                    bvmjVar.bF();
                    bvmjVar.c = false;
                }
                bvmm bvmmVar = (bvmm) bvmjVar.b;
                bvmm bvmmVar2 = bvmm.e;
                d.getClass();
                bvmmVar.b = d;
                bvmmVar.a |= 1;
                bvmgVar.c.b(bvmf.SIM_COUNTRY_KEY);
                bvmgVar.e();
            }
        };
        String f = f(bvmlVar, bvmf.SIM_COUNTRY_KEY, runnable);
        if (!f.isEmpty()) {
            this.c.a(bvmf.SIM_COUNTRY_KEY);
            return f;
        }
        runnable.run();
        bvml bvmlVar2 = ((bvmm) this.e.b).b;
        if (bvmlVar2 == null) {
            bvmlVar2 = bvml.d;
        }
        return bvmlVar2.b;
    }

    @Override // defpackage.bvmi
    public final String b() {
        bvml bvmlVar = ((bvmm) this.e.b).c;
        if (bvmlVar == null) {
            bvmlVar = bvml.d;
        }
        Runnable runnable = new Runnable(this) { // from class: bvmc
            private final bvmg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvmg bvmgVar = this.a;
                String networkCountryIso = bvmgVar.b.getNetworkCountryIso();
                bvmj bvmjVar = bvmgVar.e;
                bvml d = bvmgVar.d(networkCountryIso);
                if (bvmjVar.c) {
                    bvmjVar.bF();
                    bvmjVar.c = false;
                }
                bvmm bvmmVar = (bvmm) bvmjVar.b;
                bvmm bvmmVar2 = bvmm.e;
                d.getClass();
                bvmmVar.c = d;
                bvmmVar.a |= 2;
                bvmgVar.c.b(bvmf.NETWORK_COUNTRY_KEY);
                bvmgVar.e();
            }
        };
        String f = f(bvmlVar, bvmf.NETWORK_COUNTRY_KEY, runnable);
        if (!f.isEmpty()) {
            this.c.a(bvmf.NETWORK_COUNTRY_KEY);
            return f;
        }
        runnable.run();
        bvml bvmlVar2 = ((bvmm) this.e.b).c;
        if (bvmlVar2 == null) {
            bvmlVar2 = bvml.d;
        }
        return bvmlVar2.b;
    }

    @Override // defpackage.bvmi
    public final int c() {
        bvml bvmlVar = ((bvmm) this.e.b).d;
        if (bvmlVar == null) {
            bvmlVar = bvml.d;
        }
        Runnable runnable = new Runnable(this) { // from class: bvmd
            private final bvmg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvmg bvmgVar = this.a;
                String valueOf = String.valueOf(bvmgVar.b.getPhoneType());
                bvmj bvmjVar = bvmgVar.e;
                bvml d = bvmgVar.d(valueOf);
                if (bvmjVar.c) {
                    bvmjVar.bF();
                    bvmjVar.c = false;
                }
                bvmm bvmmVar = (bvmm) bvmjVar.b;
                bvmm bvmmVar2 = bvmm.e;
                d.getClass();
                bvmmVar.d = d;
                bvmmVar.a |= 4;
                bvmgVar.c.b(bvmf.PHONE_TYPE_KEY);
                bvmgVar.e();
            }
        };
        String f = f(bvmlVar, bvmf.PHONE_TYPE_KEY, runnable);
        if (!f.isEmpty()) {
            this.c.a(bvmf.PHONE_TYPE_KEY);
            return Integer.parseInt(f);
        }
        runnable.run();
        bvml bvmlVar2 = ((bvmm) this.e.b).d;
        if (bvmlVar2 == null) {
            bvmlVar2 = bvml.d;
        }
        return Integer.parseInt(bvmlVar2.b);
    }

    public final bvml d(String str) {
        bvmk bZ = bvml.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvml bvmlVar = (bvml) bZ.b;
        str.getClass();
        bvmlVar.a |= 1;
        bvmlVar.b = str;
        long b = this.f.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvml bvmlVar2 = (bvml) bZ.b;
        bvmlVar2.a |= 2;
        bvmlVar2.c = b;
        return bZ.bK();
    }

    public final void e() {
        this.g.e(this.e.bK());
    }
}
