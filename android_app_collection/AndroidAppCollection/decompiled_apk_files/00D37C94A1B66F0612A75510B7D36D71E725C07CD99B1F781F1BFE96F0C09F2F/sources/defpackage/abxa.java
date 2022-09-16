package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abxa  reason: default package */
/* loaded from: classes.dex */
public final class abxa {
    private static abxa l;
    public ScheduledExecutorService a;
    public acrr b;
    public boolean c;
    public snc d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int j = 1;
    public int k = 1;
    public final Map i = new HashMap();

    private abxa() {
    }

    public static abxa b() {
        if (l == null) {
            l = new abxa();
        }
        return l;
    }

    public static arrh c(Object obj) {
        arrf a = arrh.a();
        if (obj instanceof astf) {
            a.copyOnWrite();
            ((arrh) a.instance).cJ((asth) ((astf) obj).mo39build());
            return (arrh) a.mo39build();
        } else if (obj instanceof astj) {
            a.copyOnWrite();
            ((arrh) a.instance).cK((astk) ((astj) obj).mo39build());
            return (arrh) a.mo39build();
        } else if (obj instanceof astl) {
            a.copyOnWrite();
            ((arrh) a.instance).cL((astm) ((astl) obj).mo39build());
            return (arrh) a.mo39build();
        } else if (obj instanceof astn) {
            a.copyOnWrite();
            ((arrh) a.instance).cM((asto) ((astn) obj).mo39build());
            return (arrh) a.mo39build();
        } else if (obj instanceof astr) {
            a.copyOnWrite();
            ((arrh) a.instance).cO((astt) ((astr) obj).mo39build());
            return (arrh) a.mo39build();
        } else if (!(obj instanceof astp)) {
            return null;
        } else {
            a.copyOnWrite();
            ((arrh) a.instance).cN((astq) ((astp) obj).mo39build());
            return (arrh) a.mo39build();
        }
    }

    public static Object e(Class cls, asti astiVar) {
        if (cls.equals(asth.class)) {
            astf astfVar = (astf) asth.a.createBuilder();
            astfVar.copyOnWrite();
            asth asthVar = (asth) astfVar.instance;
            astiVar.getClass();
            asthVar.c = astiVar;
            asthVar.b |= 1;
            return astfVar;
        } else if (cls.equals(astk.class)) {
            astj astjVar = (astj) astk.a.createBuilder();
            astjVar.copyOnWrite();
            astk astkVar = (astk) astjVar.instance;
            astiVar.getClass();
            astkVar.c = astiVar;
            astkVar.b |= 1;
            return astjVar;
        } else if (cls.equals(astm.class)) {
            astl astlVar = (astl) astm.a.createBuilder();
            astlVar.copyOnWrite();
            astm astmVar = (astm) astlVar.instance;
            astiVar.getClass();
            astmVar.c = astiVar;
            astmVar.b |= 1;
            return astlVar;
        } else if (cls.equals(asto.class)) {
            astn astnVar = (astn) asto.a.createBuilder();
            astnVar.copyOnWrite();
            asto astoVar = (asto) astnVar.instance;
            astiVar.getClass();
            astoVar.c = astiVar;
            astoVar.b |= 1;
            return astnVar;
        } else if (cls.equals(astt.class)) {
            astr astrVar = (astr) astt.a.createBuilder();
            astrVar.copyOnWrite();
            astt asttVar = (astt) astrVar.instance;
            astiVar.getClass();
            asttVar.c = astiVar;
            asttVar.b |= 1;
            return astrVar;
        } else if (!cls.equals(astq.class)) {
            return null;
        } else {
            astp astpVar = (astp) astq.a.createBuilder();
            astpVar.copyOnWrite();
            astq astqVar = (astq) astpVar.instance;
            astiVar.getClass();
            astqVar.c = astiVar;
            astqVar.b |= 1;
            return astpVar;
        }
    }

    public final abwz a(Class cls) {
        abwz abwzVar;
        synchronized (this.i) {
            if (!this.i.containsKey(cls)) {
                this.i.put(cls, new abwz());
            }
            abwzVar = (abwz) this.i.get(cls);
        }
        return abwzVar;
    }

    public final asti d(abwz abwzVar) {
        abwzVar.getClass();
        long c = this.d.c();
        aopa createBuilder = asti.a.createBuilder();
        if (!TextUtils.isEmpty(this.e)) {
            String str = this.e;
            createBuilder.copyOnWrite();
            asti astiVar = (asti) createBuilder.instance;
            str.getClass();
            astiVar.b |= 1;
            astiVar.c = str;
        }
        int i = this.j;
        createBuilder.copyOnWrite();
        asti astiVar2 = (asti) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        astiVar2.i = i2;
        astiVar2.b |= 128;
        createBuilder.copyOnWrite();
        asti astiVar3 = (asti) createBuilder.instance;
        astiVar3.b |= 64;
        astiVar3.h = true;
        boolean z = this.f;
        createBuilder.copyOnWrite();
        asti astiVar4 = (asti) createBuilder.instance;
        astiVar4.b |= 16;
        astiVar4.f = z;
        boolean z2 = this.g;
        createBuilder.copyOnWrite();
        asti astiVar5 = (asti) createBuilder.instance;
        astiVar5.b |= 32;
        astiVar5.g = z2;
        int i3 = this.k;
        createBuilder.copyOnWrite();
        asti astiVar6 = (asti) createBuilder.instance;
        int i4 = i3 - 1;
        if (i3 != 0) {
            astiVar6.j = i4;
            astiVar6.b |= 1024;
            long j = abwzVar.d;
            createBuilder.copyOnWrite();
            asti astiVar7 = (asti) createBuilder.instance;
            astiVar7.b |= 4;
            astiVar7.d = j;
            createBuilder.copyOnWrite();
            asti astiVar8 = (asti) createBuilder.instance;
            astiVar8.b |= 8;
            astiVar8.e = c;
            boolean z3 = this.h;
            createBuilder.copyOnWrite();
            asti astiVar9 = (asti) createBuilder.instance;
            astiVar9.b |= 2048;
            astiVar9.k = z3;
            abwzVar.d = c;
            return (asti) createBuilder.mo39build();
        }
        throw null;
    }

    public final void f(Class cls, Class cls2, abwy abwyVar) {
        abwz a = a(cls);
        synchronized (this.i) {
            a.b.put(cls2, abwyVar);
        }
    }

    public final void g() {
        this.e = null;
        this.k = 1;
        this.j = 1;
        this.f = false;
        this.g = false;
        this.h = false;
    }

    public final void h(Object obj) {
        arrh c;
        if (this.c && (c = c(obj)) != null) {
            String valueOf = String.valueOf(obj.toString());
            if (valueOf.length() != 0) {
                "LiveCreationMetricsLogger:: ".concat(valueOf);
            }
            this.b.c(c);
        }
    }

    public final void i(Class cls) {
        if (!this.c) {
            return;
        }
        abwz a = a(cls);
        if (!a.e) {
            return;
        }
        Object e = e(cls, d(a));
        synchronized (this.i) {
            for (Map.Entry entry : a.b.entrySet()) {
                abwy abwyVar = (abwy) entry.getValue();
                if (abwyVar != null) {
                    abwyVar.a(e);
                }
            }
        }
        String valueOf = String.valueOf(e.toString());
        if (valueOf.length() != 0) {
            "LiveCreationMetricsLogger:: ".concat(valueOf);
        }
        this.b.c(c(e));
    }

    public final void j(Class cls, long j) {
        abwz a = a(cls);
        a.e = true;
        a.c = j;
        l(cls, a);
    }

    public final void k(Class cls) {
        abwz a = a(cls);
        a.e = false;
        Future future = a.a;
        if (future != null) {
            future.cancel(false);
            a.a = null;
        }
    }

    public final void l(final Class cls, abwz abwzVar) {
        Future future;
        if (!this.c) {
            return;
        }
        if (abwzVar.c > 0 && abwzVar.e && abwzVar.a == null) {
            ScheduledExecutorService scheduledExecutorService = this.a;
            Runnable runnable = new Runnable() { // from class: abwx
                @Override // java.lang.Runnable
                public final void run() {
                    abxa.this.i(cls);
                }
            };
            long j = abwzVar.c;
            abwzVar.a = scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
        }
        if (abwzVar.c > 0 || (future = abwzVar.a) == null) {
            return;
        }
        future.cancel(false);
        abwzVar.a = null;
    }

    public final void m(int i) {
        abwz a = a(astq.class);
        if (!a.e || !this.c) {
            return;
        }
        astp astpVar = (astp) e(astq.class, d(a));
        if (astpVar == null) {
            zep.b("Could not create stage metric");
            return;
        }
        astpVar.copyOnWrite();
        astq astqVar = (astq) astpVar.instance;
        astq astqVar2 = astq.a;
        astqVar.d = i - 1;
        astqVar.b |= 2;
        h(astpVar);
    }

    public final void n(int i, int i2, cff cffVar) {
        cew cewVar;
        abwz a = a(astm.class);
        if (!a.e || !this.c) {
            return;
        }
        astl astlVar = (astl) e(astm.class, d(a));
        astlVar.copyOnWrite();
        astm astmVar = (astm) astlVar.instance;
        astm astmVar2 = astm.a;
        astmVar.d = i - 1;
        astmVar.b |= 2;
        astlVar.copyOnWrite();
        astm astmVar3 = (astm) astlVar.instance;
        astmVar3.e = i2 - 1;
        astmVar3.b |= 4;
        if (cffVar != null && (cewVar = cffVar.b) != null) {
            int i3 = cewVar.a;
            astlVar.copyOnWrite();
            astm astmVar4 = (astm) astlVar.instance;
            astmVar4.b |= 8;
            astmVar4.f = i3;
        }
        h(astlVar);
    }
}
