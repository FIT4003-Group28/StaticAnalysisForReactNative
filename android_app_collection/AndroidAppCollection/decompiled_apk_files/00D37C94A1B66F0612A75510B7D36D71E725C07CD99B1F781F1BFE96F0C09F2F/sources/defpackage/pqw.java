package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: pqw  reason: default package */
/* loaded from: classes4.dex */
final class pqw {
    public final TrackGroupArray a;
    public final boolean[] b;
    public final boolean[] c;
    public final boolean[] d;

    public pqw(TrackGroupArray trackGroupArray, boolean[] zArr) {
        this.a = trackGroupArray;
        this.b = zArr;
        int i = trackGroupArray.b;
        this.c = new boolean[i];
        this.d = new boolean[i];
    }
}
