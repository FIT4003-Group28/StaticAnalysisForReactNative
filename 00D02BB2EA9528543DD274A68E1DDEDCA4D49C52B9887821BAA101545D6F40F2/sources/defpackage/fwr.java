package defpackage;

import com.google.android.apps.gmm.ugc.phototaken.PhotoTakenObserverService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fwr  reason: default package */
/* loaded from: classes6.dex */
public final class fwr implements dxir {
    final /* synthetic */ fyu a;

    public fwr(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        PhotoTakenObserverService photoTakenObserverService = (PhotoTakenObserverService) obj;
        return new fwt(this.a);
    }
}
