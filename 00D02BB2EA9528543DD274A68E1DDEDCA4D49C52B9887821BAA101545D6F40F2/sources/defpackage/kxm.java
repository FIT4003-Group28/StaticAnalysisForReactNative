package defpackage;

import android.content.Context;
import android.graphics.Rect;
import java.util.Collection;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: kxm  reason: default package */
/* loaded from: classes7.dex */
public final class kxm {
    public final Comparator<Rect> a = new kxl();
    public final ksi b;
    private final Context c;

    public kxm(Context context, ksi ksiVar) {
        dbsk.s(context);
        this.c = context;
        this.b = ksiVar;
    }

    public static void d(int i, int i2, int i3, int i4, dcdc<Rect> dcdcVar, Collection<Rect> collection, int i5) {
        dbsk.l(i5 <= dcdcVar.size());
        if (i >= i3 || i2 >= i4) {
            return;
        }
        if (i5 == dcdcVar.size()) {
            collection.add(new Rect(i, i2, i3, i4));
            return;
        }
        Rect rect = dcdcVar.get(i5);
        if (rect.left >= i3 || rect.top >= i4 || rect.right <= i || rect.bottom <= i2) {
            d(i, i2, i3, i4, dcdcVar, collection, i5 + 1);
            return;
        }
        int i6 = i5 + 1;
        d(i, i2, i3, Math.min(i4, rect.top), dcdcVar, collection, i6);
        d(Math.max(i, rect.right), i2, i3, i4, dcdcVar, collection, i6);
        d(i, i2, Math.min(i3, rect.left), i4, dcdcVar, collection, i6);
        d(i, Math.max(i2, rect.bottom), i3, i4, dcdcVar, collection, i6);
    }

    public final int a(kxo kxoVar, Rect rect) {
        int i;
        int b;
        Rect i2 = kxoVar.i();
        if (i2 == null) {
            i = 0;
        } else if (c()) {
            i = rect.right - i2.right;
        } else {
            i = i2.left;
        }
        int max = Math.max(i, kxoVar.f());
        if (kxoVar.b()) {
            int h = kxoVar.h();
            if (kxoVar.c()) {
                b = kxoVar.d();
            } else {
                b = this.b.b(nqo.Q);
            }
            return Math.max(max, h + b);
        }
        return max;
    }

    public final int b(kxo kxoVar, Rect rect) {
        Rect i = kxoVar.i();
        if (i == null) {
            return kxoVar.e();
        }
        return Math.max(kxoVar.e(), c() ? i.left : rect.right - i.right);
    }

    public final boolean c() {
        return this.c.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
