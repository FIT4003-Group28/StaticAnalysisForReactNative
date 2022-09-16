package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
/* compiled from: PG */
/* renamed from: ncx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ncx implements View.OnClickListener {
    public final /* synthetic */ ncy a;
    private final /* synthetic */ int b;

    public /* synthetic */ ncx(ncy ncyVar) {
        this.a = ncyVar;
    }

    public /* synthetic */ ncx(ncy ncyVar, int i) {
        this.b = i;
        this.a = ncyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            ncy ncyVar = this.a;
            apdr apdrVar = ncyVar.f;
            if ((apdrVar.b & 16) == 0) {
                return;
            }
            aafo aafoVar = ncyVar.b;
            apzg apzgVar = apdrVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
            ncyVar.e.a.H(3, ncyVar.j, null);
        } else if (i == 1) {
            ncy ncyVar2 = this.a;
            ncyVar2.d.goBack();
            ncyVar2.e.a.H(3, ncyVar2.i, null);
        } else {
            ncy ncyVar3 = this.a;
            aopa createBuilder = avvk.a.createBuilder();
            String url = ncyVar3.d.getUrl();
            createBuilder.copyOnWrite();
            avvk avvkVar = (avvk) createBuilder.instance;
            url.getClass();
            avvkVar.b = 1 | avvkVar.b;
            avvkVar.c = url;
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(UrlEndpointOuterClass.urlEndpoint, (avvk) createBuilder.mo39build());
            ncyVar3.b.a((apzg) aopcVar.mo39build());
            ncyVar3.e.a.H(3, ncyVar3.h, null);
        }
    }
}
