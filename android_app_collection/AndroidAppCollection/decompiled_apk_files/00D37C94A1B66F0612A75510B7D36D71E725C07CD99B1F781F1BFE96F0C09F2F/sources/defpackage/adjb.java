package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: adjb  reason: default package */
/* loaded from: classes.dex */
public final class adjb {
    public static final String a = zep.a("MDX.LivingRoomNotificationLogger");
    private final acrr b;

    static {
        actj actjVar = actj.SEARCH_TOPIC_RESULT;
    }

    public adjb(acrr acrrVar) {
        this.b = acrrVar;
    }

    public final void a(atcs atcsVar) {
        atbq a2 = atbr.a();
        atct atctVar = atct.MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_MULTI_SCREEN;
        a2.copyOnWrite();
        atbr.c((atbr) a2.instance, atctVar);
        a2.copyOnWrite();
        atbr.d((atbr) a2.instance, atcsVar);
        arrf a3 = arrh.a();
        a3.copyOnWrite();
        ((arrh) a3.instance).cW((atbr) a2.mo39build());
        this.b.c((arrh) a3.mo39build());
    }

    public final void b(atdp atdpVar, String str, atcs atcsVar) {
        if (atdpVar != null) {
            str = String.format(Locale.US, "%s: videoId=%s", str, atdpVar.d);
        }
        zep.h(a, str);
        a(atcsVar);
    }

    public final void c() {
        zep.h(a, "LR Notification revoked because the user signed out.");
        a(atcs.MDX_NOTIFICATION_GEL_ACTION_REVOKED_SIGNED_OUT);
    }
}
