package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer;
/* compiled from: PG */
/* renamed from: agea  reason: default package */
/* loaded from: classes.dex */
public final class agea implements ageb {
    public static final amup a;
    public final Context b;
    public final int c;
    public final int d;
    public final Intent e;
    public final Intent f;
    public final snc g;
    public final ampq h;
    private final int i;
    private final agci j;
    private final ajmy k;

    static {
        amum amumVar = new amum();
        amumVar.f(atos.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END, Integer.valueOf((int) R.layout.custom_notification_large_thumbnail_end));
        amumVar.f(atos.BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END, Integer.valueOf((int) R.layout.custom_notification_medium_thumbnail_end));
        amumVar.f(atos.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START, Integer.valueOf((int) R.layout.custom_notification_basic_thumbnail_start));
        amumVar.f(atos.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_GRAY, Integer.valueOf((int) R.layout.custom_notification_large_thumbnail_end_gray));
        amumVar.f(atos.BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END_GRAY, Integer.valueOf((int) R.layout.custom_notification_medium_thumbnail_end_gray));
        amumVar.f(atos.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TITLE, Integer.valueOf((int) R.layout.custom_notification_large_thumbnail_end_multiline_title));
        amumVar.f(atos.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TEXT, Integer.valueOf((int) R.layout.custom_notification_large_thumbnail_end_multiline_text));
        amumVar.f(atos.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TITLE, Integer.valueOf((int) R.layout.custom_notification_basic_thumbnail_start_multiline_title));
        amumVar.f(atos.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TEXT, Integer.valueOf((int) R.layout.custom_notification_basic_thumbnail_start_multiline_text));
        a = amumVar.b();
    }

    public agea(Context context, int i, int i2, int i3, Intent intent, Intent intent2, snc sncVar, agci agciVar, ajmy ajmyVar, ampq ampqVar) {
        this.b = context;
        this.c = i;
        this.i = i2;
        this.d = i3;
        this.e = intent;
        this.f = intent2;
        this.g = sncVar;
        this.j = agciVar;
        this.k = ajmyVar;
        this.h = ampqVar;
    }

    public static AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer b(apgq apgqVar) {
        if ((apgqVar.b & 4096) != 0) {
            aunb aunbVar = apgqVar.s;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.basicThumbnailCustomStyleRenderer)) {
                return null;
            }
            aunb aunbVar2 = apgqVar.s;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer) aunbVar2.qm(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.basicThumbnailCustomStyleRenderer);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // defpackage.ageb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final defpackage.apgq r22, defpackage.acti r23, final defpackage.aged r24, final defpackage.fi r25) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agea.a(apgq, acti, aged, fi):void");
    }
}
