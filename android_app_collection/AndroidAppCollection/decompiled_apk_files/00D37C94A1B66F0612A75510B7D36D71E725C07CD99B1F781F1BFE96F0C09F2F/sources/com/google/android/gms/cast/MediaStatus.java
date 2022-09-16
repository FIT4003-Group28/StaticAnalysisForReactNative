package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long g;
    public long h;
    double i;
    boolean j;
    public long[] k;
    public int l;
    int m;
    String n;
    public JSONObject o;
    public int p;
    public final List q;
    public boolean r;
    AdBreakStatus s;
    VideoInfo t;
    public MediaLiveSeekableRange u;
    public MediaQueueData v;
    private final SparseArray w;

    static {
        new qpu("MediaStatus");
        CREATOR = new qkf();
    }

    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List list, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        this.q = new ArrayList();
        this.w = new SparseArray();
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = j3;
        this.i = d2;
        this.j = z;
        this.k = jArr;
        this.l = i4;
        this.m = i5;
        this.n = str;
        if (str != null) {
            try {
                this.o = new JSONObject(str);
            } catch (JSONException unused) {
                this.o = null;
                this.n = null;
            }
        } else {
            this.o = null;
        }
        this.p = i6;
        if (list != null && !list.isEmpty()) {
            e(list);
        }
        this.r = z2;
        this.s = adBreakStatus;
        this.t = videoInfo;
        this.u = mediaLiveSeekableRange;
        this.v = mediaQueueData;
    }

    public static final boolean d(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            } else if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    private final void e(List list) {
        this.q.clear();
        this.w.clear();
        for (int i = 0; i < list.size(); i++) {
            MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
            this.q.add(mediaQueueItem);
            this.w.put(mediaQueueItem.b, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0190, code lost:
        if (r27.k != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ea, code lost:
        if (r3 == false) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(org.json.JSONObject r28, int r29) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.a(org.json.JSONObject, int):int");
    }

    public final MediaQueueItem b(int i) {
        Integer num = (Integer) this.w.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.q.get(num.intValue());
    }

    public final Integer c(int i) {
        return (Integer) this.w.get(i);
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        return (this.o == null) == (mediaStatus.o == null) && this.b == mediaStatus.b && this.c == mediaStatus.c && this.d == mediaStatus.d && this.e == mediaStatus.e && this.f == mediaStatus.f && this.g == mediaStatus.g && this.i == mediaStatus.i && this.j == mediaStatus.j && this.l == mediaStatus.l && this.m == mediaStatus.m && this.p == mediaStatus.p && Arrays.equals(this.k, mediaStatus.k) && qpl.j(Long.valueOf(this.h), Long.valueOf(mediaStatus.h)) && qpl.j(this.q, mediaStatus.q) && qpl.j(this.a, mediaStatus.a) && ((jSONObject = this.o) == null || (jSONObject2 = mediaStatus.o) == null || qyk.a(jSONObject, jSONObject2)) && this.r == mediaStatus.r && qpl.j(this.s, mediaStatus.s) && qpl.j(this.t, mediaStatus.t) && qpl.j(this.u, mediaStatus.u) && tnk.j(this.v, mediaStatus.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Double.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(this.l), Integer.valueOf(this.m), String.valueOf(this.o), Integer.valueOf(this.p), this.q, Boolean.valueOf(this.r), this.s, this.t, this.u, this.v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.o;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int m = tqj.m(parcel);
        tqj.E(parcel, 2, this.a, i);
        tqj.t(parcel, 3, this.b);
        tqj.s(parcel, 4, this.c);
        tqj.p(parcel, 5, this.d);
        tqj.s(parcel, 6, this.e);
        tqj.s(parcel, 7, this.f);
        tqj.t(parcel, 8, this.g);
        tqj.t(parcel, 9, this.h);
        tqj.p(parcel, 10, this.i);
        tqj.o(parcel, 11, this.j);
        tqj.C(parcel, 12, this.k);
        tqj.s(parcel, 13, this.l);
        tqj.s(parcel, 14, this.m);
        tqj.F(parcel, 15, this.n);
        tqj.s(parcel, 16, this.p);
        tqj.J(parcel, 17, this.q);
        tqj.o(parcel, 18, this.r);
        tqj.E(parcel, 19, this.s, i);
        tqj.E(parcel, 20, this.t, i);
        tqj.E(parcel, 21, this.u, i);
        tqj.E(parcel, 22, this.v, i);
        tqj.n(parcel, m);
    }

    public MediaStatus(JSONObject jSONObject) {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        a(jSONObject, 0);
    }
}
