package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bgnb  reason: default package */
/* loaded from: classes3.dex */
public final class bgnb extends cqqw {
    private final Activity a;
    private final btvo b;
    private final cjqy c;
    private final bgns d;
    private final bgnv e;
    private final apnq f;

    public bgnb(Activity activity, btvo btvoVar, cjqy cjqyVar, bgns bgnsVar, bgnv bgnvVar, apnq apnqVar) {
        this.a = activity;
        this.b = btvoVar;
        this.c = cjqyVar;
        this.d = bgnsVar;
        this.e = bgnvVar;
        this.f = apnqVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 2) {
            cjqy cjqyVar = this.c;
            cjql e = cjqg.e(recyclerView);
            cjtd n = this.d.n();
            dbsk.s(n);
            cjqyVar.P(e, n, dead.LEFT);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int abs;
        if (this.b.getPlaceSheetParameters().w()) {
            double width = recyclerView.getWidth();
            Double.isNaN(width);
            int floor = (int) Math.floor(width * 0.45d);
            int layoutDirection = this.a.getResources().getConfiguration().getLayoutDirection();
            aag aagVar = (aag) recyclerView.l;
            int i3 = 0;
            if (aagVar != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= aagVar.aJ()) {
                        break;
                    }
                    View aK = aagVar.aK(i4);
                    dbsk.s(aK);
                    if (layoutDirection == 1) {
                        abs = Math.abs(aK.getLeft() - recyclerView.getRight());
                    } else {
                        abs = Math.abs(aK.getRight() - recyclerView.getLeft());
                    }
                    if (abs >= floor) {
                        i3 = i4 + aagVar.ac();
                        break;
                    }
                    i4++;
                }
                i3 = (i3 - (i3 / 2)) + 1;
            }
            int i5 = i3 - 1;
            this.e.c(i3);
            cqkx.p(this.e);
            if (!(this.d.l(i5) instanceof bgoc)) {
                return;
            }
            this.f.c((bgoc) this.d.l(i5));
        }
    }
}
