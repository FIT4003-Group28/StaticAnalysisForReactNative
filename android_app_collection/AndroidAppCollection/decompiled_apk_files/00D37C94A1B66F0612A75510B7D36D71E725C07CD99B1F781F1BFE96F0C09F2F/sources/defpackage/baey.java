package defpackage;

import org.chromium.net.RequestFinishedInfo;
/* compiled from: PG */
/* renamed from: baey  reason: default package */
/* loaded from: classes2.dex */
public final class baey implements Runnable {
    final /* synthetic */ bagv a;
    final /* synthetic */ RequestFinishedInfo b;

    public baey(bagv bagvVar, RequestFinishedInfo requestFinishedInfo) {
        this.a = bagvVar;
        this.b = requestFinishedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onRequestFinished(this.b);
    }
}
