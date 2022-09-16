package defpackage;

import android.text.Spanned;
import android.view.View;
/* compiled from: PG */
/* renamed from: xsk  reason: default package */
/* loaded from: classes4.dex */
final class xsk implements View.OnClickListener {
    final /* synthetic */ aqca a;
    final /* synthetic */ xmd b;
    final /* synthetic */ aqav c;
    final /* synthetic */ xsl d;

    public xsk(xsl xslVar, aqca aqcaVar, xmd xmdVar, aqav aqavVar) {
        this.d = xslVar;
        this.a = aqcaVar;
        this.b = xmdVar;
        this.c = aqavVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        arag aragVar;
        apoj apojVar;
        arag aragVar2;
        xli xliVar = this.d.b;
        aqca aqcaVar = this.a;
        xmd xmdVar = this.b;
        aqav aqavVar = this.c;
        if ((aqcaVar.b & 32) == 0) {
            if (!xliVar.d.c(aqcaVar)) {
                zep.b("No button renderer specified for comment detail simplebox.");
                return;
            } else if ((xliVar.d.a(aqcaVar).b & 8192) == 0) {
                zep.b("No service endpoint specified for comment detail simplebox.");
                return;
            } else {
                xyc xycVar = xliVar.d;
                xycVar.b(aqcaVar, xliVar.b(xycVar.a(aqcaVar)));
                if (xli.p(aqavVar) == null) {
                    aqal b = aqal.b(aqavVar.H);
                    if (b == null) {
                        b = aqal.COMMENT_POLL_STATUS_UNKNOWN;
                    }
                    if (b != aqal.COMMENT_POLL_STATUS_VOTE_NO_COMMENT) {
                        return;
                    }
                    xliVar.g(aqcaVar, xmdVar);
                    return;
                }
                avhn avhnVar = aqcaVar.e;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                avhn avhnVar2 = avhnVar;
                if ((aqcaVar.b & 16) != 0) {
                    aragVar = aqcaVar.f;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                Spanned b2 = ajgl.b(aragVar);
                apzg apzgVar = xliVar.d.a(aqcaVar).n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                apzg apzgVar2 = apzgVar;
                apok apokVar = aqcaVar.h;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                if ((apokVar.b & 1) != 0) {
                    apok apokVar2 = aqcaVar.h;
                    if (apokVar2 == null) {
                        apokVar2 = apok.a;
                    }
                    apoj apojVar2 = apokVar2.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    apojVar = apojVar2;
                } else {
                    apojVar = null;
                }
                apok apokVar3 = aqcaVar.j;
                if (apokVar3 == null) {
                    apokVar3 = apok.a;
                }
                apoj apojVar3 = apokVar3.c;
                if (apojVar3 == null) {
                    apojVar3 = apoj.a;
                }
                apoj apojVar4 = apojVar3;
                aunb aunbVar = aqcaVar.k;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                aunb aunbVar2 = aunbVar;
                String str = aqcaVar.l;
                if ((aqcaVar.b & 16) != 0) {
                    arag aragVar3 = aqcaVar.f;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    aragVar2 = aragVar3;
                } else {
                    aragVar2 = null;
                }
                xliVar.e(new xlp(1, avhnVar2, xmdVar, aqavVar, null, b2, null, apzgVar2, apojVar, apojVar4, aunbVar2, str, null, aragVar2, null, null), null, null, null, false, false);
                return;
            }
        }
        aafo aafoVar = xliVar.b;
        apzg apzgVar3 = aqcaVar.g;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        aafoVar.c(apzgVar3, null);
    }
}
