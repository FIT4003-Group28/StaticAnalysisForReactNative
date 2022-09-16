package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkQualityRttListener;
/* compiled from: PG */
/* renamed from: bufo  reason: default package */
/* loaded from: classes.dex */
final class bufo extends NetworkQualityRttListener {
    final /* synthetic */ ExperimentalCronetEngine a;
    final /* synthetic */ bufr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bufo(bufr bufrVar, Executor executor, ExperimentalCronetEngine experimentalCronetEngine) {
        super(executor);
        this.b = bufrVar;
        this.a = experimentalCronetEngine;
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final void onRttObservation(int i, long j, int i2) {
        this.b.c.d(this.a.getEffectiveConnectionType());
    }
}
