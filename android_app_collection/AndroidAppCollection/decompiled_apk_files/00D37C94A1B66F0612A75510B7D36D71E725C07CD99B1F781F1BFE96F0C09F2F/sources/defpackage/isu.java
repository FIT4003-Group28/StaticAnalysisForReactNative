package defpackage;

import com.google.protos.youtube.api.innertube.ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: isu  reason: default package */
/* loaded from: classes3.dex */
public final class isu implements aafl {
    private final agbz a;

    public isu(agbz agbzVar) {
        this.a = agbzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        long j = ((ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction) apzgVar.qm(ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.clearNotificationsUnreadCountAction)).b;
        agbz agbzVar = this.a;
        agbw a = agbx.a();
        a.c(false);
        a.d(0);
        a.b((int) j);
        a.a = "FEnotifications_inbox";
        agbzVar.e(a.a());
    }
}
