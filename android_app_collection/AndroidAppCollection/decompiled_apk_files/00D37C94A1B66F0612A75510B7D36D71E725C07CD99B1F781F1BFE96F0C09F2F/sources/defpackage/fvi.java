package defpackage;

import android.text.Spanned;
import android.view.View;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fvi  reason: default package */
/* loaded from: classes3.dex */
public final class fvi {
    public final aafo a;
    private final akfg b;

    public fvi(akfg akfgVar, aafo aafoVar) {
        this.b = akfgVar;
        this.a = aafoVar;
    }

    public final fvg a(final atoo atooVar, final Map map) {
        arag aragVar;
        final apoj apojVar;
        arag aragVar2;
        fvg fvgVar = (fvg) this.b.l();
        View.OnClickListener onClickListener = null;
        if ((atooVar.b & 1) != 0) {
            aragVar = atooVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        fvgVar.k(ajgl.b(aragVar));
        apok apokVar = atooVar.d;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = atooVar.d;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        if (apojVar != null) {
            if ((apojVar.b & 256) != 0) {
                aragVar2 = apojVar.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            Spanned b = ajgl.b(aragVar2);
            int i = apojVar.b;
            if ((i & 16384) != 0 || (i & 8192) != 0 || (i & 32768) != 0) {
                onClickListener = new View.OnClickListener() { // from class: fvh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fvi fviVar = fvi.this;
                        Map map2 = map;
                        atoo atooVar2 = atooVar;
                        apoj apojVar2 = apojVar;
                        Map i2 = actk.i(map2);
                        i2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", atooVar2);
                        if ((apojVar2.b & 8192) != 0) {
                            aafo aafoVar = fviVar.a;
                            apzg apzgVar = apojVar2.n;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            aafoVar.c(apzgVar, i2);
                        }
                        if ((apojVar2.b & 16384) != 0) {
                            aafo aafoVar2 = fviVar.a;
                            apzg apzgVar2 = apojVar2.o;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            aafoVar2.c(apzgVar2, i2);
                        }
                        if ((apojVar2.b & 32768) != 0) {
                            aafo aafoVar3 = fviVar.a;
                            apzg apzgVar3 = apojVar2.p;
                            if (apzgVar3 == null) {
                                apzgVar3 = apzg.a;
                            }
                            aafoVar3.c(apzgVar3, i2);
                        }
                    }
                };
            }
            fvgVar.m(b, onClickListener);
        }
        return fvgVar;
    }
}
