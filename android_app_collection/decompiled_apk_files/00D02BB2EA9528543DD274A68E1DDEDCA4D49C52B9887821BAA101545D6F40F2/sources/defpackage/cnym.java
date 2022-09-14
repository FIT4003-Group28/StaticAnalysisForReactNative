package defpackage;

import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cnym  reason: default package */
/* loaded from: classes5.dex */
public final class cnym {
    private final ArrayList<TimeFilterImpl.Interval> b = new ArrayList<>();
    public int[] a = null;

    public final TimeFilterImpl a() {
        return new TimeFilterImpl(this.b, this.a);
    }

    public final void b(long j) {
        if (j < 0) {
            clcq.a(5);
            j = 0;
        }
        this.b.add(new TimeFilterImpl.Interval(j, Long.MAX_VALUE));
    }
}
