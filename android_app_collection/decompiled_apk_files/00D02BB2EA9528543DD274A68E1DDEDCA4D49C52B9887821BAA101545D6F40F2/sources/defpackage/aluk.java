package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
/* compiled from: PG */
/* renamed from: aluk  reason: default package */
/* loaded from: classes.dex */
public final class aluk implements akpw {
    public final akpx a;
    private final amcf b;
    private final amoh c;
    private final alvc d;
    private final akrz e;
    private final amyl f;
    private final dbty<alyx> g;
    private final dbty<Boolean> h;
    private final dbty<Boolean> i;
    private final amym j;
    private final dbty<Integer> k;
    private final aluj l;

    public aluk(final akpx akpxVar) {
        this.a = akpxVar;
        aluj alujVar = new aluj(akpxVar);
        this.l = alujVar;
        this.k = dbud.a(new dbty(this) { // from class: alua
            private final aluk a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Integer.valueOf(((ActivityManager) this.a.a.rJ().getSystemService("activity")).getMemoryClass());
            }
        });
        this.c = new amoh(akpxVar.rY(), akpxVar.rR(), new btml(akpxVar.rU()), dbud.a(new dbty(akpxVar) { // from class: alub
            private final akpx a;

            {
                this.a = akpxVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
                if (r1.a == false) goto L11;
             */
            @Override // defpackage.dbty
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    r3 = this;
                    akpx r0 = r3.a
                    android.content.Context r1 = r0.rJ()
                    boolean r1 = defpackage.btpc.l(r1)
                    r2 = 1
                    if (r1 == 0) goto L1b
                    dwwr r1 = r0.si()
                    dwwg r1 = r1.m
                    if (r1 != 0) goto L17
                    dwwg r1 = defpackage.dwwg.e
                L17:
                    boolean r1 = r1.a
                    if (r1 != 0) goto L27
                L1b:
                    btwd r0 = r0.sb()
                    dvek r0 = r0.a
                    boolean r0 = r0.aM
                    if (r0 == 0) goto L26
                    goto L27
                L26:
                    r2 = 0
                L27:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.alub.a():java.lang.Object");
            }
        }));
        akpxVar.getClass();
        aksa aksaVar = new aksa(new dzsj(akpxVar) { // from class: aluc
            private final akpx a;

            {
                this.a = akpxVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.rV();
            }
        });
        this.e = aksaVar;
        amym amymVar = new amym(akpxVar.tg());
        this.j = amymVar;
        Context rJ = akpxVar.rJ();
        cqat rR = akpxVar.rR();
        akpxVar.getClass();
        final amde amdeVar = new amde(rJ, alujVar, aksaVar, rR, amymVar, btsp.b(new dbty(akpxVar) { // from class: alud
            private final akpx a;

            {
                this.a = akpxVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.rU();
            }
        }), akpxVar.tg(), k());
        amdeVar.c.a(new Runnable(amdeVar) { // from class: amdd
            private final amde a;

            {
                this.a = amdeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                amde amdeVar2 = this.a;
                amde.k(amdeVar2.j(true), false);
                amde.k(amdeVar2.j(false), false);
                amde.k(new File(amdeVar2.b.getFilesDir(), "gst"), true);
            }
        });
        this.b = amdeVar;
        this.f = new amyl();
        dbty<alyx> a = dbud.a(new dbty(akpxVar) { // from class: alue
            private final akpx a;

            {
                this.a = akpxVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                final akpx akpxVar2 = this.a;
                akpxVar2.getClass();
                alyx alyxVar = new alyx(new dzsj(akpxVar2) { // from class: alui
                    private final akpx a;

                    {
                        this.a = akpxVar2;
                    }

                    @Override // defpackage.dzsj
                    public final Object a() {
                        return this.a.rV();
                    }
                }, akpxVar2.si().B);
                alyxVar.a();
                return alyxVar;
            }
        });
        this.g = a;
        this.d = new alvc(a);
        this.h = dbud.a(new dbty(akpxVar) { // from class: aluf
            private final akpx a;

            {
                this.a = akpxVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                float f;
                Context rJ2 = this.a.rJ();
                boolean z = true;
                if (!btpf.b(rJ2)) {
                    float f2 = rJ2.getResources().getDisplayMetrics().densityDpi;
                    DisplayMetrics displayMetrics = rJ2.getResources().getDisplayMetrics();
                    if (Math.abs(displayMetrics.xdpi - f2) / f2 > 0.25d || Math.abs(displayMetrics.ydpi - f2) / f2 > 0.25d) {
                        f = f2;
                    } else {
                        f2 = displayMetrics.xdpi;
                        f = displayMetrics.ydpi;
                    }
                    float f3 = displayMetrics.widthPixels / f2;
                    float f4 = displayMetrics.heightPixels / f;
                    if ((f3 * f3) + (f4 * f4) < 49.0f) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        this.i = dbud.a(new dbty(this) { // from class: alug
            private final aluk a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.a.si().w);
            }
        });
    }

    @Override // defpackage.akpw
    public final amcf a() {
        return this.b;
    }

    @Override // defpackage.akpw
    public final amoh b() {
        return this.c;
    }

    @Override // defpackage.akpw
    public final amym c() {
        return this.j;
    }

    @Override // defpackage.akpw
    public final alvc d() {
        return this.d;
    }

    @Override // defpackage.akpw
    public final akrz e() {
        return this.e;
    }

    @Override // defpackage.akpw
    public final amyl f() {
        return this.f;
    }

    @Override // defpackage.akpw
    public final alyx g() {
        return this.g.a();
    }

    @Override // defpackage.akpw
    public final dbty<Boolean> h() {
        return this.h;
    }

    @Override // defpackage.akpw
    public final dbty<Boolean> i() {
        return this.i;
    }

    @Override // defpackage.akpw
    public final dbty<Integer> j() {
        return this.k;
    }

    @Override // defpackage.akpw
    public final aluh k() {
        return new aluh(this);
    }
}
