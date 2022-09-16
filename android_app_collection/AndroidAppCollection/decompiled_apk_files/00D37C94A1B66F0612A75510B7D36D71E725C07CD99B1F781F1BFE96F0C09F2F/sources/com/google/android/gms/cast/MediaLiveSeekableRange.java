package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    private static final qpu e = new qpu("MediaLiveSeekableRange");
    public static final Parcelable.Creator CREATOR = new qjl(6);

    public MediaLiveSeekableRange(long j, long j2, boolean z, boolean z2) {
        this.a = Math.max(j, 0L);
        this.b = Math.max(j2, 0L);
        this.c = z;
        this.d = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MediaLiveSeekableRange a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("start") && jSONObject.has("end")) {
            try {
                long b = qpl.b(jSONObject.getDouble("start"));
                double d = jSONObject.getDouble("end");
                return new MediaLiveSeekableRange(b, qpl.b(d), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
            } catch (JSONException unused) {
                qpu qpuVar = e;
                String valueOf = String.valueOf(jSONObject);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Ignoring Malformed MediaLiveSeekableRange: ");
                sb.append(valueOf);
                qpuVar.b(sb.toString(), new Object[0]);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLiveSeekableRange)) {
            return false;
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
        return this.a == mediaLiveSeekableRange.a && this.b == mediaLiveSeekableRange.b && this.c == mediaLiveSeekableRange.c && this.d == mediaLiveSeekableRange.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.t(parcel, 2, this.a);
        tqj.t(parcel, 3, this.b);
        tqj.o(parcel, 4, this.c);
        tqj.o(parcel, 5, this.d);
        tqj.n(parcel, m);
    }
}
