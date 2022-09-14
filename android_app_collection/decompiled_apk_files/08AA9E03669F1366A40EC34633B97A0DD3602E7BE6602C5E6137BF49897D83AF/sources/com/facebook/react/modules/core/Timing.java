package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.b.i;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ap;
import com.facebook.react.bridge.aq;
import com.facebook.react.bridge.x;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.e;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class Timing extends ReactContextBaseJavaModule implements x, com.facebook.react.c.b {
    private static final float FRAME_DURATION_MS = 16.666666f;
    private static final float IDLE_CALLBACK_FRAME_DEADLINE_MS = 1.0f;
    protected static final String NAME = "Timing";
    private final AtomicBoolean isPaused;
    private final AtomicBoolean isRunningTasks;
    private a mCurrentIdleCallbackRunnable;
    private final com.facebook.react.devsupport.a.b mDevSupportManager;
    private boolean mFrameCallbackPosted;
    private boolean mFrameIdleCallbackPosted;
    private final Object mIdleCallbackGuard;
    private final b mIdleFrameCallback;
    private final e mReactChoreographer;
    private boolean mSendIdleEvents;
    private final d mTimerFrameCallback;
    private final Object mTimerGuard;
    private final SparseArray<c> mTimerIdsToTimers;
    private final PriorityQueue<c> mTimers;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f3510a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3511b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3512c;

        /* renamed from: d  reason: collision with root package name */
        private long f3513d;

        private c(int i, long j, int i2, boolean z) {
            this.f3510a = i;
            this.f3513d = j;
            this.f3512c = i2;
            this.f3511b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends a.AbstractC0069a {

        /* renamed from: b  reason: collision with root package name */
        private aq f3515b;

        private d() {
            this.f3515b = null;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0069a
        public void b(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                long j2 = j / 1000000;
                synchronized (Timing.this.mTimerGuard) {
                    while (!Timing.this.mTimers.isEmpty() && ((c) Timing.this.mTimers.peek()).f3513d < j2) {
                        c cVar = (c) Timing.this.mTimers.poll();
                        if (this.f3515b == null) {
                            this.f3515b = com.facebook.react.bridge.b.a();
                        }
                        this.f3515b.pushInt(cVar.f3510a);
                        if (cVar.f3511b) {
                            cVar.f3513d = cVar.f3512c + j2;
                            Timing.this.mTimers.add(cVar);
                        } else {
                            Timing.this.mTimerIdsToTimers.remove(cVar.f3510a);
                        }
                    }
                }
                if (this.f3515b != null) {
                    ((JSTimers) Timing.this.getReactApplicationContext().a(JSTimers.class)).callTimers(this.f3515b);
                    this.f3515b = null;
                }
                Timing.this.mReactChoreographer.a(e.a.TIMERS_EVENTS, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends a.AbstractC0069a {
        private b() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0069a
        public void b(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                if (Timing.this.mCurrentIdleCallbackRunnable != null) {
                    Timing.this.mCurrentIdleCallbackRunnable.a();
                }
                Timing.this.mCurrentIdleCallbackRunnable = new a(j);
                Timing.this.getReactApplicationContext().c(Timing.this.mCurrentIdleCallbackRunnable);
                Timing.this.mReactChoreographer.a(e.a.IDLE_EVENT, this);
            }
        }
    }

    /* loaded from: classes.dex */
    private class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f3507b = false;

        /* renamed from: c  reason: collision with root package name */
        private final long f3508c;

        public a(long j) {
            this.f3508c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (this.f3507b) {
                return;
            }
            long c2 = i.c() - (this.f3508c / 1000000);
            long a2 = i.a() - c2;
            if (Timing.FRAME_DURATION_MS - ((float) c2) < Timing.IDLE_CALLBACK_FRAME_DEADLINE_MS) {
                return;
            }
            synchronized (Timing.this.mIdleCallbackGuard) {
                z = Timing.this.mSendIdleEvents;
            }
            if (z) {
                ((JSTimers) Timing.this.getReactApplicationContext().a(JSTimers.class)).callIdleCallbacks(a2);
            }
            Timing.this.mCurrentIdleCallbackRunnable = null;
        }

        public void a() {
            this.f3507b = true;
        }
    }

    public Timing(ah ahVar, com.facebook.react.devsupport.a.b bVar) {
        super(ahVar);
        this.mTimerGuard = new Object();
        this.mIdleCallbackGuard = new Object();
        this.isPaused = new AtomicBoolean(true);
        this.isRunningTasks = new AtomicBoolean(false);
        this.mTimerFrameCallback = new d();
        this.mIdleFrameCallback = new b();
        this.mFrameCallbackPosted = false;
        this.mFrameIdleCallbackPosted = false;
        this.mSendIdleEvents = false;
        this.mDevSupportManager = bVar;
        this.mTimers = new PriorityQueue<>(11, new Comparator<c>() { // from class: com.facebook.react.modules.core.Timing.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(c cVar, c cVar2) {
                int i = ((cVar.f3513d - cVar2.f3513d) > 0L ? 1 : ((cVar.f3513d - cVar2.f3513d) == 0L ? 0 : -1));
                if (i == 0) {
                    return 0;
                }
                return i < 0 ? -1 : 1;
            }
        });
        this.mTimerIdsToTimers = new SparseArray<>();
        this.mReactChoreographer = e.b();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().a(this);
        com.facebook.react.c.a.a(getReactApplicationContext()).a(this);
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
        this.isPaused.set(true);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        this.isPaused.set(false);
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    public void onHeadlessJsTaskStart(int i) {
        if (!this.isRunningTasks.getAndSet(true)) {
            setChoreographerCallback();
            maybeSetChoreographerIdleCallback();
        }
    }

    @Override // com.facebook.react.c.b
    public void onHeadlessJsTaskFinish(int i) {
        if (!com.facebook.react.c.a.a(getReactApplicationContext()).a()) {
            this.isRunningTasks.set(false);
            clearFrameCallback();
            maybeIdleCallback();
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        clearFrameCallback();
        clearChoreographerIdleCallback();
        com.facebook.react.c.a.a(getReactApplicationContext()).b(this);
    }

    private void maybeSetChoreographerIdleCallback() {
        synchronized (this.mIdleCallbackGuard) {
            if (this.mSendIdleEvents) {
                setChoreographerIdleCallback();
            }
        }
    }

    private void maybeIdleCallback() {
        if (!this.isPaused.get() || this.isRunningTasks.get()) {
            return;
        }
        clearFrameCallback();
    }

    private void setChoreographerCallback() {
        if (!this.mFrameCallbackPosted) {
            this.mReactChoreographer.a(e.a.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = true;
        }
    }

    private void clearFrameCallback() {
        com.facebook.react.c.a a2 = com.facebook.react.c.a.a(getReactApplicationContext());
        if (!this.mFrameCallbackPosted || !this.isPaused.get() || a2.a()) {
            return;
        }
        this.mReactChoreographer.b(e.a.TIMERS_EVENTS, this.mTimerFrameCallback);
        this.mFrameCallbackPosted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChoreographerIdleCallback() {
        if (!this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.a(e.a.IDLE_EVENT, this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChoreographerIdleCallback() {
        if (this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.b(e.a.IDLE_EVENT, this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = false;
        }
    }

    @al
    public void createTimer(int i, int i2, double d2, boolean z) {
        long a2 = i.a();
        long j = (long) d2;
        if (this.mDevSupportManager.d() && Math.abs(j - a2) > 60000) {
            ((JSTimers) getReactApplicationContext().a(JSTimers.class)).emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0L, (j - a2) + i2);
        if (i2 == 0 && !z) {
            aq a3 = com.facebook.react.bridge.b.a();
            a3.pushInt(i);
            ((JSTimers) getReactApplicationContext().a(JSTimers.class)).callTimers(a3);
            return;
        }
        c cVar = new c(i, (i.b() / 1000000) + max, i2, z);
        synchronized (this.mTimerGuard) {
            this.mTimers.add(cVar);
            this.mTimerIdsToTimers.put(i, cVar);
        }
    }

    @al
    public void deleteTimer(int i) {
        synchronized (this.mTimerGuard) {
            c cVar = this.mTimerIdsToTimers.get(i);
            if (cVar == null) {
                return;
            }
            this.mTimerIdsToTimers.remove(i);
            this.mTimers.remove(cVar);
        }
    }

    @al
    public void setSendIdleEvents(final boolean z) {
        synchronized (this.mIdleCallbackGuard) {
            this.mSendIdleEvents = z;
        }
        ap.a(new Runnable() { // from class: com.facebook.react.modules.core.Timing.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (Timing.this.mIdleCallbackGuard) {
                    if (z) {
                        Timing.this.setChoreographerIdleCallback();
                    } else {
                        Timing.this.clearChoreographerIdleCallback();
                    }
                }
            }
        });
    }
}
