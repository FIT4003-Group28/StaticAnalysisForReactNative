package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.chromium.base.ApplicationStatus;
import org.chromium.net.impl.CronetLibraryLoader;
/* compiled from: PG */
/* renamed from: ajsy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajsy implements Runnable {
    private final /* synthetic */ int i;
    public static final ajsy h = new ajsy(16);
    public static final /* synthetic */ ajsy g = new ajsy(12);
    public static final /* synthetic */ ajsy f = new ajsy(11);
    public static final /* synthetic */ ajsy e = new ajsy(10);
    public static final /* synthetic */ ajsy d = new ajsy(9);
    public static final /* synthetic */ ajsy c = new ajsy(7);
    public static final /* synthetic */ ajsy b = new ajsy(6);
    public static final /* synthetic */ ajsy a = new ajsy(1);

    public /* synthetic */ ajsy() {
    }

    public /* synthetic */ ajsy(int i) {
        this.i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.i) {
            case 0:
                return;
            case 1:
                ajnw.a.d();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return;
            case 9:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            case 10:
                return;
            case 11:
                amna.h = null;
                return;
            case 12:
                Object remove = amna.b.remove();
                if (remove == amna.d) {
                    amna.c.pop();
                    return;
                } else {
                    amna.c.push((amlv) remove);
                    return;
                }
            case 13:
            case 14:
                return;
            case 15:
                ArrayList arrayList = new ArrayList(aznl.d.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) arrayList.get(i);
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        aznl.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            case 16:
                return;
            case 17:
                if (ApplicationStatus.a != null) {
                    return;
                }
                ApplicationStatus.a = new babr();
                ApplicationStatus.a(ApplicationStatus.a);
                return;
            case 18:
                new bacu();
                return;
            default:
                CronetLibraryLoader.b();
                return;
        }
    }
}
