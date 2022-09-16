package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: pgw  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pgw implements ThreadFactory {
    private final /* synthetic */ int f;
    public static final /* synthetic */ pgw e = new pgw(5);
    public static final /* synthetic */ pgw d = new pgw(4);
    public static final /* synthetic */ pgw c = new pgw(3);
    public static final /* synthetic */ pgw b = new pgw(2);
    public static final /* synthetic */ pgw a = new pgw();

    private /* synthetic */ pgw() {
    }

    public pgw(int i) {
        this.f = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                return new alf(runnable);
            }
            if (i == 2) {
                return new Thread(runnable);
            }
            if (i == 3) {
                return new Thread(runnable, "LensSvConn");
            }
            if (i == 4) {
                return new Thread(runnable);
            }
            if (i == 5) {
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
            }
            return new Thread(runnable, "SplitCompatBackgroundThread");
        }
        return new Thread(runnable, "codec");
    }
}
