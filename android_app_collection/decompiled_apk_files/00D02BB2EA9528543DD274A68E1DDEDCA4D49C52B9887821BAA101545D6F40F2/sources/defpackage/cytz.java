package defpackage;

import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cytz  reason: default package */
/* loaded from: classes5.dex */
public final class cytz extends dclu<InAppNotificationTarget> {
    final /* synthetic */ Map a;

    public cytz(Map map) {
        this.a = map;
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InAppNotificationTarget inAppNotificationTarget = (InAppNotificationTarget) obj;
        InAppNotificationTarget inAppNotificationTarget2 = (InAppNotificationTarget) obj2;
        dbzx dbzxVar = dbzx.b;
        boolean z = false;
        boolean z2 = inAppNotificationTarget.SA() == cyep.IN_APP_GAIA || inAppNotificationTarget.g() == 3;
        if (inAppNotificationTarget2.SA() == cyep.IN_APP_GAIA || inAppNotificationTarget2.g() == 3) {
            z = true;
        }
        return dbzxVar.g(z2, z).f(inAppNotificationTarget2.b().i, inAppNotificationTarget.b().i).f(cyua.f(inAppNotificationTarget2, this.a), cyua.f(inAppNotificationTarget, this.a)).i();
    }
}
