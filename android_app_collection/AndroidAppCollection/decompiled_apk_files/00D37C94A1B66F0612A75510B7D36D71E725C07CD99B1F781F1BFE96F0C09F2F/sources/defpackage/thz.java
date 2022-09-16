package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: thz  reason: default package */
/* loaded from: classes4.dex */
public class thz {
    private final int q;
    private final float r;
    public final HashMap a = new HashMap();
    public xo b = null;
    public ajme p = null;
    public RecyclerView c = null;
    public boolean d = true;
    public final thy e = new thy(this);
    public final View.OnLayoutChangeListener f = new thw(this);
    public final thv g = new thv(this);
    public int h = -1;
    public int i = -1;
    public final ArrayList j = new ArrayList();
    public int k = -1;
    public int l = -1;
    public int m = 1;
    public int n = -1;
    public int o = -1;
    private boolean s = false;
    private final thx t = new thx(0, null, null);

    public thz(int i, float f) {
        this.q = i;
        this.r = f;
    }

    private static final boolean a(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    public final int b(int i) {
        thx thxVar = this.t;
        thxVar.a = i;
        int binarySearch = Collections.binarySearch(this.j, thxVar, fay.r);
        return binarySearch < 0 ? -(binarySearch + 1) : binarySearch;
    }

    public final void c() {
        int J2;
        int L;
        thx thxVar;
        int i;
        if (this.j.isEmpty() || this.i == 0 || this.h == 0) {
            return;
        }
        xw xwVar = this.c.n;
        if (xwVar instanceof LinearLayoutManager) {
            J2 = ((LinearLayoutManager) xwVar).J();
        } else {
            J2 = xwVar instanceof GridLayoutManager ? ((GridLayoutManager) xwVar).J() : 0;
        }
        this.k = J2;
        xw xwVar2 = this.c.n;
        if (xwVar2 instanceof LinearLayoutManager) {
            L = ((LinearLayoutManager) xwVar2).L();
        } else {
            L = xwVar2 instanceof GridLayoutManager ? ((GridLayoutManager) xwVar2).L() : -1;
        }
        this.l = L;
        int max = Math.max(this.m, (L - this.k) + 1);
        this.m = max;
        int max2 = Math.max(0, this.k - Math.round(max * this.r));
        int round = this.l + Math.round(this.m * this.r);
        int i2 = this.q;
        if ((round - max2) + 1 < i2) {
            round = (i2 + max2) - 1;
        }
        if (round >= this.b.b()) {
            round = this.b.b() - 1;
        }
        int i3 = this.n;
        if (max2 == i3 && round == this.o && !this.s) {
            return;
        }
        this.s = false;
        int min = i3 < 0 ? max2 : Math.min(i3, max2);
        int i4 = this.o;
        int max3 = i4 < 0 ? round : Math.max(i4, round);
        tib tibVar = null;
        for (int b = b(min); b < this.j.size() && (i = (thxVar = (thx) this.j.get(b)).a) <= max3; b++) {
            if (!a(i, max2, round) || thxVar.b) {
                if (!a(thxVar.a, max2, round) && thxVar.b) {
                    thxVar.b = false;
                    thxVar.c.b();
                }
            } else {
                if (tibVar == null) {
                    tibVar = new tib(this.c.getWidth(), this.c.getHeight(), this.d);
                }
                thxVar.b = true;
                tig tigVar = thxVar.c;
                int i5 = tibVar.c ? tibVar.a : tibVar.b;
                if (tigVar.g == null || i5 != tigVar.h) {
                    tigVar.h = i5;
                    ComponentTree a = tigVar.a();
                    int makeMeasureSpec = tibVar.c ? View.MeasureSpec.makeMeasureSpec(tibVar.a, 1073741824) : 0;
                    int makeMeasureSpec2 = tibVar.c ? 0 : View.MeasureSpec.makeMeasureSpec(tibVar.b, 1073741824);
                    cyr cyrVar = tigVar.f;
                    if (cyrVar != null) {
                        a.x(cyrVar, makeMeasureSpec, makeMeasureSpec2, true, null, 1, null);
                    } else {
                        throw new IllegalArgumentException("Root component can't be null");
                    }
                }
            }
        }
        this.n = max2;
        this.o = round;
    }

    public final void d() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            thx thxVar = (thx) arrayList.get(i);
            if (thxVar.b) {
                thxVar.c.b();
                thxVar.b = false;
            }
        }
        this.k = -1;
        this.l = -1;
        this.n = -1;
        this.o = -1;
        this.m = 1;
    }

    public final void e() {
        if ((!this.d || this.c.getWidth() == this.h) && (this.d || this.c.getHeight() == this.i)) {
            return;
        }
        this.h = this.c.getWidth();
        this.i = this.c.getHeight();
        d();
        c();
    }

    public void f() {
        throw null;
    }
}
