package defpackage;

import android.text.Spanned;
import android.view.View;
import java.util.Map;
/* compiled from: PG */
/* renamed from: lml  reason: default package */
/* loaded from: classes3.dex */
public final class lml implements ynl {
    private final akfg a;
    private final fvk b;
    private final fvi c;
    private final acth d;
    private final aadd e;

    public lml(akfg akfgVar, fvk fvkVar, fvi fviVar, acth acthVar, aadd aaddVar) {
        this.a = akfgVar;
        this.b = fvkVar;
        this.c = fviVar;
        this.d = acthVar;
        this.e = aaddVar;
    }

    private final void a(byte[] bArr, fvg fvgVar) {
        acti oi = this.d.oi();
        if (bArr.length > 0 && oi != null) {
            fvgVar.b = new lmk(oi, bArr);
        }
        fvgVar.e(!eog.y(this.e));
        this.a.n(fvgVar.b());
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        arag aragVar;
        arag aragVar2;
        View.OnClickListener onClickListener;
        if (i != -1) {
            if (i == 0) {
                aabj aabjVar = (aabj) obj;
                ampq e = aabjVar.e();
                ampq f = aabjVar.f();
                if (e.h()) {
                    a(((atoo) e.c()).e.I(), this.c.a((atoo) e.c(), aabjVar.g()));
                    return null;
                } else if (!f.h()) {
                    return null;
                } else {
                    byte[] I = ((atpl) f.c()).f.I();
                    final fvk fvkVar = this.b;
                    final atpl atplVar = (atpl) f.c();
                    Map g = aabjVar.g();
                    fvg fvgVar = (fvg) fvkVar.a.l();
                    if ((1 & atplVar.b) != 0) {
                        aragVar = atplVar.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    fvgVar.k(ajgl.b(aragVar));
                    if ((atplVar.b & 2) != 0) {
                        aragVar2 = atplVar.d;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    Spanned b = ajgl.b(aragVar2);
                    if ((atplVar.b & 4) != 0) {
                        final Map i2 = actk.i(g);
                        if (i2.containsKey("com.google.android.libraries.youtube.innertube.endpoint.tag")) {
                            i2.put("feedback_undo", i2.get("com.google.android.libraries.youtube.innertube.endpoint.tag"));
                        }
                        i2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", atplVar);
                        onClickListener = new View.OnClickListener() { // from class: fvj
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                fvk fvkVar2 = fvk.this;
                                atpl atplVar2 = atplVar;
                                Map map = i2;
                                aafo aafoVar = fvkVar2.b;
                                apzg apzgVar = atplVar2.e;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                                aafoVar.c(apzgVar, map);
                            }
                        };
                    } else {
                        onClickListener = null;
                    }
                    fvgVar.m(b, onClickListener);
                    a(I, fvgVar);
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aabj.class};
    }
}
