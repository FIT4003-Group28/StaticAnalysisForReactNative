package defpackage;

import android.text.Spanned;
import com.google.protos.youtube.api.innertube.UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xop  reason: default package */
/* loaded from: classes4.dex */
public final class xop implements aafl {
    private final xli a;
    private final xki b;
    private final acth c;

    public xop(xli xliVar, xki xkiVar, acth acthVar) {
        xliVar.getClass();
        this.a = xliVar;
        xkiVar.getClass();
        this.b = xkiVar;
        this.c = acthVar;
    }

    private final acti b() {
        return this.c.oi();
    }

    private final void c(UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, xmd xmdVar, aqav aqavVar) {
        aqak aqakVar;
        arag aragVar;
        arag aragVar2;
        boolean z = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.c;
        avsu avsuVar = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.b;
        if (avsuVar == null) {
            avsuVar = avsu.a;
        }
        if (avsuVar.b != 122274699) {
            zep.b("Executed UpdateCommentDialogEndpoint with no dialog.");
            return;
        }
        xli xliVar = this.a;
        avsu avsuVar2 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.b;
        if (avsuVar2 == null) {
            avsuVar2 = avsu.a;
        }
        if (avsuVar2.b == 122274699) {
            aqakVar = (aqak) avsuVar2.c;
        } else {
            aqakVar = aqak.a;
        }
        aopa mo52toBuilder = aqakVar.mo52toBuilder();
        aqak aqakVar2 = (aqak) mo52toBuilder.instance;
        if ((aqakVar2.b & 8) == 0) {
            zep.b("No submit button specified for comment dialog.");
            return;
        }
        apok apokVar = aqakVar2.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) == 0) {
            zep.b("No button renderer specified for comment dialog.");
            return;
        }
        apok apokVar2 = ((aqak) mo52toBuilder.instance).f;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar = apokVar2.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 8192) == 0) {
            zep.b("No service endpoint specified for comment dialog.");
            return;
        }
        apok apokVar3 = ((aqak) mo52toBuilder.instance).f;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        aopa mo52toBuilder2 = apokVar3.mo52toBuilder();
        apok apokVar4 = ((aqak) mo52toBuilder.instance).f;
        if (apokVar4 == null) {
            apokVar4 = apok.a;
        }
        apoj apojVar2 = apokVar4.c;
        if (apojVar2 == null) {
            apojVar2 = apoj.a;
        }
        apoj b = xliVar.b(apojVar2);
        mo52toBuilder2.copyOnWrite();
        apok apokVar5 = (apok) mo52toBuilder2.instance;
        b.getClass();
        apokVar5.c = b;
        apokVar5.b |= 1;
        mo52toBuilder.copyOnWrite();
        aqak aqakVar3 = (aqak) mo52toBuilder.instance;
        apok apokVar6 = (apok) mo52toBuilder2.mo39build();
        apokVar6.getClass();
        aqakVar3.f = apokVar6;
        aqakVar3.b |= 8;
        avhn avhnVar = ((aqak) mo52toBuilder.instance).e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        avhn avhnVar2 = avhnVar;
        aqak aqakVar4 = (aqak) mo52toBuilder.instance;
        arag aragVar3 = null;
        if ((aqakVar4.b & 2) != 0) {
            aragVar = aqakVar4.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b2 = ajgl.b(aragVar);
        apok apokVar7 = ((aqak) mo52toBuilder.instance).f;
        if (apokVar7 == null) {
            apokVar7 = apok.a;
        }
        apoj apojVar3 = apokVar7.c;
        if (apojVar3 == null) {
            apojVar3 = apoj.a;
        }
        apzg apzgVar = apojVar3.n;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        apzg apzgVar2 = apzgVar;
        apok apokVar8 = ((aqak) mo52toBuilder.instance).g;
        if (apokVar8 == null) {
            apokVar8 = apok.a;
        }
        apoj apojVar4 = apokVar8.c;
        if (apojVar4 == null) {
            apojVar4 = apoj.a;
        }
        apoj apojVar5 = apojVar4;
        aunb aunbVar = ((aqak) mo52toBuilder.instance).h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aunb aunbVar2 = aunbVar;
        aqak aqakVar5 = (aqak) mo52toBuilder.instance;
        String str = aqakVar5.i;
        if ((aqakVar5.b & 2) != 0) {
            arag aragVar4 = aqakVar5.d;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            aragVar2 = aragVar4;
        } else {
            aragVar2 = null;
        }
        xlp xlpVar = new xlp(2, avhnVar2, xmdVar, aqavVar, null, b2, null, apzgVar2, null, apojVar5, aunbVar2, str, null, aragVar2, (aqak) mo52toBuilder.mo39build(), null);
        aqak aqakVar6 = (aqak) mo52toBuilder.instance;
        if ((aqakVar6.b & 1) != 0 && (aragVar3 = aqakVar6.c) == null) {
            aragVar3 = arag.a;
        }
        xliVar.e(xlpVar, null, ajgl.b(aragVar3), null, false, z);
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        apli apliVar;
        apli apliVar2;
        UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint = (UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint) apzgVar.qm(UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.updateCommentDialogEndpoint);
        if (updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.c && b() != null) {
            b().H(3, new acte(actj.CIVILITY_REMINDER_EDIT_BUTTON), null);
        }
        xlx xlxVar = (xlx) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xlx.class);
        if (xlxVar == null) {
            avsu avsuVar = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.b;
            if (avsuVar == null) {
                avsuVar = avsu.a;
            }
            if (avsuVar.b != 118523928) {
                c(updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, null, null);
                return;
            }
            xki xkiVar = this.b;
            avsu avsuVar2 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.b;
            if (avsuVar2 == null) {
                avsuVar2 = avsu.a;
            }
            if (avsuVar2.b == 118523928) {
                apliVar2 = (apli) avsuVar2.c;
            } else {
                apliVar2 = apli.a;
            }
            xkiVar.b(apliVar2, null);
            return;
        }
        xmd e = xlxVar.e();
        avsu avsuVar3 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.b;
        if (avsuVar3 == null) {
            avsuVar3 = avsu.a;
        }
        if (avsuVar3.b != 118523928) {
            c(updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, e, ((xkp) xlxVar).d());
            return;
        }
        xki xkiVar2 = this.b;
        avsu avsuVar4 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.b;
        if (avsuVar4 == null) {
            avsuVar4 = avsu.a;
        }
        if (avsuVar4.b == 118523928) {
            apliVar = (apli) avsuVar4.c;
        } else {
            apliVar = apli.a;
        }
        xkiVar2.b(apliVar, e);
    }
}
