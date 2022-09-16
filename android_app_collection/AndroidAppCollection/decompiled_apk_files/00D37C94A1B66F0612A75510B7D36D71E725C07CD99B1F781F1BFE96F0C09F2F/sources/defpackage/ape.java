package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ape  reason: default package */
/* loaded from: classes.dex */
public final class ape {
    private static final apd a = apd.a;

    public static void a(dp dpVar, String str) {
        aoz aozVar = new aoz(dpVar, str);
        j(aozVar);
        apd h = h(dpVar);
        apd apdVar = apd.a;
        if (!h.b.contains(apb.DETECT_FRAGMENT_REUSE) || !k(h, dpVar.getClass(), aozVar.getClass())) {
            return;
        }
        i(h, aozVar);
    }

    public static void b(dp dpVar, ViewGroup viewGroup) {
        apf apfVar = new apf(dpVar, viewGroup);
        j(apfVar);
        apd h = h(dpVar);
        apd apdVar = apd.a;
        if (!h.b.contains(apb.DETECT_FRAGMENT_TAG_USAGE) || !k(h, dpVar.getClass(), apfVar.getClass())) {
            return;
        }
        i(h, apfVar);
    }

    public static void c(dp dpVar) {
        apg apgVar = new apg(dpVar);
        j(apgVar);
        apd h = h(dpVar);
        apd apdVar = apd.a;
        if (!h.b.contains(apb.DETECT_TARGET_FRAGMENT_USAGE) || !k(h, dpVar.getClass(), apgVar.getClass())) {
            return;
        }
        i(h, apgVar);
    }

    public static void d(dp dpVar) {
        api apiVar = new api(dpVar);
        j(apiVar);
        apd h = h(dpVar);
        apd apdVar = apd.a;
        if (!h.b.contains(apb.DETECT_RETAIN_INSTANCE_USAGE) || !k(h, dpVar.getClass(), apiVar.getClass())) {
            return;
        }
        i(h, apiVar);
    }

    public static void e(dp dpVar, boolean z) {
        apk apkVar = new apk(dpVar, z);
        j(apkVar);
        apd h = h(dpVar);
        apd apdVar = apd.a;
        if (!h.b.contains(apb.DETECT_SET_USER_VISIBLE_HINT) || !k(h, dpVar.getClass(), apkVar.getClass())) {
            return;
        }
        i(h, apkVar);
    }

    public static void f(dp dpVar, ViewGroup viewGroup) {
        apn apnVar = new apn(dpVar, viewGroup);
        j(apnVar);
        apd h = h(dpVar);
        apd apdVar = apd.a;
        if (!h.b.contains(apb.DETECT_WRONG_FRAGMENT_CONTAINER) || !k(h, dpVar.getClass(), apnVar.getClass())) {
            return;
        }
        i(h, apnVar);
    }

    public static void g(dp dpVar, dp dpVar2) {
        apj apjVar = new apj(dpVar, dpVar2);
        j(apjVar);
        apd h = h(dpVar);
        apd apdVar = apd.a;
        if (!h.b.contains(apb.DETECT_TARGET_FRAGMENT_USAGE) || !k(h, dpVar.getClass(), apjVar.getClass())) {
            return;
        }
        i(h, apjVar);
    }

    private static apd h(dp dpVar) {
        while (dpVar != null) {
            if (dpVar.ap()) {
                dpVar.F();
            }
            dpVar = dpVar.C;
        }
        return a;
    }

    private static void i(apd apdVar, apm apmVar) {
        dp dpVar = apmVar.a;
        String name = dpVar.getClass().getName();
        apd apdVar2 = apd.a;
        apdVar.b.contains(apb.PENALTY_LOG);
        apc apcVar = apdVar.c;
        if (apdVar.b.contains(apb.PENALTY_DEATH)) {
            apa apaVar = new apa(name, apmVar);
            if (dpVar.ap()) {
                Handler handler = dpVar.F().m.d;
                if (handler.getLooper() == Looper.myLooper()) {
                    apaVar.run();
                    return;
                } else {
                    handler.post(apaVar);
                    return;
                }
            }
            apaVar.run();
        }
    }

    private static void j(apm apmVar) {
        if (eo.X(3)) {
            apmVar.a.getClass().getName();
        }
    }

    private static boolean k(apd apdVar, Class cls, Class cls2) {
        apd apdVar2 = apd.a;
        Set set = (Set) apdVar.d.get(cls);
        if (set == null) {
            return true;
        }
        return (cls2.getSuperclass() == apm.class || !set.contains(cls2.getSuperclass())) && !set.contains(cls2);
    }
}
