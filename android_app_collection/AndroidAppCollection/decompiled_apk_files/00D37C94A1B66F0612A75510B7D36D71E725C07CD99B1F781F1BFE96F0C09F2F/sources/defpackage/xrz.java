package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: xrz  reason: default package */
/* loaded from: classes4.dex */
public final class xrz {
    public static apdq a(aadd aaddVar) {
        if (aaddVar == null || aaddVar.a() == null) {
            return apdq.a;
        }
        apdq apdqVar = aaddVar.a().o;
        return apdqVar == null ? apdq.a : apdqVar;
    }

    public static boolean b(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.u;
    }

    public static boolean c(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.j;
    }

    public static boolean d(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.n;
    }

    public static boolean e(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.i;
    }

    public static boolean f(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.m;
    }

    public static boolean g(aadd aaddVar) {
        return a(aaddVar).f;
    }

    public static boolean h(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.q;
    }

    public static boolean i(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.p;
    }

    public static boolean j(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.t;
    }

    public static boolean k(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.o;
    }

    public static boolean l(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.e;
    }

    public static boolean m(aadd aaddVar) {
        apdq a = a(aaddVar);
        return a != null && a.d;
    }

    public static apdl n(aacz aaczVar) {
        if (aaczVar == null || aaczVar.b() == null) {
            return apdl.b;
        }
        apdl apdlVar = aaczVar.b().f;
        return apdlVar == null ? apdl.b : apdlVar;
    }

    public static boolean o(aacz aaczVar) {
        apdl n = n(aaczVar);
        return n != null && n.l;
    }

    public static yvc p(Context context, azqb azqbVar, String str, ankx ankxVar) {
        vjf a = vjg.a(context);
        a.e("ads");
        a.f("ads.pb");
        Uri a2 = a.a();
        vli a3 = vlj.a();
        a3.e(awte.a);
        a3.f(a2);
        vlo d = vlr.d(context, ankxVar);
        d.c = str;
        d.b();
        d.d("last_ad_time", "last_ad_signals_adid", "last_ad_signals_lat", "last_ad_signals_identity", "last_ad_signals_timestamp");
        d.e(fdg.l);
        a3.b(d.a());
        return new yvc(vmu.b(((vlk) azqbVar.get()).a(a3.a())), awte.a);
    }

    public static boolean q(xgu xguVar, int i) {
        boolean z = xguVar.a;
        return i == 2 ? z && !xguVar.d.a : z && xguVar.d.a;
    }
}
