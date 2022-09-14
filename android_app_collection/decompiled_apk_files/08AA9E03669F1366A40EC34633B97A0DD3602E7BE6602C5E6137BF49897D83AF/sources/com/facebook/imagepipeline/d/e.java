package com.facebook.imagepipeline.d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: BufferedDiskCache.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f2565a = e.class;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.b.b.i f2566b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.common.g.h f2567c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.g.k f2568d;
    private final Executor e;
    private final Executor f;
    private final ab g = ab.a();
    private final o h;

    public e(com.facebook.b.b.i iVar, com.facebook.common.g.h hVar, com.facebook.common.g.k kVar, Executor executor, Executor executor2, o oVar) {
        this.f2566b = iVar;
        this.f2567c = hVar;
        this.f2568d = kVar;
        this.e = executor;
        this.f = executor2;
        this.h = oVar;
    }

    public boolean a(com.facebook.b.a.d dVar) {
        return this.g.b(dVar) || this.f2566b.b(dVar);
    }

    public boolean b(com.facebook.b.a.d dVar) {
        if (a(dVar)) {
            return true;
        }
        return c(dVar);
    }

    public a.h<com.facebook.imagepipeline.i.d> a(com.facebook.b.a.d dVar, AtomicBoolean atomicBoolean) {
        com.facebook.imagepipeline.i.d a2 = this.g.a(dVar);
        if (a2 != null) {
            return b(dVar, a2);
        }
        return b(dVar, atomicBoolean);
    }

    private boolean c(com.facebook.b.a.d dVar) {
        com.facebook.imagepipeline.i.d a2 = this.g.a(dVar);
        if (a2 != null) {
            a2.close();
            com.facebook.common.e.a.a(f2565a, "Found image for %s in staging area", dVar.a());
            this.h.c(dVar);
            return true;
        }
        com.facebook.common.e.a.a(f2565a, "Did not find image for %s in staging area", dVar.a());
        this.h.e();
        try {
            return this.f2566b.c(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    private a.h<com.facebook.imagepipeline.i.d> b(final com.facebook.b.a.d dVar, final AtomicBoolean atomicBoolean) {
        try {
            return a.h.a(new Callable<com.facebook.imagepipeline.i.d>() { // from class: com.facebook.imagepipeline.d.e.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public com.facebook.imagepipeline.i.d call() {
                    if (!atomicBoolean.get()) {
                        com.facebook.imagepipeline.i.d a2 = e.this.g.a(dVar);
                        if (a2 != null) {
                            com.facebook.common.e.a.a(e.f2565a, "Found image for %s in staging area", dVar.a());
                            e.this.h.c(dVar);
                            a2.a(dVar);
                        } else {
                            com.facebook.common.e.a.a(e.f2565a, "Did not find image for %s in staging area", dVar.a());
                            e.this.h.e();
                            try {
                                com.facebook.common.h.a a3 = com.facebook.common.h.a.a(e.this.d(dVar));
                                com.facebook.imagepipeline.i.d dVar2 = new com.facebook.imagepipeline.i.d(a3);
                                dVar2.a(dVar);
                                com.facebook.common.h.a.c(a3);
                                a2 = dVar2;
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                        if (!Thread.interrupted()) {
                            return a2;
                        }
                        com.facebook.common.e.a.a(e.f2565a, "Host thread was interrupted, decreasing reference count");
                        if (a2 != null) {
                            a2.close();
                        }
                        throw new InterruptedException();
                    }
                    throw new CancellationException();
                }
            }, this.e);
        } catch (Exception e) {
            com.facebook.common.e.a.a(f2565a, e, "Failed to schedule disk-cache read for %s", dVar.a());
            return a.h.a(e);
        }
    }

    public void a(final com.facebook.b.a.d dVar, com.facebook.imagepipeline.i.d dVar2) {
        com.facebook.common.d.i.a(dVar);
        com.facebook.common.d.i.a(com.facebook.imagepipeline.i.d.e(dVar2));
        this.g.a(dVar, dVar2);
        dVar2.a(dVar);
        final com.facebook.imagepipeline.i.d a2 = com.facebook.imagepipeline.i.d.a(dVar2);
        try {
            this.f.execute(new Runnable() { // from class: com.facebook.imagepipeline.d.e.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        e.this.c(dVar, a2);
                    } finally {
                        e.this.g.b(dVar, a2);
                        com.facebook.imagepipeline.i.d.d(a2);
                    }
                }
            });
        } catch (Exception e) {
            com.facebook.common.e.a.a(f2565a, e, "Failed to schedule disk-cache write for %s", dVar.a());
            this.g.b(dVar, dVar2);
            com.facebook.imagepipeline.i.d.d(a2);
        }
    }

    public a.h<Void> a() {
        this.g.b();
        try {
            return a.h.a(new Callable<Void>() { // from class: com.facebook.imagepipeline.d.e.3
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public Void call() {
                    e.this.g.b();
                    e.this.f2566b.a();
                    return null;
                }
            }, this.f);
        } catch (Exception e) {
            com.facebook.common.e.a.a(f2565a, e, "Failed to schedule disk-cache clear", new Object[0]);
            return a.h.a(e);
        }
    }

    private a.h<com.facebook.imagepipeline.i.d> b(com.facebook.b.a.d dVar, com.facebook.imagepipeline.i.d dVar2) {
        com.facebook.common.e.a.a(f2565a, "Found image for %s in staging area", dVar.a());
        this.h.c(dVar);
        return a.h.a(dVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.common.g.g d(com.facebook.b.a.d dVar) {
        try {
            com.facebook.common.e.a.a(f2565a, "Disk cache read for %s", dVar.a());
            com.facebook.a.a a2 = this.f2566b.a(dVar);
            if (a2 == null) {
                com.facebook.common.e.a.a(f2565a, "Disk cache miss for %s", dVar.a());
                this.h.g();
                return null;
            }
            com.facebook.common.e.a.a(f2565a, "Found entry in disk cache for %s", dVar.a());
            this.h.f();
            InputStream a3 = a2.a();
            com.facebook.common.g.g a4 = this.f2567c.a(a3, (int) a2.b());
            a3.close();
            com.facebook.common.e.a.a(f2565a, "Successful read from disk cache for %s", dVar.a());
            return a4;
        } catch (IOException e) {
            com.facebook.common.e.a.a(f2565a, e, "Exception reading from cache for %s", dVar.a());
            this.h.h();
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.facebook.b.a.d dVar, final com.facebook.imagepipeline.i.d dVar2) {
        com.facebook.common.e.a.a(f2565a, "About to write to disk-cache for key %s", dVar.a());
        try {
            this.f2566b.a(dVar, new com.facebook.b.a.j() { // from class: com.facebook.imagepipeline.d.e.4
                @Override // com.facebook.b.a.j
                public void a(OutputStream outputStream) {
                    e.this.f2568d.a(dVar2.d(), outputStream);
                }
            });
            com.facebook.common.e.a.a(f2565a, "Successful disk-cache write for key %s", dVar.a());
        } catch (IOException e) {
            com.facebook.common.e.a.a(f2565a, e, "Failed to write to disk-cache for key %s", dVar.a());
        }
    }
}
