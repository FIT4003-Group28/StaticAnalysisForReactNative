package defpackage;

import android.graphics.Rect;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: kxl  reason: default package */
/* loaded from: classes7.dex */
final class kxl implements Comparator<Rect> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int min = Math.min(rect3.width(), rect3.height());
        int max = Math.max(rect3.width(), rect3.height());
        int min2 = Math.min(rect4.width(), rect4.height());
        int max2 = Math.max(rect4.width(), rect4.height());
        if (min <= min2) {
            if (min < min2) {
                return 1;
            }
            if (max <= max2) {
                if (max < max2) {
                    return 1;
                }
                if (rect3.width() <= rect4.width()) {
                    if (rect3.width() < rect4.width()) {
                        return 1;
                    }
                    if (rect3.left <= rect4.left) {
                        if (rect3.left < rect4.left) {
                            return 1;
                        }
                        if (rect3.top <= rect4.top) {
                            return rect3.top < rect4.top ? 1 : 0;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
