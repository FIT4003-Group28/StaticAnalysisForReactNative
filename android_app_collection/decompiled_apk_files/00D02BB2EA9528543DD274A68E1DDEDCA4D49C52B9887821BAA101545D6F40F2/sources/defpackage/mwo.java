package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mwo  reason: default package */
/* loaded from: classes.dex */
public final class mwo implements jzv {
    public volatile boolean a;
    private final Context b;
    private final dxio<kfc> c;

    public mwo(Application application, dxio<kfc> dxioVar) {
        this.b = application;
        dbsk.s(dxioVar);
        this.c = dxioVar;
    }

    @Override // defpackage.jzv
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.jzv
    public final void b(boolean z) {
        this.a = z;
    }

    @Override // defpackage.jzv
    public final void c(int i, ib ibVar, @dzsi cmz cmzVar) {
        if (cmzVar == null) {
            cmzVar = new cmz();
        }
        Intent intent = cmzVar.h;
        Intent intent2 = intent == null ? new Intent() : new Intent(intent);
        intent2.setClassName(this.b, "com.google.android.apps.gmm.car.GmmCarProjectionService");
        if (dpyv.SEND_TO_PHONE_START.dm > i || dpyv.SEND_TO_PHONE_END.dm < i) {
            int i2 = dmcf.SHOW_MAP.ab;
            StringBuilder sb = new StringBuilder(36);
            sb.append("google.maps:?notts=1&act=");
            sb.append(i2);
            intent2.setData(Uri.parse(sb.toString()));
            if (i == dpyv.NAVIGATION_STATUS.dm || i == dpyv.NAV_RESTORE.dm) {
                cmzVar.k = true;
                cmzVar.m = true;
                cmzVar.i = -15171528;
                cmzVar.j = -16229845;
            } else if (i == dpyv.NAVIGATION_PROMPTS.dm) {
                cmzVar.l = true;
                cmzVar.k = false;
                cmzVar.m = false;
                cmzVar.i = this.b.getResources().getColor(R.color.gmm_white);
            } else if (i == dpyv.RESUME_NAVIGATION.dm) {
                cmzVar.l = false;
                cmzVar.k = true;
                cmzVar.m = true;
                cmzVar.i = this.b.getResources().getColor(R.color.gmm_white);
                cmzVar.j = -15130841;
                cmzVar.f = R.drawable.car_only_ic_overview_arrow_day;
                cmzVar.g = R.drawable.car_only_ic_overview_arrow_night;
            }
        } else {
            cmzVar.l = false;
            cmzVar.k = true;
            cmzVar.m = true;
            cmzVar.i = -1;
            cmzVar.j = -15261658;
            Resources resources = this.b.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.car_only_ic_send_phone);
            drawable.setColorFilter(resources.getColor(R.color.qu_grey_50), PorterDuff.Mode.SRC_ATOP);
            int min = Math.min(drawable.getMinimumWidth(), 160);
            int min2 = Math.min(drawable.getMinimumHeight(), 160);
            Bitmap createBitmap = Bitmap.createBitmap(resources.getDisplayMetrics(), 160, 160, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(resources.getColor(R.color.qu_google_blue_700));
            Rect rect = new Rect((160 - min) / 2, (160 - min2) / 2, (min + 160) / 2, (min2 + 160) / 2);
            canvas.clipRect(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
            cmzVar.e = createBitmap;
            cmzVar.f = R.drawable.car_only_ic_overview_arrow_day;
            cmzVar.g = R.drawable.car_only_ic_overview_arrow_night;
        }
        cmzVar.h = intent2;
        ibVar.g(cmzVar);
    }

    @Override // defpackage.jzv
    public final void d(int i, ib ibVar, Intent intent, String str, String str2) {
        ibVar.g(g(i, intent, str, str2));
    }

    @Override // defpackage.jzv
    public final void e(Intent intent) {
        bvrj.UI_THREAD.c();
        intent.setClassName(this.b, "com.google.android.apps.gmm.car.GmmCarProjectionService");
        this.c.a().a(intent);
    }

    @Override // defpackage.jzv
    public final void f() {
        Toast.makeText(this.b, (int) R.string.QUIT_BECAUSE_ANDROID_AUTO_RUNNING, 1).show();
    }

    public final coe g(int i, Intent intent, String str, String str2) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(this.b, "com.google.android.apps.gmm.car.GmmCarProjectionService");
        coe coeVar = new coe();
        coeVar.a = str;
        coeVar.b = str2;
        coeVar.d = R.drawable.car_only_ic_overview_arrow_day;
        if (dpyv.SEND_TO_PHONE_START.dm > i || dpyv.SEND_TO_PHONE_END.dm < i) {
            int i2 = dmcf.SHOW_MAP.ab;
            StringBuilder sb = new StringBuilder(36);
            sb.append("google.maps:?notts=1&act=");
            sb.append(i2);
            intent2.setData(Uri.parse(sb.toString()));
            if (i == dpyv.NAVIGATION_STATUS.dm || i == dpyv.NAV_RESTORE.dm) {
                cod.a(-15171528, coeVar);
                cod.b(-16229845, coeVar);
            } else if (i == dpyv.NAVIGATION_PROMPTS.dm) {
                cod.c(true, coeVar);
                cod.a(-1, coeVar);
                cod.b(-15261658, coeVar);
            } else if (i == dpyv.RESUME_NAVIGATION.dm) {
                cod.c(false, coeVar);
                cod.a(-1, coeVar);
                cod.b(-15261658, coeVar);
            } else if (i == dpyv.CAR_ROUTE_OPTIONS.dm) {
                cod.c(true, coeVar);
                coeVar.h = false;
                coeVar.c = BitmapFactory.decodeResource(this.b.getResources(), R.drawable.car_only_ic_cog);
            }
        } else {
            cod.c(false, coeVar);
            cod.a(-1, coeVar);
            cod.b(-15261658, coeVar);
        }
        coeVar.e = intent2;
        if (!TextUtils.isEmpty(coeVar.a)) {
            if (coeVar.d != 0) {
                if (coeVar.i && coeVar.c == null) {
                    throw new IllegalArgumentException("A thumbnail icon is required for heads up notification.");
                }
                return coeVar;
            }
            throw new IllegalArgumentException("An action icon is required.");
        }
        throw new IllegalArgumentException("A title is required.");
    }
}
