package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.filament.R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new coji();
    public List<DetectedActivity> a;
    long b;
    public long c;
    public int d;
    public Bundle e;

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        cnwc.e(list != null && list.size() > 0, "Must have at least 1 detected activity");
        cnwc.e((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = bundle;
    }

    public static boolean a(Intent intent) {
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List<ActivityRecognitionResult> c = c(intent);
        return c != null && !c.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.location.ActivityRecognitionResult b(android.content.Intent r3) {
        /*
            boolean r0 = a(r3)
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L28
        L9:
            android.os.Bundle r0 = r3.getExtras()
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L22
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r2 = com.google.android.gms.location.ActivityRecognitionResult.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = defpackage.cnwo.b(r0, r2)
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L28
        L22:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L7
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
        L28:
            if (r0 == 0) goto L2b
            return r0
        L2b:
            java.util.List r3 = c(r3)
            if (r3 == 0) goto L45
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L38
            goto L45
        L38:
            int r0 = r3.size()
            int r0 = r0 + (-1)
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.b(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    public static List<ActivityRecognitionResult> c(Intent intent) {
        if (!intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return null;
        }
        return cnwo.d(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
    }

    private static boolean f(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if (bundle == null || bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!f(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (bundle.get(str).getClass().isArray()) {
                if (bundle2.get(str) != null && bundle2.get(str).getClass().isArray()) {
                    Object obj = bundle.get(str);
                    Object obj2 = bundle2.get(str);
                    int length = Array.getLength(obj);
                    if (length == Array.getLength(obj2)) {
                        for (int i = 0; i < length; i++) {
                            if (cnvv.a(Array.get(obj, i), Array.get(obj2, i))) {
                            }
                        }
                        continue;
                    }
                }
                return false;
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final DetectedActivity d() {
        return this.a.get(0);
    }

    public final int e(int i) {
        for (DetectedActivity detectedActivity : this.a) {
            if (detectedActivity.a() == i) {
                return detectedActivity.b;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.b == activityRecognitionResult.b && this.c == activityRecognitionResult.c && this.d == activityRecognitionResult.d && cnvv.a(this.a, activityRecognitionResult.a) && f(this.e, activityRecognitionResult.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d), this.a, this.e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_windowMinWidthMajor);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 1, this.a);
        cnwn.h(parcel, 2, this.b);
        cnwn.h(parcel, 3, this.c);
        cnwn.g(parcel, 4, this.d);
        cnwn.m(parcel, 5, this.e);
        cnwn.c(parcel, d);
    }
}
