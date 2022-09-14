package com.teslamotors.plugins.client.d.a;

import java.util.Timer;
import java.util.TimerTask;
/* compiled from: ExponentialBackoffFunction.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private com.teslamotors.plugins.client.d.a.b f5325a;

    /* renamed from: b  reason: collision with root package name */
    private int f5326b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f5327c;

    /* renamed from: d  reason: collision with root package name */
    private int f5328d;
    private boolean e;
    private boolean f;
    private boolean g;
    private c h;
    private b i;
    private InterfaceC0116a j;

    /* compiled from: ExponentialBackoffFunction.java */
    /* renamed from: com.teslamotors.plugins.client.d.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0116a {
        void a(a aVar, String str, Object obj);
    }

    /* compiled from: ExponentialBackoffFunction.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(a aVar, String str, Object obj);
    }

    /* compiled from: ExponentialBackoffFunction.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(d dVar);
    }

    /* compiled from: ExponentialBackoffFunction.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(String str, Object obj);
    }

    public void a() {
        if (this.h == null) {
            throw new IllegalStateException("Cannot execute backoff without a run function");
        }
        if (this.e) {
            return;
        }
        this.g = false;
        this.f = false;
        if (this.f5325a == null) {
            this.f5325a = new com.teslamotors.plugins.client.d.a.b();
        }
        if (this.f5326b < 0) {
            this.f5326b = -1;
        }
        this.f5327c = 0;
        this.f5328d = 0;
        this.e = true;
        b();
    }

    public void a(com.teslamotors.plugins.client.d.a.b bVar) {
        if (this.e) {
            throw new IllegalStateException("Cannot change strategy while backoff is running");
        }
        this.f5325a = bVar;
    }

    public void a(int i) {
        if (this.e) {
            throw new IllegalStateException("Cannot change allowable retries while backoff is running");
        }
        this.f5326b = i;
    }

    public void a(c cVar) {
        if (this.e) {
            throw new IllegalStateException("Cannot change run function while backoff is running");
        }
        this.h = cVar;
    }

    public void a(b bVar) {
        if (this.e) {
            throw new IllegalStateException("Cannot change retryIf function while backoff is running");
        }
        this.i = bVar;
    }

    public void a(InterfaceC0116a interfaceC0116a) {
        if (this.e) {
            throw new IllegalStateException("Cannot change completion handler function while backoff is running");
        }
        this.j = interfaceC0116a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f5327c++;
        new Timer().schedule(new TimerTask() { // from class: com.teslamotors.plugins.client.d.a.a.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                a.this.h.a(new d() { // from class: com.teslamotors.plugins.client.d.a.a.1.1
                    @Override // com.teslamotors.plugins.client.d.a.a.d
                    public void a(String str, Object obj) {
                        if (a.this.g) {
                            return;
                        }
                        if ((a.this.f5326b == -1 || a.this.f5327c < a.this.f5326b + 1) && ((a.this.i == null || a.this.i.a(a.this, str, obj)) && (a.this.i != null || str != null))) {
                            if (a.this.f5328d != 0) {
                                int i = a.this.f5328d * 2;
                                a aVar = a.this;
                                if (i > a.this.f5325a.b()) {
                                    i = a.this.f5325a.b();
                                }
                                aVar.f5328d = i;
                            } else {
                                a.this.f5328d = a.this.f5325a.a();
                            }
                            a.this.b();
                            return;
                        }
                        a.this.e = false;
                        a.this.f = true;
                        a.this.j.a(a.this, str, obj);
                    }
                });
            }
        }, this.f5328d);
    }
}
