package com.facebook.imagepipeline.m;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* compiled from: ThrottlingProducer.java */
/* loaded from: classes.dex */
public class au<T> implements aj<T> {

    /* renamed from: a  reason: collision with root package name */
    private final aj<T> f2816a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2817b;
    private final Executor e;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<j<T>, ak>> f2819d = new ConcurrentLinkedQueue<>();

    /* renamed from: c  reason: collision with root package name */
    private int f2818c = 0;

    static /* synthetic */ int b(au auVar) {
        int i = auVar.f2818c;
        auVar.f2818c = i - 1;
        return i;
    }

    public au(int i, Executor executor, aj<T> ajVar) {
        this.f2817b = i;
        this.e = (Executor) com.facebook.common.d.i.a(executor);
        this.f2816a = (aj) com.facebook.common.d.i.a(ajVar);
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<T> jVar, ak akVar) {
        boolean z;
        akVar.c().a(akVar.b(), "ThrottlingProducer");
        synchronized (this) {
            z = true;
            if (this.f2818c >= this.f2817b) {
                this.f2819d.add(Pair.create(jVar, akVar));
            } else {
                this.f2818c++;
                z = false;
            }
        }
        if (!z) {
            b(jVar, akVar);
        }
    }

    void b(j<T> jVar, ak akVar) {
        akVar.c().a(akVar.b(), "ThrottlingProducer", (Map<String, String>) null);
        this.f2816a.a(new a(jVar), akVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ThrottlingProducer.java */
    /* loaded from: classes.dex */
    public class a extends m<T, T> {
        private a(j<T> jVar) {
            super(jVar);
        }

        @Override // com.facebook.imagepipeline.m.b
        protected void a(T t, boolean z) {
            d().b(t, z);
            if (z) {
                c();
            }
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        protected void a(Throwable th) {
            d().b(th);
            c();
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        protected void a() {
            d().b();
            c();
        }

        private void c() {
            final Pair pair;
            synchronized (au.this) {
                pair = (Pair) au.this.f2819d.poll();
                if (pair == null) {
                    au.b(au.this);
                }
            }
            if (pair != null) {
                au.this.e.execute(new Runnable() { // from class: com.facebook.imagepipeline.m.au.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        au.this.b((j) pair.first, (ak) pair.second);
                    }
                });
            }
        }
    }
}
