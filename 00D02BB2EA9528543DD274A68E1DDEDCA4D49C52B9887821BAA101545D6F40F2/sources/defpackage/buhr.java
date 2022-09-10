package defpackage;

import com.google.android.apps.gmm.location.model.DeviceLocation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: buhr  reason: default package */
/* loaded from: classes4.dex */
public final class buhr implements buae<List<ahnc>> {
    public deig<buab<List<ahnc>>> a;
    DeviceLocation b;
    public volatile ahmv c;
    public volatile ahnc d;
    public final ahnc e;
    final cqat f;
    public final btrm g;
    public final AtomicBoolean h;

    public buhr(buhr buhrVar, ahnc ahncVar) {
        this.h = new AtomicBoolean(false);
        this.f = buhrVar.f;
        this.g = buhrVar.g;
        this.e = ahncVar;
    }

    private final void e() {
        if (!this.h.getAndSet(true)) {
            btrm btrmVar = this.g;
            dceq a = dcet.a();
            a.b(ahmo.class, new buhs(0, ahmo.class, this));
            a.b(ahmw.class, new buhs(1, ahmw.class, this));
            a.b(ahmu.class, new buhs(2, ahmu.class, this));
            btrmVar.g(this, a.a());
        }
    }

    private static void f(List<ahnc> list, ahnc ahncVar) {
        if (ahncVar != null) {
            list.add(ahncVar);
        }
    }

    @Override // defpackage.buae
    public final dehn<buab<List<ahnc>>> a() {
        e();
        synchronized (this) {
            buab<List<ahnc>> c = c();
            if (c != null) {
                return deha.a(c);
            }
            deig<buab<List<ahnc>>> deigVar = this.a;
            if (deigVar == null) {
                deig<buab<List<ahnc>>> d = deig.d();
                this.a = d;
                return deha.o(d);
            }
            return deha.o(deigVar);
        }
    }

    public final buab<List<ahnc>> b() {
        DeviceLocation deviceLocation;
        e();
        synchronized (this) {
            deviceLocation = this.b;
        }
        ArrayList arrayList = new ArrayList(4);
        f(arrayList, deviceLocation);
        f(arrayList, this.c);
        f(arrayList, this.d);
        f(arrayList, this.e);
        if (arrayList.isEmpty()) {
            return null;
        }
        return buab.c("X-Geo", arrayList);
    }

    public final buab<List<ahnc>> c() {
        DeviceLocation deviceLocation = this.b;
        if (deviceLocation == null || ahnb.a(deviceLocation, this.f)) {
            return null;
        }
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized DeviceLocation d() {
        return this.b;
    }

    public buhr(cqat cqatVar, btrm btrmVar) {
        this.h = new AtomicBoolean(false);
        this.f = cqatVar;
        this.g = btrmVar;
        this.e = null;
    }
}
