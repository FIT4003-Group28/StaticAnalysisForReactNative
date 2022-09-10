package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aczf  reason: default package */
/* loaded from: classes.dex */
public class aczf implements jbm {
    public final abfk a;
    private final cqtd b;
    private final String c;
    private final cjtd d;
    private final akpm e;
    private final gga f;
    private final efg g;
    private final acwt h;
    private final cklq i;

    public aczf(akpm akpmVar, abfl abflVar, gga ggaVar, efg efgVar, acwt acwtVar, cklq cklqVar, dqfo dqfoVar, int i) {
        this.e = akpmVar;
        this.a = abflVar.a(dqfoVar, null, abse.e);
        this.f = ggaVar;
        this.g = efgVar;
        this.h = acwtVar;
        this.i = cklqVar;
        this.c = dqfoVar.e;
        dqfn b = dqfn.b(dqfoVar.h);
        b = b == null ? dqfn.UNKNOWN : b;
        if (isw.b.containsKey(b)) {
            this.b = iup.c(isw.b.get(b).intValue(), ibm.p());
        } else {
            this.b = cqrt.g(isw.a.getOrDefault(b, 2131232414).intValue(), ibm.p());
        }
        this.d = isw.b(dqfoVar, dtxr.A, i, ddfn.ASSISTIVE_SHORTCUTS);
    }

    @Override // defpackage.jbm
    public cqtd a() {
        return this.b;
    }

    @Override // defpackage.jbm
    public String b() {
        return this.c;
    }

    @Override // defpackage.jbm
    public cjtd c() {
        return this.d;
    }

    @Override // defpackage.jbm
    public cqkl d(final cjqm cjqmVar) {
        this.i.a(ckls.SHORTCUT_CLICKED);
        this.h.a();
        abfe.a(null, this.e, this.f, this.g, new Runnable(this, cjqmVar) { // from class: acze
            private final aczf a;
            private final cjqm b;

            {
                this.a = this;
                this.b = cjqmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aczf aczfVar = this.a;
                aczfVar.a.a(this.b);
            }
        });
        return cqkl.a;
    }

    public boolean equals(@dzsi Object obj) {
        if (obj instanceof aczf) {
            return this.c.equals(((aczf) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }
}
