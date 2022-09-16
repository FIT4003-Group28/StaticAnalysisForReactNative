package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dlz  reason: default package */
/* loaded from: classes3.dex */
public final class dlz extends cyr {
    public static final /* synthetic */ int Q = 0;
    @dfs(a = 13)
    final MovementMethod A;
    @dfs(a = 3)
    public boolean B;
    @dfs(a = 3)
    public int C;
    @dfs(a = 3)
    public int D;
    @dfs(a = 13)
    public ColorStateList E;
    @dfs(a = 3)
    public int F;
    @dfs(a = 5)
    public List G;
    @dfs(a = 13)
    final Typeface H;
    public daq I;

    /* renamed from: J  reason: collision with root package name */
    daq f178J;
    das K;
    das L;
    das M;
    das N;
    das O;
    das P;
    @dfs(a = 14)
    private dly R;
    @dfs(a = 3)
    public int a;
    @dfs(a = 3)
    public boolean b;
    @dfs(a = 3)
    int c;
    @dfs(a = 3)
    public int d;
    @dfs(a = 13)
    public CharSequence e;
    @dfs(a = 13)
    final ColorStateList f;
    @dfs(a = 3)
    public int g;
    @dfs(a = 13)
    public CharSequence v;
    @dfs(a = 13)
    public Drawable w;
    @dfs(a = 5)
    final List x;
    @dfs(a = 3)
    public int y;
    @dfs(a = 3)
    public int z;

    public dlz() {
        super("TextInput");
        this.c = 8388627;
        this.e = dmd.c;
        this.f = dmd.b;
        this.g = 0;
        this.v = dmd.d;
        this.w = dmd.e;
        this.x = Collections.emptyList();
        this.y = 1;
        this.z = Integer.MAX_VALUE;
        this.A = dmd.g;
        this.B = false;
        this.C = 0;
        this.D = 1;
        this.E = dmd.a;
        this.F = -1;
        this.G = Collections.emptyList();
        this.H = dmd.f;
        this.R = new dly();
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return dmd.f(context);
    }

    @Override // defpackage.czb
    protected final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dmd.d(dczVar, dczVar2, dczVar3, this.v);
        dly dlyVar = this.R;
        dlyVar.b = (AtomicReference) dczVar.a;
        dlyVar.c = (AtomicReference) dczVar2.a;
        dlyVar.a = ((Integer) dczVar3.a).intValue();
    }

    @Override // defpackage.czb
    protected final void P(cyv cyvVar, Object obj) {
        dmd.g(cyvVar, (dmb) obj, this.G);
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        CharSequence charSequence = this.e;
        Drawable drawable = this.w;
        ColorStateList colorStateList = this.E;
        ColorStateList colorStateList2 = this.f;
        int i3 = this.d;
        int i4 = this.F;
        Typeface typeface = this.H;
        int i5 = this.D;
        int i6 = this.c;
        int i7 = this.y;
        int i8 = this.C;
        int i9 = this.g;
        List list = this.x;
        boolean z = this.B;
        int i10 = this.z;
        int i11 = this.a;
        dly dlyVar = this.R;
        AtomicReference atomicReference = dlyVar.c;
        int i12 = dlyVar.a;
        dmd.e(cyvVar, i, i2, ddjVar, charSequence, drawable, colorStateList, colorStateList2, i3, i4, typeface, i5, i6, i7, i8, i9, list, z, i10, i11, atomicReference);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        CharSequence charSequence = this.e;
        Drawable drawable = this.w;
        ColorStateList colorStateList = this.E;
        ColorStateList colorStateList2 = this.f;
        int i = this.d;
        int i2 = this.F;
        Typeface typeface = this.H;
        int i3 = this.D;
        int i4 = this.c;
        int i5 = this.y;
        int i6 = this.C;
        int i7 = this.g;
        List list = this.x;
        boolean z = this.B;
        int i8 = this.z;
        MovementMethod movementMethod = this.A;
        int i9 = this.a;
        dly dlyVar = this.R;
        dmd.j(cyvVar, (dmb) obj, charSequence, drawable, colorStateList, colorStateList2, i, i2, typeface, i3, i4, i5, i6, i7, list, z, i8, movementMethod, i9, dlyVar.c, dlyVar.b);
    }

    @Override // defpackage.czb
    protected final void W(cyv cyvVar, Object obj) {
        dmd.i((dmb) obj, this.R.b);
    }

    @Override // defpackage.czb
    protected final void X(ddl ddlVar, ddl ddlVar2) {
        dly dlyVar = (dly) ddlVar;
        dly dlyVar2 = (dly) ddlVar2;
        dlyVar2.a = dlyVar.a;
        dlyVar2.b = dlyVar.b;
        dlyVar2.c = dlyVar.c;
    }

    @Override // defpackage.czb
    protected final boolean Z() {
        return true;
    }

    @Override // defpackage.czb
    protected final boolean ac() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    protected final boolean ai(cyr cyrVar, cyr cyrVar2) {
        dad dadVar;
        Integer valueOf;
        dad dadVar2;
        Integer valueOf2;
        dad dadVar3;
        Integer valueOf3;
        dad dadVar4;
        Integer valueOf4;
        dad dadVar5;
        Integer valueOf5;
        dad dadVar6;
        List list;
        dad dadVar7;
        Boolean valueOf6;
        dad dadVar8;
        Integer num;
        dad dadVar9;
        Integer valueOf7;
        dad dadVar10;
        Integer num2;
        dad dadVar11;
        MovementMethod movementMethod;
        dlz dlzVar = (dlz) cyrVar;
        dlz dlzVar2 = (dlz) cyrVar2;
        dad dadVar12 = new dad(dlzVar.v, dlzVar2 == null ? null : dlzVar2.v);
        dad dadVar13 = new dad(dlzVar.e, dlzVar2 == null ? null : dlzVar2.e);
        dad dadVar14 = new dad(dlzVar.w, dlzVar2 == null ? null : dlzVar2.w);
        Float valueOf8 = Float.valueOf(0.0f);
        Float f = dlzVar2 == null ? null : valueOf8;
        dad dadVar15 = new dad(valueOf8, f);
        dad dadVar16 = new dad(valueOf8, f);
        dad dadVar17 = new dad(valueOf8, f);
        dad dadVar18 = new dad(-7829368, dlzVar2 == null ? null : -7829368);
        dad dadVar19 = new dad(dlzVar.E, dlzVar2 == null ? null : dlzVar2.E);
        dad dadVar20 = new dad(dlzVar.f, dlzVar2 == null ? null : dlzVar2.f);
        dad dadVar21 = new dad(Integer.valueOf(dlzVar.d), dlzVar2 == null ? null : Integer.valueOf(dlzVar2.d));
        dad dadVar22 = new dad(Integer.valueOf(dlzVar.F), dlzVar2 == null ? null : Integer.valueOf(dlzVar2.F));
        dad dadVar23 = new dad(dlzVar.H, dlzVar2 == null ? null : dlzVar2.H);
        Integer valueOf9 = Integer.valueOf(dlzVar.D);
        if (dlzVar2 == null) {
            dadVar = dadVar23;
            valueOf = null;
        } else {
            dadVar = dadVar23;
            valueOf = Integer.valueOf(dlzVar2.D);
        }
        dad dadVar24 = new dad(valueOf9, valueOf);
        Integer valueOf10 = Integer.valueOf(dlzVar.c);
        if (dlzVar2 == null) {
            dadVar2 = dadVar24;
            valueOf2 = null;
        } else {
            dadVar2 = dadVar24;
            valueOf2 = Integer.valueOf(dlzVar2.c);
        }
        dad dadVar25 = new dad(valueOf10, valueOf2);
        dad dadVar26 = new dad(true, dlzVar2 == null ? null : true);
        Integer valueOf11 = Integer.valueOf(dlzVar.y);
        if (dlzVar2 == null) {
            dadVar3 = dadVar26;
            valueOf3 = null;
        } else {
            dadVar3 = dadVar26;
            valueOf3 = Integer.valueOf(dlzVar2.y);
        }
        dad dadVar27 = new dad(valueOf11, valueOf3);
        Integer valueOf12 = Integer.valueOf(dlzVar.C);
        if (dlzVar2 == null) {
            dadVar4 = dadVar27;
            valueOf4 = null;
        } else {
            dadVar4 = dadVar27;
            valueOf4 = Integer.valueOf(dlzVar2.C);
        }
        dad dadVar28 = new dad(valueOf12, valueOf4);
        Integer valueOf13 = Integer.valueOf(dlzVar.g);
        if (dlzVar2 == null) {
            dadVar5 = dadVar28;
            valueOf5 = null;
        } else {
            dadVar5 = dadVar28;
            valueOf5 = Integer.valueOf(dlzVar2.g);
        }
        dad dadVar29 = new dad(valueOf13, valueOf5);
        List list2 = dlzVar.x;
        if (dlzVar2 == null) {
            dadVar6 = dadVar29;
            list = null;
        } else {
            dadVar6 = dadVar29;
            list = dlzVar2.x;
        }
        dad dadVar30 = new dad(list2, list);
        dad dadVar31 = new dad(null, null);
        Boolean valueOf14 = Boolean.valueOf(dlzVar.B);
        if (dlzVar2 == null) {
            dadVar7 = dadVar31;
            valueOf6 = null;
        } else {
            dadVar7 = dadVar31;
            valueOf6 = Boolean.valueOf(dlzVar2.B);
        }
        dad dadVar32 = new dad(valueOf14, valueOf6);
        if (dlzVar2 == null) {
            dadVar8 = dadVar32;
            num = null;
        } else {
            dadVar8 = dadVar32;
            num = 1;
        }
        dad dadVar33 = new dad(1, num);
        Integer valueOf15 = Integer.valueOf(dlzVar.z);
        if (dlzVar2 == null) {
            dadVar9 = dadVar33;
            valueOf7 = null;
        } else {
            dadVar9 = dadVar33;
            valueOf7 = Integer.valueOf(dlzVar2.z);
        }
        dad dadVar34 = new dad(valueOf15, valueOf7);
        if (dlzVar2 == null) {
            dadVar10 = dadVar34;
            num2 = null;
        } else {
            dadVar10 = dadVar34;
            num2 = -1;
        }
        dad dadVar35 = new dad(-1, num2);
        MovementMethod movementMethod2 = dlzVar.A;
        if (dlzVar2 == null) {
            dadVar11 = dadVar35;
            movementMethod = null;
        } else {
            dadVar11 = dadVar35;
            movementMethod = dlzVar2.A;
        }
        dad dadVar36 = new dad(movementMethod2, movementMethod);
        Integer num3 = null;
        dad dadVar37 = new dad(null, null);
        Integer valueOf16 = Integer.valueOf(dlzVar.R.a);
        if (dlzVar2 != null) {
            num3 = Integer.valueOf(dlzVar2.R.a);
        }
        return dmd.b(dadVar12, dadVar13, dadVar14, dadVar15, dadVar16, dadVar17, dadVar18, dadVar19, dadVar20, dadVar21, dadVar22, dadVar, dadVar2, dadVar25, dadVar3, dadVar4, dadVar5, dadVar6, dadVar30, dadVar7, dadVar8, dadVar9, dadVar10, dadVar11, dadVar36, dadVar37, new dad(valueOf16, num3));
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.czb
    protected final void as(Object obj) {
        dmd.h((dmb) obj);
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        dlz dlzVar = (dlz) cyrVar;
        if (this.k == dlzVar.k) {
            return true;
        }
        if (this.a != dlzVar.a || this.c != dlzVar.c || this.d != dlzVar.d) {
            return false;
        }
        CharSequence charSequence = this.e;
        if (charSequence == null ? dlzVar.e != null : !charSequence.equals(dlzVar.e)) {
            return false;
        }
        ColorStateList colorStateList = this.f;
        if (colorStateList == null ? dlzVar.f != null : !colorStateList.equals(dlzVar.f)) {
            return false;
        }
        if (this.g != dlzVar.g) {
            return false;
        }
        CharSequence charSequence2 = this.v;
        if (charSequence2 == null ? dlzVar.v != null : !charSequence2.equals(dlzVar.v)) {
            return false;
        }
        Drawable drawable = this.w;
        if (drawable == null ? dlzVar.w != null : !drawable.equals(dlzVar.w)) {
            return false;
        }
        List list = this.x;
        if (list == null ? dlzVar.x != null : !list.equals(dlzVar.x)) {
            return false;
        }
        if (this.y != dlzVar.y || this.z != dlzVar.z) {
            return false;
        }
        MovementMethod movementMethod = this.A;
        if (movementMethod == null ? dlzVar.A != null : !movementMethod.equals(dlzVar.A)) {
            return false;
        }
        if (this.B != dlzVar.B || this.C != dlzVar.C || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || this.D != dlzVar.D) {
            return false;
        }
        ColorStateList colorStateList2 = this.E;
        if (colorStateList2 == null ? dlzVar.E != null : !colorStateList2.equals(dlzVar.E)) {
            return false;
        }
        if (this.F != dlzVar.F) {
            return false;
        }
        List list2 = this.G;
        if (list2 == null ? dlzVar.G != null : !list2.equals(dlzVar.G)) {
            return false;
        }
        Typeface typeface = this.H;
        if (typeface == null ? dlzVar.H != null : !typeface.equals(dlzVar.H)) {
            return false;
        }
        dly dlyVar = this.R;
        int i = dlyVar.a;
        dly dlyVar2 = dlzVar.R;
        if (i != dlyVar2.a) {
            return false;
        }
        AtomicReference atomicReference = dlyVar.b;
        if (atomicReference == null ? dlyVar2.b != null : !atomicReference.equals(dlyVar2.b)) {
            return false;
        }
        AtomicReference atomicReference2 = this.R.c;
        AtomicReference atomicReference3 = dlzVar.R.c;
        return atomicReference2 == null ? atomicReference3 == null : atomicReference2.equals(atomicReference3);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        dlz dlzVar = (dlz) super.j();
        dlzVar.R = new dly();
        return dlzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.R;
    }

    @Override // defpackage.cyr
    public final void s(dat datVar) {
        das dasVar = this.K;
        if (dasVar != null) {
            datVar.b(dasVar);
        }
        das dasVar2 = this.L;
        if (dasVar2 != null) {
            datVar.b(dasVar2);
        }
        das dasVar3 = this.M;
        if (dasVar3 != null) {
            datVar.b(dasVar3);
        }
        das dasVar4 = this.N;
        if (dasVar4 != null) {
            datVar.b(dasVar4);
        }
        das dasVar5 = this.O;
        if (dasVar5 != null) {
            datVar.b(dasVar5);
        }
        das dasVar6 = this.P;
        if (dasVar6 != null) {
            datVar.b(dasVar6);
        }
    }
}
