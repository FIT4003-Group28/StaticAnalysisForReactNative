package com.facebook.imagepipeline.m;

import com.facebook.imagepipeline.m.u;
import com.facebook.imagepipeline.nativecode.JpegTranscoder;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ResizeAndRotateProducer.java */
/* loaded from: classes.dex */
public class ao implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2788a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.g.h f2789b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2790c;

    /* renamed from: d  reason: collision with root package name */
    private final aj<com.facebook.imagepipeline.i.d> f2791d;
    private final boolean e;

    static int a(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }

    private static boolean b(int i) {
        return i < 8;
    }

    public ao(Executor executor, com.facebook.common.g.h hVar, boolean z, aj<com.facebook.imagepipeline.i.d> ajVar, boolean z2) {
        this.f2788a = (Executor) com.facebook.common.d.i.a(executor);
        this.f2789b = (com.facebook.common.g.h) com.facebook.common.d.i.a(hVar);
        this.f2790c = z;
        this.f2791d = (aj) com.facebook.common.d.i.a(ajVar);
        this.e = z2;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        this.f2791d.a(new a(jVar, akVar), akVar);
    }

    /* compiled from: ResizeAndRotateProducer.java */
    /* loaded from: classes.dex */
    private class a extends m<com.facebook.imagepipeline.i.d, com.facebook.imagepipeline.i.d> {

        /* renamed from: b  reason: collision with root package name */
        private final ak f2793b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2794c;

        /* renamed from: d  reason: collision with root package name */
        private final u f2795d;

        public a(final j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
            super(jVar);
            this.f2794c = false;
            this.f2793b = akVar;
            this.f2795d = new u(ao.this.f2788a, new u.a() { // from class: com.facebook.imagepipeline.m.ao.a.1
                @Override // com.facebook.imagepipeline.m.u.a
                public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
                    a.this.b(dVar, z);
                }
            }, 100);
            this.f2793b.a(new e() { // from class: com.facebook.imagepipeline.m.ao.a.2
                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void c() {
                    if (a.this.f2793b.h()) {
                        a.this.f2795d.b();
                    }
                }

                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void a() {
                    a.this.f2795d.a();
                    a.this.f2794c = true;
                    jVar.b();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            if (this.f2794c) {
                return;
            }
            if (dVar == null) {
                if (!z) {
                    return;
                }
                d().b(null, true);
                return;
            }
            com.facebook.common.l.e c2 = ao.c(this.f2793b.a(), dVar, ao.this.f2790c);
            if (!z && c2 == com.facebook.common.l.e.UNSET) {
                return;
            }
            if (c2 != com.facebook.common.l.e.YES) {
                d().b(dVar, z);
            } else if (!this.f2795d.a(dVar, z)) {
            } else {
                if (!z && !this.f2793b.h()) {
                    return;
                }
                this.f2795d.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [com.facebook.imagepipeline.i.d] */
        /* JADX WARN: Type inference failed for: r12v1, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r12v3 */
        public void b(com.facebook.imagepipeline.i.d dVar, boolean z) {
            InputStream inputStream;
            this.f2793b.c().a(this.f2793b.b(), "ResizeAndRotateProducer");
            com.facebook.imagepipeline.n.b a2 = this.f2793b.a();
            com.facebook.common.g.j a3 = ao.this.f2789b.a();
            Map<String, String> map = null;
            try {
                try {
                    try {
                        int d2 = ao.d(a2, dVar, ao.this.f2790c);
                        int a4 = ao.a(p.a(a2, dVar));
                        int i = ao.this.e ? a4 : d2;
                        int b2 = ao.b(a2.h(), dVar);
                        Map<String, String> a5 = a(dVar, a2, i, a4, d2, b2);
                        try {
                            inputStream = dVar.d();
                        } catch (Exception e) {
                            e = e;
                            inputStream = null;
                        }
                        try {
                            JpegTranscoder.a(inputStream, a3, b2, i, 85);
                            com.facebook.common.h.a a6 = com.facebook.common.h.a.a(a3.a());
                            try {
                                com.facebook.imagepipeline.i.d dVar2 = new com.facebook.imagepipeline.i.d(a6);
                                dVar2.a(com.facebook.h.b.f2509a);
                                dVar2.l();
                                this.f2793b.c().a(this.f2793b.b(), "ResizeAndRotateProducer", a5);
                                d().b(dVar2, z);
                                com.facebook.imagepipeline.i.d.d(dVar2);
                                com.facebook.common.d.b.a(inputStream);
                                a3.close();
                            } finally {
                                com.facebook.common.h.a.c(a6);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            map = a5;
                            this.f2793b.c().a(this.f2793b.b(), "ResizeAndRotateProducer", e, map);
                            d().b(e);
                            com.facebook.common.d.b.a(inputStream);
                            a3.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        dVar = 0;
                        com.facebook.common.d.b.a(dVar);
                        a3.close();
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    inputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private Map<String, String> a(com.facebook.imagepipeline.i.d dVar, com.facebook.imagepipeline.n.b bVar, int i, int i2, int i3, int i4) {
            String str;
            String str2;
            if (!this.f2793b.c().b(this.f2793b.b())) {
                return null;
            }
            String str3 = dVar.g() + "x" + dVar.h();
            if (bVar.g() != null) {
                str = bVar.g().f2632a + "x" + bVar.g().f2633b;
            } else {
                str = "Unspecified";
            }
            if (i > 0) {
                str2 = i + "/8";
            } else {
                str2 = "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str);
            hashMap.put("Fraction", str2);
            hashMap.put("queueTime", String.valueOf(this.f2795d.c()));
            hashMap.put("downsampleEnumerator", Integer.toString(i2));
            hashMap.put("softwareEnumerator", Integer.toString(i3));
            hashMap.put("rotationAngle", Integer.toString(i4));
            return com.facebook.common.d.f.a(hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.common.l.e c(com.facebook.imagepipeline.n.b bVar, com.facebook.imagepipeline.i.d dVar, boolean z) {
        if (dVar == null || dVar.e() == com.facebook.h.c.f2513a) {
            return com.facebook.common.l.e.UNSET;
        }
        if (dVar.e() != com.facebook.h.b.f2509a) {
            return com.facebook.common.l.e.NO;
        }
        return com.facebook.common.l.e.a(c(bVar.h(), dVar) || b(d(bVar, dVar, z)));
    }

    static float a(com.facebook.imagepipeline.e.d dVar, int i, int i2) {
        if (dVar == null) {
            return 1.0f;
        }
        float f = i;
        float f2 = i2;
        float max = Math.max(dVar.f2632a / f, dVar.f2633b / f2);
        if (f * max > dVar.f2634c) {
            max = dVar.f2634c / f;
        }
        return f2 * max > dVar.f2634c ? dVar.f2634c / f2 : max;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(com.facebook.imagepipeline.n.b bVar, com.facebook.imagepipeline.i.d dVar, boolean z) {
        com.facebook.imagepipeline.e.d g;
        int g2;
        int h;
        if (z && (g = bVar.g()) != null) {
            int b2 = b(bVar.h(), dVar);
            boolean z2 = b2 == 90 || b2 == 270;
            if (z2) {
                g2 = dVar.h();
            } else {
                g2 = dVar.g();
            }
            if (z2) {
                h = dVar.g();
            } else {
                h = dVar.h();
            }
            int a2 = a(a(g, g2, h), g.f2635d);
            if (a2 > 8) {
                return 8;
            }
            if (a2 >= 1) {
                return a2;
            }
            return 1;
        }
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(com.facebook.imagepipeline.e.e eVar, com.facebook.imagepipeline.i.d dVar) {
        if (!eVar.e()) {
            return 0;
        }
        int a2 = a(dVar);
        return eVar.d() ? a2 : (a2 + eVar.f()) % 360;
    }

    private static int a(com.facebook.imagepipeline.i.d dVar) {
        int f = dVar.f();
        if (f == 90 || f == 180 || f == 270) {
            return dVar.f();
        }
        return 0;
    }

    private static boolean c(com.facebook.imagepipeline.e.e eVar, com.facebook.imagepipeline.i.d dVar) {
        return !eVar.g() && b(eVar, dVar) != 0;
    }

    static int a(int i) {
        return Math.max(1, 8 / i);
    }
}
