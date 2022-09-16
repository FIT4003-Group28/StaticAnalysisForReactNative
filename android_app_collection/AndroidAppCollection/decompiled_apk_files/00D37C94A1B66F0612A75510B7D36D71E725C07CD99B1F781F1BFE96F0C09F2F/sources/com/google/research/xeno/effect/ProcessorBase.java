package com.google.research.xeno.effect;

import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ProcessorBase implements aoid {
    public final awwo b;
    public volatile long c;
    public AtomicBoolean d;
    protected final Graph e;
    public final AndroidPacketCreator f;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public volatile Effect h;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface Callback {
        void onCompletion(boolean z, String str);
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface FrameCallback {
        void process(Packet packet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ProcessorBase(awwo awwoVar) {
        this.b = awwoVar;
        Graph graph = new Graph();
        this.e = graph;
        long j = awwoVar.a;
        if (j != 0) {
            try {
                graph.g(j);
            } catch (MediaPipeException unused) {
            }
        }
        this.f = new AndroidPacketCreator(this.e);
    }

    protected static native void nativeImageProcessorTick(long j, long j2);

    protected static native long nativeNewImageProcessor(long j, long j2, long j3, long j4, long j5, long j6, long j7, FrameCallback frameCallback);

    /* JADX INFO: Access modifiers changed from: protected */
    public static native long nativeNewVideoProcessor(long j, long j2, long j3, FrameCallback frameCallback);

    private static native void nativePrepareCurrentEffectToStartRecording(long j);

    private static native void nativeRelease(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public static native void nativeSendVideoProcessorFramePacket(long j, long j2, long j3);

    public static native void nativeSetEffect(long j, long j2, Callback callback);

    /* JADX INFO: Access modifiers changed from: protected */
    public static native void nativeStartVideoProcessing(long j, int i, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: protected */
    public static native void nativeStopVideoProcessing(long j);

    @Override // defpackage.aoid
    public final void c(aoic aoicVar) {
        this.g.clear();
        this.g.add(aoicVar);
    }

    public final void d() {
        if (this.d.compareAndSet(true, false)) {
            nativeRelease(this.c);
            this.e.i();
        }
    }
}
