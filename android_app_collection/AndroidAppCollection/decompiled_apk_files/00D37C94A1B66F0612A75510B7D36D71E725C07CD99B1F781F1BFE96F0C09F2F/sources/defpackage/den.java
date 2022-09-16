package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.facebook.litho.ComponentHost;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: den  reason: default package */
/* loaded from: classes3.dex */
public final class den {
    public final Map a = new HashMap();
    public final deg b = new deg();
    public final age c = new age();
    public final Map d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final del f = new del(this);
    public final dek g = new dek(this);
    public final dem h = new dem(this);
    public final dei i;
    public dfg j;

    public den(dei deiVar) {
        this.i = deiVar;
    }

    public static void b(deh dehVar) {
        if (dehVar.d != null) {
            dehVar.d = null;
        }
        if (dehVar.e != null) {
            dehVar.e = null;
        }
    }

    public static void e(dfe dfeVar, dda ddaVar) {
        short s = ddaVar.b;
        for (int i = 0; i < s; i++) {
            dfeVar.c(ddaVar.c(i));
        }
    }

    public static void h(dfe dfeVar, float f, dda ddaVar) {
        short s = ddaVar.b;
        for (int i = 0; i < s; i++) {
            dfeVar.d(ddaVar.c(i), f);
        }
    }

    private static String i(int i) {
        return i != -1 ? i != 0 ? i != 1 ? "DISAPPEARED" : "CHANGED" : "APPEARED" : "UNSET";
    }

    private final void j(View view, boolean z) {
        if (view instanceof ComponentHost) {
            if (z) {
                ComponentHost componentHost = (ComponentHost) view;
                if (componentHost.p) {
                    componentHost.p = false;
                    componentHost.setClipChildren(componentHost.q);
                }
            } else {
                ComponentHost componentHost2 = (ComponentHost) view;
                if (!componentHost2.p) {
                    componentHost2.q = componentHost2.getClipChildren();
                    componentHost2.setClipChildren(false);
                    componentHost2.p = true;
                }
            }
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ComponentHost) {
            j((View) parent, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v8, types: [dfe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dfg a(defpackage.dee r12) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.den.a(dee):dfg");
    }

    public final void c(def defVar, dda ddaVar, dda ddaVar2) {
        deh dehVar = (deh) this.b.a(defVar);
        if (dehVar == null) {
            dehVar = new deh();
            deg degVar = this.b;
            if (degVar.d.put(defVar, dehVar) == null) {
                int i = defVar.a;
                if (i == 1) {
                    degVar.a.put(defVar.b, defVar);
                } else if (i != 2) {
                    degVar.c.put(defVar.b, defVar);
                } else {
                    String str = defVar.c;
                    Map map = (Map) degVar.b.get(str);
                    if (map == null) {
                        map = new LinkedHashMap();
                        degVar.b.put(str, map);
                    }
                    map.put(defVar.b, defVar);
                }
            }
        }
        if (ddaVar != null || ddaVar2 != null) {
            if (ddaVar == null) {
                dehVar.c = 0;
            } else if (ddaVar2 != null) {
                dehVar.c = 1;
            } else {
                dehVar.c = 2;
            }
            dehVar.d = ddaVar;
            dehVar.e = ddaVar2;
            dda ddaVar3 = dehVar.e;
            dbn dbnVar = ddaVar3 != null ? (dbn) ddaVar3.d() : null;
            for (dfe dfeVar : dehVar.a.keySet()) {
                dej dejVar = (dej) dehVar.a.get(dfeVar);
                if (dbnVar == null) {
                    dejVar.d = null;
                } else {
                    dejVar.d = Float.valueOf(dfeVar.e(dbnVar));
                }
            }
            dehVar.f = true;
            if (!cyg.a) {
                return;
            }
            String valueOf = String.valueOf(defVar);
            int i2 = dehVar.c;
            String.valueOf(valueOf).length();
            i(i2).length();
            return;
        }
        throw new RuntimeException("Both current and next LayoutOutput groups were null!");
    }

    public final void d(dda ddaVar, boolean z) {
        Object b = ddaVar.b(3);
        if (!(b instanceof View)) {
            return;
        }
        j((View) b, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(def defVar, dda ddaVar) {
        deh dehVar = (deh) this.b.a(defVar);
        if (dehVar != null) {
            g(defVar, dehVar, ddaVar);
        }
    }

    public final void g(def defVar, deh dehVar, dda ddaVar) {
        dda ddaVar2 = dehVar.b;
        if (ddaVar2 == null && ddaVar == null) {
            return;
        }
        if (ddaVar2 != null && ddaVar2.equals(ddaVar)) {
            return;
        }
        if (cyg.a) {
            String valueOf = String.valueOf(defVar);
            String valueOf2 = String.valueOf(ddaVar);
            String.valueOf(valueOf).length();
            String.valueOf(valueOf2).length();
        }
        Map map = dehVar.a;
        if (dehVar.b != null) {
            for (dfe dfeVar : map.keySet()) {
                e(dfeVar, dehVar.b);
            }
            d(dehVar.b, true);
        }
        for (dej dejVar : map.values()) {
            dff dffVar = dejVar.a;
            dffVar.b(ddaVar);
            dffVar.c(dffVar.c);
        }
        if (ddaVar != null) {
            d(ddaVar, false);
        }
        dehVar.b = ddaVar;
    }
}
