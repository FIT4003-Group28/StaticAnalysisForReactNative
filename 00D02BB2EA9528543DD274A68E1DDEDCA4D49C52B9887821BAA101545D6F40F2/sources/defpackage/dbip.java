package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: dbip  reason: default package */
/* loaded from: classes5.dex */
public final class dbip extends dbhe {
    public static final /* synthetic */ int o = 0;
    public dbir a;
    public final View b;
    public dbis k;
    public final dbgz l;
    public int m;
    public int n;
    private final dbdz p;
    private boolean q;

    public dbip(dbio dbioVar, View view) {
        super(dbioVar);
        this.p = new dbdz();
        this.m = 1;
        this.n = 2;
        dbgz dbgzVar = new dbgz(this) { // from class: dbik
            private final dbip a;

            {
                this.a = this;
            }

            @Override // defpackage.dbgz
            public final void a() {
                this.a.b();
            }
        };
        this.l = dbgzVar;
        dbjb.d(view, "Parameter \"view\" was null.");
        this.b = view;
        this.k = dbioVar.g;
        this.n = 2;
        this.m = 1;
        dbha dbhaVar = new dbha(view.getContext(), view);
        dbhaVar.a(dbgzVar);
        dbir dbirVar = new dbir(dbhaVar);
        this.a = dbirVar;
        dbirVar.b();
        this.i = new dbdp(dbeb.l(), dbeb.l());
    }

    private final float c(int i) {
        dbex dbexVar = this.c;
        dbeb b = dbexVar.b();
        dbeb d = dbexVar.d();
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return (-b.a) + d.a;
            }
            if (i2 == 1) {
                return -b.a;
            }
            String str = i != 1 ? "CENTER" : "LEFT";
            StringBuilder sb = new StringBuilder(str.length() + 29);
            sb.append("Invalid HorizontalAlignment: ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        throw null;
    }

    private final float q(int i) {
        dbex dbexVar = this.c;
        dbeb b = dbexVar.b();
        dbeb d = dbexVar.d();
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return (-b.b) + d.b;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid VerticalAlignment: ");
            sb.append("BOTTOM");
            throw new IllegalStateException(sb.toString());
        }
        throw null;
    }

    public final void a() {
        dbdp dbdpVar;
        if (!this.j.a() && (dbdpVar = (dbdp) this.i) != null) {
            dbex dbexVar = this.c;
            dbeb a = this.k.a(this.b);
            dbeb e = dbexVar.e();
            e.a *= a.a;
            e.b *= a.b;
            dbeb b = dbexVar.b();
            float f = b.a * a.a;
            b.a = f;
            b.b *= a.b;
            b.a = f + (c(this.n) * e.a);
            b.b += q(this.m) * e.b;
            dbdpVar.c(e);
            dbdpVar.a(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        if (this.q) {
            this.b.post(new Runnable(this) { // from class: dbim
                private final dbip a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
    }

    @Override // defpackage.dbhe
    public final /* bridge */ /* synthetic */ dbhe d() {
        return new dbip(this);
    }

    protected final void finalize() {
        try {
            dbie.a().execute(new Runnable(this) { // from class: dbin
                private final dbip a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dbip dbipVar = this.a;
                    dbix.a();
                    dbir dbirVar = dbipVar.a;
                    if (dbirVar != null) {
                        dbha dbhaVar = dbirVar.a;
                        dbhaVar.d.remove(dbipVar.l);
                        dbirVar.c();
                        dbipVar.a = null;
                    }
                }
            });
        } catch (Exception unused) {
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.dbhe
    public final void l() {
        if (this.j.a()) {
            return;
        }
        dbir dbirVar = this.a;
        dbjb.c(dbirVar);
        dbha dbhaVar = dbirVar.a;
        if (!dbhaVar.isAttachedToWindow() || !dbhaVar.isLaidOut() || !dbhaVar.b || this.q) {
            return;
        }
        e().e("viewTexture", dbhaVar.a);
        a();
        this.q = true;
    }

    @Override // defpackage.dbhe
    public final void m(dbhq dbhqVar) {
        dbir dbirVar = this.a;
        dbjb.c(dbirVar);
        dbha dbhaVar = dbirVar.a;
        dbij dbijVar = dbhqVar.a;
        dbij dbijVar2 = dbhaVar.c;
        if (dbijVar2 != null) {
            if (dbijVar2 != dbijVar) {
                throw new IllegalStateException("Cannot use the same ViewRenderable with multiple SceneViews.");
            }
            return;
        }
        dbhaVar.c = dbijVar;
        ViewParent parent = dbhaVar.getParent();
        FrameLayout frameLayout = dbijVar.d;
        if (parent == frameLayout) {
            return;
        }
        frameLayout.addView(dbhaVar, dbijVar.e);
    }

    @Override // defpackage.dbhe
    public final void n() {
        dbir dbirVar = this.a;
        dbjb.c(dbirVar);
        dbirVar.a.b();
    }

    @Override // defpackage.dbhe
    public final dbdz o(dbdz dbdzVar) {
        dbjb.d(dbdzVar, "Parameter \"originalMatrix\" was null.");
        dbeb a = this.k.a(this.b);
        dbdz dbdzVar2 = this.p;
        dbeb dbebVar = new dbeb(a.a, a.b, 1.0f);
        dbdzVar2.a(dbdz.a);
        float[] fArr = dbdzVar2.b;
        fArr[0] = dbebVar.a;
        fArr[5] = dbebVar.b;
        fArr[10] = dbebVar.c;
        this.p.g(new dbeb(c(this.n) * a.a, q(this.m) * a.b, 0.0f));
        dbdz dbdzVar3 = this.p;
        dbdz.h(dbdzVar, dbdzVar3, dbdzVar3);
        return this.p;
    }

    public dbip(dbip dbipVar) {
        super(dbipVar);
        this.p = new dbdz();
        this.m = 1;
        this.n = 2;
        dbgz dbgzVar = new dbgz(this) { // from class: dbil
            private final dbip a;

            {
                this.a = this;
            }

            @Override // defpackage.dbgz
            public final void a() {
                this.a.b();
            }
        };
        this.l = dbgzVar;
        this.b = dbipVar.b;
        this.k = dbipVar.k;
        this.n = dbipVar.n;
        this.m = dbipVar.m;
        dbir dbirVar = dbipVar.a;
        dbjb.c(dbirVar);
        this.a = dbirVar;
        dbirVar.b();
        this.a.a.a(dbgzVar);
    }
}
