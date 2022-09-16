package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rha  reason: default package */
/* loaded from: classes4.dex */
public final class rha extends rhc {
    private final rlx a;
    private final rng b;

    public rha(rlx rlxVar) {
        qnm.b(rlxVar);
        this.a = rlxVar;
        this.b = rlxVar.l();
    }

    @Override // defpackage.rnh
    public final int a(String str) {
        this.b.W(str);
        return 25;
    }

    @Override // defpackage.rnh
    public final long b() {
        return this.a.q().r();
    }

    @Override // defpackage.rnh
    public final String c() {
        return this.b.e();
    }

    @Override // defpackage.rnh
    public final String d() {
        return this.b.f();
    }

    @Override // defpackage.rnh
    public final String e() {
        return this.b.o();
    }

    @Override // defpackage.rnh
    public final String f() {
        return this.b.e();
    }

    @Override // defpackage.rnh
    public final List g(String str, String str2) {
        rng rngVar = this.b;
        if (rngVar.aH().i()) {
            rngVar.aG().c.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        rngVar.P();
        if (rjm.a()) {
            rngVar.aG().c.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        rngVar.w.aH().a(atomicReference, 5000L, "get conditional user properties", new rmx(rngVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return rps.C(list);
        }
        rngVar.aG().c.b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    @Override // defpackage.rnh
    public final Map h(String str, String str2, boolean z) {
        rng rngVar = this.b;
        if (rngVar.aH().i()) {
            rngVar.aG().c.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        rngVar.P();
        if (rjm.a()) {
            rngVar.aG().c.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        rngVar.w.aH().a(atomicReference, 5000L, "get user properties", new rmy(rngVar, atomicReference, str, str2, z));
        List<UserAttributeParcel> list = (List) atomicReference.get();
        if (list == null) {
            rngVar.aG().c.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        afw afwVar = new afw(list.size());
        for (UserAttributeParcel userAttributeParcel : list) {
            Object a = userAttributeParcel.a();
            if (a != null) {
                afwVar.put(userAttributeParcel.b, a);
            }
        }
        return afwVar;
    }

    @Override // defpackage.rnh
    public final void i(String str) {
        riu b = this.a.b();
        qyh qyhVar = this.a.y;
        b.a(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.rnh
    public final void j(String str, String str2, Bundle bundle) {
        this.a.l().q(str, str2, bundle);
    }

    @Override // defpackage.rnh
    public final void k(String str) {
        riu b = this.a.b();
        qyh qyhVar = this.a.y;
        b.b(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.rnh
    public final void l(String str, String str2, Bundle bundle) {
        this.b.s(str, str2, bundle);
    }

    @Override // defpackage.rnh
    public final void m(Bundle bundle) {
        rng rngVar = this.b;
        rngVar.Q();
        rngVar.B(bundle, System.currentTimeMillis());
    }
}
