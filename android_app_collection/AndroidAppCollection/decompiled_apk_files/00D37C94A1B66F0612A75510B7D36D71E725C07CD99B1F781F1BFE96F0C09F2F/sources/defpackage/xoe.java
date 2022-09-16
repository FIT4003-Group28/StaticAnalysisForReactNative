package defpackage;

import android.content.Context;
import android.text.Spanned;
/* compiled from: PG */
/* renamed from: xoe  reason: default package */
/* loaded from: classes4.dex */
public final class xoe {
    public String a;
    private final Context b;
    private final aafo c;
    private final acti d;
    private final xli e;
    private final xxx f;
    private final ajgz g;

    public xoe(Context context, aafo aafoVar, acti actiVar, xli xliVar, xxx xxxVar, ajgz ajgzVar) {
        this.b = context;
        this.c = aafoVar;
        this.e = xliVar;
        this.d = actiVar;
        this.f = xxxVar;
        this.g = ajgzVar;
    }

    public final void a(xlv xlvVar, aqiu aqiuVar, apzm apzmVar, apzm apzmVar2, boolean z) {
        aqft aqftVar;
        arag aragVar;
        apoj apojVar;
        String str = this.a;
        if (str != null) {
            this.e.l = str;
        }
        arag aragVar2 = null;
        if (xlvVar == null) {
            if (aqiuVar.b != 97806346) {
                return;
            }
            aqbc aqbcVar = (aqbc) aqiuVar.c;
            ajrs ajrsVar = this.f.b;
            this.e.h(aqbcVar, ajrsVar != null ? (xmd) ajrsVar.c("commentThreadMutator") : null, null, z);
            return;
        }
        xmd xmdVar = xlvVar.a;
        aqal c = this.f.c(xlvVar.b, xmdVar.h());
        if (c == aqal.COMMENT_POLL_STATUS_NO_VOTE && (apzmVar.b & 1) != 0) {
            aqftVar = apzmVar.c;
            if (aqftVar == null) {
                aqftVar = aqft.a;
            }
        } else if (c != aqal.COMMENT_POLL_STATUS_VOTE_AND_COMMENT || (apzmVar2.b & 1) == 0) {
            aqftVar = null;
        } else {
            aqftVar = apzmVar2.c;
            if (aqftVar == null) {
                aqftVar = aqft.a;
            }
        }
        if (aqftVar == null) {
            if (aqiuVar.b != 97806346) {
                return;
            }
            aqbc aqbcVar2 = (aqbc) aqiuVar.c;
            aplq aplqVar = xlvVar.b.B;
            if (aplqVar == null) {
                aplqVar = aplq.a;
            }
            if (aplqVar.b != 99391126) {
                this.e.h(aqbcVar2, xmdVar, xlvVar.b, false);
                return;
            }
            xli xliVar = this.e;
            aqav aqavVar = xlvVar.b;
            if ((aqbcVar2.b & 32) == 0) {
                zep.b("No reply button specified for comment reply dialog.");
                return;
            }
            apok apokVar = aqbcVar2.f;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                zep.b("No button renderer specified for comment reply dialog.");
                return;
            }
            apok apokVar2 = aqbcVar2.f;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            if ((apojVar2.b & 8192) == 0) {
                zep.b("No service endpoint specified for comment reply dialog.");
                return;
            }
            aqbc c2 = xliVar.c(aqbcVar2);
            if (xli.p(aqavVar) == null) {
                aqal b = aqal.b(aqavVar.H);
                if (b == null) {
                    b = aqal.COMMENT_POLL_STATUS_UNKNOWN;
                }
                if (b != aqal.COMMENT_POLL_STATUS_VOTE_NO_COMMENT) {
                    return;
                }
                xliVar.h(c2, xmdVar, aqavVar, false);
                return;
            }
            avhn avhnVar = c2.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            avhn avhnVar2 = avhnVar;
            if ((c2.b & 16) != 0) {
                aragVar = c2.e;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b2 = ajgl.b(aragVar);
            apok apokVar3 = c2.f;
            if (apokVar3 == null) {
                apokVar3 = apok.a;
            }
            apoj apojVar3 = apokVar3.c;
            if (apojVar3 == null) {
                apojVar3 = apoj.a;
            }
            apzg apzgVar = apojVar3.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            apzg apzgVar2 = apzgVar;
            if ((c2.b & 128) != 0) {
                apok apokVar4 = c2.g;
                if (apokVar4 == null) {
                    apokVar4 = apok.a;
                }
                apoj apojVar4 = apokVar4.c;
                if (apojVar4 == null) {
                    apojVar4 = apoj.a;
                }
                apojVar = apojVar4;
            } else {
                apojVar = null;
            }
            apok apokVar5 = c2.i;
            if (apokVar5 == null) {
                apokVar5 = apok.a;
            }
            apoj apojVar5 = apokVar5.c;
            if (apojVar5 == null) {
                apojVar5 = apoj.a;
            }
            apoj apojVar6 = apojVar5;
            aunb aunbVar = c2.j;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aunb aunbVar2 = aunbVar;
            String str2 = c2.k;
            if ((c2.b & 16) != 0 && (aragVar2 = c2.e) == null) {
                aragVar2 = arag.a;
            }
            xliVar.e(new xlp(1, avhnVar2, xmdVar, aqavVar, null, b2, null, apzgVar2, apojVar, apojVar6, aunbVar2, str2, null, aragVar2, null, c2), null, null, null, false, false);
            return;
        }
        ajgx.m(this.b, aqftVar, this.c, this.d, this.g);
    }
}
