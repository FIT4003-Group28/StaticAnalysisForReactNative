package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
/* compiled from: PG */
/* renamed from: gip  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gip implements zdt {
    public final /* synthetic */ giq a;
    private final /* synthetic */ int b;

    public /* synthetic */ gip(giq giqVar, int i) {
        this.b = i;
        this.a = giqVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            giq giqVar = this.a;
            giqVar.f.dismiss();
            giqVar.d.e((Throwable) obj);
            return;
        }
        giq giqVar2 = this.a;
        BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
        giqVar2.f.dismiss();
        giqVar2.c.oi().D(new acte(browseResponseModel.d()));
        arlt arltVar = browseResponseModel.a;
        if (arltVar.n.size() != 0) {
            giqVar2.e.b(arltVar.n);
        }
        if (arltVar.o.size() == 0) {
            return;
        }
        giqVar2.e.b(arltVar.o);
    }
}
