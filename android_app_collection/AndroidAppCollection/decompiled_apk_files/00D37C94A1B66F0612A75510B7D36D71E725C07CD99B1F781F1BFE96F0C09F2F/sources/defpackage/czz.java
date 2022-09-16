package defpackage;

import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: czz  reason: default package */
/* loaded from: classes3.dex */
public final class czz extends dmu implements Cloneable, dbk {
    private ArrayList A;
    private String B;
    private Set C;
    private List D;
    private boolean E;
    private int F;
    private float G;
    private float H;
    private float I;

    /* renamed from: J  reason: collision with root package name */
    private float f171J;
    private float K;
    private float L;
    private long M;
    private int N;
    private dab O;
    public cyv a;
    public List b;
    public dae c;
    public boolean d;
    public int e;
    public int f;
    public float g;
    public float h;
    private dna i;
    private final int[] j;
    private final float[] k;
    private dbj l;
    private daq m;
    private daq n;
    private daq o;
    private daq p;
    private daq q;
    private daq r;
    private daq s;
    private Drawable t;
    private boolean[] u;
    private dam v;
    private String w;
    private String x;
    private ArrayList y;
    private ArrayList z;

    public czz(cyv cyvVar) {
        dcw dcwVar = dcx.a;
        dnb dnbVar = new dnb(dcx.c);
        this.b = new ArrayList(1);
        this.j = new int[4];
        this.k = new float[4];
        this.F = 0;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.f171J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.e = -1;
        this.f = -1;
        this.g = -1.0f;
        this.h = -1.0f;
        this.a = cyvVar;
        dnbVar.b = this;
        this.i = dnbVar;
        this.C = new HashSet();
    }

    private final float bO(dam damVar, YogaEdge yogaEdge) {
        YogaEdge yogaEdge2;
        YogaDirection i = this.i.i();
        YogaDirection yogaDirection = YogaDirection.RTL;
        YogaEdge yogaEdge3 = YogaEdge.LEFT;
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            if (i == yogaDirection) {
                yogaEdge2 = YogaEdge.END;
            }
            yogaEdge2 = YogaEdge.START;
        } else if (ordinal == 2) {
            if (i != yogaDirection) {
                yogaEdge2 = YogaEdge.END;
            }
            yogaEdge2 = YogaEdge.START;
        } else {
            String valueOf = String.valueOf(yogaEdge);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Not an horizontal padding edge: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        float c = damVar.c(yogaEdge2);
        return czu.M(c) ? damVar.a(yogaEdge) : c;
    }

    private final dam bP() {
        dbj ah = ah();
        if (ah.d == null) {
            ah.d = new dam();
        }
        return ah.d;
    }

    private static daq bQ(daq daqVar, daq daqVar2) {
        return daqVar == null ? daqVar2 : daqVar2 == null ? daqVar : new dac(daqVar, daqVar2);
    }

    private static dbk bR(cyv cyvVar, czz czzVar, cyr cyrVar, Set set) {
        cyv cyvVar2 = cyrVar.q;
        List<cyr> list = czzVar.b;
        cyr V = czzVar.V();
        if (cyvVar2 != null && V != null && !czzVar.aW()) {
            for (cyr cyrVar2 : list) {
                if (set.contains(cyrVar2.m)) {
                    return dbm.d(cyvVar, cyrVar, false, true);
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).startsWith(V.m)) {
                    return bS(czzVar, cyrVar, set, 1);
                }
            }
            boolean z = dfz.a;
            return bS(czzVar, cyrVar, set, 0);
        }
        return dbm.d(cyvVar, cyrVar, false, true);
    }

    private static dbk bS(czz czzVar, cyr cyrVar, Set set, int i) {
        List list;
        dbk bR;
        dna dnaVar = czzVar.i;
        dna k = dnaVar.k();
        czz clone = czzVar.clone();
        clone.b = new ArrayList();
        clone.c = null;
        clone.C = null;
        clone.G = Float.NaN;
        clone.H = Float.NaN;
        clone.I = Float.NaN;
        clone.f171J = Float.NaN;
        clone.K = Float.NaN;
        clone.L = Float.NaN;
        int size = czzVar.b.size();
        ArrayList<cyr> arrayList = new ArrayList(size);
        arrayList.add(cyrVar);
        cyv cyvVar = cyrVar.q;
        for (int i2 = size - 2; i2 >= 0; i2--) {
            cyr k2 = ((cyr) czzVar.b.get(i2)).k(cyvVar);
            arrayList.add(k2);
            cyvVar = k2.q;
        }
        Collections.reverse(arrayList);
        cyv cyvVar2 = cyrVar.q;
        clone.a = cyvVar2;
        clone.i = k;
        k.y(clone);
        clone.b = arrayList;
        clone.c = null;
        clone.z = null;
        for (cyr cyrVar2 : arrayList) {
        }
        ArrayList arrayList2 = clone.A;
        clone.A = null;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            clone.A = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                dey deyVar = (dey) arrayList2.get(i3);
                cyr k3 = deyVar.b.k(cyvVar2);
                ArrayList arrayList3 = clone.A;
                String str = deyVar.a;
                arrayList3.add(new dey(deyVar.c, k3));
            }
        }
        cyv cyvVar3 = clone.W().q;
        if (clone.aj() != null) {
            clone.ah().b = null;
        }
        int h = dnaVar.h();
        for (int i4 = 0; i4 < h; i4++) {
            czz czzVar2 = (czz) dnaVar.l(i4).p();
            cyr k4 = ((cyr) czzVar2.b.get(Math.max(0, list.size() - 1))).k(cyvVar3);
            if (i == 0) {
                bR = bS(czzVar2, k4, set, 0);
            } else {
                bR = bR(cyvVar3, czzVar2, k4, set);
            }
            clone.bj(bR);
        }
        return clone;
    }

    private final void bT(dbk dbkVar) {
        if (!dfz.a || dbkVar == null) {
            return;
        }
        czt.n(this.a, dbkVar);
        int c = dbkVar.c();
        for (int i = 0; i < c; i++) {
            bT(dbkVar.ai(i));
        }
        if (!dbkVar.aM()) {
            return;
        }
        bT(dbkVar.aj());
    }

    private final void bU(YogaEdge yogaEdge, boolean z) {
        if (this.u == null && z) {
            this.u = new boolean[YogaEdge.ALL.j + 1];
        }
        boolean[] zArr = this.u;
        if (zArr != null) {
            zArr[yogaEdge.j] = z;
        }
    }

    private final boolean bV() {
        dab dabVar;
        return (this.v == null || (dabVar = this.O) == null || !dabVar.s()) ? false : true;
    }

    @Override // defpackage.dbo
    public final void A(int i) {
        this.M |= 4096;
        this.i.Y(i);
    }

    @Override // defpackage.dbo
    public final void B() {
        this.M |= 8;
        this.i.ac();
    }

    @Override // defpackage.dmt, defpackage.cyz
    public final int C() {
        if (czu.M(this.L)) {
            this.L = this.i.b();
        }
        return (int) this.L;
    }

    @Override // defpackage.dmt, defpackage.cyz
    public final int D() {
        return czu.f(this.i.d(YogaEdge.BOTTOM));
    }

    @Override // defpackage.dmt, defpackage.cyz
    public final int E() {
        return czu.f(this.i.d(YogaEdge.LEFT));
    }

    @Override // defpackage.dmt, defpackage.cyz
    public final int F() {
        return czu.f(this.i.d(YogaEdge.RIGHT));
    }

    @Override // defpackage.dmt, defpackage.cyz
    public final int G() {
        return czu.f(this.i.d(YogaEdge.TOP));
    }

    @Override // defpackage.dmt, defpackage.cyz
    public final int H() {
        if (czu.M(this.K)) {
            this.K = this.i.e();
        }
        return (int) this.K;
    }

    @Override // defpackage.cyz
    public final int I() {
        if (czu.M(this.I)) {
            this.I = this.i.f();
        }
        return (int) this.I;
    }

    @Override // defpackage.cyz
    public final int J() {
        if (czu.M(this.f171J)) {
            this.f171J = this.i.g();
        }
        return (int) this.f171J;
    }

    @Override // defpackage.cyz
    public final Drawable K() {
        return this.t;
    }

    @Override // defpackage.cyz
    public final YogaDirection L() {
        return this.i.i();
    }

    @Override // defpackage.cyz
    public final boolean M() {
        return (this.M & 1024) != 0;
    }

    @Override // defpackage.dbk
    public final float N() {
        return this.i.n().a;
    }

    @Override // defpackage.dbk
    public final float O() {
        return this.i.o().a;
    }

    @Override // defpackage.dbk
    public final int P() {
        return this.F;
    }

    @Override // defpackage.dbk
    public final int Q(YogaEdge yogaEdge) {
        return czu.f(this.i.a(yogaEdge));
    }

    @Override // defpackage.dbk
    public final int R() {
        if (!bV()) {
            return 0;
        }
        return czu.f(this.v.a(YogaEdge.BOTTOM));
    }

    @Override // defpackage.dbk
    public final int S() {
        if (!bV()) {
            return 0;
        }
        if (czu.M(this.G)) {
            this.G = bO(this.v, YogaEdge.LEFT);
        }
        return czu.f(this.G);
    }

    @Override // defpackage.dbk
    public final int T() {
        if (!bV()) {
            return 0;
        }
        if (czu.M(this.H)) {
            this.H = bO(this.v, YogaEdge.RIGHT);
        }
        return czu.f(this.H);
    }

    @Override // defpackage.dbk
    public final int U() {
        if (!bV()) {
            return 0;
        }
        return czu.f(this.v.a(YogaEdge.TOP));
    }

    @Override // defpackage.dbk
    public final cyr V() {
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        return (cyr) list.get(list.size() - 1);
    }

    @Override // defpackage.dbk
    public final cyr W() {
        if (this.b.isEmpty()) {
            return null;
        }
        return (cyr) this.b.get(0);
    }

    @Override // defpackage.dbk
    public final cyv X() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public final czz clone() {
        try {
            return (czz) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dbk
    public final dae Z() {
        return this.c;
    }

    @Override // defpackage.dbk, defpackage.dae
    public final float a() {
        return this.h;
    }

    @Override // defpackage.dbk
    public final void aA(cyr cyrVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(cyrVar);
    }

    @Override // defpackage.dbk
    public final void aB() {
        List list = null;
        if ((this.M & 2) != 0) {
            list = hz.t(null, "alignSelf");
        }
        if ((this.M & 4) != 0) {
            list = hz.t(list, "positionType");
        }
        if ((this.M & 8) != 0) {
            list = hz.t(list, "flex");
        }
        if ((this.M & 16) != 0) {
            list = hz.t(list, "flexGrow");
        }
        if ((this.M & 512) != 0) {
            list = hz.t(list, "margin");
        }
        if (list != null) {
            String valueOf = String.valueOf(TextUtils.join(", ", list));
            String simpleName = W().getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(simpleName).length());
            sb.append("You should not set ");
            sb.append(valueOf);
            sb.append(" to a root layout in ");
            sb.append(simpleName);
            czq.a(1, "DefaultInternalNode:ContextSpecificStyleSet", sb.toString());
        }
    }

    @Override // defpackage.dbk
    public final void aC(dam damVar, int[] iArr, float[] fArr) {
        this.M |= 268435456;
        this.i.x(YogaEdge.LEFT, damVar.c(YogaEdge.LEFT));
        this.i.x(YogaEdge.TOP, damVar.c(YogaEdge.TOP));
        this.i.x(YogaEdge.RIGHT, damVar.c(YogaEdge.RIGHT));
        this.i.x(YogaEdge.BOTTOM, damVar.c(YogaEdge.BOTTOM));
        this.i.x(YogaEdge.VERTICAL, damVar.c(YogaEdge.VERTICAL));
        this.i.x(YogaEdge.HORIZONTAL, damVar.c(YogaEdge.HORIZONTAL));
        this.i.x(YogaEdge.START, damVar.c(YogaEdge.START));
        this.i.x(YogaEdge.END, damVar.c(YogaEdge.END));
        this.i.x(YogaEdge.ALL, damVar.c(YogaEdge.ALL));
        System.arraycopy(iArr, 0, this.j, 0, 4);
        System.arraycopy(fArr, 0, this.k, 0, 4);
    }

    @Override // defpackage.dbk
    public final void aD(float f, float f2) {
        bT(this);
        this.i.r(f, f2);
        for (cyr cyrVar : this.b) {
            cyrVar.ar();
        }
    }

    @Override // defpackage.dbk
    public final void aE() {
        this.i.s();
    }

    @Override // defpackage.dbk
    public final void aF(czt cztVar) {
        if (this.C == null) {
            this.C = new HashSet();
        }
        this.C.add(cztVar);
    }

    @Override // defpackage.dbk
    public final void aG(dae daeVar) {
        if (daeVar instanceof dbk) {
            dbk dbkVar = (dbk) daeVar;
            if (dbkVar.aW()) {
                this.c = dbkVar.aj();
                return;
            }
        }
        this.c = daeVar;
    }

    @Override // defpackage.dbk
    public final void aH(YogaMeasureFunction yogaMeasureFunction) {
        this.i.O(yogaMeasureFunction);
    }

    @Override // defpackage.dbk
    public final void aI(dbk dbkVar) {
        if (dbkVar != cyv.a) {
            dbkVar.ah().c = this;
        }
        ah().b = dbkVar;
    }

    @Override // defpackage.dbk
    public final void aJ(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            this.i.K(View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            this.i.F(Float.NaN);
        } else if (mode != 1073741824) {
        } else {
            this.i.F(View.MeasureSpec.getSize(i));
        }
    }

    @Override // defpackage.dbk
    public final void aK(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            this.i.M(View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            this.i.Y(Float.NaN);
        } else if (mode != 1073741824) {
        } else {
            this.i.Y(View.MeasureSpec.getSize(i));
        }
    }

    @Override // defpackage.dbk
    public final boolean aL() {
        return this.d;
    }

    @Override // defpackage.dbk
    public final boolean aM() {
        dbj dbjVar = this.l;
        return (dbjVar == null || dbjVar.b == null) ? false : true;
    }

    @Override // defpackage.dbk
    public final boolean aN() {
        return this.i.ab();
    }

    @Override // defpackage.dbk
    public final boolean aO() {
        return (this.M & 1073741824) != 0;
    }

    @Override // defpackage.dbk
    public final boolean aP() {
        return (this.M & 33554432) != 0;
    }

    @Override // defpackage.dbk
    public final boolean aQ() {
        return !TextUtils.isEmpty(this.w);
    }

    @Override // defpackage.dbk
    public final boolean aR() {
        return (this.m == null && this.n == null && this.o == null && this.p == null && this.q == null && this.r == null && this.s == null) ? false : true;
    }

    @Override // defpackage.dbk
    public final boolean aS() {
        return this.E;
    }

    @Override // defpackage.dbk
    public final boolean aT() {
        return (this.M & 128) == 0 || this.F == 0;
    }

    @Override // defpackage.dbk
    public final boolean aU() {
        return (this.i == null || this.a == null) ? false : true;
    }

    @Override // defpackage.dbk
    public final boolean aV() {
        return (this.M & 1) == 0 || L() == YogaDirection.INHERIT;
    }

    @Override // defpackage.dbk
    public final boolean aW() {
        dbj dbjVar = this.l;
        return dbjVar != null && dbjVar.a;
    }

    @Override // defpackage.dbk
    public final boolean aX() {
        int[] iArr = this.j;
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return (this.i.a(YogaEdge.LEFT) == 0.0f && this.i.a(YogaEdge.TOP) == 0.0f && this.i.a(YogaEdge.RIGHT) == 0.0f && this.i.a(YogaEdge.BOTTOM) == 0.0f) ? false : true;
            }
        }
        return false;
    }

    @Override // defpackage.dbk
    public final float[] aY() {
        return this.k;
    }

    @Override // defpackage.dbk
    public final int[] aZ() {
        return this.j;
    }

    @Override // defpackage.dbk
    public final daq aa() {
        return this.o;
    }

    @Override // defpackage.dbk
    public final daq ab() {
        return this.q;
    }

    @Override // defpackage.dbk
    public final daq ac() {
        return this.r;
    }

    @Override // defpackage.dbk
    public final daq ad() {
        return this.n;
    }

    @Override // defpackage.dbk
    public final daq ae() {
        return this.p;
    }

    @Override // defpackage.dbk
    public final daq af() {
        return this.s;
    }

    @Override // defpackage.dbk
    public final daq ag() {
        return this.m;
    }

    @Override // defpackage.dbk
    public final dbj ah() {
        if (this.l == null) {
            this.l = new dbj();
        }
        return this.l;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, dbk] */
    @Override // defpackage.dae
    /* renamed from: ai */
    public final dbk g(int i) {
        return this.i.l(i).p();
    }

    @Override // defpackage.dbk
    public final dbk aj() {
        dbj dbjVar = this.l;
        if (dbjVar != null) {
            return dbjVar.b;
        }
        return null;
    }

    @Override // defpackage.dbk
    public final dbk ak() {
        dbj dbjVar = this.l;
        if (dbjVar != null) {
            return dbjVar.c;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, dbk] */
    @Override // defpackage.dbk
    public final dbk al() {
        dna dnaVar = this.i;
        if (dnaVar == null || dnaVar.m() == null) {
            return null;
        }
        return this.i.m().p();
    }

    @Override // defpackage.dbk
    public final dbk am(cyv cyvVar, cyr cyrVar) {
        Set g;
        ddm ddmVar = cyvVar.d;
        if (ddmVar == null) {
            g = Collections.emptySet();
        } else {
            g = ddmVar.g();
        }
        return bR(cyvVar, this, cyrVar, g);
    }

    @Override // defpackage.dbk
    public final YogaDirection an() {
        return this.i.j();
    }

    @Override // defpackage.dbk
    public final YogaDirection ao() {
        dna dnaVar = this.i;
        while (dnaVar != null && dnaVar.i() == YogaDirection.INHERIT) {
            dnaVar = dnaVar.m();
        }
        return dnaVar == null ? YogaDirection.INHERIT : dnaVar.i();
    }

    @Override // defpackage.dbk
    public final dna ap() {
        return this.i;
    }

    @Override // defpackage.dbk
    public final String aq() {
        return this.B;
    }

    @Override // defpackage.dbk
    public final String ar() {
        return this.w;
    }

    @Override // defpackage.dbk
    public final String as() {
        return this.x;
    }

    @Override // defpackage.dbk
    public final ArrayList at() {
        return this.y;
    }

    @Override // defpackage.dbk
    public final ArrayList au() {
        return this.A;
    }

    @Override // defpackage.dbk
    public final List av() {
        return this.b;
    }

    @Override // defpackage.dbk
    public final List aw() {
        return this.D;
    }

    @Override // defpackage.dbk
    public final void ax(dee deeVar) {
        if (this.y == null) {
            this.y = new ArrayList(1);
        }
        this.y.add(deeVar);
    }

    @Override // defpackage.dbk
    public final void ay(List list) {
        if (this.A == null) {
            this.A = new ArrayList(list.size());
        }
        this.A.addAll(list);
    }

    @Override // defpackage.dbk
    public final void az(cyr cyrVar) {
        this.b.add(cyrVar);
    }

    @Override // defpackage.dbk, defpackage.dae
    public final float b() {
        return this.g;
    }

    @Override // defpackage.dbk
    public final void bA(int i) {
        this.M |= 4294967296L;
        this.N = i;
    }

    @Override // defpackage.dbk
    public final void bB(daq daqVar) {
        this.M |= 16777216;
        this.p = bQ(this.p, daqVar);
    }

    @Override // defpackage.dbk
    public final void bC(daq daqVar) {
        this.M |= 2147483648L;
        this.s = bQ(this.s, daqVar);
    }

    @Override // defpackage.dbk
    public final void bD(daq daqVar) {
        this.M |= 1048576;
        this.m = bQ(this.m, daqVar);
    }

    @Override // defpackage.dbk
    public final void bE(YogaWrap yogaWrap) {
        this.i.aa(yogaWrap);
    }

    @Override // defpackage.dbk
    public final void bF() {
        this.E = true;
    }

    @Override // defpackage.dbk
    public final void bG() {
        this.M |= 256;
    }

    @Override // defpackage.dbk
    public final void bH(YogaFlexDirection yogaFlexDirection) {
        this.i.C(yogaFlexDirection);
    }

    @Override // defpackage.dbk
    public final void bI() {
        this.M |= 524288;
    }

    @Override // defpackage.dbk
    public final void bJ() {
    }

    @Override // defpackage.dbk
    public final void bK() {
    }

    @Override // defpackage.dbk
    public final void bL() {
    }

    @Override // defpackage.dbk
    public final void bM() {
    }

    @Override // defpackage.dbk
    public final aflw bN() {
        dbj dbjVar = this.l;
        if (dbjVar != null) {
            return dbjVar.f;
        }
        return null;
    }

    @Override // defpackage.dbk
    public final int ba() {
        return this.N;
    }

    @Override // defpackage.dbk
    public final dab bb() {
        return this.O;
    }

    @Override // defpackage.dbk
    public final dab bc() {
        if (this.O == null) {
            this.O = new dab();
        }
        return this.O;
    }

    @Override // defpackage.dbk
    public final void bd(dab dabVar) {
        this.O = dabVar;
    }

    @Override // defpackage.dbk
    public final void be(YogaAlign yogaAlign) {
        this.i.t(yogaAlign);
    }

    @Override // defpackage.dbk
    public final void bf(YogaAlign yogaAlign) {
        this.i.u(yogaAlign);
    }

    @Override // defpackage.dbk
    public final void bg(Drawable drawable) {
        this.M |= 262144;
        this.t = drawable;
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            if (rect.bottom == 0 && rect.top == 0 && rect.left == 0 && rect.right == 0) {
                return;
            }
            v(YogaEdge.LEFT, rect.left);
            v(YogaEdge.TOP, rect.top);
            v(YogaEdge.RIGHT, rect.right);
            v(YogaEdge.BOTTOM, rect.bottom);
        }
    }

    @Override // defpackage.dbk
    public final void bh(cyi cyiVar) {
        YogaEdge yogaEdge;
        this.M |= 268435456;
        int[] iArr = cyiVar.b;
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                yogaEdge = YogaEdge.LEFT;
            } else if (i == 1) {
                yogaEdge = YogaEdge.TOP;
            } else if (i != 2) {
                yogaEdge = YogaEdge.BOTTOM;
            } else {
                yogaEdge = YogaEdge.RIGHT;
            }
            int i2 = cyiVar.b[i];
            dbj dbjVar = this.l;
            if (dbjVar == null || !dbjVar.a) {
                this.i.x(yogaEdge, i2);
            } else {
                dbj ah = ah();
                if (ah.e == null) {
                    ah.e = new dam();
                }
                ah.e.d(yogaEdge, i2);
            }
        }
        System.arraycopy(cyiVar.c, 0, this.j, 0, 4);
        System.arraycopy(cyiVar.a, 0, this.k, 0, 4);
        PathEffect pathEffect = cyiVar.d;
    }

    @Override // defpackage.dbk
    public final void bi(cyr cyrVar) {
        if (cyrVar != null) {
            bj(dbm.b(this.a, cyrVar));
        }
    }

    public final void bj(dbk dbkVar) {
        if (dbkVar == null || dbkVar == cyv.a) {
            return;
        }
        this.i.q(dbkVar.ap(), this.i.h());
    }

    @Override // defpackage.dbk
    public final void bk(daq daqVar) {
        this.M |= 2097152;
        this.o = bQ(this.o, daqVar);
    }

    @Override // defpackage.dbk
    public final void bl(daq daqVar) {
        this.M |= 4194304;
        this.q = bQ(this.q, daqVar);
    }

    @Override // defpackage.dbk
    public final void bm() {
    }

    @Override // defpackage.dbk
    public final void bn() {
    }

    @Override // defpackage.dbk
    public final void bo() {
    }

    @Override // defpackage.dbk
    public final void bp() {
    }

    @Override // defpackage.dbk
    public final void bq(int i) {
        this.M |= 128;
        this.F = i;
    }

    @Override // defpackage.dbk
    public final void br(daq daqVar) {
        this.M |= 8388608;
        this.r = bQ(this.r, daqVar);
    }

    @Override // defpackage.dbk
    public final void bs(YogaJustify yogaJustify) {
        this.i.H(yogaJustify);
    }

    @Override // defpackage.dbk
    public final void bt(daq daqVar) {
        this.M |= Long.MIN_VALUE;
        this.n = bQ(this.n, daqVar);
    }

    @Override // defpackage.dbk
    public final void bu() {
        this.d = true;
    }

    @Override // defpackage.dbk
    public final void bv() {
        this.M |= 536870912;
        bF();
    }

    @Override // defpackage.dbk
    public final void bw() {
        this.M |= 1073741824;
        bF();
    }

    @Override // defpackage.dbk
    public final void bx(String str) {
        this.B = str;
    }

    @Override // defpackage.dbk
    public final void by(YogaEdge yogaEdge, int i) {
        if (this.v == null) {
            this.v = new dam();
        }
        this.M |= 33554432;
        this.v.d(yogaEdge, i);
    }

    @Override // defpackage.dbk
    public final void bz(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.M |= 134217728;
            this.w = str;
            this.x = str2;
        }
    }

    @Override // defpackage.dbk, defpackage.dae
    public final int c() {
        return this.i.h();
    }

    @Override // defpackage.dbk, defpackage.dae
    public final int d() {
        return this.f;
    }

    @Override // defpackage.dbk, defpackage.dae
    public final int e() {
        return this.e;
    }

    @Override // defpackage.dae
    public final cyr f() {
        return W();
    }

    @Override // defpackage.dae
    public final dbn h() {
        return null;
    }

    @Override // defpackage.dae
    public final dbn i() {
        return null;
    }

    @Override // defpackage.dae
    public final dbn j() {
        return null;
    }

    @Override // defpackage.dbo
    public final void k(YogaEdge yogaEdge, float f) {
        this.M |= 512;
        this.i.J(yogaEdge, f);
    }

    @Override // defpackage.dbo
    public final void ka(YogaAlign yogaAlign) {
        this.M |= 2;
        this.i.v(yogaAlign);
    }

    @Override // defpackage.dbo
    public final void kb(float f) {
        this.M |= 67108864;
        this.i.w(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.czr
    public final /* bridge */ /* synthetic */ void kc(Object obj) {
        dam damVar;
        if (obj == cyv.a) {
            return;
        }
        if (this.O != null) {
            if (obj.bb() == null) {
                obj.bd(this.O);
            } else {
                this.O.A(obj.bc());
            }
        }
        if (obj.aV()) {
            obj.kj(L());
        }
        if (obj.aT()) {
            obj.bq(this.F);
        }
        if ((this.M & 256) != 0) {
            obj.bG();
        }
        if ((this.M & 262144) != 0) {
            obj.bg(this.t);
        }
        if ((this.M & 524288) != 0) {
            obj.bI();
        }
        if (this.E) {
            obj.bF();
        }
        if ((this.M & 1048576) != 0) {
            obj.bD(this.m);
        }
        if ((this.M & Long.MIN_VALUE) != 0) {
            obj.bt(this.n);
        }
        if ((this.M & 2097152) != 0) {
            obj.bk(this.o);
        }
        if ((this.M & 4194304) != 0) {
            obj.bl(this.q);
        }
        if ((this.M & 8388608) != 0) {
            obj.br(this.r);
        }
        if ((this.M & 16777216) != 0) {
            obj.bB(this.p);
        }
        if ((this.M & 2147483648L) != 0) {
            obj.bC(this.s);
        }
        String str = this.B;
        if (str != null) {
            obj.bx(str);
        }
        if ((this.M & 1024) != 0) {
            dbj dbjVar = this.l;
            if (dbjVar != null && dbjVar.d != null) {
                for (int i = 0; i < dam.a; i++) {
                    float b = this.l.d.b(i);
                    if (!czu.M(b)) {
                        YogaEdge a = YogaEdge.a(i);
                        boolean[] zArr = this.u;
                        if (zArr == null || !zArr[a.j]) {
                            obj.v(a, (int) b);
                        } else {
                            obj.u(a, b);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("copyInto() must be used when resolving a nestedTree. If padding was set on the holder node, we must have a mNestedTreePadding instance");
            }
        }
        if ((this.M & 268435456) != 0) {
            dbj dbjVar2 = this.l;
            if (dbjVar2 == null || (damVar = dbjVar2.e) == null) {
                throw new IllegalStateException("copyInto() must be used when resolving a nestedTree.If border width was set on the holder node, we must have a mNestedTreeBorderWidth instance");
            }
            obj.aC(damVar, this.j, this.k);
        }
        if ((this.M & 134217728) != 0) {
            obj.bz(this.w, this.x);
        }
        if ((this.M & 4294967296L) != 0) {
            obj.bA(this.N);
        }
        if ((this.M & 536870912) != 0) {
            obj.bv();
        }
        if ((this.M & 1073741824) == 0) {
            return;
        }
        obj.bw();
    }

    @Override // defpackage.dbo
    public final void kd(float f) {
        this.M |= 64;
        this.i.B(f);
    }

    @Override // defpackage.dbo
    public final void ke(int i) {
        this.M |= 64;
        this.i.A(i);
    }

    @Override // defpackage.dbo
    public final void kf(float f) {
        this.M |= 16;
        this.i.D(f);
    }

    @Override // defpackage.dbo
    public final void kg(float f) {
        this.M |= 32;
        this.i.E(f);
    }

    @Override // defpackage.dbo
    public final void kh(float f) {
        this.M |= 32768;
        this.i.G(f);
    }

    @Override // defpackage.dbo
    public final void ki(int i) {
        this.M |= 32768;
        this.i.F(i);
    }

    @Override // defpackage.dbo
    public final void kj(YogaDirection yogaDirection) {
        this.M |= 1;
        this.i.z(yogaDirection);
    }

    @Override // defpackage.dbk, defpackage.dae
    public final void kk(int i) {
        this.f = i;
    }

    @Override // defpackage.dbk, defpackage.dae
    public final void kl(float f) {
        this.h = f;
    }

    @Override // defpackage.dbk, defpackage.dae
    public final void km(float f) {
        this.g = f;
    }

    @Override // defpackage.dbk, defpackage.dae
    public final void kn(int i) {
        this.e = i;
    }

    @Override // defpackage.dbo
    public final void l(YogaEdge yogaEdge, int i) {
        this.M |= 512;
        this.i.I(yogaEdge, i);
    }

    @Override // defpackage.dbo
    public final void m(float f) {
        this.M |= 131072;
        this.i.L(f);
    }

    @Override // defpackage.dbo
    public final void n(int i) {
        this.M |= 131072;
        this.i.K(i);
    }

    @Override // defpackage.dbo
    public final void o(float f) {
        this.M |= 16384;
        this.i.N(f);
    }

    @Override // defpackage.dbo
    public final void p(int i) {
        this.M |= 16384;
        this.i.M(i);
    }

    @Override // defpackage.dbo
    public final void q(float f) {
        this.M |= 65536;
        this.i.Q(f);
    }

    @Override // defpackage.dbo
    public final void r(int i) {
        this.M |= 65536;
        this.i.P(i);
    }

    @Override // defpackage.dbo
    public final void s(float f) {
        this.M |= 8192;
        this.i.S(f);
    }

    @Override // defpackage.dbo
    public final void t(int i) {
        this.M |= 8192;
        this.i.R(i);
    }

    @Override // defpackage.dbo
    public final void w(YogaEdge yogaEdge, float f) {
        this.M |= 2048;
        this.i.W(yogaEdge, f);
    }

    @Override // defpackage.dbo
    public final void x(YogaEdge yogaEdge, int i) {
        this.M |= 2048;
        this.i.V(yogaEdge, i);
    }

    @Override // defpackage.dbo
    public final void y(YogaPositionType yogaPositionType) {
        this.M |= 4;
        this.i.X(yogaPositionType);
    }

    @Override // defpackage.dbo
    public final void z(float f) {
        this.M |= 4096;
        this.i.Z(f);
    }

    @Override // defpackage.dbo
    public final void u(YogaEdge yogaEdge, float f) {
        this.M |= 1024;
        dbj dbjVar = this.l;
        if (dbjVar == null || !dbjVar.a) {
            this.i.U(yogaEdge, f);
            return;
        }
        bP().d(yogaEdge, f);
        bU(yogaEdge, true);
    }

    @Override // defpackage.dbo
    public final void v(YogaEdge yogaEdge, int i) {
        this.M |= 1024;
        dbj dbjVar = this.l;
        if (dbjVar == null || !dbjVar.a) {
            this.i.T(yogaEdge, i);
            return;
        }
        bP().d(yogaEdge, i);
        bU(yogaEdge, false);
    }
}
