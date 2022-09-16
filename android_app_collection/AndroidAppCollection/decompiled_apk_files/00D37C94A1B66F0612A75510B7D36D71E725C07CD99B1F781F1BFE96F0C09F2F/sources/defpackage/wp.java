package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: wp  reason: default package */
/* loaded from: classes4.dex */
public final class wp {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(yd ydVar) {
        List list = this.l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((yo) this.l.get(i)).a;
                xx xxVar = (xx) view.getLayoutParams();
                if (!xxVar.qc() && this.d == xxVar.qa()) {
                    c(view);
                    return view;
                }
            }
            return null;
        }
        View c = ydVar.c(this.d);
        this.d += this.e;
        return c;
    }

    public final void b() {
        c(null);
    }

    public final void c(View view) {
        int qa;
        int size = this.l.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            View view3 = ((yo) this.l.get(i2)).a;
            xx xxVar = (xx) view3.getLayoutParams();
            if (view3 != view && !xxVar.qc() && (qa = (xxVar.qa() - this.d) * this.e) >= 0 && qa < i) {
                if (qa == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i = qa;
                }
            }
            i2++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((xx) view2.getLayoutParams()).qa();
        }
    }

    public final boolean d(yl ylVar) {
        int i = this.d;
        return i >= 0 && i < ylVar.a();
    }
}
