package defpackage;

import com.google.android.apps.gmm.transit.go.service.TransitTripService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fym  reason: default package */
/* loaded from: classes6.dex */
public final class fym implements dxir {
    final /* synthetic */ fyu a;

    public fym(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        return new fyr(this.a, (TransitTripService) obj);
    }
}
