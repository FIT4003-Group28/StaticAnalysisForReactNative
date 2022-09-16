package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.CommentUserFeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UserFeedbackEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xnx  reason: default package */
/* loaded from: classes4.dex */
public final class xnx implements aafl {
    public final akul a;
    public final Activity b;
    private final akui c;
    private final /* synthetic */ int d;

    public xnx(Activity activity, akul akulVar, akui akuiVar) {
        this.b = activity;
        this.a = akulVar;
        this.c = akuiVar;
    }

    public xnx(Activity activity, akul akulVar, akui akuiVar, int i) {
        this.d = i;
        this.b = activity;
        this.a = akulVar;
        this.c = akuiVar;
    }

    private final acti b() {
        Activity activity = this.b;
        if (activity instanceof acth) {
            return ((acth) activity).oi();
        }
        return null;
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, Map map) {
        if (this.d == 0) {
            final aqcc aqccVar = (aqcc) apzgVar.qm(CommentUserFeedbackEndpointOuterClass.commentUserFeedbackEndpoint);
            if (aqccVar.e && b() != null) {
                b().H(3, new acte(actj.CIVILITY_REMINDER_REPORT_BUTTON), null);
            }
            this.c.b(new akuh() { // from class: xnw
                @Override // defpackage.akuh
                public final void a(Bundle bundle) {
                    xnx xnxVar = xnx.this;
                    aqcc aqccVar2 = aqccVar;
                    for (avvn avvnVar : aqccVar2.b) {
                        avvo avvoVar = avvnVar.c;
                        if (avvoVar == null) {
                            avvoVar = avvo.a;
                        }
                        if ((avvnVar.b & 1) != 0) {
                            bundle.putString(avvoVar.b, avvoVar.c);
                        }
                    }
                    String str = aqccVar2.d;
                    if (str != null && !str.isEmpty()) {
                        str = str.concat("\n \n");
                    }
                    xnxVar.a.b(zew.o(xnxVar.b), bundle, aqccVar2.c, str);
                }
            });
            return;
        }
        this.c.b(new akuh(apzgVar, null) { // from class: esh
            public final /* synthetic */ apzg a;

            @Override // defpackage.akuh
            public final void a(Bundle bundle) {
                xnx xnxVar = xnx.this;
                avvm avvmVar = (avvm) this.a.qm(UserFeedbackEndpointOuterClass.userFeedbackEndpoint);
                for (avvn avvnVar : avvmVar.b) {
                    avvo avvoVar = avvnVar.c;
                    if (avvoVar == null) {
                        avvoVar = avvo.a;
                    }
                    if ((avvnVar.b & 1) != 0) {
                        bundle.putString(avvoVar.b, avvoVar.c);
                    }
                }
                xnxVar.a.a(zew.o(xnxVar.b), bundle, avvmVar.c);
            }
        });
    }
}
