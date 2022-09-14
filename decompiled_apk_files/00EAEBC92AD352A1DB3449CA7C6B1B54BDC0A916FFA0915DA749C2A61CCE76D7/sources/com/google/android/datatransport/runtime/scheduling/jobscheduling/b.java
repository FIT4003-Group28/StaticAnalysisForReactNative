package com.google.android.datatransport.runtime.scheduling.jobscheduling;
/* loaded from: classes.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private static final b f6719b = new b();

    private b() {
    }

    public static Runnable a() {
        return f6719b;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlarmManagerSchedulerBroadcastReceiver.a();
    }
}
