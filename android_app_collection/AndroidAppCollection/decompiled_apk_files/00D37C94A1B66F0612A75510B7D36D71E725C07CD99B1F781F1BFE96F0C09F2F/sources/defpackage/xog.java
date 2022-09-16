package defpackage;

import com.google.protos.youtube.api.innertube.OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xog  reason: default package */
/* loaded from: classes4.dex */
public final class xog implements aafl {
    private final xoe a;

    public xog(xoe xoeVar) {
        this.a = xoeVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction = (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction) apzgVar.qm(OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.openCreateReplyDialogAction);
        xoe xoeVar = this.a;
        xlv xlvVar = (xlv) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xlv.class);
        aqiu aqiuVar = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.b;
        if (aqiuVar == null) {
            aqiuVar = aqiu.a;
        }
        aqiu aqiuVar2 = aqiuVar;
        apzm apzmVar = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.c;
        if (apzmVar == null) {
            apzmVar = apzm.a;
        }
        apzm apzmVar2 = apzmVar;
        apzm apzmVar3 = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.d;
        if (apzmVar3 == null) {
            apzmVar3 = apzm.a;
        }
        xoeVar.a(xlvVar, aqiuVar2, apzmVar2, apzmVar3, false);
    }
}
