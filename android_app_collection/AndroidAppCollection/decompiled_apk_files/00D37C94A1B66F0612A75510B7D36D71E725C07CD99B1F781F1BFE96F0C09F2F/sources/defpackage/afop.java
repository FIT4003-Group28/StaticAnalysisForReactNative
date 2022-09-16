package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: afop  reason: default package */
/* loaded from: classes.dex */
public final class afop extends cyr {
    public static final /* synthetic */ int L = 0;
    @dfs(a = 13)
    tfj A;
    @dfs(a = 13)
    ayor B;
    Boolean C;
    SpannableString D;
    Boolean E;
    Boolean F;
    SpannableStringBuilder G;
    Float H;
    @dfs(a = 13)
    afpt I;
    @dfs(a = 13)

    /* renamed from: J  reason: collision with root package name */
    akss f43J;
    @dfs(a = 13)
    afpx K;
    @dfs(a = 14)
    private afoo M;
    @dfs(a = 13)
    ajvm a;
    @dfs(a = 13)
    tcu b;
    @dfs(a = 13)
    tda c;
    @dfs(a = 13)
    aagi d;
    @dfs(a = 13)
    afvn e;
    @dfs(a = 13)
    ajxz f;
    @dfs(a = 13)
    acti g;
    @dfs(a = 13)
    teb v;
    @dfs(a = 13)
    awmt w;
    @dfs(a = 13)
    awmt x;
    @dfs(a = 13)
    awmt y;
    @dfs(a = 13)
    awsw z;

    public afop() {
        super("SuggestEditableText");
        this.M = new afoo();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(cyv cyvVar) {
        if (cyvVar.f == null) {
            return;
        }
        cyvVar.g(new ddk(1, new Object[0]), "updateState:SuggestEditableText.forceComponentRemount");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void av(cyv cyvVar, int i, int i2) {
        if (cyvVar.f == null) {
            return;
        }
        cyvVar.g(new ddk(0, Integer.valueOf(i), Integer.valueOf(i2)), "updateState:SuggestEditableText.remeasureForUpdatedText");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return afpe.c(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        dcz dczVar5 = new dcz();
        afpe.g(dczVar, dczVar2, dczVar3, dczVar4, dczVar5);
        afoo afooVar = this.M;
        afooVar.b = (AtomicBoolean) dczVar.a;
        afooVar.e = (AtomicInteger) dczVar2.a;
        afooVar.d = (AtomicInteger) dczVar3.a;
        afooVar.a = (AtomicInteger) dczVar4.a;
        afooVar.c = (AtomicBoolean) dczVar5.a;
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        afoo afooVar = this.M;
        afpe.h(i, i2, ddjVar, afooVar.e, afooVar.d);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        afpe.j(cyvVar, (afoy) obj, this.G, this.D, this.H, this.z, this.x, this.y, this.w, this.b, this.I, this.K, this.f43J, this.d, this.e, this.f, this.a, this.B, this.g, this.C.booleanValue(), this.M.b, this.c, this.v, this.A, this.E.booleanValue(), this.F.booleanValue(), this.M.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        dcz dczVar5 = new dcz();
        dcz dczVar6 = new dcz();
        afpe.i(cyvVar, this.z, this.A, this.v, this.b, this.c, this.M.c, dczVar, dczVar2, dczVar3, dczVar4, dczVar5, dczVar6);
        this.C = (Boolean) dczVar.a;
        this.G = (SpannableStringBuilder) dczVar2.a;
        this.D = (SpannableString) dczVar3.a;
        this.H = (Float) dczVar4.a;
        this.E = (Boolean) dczVar5.a;
        this.F = (Boolean) dczVar6.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        afoo afooVar = (afoo) ddlVar;
        afoo afooVar2 = (afoo) ddlVar2;
        afooVar2.a = afooVar.a;
        afooVar2.b = afooVar.b;
        afooVar2.c = afooVar.c;
        afooVar2.d = afooVar.d;
        afooVar2.e = afooVar.e;
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
        afop afopVar = (afop) cyrVar;
        afop afopVar2 = (afop) cyrVar2;
        AtomicInteger atomicInteger = null;
        dad dadVar = new dad(afopVar.M.b, afopVar2 == null ? null : afopVar2.M.b);
        dad dadVar2 = new dad(afopVar.M.e, afopVar2 == null ? null : afopVar2.M.e);
        AtomicInteger atomicInteger2 = afopVar.M.a;
        if (afopVar2 != null) {
            atomicInteger = afopVar2.M.a;
        }
        return afpe.d(dadVar, dadVar2, new dad(atomicInteger2, atomicInteger));
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        afop afopVar = (afop) cyrVar;
        if (this.k == afopVar.k) {
            return true;
        }
        ajvm ajvmVar = this.a;
        if (ajvmVar == null ? afopVar.a != null : !ajvmVar.equals(afopVar.a)) {
            return false;
        }
        tcu tcuVar = this.b;
        if (tcuVar == null ? afopVar.b != null : !tcuVar.equals(afopVar.b)) {
            return false;
        }
        tda tdaVar = this.c;
        if (tdaVar == null ? afopVar.c != null : !tdaVar.equals(afopVar.c)) {
            return false;
        }
        aagi aagiVar = this.d;
        if (aagiVar == null ? afopVar.d != null : !aagiVar.equals(afopVar.d)) {
            return false;
        }
        afvn afvnVar = this.e;
        if (afvnVar == null ? afopVar.e != null : !afvnVar.equals(afopVar.e)) {
            return false;
        }
        ajxz ajxzVar = this.f;
        if (ajxzVar == null ? afopVar.f != null : !ajxzVar.equals(afopVar.f)) {
            return false;
        }
        acti actiVar = this.g;
        if (actiVar == null ? afopVar.g != null : !actiVar.equals(afopVar.g)) {
            return false;
        }
        teb tebVar = this.v;
        if (tebVar == null ? afopVar.v != null : !tebVar.equals(afopVar.v)) {
            return false;
        }
        awmt awmtVar = this.w;
        if (awmtVar == null ? afopVar.w != null : !awmtVar.equals(afopVar.w)) {
            return false;
        }
        awmt awmtVar2 = this.x;
        if (awmtVar2 == null ? afopVar.x != null : !awmtVar2.equals(afopVar.x)) {
            return false;
        }
        awmt awmtVar3 = this.y;
        if (awmtVar3 == null ? afopVar.y != null : !awmtVar3.equals(afopVar.y)) {
            return false;
        }
        afpt afptVar = this.I;
        if (afptVar == null ? afopVar.I != null : !afptVar.equals(afopVar.I)) {
            return false;
        }
        afpx afpxVar = this.K;
        if (afpxVar == null ? afopVar.K != null : !afpxVar.equals(afopVar.K)) {
            return false;
        }
        awsw awswVar = this.z;
        if (awswVar == null ? afopVar.z != null : !awswVar.equals(afopVar.z)) {
            return false;
        }
        akss akssVar = this.f43J;
        if (akssVar == null ? afopVar.f43J != null : !akssVar.equals(afopVar.f43J)) {
            return false;
        }
        tfj tfjVar = this.A;
        if (tfjVar == null ? afopVar.A != null : !tfjVar.equals(afopVar.A)) {
            return false;
        }
        ayor ayorVar = this.B;
        if (ayorVar == null ? afopVar.B != null : !ayorVar.equals(afopVar.B)) {
            return false;
        }
        AtomicInteger atomicInteger = this.M.a;
        if (atomicInteger == null ? afopVar.M.a != null : !atomicInteger.equals(afopVar.M.a)) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.M.b;
        if (atomicBoolean == null ? afopVar.M.b != null : !atomicBoolean.equals(afopVar.M.b)) {
            return false;
        }
        AtomicBoolean atomicBoolean2 = this.M.c;
        if (atomicBoolean2 == null ? afopVar.M.c != null : !atomicBoolean2.equals(afopVar.M.c)) {
            return false;
        }
        AtomicInteger atomicInteger2 = this.M.d;
        if (atomicInteger2 == null ? afopVar.M.d != null : !atomicInteger2.equals(afopVar.M.d)) {
            return false;
        }
        AtomicInteger atomicInteger3 = this.M.e;
        AtomicInteger atomicInteger4 = afopVar.M.e;
        return atomicInteger3 == null ? atomicInteger4 == null : atomicInteger3.equals(atomicInteger4);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        afop afopVar = (afop) super.j();
        afopVar.C = null;
        afopVar.D = null;
        afopVar.E = null;
        afopVar.F = null;
        afopVar.G = null;
        afopVar.H = null;
        afopVar.M = new afoo();
        return afopVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.M;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        afop afopVar = (afop) cyrVar;
        this.C = afopVar.C;
        this.D = afopVar.D;
        this.E = afopVar.E;
        this.F = afopVar.F;
        this.G = afopVar.G;
        this.H = afopVar.H;
    }
}
