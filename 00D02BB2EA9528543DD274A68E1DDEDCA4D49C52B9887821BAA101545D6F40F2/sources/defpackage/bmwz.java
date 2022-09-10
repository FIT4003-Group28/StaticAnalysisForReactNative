package defpackage;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmwz  reason: default package */
/* loaded from: classes3.dex */
abstract class bmwz {
    public static bmwz d(List<Rect> list) {
        return new bmwh(dcdc.r(list));
    }

    public abstract dcdc<Rect> a();

    public final Rect b(int i) {
        return a().size() > i ? a().get(i) : new Rect();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c(final float f, final float f2) {
        return ((Float) Collections.min(dchl.k(a(), new dbrn(f, f2) { // from class: bmwy
            private final float a;
            private final float b;

            {
                this.a = f;
                this.b = f2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Float.valueOf(bmxd.d((Rect) obj, this.a, this.b));
            }
        }))).floatValue();
    }
}
