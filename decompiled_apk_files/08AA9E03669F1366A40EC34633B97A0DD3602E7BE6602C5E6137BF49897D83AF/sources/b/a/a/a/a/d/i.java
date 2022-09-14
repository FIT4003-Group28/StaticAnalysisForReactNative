package b.a.a.a.a.d;

import android.content.Context;
/* compiled from: TimeBasedFileRollOverRunnable.java */
/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1160a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1161b;

    public i(Context context, e eVar) {
        this.f1160a = context;
        this.f1161b = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b.a.a.a.a.b.i.a(this.f1160a, "Performing time based file roll over.");
            if (this.f1161b.rollFileOver()) {
                return;
            }
            this.f1161b.cancelTimeBasedFileRollOver();
        } catch (Exception e) {
            b.a.a.a.a.b.i.a(this.f1160a, "Failed to roll over file", e);
        }
    }
}
