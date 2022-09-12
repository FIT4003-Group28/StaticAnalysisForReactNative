package defpackage;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: btte  reason: default package */
/* loaded from: classes4.dex */
public final class btte implements bttf {
    public static final bvjk a = new bvjk("cy", bvjk.b);
    public static final bvjk b = new bvjk("qy", bvjk.b);
    private static final bvjk e = new bvjk("terms_accepted", bvjk.c);
    private static final bvjk f = new bvjk("terms_accepted_kr", bvjk.b);
    public final bvjj c;
    private final bvmi g;
    private final deig<Void> h = deig.d();
    private final AtomicBoolean i = new AtomicBoolean();
    public String d = "";

    public btte(final bvjj bvjjVar, final bvmi bvmiVar, final dzsj<btvo> dzsjVar, dehp dehpVar) {
        this.c = bvjjVar;
        this.g = bvmiVar;
        dehpVar.execute(new Runnable(this, dzsjVar, bvmiVar, bvjjVar) { // from class: bttd
            private final btte a;
            private final dzsj b;
            private final bvmi c;
            private final bvjj d;

            {
                this.a = this;
                this.b = dzsjVar;
                this.c = bvmiVar;
                this.d = bvjjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btte btteVar = this.a;
                dzsj dzsjVar2 = this.b;
                bvmi bvmiVar2 = this.c;
                bvjj bvjjVar2 = this.d;
                if (((btvo) dzsjVar2.a()).getEnableFeatureParameters().bz) {
                    String a2 = bvmiVar2.a();
                    if (dbsj.d(a2) && bvmiVar2.c() != 2) {
                        a2 = bvmiVar2.b();
                    }
                    if (dbsj.d(a2)) {
                        a2 = Locale.getDefault().getCountry();
                    }
                    btteVar.d = a2;
                    bvjjVar2.ac(btte.b, btteVar.d);
                    return;
                }
                bvjjVar2.P(btte.b);
            }
        });
    }

    @Override // defpackage.bttf
    public final String a() {
        if (!dbsj.d(this.d)) {
            return this.d;
        }
        String str = "";
        String z = this.c.z(b, str);
        this.d = z;
        if (!dbsj.d(z)) {
            return this.d;
        }
        bvjj bvjjVar = this.c;
        bvjk bvjkVar = a;
        String z2 = bvjjVar.z(bvjkVar, str);
        this.d = z2;
        if (!dbsj.d(z2)) {
            return this.d;
        }
        if (this.g.c() != 2) {
            str = this.g.b();
        }
        if (dbsj.d(str)) {
            str = this.g.a();
        }
        if (dbsj.d(str)) {
            str = Locale.getDefault().getCountry();
        }
        this.d = str;
        this.c.ac(bvjkVar, str);
        return this.d;
    }

    @Override // defpackage.bttf
    public final boolean b() {
        return Locale.KOREA.getCountry().equals(a()) ? this.c.s(f, 0) == 1 : this.c.s(e, 0) == 1;
    }

    @Override // defpackage.bttf
    public final dehn<Void> c() {
        if (this.i.compareAndSet(false, true) && b()) {
            this.h.j(null);
        }
        return this.h;
    }

    @Override // defpackage.bttf
    public final crzm<dbsg<String>> d() {
        final bvjj bvjjVar = this.c;
        final bvjk bvjkVar = a;
        return bvjjVar.k(bvjkVar, new dbty(bvjjVar, bvjkVar) { // from class: bvjg
            private final bvjj a;
            private final bvjk b;

            {
                this.a = bvjjVar;
                this.b = bvjkVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.y(this.b.kz, null, null);
            }
        });
    }

    @Override // defpackage.bttf
    public final void e() {
        this.c.W(e, 1);
        this.i.set(true);
        this.h.j(null);
    }

    @Override // defpackage.bttf
    public final void f() {
        this.c.W(f, 1);
        this.i.set(true);
        this.h.j(null);
    }
}
