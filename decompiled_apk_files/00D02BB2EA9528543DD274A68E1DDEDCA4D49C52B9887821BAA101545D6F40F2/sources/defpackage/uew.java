package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: uew  reason: default package */
/* loaded from: classes7.dex */
public final class uew {
    public ArrayList<vpa> a;
    private final crzo<uff> b;

    public uew(dcdc<amvh> dcdcVar) {
        this.a = n(dcdcVar);
        this.b = new crzo<>(uff.e(dcdcVar, true, true, m(dcdcVar)));
    }

    private static dbsg<Integer> m(dcdc<amvh> dcdcVar) {
        int n = dcft.n(dcdcVar, ues.a);
        return n == -1 ? dbpy.a : dbsg.i(Integer.valueOf(n));
    }

    private static ArrayList<vpa> n(dcdc<amvh> dcdcVar) {
        return new ArrayList<>(dcbg.b(dcdcVar).s(uev.a).z());
    }

    public final void a(Bundle bundle) {
        if (bundle.containsKey("WaypointsStore.waypoints")) {
            ArrayList<vpa> arrayList = (ArrayList) bundle.getSerializable("WaypointsStore.waypoints");
            if (arrayList != null) {
                this.a = arrayList;
            }
            k(false);
        }
    }

    public final void b(Bundle bundle) {
        bundle.putSerializable("WaypointsStore.waypoints", this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crzm<uff> c() {
        return this.b.a;
    }

    public final void d(amvh amvhVar, @dzsi amvh amvhVar2, int i, boolean z) {
        if (l(i)) {
            if (amvhVar2 == null || amvhVar2.a()) {
                this.a.set(i, new vpa(amvhVar, amvh.a));
            } else {
                this.a.set(i, new vpa(amvhVar2, amvhVar));
                this.a.get(i).d();
            }
            k(z);
        }
    }

    public final void e(amvh amvhVar, int i, boolean z) {
        if (l(i) || i == f()) {
            this.a.add(i, new vpa(amvhVar, amvh.a));
            k(z);
        }
    }

    public final int f() {
        return this.a.size();
    }

    public final boolean g() {
        return f() < 10;
    }

    public final dbsg<Integer> h() {
        return m(j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(dcdc<amvh> dcdcVar, boolean z) {
        this.a = n(dcdcVar);
        k(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcdc<amvh> j() {
        return dcbg.b(this.a).s(ueu.a).z();
    }

    public final void k(boolean z) {
        this.b.b(uff.e(j(), g(), z, h()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l(int i) {
        return i >= 0 && i <= this.a.size() + (-1);
    }
}
