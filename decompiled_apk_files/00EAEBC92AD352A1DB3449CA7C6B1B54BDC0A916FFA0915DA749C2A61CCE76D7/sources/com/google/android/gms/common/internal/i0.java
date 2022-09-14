package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.internal.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ServiceConnection> f7022a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private int f7023b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7024c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f7025d;

    /* renamed from: e  reason: collision with root package name */
    private final j.a f7026e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f7027f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ h0 f7028g;

    public i0(h0 h0Var, j.a aVar) {
        this.f7028g = h0Var;
        this.f7026e = aVar;
    }

    public final IBinder a() {
        return this.f7025d;
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        Context context;
        com.google.android.gms.common.stats.a unused;
        Context unused2;
        unused = this.f7028g.f7019f;
        unused2 = this.f7028g.f7017d;
        j.a aVar = this.f7026e;
        context = this.f7028g.f7017d;
        aVar.a(context);
        this.f7022a.add(serviceConnection);
    }

    public final void a(String str) {
        com.google.android.gms.common.stats.a aVar;
        Context context;
        Context context2;
        com.google.android.gms.common.stats.a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.f7023b = 3;
        aVar = this.f7028g.f7019f;
        context = this.f7028g.f7017d;
        j.a aVar3 = this.f7026e;
        context2 = this.f7028g.f7017d;
        this.f7024c = aVar.a(context, str, aVar3.a(context2), this, this.f7026e.c());
        if (this.f7024c) {
            handler = this.f7028g.f7018e;
            Message obtainMessage = handler.obtainMessage(1, this.f7026e);
            handler2 = this.f7028g.f7018e;
            j = this.f7028g.f7021h;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.f7023b = 2;
        try {
            aVar2 = this.f7028g.f7019f;
            context3 = this.f7028g.f7017d;
            aVar2.a(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.f7022a.contains(serviceConnection);
    }

    public final ComponentName b() {
        return this.f7027f;
    }

    public final void b(ServiceConnection serviceConnection, String str) {
        com.google.android.gms.common.stats.a unused;
        Context unused2;
        unused = this.f7028g.f7019f;
        unused2 = this.f7028g.f7017d;
        this.f7022a.remove(serviceConnection);
    }

    public final void b(String str) {
        Handler handler;
        com.google.android.gms.common.stats.a aVar;
        Context context;
        handler = this.f7028g.f7018e;
        handler.removeMessages(1, this.f7026e);
        aVar = this.f7028g.f7019f;
        context = this.f7028g.f7017d;
        aVar.a(context, this);
        this.f7024c = false;
        this.f7023b = 2;
    }

    public final int c() {
        return this.f7023b;
    }

    public final boolean d() {
        return this.f7024c;
    }

    public final boolean e() {
        return this.f7022a.isEmpty();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f7028g.f7016c;
        synchronized (hashMap) {
            handler = this.f7028g.f7018e;
            handler.removeMessages(1, this.f7026e);
            this.f7025d = iBinder;
            this.f7027f = componentName;
            for (ServiceConnection serviceConnection : this.f7022a) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f7023b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f7028g.f7016c;
        synchronized (hashMap) {
            handler = this.f7028g.f7018e;
            handler.removeMessages(1, this.f7026e);
            this.f7025d = null;
            this.f7027f = componentName;
            for (ServiceConnection serviceConnection : this.f7022a) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f7023b = 2;
        }
    }
}
