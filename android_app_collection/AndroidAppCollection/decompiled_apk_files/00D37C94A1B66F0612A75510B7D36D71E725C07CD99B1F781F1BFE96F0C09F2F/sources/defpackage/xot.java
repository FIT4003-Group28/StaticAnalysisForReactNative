package defpackage;

import com.google.protos.youtube.api.innertube.UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xot  reason: default package */
/* loaded from: classes4.dex */
public final class xot implements aafl {
    private final xli a;
    private final acth b;

    public xot(xli xliVar, acth acthVar) {
        xliVar.getClass();
        this.a = xliVar;
        this.b = acthVar;
    }

    private final acti b() {
        return this.b.oi();
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqbc aqbcVar;
        aqbc aqbcVar2;
        UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint = (UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint) apzgVar.qm(UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.updateCommentReplyDialogEndpoint);
        if (updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.c && b() != null) {
            b().H(3, new acte(actj.CIVILITY_REMINDER_EDIT_BUTTON), null);
        }
        avsv avsvVar = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.b;
        if (avsvVar == null) {
            avsvVar = avsv.a;
        }
        if (avsvVar.b != 97806346) {
            zep.b("Executed UpdateCommentReplyDialogEndpoint with no CommentReplyDialogRenderer.");
            return;
        }
        boolean z = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.c;
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (!(I instanceof xlx) || !(I instanceof xkp)) {
            xli xliVar = this.a;
            avsv avsvVar2 = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.b;
            if (avsvVar2 == null) {
                avsvVar2 = avsv.a;
            }
            if (avsvVar2.b == 97806346) {
                aqbcVar = (aqbc) avsvVar2.c;
            } else {
                aqbcVar = aqbc.a;
            }
            xliVar.o(aqbcVar, null, null, z);
            return;
        }
        xli xliVar2 = this.a;
        avsv avsvVar3 = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.b;
        if (avsvVar3 == null) {
            avsvVar3 = avsv.a;
        }
        if (avsvVar3.b == 97806346) {
            aqbcVar2 = (aqbc) avsvVar3.c;
        } else {
            aqbcVar2 = aqbc.a;
        }
        xliVar2.o(aqbcVar2, ((xlx) I).e(), ((xkp) I).d(), false);
    }
}
