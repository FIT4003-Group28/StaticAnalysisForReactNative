package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: cvhc  reason: default package */
/* loaded from: classes.dex */
public final class cvhc extends cvgx<cssm> {
    public cvhc() {
        super((ThreadFactory) null, 750);
    }

    @Override // defpackage.cvgx
    /* renamed from: d */
    public final synchronized cssm c() {
        return cssm.c();
    }

    public cvhc(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService, 750);
    }
}
