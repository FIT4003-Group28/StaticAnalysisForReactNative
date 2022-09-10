package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cifc  reason: default package */
/* loaded from: classes4.dex */
public abstract class cifc implements cide, chyv {
    public final chrx a;
    public final chxl b;
    public final chxk c;
    public final dnvs d;
    public chyu e = chyu.VISIBLE;

    /* JADX INFO: Access modifiers changed from: protected */
    public cifc(chrx chrxVar, chxl chxlVar, chxk chxkVar) {
        chwf chwfVar;
        this.a = chrxVar;
        this.b = chxlVar;
        this.c = chxkVar;
        if (chxkVar.b == 20) {
            chwfVar = (chwf) chxkVar.c;
        } else {
            chwfVar = chwf.c;
        }
        dnjp dnjpVar = chwfVar.b;
        dnvs dnvsVar = (dnjpVar == null ? dnjp.b : dnjpVar).a;
        this.d = dnvsVar == null ? dnvs.d : dnvsVar;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return this.e;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.UNKNOWN;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    public abstract String e();

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: cifb
            private final cifc a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                cifc cifcVar = this.a;
                cifc cifcVar2 = (cifc) obj2;
                if (cifcVar.c.equals(cifcVar2.c)) {
                    chxr chxrVar = cifcVar.b.b;
                    if (chxrVar == null) {
                        chxrVar = chxr.e;
                    }
                    chxr chxrVar2 = cifcVar2.b.b;
                    if (chxrVar2 == null) {
                        chxrVar2 = chxr.e;
                    }
                    return chxrVar.equals(chxrVar2);
                }
                return false;
            }
        });
    }

    public abstract String f();

    public abstract dcdc<cqix<?>> g();

    public abstract cjtd h();

    public int hashCode() {
        Object[] objArr = new Object[3];
        chxr chxrVar = this.b.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        objArr[0] = chxrVar;
        chxk chxkVar = this.c;
        int i = chxkVar.bC;
        if (i == 0) {
            i = dsst.a.b(chxkVar).c(chxkVar);
            chxkVar.bC = i;
        }
        objArr[1] = Integer.valueOf(i);
        objArr[2] = chxj.FACTUAL_MODERATION_TASK;
        return Arrays.hashCode(objArr);
    }

    public abstract cjtd i();

    public abstract cjtd j();

    public abstract cjtd k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    /* JADX INFO: Access modifiers changed from: protected */
    public View.OnClickListener o(final dosq dosqVar) {
        return new View.OnClickListener(this, dosqVar) { // from class: cifa
            private final cifc a;
            private final dosq b;

            {
                this.a = this;
                this.b = dosqVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cifc cifcVar = this.a;
                dosq dosqVar2 = this.b;
                if (cifcVar.e == chyu.COMPLETED) {
                    return;
                }
                dosj bZ = dosk.i.bZ();
                String str = cifcVar.d.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dosk doskVar = (dosk) bZ.b;
                str.getClass();
                doskVar.a |= 1;
                doskVar.b = str;
                dqgh b = dqgh.b(cifcVar.d.b.get(0).b);
                if (b == null) {
                    b = dqgh.UNDEFINED;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dosk doskVar2 = (dosk) bZ.b;
                doskVar2.c = b.af;
                int i = doskVar2.a | 2;
                doskVar2.a = i;
                doskVar2.d = dosqVar2.e;
                doskVar2.a = i | 4;
                dosh bZ2 = dosi.a.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dosi.b((dosi) bZ2.b);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dosk doskVar3 = (dosk) bZ.b;
                dosi bK = bZ2.bK();
                bK.getClass();
                doskVar3.g = bK;
                doskVar3.a |= 32;
                dosk bK2 = bZ.bK();
                chrx chrxVar = cifcVar.a;
                chxr chxrVar = cifcVar.b.b;
                if (chxrVar == null) {
                    chxrVar = chxr.e;
                }
                chrxVar.ab(chxrVar, bK2);
                cifcVar.e = chyu.COMPLETED;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final dnvr p() {
        return this.d.b.get(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final dqgh q() {
        dqgh b = dqgh.b(p().b);
        return b == null ? dqgh.UNDEFINED : b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String r() {
        dwlh dwlhVar = this.b.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        return dwlhVar.c;
    }

    @Override // defpackage.cibi
    public cjtd s(ddho ddhoVar) {
        cjtd a;
        if (this.b.c.isEmpty()) {
            a = cjtd.b;
        } else {
            cjta b = cjtd.b();
            b.g(this.b.c);
            a = b.a();
        }
        cjta c = cjtd.c(a);
        c.d = ddhoVar;
        return c.a();
    }
}
