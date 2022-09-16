package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: ppn  reason: default package */
/* loaded from: classes4.dex */
public final class ppn implements pqj {
    private final SparseArray a;
    private final int[] b;

    public ppn(asu asuVar, azi aziVar) {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, (pqj) Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(pqj.class).getConstructor(asu.class).newInstance(asuVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (pqj) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(pqj.class).getConstructor(asu.class).newInstance(asuVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (pqj) Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(pqj.class).getConstructor(asu.class).newInstance(asuVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (pqj) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(pqj.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new pra(asuVar, aziVar));
        this.a = sparseArray;
        this.b = new int[sparseArray.size()];
        for (int i = 0; i < this.a.size(); i++) {
            this.b[i] = this.a.keyAt(i);
        }
    }
}
