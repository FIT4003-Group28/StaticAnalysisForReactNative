package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cipn  reason: default package */
/* loaded from: classes4.dex */
public class cipn extends cibj implements cipl, chyv {
    public final chxr a;
    public final String b;
    private final chrx c;
    private final String d;

    public cipn(chrx chrxVar, chxl chxlVar) {
        super(chxlVar);
        this.c = chrxVar;
        chxr chxrVar = chxlVar.b;
        this.a = chxrVar == null ? chxr.e : chxrVar;
        dwlh dwlhVar = chxlVar.d;
        this.d = (dwlhVar == null ? dwlh.n : dwlhVar).c;
        this.b = chxlVar.m;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return chys.a(this);
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.REVIEW;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.cipl
    public String e() {
        return this.d;
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: cipm
            private final cipn a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                cipn cipnVar = this.a;
                cipn cipnVar2 = (cipn) obj2;
                return cipnVar.a.equals(cipnVar2.a) && cipnVar.b.equals(cipnVar2.b);
            }
        });
    }

    @Override // defpackage.cipl
    public String f() {
        return this.b;
    }

    @Override // defpackage.cipl
    public cqkl g() {
        this.c.H(this.a);
        return cqkl.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, chxj.REVIEW, this.b});
    }
}
