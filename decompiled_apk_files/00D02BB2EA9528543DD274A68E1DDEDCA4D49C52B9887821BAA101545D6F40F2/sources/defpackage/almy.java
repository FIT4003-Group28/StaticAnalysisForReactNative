package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: almy  reason: default package */
/* loaded from: classes2.dex */
public class almy extends alpd implements bnus {
    private static final float[] b = {-0.5f, 0.707107f, 0.5f, 0.5f, 0.707107f, -0.5f};
    public static final alpl e = new alpl(0, dcjz.d());
    String c;
    float d;
    alpl f;
    long g;
    @dzsi
    araw h;

    public almy(akpq akpqVar, akzh akzhVar) {
        super(akpqVar, akzhVar);
        this.c = "";
        this.d = 0.0f;
        this.f = e;
    }

    @Override // defpackage.aksm
    public final Collection<String> a() {
        return this.f.b.keySet();
    }

    @Override // defpackage.aksm
    public final void b(String str) {
        String str2 = this.c;
        if (str2 == null || !str2.equals(str)) {
            this.c = str;
        }
    }

    @Override // defpackage.alpd, defpackage.akvk
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aksm
    public final void i(final araw arawVar) {
        this.a.e(new Runnable(this, arawVar) { // from class: almv
            private final almy a;
            private final araw b;

            {
                this.a = this;
                this.b = arawVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                almy almyVar = this.a;
                almyVar.h = this.b;
                almyVar.g = System.currentTimeMillis();
            }
        });
    }

    public float[] k() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(bnvu bnvuVar, alpl alplVar) {
        synchronized (this) {
            this.l = true;
            this.k = bnvuVar;
        }
        this.a.e(this.r);
        this.a.d();
        this.f = alplVar;
        b(alplVar.b.keySet().iterator().next());
    }

    @Override // defpackage.bnus
    public final void m(long j) {
        araw arawVar = this.h;
        if (arawVar == null) {
            return;
        }
        long j2 = j - this.g;
        long a = j2 % arawVar.a();
        long a2 = j2 / this.h.a();
        this.d = (((float) a) / ((float) this.h.a())) * (this.f.a - 1);
        this.a.d();
    }

    @Override // defpackage.bnus
    public final boolean n() {
        return this.h != null;
    }

    @Override // defpackage.bnus
    public final int o() {
        return this.f.a;
    }

    @Override // defpackage.bnus
    public final int p() {
        return (int) this.d;
    }

    @Override // defpackage.bnus
    public final int q() {
        if (!this.f.b.containsKey(this.c)) {
            return -1;
        }
        return this.f.b.get(this.c).intValue();
    }

    @Override // defpackage.bnus
    public final float r() {
        float f = this.d;
        return f - ((float) Math.floor(f));
    }
}
