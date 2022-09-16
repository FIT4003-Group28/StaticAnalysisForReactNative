package defpackage;

import com.google.android.apps.gmm.ugc.phototaken.PhotoTakenNotifierService;
/* compiled from: PG */
/* renamed from: cdgc  reason: default package */
/* loaded from: classes4.dex */
public final class cdgc implements cdgi {
    final /* synthetic */ PhotoTakenNotifierService a;

    public cdgc(PhotoTakenNotifierService photoTakenNotifierService) {
        this.a = photoTakenNotifierService;
    }

    @Override // defpackage.cdgi
    public final void a(long j) {
        PhotoTakenNotifierService photoTakenNotifierService = this.a;
        photoTakenNotifierService.j.set(0, j, photoTakenNotifierService.a(PhotoTakenNotifierService.b));
    }

    @Override // defpackage.cdgi
    public final void b() {
        PhotoTakenNotifierService photoTakenNotifierService = this.a;
        photoTakenNotifierService.j.cancel(photoTakenNotifierService.a(PhotoTakenNotifierService.b));
    }
}
