package defpackage;

import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
/* compiled from: PG */
/* renamed from: aaal  reason: default package */
/* loaded from: classes.dex */
public class aaal implements ynl {
    private final yzm a;
    public final aaai b;
    public final aaar c;
    public final aaan d;
    public aijs e;
    public InfoCardCollection f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final xgp j;
    private final ahvu k;

    public aaal(aaai aaaiVar, yzm yzmVar, aaar aaarVar, aaan aaanVar, xgp xgpVar, ahvu ahvuVar) {
        aaaiVar.getClass();
        this.b = aaaiVar;
        yzmVar.getClass();
        this.a = yzmVar;
        aaarVar.getClass();
        this.c = aaarVar;
        aaanVar.getClass();
        this.d = aaanVar;
        this.j = xgpVar;
        this.k = ahvuVar;
        aaaiVar.n(new aaak(this));
        aaaiVar.j(new Runnable() { // from class: aaaj
            @Override // java.lang.Runnable
            public final void run() {
                aaal.this.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(boolean z) {
        if (this.h) {
            this.h = false;
            this.b.d(z);
            h();
        }
    }

    public final void h() {
        yzm yzmVar = this.a;
        boolean z = true;
        if (!this.g && !this.h) {
            z = false;
        }
        yzmVar.j(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i) {
        this.b.h(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.f = null;
        this.g = false;
        this.b.g();
        h();
    }

    public final void k() {
        this.i = false;
        l();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.e = ((ahgn) obj).c();
                l();
                return null;
            } else if (i == 1) {
                ahhv ahhvVar = (ahhv) obj;
                this.b.k(!ahhvVar.a);
                this.b.f(ahhvVar.a);
                return null;
            } else if (i == 2) {
                if (((ahhw) obj).c() != aika.NEW) {
                    return null;
                }
                g(false);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhv.class, ahhw.class};
    }

    public final boolean l() {
        this.b.m(this.i);
        boolean z = true;
        boolean z2 = this.i && this.e == aijs.FULLSCREEN;
        if (z2 != this.g) {
            this.g = z2;
            if (z2) {
                h();
                g(true);
                this.b.l();
            } else {
                aaai aaaiVar = this.b;
                if (this.e != aijs.FULLSCREEN) {
                    z = false;
                }
                aaaiVar.e(z);
            }
            xgp xgpVar = this.j;
            if (xgpVar != null) {
                xgpVar.o(this.g);
                this.j.n(this.g);
            }
        }
        ahvu ahvuVar = this.k;
        if (ahvuVar != null) {
            ahvuVar.q = this.g;
            ahvuVar.i();
        }
        return this.g;
    }
}
