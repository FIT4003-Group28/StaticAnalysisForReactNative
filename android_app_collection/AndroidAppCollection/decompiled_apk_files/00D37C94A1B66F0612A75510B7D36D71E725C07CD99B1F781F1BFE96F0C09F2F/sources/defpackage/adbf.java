package defpackage;

import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
/* compiled from: PG */
/* renamed from: adbf  reason: default package */
/* loaded from: classes.dex */
public final class adbf implements adon {
    private static final String a = zep.a("MDX.DialShortLivedLoungeTokenRefresher");
    private final adid b;
    private final adas c;

    public adbf(adid adidVar, adas adasVar) {
        this.b = adidVar;
        this.c = adasVar;
    }

    @Override // defpackage.adon
    public final void a(adok adokVar) {
        AutoValue_AppStatus autoValue_AppStatus;
        int i;
        String str = a;
        zep.h(str, String.format("Attempting to get a new lounge token for DIAL screen %s", this.b.d));
        AppStatus a2 = this.c.a(this.b.b);
        if (a2 == null || (i = (autoValue_AppStatus = (AutoValue_AppStatus) a2).a) == -1 || i == -2) {
            zep.h(str, String.format("The app status could not be retrieved for screen %s.", this.b.d));
            adokVar.a(adom.DIAL_HTTP_ERROR);
        } else if (i == 1) {
            ampq ampqVar = autoValue_AppStatus.e;
            if (!ampqVar.h()) {
                zep.h(str, String.format("No proper Short Lived Lounge Token found in the DIAL additional data for screen %s.", this.b.d));
                adokVar.a(adom.MISSING_LOUNGE_TOKEN);
                return;
            }
            zep.h(str, String.format("SUCCESS! Got new lounge token for DIAL screen %s: %s, refresh interval: %s", this.b.d, ampqVar.c(), ((adis) ampqVar.c()).b));
            adokVar.b((adis) ampqVar.c());
        } else {
            zep.h(str, String.format("The app is not running for screen %s.", this.b.d));
            adokVar.a(adom.APP_NOT_RUNNING);
        }
    }
}
