package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Optional;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fup  reason: default package */
/* loaded from: classes3.dex */
public final class fup {
    public final aafo a;
    private final akfd b;
    private final ajxz c;
    private final ajve d;

    public fup(akfd akfdVar, ajxz ajxzVar, aafo aafoVar, ajve ajveVar) {
        this.b = akfdVar;
        this.c = ajxzVar;
        this.a = aafoVar;
        this.d = ajveVar;
    }

    public static Map a(atds atdsVar, Map map, boolean z) {
        Map h = actk.h(atdsVar, z);
        if (map != null) {
            h.putAll(map);
        }
        return h;
    }

    private final View.OnClickListener c(final apoj apojVar, final atds atdsVar, final Map map) {
        if (apojVar != null) {
            int i = apojVar.b;
            if ((i & 8192) != 0 || (i & 16384) != 0) {
                return new View.OnClickListener() { // from class: fuo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fup fupVar = fup.this;
                        apoj apojVar2 = apojVar;
                        atds atdsVar2 = atdsVar;
                        Map map2 = map;
                        int i2 = apojVar2.b;
                        if ((i2 & 8192) != 0) {
                            boolean z = !((i2 & 16384) != 0);
                            aafo aafoVar = fupVar.a;
                            apzg apzgVar = apojVar2.n;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            aafoVar.c(apzgVar, fup.a(atdsVar2, map2, z));
                        }
                        if ((apojVar2.b & 16384) != 0) {
                            aafo aafoVar2 = fupVar.a;
                            apzg apzgVar2 = apojVar2.o;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            aafoVar2.c(apzgVar2, fup.a(atdsVar2, map2, false));
                        }
                    }
                };
            }
            return null;
        }
        return null;
    }

    private static apoj d(atdr atdrVar) {
        if (atdrVar == null || (atdrVar.b & 1) == 0) {
            return null;
        }
        apoj apojVar = atdrVar.c;
        return apojVar == null ? apoj.a : apojVar;
    }

    public final akfe b(atds atdsVar, Map map) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        atdr atdrVar = atdsVar.f;
        if (atdrVar == null) {
            atdrVar = atdr.a;
        }
        apoj d = d(atdrVar);
        atdr atdrVar2 = atdsVar.g;
        if (atdrVar2 == null) {
            atdrVar2 = atdr.a;
        }
        apoj d2 = d(atdrVar2);
        akfe l = this.b.l();
        l.h(!atdsVar.m);
        l.f(!atdsVar.k);
        if ((atdsVar.b & 2048) != 0) {
            aragVar = atdsVar.l;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        l.c = ajgl.b(aragVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < atdsVar.e.size(); i++) {
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            spannableStringBuilder.append((CharSequence) ajgl.c((arag) atdsVar.e.get(i), this.d));
        }
        l.d = spannableStringBuilder;
        if (d == null || (d.b & 256) == 0) {
            aragVar2 = null;
        } else {
            aragVar2 = d.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        }
        akfe b = l.b(ajgl.b(aragVar2), c(d, atdsVar, map), d);
        if (d2 == null || (d2.b & 256) == 0) {
            aragVar3 = null;
        } else {
            aragVar3 = d2.i;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        }
        akfe c = b.c(ajgl.b(aragVar3), c(d2, atdsVar, null));
        c.i = d2;
        if ((atdsVar.b & 1) != 0) {
            avhn avhnVar = atdsVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            c.g(0);
            c.j = avhnVar;
            c.k = Optional.empty();
        }
        if ((atdsVar.b & 2) != 0) {
            ajxz ajxzVar = this.c;
            arhs arhsVar = atdsVar.d;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b2 = arhr.b(arhsVar.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            c.d(ajxzVar.a(b2));
        }
        return c;
    }
}
