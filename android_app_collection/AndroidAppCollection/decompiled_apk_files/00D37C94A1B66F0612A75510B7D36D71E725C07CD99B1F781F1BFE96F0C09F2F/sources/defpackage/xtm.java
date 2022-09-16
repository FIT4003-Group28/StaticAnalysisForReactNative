package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: xtm  reason: default package */
/* loaded from: classes4.dex */
public final class xtm extends xsi implements ynl {
    public final xki k;
    public WeakReference l;
    public aumx m;
    private final yni n;
    private final xye o;
    private final aafo p;

    public xtm(Context context, ajmy ajmyVar, ajyi ajyiVar, ajrh ajrhVar, xli xliVar, xki xkiVar, yni yniVar, aafo aafoVar, xye xyeVar, ajsg ajsgVar, akge akgeVar, gfz gfzVar, aacz aaczVar, acti actiVar, xyf xyfVar) {
        super(context, ajmyVar, ajyiVar, ajrhVar, xliVar, ajsgVar, akgeVar, aafoVar, gfzVar, aaczVar, actiVar, xyfVar);
        xkiVar.getClass();
        this.k = xkiVar;
        yniVar.getClass();
        this.n = yniVar;
        aafoVar.getClass();
        this.p = aafoVar;
        xyeVar.getClass();
        this.o = xyeVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        WeakReference weakReference;
        ajxl ajxlVar;
        aumx aumxVar;
        if (i != -1) {
            if (i == 0) {
                if (!((vxm) obj).a() || (weakReference = this.l) == null || (ajxlVar = (ajxl) weakReference.get()) == null || (aumxVar = this.m) == null) {
                    return null;
                }
                ajxlVar.F(new ajxp(ajna.g(aumxVar)));
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{vxm.class};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, ajsa] */
    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        final aqca aqcaVar;
        final apli apliVar;
        auxr auxrVar;
        amuk q;
        HashMap hashMap;
        aqca aqcaVar2;
        avhn avhnVar;
        arag aragVar3;
        arag aragVar4;
        aqbx aqbxVar = (aqbx) obj;
        this.n.g(this);
        if (!aqbxVar.l) {
            ajrsVar.a.u(new acte(aqbxVar.e), null);
        } else {
            ajrsVar.a.G(aqbxVar, aqbxVar.e, this.e);
        }
        if ((aqbxVar.b & 128) != 0) {
            aragVar = aqbxVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((aqbxVar.b & 256) != 0) {
            aragVar2 = aqbxVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        e(b, b2);
        aafo aafoVar = this.p;
        TextView textView = this.h;
        arag aragVar5 = aqbxVar.j;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        zag.m(textView, aafv.a(aragVar5, aafoVar, false));
        zag.o(this.i, (aqbxVar.b & 262144) != 0);
        ajyj ajyjVar = (ajyj) ajrsVar.c("sectionController");
        final xnh xnhVar = new xnh(ajyjVar);
        aqby aqbyVar = aqbxVar.c;
        if (aqbyVar == null) {
            aqbyVar = aqby.a;
        }
        if ((aqbyVar.b & 1) != 0) {
            aqby aqbyVar2 = aqbxVar.c;
            if (aqbyVar2 == null) {
                aqbyVar2 = aqby.a;
            }
            aqcaVar = aqbyVar2.c;
            if (aqcaVar == null) {
                aqcaVar = aqca.a;
            }
        } else {
            aqcaVar = null;
        }
        this.l = null;
        this.m = null;
        if (aqcaVar != null) {
            final ajyj ajyjVar2 = (ajyj) ajrsVar.c("sectionController");
            awlj awljVar = aqcaVar.i;
            if (awljVar == null) {
                awljVar = awlj.a;
            }
            awlh awlhVar = awljVar.c;
            if (awlhVar == null) {
                awlhVar = awlh.a;
            }
            awli awliVar = awlhVar.e;
            if (awliVar == null) {
                awliVar = awli.a;
            }
            if ((awliVar.b & 1) != 0) {
                awlj awljVar2 = aqcaVar.i;
                if (awljVar2 == null) {
                    awljVar2 = awlj.a;
                }
                awlh awlhVar2 = awljVar2.c;
                if (awlhVar2 == null) {
                    awlhVar2 = awlh.a;
                }
                awli awliVar2 = awlhVar2.e;
                if (awliVar2 == null) {
                    awliVar2 = awli.a;
                }
                aumx aumxVar = awliVar2.c;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                this.m = aumxVar;
                if (ajyjVar2 instanceof ajxl) {
                    this.l = new WeakReference((ajxl) ajyjVar2);
                }
            }
            avhn avhnVar2 = aqcaVar.e;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            int aW = awwc.aW(aqcaVar.d);
            if (aW == 0) {
                aW = 1;
            }
            if ((aqcaVar.b & 16) != 0) {
                aragVar4 = aqcaVar.f;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            i(avhnVar2, aW, ajgl.b(aragVar4), new View.OnClickListener() { // from class: xtl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xtm xtmVar = xtm.this;
                    xtmVar.b.f(aqcaVar, ajyjVar2);
                }
            });
        }
        boolean z = TextUtils.isEmpty(b) && TextUtils.isEmpty(b2);
        aqby aqbyVar3 = aqbxVar.c;
        if (aqbyVar3 == null) {
            aqbyVar3 = aqby.a;
        }
        if ((aqbyVar3.b & 2) != 0) {
            aqby aqbyVar4 = aqbxVar.c;
            if (aqbyVar4 == null) {
                aqbyVar4 = aqby.a;
            }
            apliVar = aqbyVar4.d;
            if (apliVar == null) {
                apliVar = apli.a;
            }
        } else {
            apliVar = null;
        }
        int i = true != z ? 2 : 4;
        if (apliVar != null) {
            if ((2 & apliVar.b) != 0) {
                avhnVar = apliVar.e;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
            } else {
                avhnVar = null;
            }
            if ((apliVar.b & 8) != 0) {
                aragVar3 = apliVar.g;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            i(avhnVar, i, ajgl.b(aragVar3), new View.OnClickListener() { // from class: xtk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xtm xtmVar = xtm.this;
                    xtmVar.k.a(apliVar, xnhVar);
                }
            });
            xvb xvbVar = this.k.e;
            Dialog dialog = xvbVar != null ? xvbVar.d : null;
            if (dialog != null && dialog.isShowing()) {
                this.k.d.b = xnhVar;
            }
        }
        if ((aqbxVar.b & 4) != 0) {
            aqbs aqbsVar = aqbxVar.d;
            if (aqbsVar == null) {
                aqbsVar = aqbs.a;
            }
            if (aqbsVar.b == 76818770) {
                auxrVar = (auxr) aqbsVar.c;
            } else {
                auxrVar = auxr.a;
            }
        } else {
            auxrVar = null;
        }
        d(ajrsVar, auxrVar);
        Boolean bool = (Boolean) this.o.b.get(aqbxVar);
        if (bool == null ? aqbxVar.h : bool.booleanValue()) {
            xli xliVar = this.b;
            aqby aqbyVar5 = aqbxVar.c;
            if (aqbyVar5 == null) {
                aqbyVar5 = aqby.a;
            }
            if ((aqbyVar5.b & 1) != 0) {
                aqby aqbyVar6 = aqbxVar.c;
                if (aqbyVar6 == null) {
                    aqbyVar6 = aqby.a;
                }
                aqcaVar2 = aqbyVar6.c;
                if (aqcaVar2 == null) {
                    aqcaVar2 = aqca.a;
                }
            } else {
                aqcaVar2 = null;
            }
            xliVar.f(aqcaVar2, ajyjVar);
            this.o.b.put(aqbxVar, false);
        }
        if (this.o.a(aqbxVar)) {
            aafo aafoVar2 = this.p;
            if (this.o.a(aqbxVar)) {
                q = amuk.o(aqbxVar.i);
            } else {
                q = amuk.q();
            }
            ajyj ajyjVar3 = (ajyj) ajrsVar.c("sectionController");
            if (ajyjVar3 != null) {
                hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.comment.comment_thread_created_callback", new xnh(ajyjVar3));
            } else {
                hashMap = null;
            }
            aafoVar2.d(q, hashMap);
            this.o.a.put(aqbxVar, true);
        }
        if ((aqbxVar.b & 2097152) != 0) {
            aunb aunbVar = aqbxVar.k;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
                return;
            }
            aunb aunbVar2 = aqbxVar.k;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            this.j.ag(new LinearLayoutManager());
            RecyclerView recyclerView = this.j;
            ajsm ajsmVar = new ajsm();
            ajsf a = this.c.a(this.d.get());
            a.h(ajsmVar);
            ajhh a2 = ajhh.a((aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer));
            recyclerView.ad(a);
            ajsmVar.add(a2);
            zag.o(this.j, true);
        }
    }

    @Override // defpackage.xsi, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.g();
        this.n.m(this);
        this.l = null;
        this.m = null;
    }
}
