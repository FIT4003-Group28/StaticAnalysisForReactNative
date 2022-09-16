package defpackage;

import android.app.Activity;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: svb  reason: default package */
/* loaded from: classes7.dex */
public final class svb implements sus {
    public deig<sur> a;
    private final Executor b;
    private final btpc c;
    private final dxio<dbsg<arkd>> d;
    private final dbsg<arkb> e;
    private final byyp f;
    private boolean g = false;
    private final dbsg<amub> h;
    private final boolean i;

    public svb(Activity activity, Executor executor, btpc btpcVar, dxio<dbsg<arkd>> dxioVar, dbsg<arkb> dbsgVar, byyp byypVar, suu suuVar, tlv tlvVar, amve amveVar) {
        this.b = executor;
        this.c = btpcVar;
        this.d = dxioVar;
        this.e = dbsgVar;
        this.f = byypVar;
        this.i = suuVar.b(tlvVar, amveVar);
        this.h = tlvVar.A(amveVar, activity);
    }

    private final synchronized void d() {
        this.g = true;
        this.a = deig.d();
        if (a() && this.h.a()) {
            amub b = this.h.b();
            if (!this.e.a()) {
                return;
            }
            amuo[] amuoVarArr = b.k;
            deha.q(this.e.b().c(), new sva(this), this.b);
            return;
        }
        this.a.j(sur.INVALID_ROUTE);
    }

    @Override // defpackage.sus
    public final boolean a() {
        if (!this.h.a()) {
            return false;
        }
        amub b = this.h.b();
        return b.h == dqvj.WALK && b.D <= 15000 && this.i;
    }

    @Override // defpackage.sus
    public final dehn<sur> b() {
        if (!this.g) {
            d();
        }
        deig<sur> deigVar = this.a;
        dbsk.s(deigVar);
        return deigVar;
    }

    @Override // defpackage.sus
    public final sur c() {
        if (!this.d.a().a()) {
            return sur.SERVICE_UNAVAILABLE;
        }
        if (!a()) {
            return sur.INVALID_ROUTE;
        }
        if (!this.c.i()) {
            return sur.DEVICE_OFFLINE;
        }
        deig<sur> deigVar = this.a;
        if (deigVar != null && deigVar.isDone()) {
            try {
                deig<sur> deigVar2 = this.a;
                dbsk.s(deigVar2);
                sur surVar = (sur) deha.r(deigVar2);
                if (surVar != sur.SERVICE_ONLINE) {
                    return surVar;
                }
            } catch (ExecutionException unused) {
                return sur.SERVICE_UNAVAILABLE;
            }
        }
        this.f.f(bzdd.d);
        arke c = arkf.c();
        ((arkg) c).a = this.h.b();
        this.d.a().b().a(c.a());
        return sur.SERVICE_ONLINE;
    }
}
