package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xko  reason: default package */
/* loaded from: classes4.dex */
public final class xko {
    public final aafo a;
    private final Context b;
    private final akfg c;

    public xko(Context context, akfg akfgVar, aafo aafoVar) {
        this.b = context;
        this.c = akfgVar;
        this.a = aafoVar;
    }

    private final void c(int i) {
        akfh l = this.c.l();
        l.k(this.b.getString(i));
        l.i(-1);
        l.j(false);
        this.c.n(l.b());
    }

    public final void a(arnh arnhVar, final Map map) {
        arag aragVar;
        if (arnhVar == null) {
            return;
        }
        arag aragVar2 = arnhVar.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        Spanned b = ajgl.b(aragVar2);
        if (b == null || b.length() == 0) {
            return;
        }
        akfh l = this.c.l();
        l.k(b);
        l.i(-1);
        l.j(false);
        apok apokVar = arnhVar.h;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = arnhVar.h;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            final apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 256) != 0) {
                aragVar = apojVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            l.m(ajgl.b(aragVar), new View.OnClickListener() { // from class: xkn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    apzg apzgVar;
                    xko xkoVar = xko.this;
                    apoj apojVar2 = apojVar;
                    Map map2 = map;
                    int i = apojVar2.b;
                    if ((i & 8192) != 0) {
                        apzgVar = apojVar2.n;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    } else if ((i & 16384) != 0) {
                        apzgVar = apojVar2.o;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    } else {
                        apzgVar = null;
                    }
                    xkoVar.a.c(apzgVar, map2);
                }
            });
        }
        this.c.n(l.b());
    }

    public final void b(arnh arnhVar, Map map, int i) {
        if (arnhVar == null) {
            c(i);
            return;
        }
        arag aragVar = arnhVar.e;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        if (b == null || b.length() == 0) {
            c(i);
        } else {
            a(arnhVar, map);
        }
    }
}
