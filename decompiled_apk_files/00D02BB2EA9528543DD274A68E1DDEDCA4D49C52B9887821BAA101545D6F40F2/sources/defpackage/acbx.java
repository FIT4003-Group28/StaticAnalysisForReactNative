package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acbx  reason: default package */
/* loaded from: classes2.dex */
public final class acbx extends adz {
    public int c = 1;
    private final int d;
    private aax e;

    public acbx(int i) {
        this.d = i;
    }

    private final aax h(abs absVar) {
        aax aaxVar = this.e;
        if (aaxVar == null || aaxVar.a != absVar) {
            this.e = aax.s(absVar);
        }
        return this.e;
    }

    @Override // defpackage.adz
    public final int[] a(abs absVar, View view) {
        int h = h(absVar).h(view);
        int i = this.c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                h += this.d;
            } else if (i2 != 2) {
                int i3 = -h;
                int i4 = this.d;
                if (i3 >= i4 / 2) {
                    h = i3 < i4 ? h + i4 : 0;
                }
            }
            this.c = 1;
            return new int[]{0, h};
        }
        throw null;
    }

    @Override // defpackage.adz
    public final int b(abs absVar, int i, int i2) {
        this.c = i2 > 0 ? 2 : 3;
        View c = c(absVar);
        if (c == null) {
            return -1;
        }
        return abs.bm(c);
    }

    @Override // defpackage.adz
    public final View c(abs absVar) {
        int d;
        int h;
        aax h2 = h(absVar);
        int aJ = absVar.aJ();
        if (aJ != 0) {
            View view = null;
            for (int i = 0; i < aJ; i++) {
                View aK = absVar.aK(i);
                if (aK != null && aK.getId() == R.id.visual_explore_pivots_carousel_background) {
                    view = aK;
                }
            }
            if (view != null && (d = h2.d()) >= (h = h2.h(view)) && d <= h + this.d) {
                return view;
            }
        }
        return null;
    }
}
