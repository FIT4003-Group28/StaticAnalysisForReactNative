package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.audio.WebRtcAudioRecord;
/* compiled from: PG */
/* renamed from: baps  reason: default package */
/* loaded from: classes2.dex */
public final class baps implements ThreadFactory {
    final /* synthetic */ AtomicInteger a;
    private final /* synthetic */ int b;

    public baps(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    public baps(AtomicInteger atomicInteger, int i) {
        this.b = i;
        this.a = atomicInteger;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.b == 0) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName(String.format("WebRtcAudioRecordScheduler-%s-%s", Integer.valueOf(WebRtcAudioRecord.a.getAndIncrement()), Integer.valueOf(this.a.getAndIncrement())));
            return newThread;
        }
        Thread thread = new Thread(runnable, azst.a("CommonPool-worker-", Integer.valueOf(this.a.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }
}
