package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agcy  reason: default package */
/* loaded from: classes.dex */
public final class agcy implements aafl {
    private final Context a;
    private final acti b;

    public agcy(Context context, acti actiVar) {
        this.a = context;
        this.b = actiVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.removeNotificationTrayItemAction)) {
            return;
        }
        RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction = (RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction) apzgVar.qm(RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.removeNotificationTrayItemAction);
        ahfe.i(this.a, this.b, aged.a(removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.b, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.c));
    }
}
