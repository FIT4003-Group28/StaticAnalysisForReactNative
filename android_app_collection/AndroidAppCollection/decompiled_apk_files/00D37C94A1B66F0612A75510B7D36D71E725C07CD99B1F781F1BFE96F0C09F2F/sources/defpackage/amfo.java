package defpackage;

import com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture;
/* compiled from: PG */
/* renamed from: amfo  reason: default package */
/* loaded from: classes.dex */
public final class amfo implements ankb {
    final /* synthetic */ ParcelableFuture a;

    public amfo(ParcelableFuture parcelableFuture) {
        this.a = parcelableFuture;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        ParcelableFuture parcelableFuture = this.a;
        parcelableFuture.e = th;
        parcelableFuture.b = true;
        parcelableFuture.a();
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        ParcelableFuture parcelableFuture = this.a;
        parcelableFuture.d = obj;
        parcelableFuture.b = true;
        parcelableFuture.a();
    }
}
