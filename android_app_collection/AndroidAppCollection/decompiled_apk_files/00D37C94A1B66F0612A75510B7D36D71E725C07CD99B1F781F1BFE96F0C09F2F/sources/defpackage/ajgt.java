package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.youtube.rendering.customtabs.CustomTabsReceiver;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajgt  reason: default package */
/* loaded from: classes.dex */
public final class ajgt implements ajgr {
    private static final int[] b = {R.attr.homeAsUpIndicator};
    public final String a;
    private final Context c;
    private final ajgq d;
    private final Executor e;
    private final apyy f;

    public ajgt(apyy apyyVar, Context context, ajgq ajgqVar, Executor executor) {
        apes apesVar;
        this.f = apyyVar;
        this.c = context;
        String str = null;
        if (apyyVar != null) {
            try {
                apesVar = apyyVar.B;
            } catch (RuntimeException unused) {
            }
            if ((apesVar == null ? apes.a : apesVar).d) {
                String str2 = "com.android.chrome";
                PackageManager packageManager = context.getPackageManager();
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Intent intent = new Intent();
                    intent.setAction("android.support.customtabs.action.CustomTabsService");
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    if (packageManager.resolveService(intent, 0) != null) {
                        arrayList.add(resolveInfo.activityInfo.packageName);
                    }
                }
                if (!arrayList.contains(str2)) {
                    if (arrayList.contains("com.chrome.beta")) {
                        str2 = "com.chrome.beta";
                    } else if (arrayList.contains("com.chrome.dev")) {
                        str2 = "com.chrome.dev";
                    } else {
                        str2 = arrayList.contains("com.google.android.apps.chrome") ? "com.google.android.apps.chrome" : null;
                    }
                }
                str = str2 == null ? bact.a(this.c) : str2;
                this.a = str;
                this.d = ajgqVar;
                this.e = executor;
            }
        }
        str = bact.a(context);
        this.a = str;
        this.d = ajgqVar;
        this.e = executor;
    }

    @Override // defpackage.ajgr
    public final ankt a(final Activity activity, final Uri uri) {
        ajgq ajgqVar;
        if (TextUtils.isEmpty(this.a) || !yja.b(this.c, uri).isEmpty() || (ajgqVar = this.d) == null || this.e == null) {
            return anlz.q(false);
        }
        return anii.h(ajgqVar.a(), new ampg() { // from class: ajgs
            /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
            @Override // defpackage.ampg
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r12) {
                /*
                    r11 = this;
                    ajgt r0 = defpackage.ajgt.this
                    android.app.Activity r6 = r2
                    android.net.Uri r7 = r3
                    snb r12 = (defpackage.snb) r12
                    boolean r1 = r0.f()
                    r2 = 0
                    if (r1 != 0) goto L11
                    goto Lc9
                L11:
                    if (r12 != 0) goto L15
                    goto Lc9
                L15:
                    aen r1 = new aen
                    r1.<init>()
                    aep r3 = r12.b
                    cj r4 = new cj
                    r4.<init>(r1)
                    r1 = 0
                    cl r5 = r3.b     // Catch: android.os.RemoteException -> L5c
                    android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L5c
                    android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L5c
                    java.lang.String r10 = "android.support.customtabs.ICustomTabsService"
                    r8.writeInterfaceToken(r10)     // Catch: java.lang.Throwable -> L54
                    r8.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L54
                    android.os.IBinder r5 = r5.a     // Catch: java.lang.Throwable -> L54
                    r10 = 3
                    r5.transact(r10, r8, r9, r2)     // Catch: java.lang.Throwable -> L54
                    r9.readException()     // Catch: java.lang.Throwable -> L54
                    int r5 = r9.readInt()     // Catch: java.lang.Throwable -> L54
                    r9.recycle()     // Catch: android.os.RemoteException -> L5c
                    r8.recycle()     // Catch: android.os.RemoteException -> L5c
                    if (r5 != 0) goto L4a
                    goto L5c
                L4a:
                    aet r5 = new aet
                    cl r8 = r3.b
                    android.content.ComponentName r3 = r3.a
                    r5.<init>(r4, r3)
                    goto L5d
                L54:
                    r3 = move-exception
                    r9.recycle()     // Catch: android.os.RemoteException -> L5c
                    r8.recycle()     // Catch: android.os.RemoteException -> L5c
                    throw r3     // Catch: android.os.RemoteException -> L5c
                L5c:
                    r5 = r1
                L5d:
                    if (r5 != 0) goto L60
                    goto L65
                L60:
                    sna r1 = new sna
                    r1.<init>(r12, r5)
                L65:
                    if (r1 == 0) goto Lc9
                    snb r12 = r1.d
                    java.lang.String r12 = r12.a
                    java.lang.String r3 = r0.a
                    boolean r12 = android.text.TextUtils.equals(r12, r3)
                    if (r12 != 0) goto L74
                    goto Lc9
                L74:
                    java.lang.String r12 = "https://www.youtube.com"
                    android.net.Uri r12 = android.net.Uri.parse(r12)
                    snb r2 = r1.d
                    amqo r2 = r2.c
                    java.lang.Object r2 = r2.get()
                    ampq r2 = (defpackage.ampq) r2
                    java.lang.Object r2 = r2.f()
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    if (r2 == 0) goto Lb5
                    int r2 = r2.intValue()
                    r3 = 14
                    if (r2 < r3) goto Lb5
                    android.os.Bundle r2 = new android.os.Bundle
                    r2.<init>()
                    android.os.IBinder r3 = r1.b
                    java.lang.String r4 = "session"
                    r2.putBinder(r4, r3)
                    android.os.Parcelable r3 = r1.c
                    java.lang.String r4 = "pendingId"
                    r2.putParcelable(r4, r3)
                    java.lang.String r3 = "origin"
                    r2.putParcelable(r3, r12)
                    snb r12 = r1.d
                    aep r12 = r12.b
                    java.lang.String r3 = "addVerifiedOriginForSession"
                    r12.a(r3, r2)
                Lb5:
                    aeq r12 = new aeq
                    aet r1 = r1.a
                    r12.<init>(r1)
                    r4 = 0
                    r5 = 1
                    r1 = r12
                    r2 = r6
                    r3 = r7
                    aer r12 = r0.g(r1, r2, r3, r4, r5)
                    r12.a(r6, r7)
                    r2 = 1
                Lc9:
                    java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ajgs.apply(java.lang.Object):java.lang.Object");
            }
        }, this.e);
    }

    @Override // defpackage.ajgr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ajgr
    public final boolean c(Activity activity, Uri uri) {
        if (!yja.b(this.c, uri).isEmpty()) {
            return false;
        }
        return d(activity, uri);
    }

    @Override // defpackage.ajgr
    public final boolean d(Activity activity, Uri uri) {
        if (TextUtils.isEmpty(this.a)) {
            return false;
        }
        g(new aeq(), activity, uri, false, false).a(activity, uri);
        return true;
    }

    @Override // defpackage.ajgr
    public final boolean e(Activity activity, Uri uri) {
        if (TextUtils.isEmpty(this.a) || !yja.b(this.c, uri).isEmpty()) {
            return false;
        }
        g(new aeq(), activity, uri, true, false).a(activity, uri);
        return true;
    }

    @Override // defpackage.ajgr
    public final boolean f() {
        String str;
        if (Build.VERSION.SDK_INT >= 28 && (str = this.a) != null && str.contains("chrome")) {
            return this.c.getPackageManager().getPackageInfo(this.a, 0).getLongVersionCode() >= 432418100;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aer g(aeq aeqVar, Activity activity, Uri uri, boolean z, boolean z2) {
        int orElse;
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(b);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        int i = activity.getResources().getConfiguration().uiMode & 48;
        if (i == 32) {
            orElse = zhn.j(activity, R.attr.ytStaticBrandBlack).orElse(-16777216);
        } else {
            orElse = zhn.j(activity, R.attr.ytStaticBrandWhite).orElse(-1);
        }
        int i2 = i != 32 ? 2131232730 : 2131232732;
        aeqVar.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        aeqVar.b.a = Integer.valueOf((-16777216) | orElse);
        aeqVar.a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", BitmapFactory.decodeResource(activity.getResources(), resourceId));
        aeqVar.c = akd.d(this.c, R.anim.abc_slide_in_bottom, R.anim.abc_fade_out).a();
        aeqVar.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", akd.d(this.c, R.anim.abc_fade_in, R.anim.abc_slide_out_bottom).a());
        Bitmap decodeResource = BitmapFactory.decodeResource(this.c.getResources(), i2);
        String string = this.c.getString(R.string.accessibility_share_page);
        Context context = this.c;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, CustomTabsReceiver.class), zgd.M() | 134217728);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.customaction.ID", 0);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", string);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
        aeqVar.a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        aeqVar.a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", false);
        aer a = aeqVar.a();
        a.a.setPackage(this.a);
        yja.c(this.c, a.a, uri);
        a.a.putExtra("com.android.browser.application_id", this.c.getPackageName());
        a.a.putExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", z);
        a.a.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", z2);
        a.a.putExtra("org.chromium.chrome.browser.customtabs.HIDE_INCOGNITO_ICON", z2);
        a.a.putExtra("org.chromium.chrome.browser.customtabs.USE_NORMAL_PROFILE_STYLE", z2);
        return a;
    }
}
