package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ion  reason: default package */
/* loaded from: classes3.dex */
public final class ion implements ajxc {
    final /* synthetic */ iou a;

    public ion(iou iouVar) {
        this.a = iouVar;
    }

    @Override // defpackage.ajxc
    public final void a(ajga ajgaVar) {
        if (ajgaVar instanceof BrowseResponseModel) {
            BrowseResponseModel browseResponseModel = (BrowseResponseModel) ajgaVar;
            arlt arltVar = browseResponseModel.a;
            this.a.bn(arltVar);
            this.a.bk(arltVar.v);
            mas masVar = this.a.cb;
            Object obj = browseResponseModel.b;
            if (masVar == null || obj == null || !(obj instanceof aakw)) {
                return;
            }
            masVar.b(arltVar.v, ((aakw) obj).a);
        }
    }
}
