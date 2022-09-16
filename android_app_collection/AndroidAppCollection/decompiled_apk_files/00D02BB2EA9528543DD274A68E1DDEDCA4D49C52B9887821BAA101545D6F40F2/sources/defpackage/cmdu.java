package defpackage;

import android.content.Context;
import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: cmdu  reason: default package */
/* loaded from: classes5.dex */
public final class cmdu implements cmes {
    private final SparseArray<cmes> a;
    private final int[] b;

    public cmdu(Context context, clus clusVar) {
        cmkp cmkpVar = new cmkp(context, new cmkr(clnd.a));
        SparseArray<cmes> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (cmes) Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(cmes.class).getConstructor(cmkf.class).newInstance(cmkpVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (cmes) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(cmes.class).getConstructor(cmkf.class).newInstance(cmkpVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (cmes) Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(cmes.class).getConstructor(cmkf.class).newInstance(cmkpVar));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new cmfd(cmkpVar, clusVar));
        this.a = sparseArray;
        this.b = new int[sparseArray.size()];
        for (int i = 0; i < this.a.size(); i++) {
            this.b[i] = this.a.keyAt(i);
        }
    }
}
