package defpackage;

import java.util.concurrent.ThreadFactory;
/* renamed from: csej  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class csej implements ThreadFactory {
    static final ThreadFactory a = new csej();

    private csej() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "LensSvConn");
    }
}
