package c.e.a.b.d.f;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class l {
    public static int a(int i, int i2) {
        long j = i << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }
}
