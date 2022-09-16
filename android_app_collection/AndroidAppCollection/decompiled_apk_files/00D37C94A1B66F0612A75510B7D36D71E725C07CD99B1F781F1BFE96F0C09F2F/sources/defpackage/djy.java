package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: djy  reason: default package */
/* loaded from: classes3.dex */
public final class djy extends cyr {
    public static final /* synthetic */ int P = 0;
    @dfs(a = 3)
    public int A;
    @dfs(a = 3)
    public boolean B;
    @dfs(a = 13)
    public dle C;
    @dfs(a = 3)
    public int D;
    @dfs(a = 11)
    public daq E;
    @dfs(a = 13)
    public Integer F;
    @dfs(a = 3)
    public int G;
    @dfs(a = 3)
    public int H;
    @dfs(a = 3)
    public int I;
    @dfs(a = 3)

    /* renamed from: J  reason: collision with root package name */
    public int f175J;
    @dfs(a = 3)
    public boolean K;
    bmp L;
    @dfs(a = 13)
    public akcr M;
    @dfs(a = 13)
    public xz N;
    @dfs(a = 13)
    public nd O;
    @dfs(a = 14)
    private djx Q;
    @dfs(a = 13)
    public dit a;
    @dfs(a = 3)
    public int b;
    @dfs(a = 3)
    boolean c;
    @dfs(a = 3)
    public boolean d;
    @dfs(a = 13)
    CharSequence e;
    @dfs(a = 3)
    public int f;
    @dfs(a = 3)
    public boolean g;
    @dfs(a = 13)
    public xs v;
    @dfs(a = 3)
    public int w;
    @dfs(a = 3)
    public boolean x;
    @dfs(a = 13)
    public ya y;
    @dfs(a = 5)
    public List z;

    public djy() {
        super("Recycler");
        this.b = 0;
        this.c = true;
        this.d = true;
        this.v = dli.a;
        this.w = 0;
        this.x = true;
        this.z = Collections.emptyList();
        this.A = 0;
        this.B = true;
        this.D = -1;
        this.G = -16777216;
        this.H = 0;
        this.I = 0;
        this.f175J = 0;
        this.Q = new djx();
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb, defpackage.dap
    public final Object K(daq daqVar, Object obj) {
        int i = daqVar.b;
        if (i == -1048037474) {
            N((cyv) daqVar.c[0], (dao) obj);
            return null;
        } else if (i != 946341036) {
            return null;
        } else {
            djv djvVar = (djv) obj;
            dli.b((cyv) daqVar.c[0], ((djy) daqVar.a).Q.a);
            return null;
        }
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return dli.a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dli.g(dczVar);
        this.Q.a = ((Integer) dczVar.a).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void P(cyv cyvVar, Object obj) {
        dli.e((dln) obj, this.a, this.C, this.z, this.N, this.B, this.M, this.y, this.L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void Q(cyv cyvVar, cyz cyzVar) {
        dli.f(cyzVar, this.a);
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        dli.h(cyvVar, i, i2, ddjVar, this.a);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        dli.m((dln) obj, this.a, this.d, this.w, this.H, this.f175J, this.b, this.G, this.c, this.x, this.f, this.D, this.A, this.e, this.v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        dcz dczVar = new dcz();
        dli.i(this.E, dczVar);
        this.L = (bmp) dczVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        dli.k((dln) obj, this.a, this.N);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        ((djx) ddlVar2).a = ((djx) ddlVar).a;
    }

    @Override // defpackage.czb
    public final boolean Y() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ab() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    protected final boolean ai(cyr cyrVar, cyr cyrVar2) {
        dad dadVar;
        Boolean bool;
        dad dadVar2;
        Integer valueOf;
        dad dadVar3;
        xs xsVar;
        djy djyVar = (djy) cyrVar;
        djy djyVar2 = (djy) cyrVar2;
        dad dadVar4 = new dad(djyVar.a, djyVar2 == null ? null : djyVar2.a);
        dad dadVar5 = new dad(true, djyVar2 == null ? null : true);
        dad dadVar6 = new dad(Boolean.valueOf(djyVar.d), djyVar2 == null ? null : Boolean.valueOf(djyVar2.d));
        dad dadVar7 = new dad(Integer.valueOf(djyVar.w), djyVar2 == null ? null : Integer.valueOf(djyVar2.w));
        dad dadVar8 = new dad(Integer.valueOf(djyVar.H), djyVar2 == null ? null : Integer.valueOf(djyVar2.H));
        dad dadVar9 = new dad(Integer.valueOf(djyVar.f175J), djyVar2 == null ? null : Integer.valueOf(djyVar2.f175J));
        dad dadVar10 = new dad(Integer.valueOf(djyVar.b), djyVar2 == null ? null : Integer.valueOf(djyVar2.b));
        dad dadVar11 = new dad(null, null);
        dad dadVar12 = new dad(Integer.valueOf(djyVar.G), djyVar2 == null ? null : Integer.valueOf(djyVar2.G));
        dad dadVar13 = new dad(Boolean.valueOf(djyVar.c), djyVar2 == null ? null : Boolean.valueOf(djyVar2.c));
        dad dadVar14 = new dad(0, djyVar2 == null ? null : 0);
        dad dadVar15 = new dad(null, null);
        if (djyVar2 == null) {
            dadVar = dadVar15;
            bool = null;
        } else {
            dadVar = dadVar15;
            bool = false;
        }
        dad dadVar16 = new dad(false, bool);
        dad dadVar17 = new dad(false, bool);
        Integer valueOf2 = Integer.valueOf(djyVar.f);
        if (djyVar2 == null) {
            dadVar2 = dadVar17;
            valueOf = null;
        } else {
            dadVar2 = dadVar17;
            valueOf = Integer.valueOf(djyVar2.f);
        }
        dad dadVar18 = new dad(valueOf2, valueOf);
        xs xsVar2 = djyVar.v;
        if (djyVar2 == null) {
            dadVar3 = dadVar18;
            xsVar = null;
        } else {
            dadVar3 = dadVar18;
            xsVar = djyVar2.v;
        }
        return dli.c(dadVar4, dadVar5, dadVar6, dadVar7, dadVar8, dadVar9, dadVar10, dadVar11, dadVar12, dadVar13, dadVar14, dadVar, dadVar16, dadVar2, dadVar3, new dad(xsVar2, xsVar), new dad(Integer.valueOf(djyVar.Q.a), djyVar2 == null ? null : Integer.valueOf(djyVar2.Q.a)));
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.czb
    public final void ao() {
        dli.l(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void as(Object obj) {
        dli.j((dln) obj, this.a, this.C, this.y, this.z);
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        djy djyVar = (djy) cyrVar;
        if (this.k == djyVar.k) {
            return true;
        }
        dit ditVar = this.a;
        if (ditVar == null ? djyVar.a != null : !ditVar.equals(djyVar.a)) {
            return false;
        }
        if (this.b != djyVar.b || this.c != djyVar.c || this.d != djyVar.d) {
            return false;
        }
        CharSequence charSequence = this.e;
        if (charSequence == null ? djyVar.e != null : !charSequence.equals(djyVar.e)) {
            return false;
        }
        if (this.f != djyVar.f) {
            return false;
        }
        xs xsVar = this.v;
        if (xsVar == null ? djyVar.v != null : !xsVar.equals(djyVar.v)) {
            return false;
        }
        if (this.w != djyVar.w || this.x != djyVar.x) {
            return false;
        }
        ya yaVar = this.y;
        if (yaVar == null ? djyVar.y != null : !yaVar.equals(djyVar.y)) {
            return false;
        }
        List list = this.z;
        if (list == null ? djyVar.z != null : !list.equals(djyVar.z)) {
            return false;
        }
        if (this.A != djyVar.A || this.B != djyVar.B) {
            return false;
        }
        dle dleVar = this.C;
        if (dleVar == null ? djyVar.C != null : !dleVar.equals(djyVar.C)) {
            return false;
        }
        if (this.D != djyVar.D) {
            return false;
        }
        daq daqVar = this.E;
        if (daqVar == null ? djyVar.E != null : !daqVar.b(djyVar.E)) {
            return false;
        }
        if (this.G != djyVar.G || this.H != djyVar.H) {
            return false;
        }
        xz xzVar = this.N;
        if (xzVar == null ? djyVar.N != null : !xzVar.equals(djyVar.N)) {
            return false;
        }
        if (this.f175J != djyVar.f175J) {
            return false;
        }
        akcr akcrVar = this.M;
        if (akcrVar == null ? djyVar.M != null : !akcrVar.equals(djyVar.M)) {
            return false;
        }
        return this.Q.a == djyVar.Q.a;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        djy djyVar = (djy) super.j();
        djyVar.L = null;
        djyVar.Q = new djx();
        return djyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        this.L = ((djy) cyrVar).L;
    }
}
