package defpackage;

import com.google.protos.youtube.api.innertube.CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xof  reason: default package */
/* loaded from: classes4.dex */
public final class xof implements aafl {
    private final xoe a;
    private final acth b;
    private final aagi c;
    private final aafo d;
    private final afvn e;

    public xof(xoe xoeVar, acth acthVar, afvn afvnVar, aagi aagiVar, aafo aafoVar) {
        this.a = xoeVar;
        this.b = acthVar;
        this.e = afvnVar;
        this.c = aagiVar;
        this.d = aafoVar;
    }

    private final acti b() {
        return this.b.oi();
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aagh a = this.c.a(this.e.c());
        CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint = (CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint) apzgVar.qm(CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.createCommentReplyDialogEndpoint);
        aovf aovfVar = (aovf) a.f(createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.g).g(aovf.class).W();
        if (aovfVar == null || !aovfVar.getShouldRequireViewerAck().booleanValue()) {
            boolean z = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.f;
            if (z && b() != null) {
                b().q(new acte(actj.CIVILITY_REMINDER_DIALOG), null);
                b().H(3, new acte(actj.CIVILITY_REMINDER_EDIT_BUTTON), null);
            }
            if ((createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.b & 128) != 0) {
                String str = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.i;
                this.a.a = str;
                xxs.g(a, str, true);
            }
            xoe xoeVar = this.a;
            xlv xlvVar = (xlv) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xlv.class);
            aqiu aqiuVar = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.c;
            if (aqiuVar == null) {
                aqiuVar = aqiu.a;
            }
            aqiu aqiuVar2 = aqiuVar;
            apzm apzmVar = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.d;
            if (apzmVar == null) {
                apzmVar = apzm.a;
            }
            apzm apzmVar2 = apzmVar;
            apzm apzmVar3 = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.e;
            if (apzmVar3 == null) {
                apzmVar3 = apzm.a;
            }
            xoeVar.a(xlvVar, aqiuVar2, apzmVar2, apzmVar3, z);
            return;
        }
        aafo aafoVar = this.d;
        apzg apzgVar2 = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.h;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar.a(apzgVar2);
    }
}
