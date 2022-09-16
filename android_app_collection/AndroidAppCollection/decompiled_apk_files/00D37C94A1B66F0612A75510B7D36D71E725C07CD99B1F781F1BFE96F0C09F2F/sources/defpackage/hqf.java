package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
/* compiled from: PG */
/* renamed from: hqf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hqf implements ayqe {
    public final /* synthetic */ ampr a;
    private final /* synthetic */ int b;

    public /* synthetic */ hqf(ampr amprVar, int i) {
        this.b = i;
        this.a = amprVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            hqg a = hqh.a();
            a.c((apzg) this.a.b);
            a.b((BrowseResponseModel) obj);
            a.e(true);
            a.f(false);
            a.d(false);
            return a.a();
        } else if (i == 1) {
            BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
            hqg a2 = hqh.a();
            a2.c((apzg) this.a.b);
            a2.b(browseResponseModel);
            a2.e(((Boolean) browseResponseModel.h("browse_response_enable_logging", false)).booleanValue());
            a2.f(((Boolean) browseResponseModel.h("browse_response_new_response_needed", true)).booleanValue());
            a2.d(((Boolean) browseResponseModel.h("browse_response_is_loading_response", true)).booleanValue());
            return a2.a();
        } else if (i == 2) {
            ampr amprVar = this.a;
            BrowseResponseModel browseResponseModel2 = (BrowseResponseModel) obj;
            int i2 = iou.cp;
            iok a3 = iol.a();
            a3.c((apzg) amprVar.b);
            a3.b(browseResponseModel2);
            a3.e(((Boolean) browseResponseModel2.h("browse_response_enable_logging", false)).booleanValue());
            a3.f(((Boolean) browseResponseModel2.h("browse_response_new_response_needed", true)).booleanValue());
            a3.d(((Boolean) browseResponseModel2.h("browse_response_is_loading_response", true)).booleanValue());
            return a3.a();
        } else {
            ampr amprVar2 = this.a;
            int i3 = iou.cp;
            iok a4 = iol.a();
            a4.c((apzg) amprVar2.b);
            a4.b((BrowseResponseModel) obj);
            a4.e(true);
            a4.f(false);
            a4.d(false);
            return a4.a();
        }
    }
}
