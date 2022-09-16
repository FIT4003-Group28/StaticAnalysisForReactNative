package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tve  reason: default package */
/* loaded from: classes4.dex */
public final class tve implements twy {
    public final tyk a;
    public final txd b;
    public final twg c;
    public final Executor d;
    public final tqe e;
    private final twg f;
    private final Uri g;
    private final Uri h;
    private final vjb i;
    private final akem j;

    public tve(tyk tykVar, txd txdVar, twg twgVar, twg twgVar2, Uri uri, Uri uri2, akem akemVar, vjb vjbVar, Executor executor, tqe tqeVar, byte[] bArr) {
        this.a = tykVar;
        this.b = txdVar;
        this.c = twgVar;
        this.f = twgVar2;
        this.g = uri;
        this.h = uri2;
        this.j = akemVar;
        this.i = vjbVar;
        this.d = executor;
        this.e = tqeVar;
    }

    private static ankt i() {
        return anlz.p(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void j(Uri uri) {
        if (this.i.h(uri)) {
            this.i.f(uri);
        }
    }

    @Override // defpackage.twy
    public final ankt a() {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(b(this.b.a()), new tvb(this, 1), this.d);
            }
            if (ordinal == 3) {
                return this.f.a();
            }
            return i();
        }
        return this.b.a();
    }

    public final ankt b(ankt anktVar) {
        return anhq.h(anii.h(anktVar, ryj.t, this.d), Exception.class, ryj.u, this.d);
    }

    @Override // defpackage.twy
    public final ankt c() {
        final fay fayVar = fay.u;
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(b(this.b.c()), new anir() { // from class: tuz
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        final tve tveVar = tve.this;
                        final Comparator comparator = fayVar;
                        final tzb tzbVar = (tzb) obj;
                        return anii.i(tveVar.b(tveVar.c.c()), new anir() { // from class: tux
                            @Override // defpackage.anir
                            public final ankt a(Object obj2) {
                                tve tveVar2 = tve.this;
                                tzb tzbVar2 = tzbVar;
                                Comparator comparator2 = comparator;
                                tzb tzbVar3 = (tzb) obj2;
                                tveVar2.e.A();
                                if (typ.a(10000L)) {
                                    if (tzb.g(tzbVar2, tzbVar3, comparator2)) {
                                        tveVar2.a.l(1106);
                                    } else {
                                        tveVar2.a.l(1103);
                                    }
                                }
                                if (tzbVar2.a) {
                                    List list = (List) tzbVar2.c();
                                    list.getClass();
                                    return anlz.q(list);
                                }
                                Object d = tzbVar2.d();
                                d.getClass();
                                return anlz.p((Throwable) d);
                            }
                        }, tveVar.d);
                    }
                }, this.d);
            }
            if (ordinal == 3) {
                return this.f.c();
            }
            return i();
        }
        return this.b.c();
    }

    @Override // defpackage.twy
    public final ankt d() {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            try {
                j(this.g);
                j(this.h);
                return this.b.d();
            } catch (IOException e) {
                return anlz.p(e);
            }
        } else if (ordinal == 2) {
            try {
                j(this.h);
                return anii.i(this.b.d(), new tvb(this), this.d);
            } catch (IOException e2) {
                return anlz.p(e2);
            }
        } else if (ordinal == 3) {
            try {
                j(this.g);
                return this.f.d();
            } catch (IOException e3) {
                return anlz.p(e3);
            }
        } else {
            return i();
        }
    }

    @Override // defpackage.twy
    public final ankt e(tqy tqyVar) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(b(this.b.e(tqyVar)), new tvc(this, tqyVar, 1), this.d);
            }
            if (ordinal == 3) {
                return this.f.e(tqyVar);
            }
            return i();
        }
        return this.b.e(tqyVar);
    }

    @Override // defpackage.twy
    public final ankt f(tqy tqyVar) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(b(this.b.f(tqyVar)), new tvc(this, tqyVar), this.d);
            }
            if (ordinal == 3) {
                return this.f.f(tqyVar);
            }
            return i();
        }
        return this.b.f(tqyVar);
    }

    @Override // defpackage.twy
    public final ankt g(tqy tqyVar, tqz tqzVar) {
        tqh tqhVar = tqh.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return anii.i(b(this.b.g(tqyVar, tqzVar)), new tvd(this, tqyVar, tqzVar), this.d);
            }
            if (ordinal == 3) {
                return this.f.g(tqyVar, tqzVar);
            }
            return i();
        }
        return this.b.g(tqyVar, tqzVar);
    }

    public final ankt h(tzb tzbVar, tzb tzbVar2, int i) {
        this.e.A();
        if (typ.a(10000L)) {
            if (tzbVar.equals(tzbVar2)) {
                this.a.l(1106);
            } else {
                this.a.l(i);
            }
        }
        if (tzbVar.a) {
            return anlz.q(tzbVar.c());
        }
        return anlz.p((Throwable) tzbVar.d());
    }
}
