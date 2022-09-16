package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ngi  reason: default package */
/* loaded from: classes3.dex */
public final class ngi {
    public final dt a;
    public final akfb b;
    public final Set c;
    public final fcu d;
    private final SharedPreferences e;

    public ngi(dt dtVar, akfb akfbVar, SharedPreferences sharedPreferences, fcu fcuVar) {
        this.a = dtVar;
        akfbVar.getClass();
        this.b = akfbVar;
        this.e = sharedPreferences;
        this.c = Collections.newSetFromMap(new WeakHashMap());
        this.d = fcuVar;
    }

    private final boolean c(ngh nghVar, acti actiVar) {
        argj k;
        if (!nghVar.o()) {
            return false;
        }
        boolean n = nghVar.n();
        View h = nghVar.h();
        if (h != null && h.isShown() && nghVar.m() && !n && (k = nghVar.k()) != null) {
            this.b.b(k, h, k, actiVar);
        }
        View g = nghVar.g();
        String string = this.e.getString("add_to_long_press_hint_trigger_video_id", null);
        argj i = nghVar.i();
        if (g == null || g.getVisibility() != 0 || nghVar.i() == null || string == null || string.equals(nghVar.l()) || i == null) {
            return true;
        }
        argf argfVar = i.i;
        if (argfVar == null) {
            argfVar = argf.a;
        }
        int ab = akel.ab(argfVar.b);
        if (ab == 0 || ab != 4) {
            return true;
        }
        this.b.b(nghVar.i(), g, i, actiVar);
        return true;
    }

    public final void a(acti actiVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext() && !c((ngh) it.next(), actiVar)) {
        }
    }

    public final void b(ngh nghVar, acti actiVar) {
        this.c.add(nghVar);
        c(nghVar, actiVar);
    }
}
