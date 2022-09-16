package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tjv  reason: default package */
/* loaded from: classes4.dex */
public final class tjv implements Application.ActivityLifecycleCallbacks {
    public final wkj c;
    private final tkt g;
    public final tjw d = new tjw();
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    private final Map e = new HashMap();
    private final Set f = new HashSet();

    public tjv(tjp tjpVar, wkj wkjVar) {
        this.c = wkjVar;
        this.g = new tkt(tjpVar);
        Application a = tjpVar.a();
        if (a != null) {
            a.registerActivityLifecycleCallbacks(this);
        }
    }

    public final tjt a(String str, tla tlaVar) {
        tky tkyVar = (tky) this.b.get(str);
        if (tkyVar == null) {
            return null;
        }
        tla tlaVar2 = tla.START;
        int ordinal = tlaVar.ordinal();
        if (ordinal == 15) {
            this.g.a(tkyVar, tlaVar);
            tkyVar.n = true;
        } else if (ordinal == 16) {
            this.g.a(tkyVar, tlaVar);
            tkyVar.n = false;
        } else {
            switch (ordinal) {
                case 0:
                    tkyVar.l = false;
                    tkyVar.b = System.currentTimeMillis();
                    this.g.a(tkyVar, tlaVar);
                    tkyVar.o(tla.START);
                    break;
                case 1:
                case 2:
                case 3:
                    this.g.a(tkyVar, tlaVar);
                    tkyVar.o(tlaVar);
                    break;
                case 4:
                    this.g.a(tkyVar, tlaVar);
                    tkyVar.o(tla.COMPLETE);
                    break;
                case 5:
                    this.g.a(tkyVar, tlaVar);
                    tkyVar.l = false;
                    break;
                case 6:
                case 7:
                case 8:
                    this.g.a(tkyVar, tlaVar);
                    tkyVar.l = true;
                    break;
                case 9:
                    this.g.a(tkyVar, tlaVar);
                    tkyVar.r();
                    break;
                default:
                    this.g.a(tkyVar, tlaVar);
                    break;
            }
        }
        tjt i = tkyVar.i(tlaVar);
        if (!tlaVar.s) {
            tkyVar.n(tlaVar);
        }
        if (tlaVar.a() && !tlaVar.equals(tla.COMPLETE)) {
            tkyVar.p(tlaVar.t + 1);
        }
        return i;
    }

    public final void b(String str, View view, tkb tkbVar) {
        if (!this.c.a()) {
            return;
        }
        tkc tkcVar = (tkc) this.e.get(str);
        if (tkcVar != null) {
            if (view != tkcVar.a()) {
                tkcVar.d(view);
            }
            tkcVar.l = false;
            g(str, tkcVar);
        } else if (this.f.contains(str)) {
        } else {
            f(str, new tkc(view, tkbVar, str, this));
        }
    }

    public final void c(String str) {
        tkc tkcVar;
        if (this.a.containsKey(str)) {
            tkcVar = (tkc) this.a.get(str);
        } else {
            tkcVar = (tkc) this.e.get(str);
        }
        tkcVar.j();
    }

    public final void d(String str) {
        tkc tkcVar;
        if (!this.c.a()) {
            return;
        }
        if (this.a.containsKey(str)) {
            tkcVar = (tkc) this.a.get(str);
        } else {
            tkcVar = (tkc) this.e.get(str);
        }
        if (tkcVar == null) {
            return;
        }
        if (!tkcVar.m) {
            tkcVar.l = true;
            if (tkcVar.b().booleanValue() || tkcVar.k) {
                return;
            }
            h(str);
            return;
        }
        c(str);
        e(str);
    }

    public final void e(String str) {
        this.f.add(str);
        tkc tkcVar = (tkc) this.a.remove(str);
        if (tkcVar != null) {
            this.g.e(tkcVar);
        }
        this.e.remove(str);
    }

    final void f(String str, tkc tkcVar) {
        this.a.put(str, tkcVar);
        tkt tktVar = this.g;
        tktVar.d(tkcVar);
        boolean isEmpty = tktVar.b.isEmpty();
        tktVar.b.add(tkcVar);
        if (isEmpty) {
            tktVar.f();
        }
    }

    public final void g(String str, tkc tkcVar) {
        this.e.remove(str);
        f(str, tkcVar);
    }

    public final void h(String str) {
        tkc tkcVar = (tkc) this.a.get(str);
        if (tkcVar != null) {
            this.e.put(str, tkcVar);
            this.a.remove(str);
            this.g.e(tkcVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.a.keySet()) {
            View a = ((tkc) this.a.get(str)).a();
            if (a == null || activity == tjw.a(a)) {
                arrayList.add(str);
            }
        }
        for (String str2 : this.e.keySet()) {
            View a2 = ((tkc) this.e.get(str2)).a();
            if (a2 == null || activity == tjw.a(a2)) {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str3 = (String) arrayList.get(i);
            c(str3);
            e(str3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.a.keySet()) {
            tkc tkcVar = (tkc) this.a.get(str);
            View a = tkcVar.a();
            if (a == null || tkcVar.m) {
                arrayList.add(str);
            } else if (activity == tjw.a(a)) {
                tkcVar.a = true;
                arrayList2.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            c(str2);
            e(str2);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            h((String) arrayList2.get(i2));
        }
        for (tky tkyVar : this.b.values()) {
            View a2 = tkyVar.a();
            if (a2 != null && activity == tjw.a(a2)) {
                tkyVar.a = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.e.keySet()) {
            tkc tkcVar = (tkc) this.e.get(str);
            View a = tkcVar.a();
            if (a == null) {
                arrayList.add(str);
            } else if (activity == tjw.a(a)) {
                tkcVar.a = false;
                arrayList2.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            c(str2);
            e(str2);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str3 = (String) arrayList2.get(i2);
            g(str3, (tkc) this.e.get(str3));
        }
        for (tky tkyVar : this.b.values()) {
            View a2 = tkyVar.a();
            if (a2 != null && activity == tjw.a(a2)) {
                tkyVar.a = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
