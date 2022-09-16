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
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.lens.sdk.LensApi;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class LensApi {
    static final Uri a = Uri.parse("googleapp://lens");
    public static final /* synthetic */ int c = 0;
    public final tjb b;
    private final tiy d;
    private final KeyguardManager e;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface LensAvailabilityCallback {
        void onAvailabilityStatusFetched(int i);
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public @interface LensAvailabilityStatus {
        public static final int LENS_AVAILABILITY_UNKNOWN = -1;
        public static final int LENS_READY = 0;
        public static final int LENS_UNAVAILABLE = 1;
        public static final int LENS_UNAVAILABLE_AGSA_OUTDATED = 6;
        @Deprecated
        public static final int LENS_UNAVAILABLE_ASSISTANT_EYES_FLAG_DISABLED = 8;
        public static final int LENS_UNAVAILABLE_DEVICE_INCOMPATIBLE = 3;
        public static final int LENS_UNAVAILABLE_DEVICE_LOCKED = 5;
        public static final int LENS_UNAVAILABLE_FEATURE_UNAVAILABLE = 11;
        public static final int LENS_UNAVAILABLE_INVALID_CURSOR = 4;
        @Deprecated
        public static final int LENS_UNAVAILABLE_LOCALE_NOT_SUPPORTED = 2;
        public static final int LENS_UNAVAILABLE_SERVICE_BUSY_FAILURE = 10;
        public static final int LENS_UNAVAILABLE_SERVICE_UNAVAILABLE = 9;
        public static final int LENS_UNAVAILABLE_UNKNOWN_ERROR_CODE = 12;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public @interface LensFeature {
        public static final int LENS_AR_STICKERS = 1;
        public static final int LENS_CORE = 0;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public @interface LensLaunchStatus {
        public static final int LAUNCH_FAILURE_UNLOCK_FAILED = 1;
        public static final int LAUNCH_SUCCESS = 0;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface LensLaunchStatusCallback {
        void onLaunchStatusFetched(int i);
    }

    public LensApi(Context context) {
        this.e = (KeyguardManager) context.getSystemService("keyguard");
        tiy tiyVar = new tiy(context);
        this.d = tiyVar;
        this.b = new tjb(context, tiyVar);
    }

    private final void e(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback, Runnable runnable) {
        if (!this.e.isKeyguardLocked()) {
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
            Log.e("LensApi", sb.toString());
            if (lensLaunchStatusCallback == null) {
                return;
            }
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        } else {
            this.e.requestDismissKeyguard(activity, new aohd(runnable, lensLaunchStatusCallback));
        }
    }

    private final boolean f(String str) {
        String str2 = this.d.g.d;
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

    public final void a(Activity activity) {
        tjb tjbVar = this.b;
        tjk.a();
        if (tjbVar.a.f()) {
            aopc aopcVar = (aopc) dvv.a.createBuilder();
            aopcVar.copyOnWrite();
            dvv dvvVar = (dvv) aopcVar.instance;
            dvvVar.c = 347;
            dvvVar.b |= 1;
            dvv dvvVar2 = (dvv) aopcVar.mo39build();
            try {
                tjd tjdVar = tjbVar.a;
                byte[] byteArray = dvvVar2.toByteArray();
                tjk.a();
                tjk.b(((tjj) tjdVar).f(), "Attempted to use lensServiceSession before ready.");
                dvr dvrVar = ((tjj) tjdVar).j;
                tjk.c(dvrVar);
                dvrVar.a(byteArray);
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Unable to send prewarm signal.", e);
            }
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(a);
        activity.startActivityForResult(intent, 0);
    }

    public final boolean c(Bitmap bitmap, aohg aohgVar) {
        if (bitmap == null) {
            Log.w("LensApi", "launchLensActivityWithBitmap: bitmap should not be null.");
        }
        if (this.e.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        } else if (this.b.e() != 2) {
            return false;
        } else {
            aohf c2 = aohgVar.c();
            c2.b = bitmap;
            b(c2.a());
            return true;
        }
    }

    public void checkArStickersAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.d.a(new aohe(lensAvailabilityCallback, 1));
    }

    public void checkLensAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        if (!this.e.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
            if (f("8.3")) {
                lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                return;
            } else {
                this.d.a(new aohe(lensAvailabilityCallback, 0));
                return;
            }
        }
        lensAvailabilityCallback.onAvailabilityStatusFetched(5);
    }

    public void checkPendingIntentAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        if (!this.e.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
            if (f("9.72")) {
                lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                return;
            }
            tjb tjbVar = this.b;
            aogz aogzVar = new aogz(lensAvailabilityCallback, 1);
            tjk.a();
            tjbVar.d(new tiz(tjbVar, aogzVar, 2));
            return;
        }
        lensAvailabilityCallback.onAvailabilityStatusFetched(5);
    }

    public void checkPostCaptureAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        if (!this.e.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
            if (f("8.19")) {
                lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                return;
            }
            tjb tjbVar = this.b;
            aogz aogzVar = new aogz(lensAvailabilityCallback);
            tjk.a();
            tjbVar.d(new tiz(tjbVar, aogzVar, 1));
            return;
        }
        lensAvailabilityCallback.onAvailabilityStatusFetched(5);
    }

    public final boolean d(aohg aohgVar, PendingIntentConsumer pendingIntentConsumer) {
        if (this.b.f() != 2) {
            return false;
        }
        tjb tjbVar = this.b;
        tjbVar.c(aohgVar.a(tjbVar.a()));
        tjb tjbVar2 = this.b;
        tjbVar2.a();
        Bundle d = aohgVar.d();
        tjk.a();
        tjbVar2.b = pendingIntentConsumer;
        if (tjbVar2.a.f()) {
            aopc aopcVar = (aopc) dvv.a.createBuilder();
            aopcVar.copyOnWrite();
            dvv dvvVar = (dvv) aopcVar.instance;
            dvvVar.c = 412;
            dvvVar.b |= 1;
            try {
                tjbVar2.a.c(((dvv) aopcVar.mo39build()).toByteArray(), new SystemParcelableWrapper(d));
                return true;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to send Lens service client event", e);
            }
        }
        Log.e("LensApi", "Failed to request pending intent.");
        return false;
    }

    @Deprecated
    public void launchLensActivity(Activity activity) {
        e(activity, null, new aohb(this, activity, 1));
    }

    public boolean launchLensActivityWithBitmap(Bitmap bitmap) {
        if (this.e.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        aohf b = aohg.b();
        b.c = Long.valueOf(elapsedRealtimeNanos);
        return c(bitmap, b.a());
    }

    public boolean launchLensActivityWithBitmapForTranslate(Bitmap bitmap) {
        dwa dwaVar;
        tjb tjbVar = this.b;
        tjk.a();
        tjk.b(tjbVar.a.f(), "getLensCapabilities() called when Lens is not ready.");
        if (!tjbVar.a.f()) {
            dwaVar = dwa.a;
        } else {
            tjd tjdVar = tjbVar.a;
            tjk.a();
            tjj tjjVar = (tjj) tjdVar;
            tjk.b(tjjVar.l(), "Attempted to use LensCapabilities before ready.");
            dwaVar = tjjVar.g;
        }
        if ((dwaVar.b & 2) == 0) {
            Log.e("LensApi", "Translate is not supported.");
            return false;
        }
        aopa createBuilder = aogy.a.createBuilder();
        aogx aogxVar = aogx.a;
        createBuilder.copyOnWrite();
        aogy aogyVar = (aogy) createBuilder.instance;
        aogxVar.getClass();
        aogyVar.c = aogxVar;
        aogyVar.b = 2;
        aohf b = aohg.b();
        b.e = 5;
        b.d = (aogy) createBuilder.mo39build();
        return c(bitmap, b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.ServiceConnection, tjd] */
    public void onPause() {
        tjb tjbVar = this.b;
        tjk.a();
        ?? r1 = tjbVar.a;
        tjk.a();
        tjj tjjVar = (tjj) r1;
        if (tjjVar.l()) {
            aopc aopcVar = (aopc) dvv.a.createBuilder();
            aopcVar.copyOnWrite();
            dvv dvvVar = (dvv) aopcVar.instance;
            dvvVar.c = 345;
            dvvVar.b |= 1;
            dvv dvvVar2 = (dvv) aopcVar.mo39build();
            try {
                dvr dvrVar = ((tjj) r1).j;
                tjk.c(dvrVar);
                dvrVar.a(dvvVar2.toByteArray());
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceConnImpl", "Unable to end Lens service session.", e);
            }
            tjjVar.j = null;
            tjjVar.e = 0;
            tjjVar.f = null;
            tjjVar.g = null;
        }
        if (tjjVar.k()) {
            try {
                ((tjj) r1).b.unbindService(r1);
            } catch (IllegalArgumentException unused) {
                Log.w("LensServiceConnImpl", "Unable to unbind, service is not registered.");
            }
            tjjVar.i = null;
        }
        tjjVar.h = 1;
        tjjVar.i(1);
        tjbVar.b = null;
    }

    public void onResume() {
        tjb tjbVar = this.b;
        tjk.a();
        ((tjj) tjbVar.a).m();
    }

    public boolean requestLensActivityPendingIntent(PendingIntentConsumer pendingIntentConsumer) {
        return d(aohg.b().a(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmap(Bitmap bitmap, PendingIntentConsumer pendingIntentConsumer) {
        aohf b = aohg.b();
        b.b = bitmap;
        return d(b.a(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmapUri(Context context, Uri uri, PendingIntentConsumer pendingIntentConsumer) {
        if (context != null) {
            context.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
        }
        aohf b = aohg.b();
        b.a = uri;
        return d(b.a(), pendingIntentConsumer);
    }

    @Deprecated
    public void launchLensActivity(Activity activity, int i) {
        if (i == 0) {
            e(activity, null, new aohb(this, activity));
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid lens activity: ");
            sb.append(i);
            Log.w("LensApi", sb.toString());
        } else {
            int c2 = tjw.c(this.d.g.f);
            if (c2 == 0 || c2 != 2) {
                return;
            }
            Intent intent = new Intent();
            intent.setClassName("com.google.ar.lens", "com.google.vr.apps.ornament.app.MainActivity");
            activity.startActivity(intent);
        }
    }

    public void launchLensActivity(final Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback) {
        final aohg a2 = aohg.b().a();
        e(activity, lensLaunchStatusCallback, new Runnable() { // from class: aohc
            @Override // java.lang.Runnable
            public final void run() {
                final LensApi lensApi = LensApi.this;
                final Activity activity2 = activity;
                final aohg aohgVar = a2;
                final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                tjb tjbVar = lensApi.b;
                tja tjaVar = new tja() { // from class: aoha
                    @Override // defpackage.tja
                    public final void a(int i) {
                        LensApi lensApi2 = LensApi.this;
                        aohg aohgVar2 = aohgVar;
                        long j = elapsedRealtimeNanos;
                        Activity activity3 = activity2;
                        if (i == 2) {
                            if (aohgVar2.c == null) {
                                aohf c2 = aohgVar2.c();
                                c2.c = Long.valueOf(j);
                                aohgVar2 = c2.a();
                            }
                            lensApi2.b(aohgVar2);
                            return;
                        }
                        lensApi2.a(activity3);
                    }
                };
                tjk.a();
                tjbVar.d(new tiz(tjbVar, tjaVar));
            }
        });
    }

    public final void b(aohg aohgVar) {
        if (aohgVar.a != null || aohgVar.b != null) {
            tjb tjbVar = this.b;
            if (!tjbVar.c(aohgVar.a(tjbVar.a()))) {
                return;
            }
        }
        tjb tjbVar2 = this.b;
        tjbVar2.a();
        Bundle d = aohgVar.d();
        tjk.a();
        if (tjbVar2.a.f()) {
            aopc aopcVar = (aopc) dvv.a.createBuilder();
            aopcVar.copyOnWrite();
            dvv dvvVar = (dvv) aopcVar.instance;
            dvvVar.c = 355;
            dvvVar.b |= 1;
            try {
                tjbVar2.a.c(((dvv) aopcVar.mo39build()).toByteArray(), new SystemParcelableWrapper(d));
                tjbVar2.a.d();
                return;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to start Lens", e);
            }
        }
        Log.e("LensApi", "Failed to start lens.");
    }
}
