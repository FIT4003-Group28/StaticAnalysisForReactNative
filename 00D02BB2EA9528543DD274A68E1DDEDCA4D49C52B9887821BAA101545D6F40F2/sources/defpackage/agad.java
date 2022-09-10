package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: agad  reason: default package */
/* loaded from: classes2.dex */
public class agad {
    public final cqhn a;
    public final btrm b;
    public final agab c = new agab(this);
    public final cqkf<agzp> d;
    public final agzp e;
    public final View.OnLayoutChangeListener f;
    public View g;
    public View h;
    public final ArrayList<agac> i;
    public boolean j;
    private final RecyclerView k;
    private boolean l;

    public agad(cqhn cqhnVar, btrm btrmVar, agzo agzoVar, cqkj cqkjVar, RecyclerView recyclerView, agzn agznVar) {
        new afzz(this);
        this.f = new agaa(this);
        this.i = new ArrayList<>();
        this.l = true;
        this.a = cqhnVar;
        this.b = btrmVar;
        this.d = cqkjVar.e(new agkn());
        this.e = agzoVar.a(agznVar);
        this.j = true;
        this.k = recyclerView;
    }

    private final int i() {
        int i;
        if (!cjxu.f(this.k)) {
            return 0;
        }
        View I = this.k.l.I(0);
        if (I != null) {
            i = I.getTop() - ((ViewGroup.MarginLayoutParams) I.getLayoutParams()).topMargin;
        } else {
            i = -this.k.getHeight();
        }
        return this.k.getPaddingTop() - i;
    }

    private final boolean j() {
        return (this.h == null || this.g == null) ? false : true;
    }

    private static int[] k(View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(r1);
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = {(int) ((iArr2[0] - iArr[0]) - view.getTranslationX()), (int) ((iArr2[1] - iArr[1]) - view.getTranslationY())};
        if (bvox.a(view2)) {
            iArr2[0] = iArr2[0] + view.getWidth();
        }
        return iArr2;
    }

    public final void a() {
        this.b.a(this.c);
        this.d.c().removeOnLayoutChangeListener(this.f);
        this.d.e(null);
    }

    public final agxp b() {
        agxo bZ = agxp.h.bZ();
        boolean z = this.j;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxp agxpVar = (agxp) bZ.b;
        agxpVar.a |= 1;
        agxpVar.b = z;
        boolean booleanValue = this.e.a().booleanValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxp agxpVar2 = (agxp) bZ.b;
        agxpVar2.a |= 2;
        agxpVar2.c = booleanValue;
        boolean booleanValue2 = this.e.h().booleanValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxp agxpVar3 = (agxp) bZ.b;
        agxpVar3.a |= 4;
        agxpVar3.d = booleanValue2;
        boolean booleanValue3 = this.e.j().booleanValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxp agxpVar4 = (agxp) bZ.b;
        agxpVar4.a |= 8;
        agxpVar4.e = booleanValue3;
        boolean booleanValue4 = this.e.l().booleanValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxp agxpVar5 = (agxp) bZ.b;
        agxpVar5.a |= 16;
        agxpVar5.f = booleanValue4;
        int intValue = this.e.e().a().intValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxp agxpVar6 = (agxp) bZ.b;
        agxpVar6.a |= 32;
        agxpVar6.g = intValue;
        return bZ.bK();
    }

    public final View c() {
        return this.d.c();
    }

    public final void d() {
        int[] iArr;
        if (!j()) {
            return;
        }
        int i = i();
        if (!j()) {
            return;
        }
        int height = this.g.getHeight() - this.h.getHeight();
        int b = this.j ? height : akn.b(i, 0, height);
        float f = -b;
        this.g.setTranslationY(f);
        float f2 = b / height;
        ArrayList<agac> arrayList = this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            agac agacVar = arrayList.get(i2);
            if (agacVar.b != null) {
                agacVar.a.setTranslationX(iArr[0] * f2);
                agacVar.a.setTranslationY((agacVar.b[1] * f2) - f);
            }
            float f3 = agacVar.c;
            float f4 = agacVar.d;
            if (f3 != f4) {
                float f5 = f3 + ((f4 - f3) * f2);
                agacVar.a.setAlpha(f5);
                agacVar.a.setVisibility(f5 != 0.0f ? 0 : 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r2 <= (r0 / 3.0f)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r2 <= ((r3 + r3) / 3.0f)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        r7.l = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r4 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        r0 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        r0 = java.lang.Math.max(r0 - r2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r0 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r8 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r7.k.t(0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        r7.k.scrollBy(0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7.j()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.j
            r1 = 0
            if (r0 == 0) goto Lf
            r7.l = r1
            return
        Lf:
            android.view.View r0 = r7.g
            int r0 = r0.getHeight()
            android.view.View r2 = r7.h
            int r2 = r2.getHeight()
            int r0 = r0 - r2
            int r2 = r7.i()
            int r2 = defpackage.akn.b(r2, r1, r0)
            boolean r3 = r7.l
            r4 = 1
            r5 = 1077936128(0x40400000, float:3.0)
            if (r3 == 0) goto L33
            float r3 = (float) r2
            float r6 = (float) r0
            float r6 = r6 / r5
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L3c
            goto L3d
        L33:
            float r3 = (float) r0
            float r6 = (float) r2
            float r3 = r3 + r3
            float r3 = r3 / r5
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 > 0) goto L3c
            goto L3d
        L3c:
            r4 = 0
        L3d:
            r7.l = r4
            if (r4 == 0) goto L43
            int r0 = -r2
            goto L48
        L43:
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r0, r1)
        L48:
            if (r0 == 0) goto L57
            if (r8 == 0) goto L52
            android.support.v7.widget.RecyclerView r8 = r7.k
            r8.t(r1, r0)
            return
        L52:
            android.support.v7.widget.RecyclerView r8 = r7.k
            r8.scrollBy(r1, r0)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agad.e(boolean):void");
    }

    public final void f(cqjg cqjgVar) {
        View a = cqhu.a(this.g, cqjgVar);
        dbsk.s(a);
        View a2 = cqhu.a(this.h, cqjgVar);
        dbsk.s(a2);
        int[] k = k(a, this.g);
        int[] k2 = k(a2, this.h);
        k2[0] = k2[0] - k[0];
        k2[1] = k2[1] - k[1];
        this.i.add(new agac(a, k2, 1.0f, 1.0f));
    }

    public final void g(cqjg cqjgVar) {
        View a = cqhu.a(this.g, cqjgVar);
        dbsk.s(a);
        this.i.add(new agac(a, new int[]{0, 0}, 1.0f, 1.0f));
    }

    public final void h(cqjg cqjgVar) {
        View a = cqhu.a(this.g, cqjgVar);
        dbsk.s(a);
        View a2 = cqhu.a(a, agke.b);
        dbsk.s(a2);
        View a3 = cqhu.a(a, agke.a);
        dbsk.s(a3);
        this.i.add(new agac(a2, null, 0.0f, 1.0f));
        this.i.add(new agac(a3, null, 1.0f, 0.0f));
    }
}
