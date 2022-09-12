package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: PG */
/* renamed from: cmxk  reason: default package */
/* loaded from: classes5.dex */
public final class cmxk {
    public final Deque<cmxj> a;
    public final SparseArray<cmxi> b = new SparseArray<>();
    public final int c;
    private final int d;

    public cmxk(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.a = new ArrayDeque(i);
    }

    public static int d(int i) {
        if (i != 17) {
            if (i == 33) {
                return 130;
            }
            if (i == 66) {
                return 17;
            }
            if (i == 130) {
                return 33;
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append("Unsupported direction: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 66;
    }

    public final void a() {
        this.b.clear();
    }

    public final boolean b(long j, View view, View view2) {
        return (!c(j) || view == null || view2 == null) ? false : true;
    }

    public final boolean c(long j) {
        int i = this.d;
        return i < 0 || (i != 0 && SystemClock.elapsedRealtime() - j <= ((long) i));
    }
}
