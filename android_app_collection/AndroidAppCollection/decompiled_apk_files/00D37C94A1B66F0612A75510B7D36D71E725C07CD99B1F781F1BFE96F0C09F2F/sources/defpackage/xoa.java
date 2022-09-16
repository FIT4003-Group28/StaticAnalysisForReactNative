package defpackage;

import android.text.Spanned;
import com.google.protos.youtube.api.innertube.CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xoa  reason: default package */
/* loaded from: classes4.dex */
public final class xoa implements aafl {
    private final xli a;
    private final acth b;

    public xoa(xli xliVar, acth acthVar) {
        this.a = xliVar;
        this.b = acthVar;
    }

    private final acti b() {
        return this.b.oi();
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        awlh awlhVar;
        arag aragVar;
        arag aragVar2;
        CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint = (CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint) apzgVar.qm(CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.createCommentDialogEndpoint);
        arag aragVar3 = null;
        if (createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.d && b() != null) {
            b().q(new acte(actj.CIVILITY_REMINDER_DIALOG), null);
            b().H(3, new acte(actj.CIVILITY_REMINDER_EDIT_BUTTON), null);
        }
        xli xliVar = this.a;
        aqit aqitVar = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.b;
        if (aqitVar == null) {
            aqitVar = aqit.a;
        }
        if (aqitVar.b != 122274699) {
            zep.b("No comment dialog renderer specified for CreateCommentDialogEndpoint.");
            return;
        }
        aqit aqitVar2 = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.b;
        if (aqitVar2 == null) {
            aqitVar2 = aqit.a;
        }
        aqak aqakVar = aqitVar2.b == 122274699 ? (aqak) aqitVar2.c : aqak.a;
        apok apokVar = aqakVar.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) == 0) {
            zep.b("No submit button renderer specified for CreateCommentDialogEndpoint.");
            return;
        }
        apok apokVar2 = aqakVar.f;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar = apokVar2.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 8192) == 0) {
            zep.b("No service endpoint on submit button specified for CreateCommentDialogEndpoint.");
            return;
        }
        Long d = xliVar.n.d();
        if (xliVar.a() != null) {
            apok apokVar3 = aqakVar.f;
            if (apokVar3 == null) {
                apokVar3 = apok.a;
            }
            aopa mo52toBuilder = apokVar3.mo52toBuilder();
            apok apokVar4 = aqakVar.f;
            if (apokVar4 == null) {
                apokVar4 = apok.a;
            }
            apoj apojVar2 = apokVar4.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            apoj b = xliVar.b(apojVar2);
            mo52toBuilder.copyOnWrite();
            apok apokVar5 = (apok) mo52toBuilder.instance;
            b.getClass();
            apokVar5.c = b;
            apokVar5.b |= 1;
            apok apokVar6 = (apok) mo52toBuilder.mo39build();
            aopa mo52toBuilder2 = aqakVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            aqak aqakVar2 = (aqak) mo52toBuilder2.instance;
            apokVar6.getClass();
            aqakVar2.f = apokVar6;
            aqakVar2.b |= 8;
            aqakVar = (aqak) mo52toBuilder2.mo39build();
        }
        awlj awljVar = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.c;
        if (awljVar == null) {
            awljVar = awlj.a;
        }
        if ((awljVar.b & 1) != 0) {
            awlj awljVar2 = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.c;
            if (awljVar2 == null) {
                awljVar2 = awlj.a;
            }
            awlh awlhVar2 = awljVar2.c;
            if (awlhVar2 == null) {
                awlhVar2 = awlh.a;
            }
            awlhVar = awlhVar2;
        } else {
            awlhVar = null;
        }
        boolean z = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.d;
        avhn avhnVar = aqakVar.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        avhn avhnVar2 = avhnVar;
        if ((aqakVar.b & 2) != 0) {
            aragVar = aqakVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b2 = ajgl.b(aragVar);
        apok apokVar7 = aqakVar.f;
        if (apokVar7 == null) {
            apokVar7 = apok.a;
        }
        apoj apojVar3 = apokVar7.c;
        if (apojVar3 == null) {
            apojVar3 = apoj.a;
        }
        apzg apzgVar2 = apojVar3.n;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        apzg apzgVar3 = apzgVar2;
        apok apokVar8 = aqakVar.g;
        if (apokVar8 == null) {
            apokVar8 = apok.a;
        }
        apoj apojVar4 = apokVar8.c;
        if (apojVar4 == null) {
            apojVar4 = apoj.a;
        }
        apoj apojVar5 = apojVar4;
        aunb aunbVar = aqakVar.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aunb aunbVar2 = aunbVar;
        String str = aqakVar.i;
        if ((aqakVar.b & 2) != 0) {
            arag aragVar4 = aqakVar.d;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            aragVar2 = aragVar4;
        } else {
            aragVar2 = null;
        }
        xlp xlpVar = new xlp(1, avhnVar2, null, null, null, b2, awlhVar, apzgVar3, null, apojVar5, aunbVar2, str, null, aragVar2, aqakVar, null);
        if ((aqakVar.b & 1) != 0 && (aragVar3 = aqakVar.c) == null) {
            aragVar3 = arag.a;
        }
        xliVar.e(xlpVar, null, aafv.a(aragVar3, xliVar.b, false), d, false, z);
    }
}
