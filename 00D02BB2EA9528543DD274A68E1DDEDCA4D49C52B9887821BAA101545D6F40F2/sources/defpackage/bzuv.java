package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bzuv  reason: default package */
/* loaded from: classes4.dex */
public final class bzuv {
    public final Application b;
    private final dxio<akfa> d;
    private final auhi e;
    private final bzro f;
    private final auhj g;
    private static final dcqe c = dcqe.c("bzuv");
    public static final int a = Color.rgb(235, (int) R.styleable.AppCompatTheme_textColorAlertDialogListItem, 0);

    public bzuv(Application application, dxio<akfa> dxioVar, auhi auhiVar, bzro bzroVar, auhj auhjVar) {
        this.b = application;
        this.d = dxioVar;
        this.e = auhiVar;
        this.f = bzroVar;
        this.g = auhjVar;
    }

    public final Intent a() {
        String j;
        btlu j2 = this.d.a().j();
        return new Intent("android.intent.action.VIEW", Uri.parse((j2 == null || (j = j2.j()) == null) ? "https://www.google.com/maps/contrib" : String.format("https://www.google.com/maps/contrib/%s/reviews/", j))).setPackage(this.b.getPackageName());
    }

    @dzsi
    public final augj b(long j, @dzsi bzrn bzrnVar, int i, Intent intent) {
        aujb h = this.e.h(dpyv.POST_INLINE_REVIEW_THANKS.dm);
        if (h == null) {
            bvoo.h("Thanks notification type retrieved from the GmmNotificationManager is null!", new Object[0]);
            return null;
        }
        augc b = this.g.b(h.a, h);
        Resources resources = this.b.getResources();
        String string = resources.getString(com.google.android.apps.maps.R.string.POST_INLINE_REVIEW_THANKS_NOTIFICATION_TITLE);
        String string2 = resources.getString(i);
        String string3 = resources.getString(com.google.android.apps.maps.R.string.POST_INLINE_REVIEW_THANKS_NOTIFICATION_SEE_REVIEWS_ACTION);
        b.f = string;
        b.g = string2;
        b.C(true);
        b.D(resources.getColor(com.google.android.apps.maps.R.color.quantum_googblue));
        b.A(j);
        b.E(intent, auhw.ACTIVITY);
        b.B(auoe.k(ddcu.ae).i(1, 2131232596, string3, intent, auhw.ACTIVITY, true));
        this.f.a(b, 2131231750, bzrnVar, string, string2);
        return b.a();
    }
}
