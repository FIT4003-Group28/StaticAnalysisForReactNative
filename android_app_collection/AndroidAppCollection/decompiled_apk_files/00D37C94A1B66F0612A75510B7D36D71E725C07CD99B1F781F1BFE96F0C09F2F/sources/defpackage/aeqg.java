package defpackage;

import com.youtube.libraries.bandwidth.BandwidthSampleCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeqg  reason: default package */
/* loaded from: classes.dex */
public final class aeqg extends BandwidthSampleCallback {
    final /* synthetic */ aeqh a;

    public aeqg(aeqh aeqhVar) {
        this.a = aeqhVar;
    }

    @Override // com.youtube.libraries.bandwidth.BandwidthSampleCallback
    public final void onLatencySample(float f) {
        aeqh aeqhVar = this.a;
        if (aeqhVar.f.size() >= aeqhVar.k) {
            aeqhVar.f.removeFirst();
        }
        aeqhVar.f.addLast(Float.valueOf(f));
        aeqhVar.b.c(-1.0f, f, -1L, 1, aeqhVar.a);
    }

    @Override // com.youtube.libraries.bandwidth.BandwidthSampleCallback
    public final void onOnesieSample(float f, float f2) {
        aeqh aeqhVar = this.a;
        if (aeqhVar.g.size() >= aeqhVar.l) {
            aeqhVar.g.removeFirst();
        }
        aeqhVar.g.addLast(Float.valueOf(f2));
        aeqhVar.h = 0L;
        aeqhVar.b.c(-1.0f, f2, 0L, 2, aeqhVar.a);
    }

    @Override // com.youtube.libraries.bandwidth.BandwidthSampleCallback
    public final void onSample(float f, float f2) {
        aeqh aeqhVar = this.a;
        if (aeqhVar.d.size() >= aeqhVar.i) {
            aeqhVar.d.removeFirst();
        }
        if (aeqhVar.e.size() >= aeqhVar.j) {
            aeqhVar.e.removeFirst();
        }
        aeqhVar.d.addLast(Float.valueOf(f));
        aeqhVar.e.addLast(Float.valueOf(f2));
        long j = aeqhVar.h + 1;
        aeqhVar.h = j;
        aeqhVar.b.c(f, f2, j, 3, aeqhVar.a);
    }
}
