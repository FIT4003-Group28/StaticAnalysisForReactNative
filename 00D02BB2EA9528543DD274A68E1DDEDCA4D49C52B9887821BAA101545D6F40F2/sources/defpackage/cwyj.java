package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwyj  reason: default package */
/* loaded from: classes5.dex */
public final class cwyj extends cwyp implements cwqx, cwwr {
    private final Application a;
    private final cwrb b;
    private final cwyg c;
    private final Map<cwyi, cwyl> d = new HashMap();
    private final dbty<Integer> e;
    private final cwwo f;
    private final boolean g;
    private final dzsj<cwyl> h;

    public cwyj(cwwp cwwpVar, Context context, cwrb cwrbVar, dxio<cwyo> dxioVar, dbsg<dzsj<Boolean>> dbsgVar, dzsj<cwyl> dzsjVar, dzsj<cxfg> dzsjVar2, Executor executor) {
        dbsk.l(Build.VERSION.SDK_INT >= 24);
        this.f = cwwpVar.a(executor, dxioVar, dzsjVar2);
        this.a = (Application) context;
        this.b = cwrbVar;
        boolean booleanValue = dbsgVar.c(cwyc.a).a().booleanValue();
        this.g = booleanValue;
        this.h = dzsjVar;
        this.e = dbud.a(new dbty(this) { // from class: cwyd
            private final cwyj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.e();
            }
        });
        cwyg cwygVar = new cwyg(new cwye(this), new cwyf(this), booleanValue);
        this.c = cwygVar;
        cwrbVar.a(cwygVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(cwyi cwyiVar) {
        if (!this.f.a()) {
            return;
        }
        synchronized (this.d) {
            if (this.d.containsKey(cwyiVar)) {
                return;
            }
            if (this.d.size() >= 25) {
                return;
            }
            this.d.put(cwyiVar, this.h.a());
            if (this.d.size() == 1 && !this.g) {
                this.c.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dehn<Void> m(cwyi cwyiVar, boolean z, @dzsi dzze dzzeVar) {
        cwyl remove;
        if (!this.f.b()) {
            return dehk.a;
        }
        synchronized (this.d) {
            remove = this.d.remove(cwyiVar);
            if (this.d.isEmpty() && !this.g) {
                this.c.d();
            }
        }
        if (remove == null) {
            return dehk.a;
        }
        if (remove.f == 0) {
            return dehk.a;
        }
        eacc bZ = eacd.u.bZ();
        int elapsedRealtime = ((int) (SystemClock.elapsedRealtime() - remove.c)) + 1;
        eabk bZ2 = eabl.k.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eabl eablVar = (eabl) bZ2.b;
        int i = eablVar.a | 16;
        eablVar.a = i;
        eablVar.f = elapsedRealtime;
        int i2 = remove.e;
        int i3 = i | 1;
        eablVar.a = i3;
        eablVar.b = i2;
        int i4 = remove.f;
        int i5 = i3 | 2;
        eablVar.a = i5;
        eablVar.c = i4;
        int i6 = remove.g;
        int i7 = i5 | 4;
        eablVar.a = i7;
        eablVar.d = i6;
        int i8 = remove.i;
        int i9 = i7 | 32;
        eablVar.a = i9;
        eablVar.g = i8;
        int i10 = remove.j;
        int i11 = i9 | 64;
        eablVar.a = i11;
        eablVar.h = i10;
        int i12 = remove.h;
        eablVar.a = i11 | 8;
        eablVar.e = i12;
        for (int i13 = 0; i13 < 28; i13++) {
            if (remove.d[i13] > 0) {
                eabi bZ3 = eabj.e.bZ();
                int i14 = remove.d[i13];
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                eabj eabjVar = (eabj) bZ3.b;
                eabjVar.a |= 1;
                eabjVar.b = i14;
                int i15 = cwyl.a[i13];
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                eabj eabjVar2 = (eabj) bZ3.b;
                eabjVar2.a |= 2;
                eabjVar2.c = i15;
                int i16 = i13 + 1;
                if (i16 < 28) {
                    int i17 = cwyl.a[i16] - 1;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    eabj eabjVar3 = (eabj) bZ3.b;
                    eabjVar3.a |= 4;
                    eabjVar3.d = i17;
                }
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eabl eablVar2 = (eabl) bZ2.b;
                eabj bK = bZ3.bK();
                bK.getClass();
                dsrj<eabj> dsrjVar = eablVar2.i;
                if (!dsrjVar.a()) {
                    eablVar2.i = dsqw.cl(dsrjVar);
                }
                eablVar2.i.add(bK);
            }
        }
        eabl bK2 = bZ2.bK();
        dsqp dsqpVar = (dsqp) bK2.cu(5);
        dsqpVar.bC(bK2);
        eabk eabkVar = (eabk) dsqpVar;
        int a = cwyb.a(this.a);
        if (eabkVar.c) {
            eabkVar.bF();
            eabkVar.c = false;
        }
        eabl eablVar3 = (eabl) eabkVar.b;
        eablVar3.a |= 128;
        eablVar3.j = a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eacd eacdVar = (eacd) bZ.b;
        eabl bK3 = eabkVar.bK();
        bK3.getClass();
        eacdVar.l = bK3;
        eacdVar.a |= 2048;
        cwwi f = cwwj.f();
        f.b(z);
        f.c(bZ.bK());
        cwwf cwwfVar = (cwwf) f;
        cwwfVar.b = dzzeVar;
        cwxy cwxyVar = (cwxy) cwyiVar;
        Activity activity = cwxyVar.b;
        if (activity != null) {
            cwwfVar.c = activity.getClass().getName();
        } else {
            String str = cwxyVar.a;
            if (str != null) {
                cwwfVar.a = str;
            }
        }
        return this.f.c(f.a());
    }

    @Override // defpackage.cwud
    public void Sz() {
        this.b.b(this.c);
        this.c.e();
        synchronized (this.d) {
            this.d.clear();
        }
    }

    @Override // defpackage.cwyp
    public void a(String str) {
        l(cwyi.c(str));
    }

    @Override // defpackage.cwqx
    public void b(Activity activity) {
        synchronized (this.d) {
            this.d.clear();
        }
    }

    @Override // defpackage.cwyp
    public dehn<Void> c(String str, boolean z, @dzsi dzze dzzeVar) {
        return m(cwyi.c(str), z, dzzeVar);
    }

    @Override // defpackage.cwyp
    public void d(String str) {
        synchronized (this.d) {
            this.d.remove(cwyi.c(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Integer e() {
        Application application = this.a;
        if (cwyb.a == 0) {
            synchronized (cwyb.class) {
                if (cwyb.a == 0) {
                    int a = cwyb.a(application);
                    if (a <= 0) {
                        a = 60;
                    }
                    double d = a;
                    Double.isNaN(d);
                    cwyb.a = (int) Math.ceil(1000.0d / d);
                }
            }
        }
        return Integer.valueOf(cwyb.a);
    }

    @Override // defpackage.cwwr
    public void g() {
    }
}
