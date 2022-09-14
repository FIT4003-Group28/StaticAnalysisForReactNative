package com.google.lens.sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.lens.sdk.LensApi;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LensApi {
    static final Uri a = Uri.parse("googleapp://lens");
    public static final /* synthetic */ int d = 0;
    public final cseg b;
    public final KeyguardManager c;
    private final csea e;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public interface LensAvailabilityCallback {
        void onAvailabilityStatusFetched(int i);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public @interface LensAvailabilityStatus {
        public static final int LENS_AVAILABILITY_UNKNOWN = -1;
        public static final int LENS_READY = 0;
        public static final int LENS_UNAVAILABLE = 1;
        public static final int LENS_UNAVAILABLE_AGSA_OUTDATED = 6;
        public static final int LENS_UNAVAILABLE_ASSISTANT_EYES_FLAG_DISABLED = 8;
        public static final int LENS_UNAVAILABLE_DEVICE_INCOMPATIBLE = 3;
        public static final int LENS_UNAVAILABLE_DEVICE_LOCKED = 5;
        public static final int LENS_UNAVAILABLE_FEATURE_UNAVAILABLE = 11;
        public static final int LENS_UNAVAILABLE_INVALID_CURSOR = 4;
        public static final int LENS_UNAVAILABLE_LOCALE_NOT_SUPPORTED = 2;
        public static final int LENS_UNAVAILABLE_SERVICE_BUSY_FAILURE = 10;
        public static final int LENS_UNAVAILABLE_SERVICE_UNAVAILABLE = 9;
        public static final int LENS_UNAVAILABLE_UNKNOWN_ERROR_CODE = 12;
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public @interface LensFeature {
        public static final int LENS_AR_STICKERS = 1;
        public static final int LENS_CORE = 0;
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public @interface LensLaunchStatus {
        public static final int LAUNCH_FAILURE_UNLOCK_FAILED = 1;
        public static final int LAUNCH_SUCCESS = 0;
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public interface LensLaunchStatusCallback {
        void onLaunchStatusFetched(int i);
    }

    public LensApi(Context context) {
        this.c = (KeyguardManager) context.getSystemService("keyguard");
        csea cseaVar = new csea(context);
        this.e = cseaVar;
        this.b = new cseg(context, cseaVar);
    }

    private final void h(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback, Runnable runnable) {
        if (!this.c.isKeyguardLocked()) {
            runnable.run();
            if (lensLaunchStatusCallback == null) {
                return;
            }
            lensLaunchStatusCallback.onLaunchStatusFetched(0);
        } else if (activity == null || Build.VERSION.SDK_INT < 26) {
            int i = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Cannot start Lens when device is locked with Android ");
            sb.append(i);
            sb.toString();
            if (lensLaunchStatusCallback == null) {
                return;
            }
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        } else {
            this.c.requestDismissKeyguard(activity, new dhhz(runnable, lensLaunchStatusCallback));
        }
    }

    public final ckzn a() {
        cseg csegVar = this.b;
        cser.b();
        cser.a(csegVar.a.e(), "getLensCapabilities() called when Lens is not ready.");
        if (!csegVar.a.e()) {
            return ckzn.b;
        }
        csei cseiVar = csegVar.a;
        cser.b();
        cseq cseqVar = (cseq) cseiVar;
        cser.a(cseqVar.i(), "Attempted to use LensCapabilities before ready.");
        return cseqVar.g;
    }

    public final void b(Activity activity) {
        cseg csegVar = this.b;
        cser.b();
        if (csegVar.a.e()) {
            ckyp ckypVar = (ckyp) ckyq.c.bZ();
            if (ckypVar.c) {
                ckypVar.bF();
                ckypVar.c = false;
            }
            ckyq ckyqVar = (ckyq) ckypVar.b;
            ckyqVar.b = 347;
            ckyqVar.a |= 1;
            ckyq ckyqVar2 = (ckyq) ckypVar.bK();
            try {
                csei cseiVar = csegVar.a;
                byte[] bS = ckyqVar2.bS();
                cser.b();
                cser.a(((cseq) cseiVar).e(), "Attempted to use lensServiceSession before ready.");
                ckyj ckyjVar = ((cseq) cseiVar).l;
                cser.c(ckyjVar);
                ckyjVar.e(bS);
            } catch (RemoteException | SecurityException unused) {
            }
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(a);
        activity.startActivityForResult(intent, 0);
    }

    public final boolean c(Bitmap bitmap, dhic dhicVar) {
        if (!this.c.isKeyguardLocked() && this.b.f() == 2) {
            dhib u = dhicVar.u();
            u.b(bitmap);
            e(u.a());
            return true;
        }
        return false;
    }

    public void checkArStickersAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.e.a(new dhia(lensAvailabilityCallback, 1));
    }

    public void checkLensAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        if (!this.c.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
            if (g("8.3")) {
                lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                return;
            } else {
                this.e.a(new dhia(lensAvailabilityCallback, 0));
                return;
            }
        }
        lensAvailabilityCallback.onAvailabilityStatusFetched(5);
    }

    public void checkPendingIntentAvailability(final LensAvailabilityCallback lensAvailabilityCallback) {
        if (!this.c.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
            if (g("9.72")) {
                lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                return;
            }
            final cseg csegVar = this.b;
            final csef csefVar = new csef(lensAvailabilityCallback) { // from class: dhhy
                private final LensApi.LensAvailabilityCallback a;

                {
                    this.a = lensAvailabilityCallback;
                }

                @Override // defpackage.csef
                public final void a(int i) {
                    LensApi.LensAvailabilityCallback lensAvailabilityCallback2 = this.a;
                    int i2 = i - 2;
                    int i3 = LensApi.d;
                    if (i != 0) {
                        lensAvailabilityCallback2.onAvailabilityStatusFetched(i2);
                        return;
                    }
                    throw null;
                }
            };
            cser.b();
            csegVar.d(new csef(csegVar, csefVar) { // from class: csec
                private final cseg a;
                private final csef b;

                {
                    this.a = csegVar;
                    this.b = csefVar;
                }

                @Override // defpackage.csef
                public final void a(int i) {
                    this.b.a(this.a.e());
                }
            });
            return;
        }
        lensAvailabilityCallback.onAvailabilityStatusFetched(5);
    }

    public void checkPostCaptureAvailability(final LensAvailabilityCallback lensAvailabilityCallback) {
        if (!this.c.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
            if (g("8.19")) {
                lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                return;
            }
            final cseg csegVar = this.b;
            final csef csefVar = new csef(lensAvailabilityCallback) { // from class: dhhx
                private final LensApi.LensAvailabilityCallback a;

                {
                    this.a = lensAvailabilityCallback;
                }

                @Override // defpackage.csef
                public final void a(int i) {
                    LensApi.LensAvailabilityCallback lensAvailabilityCallback2 = this.a;
                    int i2 = i - 2;
                    int i3 = LensApi.d;
                    if (i != 0) {
                        lensAvailabilityCallback2.onAvailabilityStatusFetched(i2);
                        return;
                    }
                    throw null;
                }
            };
            cser.b();
            csegVar.d(new csef(csegVar, csefVar) { // from class: cseb
                private final cseg a;
                private final csef b;

                {
                    this.a = csegVar;
                    this.b = csefVar;
                }

                @Override // defpackage.csef
                public final void a(int i) {
                    this.b.a(this.a.f());
                }
            });
            return;
        }
        lensAvailabilityCallback.onAvailabilityStatusFetched(5);
    }

    public final boolean d(dhic dhicVar, PendingIntentConsumer pendingIntentConsumer) {
        if (this.b.e() != 2) {
            return false;
        }
        cseg csegVar = this.b;
        csegVar.a(dhicVar.w(csegVar.b()));
        cseg csegVar2 = this.b;
        csegVar2.b();
        Bundle x = dhicVar.x();
        cser.b();
        csegVar2.b = pendingIntentConsumer;
        if (csegVar2.a.e()) {
            ckyp ckypVar = (ckyp) ckyq.c.bZ();
            if (ckypVar.c) {
                ckypVar.bF();
                ckypVar.c = false;
            }
            ckyq ckyqVar = (ckyq) ckypVar.b;
            ckyqVar.b = 412;
            ckyqVar.a |= 1;
            try {
                csegVar2.a.c(((ckyq) ckypVar.bK()).bS(), new SystemParcelableWrapper(x));
                return true;
            } catch (RemoteException | SecurityException unused) {
            }
        }
        return false;
    }

    public final void e(dhic dhicVar) {
        if (dhicVar.a() != null || dhicVar.b() != null || dhicVar.h() != null) {
            cseg csegVar = this.b;
            if (!csegVar.a(dhicVar.w(csegVar.b()))) {
                return;
            }
        }
        cseg csegVar2 = this.b;
        csegVar2.b();
        Bundle x = dhicVar.x();
        cser.b();
        if (!csegVar2.a.e()) {
            return;
        }
        ckyp ckypVar = (ckyp) ckyq.c.bZ();
        if (ckypVar.c) {
            ckypVar.bF();
            ckypVar.c = false;
        }
        ckyq ckyqVar = (ckyq) ckypVar.b;
        ckyqVar.b = 355;
        ckyqVar.a |= 1;
        try {
            csegVar2.a.c(((ckyq) ckypVar.bK()).bS(), new SystemParcelableWrapper(x));
            csegVar2.a.a();
        } catch (RemoteException | SecurityException unused) {
        }
    }

    public final long f() {
        cseg csegVar = this.b;
        if (!csegVar.a.e()) {
            return 0L;
        }
        return ((cseq) csegVar.a).h;
    }

    public final boolean g(String str) {
        String str2 = this.e.g.c;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String[] split = str2.split("\\.", -1);
        String[] split2 = str.split("\\.", -1);
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt < parseInt2) {
                return true;
            }
            if (parseInt > parseInt2) {
                return false;
            }
        }
        return split.length < split2.length;
    }

    @Deprecated
    public void launchLensActivity(final Activity activity) {
        h(activity, null, new Runnable(this, activity) { // from class: dhhs
            private final LensApi a;
            private final Activity b;

            {
                this.a = this;
                this.b = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(this.b);
            }
        });
    }

    public boolean launchLensActivityWithBitmap(Bitmap bitmap) {
        if (this.c.isKeyguardLocked()) {
            return false;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        dhib v = dhic.v();
        ((dhhq) v).f = Long.valueOf(elapsedRealtimeNanos);
        return c(bitmap, v.a());
    }

    public boolean launchLensActivityWithBitmapForTranslate(Bitmap bitmap) {
        if ((a().a & 2) != 0) {
            cses bZ = csfh.c.bZ();
            csfg csfgVar = csfg.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            csfh csfhVar = (csfh) bZ.b;
            csfgVar.getClass();
            csfhVar.b = csfgVar;
            csfhVar.a = 2;
            dhib v = dhic.v();
            dhhq dhhqVar = (dhhq) v;
            dhhqVar.j = 5;
            dhhqVar.h = bZ.bK();
            return c(bitmap, v.a());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.ServiceConnection, csei] */
    public void onPause() {
        cseg csegVar = this.b;
        cser.b();
        ?? r1 = csegVar.a;
        cser.b();
        cseq cseqVar = (cseq) r1;
        if (cseqVar.i()) {
            ckyp ckypVar = (ckyp) ckyq.c.bZ();
            if (ckypVar.c) {
                ckypVar.bF();
                ckypVar.c = false;
            }
            ckyq ckyqVar = (ckyq) ckypVar.b;
            ckyqVar.b = 345;
            ckyqVar.a |= 1;
            ckyq ckyqVar2 = (ckyq) ckypVar.bK();
            try {
                ckyj ckyjVar = ((cseq) r1).l;
                cser.c(ckyjVar);
                ckyjVar.e(ckyqVar2.bS());
            } catch (RemoteException | SecurityException unused) {
            }
            cseqVar.l = null;
            cseqVar.e = 0;
            cseqVar.f = null;
            cseqVar.g = null;
            cseqVar.i = 1;
        }
        if (cseqVar.j()) {
            try {
                ((cseq) r1).b.unbindService(r1);
            } catch (IllegalArgumentException unused2) {
            }
            cseqVar.k = null;
        }
        cseqVar.j = 1;
        cseqVar.l(1);
        csegVar.b = null;
    }

    public void onResume() {
        cseg csegVar = this.b;
        cser.b();
        ((cseq) csegVar.a).m();
    }

    public boolean requestLensActivityPendingIntent(PendingIntentConsumer pendingIntentConsumer) {
        return d(dhic.v().a(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmap(Bitmap bitmap, PendingIntentConsumer pendingIntentConsumer) {
        dhib v = dhic.v();
        ((dhhq) v).b = bitmap;
        return d(v.a(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmapUri(Context context, Uri uri, PendingIntentConsumer pendingIntentConsumer) {
        if (context != null) {
            context.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
        }
        dhib v = dhic.v();
        ((dhhq) v).a = uri;
        return d(v.a(), pendingIntentConsumer);
    }

    @Deprecated
    public void launchLensActivity(final Activity activity, int i) {
        if (i == 0) {
            h(activity, null, new Runnable(this, activity) { // from class: dhhv
                private final LensApi a;
                private final Activity b;

                {
                    this.a = this;
                    this.b = activity;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(this.b);
                }
            });
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid lens activity: ");
            sb.append(i);
            sb.toString();
        } else {
            int a2 = csfk.a(this.e.g.e);
            if (a2 == 0 || a2 != 2) {
                return;
            }
            Intent intent = new Intent();
            intent.setClassName("com.google.ar.lens", "com.google.vr.apps.ornament.app.MainActivity");
            activity.startActivity(intent);
        }
    }

    public void launchLensActivity(final Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback) {
        final dhic a2 = dhic.v().a();
        h(activity, lensLaunchStatusCallback, new Runnable(this, activity, a2) { // from class: dhhu
            private final LensApi a;
            private final Activity b;
            private final dhic c;

            {
                this.a = this;
                this.b = activity;
                this.c = a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final LensApi lensApi = this.a;
                final Activity activity2 = this.b;
                final dhic dhicVar = this.c;
                final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                cseg csegVar = lensApi.b;
                csef csefVar = new csef(lensApi, dhicVar, elapsedRealtimeNanos, activity2) { // from class: dhhw
                    private final LensApi a;
                    private final dhic b;
                    private final long c;
                    private final Activity d;

                    {
                        this.a = lensApi;
                        this.b = dhicVar;
                        this.c = elapsedRealtimeNanos;
                        this.d = activity2;
                    }

                    @Override // defpackage.csef
                    public final void a(int i) {
                        LensApi lensApi2 = this.a;
                        dhic dhicVar2 = this.b;
                        long j = this.c;
                        Activity activity3 = this.d;
                        if (i == 2) {
                            dhib u = dhicVar2.u();
                            u.c(Long.valueOf(j));
                            lensApi2.e(u.a());
                            return;
                        }
                        lensApi2.b(activity3);
                    }
                };
                cser.b();
                csegVar.d(new csef(csegVar, csefVar) { // from class: csed
                    private final cseg a;
                    private final csef b;

                    {
                        this.a = csegVar;
                        this.b = csefVar;
                    }

                    @Override // defpackage.csef
                    public final void a(int i) {
                        cseg csegVar2 = this.a;
                        csef csefVar2 = this.b;
                        cser.b();
                        int i2 = 13;
                        if (csegVar2.a.e()) {
                            ckzp b = csegVar2.b();
                            if ((b.a & 1) != 0 && csegVar2.a.d() >= b.b) {
                                i2 = 2;
                            }
                        } else {
                            i2 = csegVar2.a.g();
                        }
                        csefVar2.a(i2);
                    }
                });
            }
        });
    }
}
