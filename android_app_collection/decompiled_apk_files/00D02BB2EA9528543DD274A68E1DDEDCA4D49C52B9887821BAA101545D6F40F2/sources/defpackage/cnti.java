package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cnti  reason: default package */
/* loaded from: classes.dex */
public final class cnti {
    public static final Status a = new Status(8, "The connection to Google Play services was lost");
    public final Set<BasePendingResult<?>> b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final cnth c = new cnth(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends cnom> basePendingResult) {
        this.b.add(basePendingResult);
        basePendingResult.t(this.c);
    }

    public final void b() {
        BasePendingResult[] basePendingResultArr;
        boolean o;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.b.toArray(new BasePendingResult[0])) {
            basePendingResult.t(null);
            synchronized (basePendingResult.e) {
                if (basePendingResult.g.get() == null || !basePendingResult.i) {
                    basePendingResult.h();
                }
                o = basePendingResult.o();
            }
            if (o) {
                this.b.remove(basePendingResult);
            }
        }
    }
}
