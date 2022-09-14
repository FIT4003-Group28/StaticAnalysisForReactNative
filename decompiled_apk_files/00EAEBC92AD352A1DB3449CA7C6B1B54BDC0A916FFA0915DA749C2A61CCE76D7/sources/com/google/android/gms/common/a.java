package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6789a = false;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<IBinder> f6790b = new LinkedBlockingQueue();

    public IBinder a(long j, TimeUnit timeUnit) {
        com.google.android.gms.common.internal.s.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f6789a) {
            this.f6789a = true;
            IBinder poll = this.f6790b.poll(j, timeUnit);
            if (poll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            return poll;
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6790b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
