package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aulo  reason: default package */
/* loaded from: classes2.dex */
public final class aulo implements ault {
    public final dxio<dbsg<cvtz>> a;
    private final aif<auuh, aulu> b = new aif<>();
    private auln c;
    private final bzwf<auln> d;
    private final bvrb e;

    public aulo(bzwe bzweVar, dxio<dbsg<cvtz>> dxioVar, bvrb bvrbVar) {
        this.d = new bzwf<>(bzweVar.a.a("gmm_chime_notifications", auln.class), new auln(new ArrayList()));
        this.a = dxioVar;
        this.e = bvrbVar;
    }

    private final void g(@dzsi final String str, @dzsi final String str2) {
        if (!this.a.a().a() || str2 == null || str == null) {
            return;
        }
        this.e.b(new Runnable(this, str2, str) { // from class: aulm
            private final aulo a;
            private final String b;
            private final String c;

            {
                this.a = this;
                this.b = str2;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aulo auloVar = this.a;
                try {
                    auloVar.a.a().b().a(this.b, dcdc.f(this.c));
                } catch (cvke unused) {
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    private final synchronized void h() {
        if (this.c != null) {
            return;
        }
        this.c = this.d.a();
        this.b.clear();
        ArrayList<aulu> arrayList = this.c.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aulu auluVar = arrayList.get(i);
            this.b.put(auluVar.a(), auluVar);
        }
    }

    @Override // defpackage.ault
    public final synchronized void a(auuh auuhVar, aulu auluVar) {
        h();
        this.b.put(auuhVar, auluVar);
    }

    @Override // defpackage.ault
    public final synchronized void b(auuh auuhVar) {
        h();
        this.b.remove(auuhVar);
    }

    @Override // defpackage.ault
    public final synchronized void c(auuh auuhVar) {
        aulu e = e(auuhVar);
        if (e != null) {
            g(e.b(), e.c());
        }
        b(auuhVar);
    }

    @Override // defpackage.ault
    public final synchronized void d(String str, String str2) {
        g(str, str2);
        h();
        Iterator<Map.Entry<auuh, aulu>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getValue().b())) {
                it.remove();
                return;
            }
        }
    }

    @Override // defpackage.ault
    @dzsi
    public final synchronized aulu e(auuh auuhVar) {
        h();
        return this.b.get(auuhVar);
    }

    @Override // defpackage.ault
    public final synchronized void f() {
        auln aulnVar = this.c;
        if (aulnVar != null) {
            aulnVar.a.clear();
            this.c.a.addAll(this.b.values());
            this.d.c();
        }
    }
}
