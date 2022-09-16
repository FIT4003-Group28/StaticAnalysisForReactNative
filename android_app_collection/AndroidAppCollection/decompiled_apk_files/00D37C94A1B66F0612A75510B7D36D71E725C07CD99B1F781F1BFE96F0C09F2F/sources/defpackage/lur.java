package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: lur  reason: default package */
/* loaded from: classes3.dex */
public final class lur {
    public final ajmy a;
    public final gfu b;
    public final ayoi c;
    private final eym d;
    private final fzr e;
    private final Context f;
    private final int g;

    public lur(aadd aaddVar, Context context, final aahf aahfVar, final aagi aagiVar, final afvn afvnVar, itg itgVar, yve yveVar, gfu gfuVar, fzr fzrVar, ajmy ajmyVar) {
        this.f = context;
        this.a = ajmyVar;
        this.d = new eym(context);
        this.b = gfuVar;
        this.e = fzrVar;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.yoodle_height);
        ayoi B = itgVar.a().L(ktg.n).V(ktg.p).B();
        this.c = ayoi.o(yveVar.d().C(ktg.m).n().W(), ayoi.m(aaddVar.a, B, lum.a).af(new ayqe() { // from class: lup
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                aahf aahfVar2 = aahf.this;
                afvn afvnVar2 = afvnVar;
                aagi aagiVar2 = aagiVar;
                String str = (String) obj;
                if (str.isEmpty()) {
                    return ayoi.T(amon.a);
                }
                return ayoi.m(aahfVar2.a(afvnVar2.c()).i(str), aagiVar2.a(afvnVar2.c()).i(str), lum.b);
            }
        }).B(), B, img.e).L(new ayqe() { // from class: luo
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                lur lurVar = lur.this;
                Pair pair = (Pair) obj;
                ampq ampqVar = (ampq) pair.first;
                aqlr aqlrVar = (aqlr) pair.second;
                if (ampqVar.h()) {
                    if (!ampqVar.h()) {
                        return ayoc.v(amon.a);
                    }
                    aswn aswnVar = (aswn) ampqVar.c();
                    if (lurVar.b.a() == gfs.LIGHT) {
                        if ((aswnVar.b.b & 8) == 0) {
                            return lurVar.a(aswnVar.getLightThemeLogo());
                        }
                        return lurVar.c(aswnVar.getLightThemeAnimatedLogo());
                    } else if (lurVar.b.a() != gfs.DARK) {
                        return ayoc.v(amon.a);
                    } else {
                        if ((aswnVar.b.b & 16) == 0) {
                            return lurVar.a(aswnVar.getDarkThemeLogo());
                        }
                        return lurVar.c(aswnVar.getDarkThemeAnimatedLogo());
                    }
                }
                gfs a = lurVar.b.a();
                if (a == gfs.LIGHT) {
                    int i = aqlrVar.c;
                    if (i == 1) {
                        arhr b = arhr.b(((arhs) aqlrVar.d).c);
                        if (b == null) {
                            b = arhr.UNKNOWN;
                        }
                        return lurVar.b(b);
                    } else if (i == 2) {
                        return lurVar.c((avhn) aqlrVar.d);
                    }
                } else if (a == gfs.DARK) {
                    int i2 = aqlrVar.e;
                    if (i2 == 9) {
                        arhr b2 = arhr.b(((arhs) aqlrVar.f).c);
                        if (b2 == null) {
                            b2 = arhr.UNKNOWN;
                        }
                        return lurVar.b(b2);
                    } else if (i2 == 10) {
                        return lurVar.c((avhn) aqlrVar.f);
                    }
                }
                return ayoc.v(amon.a);
            }
        }).ad(amon.a).aE().d().B();
    }

    public final ayoc a(aswj aswjVar) {
        if (aswjVar.b == 1) {
            fzr fzrVar = this.e;
            arhr b = arhr.b(((arhs) aswjVar.c).c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            int a = fzrVar.a(b);
            if (a != 0) {
                ampq i = ampq.i(akf.a(this.f, a));
                if (i.h()) {
                    return ayoc.v(i);
                }
            }
        }
        if (aswjVar.b != 2) {
            return ayoc.v(amon.a);
        }
        return c((avhn) aswjVar.c);
    }

    public final ayoc b(arhr arhrVar) {
        Drawable a = akf.a(this.f, this.e.a(arhrVar));
        if (a == null) {
            return ayoc.v(amon.a);
        }
        return ayoc.v(ampq.j(a));
    }

    public final ayoc c(avhn avhnVar) {
        ampq j;
        if (avhnVar.c.size() == 0) {
            return ayoc.v(amon.a);
        }
        int i = this.g;
        if (akel.A(avhnVar)) {
            if (i <= 0) {
                j = ampq.j((avhm) avhnVar.c.get(0));
            } else {
                Iterator it = avhnVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = ampq.j((avhm) avhnVar.c.get(avhnVar.c.size() - 1));
                        break;
                    }
                    avhm avhmVar = (avhm) it.next();
                    if (avhmVar.e >= i) {
                        j = ampq.j(avhmVar);
                        break;
                    }
                }
            }
        } else {
            j = amon.a;
        }
        if (!j.h()) {
            return ayoc.v(amon.a);
        }
        final Uri parse = Uri.parse(((avhm) j.c()).c);
        ayos n = ayos.n(new ayou() { // from class: lul
            @Override // defpackage.ayou
            public final void a(azkm azkmVar) {
                lur lurVar = lur.this;
                lurVar.a.m(parse, new luq(azkmVar));
            }
        });
        final eym eymVar = this.d;
        return n.E(new ayqe() { // from class: lun
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                return eym.this.b((byte[]) obj);
            }
        }).w(kjt.m).E(ktg.q).j().m(kjt.n).z();
    }
}
