package defpackage;

import android.graphics.Rect;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: amt  reason: default package */
/* loaded from: classes2.dex */
final class amt<T> implements Comparator<T> {
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final boolean c;

    public amt(boolean z) {
        this.c = z;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Rect rect = this.a;
        Rect rect2 = this.b;
        ((pc) t).j(rect);
        ((pc) t2).j(rect2);
        if (rect.top < rect2.top) {
            return -1;
        }
        if (rect.top > rect2.top) {
            return 1;
        }
        if (rect.left < rect2.left) {
            return this.c ? 1 : -1;
        } else if (rect.left > rect2.left) {
            return this.c ? -1 : 1;
        } else if (rect.bottom < rect2.bottom) {
            return -1;
        } else {
            if (rect.bottom > rect2.bottom) {
                return 1;
            }
            if (rect.right < rect2.right) {
                return this.c ? 1 : -1;
            } else if (rect.right <= rect2.right) {
                return 0;
            } else {
                return this.c ? -1 : 1;
            }
        }
    }
}
