package defpackage;

import android.os.Debug;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: cvhb  reason: default package */
/* loaded from: classes.dex */
public final class cvhb extends cvgx<cssl> {
    public cvhb() {
        super((ThreadFactory) null, 3000);
    }

    @Override // defpackage.cvgx
    /* renamed from: d */
    public final synchronized cssl c() {
        Debug.MemoryInfo memoryInfo;
        cssm c;
        memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        c = cssm.c();
        return new cssl(cssl.b(memoryInfo.otherPrivateDirty), cssl.b(memoryInfo.otherPss), cssl.b(memoryInfo.dalvikPrivateDirty), cssl.b(memoryInfo.dalvikPss), c.n, c.o, c.p, Debug.getNativeHeapAllocatedSize(), cssl.b(memoryInfo.getTotalPss()), cssl.a(memoryInfo, "getSummaryJavaHeap"), cssl.a(memoryInfo, "getSummaryNativeHeap"), cssl.a(memoryInfo, "getSummaryPrivateOther"), cssl.a(memoryInfo, "getSummaryCode"), cssl.a(memoryInfo, "getSummaryGraphics"), cssl.a(memoryInfo, "getSummaryStack"), cssl.a(memoryInfo, "getSummarySystem"));
    }

    public cvhb(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService, 3000);
    }
}
