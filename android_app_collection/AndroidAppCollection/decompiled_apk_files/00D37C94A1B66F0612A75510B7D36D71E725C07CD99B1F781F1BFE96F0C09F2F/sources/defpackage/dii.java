package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dii  reason: default package */
/* loaded from: classes3.dex */
public final class dii extends cyr {
    public static final /* synthetic */ int M = 0;
    @dfs(a = 10)
    cyr A;
    @dfs(a = 3)
    public boolean B;
    @dfs(a = 5)
    public List C;
    @dfs(a = 3)
    public int D;
    @dfs(a = 3)
    int E;
    @dfs(a = 15)
    public dhj F;
    @dfs(a = 3)
    int G;
    das H;
    das I;
    @dfs(a = 13)

    /* renamed from: J  reason: collision with root package name */
    public dic f174J;
    @dfs(a = 13)
    public akcr K;
    @dfs(a = 13)
    public dle L;
    @dfs(a = 14)
    private dih N;
    @dfs(a = 3)
    int a;
    @dfs(a = 3)
    public boolean b;
    @dfs(a = 3)
    boolean c;
    @dfs(a = 3)
    public boolean d;
    @dfs(a = 3)
    public boolean e;
    @dfs(a = 10)
    cyr f;
    @dfs(a = 10)
    cyr g;
    @dfs(a = 3)
    boolean v;
    @dfs(a = 3)
    public boolean w;
    @dfs(a = 13)
    public xs x;
    @dfs(a = 13)
    ya y;
    @dfs(a = 3)
    int z;

    public dii() {
        super("RecyclerCollectionComponent");
        this.c = true;
        this.d = true;
        this.w = true;
        this.x = dim.a;
        this.B = true;
        this.C = Collections.emptyList();
        this.D = 0;
        this.f174J = dim.b;
        this.N = new dih();
    }

    @Override // defpackage.czb, defpackage.dap
    public final Object K(daq daqVar, Object obj) {
        int i = daqVar.b;
        if (i != -1873243140) {
            if (i != -1048037474) {
                return null;
            }
            N((cyv) daqVar.c[0], (dao) obj);
            return null;
        }
        dju djuVar = (dju) obj;
        dbb dbbVar = daqVar.a;
        Object[] objArr = daqVar.c;
        boolean z = ((dii) dbbVar).v;
        dim.d((cyv) objArr[0], (dhv) objArr[1]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        dcz dczVar5 = new dcz();
        dcz dczVar6 = new dcz();
        dcz dczVar7 = new dcz();
        dim.b(cyvVar, dczVar, dczVar2, dczVar3, dczVar4, dczVar5, dczVar6, dczVar7, this.F, this.f174J, this.L, this.b, this.w);
        Object obj = dczVar.a;
        if (obj != null) {
            this.N.g = (xz) obj;
        }
        Object obj2 = dczVar2.a;
        if (obj2 != null) {
            this.N.d = (dhv) obj2;
        }
        Object obj3 = dczVar3.a;
        if (obj3 != null) {
            this.N.h = (dgz) obj3;
        }
        Object obj4 = dczVar4.a;
        if (obj4 != null) {
            this.N.a = (dit) obj4;
        }
        Object obj5 = dczVar5.a;
        if (obj5 != null) {
            this.N.c = (dik) obj5;
        }
        Object obj6 = dczVar6.a;
        if (obj6 != null) {
            this.N.f = (dle) obj6;
        }
        Object obj7 = dczVar7.a;
        if (obj7 != null) {
            this.N.e = (djo) obj7;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        dih dihVar = (dih) ddlVar;
        dih dihVar2 = (dih) ddlVar2;
        dihVar2.a = dihVar.a;
        dihVar2.b = dihVar.b;
        dihVar2.f = dihVar.f;
        dihVar2.e = dihVar.e;
        dihVar2.c = dihVar.c;
        dihVar2.h = dihVar.h;
        dihVar2.d = dihVar.d;
        dihVar2.g = dihVar.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean aa() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.czb
    public final void aq() {
        dim.c(this.N.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        dhj dhjVar = this.F;
        cyr cyrVar = this.A;
        cyr cyrVar2 = this.f;
        cyr cyrVar3 = this.g;
        List list = this.C;
        boolean z = this.d;
        boolean z2 = this.c;
        boolean z3 = this.B;
        xs xsVar = this.x;
        int i = this.D;
        int i2 = this.z;
        int i3 = this.E;
        int i4 = this.G;
        int i5 = this.a;
        akcr akcrVar = this.K;
        ya yaVar = this.y;
        boolean z4 = this.e;
        dic dicVar = this.f174J;
        dih dihVar = this.N;
        boolean z5 = dihVar.b;
        dle dleVar = dihVar.f;
        djo djoVar = dihVar.e;
        dik dikVar = dihVar.c;
        dit ditVar = dihVar.a;
        dhv dhvVar = dihVar.d;
        dgz dgzVar = dihVar.h;
        return dim.e(cyvVar, dhjVar, cyrVar, cyrVar2, cyrVar3, list, z, z2, z3, xsVar, i, i2, i3, i4, i5, akcrVar, yaVar, z4, dicVar, dleVar, djoVar, dikVar, ditVar, dhvVar, dihVar.g);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        dii diiVar = (dii) super.j();
        cyr cyrVar = diiVar.f;
        dhj dhjVar = null;
        diiVar.f = cyrVar != null ? cyrVar.j() : null;
        cyr cyrVar2 = diiVar.g;
        diiVar.g = cyrVar2 != null ? cyrVar2.j() : null;
        cyr cyrVar3 = diiVar.A;
        diiVar.A = cyrVar3 != null ? cyrVar3.j() : null;
        dhj dhjVar2 = diiVar.F;
        if (dhjVar2 != null) {
            dhjVar = dhjVar2.a(false);
        }
        diiVar.F = dhjVar;
        diiVar.N = new dih();
        return diiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.N;
    }

    @Override // defpackage.cyr
    public final void s(dat datVar) {
        das dasVar = this.H;
        if (dasVar != null) {
            datVar.b(dasVar);
        }
        das dasVar2 = this.I;
        if (dasVar2 != null) {
            datVar.b(dasVar2);
        }
    }
}
