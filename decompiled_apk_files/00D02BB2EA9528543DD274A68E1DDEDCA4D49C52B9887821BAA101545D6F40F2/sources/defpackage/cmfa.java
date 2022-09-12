package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: cmfa  reason: default package */
/* loaded from: classes5.dex */
final class cmfa {
    public final TrackGroupArray a;
    public final boolean[] b;
    public final boolean[] c;
    public final boolean[] d;

    public cmfa(TrackGroupArray trackGroupArray, boolean[] zArr) {
        this.a = trackGroupArray;
        this.b = zArr;
        int i = trackGroupArray.b;
        this.c = new boolean[i];
        this.d = new boolean[i];
    }
}
