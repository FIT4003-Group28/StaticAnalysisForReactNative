package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cvwc  reason: default package */
/* loaded from: classes5.dex */
public final class cvwc {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public cvwc(Resources resources) {
        this.a = resources.getDimensionPixelSize(R.dimen.og_apd_large_ring_width);
        this.b = resources.getDimensionPixelSize(R.dimen.og_apd_small_ring_width);
        this.c = resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_large_ring);
        this.d = resources.getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_small_ring);
    }

    private final float e(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            i4 = this.a;
        } else if (i > i3) {
            int i5 = this.b;
            return i5 + ((this.a - i5) * ((i - i3) / (i2 - i3)));
        } else {
            i4 = this.b;
        }
        return i4;
    }

    public final float a(int i) {
        return e(i, this.c, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        return Math.round(c(i));
    }

    public final float c(int i) {
        return e(i, d(this.c), d(this.d));
    }

    public final int d(int i) {
        return i + Math.round(a(i) * 4.0f) + 2;
    }
}
