package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: btwm  reason: default package */
/* loaded from: classes.dex */
public final class btwm {
    public final cqat a;
    public final dxio<ckcw> b;
    private final bwrg<btyu> c;
    private final bwrg<btyu> d;
    private final Executor e;
    private final affr f;

    public btwm(Context context, cqat cqatVar, dxio<ckcw> dxioVar, Executor executor, affr affrVar) {
        bwrg<btyu> bwrgVar = new bwrg<>((dssr) btyu.f.cu(7), context, bwre.PERSISTENT_FILE, "SavedClientParameters.data", executor);
        bwrg<btyu> bwrgVar2 = new bwrg<>((dssr) btyu.f.cu(7), context, bwre.PERSISTENT_FILE, "ISavedClientParameters.data", executor);
        this.a = cqatVar;
        this.c = bwrgVar;
        this.b = dxioVar;
        this.e = executor;
        this.f = affrVar;
        this.d = bwrgVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized btyu a() {
        btyu btyuVar;
        bwrf<btyu> i = this.c.i();
        btyuVar = i.a;
        if (btyuVar == null) {
            btyuVar = null;
        } else if (!i.b) {
            dsqp dsqpVar = (dsqp) btyuVar.cu(5);
            dsqpVar.bC(btyuVar);
            btyt btytVar = (btyt) dsqpVar;
            dund dundVar = ((btyu) btytVar.b).e;
            if (dundVar == null) {
                dundVar = dund.c;
            }
            dsqp dsqpVar2 = (dsqp) dundVar.cu(5);
            dsqpVar2.bC(dundVar);
            dunc duncVar = (dunc) dsqpVar2;
            if (duncVar.c) {
                duncVar.bF();
                duncVar.c = false;
            }
            ((dund) duncVar.b).a = dund.ck();
            dund dundVar2 = btyuVar.e;
            if (dundVar2 == null) {
                dundVar2 = dund.c;
            }
            int size = dundVar2.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                dund dundVar3 = btyuVar.e;
                if (dundVar3 == null) {
                    dundVar3 = dund.c;
                }
                dvgo dvgoVar = dundVar3.a.get(i2);
                dsqp dsqpVar3 = (dsqp) dvgoVar.cu(5);
                dsqpVar3.bC(dvgoVar);
                dvgl dvglVar = (dvgl) dsqpVar3;
                if (dvglVar.c) {
                    dvglVar.bF();
                    dvglVar.c = false;
                }
                dvgo dvgoVar2 = (dvgo) dvglVar.b;
                dvgo dvgoVar3 = dvgo.bZ;
                dvgoVar2.a &= -3;
                dvgoVar2.c = 0L;
                dvgo bK = dvglVar.bK();
                if (duncVar.c) {
                    duncVar.bF();
                    duncVar.c = false;
                }
                dund dundVar4 = (dund) duncVar.b;
                bK.getClass();
                dundVar4.c();
                dundVar4.a.add(bK);
            }
            dund bK2 = duncVar.bK();
            if (btytVar.c) {
                btytVar.bF();
                btytVar.c = false;
            }
            btyu btyuVar2 = (btyu) btytVar.b;
            bK2.getClass();
            btyuVar2.e = bK2;
            int i3 = btyuVar2.a | 8;
            btyuVar2.a = i3;
            btyuVar2.a = i3 & (-5);
            btyuVar2.d = 0L;
            btyuVar = btytVar.bK();
        }
        this.e.execute(new btwl(this, i, btyuVar));
        return btyuVar;
    }

    final synchronized boolean b(@dzsi String str, Locale locale, long j, dund dundVar, bwrg<btyu> bwrgVar) {
        btyt bZ;
        bZ = btyu.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btyu btyuVar = (btyu) bZ.b;
        dundVar.getClass();
        btyuVar.e = dundVar;
        btyuVar.a |= 8;
        String e = dbsj.e(str);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btyu btyuVar2 = (btyu) bZ.b;
        e.getClass();
        btyuVar2.a |= 1;
        btyuVar2.b = e;
        String locale2 = locale.toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btyu btyuVar3 = (btyu) bZ.b;
        locale2.getClass();
        int i = btyuVar3.a | 2;
        btyuVar3.a = i;
        btyuVar3.c = locale2;
        btyuVar3.a = i | 4;
        btyuVar3.d = j;
        return bwrgVar.f(bZ.bK());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long c() {
        dbsk.l(!this.f.c());
        return this.d.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean d() {
        dbsk.l(!this.f.c());
        return this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized btyu e() {
        dbsk.l(!this.f.c());
        btyu btyuVar = this.d.i().a;
        if (btyuVar == null) {
            return null;
        }
        return btyuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean f() {
        dbsk.l(!this.f.c());
        return this.d.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(@dzsi String str, Locale locale, long j, dund dundVar) {
        b(str, locale, j, dundVar, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean h(Locale locale, long j, dund dundVar) {
        return b(null, locale, j, dundVar, this.d);
    }
}
