package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.support.v4.graphics.drawable.IconCompat;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: yzi  reason: default package */
/* loaded from: classes7.dex */
public class yzi {
    private final Activity a;
    private final vma b;
    private final dxio<afha> c;

    public yzi(Activity activity, vma vmaVar, dxio<afha> dxioVar) {
        this.a = activity;
        this.b = vmaVar;
        this.c = dxioVar;
    }

    @dzsi
    public static Bitmap d(dqvj dqvjVar, Context context) {
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal = dqvjVar.ordinal();
        return l(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? ordinal != 7 ? -1 : R.raw.ic_mod_taxi : R.raw.ic_qu_two_wheeler : R.raw.ic_qu_transit : R.raw.ic_qu_walking : R.raw.ic_qu_biking : R.raw.ic_qu_drive, context, R.color.qu_google_blue_700, R.color.qu_grey_white_1000, 36.0d);
    }

    public static Bitmap e(Drawable drawable, cqrp cqrpVar, int i, cqrp cqrpVar2, Context context) {
        GradientDrawable gradientDrawable = (GradientDrawable) context.getResources().getDrawable(R.drawable.directions_widget_icon_background);
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        int e = cqrpVar2.e(context);
        Bitmap c = bvlf.c(gradientDrawable, e, e, Bitmap.Config.ARGB_8888);
        int e2 = cqrpVar.e(context);
        Bitmap c2 = bvlf.c(drawable, e2, e2, Bitmap.Config.ARGB_8888);
        Bitmap createBitmap = Bitmap.createBitmap(e, e, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(c, new Matrix(), null);
        float f = (e - e2) / 2;
        canvas.drawBitmap(c2, f, f, (Paint) null);
        return createBitmap;
    }

    public static Intent f(Context context, String str, String str2, Bitmap bitmap, Intent intent) {
        return jk.b(context, h(context, str, str2, bitmap, intent));
    }

    public static Intent g(Context context, String str, String str2, int i, Intent intent) {
        return jk.b(context, i(context, str, str2, i, intent));
    }

    public static jg h(Context context, String str, String str2, Bitmap bitmap, Intent intent) {
        jf jfVar = new jf(context, str);
        jfVar.d(str2);
        jfVar.c(str2);
        jfVar.b(IconCompat.c(bitmap));
        jfVar.e(intent);
        return jfVar.a();
    }

    public static jg i(Context context, String str, String str2, int i, Intent intent) {
        jf jfVar = new jf(context, str);
        jfVar.d(str2);
        jfVar.c(str2);
        jfVar.b(IconCompat.a(context, i));
        jfVar.e(intent);
        return jfVar.a();
    }

    @dzsi
    public static amvh j(@dzsi amvh amvhVar) {
        if (amvhVar == null || amvhVar.k()) {
            return null;
        }
        return amvhVar;
    }

    @dzsi
    private static Bitmap l(int i, Context context, int i2, int i3, double d) {
        if (i == -1) {
            return null;
        }
        Resources resources = context.getResources();
        Drawable b = bvlo.a().b(resources, i, bvlw.a);
        b.setColorFilter(resources.getColor(i3), PorterDuff.Mode.SRC_IN);
        return e(b, cqrp.d(d), resources.getColor(i2), cqrp.d(48.0d), context);
    }

    private final void m(int i, String str, @dzsi Intent intent, String str2, String str3, @dzsi Bitmap bitmap) {
        jg h;
        Context applicationContext = this.a.getApplicationContext();
        if (bitmap == null || intent == null) {
            k(i);
            return;
        }
        yzf yzfVar = new yzf(i);
        applicationContext.registerReceiver(yzfVar, new IntentFilter(str3));
        IntentSender intentSender = PendingIntent.getBroadcast(this.a, 1, new Intent(str3), 268435456).getIntentSender();
        if (i == 3) {
            jf jfVar = new jf(applicationContext, str);
            jfVar.d(str2);
            jfVar.c(str2);
            jfVar.b(IconCompat.d(bitmap));
            jfVar.e(intent);
            h = jfVar.a();
        } else {
            h = h(applicationContext, str, str2, bitmap, intent);
        }
        if (!c()) {
            k(i);
            applicationContext.unregisterReceiver(yzfVar);
            return;
        }
        deha.q(this.c.a().t(applicationContext, h, intentSender), new yzg(this, i, applicationContext, yzfVar), dege.a);
    }

    public final void a(dqvj dqvjVar, amvh amvhVar, List<amvh> list, dwao dwaoVar, @dzsi String str, boolean z) {
        int size = list.size();
        if (size <= 0) {
            throw new IllegalArgumentException("Route should have at least 1 destination");
        }
        amvh amvhVar2 = list.get(size - 1);
        if (str == null) {
            str = amvhVar2.p();
        }
        String str2 = str;
        boolean z2 = dqvjVar == dqvj.DRIVE && amvhVar.k();
        yzh yzhVar = new yzh(this.a, list);
        yzhVar.b = dqvjVar;
        yzhVar.d = z2 ? afhv.NAVIGATION : afhv.DEFAULT;
        yzhVar.a = j(amvhVar);
        EnumSet noneOf = EnumSet.noneOf(afhq.class);
        if (dwaoVar.o) {
            noneOf.add(afhq.AVOID_FERRIES);
        }
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        if (dowrVar.b) {
            noneOf.add(afhq.AVOID_HIGHWAYS);
        }
        dowr dowrVar2 = dwaoVar.g;
        if (dowrVar2 == null) {
            dowrVar2 = dowr.m;
        }
        if (dowrVar2.c) {
            noneOf.add(afhq.AVOID_TOLLS);
        }
        yzhVar.c = noneOf;
        Intent a = yzhVar.a();
        m(true != z ? 2 : 1, String.format("directionsShortcut_%s", UUID.randomUUID().toString()), a, str2, "DirectionsShortcutCreated", d(dqvjVar, this.a));
        vma vmaVar = this.b;
        String a2 = vmaVar.d.a(amvhVar2);
        if (a2 == null) {
            return;
        }
        vvl d = vmaVar.d();
        vvi vviVar = (vvi) Collections.unmodifiableMap(d.a).get(a2);
        if (vviVar != null) {
            vmaVar.b(d, vviVar, a2);
            return;
        }
        vvh bZ = vvi.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        vvi.c((vvi) bZ.b);
        vmaVar.c(d, a2, bZ.bK());
    }

    public final void b() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/@/data=!4m2!17m1!2e3/"));
        intent.setPackage(this.a.getPackageName());
        m(3, "commuteHubShortcut", intent, this.a.getString(R.string.COMMUTE_HUB_SHORTCUT_LABEL), "CommuteHubShortcutCreated", l(R.raw.ic_mod_tab_commute, this.a, R.color.qu_grey_white_1000, R.color.qu_google_blue_700, 20.0d));
    }

    public final boolean c() {
        return jk.a(this.a);
    }

    public final void k(int i) {
        dqvj dqvjVar = dqvj.DRIVE;
        int i2 = i - 1;
        Toast.makeText(this.a, (i2 == 0 || i2 == 1) ? R.string.CANT_CREATE_DIRECTIONS_SHORTCUT_TOAST : R.string.CANT_CREATE_COMMUTE_HUB_SHORTCUT_TOAST, 0).show();
    }
}
