package defpackage;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aija  reason: default package */
/* loaded from: classes2.dex */
public final class aija {
    public static final long a = TimeUnit.DAYS.toMillis(7);
    public final Map<String, dcna<String, ajji>> b = new aif();
    public final Handler c = new Handler(Looper.getMainLooper());
    public final cqat d;
    @dzsi
    public Runnable e;
    public boolean f;
    public deig<Void> g;
    private final bwrg<ajjk> h;

    public aija(Executor executor, Application application, cqat cqatVar) {
        this.d = cqatVar;
        this.h = new bwrg<>((dssr) ajjk.b.cu(7), application, bwre.PERSISTENT_FILE, "requested_users_tokens", executor);
    }

    public final dehn<Void> a() {
        bvrj.UI_THREAD.c();
        if (this.g == null) {
            this.g = deig.d();
            this.h.h(new aiiy(this));
        }
        return deha.o(this.g);
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        if (!this.f) {
            return;
        }
        this.f = false;
        if (this.b.isEmpty()) {
            this.h.g();
            return;
        }
        ajjj bZ = ajjk.b.bZ();
        for (dcna<String, ajji> dcnaVar : this.b.values()) {
            for (ajji ajjiVar : dcnaVar.K()) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ajjk ajjkVar = (ajjk) bZ.b;
                ajjiVar.getClass();
                dsrj<ajji> dsrjVar = ajjkVar.a;
                if (!dsrjVar.a()) {
                    ajjkVar.a = dsqw.cl(dsrjVar);
                }
                ajjkVar.a.add(ajjiVar);
            }
        }
        this.h.e(bZ.bK());
    }

    public final void c(@dzsi String str, String str2, @dzsi String str3) {
        bvrj.UI_THREAD.c();
        dbsk.l(!dbsj.d(str2));
        String e = dbsj.e(str);
        dobw bZ = dobx.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dobx dobxVar = (dobx) bZ.b;
        str2.getClass();
        int i = dobxVar.a | 1;
        dobxVar.a = i;
        dobxVar.b = str2;
        if (str3 != null) {
            str3.getClass();
            dobxVar.a = i | 2;
            dobxVar.c = str3;
        }
        dobx bK = bZ.bK();
        Set<ajji> c = d(e).c(str2);
        Iterator<ajji> it = c.iterator();
        while (it.hasNext()) {
            dobx dobxVar2 = it.next().c;
            if (dobxVar2 == null) {
                dobxVar2 = dobx.d;
            }
            if (dobxVar2.equals(bK)) {
                it.remove();
            }
        }
        ajjh bZ2 = ajji.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ajji ajjiVar = (ajji) bZ2.b;
        e.getClass();
        int i2 = ajjiVar.a | 1;
        ajjiVar.a = i2;
        ajjiVar.b = e;
        bK.getClass();
        ajjiVar.c = bK;
        ajjiVar.a = i2 | 2;
        long b = this.d.b();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ajji ajjiVar2 = (ajji) bZ2.b;
        ajjiVar2.a |= 4;
        ajjiVar2.d = b;
        c.add(bZ2.bK());
        this.f = true;
        if (this.e != null) {
            return;
        }
        aiiz aiizVar = new aiiz(this);
        this.e = aiizVar;
        this.c.postDelayed(aiizVar, TimeUnit.SECONDS.toMillis(30L));
    }

    public final dcna<String, ajji> d(String str) {
        dcna<String, ajji> dcnaVar = this.b.get(str);
        if (dcnaVar == null) {
            dccg O = dccg.O();
            this.b.put(str, O);
            return O;
        }
        return dcnaVar;
    }
}
