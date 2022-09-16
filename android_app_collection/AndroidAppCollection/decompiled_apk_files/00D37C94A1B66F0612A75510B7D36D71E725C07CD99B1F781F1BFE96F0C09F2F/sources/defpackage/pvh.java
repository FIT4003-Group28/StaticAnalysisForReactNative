package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: pvh  reason: default package */
/* loaded from: classes4.dex */
public final class pvh {
    public final int a;
    private final int[] b;
    private final TrackGroupArray[] c;

    public pvh(int[] iArr, TrackGroupArray[] trackGroupArrayArr) {
        this.b = iArr;
        this.c = trackGroupArrayArr;
        this.a = iArr.length;
    }

    public final int a(int i) {
        return this.b[i];
    }

    public final TrackGroupArray b(int i) {
        return this.c[i];
    }
}
