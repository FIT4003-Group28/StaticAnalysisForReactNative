package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.format.DateUtils;
import android.util.SparseIntArray;
import android.widget.RemoteViews;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;
/* compiled from: PG */
/* renamed from: agek  reason: default package */
/* loaded from: classes.dex */
final class agek {
    public static final /* synthetic */ int b = 0;
    private static final SparseIntArray c = new agei();
    static final SparseIntArray a = new agej();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(fi fiVar, AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer, apgm apgmVar, final Context context, snc sncVar, Bitmap bitmap, int i, int i2, final int i3) {
        Bitmap bitmap2;
        arag aragVar;
        ayqe ayqeVar = new ayqe() { // from class: ageh
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                Context context2 = context;
                Integer num = (Integer) obj;
                return new RemoteViews(context2.getPackageName(), i3);
            }
        };
        if (i2 == 0 || i3 == 0) {
            return;
        }
        try {
            Object a2 = ayqeVar.a(Integer.valueOf(i3));
            if (bitmap != null) {
                ((RemoteViews) a2).setImageViewBitmap(R.id.custom_notification_thumbnail, bitmap);
            }
            int i4 = zew.i(context.getResources().getDisplayMetrics(), 16);
            Drawable userBadgedDrawableForDensity = context.getPackageManager().getUserBadgedDrawableForDensity(new BitmapDrawable(context.getResources(), Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888)), Process.myUserHandle(), new Rect(0, 0, i4, i4), -1);
            if (userBadgedDrawableForDensity instanceof BitmapDrawable) {
                bitmap2 = ((BitmapDrawable) userBadgedDrawableForDensity).getBitmap();
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(userBadgedDrawableForDensity.getIntrinsicWidth(), userBadgedDrawableForDensity.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                userBadgedDrawableForDensity.setBounds(0, 0, userBadgedDrawableForDensity.getIntrinsicWidth(), userBadgedDrawableForDensity.getIntrinsicHeight());
                userBadgedDrawableForDensity.draw(new Canvas(createBitmap));
                bitmap2 = createBitmap;
            }
            RemoteViews remoteViews = (RemoteViews) a2;
            remoteViews.setImageViewBitmap(R.id.custom_notification_work_profile_badge, bitmap2);
            arag aragVar2 = null;
            if ((apgmVar.b & 8) != 0) {
                aragVar = apgmVar.f;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            remoteViews.setTextViewText(R.id.custom_notification_title, ajgl.b(aragVar));
            if ((apgmVar.b & 16) != 0 && (aragVar2 = apgmVar.g) == null) {
                aragVar2 = arag.a;
            }
            remoteViews.setTextViewText(R.id.custom_notification_body, ajgl.b(aragVar2));
            remoteViews.setImageViewResource(R.id.small_icon, i);
            atos b2 = atos.b(androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.f);
            if (b2 == null) {
                b2 = atos.BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN;
            }
            if (b2 != atos.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START || androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.g) {
                long c2 = sncVar.c();
                remoteViews.setTextViewText(R.id.custom_notification_title_timestamp, DateUtils.formatSameDayTime(c2, c2, 3, 3));
            }
            Resources resources = context.getResources();
            int ordinal = b2.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 10 || ordinal == 11) {
                int ordinal2 = b2.ordinal();
                if (ordinal2 == 1 || ordinal2 == 2 || ordinal2 == 10 || ordinal2 == 11) {
                    remoteViews.setInt(R.id.small_icon, "setColorFilter", resources.getColor(R.color.small_icon_background));
                }
                remoteViews.setTextViewText(R.id.custom_notification_title_text, resources.getString(i2));
            }
            int aA = akel.aA(androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.h);
            if (aA != 0 && aA == 2) {
                remoteViews.setTextColor(R.id.custom_notification_title, resources.getColor(R.color.yt_white1));
                remoteViews.setTextColor(R.id.custom_notification_title_timestamp, resources.getColor(R.color.white_text_body));
                remoteViews.setTextColor(R.id.custom_notification_body, resources.getColor(R.color.white_text_body));
            }
            int intValue = androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.c == 3 ? ((Integer) androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.d).intValue() : 0;
            if (intValue != 0) {
                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_duration, 0);
                remoteViews.setTextViewText(R.id.custom_notification_thumbnail_duration, DateUtils.formatElapsedTime(intValue));
            } else {
                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_duration, 8);
            }
            boolean booleanValue = androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.c == 6 ? ((Boolean) androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.d).booleanValue() : false;
            if (!booleanValue && (androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.c != 7 || !((Boolean) androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.d).booleanValue())) {
                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_red_badge, 8);
            } else {
                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_red_badge, 0);
                if (booleanValue) {
                    remoteViews.setTextViewText(R.id.custom_notification_thumbnail_red_badge, resources.getString(R.string.custom_notification_live));
                } else {
                    remoteViews.setTextViewText(R.id.custom_notification_thumbnail_red_badge, resources.getString(R.string.custom_notification_premiere));
                }
            }
            fiVar.h(remoteViews);
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Exception while creating RemoteViews: ");
            sb.append(valueOf);
            zep.b(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(fi fiVar, AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer, apgm apgmVar, aoxp aoxpVar, final Context context, ajxz ajxzVar, aged agedVar, Intent intent, Intent intent2) {
        ageg agegVar = new ageg(context);
        aypx aypxVar = new aypx() { // from class: agef
            @Override // defpackage.aypx
            public final Object a(Object obj, Object obj2) {
                Context context2 = context;
                Intent intent3 = (Intent) obj2;
                int i = agek.b;
                if (((Boolean) obj).booleanValue()) {
                    return agel.j(context2, intent3);
                }
                return agel.k(context2, intent3);
            }
        };
        try {
            Object a2 = agegVar.a(Integer.valueOf((int) R.layout.notification_survey_five_options));
            arag aragVar = apgmVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            RemoteViews remoteViews = (RemoteViews) a2;
            remoteViews.setTextViewText(R.id.custom_notification_title, ajgl.b(aragVar));
            arag aragVar2 = apgmVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            remoteViews.setTextViewText(R.id.custom_notification_text, ajgl.b(aragVar2));
            for (int i = 0; i < androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.b.size(); i++) {
                aunb aunbVar = (aunb) androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.b.get(i);
                int i2 = c.get(i, 0);
                int i3 = a.get(i, 0);
                if (i2 != 0) {
                    AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer = (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer) aunbVar.qm(AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.iconSurveyOptionRenderer);
                    arhs arhsVar = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.c;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b2 = arhr.b(arhsVar.c);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    remoteViews.setImageViewResource(i2, ajxzVar.a(b2));
                    int i4 = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b;
                    if ((i4 & 4) != 0 || (i4 & 2) != 0) {
                        Intent intent3 = new Intent((i4 & 2) == 0 ? intent2 : intent);
                        agee.e(intent3, agedVar);
                        if ((androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b & 2) != 0) {
                            apzg apzgVar = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.d;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            agec.a(intent3, apzgVar, null, false);
                        }
                        if ((androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b & 4) != 0) {
                            apzg apzgVar2 = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.e;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            agee.f(intent3, apzgVar2);
                        }
                        agec.d(intent3, aoxpVar);
                        try {
                            remoteViews.setOnClickPendingIntent(i3, (PendingIntent) aypxVar.a(Boolean.valueOf((androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b & 2) != 0), intent3));
                            remoteViews.setViewVisibility(i3, 0);
                        } catch (Exception e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                            sb.append("Exception while getting PendingIntent for survey option: ");
                            sb.append(valueOf);
                            zep.b(sb.toString());
                        }
                    }
                }
            }
            fiVar.h(remoteViews);
            fiVar.D = remoteViews;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
            sb2.append("Exception while providing RemoveViews: ");
            sb2.append(valueOf2);
            zep.b(sb2.toString());
        }
    }
}
