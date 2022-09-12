package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: bzai  reason: default package */
/* loaded from: classes4.dex */
public final class bzai {
    public static final String a = "bzai";
    public static final int b = dpyv.TRANSIT_GUIDANCE.dm;
    public final Service c;
    public final auhj d;
    private final int e;
    private final bzgl f;

    public bzai(Service service, auhj auhjVar, bzgl bzglVar) {
        Context context;
        int dimensionPixelSize;
        int identifier;
        this.c = service;
        this.d = auhjVar;
        try {
            context = service.createPackageContext("com.android.systemui", 0);
        } catch (Exception unused) {
            context = null;
        }
        if (context != null && (identifier = context.getResources().getIdentifier("notification_min_height", "dimen", "com.android.systemui")) != 0) {
            try {
                dimensionPixelSize = Math.round(context.getResources().getDimension(identifier));
            } catch (Exception unused2) {
            }
            this.e = dimensionPixelSize;
            this.f = bzglVar;
        }
        dimensionPixelSize = service.getResources().getDimensionPixelSize(R.dimen.notification_min_height_default);
        this.e = dimensionPixelSize;
        this.f = bzglVar;
    }

    private static void c(Collection<auoc> collection, Intent intent, int i, ddho ddhoVar) {
        collection.add(auoc.j(intent, auhw.SERVICE, i, ddhoVar, false, false, ddcu.JP));
    }

    private static void d(RemoteViews remoteViews, int i, int i2) {
        remoteViews.setInt(i, "setImageAlpha", i2 - 1);
        remoteViews.setBoolean(i, "setEnabled", i2 == 256);
    }

    public final auoc[] a(byzy byzyVar, RemoteViews remoteViews, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        dbty<Intent> i = byzyVar.i();
        dbty<Intent> j = byzyVar.j();
        d(remoteViews, R.id.forward_button, bzah.a(i, j));
        if (i != null) {
            c(arrayList, i.a(), R.id.forward_button, dtxw.dL);
        }
        d(remoteViews, R.id.back_button, bzah.a(j, i));
        if (j != null) {
            c(arrayList, j.a(), R.id.back_button, dtxw.dM);
        }
        if (z && byzyVar.m()) {
            arrayList.add(auoc.j(bzaj.a(this.c), auhw.SERVICE, R.id.action_stop, dtxw.dN, true, false, ddcu.JP));
            if (this.f.c()) {
                Service service = this.c;
                arrayList.add(auoc.j(new Intent(bzcg.b, Uri.EMPTY, service, service.getClass()), auhw.SERVICE, R.id.action_share_trip, dtxw.dO, true, false, ddcu.JP));
            }
        }
        return (auoc[]) arrayList.toArray(new auoc[arrayList.size()]);
    }

    public final RemoteViews b(byzy byzyVar, boolean z) {
        Bitmap c;
        int i;
        RemoteViews remoteViews = new RemoteViews(this.c.getPackageName(), (int) R.layout.transit_guidance_notification);
        remoteViews.setImageViewResource(R.id.smallIcon, byzyVar.e());
        remoteViews.removeAllViews(R.id.title_container);
        remoteViews.addView(R.id.title_container, byzyVar.b().b(vyi.TITLE));
        remoteViews.removeAllViews(R.id.description_container);
        remoteViews.addView(R.id.description_container, byzyVar.c().b(vyi.DESCRIPTION));
        remoteViews.setTextViewText(R.id.no_gps, this.c.getResources().getString(R.string.TRANSIT_GUIDANCE_NOTIFICATION_NO_GPS));
        remoteViews.setViewVisibility(R.id.no_gps, true != byzyVar.n() ? 8 : 0);
        if (Build.VERSION.SDK_INT >= 24) {
            String string = this.c.getResources().getString(R.string.MAPS_APP_NAME);
            bvsx bvsxVar = new bvsx(this.c.getResources());
            bvsv a2 = bvsxVar.a(string);
            a2.l(ibl.G().b(this.c));
            bvsv a3 = bvsxVar.a("  •  ");
            a3.g(byzyVar.a());
            a3.m(R.color.title_text_color);
            a2.f(a3);
            remoteViews.setTextViewText(R.id.header_text, a2.c());
        }
        Drawable a4 = byzyVar.d().a();
        if (a4 instanceof BitmapDrawable) {
            c = ((BitmapDrawable) a4).getBitmap();
        } else {
            int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.notification_icon_max_width);
            int dimensionPixelSize2 = this.c.getResources().getDimensionPixelSize(R.dimen.notification_progress_margin);
            c = bvlf.c(a4, dimensionPixelSize, this.e - (dimensionPixelSize2 + dimensionPixelSize2), Bitmap.Config.ARGB_8888);
        }
        if (c != null) {
            remoteViews.setImageViewBitmap(R.id.icon, c);
        }
        if (z) {
            remoteViews.setViewVisibility(R.id.action_stop, 0);
            remoteViews.setTextViewText(R.id.action_stop_text, this.c.getResources().getString(R.string.TRANSIT_GUIDANCE_NOTIFICATION_ACTION_STOP));
            if (this.f.c()) {
                remoteViews.setViewVisibility(R.id.action_share_trip, 0);
                Resources resources = this.c.getResources();
                if (byzyVar.q() == 4) {
                    i = R.string.TRANSIT_TO_GO_STOP_SHARE_BUTTON;
                } else {
                    i = byzyVar.q() == 3 ? R.string.TRANSIT_TO_GO_SHARE_STARTING_BUTTON : R.string.TRANSIT_TO_GO_SHARE_ETA_BUTTON;
                }
                remoteViews.setTextViewText(R.id.action_share_trip_text, resources.getString(i));
            } else {
                remoteViews.setViewVisibility(R.id.action_share_trip, 8);
            }
        } else {
            remoteViews.setViewVisibility(R.id.actions, 8);
        }
        return remoteViews;
    }
}
