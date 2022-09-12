package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: aogm  reason: default package */
/* loaded from: classes2.dex */
public abstract class aogm {
    public static final aogm a = i().a();
    public static final aogm b;

    static {
        aogh i = i();
        i.g(true);
        b = i.a();
    }

    public static aogh i() {
        aofq aofqVar = new aofq();
        aofqVar.a = dbpy.a;
        aofqVar.b = dbpy.a;
        aofqVar.c = dbpy.a;
        aofqVar.d = dbpy.a;
        aofqVar.e = dbpy.a;
        aofqVar.b(dcdc.e());
        aofqVar.f(dcdc.e());
        aofqVar.g(false);
        return aofqVar;
    }

    public static dbrn<dvaa, akqq> j() {
        return new aogg();
    }

    public abstract dbsg<akqq> a();

    public abstract dbsg<Float> b();

    public abstract dbsg<akqq> c();

    public abstract dbsg<aogl> d();

    public abstract dcdc<akqq> e();

    public abstract dbsg<Rect> f();

    public abstract dcdc<aogj> g();

    public abstract boolean h();
}
