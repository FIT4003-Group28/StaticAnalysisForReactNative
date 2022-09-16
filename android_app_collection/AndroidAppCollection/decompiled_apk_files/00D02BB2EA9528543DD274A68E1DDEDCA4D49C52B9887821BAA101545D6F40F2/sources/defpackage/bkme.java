package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkme  reason: default package */
/* loaded from: classes3.dex */
final class bkme extends abp {
    final /* synthetic */ cqkp a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ Context i;
    final /* synthetic */ int j;
    final /* synthetic */ int k;
    final /* synthetic */ int l;
    final /* synthetic */ int m;
    final /* synthetic */ int n;
    final /* synthetic */ int o;
    final /* synthetic */ int p;
    private final ColorDrawable q = new ColorDrawable();

    public bkme(cqkp cqkpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, Context context, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.a = cqkpVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = context;
        this.j = i8;
        this.k = i9;
        this.l = i10;
        this.m = i11;
        this.n = i12;
        this.o = i13;
        this.p = i14;
    }

    private final boolean a(int i) {
        int i2 = i % 2;
        return bvox.b(this.i) ? i2 == 0 : i2 == 1;
    }

    private final int d() {
        int i = this.j;
        int i2 = this.k;
        return i + i2 + i2;
    }

    private final void e(RecyclerView recyclerView, Canvas canvas, View view) {
        int top = (view.getTop() - this.e) - d();
        int i = this.j + top;
        this.q.setColor(this.l);
        this.q.setBounds(0, top - this.k, recyclerView.getWidth(), top);
        this.q.draw(canvas);
        this.q.setColor(this.m);
        this.q.setBounds(0, top, recyclerView.getWidth(), i);
        this.q.draw(canvas);
        this.q.setColor(this.l);
        this.q.setBounds(0, i, recyclerView.getWidth(), this.k + i);
        this.q.draw(canvas);
    }

    private final void f(RecyclerView recyclerView, Canvas canvas, int i) {
        int i2 = this.n;
        int paddingLeft = recyclerView.getPaddingLeft();
        int i3 = this.p;
        int width = recyclerView.getWidth();
        int paddingRight = recyclerView.getPaddingRight();
        int i4 = this.p;
        this.q.setColor(this.o);
        this.q.setBounds(paddingLeft + i3, i, (width - paddingRight) - i4, i2 + i);
        this.q.draw(canvas);
    }

    private static final cqkp g(List<cqkp> list, int i) {
        int i2 = i + 1;
        cqkp cqkpVar = i2 < list.size() ? list.get(i2) : null;
        while (i2 < list.size() && (cqkpVar instanceof bkog)) {
            cqkpVar = list.get(i2);
            i2++;
        }
        return cqkpVar;
    }

    private static final cqkp h(List<cqkp> list, int i) {
        int i2 = i - 1;
        cqkp cqkpVar = i2 >= 0 ? list.get(i2) : null;
        while (i2 >= 0 && (cqkpVar instanceof bkog)) {
            cqkpVar = list.get(i2);
            i2--;
        }
        return cqkpVar;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        int Z = recyclerView.Z(view);
        if (Z == -1) {
            return;
        }
        List<cqkp> f = ((bklk) this.a).f();
        int size = f.size();
        cqkp cqkpVar = f.get(Z);
        if (cqkpVar instanceof bkog) {
            return;
        }
        cqkp g = g(f, Z);
        cqkp h = h(f, Z);
        if (cqkpVar instanceof bhry) {
            rect.set(a(Z) ? this.b : this.c, this.c, a(Z) ? this.c : this.b, this.c);
        } else {
            int i = 0;
            if (cqkpVar instanceof bklf) {
                int i2 = this.d;
                rect.set(0, i2, 0, i2);
            } else if (cqkpVar instanceof bknk) {
                bknk bknkVar = (bknk) cqkpVar;
                if (bknkVar.b().booleanValue()) {
                    rect.top = this.e;
                    if (!(g instanceof bknq)) {
                        i = this.f;
                    }
                    rect.bottom = i;
                } else if (!bknkVar.b().booleanValue() && (h instanceof bklf)) {
                    rect.set(0, this.g, 0, 0);
                }
            } else if (!(cqkpVar instanceof bkmv) || size == 1) {
                if (cqkpVar instanceof bknq) {
                    if (!(h instanceof actl)) {
                        int i3 = this.h;
                        rect.set(0, i3, 0, i3);
                    }
                } else if (cqkpVar instanceof bkmg) {
                    int childCount = recyclerView.getChildCount() - 1;
                    int size2 = ((bklk) this.a).f().size() - 1;
                    int i4 = 0;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        cqkp cqkpVar2 = ((bklk) this.a).f().get(size2);
                        View childAt = recyclerView.getChildAt(childCount);
                        if (childAt != null) {
                            dbsk.s(recyclerView.l);
                            i4 += abs.bj(childAt);
                        }
                        if ((cqkpVar2 instanceof bknk) && ((bknk) cqkpVar2).b().booleanValue()) {
                            rect.bottom = Math.max(0, recyclerView.getHeight() - i4);
                            break;
                        } else {
                            size2--;
                            childCount--;
                        }
                    }
                }
            } else {
                rect.set(0, this.e, 0, 0);
            }
        }
        if ((!(g instanceof bknk) || !((bknk) g).b().booleanValue()) && !(g instanceof bkmv)) {
            return;
        }
        rect.bottom += d();
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        List<cqkp> f = ((bklk) this.a).f();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int Z = recyclerView.Z(childAt);
            if (Z == -1) {
                return;
            }
            cqkp cqkpVar = f.get(Z);
            cqkp g = g(f, Z);
            cqkp h = h(f, Z);
            boolean z = cqkpVar instanceof bklf;
            if (!z || !(g instanceof bklf)) {
                if (!(cqkpVar instanceof bknk) || !((bknk) cqkpVar).b().booleanValue()) {
                    if (!(cqkpVar instanceof bkmv) || ((bkmv) cqkpVar).e().booleanValue()) {
                        if (!z || !(g instanceof bknk) || ((bknk) g).b().booleanValue()) {
                            if ((cqkpVar instanceof bknq) && !(h instanceof bknk)) {
                                f(recyclerView, canvas, childAt.getTop());
                            }
                        } else {
                            int bottom = childAt.getBottom() + this.d;
                            int i2 = this.n;
                            this.q.setColor(this.o);
                            this.q.setBounds(0, bottom, recyclerView.getWidth(), i2 + bottom);
                            this.q.draw(canvas);
                        }
                    } else {
                        e(recyclerView, canvas, childAt);
                    }
                } else {
                    e(recyclerView, canvas, childAt);
                }
            } else {
                f(recyclerView, canvas, childAt.getBottom() + this.d);
            }
        }
    }
}
