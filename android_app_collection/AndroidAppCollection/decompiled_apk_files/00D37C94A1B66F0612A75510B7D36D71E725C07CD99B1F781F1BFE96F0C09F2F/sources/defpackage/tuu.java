package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tuu  reason: default package */
/* loaded from: classes4.dex */
public final class tuu implements tul {
    public final tvy a;
    public final Executor b;
    private final tyk c;
    private final txb d;
    private final tvy e;
    private final Uri f;
    private final Uri g;
    private final vjb h;
    private final tqe i;
    private final akem j;

    public tuu(tyk tykVar, txb txbVar, tvy tvyVar, tvy tvyVar2, Uri uri, Uri uri2, akem akemVar, vjb vjbVar, Executor executor, tqe tqeVar, byte[] bArr) {
        this.c = tykVar;
        this.d = txbVar;
        this.e = tvyVar2;
        this.a = tvyVar;
        this.f = uri;
        this.g = uri2;
        this.j = akemVar;
        this.h = vjbVar;
        this.b = executor;
        this.i = tqeVar;
    }

    private static ankt q() {
        return anlz.p(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(Uri uri) {
        if (this.h.h(uri)) {
            this.h.f(uri);
        }
    }

    @Override // defpackage.tul
    public final ankt a(final tqm tqmVar) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.a(tqmVar)), new anir() { // from class: tur
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        tuu tuuVar = tuu.this;
                        return anii.i(tuuVar.n(tuuVar.a.a(tqmVar)), new tum(tuuVar, (tzb) obj), tuuVar.b);
                    }
                }, this.b);
            }
            if (ordinal == 3) {
                return this.e.a(tqmVar);
            }
            return q();
        }
        return this.d.a(tqmVar);
    }

    @Override // defpackage.tul
    public final ankt b() {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.b()), new tuo(this, 1), this.b);
            }
            if (ordinal == 3) {
                return this.e.b();
            }
            return q();
        }
        return this.d.b();
    }

    @Override // defpackage.tul
    public final ankt c() {
        fay fayVar = fay.s;
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.c()), new tup(this, fayVar, 1), this.b);
            }
            if (ordinal == 3) {
                return this.e.c();
            }
            return q();
        }
        return this.d.c();
    }

    @Override // defpackage.tul
    public final ankt d() {
        fay fayVar = fay.t;
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.d()), new tup(this, fayVar), this.b);
            }
            if (ordinal == 3) {
                return this.e.d();
            }
            return q();
        }
        return this.d.d();
    }

    @Override // defpackage.tul
    public final ankt e() {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.e()), new tuo(this), this.b);
            }
            if (ordinal == 3) {
                return this.e.e();
            }
            return q();
        }
        return this.d.e();
    }

    @Override // defpackage.tul
    public final ankt f() {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            try {
                r(this.f);
                r(this.g);
                return ankq.a;
            } catch (IOException e) {
                return anlz.p(e);
            }
        } else if (ordinal == 2) {
            try {
                r(this.g);
                return ankq.a;
            } catch (IOException e2) {
                return anlz.p(e2);
            }
        } else if (ordinal == 3) {
            try {
                r(this.f);
                return ankq.a;
            } catch (IOException e3) {
                return anlz.p(e3);
            }
        } else {
            return q();
        }
    }

    @Override // defpackage.tul
    public final ankt g(tqv tqvVar) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.g(tqvVar)), new tus(this, tqvVar, 1), this.b);
            }
            if (ordinal == 3) {
                return this.e.g(tqvVar);
            }
            return q();
        }
        return this.d.g(tqvVar);
    }

    @Override // defpackage.tul
    public final ankt h(tqv tqvVar) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.h(tqvVar)), new tus(this, tqvVar, 2), this.b);
            }
            if (ordinal == 3) {
                return this.e.h(tqvVar);
            }
            return q();
        }
        return this.d.h(tqvVar);
    }

    @Override // defpackage.tul
    public final ankt i(tqv tqvVar) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.i(tqvVar)), new tus(this, tqvVar), this.b);
            }
            if (ordinal == 3) {
                return this.e.i(tqvVar);
            }
            return q();
        }
        return this.d.i(tqvVar);
    }

    @Override // defpackage.tul
    public final ankt j(List list) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.j(list)), new tuq(this, list, 1), this.b);
            }
            if (ordinal == 3) {
                return this.e.j(list);
            }
            return q();
        }
        return this.d.j(list);
    }

    @Override // defpackage.tul
    public final ankt k() {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.k()), new tuo(this, 2), this.b);
            }
            if (ordinal == 3) {
                return this.e.k();
            }
            return q();
        }
        return this.d.k();
    }

    @Override // defpackage.tul
    public final ankt l(final tqv tqvVar, final tqm tqmVar) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.l(tqvVar, tqmVar)), new anir() { // from class: tut
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        tuu tuuVar = tuu.this;
                        return anii.i(tuuVar.n(tuuVar.a.l(tqvVar, tqmVar)), new tum(tuuVar, (tzb) obj, 1), tuuVar.b);
                    }
                }, this.b);
            }
            if (ordinal == 3) {
                return this.e.l(tqvVar, tqmVar);
            }
            return q();
        }
        return this.d.l(tqvVar, tqmVar);
    }

    @Override // defpackage.tul
    public final ankt m(List list) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(n(this.d.m(list)), new tuq(this, list), this.b);
            }
            if (ordinal == 3) {
                return this.e.m(list);
            }
            return q();
        }
        return this.d.m(list);
    }

    public final ankt n(ankt anktVar) {
        return anhq.h(anii.h(anktVar, ryj.r, this.b), Exception.class, ryj.s, this.b);
    }

    public final ankt o(tzb tzbVar, tzb tzbVar2, int i) {
        this.i.A();
        if (typ.a(10000L)) {
            if (tzbVar.equals(tzbVar2)) {
                this.c.l(1107);
            } else {
                this.c.l(i);
            }
        }
        if (tzbVar.a) {
            return anlz.q(tzbVar.c());
        }
        return anlz.p((Throwable) tzbVar.d());
    }

    public final ankt p(tzb tzbVar, tzb tzbVar2, Comparator comparator, int i) {
        this.i.A();
        if (typ.a(10000L)) {
            if (tzb.g(tzbVar, tzbVar2, comparator)) {
                this.c.l(1106);
            } else {
                this.c.l(i);
            }
        }
        if (tzbVar.a) {
            List list = (List) tzbVar.c();
            list.getClass();
            return anlz.q(list);
        }
        Object d = tzbVar.d();
        d.getClass();
        return anlz.p((Throwable) d);
    }
}
