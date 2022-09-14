package com.teslamotors.plugins.ble.a;

import com.teslamotors.a.a;
import com.teslamotors.plugins.ble.b.h;
import java.util.LinkedList;
/* compiled from: VehicleInfo.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private a.aq f5191a = null;

    /* renamed from: b  reason: collision with root package name */
    private double f5192b = 0.0d;

    public void a(a.aq aqVar) {
        this.f5191a = aqVar;
    }

    public void a(double d2) {
        this.f5192b = d2;
    }

    public double a() {
        return this.f5192b;
    }

    public static String b(a.aq aqVar) {
        if (aqVar == null) {
            return "unknown";
        }
        LinkedList linkedList = new LinkedList();
        a.ap f = aqVar.f();
        if (f != null) {
            if (f == a.ap.VEHICLELOCKSTATE_LOCKED || f == a.ap.VEHICLELOCKSTATE_INTERNAL_LOCKED) {
                linkedList.add("locked");
            } else if (f == a.ap.VEHICLELOCKSTATE_SELECTIVE_UNLOCKED) {
                linkedList.add("selective-unlocked");
            } else {
                linkedList.add("unlocked");
            }
        } else {
            linkedList.add("unknown locked state");
        }
        a.i d2 = aqVar.d();
        if (d2 != null) {
            linkedList.add("open closures:");
            if (d2.d() == a.h.CLOSURESTATE_OPEN) {
                linkedList.add("df");
            }
            if (d2.h() == a.h.CLOSURESTATE_OPEN) {
                linkedList.add("dr");
            }
            if (d2.f() == a.h.CLOSURESTATE_OPEN) {
                linkedList.add("pf");
            }
            if (d2.j() == a.h.CLOSURESTATE_OPEN) {
                linkedList.add("pr");
            }
            if (d2.n() == a.h.CLOSURESTATE_OPEN) {
                linkedList.add("ft");
            }
            if (d2.l() == a.h.CLOSURESTATE_OPEN) {
                linkedList.add("rt");
            }
            if (d2.p() == a.h.CLOSURESTATE_OPEN) {
                linkedList.add("cp");
            }
        }
        return linkedList.toString();
    }

    public String b() {
        return b(this.f5191a);
    }

    public void a(h hVar) {
        if (this.f5191a == null || this.f5191a.d() == null || this.f5191a.f() == null) {
            return;
        }
        a.i d2 = this.f5191a.d();
        hVar.a(a(d2.d()), a(d2.f()), a(d2.h()), a(d2.j()), a(d2.n()), a(d2.l()), a(d2.p()));
        a.ap f = this.f5191a.f();
        boolean z = true;
        hVar.h = f.equals(a.ap.VEHICLELOCKSTATE_LOCKED) || f.equals(a.ap.VEHICLELOCKSTATE_INTERNAL_LOCKED) || f.equals(a.ap.VEHICLELOCKSTATE_SELECTIVE_UNLOCKED);
        if (!hVar.h || f.equals(a.ap.VEHICLELOCKSTATE_SELECTIVE_UNLOCKED)) {
            z = false;
        }
        hVar.i = z;
    }

    private static Boolean a(a.h hVar) {
        if (hVar == a.h.CLOSURESTATE_OPEN) {
            return true;
        }
        return hVar == a.h.CLOSURESTATE_CLOSED ? false : null;
    }
}
