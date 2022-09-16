package defpackage;

import android.util.Pair;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akfb  reason: default package */
/* loaded from: classes.dex */
public final class akfb implements akfc {
    public final aafo a;
    public final boolean b;
    public final Set c;
    public final Map d;
    public final ReferenceQueue e;
    public final gfz f;
    private final akfo g;

    public akfb(akfo akfoVar, aafo aafoVar, gfz gfzVar, aacz aaczVar) {
        gfzVar.getClass();
        this.f = gfzVar;
        aafoVar.getClass();
        this.a = aafoVar;
        akfoVar.getClass();
        this.g = akfoVar;
        boolean z = false;
        if (aaczVar != null) {
            asxj asxjVar = aaczVar.b().e;
            if ((asxjVar == null ? asxj.a : asxjVar).bi) {
                z = true;
            }
        }
        this.b = z;
        this.c = new HashSet();
        this.d = new HashMap();
        this.e = new ReferenceQueue();
    }

    private static apoj g(argd argdVar) {
        apzg apzgVar;
        apzg apzgVar2 = null;
        if (argdVar == null) {
            return null;
        }
        aopc aopcVar = (aopc) apoj.a.createBuilder();
        arag aragVar = argdVar.f;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        aopcVar.copyOnWrite();
        apoj apojVar = (apoj) aopcVar.instance;
        aragVar.getClass();
        apojVar.i = aragVar;
        apojVar.b |= 256;
        boolean z = argdVar.d;
        aopcVar.copyOnWrite();
        apoj apojVar2 = (apoj) aopcVar.instance;
        apojVar2.b |= 64;
        apojVar2.h = z;
        arhs arhsVar = argdVar.e;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        aopcVar.copyOnWrite();
        apoj apojVar3 = (apoj) aopcVar.instance;
        arhsVar.getClass();
        apojVar3.g = arhsVar;
        apojVar3.b |= 32;
        int i = 16;
        if ((argdVar.b & 16) != 0) {
            apzgVar = argdVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        if (apzgVar != null) {
            aopcVar.copyOnWrite();
            apoj apojVar4 = (apoj) aopcVar.instance;
            apojVar4.n = apzgVar;
            apojVar4.b |= 8192;
        }
        if ((argdVar.b & 32) != 0 && (apzgVar2 = argdVar.h) == null) {
            apzgVar2 = apzg.a;
        }
        if (apzgVar2 != null) {
            aopcVar.copyOnWrite();
            apoj apojVar5 = (apoj) aopcVar.instance;
            apojVar5.o = apzgVar2;
            apojVar5.b |= 16384;
        }
        aovs aovsVar = argdVar.i;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        aopcVar.copyOnWrite();
        apoj apojVar6 = (apoj) aopcVar.instance;
        aovsVar.getClass();
        apojVar6.s = aovsVar;
        apojVar6.b |= 131072;
        aoob aoobVar = argdVar.j;
        aopcVar.copyOnWrite();
        apoj apojVar7 = (apoj) aopcVar.instance;
        aoobVar.getClass();
        apojVar7.b |= 1048576;
        apojVar7.t = aoobVar;
        if ((argdVar.b & 1) != 0) {
            arge argeVar = argdVar.c;
            if (argeVar == null) {
                argeVar = arge.a;
            }
            int ac = akel.ac(argeVar.b);
            if (ac != 0 && ac == 2) {
                i = 14;
            }
        }
        aopcVar.copyOnWrite();
        apoj apojVar8 = (apoj) aopcVar.instance;
        apojVar8.d = Integer.valueOf(i - 1);
        apojVar8.c = 1;
        return (apoj) aopcVar.mo39build();
    }

    public final void a() {
        while (true) {
            Reference poll = this.e.poll();
            if (poll != null) {
                synchronized (this.e) {
                    this.d.remove(((akfv) poll).a);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.akfc
    public final void b(argj argjVar, View view, Object obj, acti actiVar) {
        e(argjVar, view, obj, actiVar, this.b, false, null);
    }

    @Override // defpackage.akfc
    public final void c(argj argjVar, View view, Object obj, acti actiVar, akev akevVar) {
        e(argjVar, view, obj, actiVar, this.b, false, akevVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.argj r12, android.view.View r13, java.lang.Object r14, defpackage.acti r15, boolean r16, boolean r17, defpackage.akev r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfb.d(argj, android.view.View, java.lang.Object, acti, boolean, boolean, akev):void");
    }

    public final void e(final argj argjVar, final View view, final Object obj, final acti actiVar, final boolean z, final boolean z2, final akev akevVar) {
        long j;
        long j2;
        a();
        if (view == null || argjVar == null) {
            return;
        }
        if (!z2) {
            this.d.put(argjVar.c, new akfa(this, argjVar, view, actiVar, akevVar));
            if ((argjVar.b & 64) != 0) {
                argf argfVar = argjVar.i;
                if (argfVar == null) {
                    argfVar = argf.a;
                }
                int ab = akel.ab(argfVar.b);
                if (ab != 0 && ab == 3) {
                    return;
                }
            }
            gfz gfzVar = this.f;
            if ((argjVar.b & 16) != 0) {
                argi argiVar = argjVar.g;
                if (argiVar == null) {
                    argiVar = argi.a;
                }
                j = argiVar.d;
            } else {
                j = 0;
            }
            if ((argjVar.b & 16) != 0) {
                argi argiVar2 = argjVar.g;
                if (argiVar2 == null) {
                    argiVar2 = argi.a;
                }
                j2 = argiVar2.c;
            } else {
                j2 = 0;
            }
            boolean d = ghj.d(gfzVar.a, gfz.a(argjVar), TimeUnit.SECONDS.toMillis(j2), gfzVar.b.c());
            boolean z3 = false;
            if (d && gfzVar.a.getLong(gfz.b(argjVar), 0L) < j) {
                z3 = true;
            }
            if (this.c.contains(new Pair(argjVar, obj)) || !z3) {
                return;
            }
        }
        if (!view.isShown() || !view.isAttachedToWindow()) {
            view.post(new Runnable() { // from class: akey
                @Override // java.lang.Runnable
                public final void run() {
                    akfb akfbVar = akfb.this;
                    View view2 = view;
                    argj argjVar2 = argjVar;
                    Object obj2 = obj;
                    acti actiVar2 = actiVar;
                    boolean z4 = z;
                    boolean z5 = z2;
                    akev akevVar2 = akevVar;
                    if (!view2.isShown() || !view2.isAttachedToWindow()) {
                        return;
                    }
                    akfbVar.d(argjVar2, view2, obj2, actiVar2, z4, z5, akevVar2);
                }
            });
        } else {
            d(argjVar, view, obj, actiVar, z, z2, akevVar);
        }
    }

    @Override // defpackage.akfc
    public final void f(argj argjVar, View view, acti actiVar) {
        e(argjVar, view, null, actiVar, this.b, true, null);
    }
}
