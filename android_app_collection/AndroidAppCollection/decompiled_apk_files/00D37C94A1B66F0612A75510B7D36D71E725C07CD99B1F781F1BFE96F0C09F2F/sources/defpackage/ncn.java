package defpackage;

import android.view.View;
import android.widget.ImageView;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ncn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ncn implements View.OnClickListener {
    public final /* synthetic */ nco a;
    private final /* synthetic */ int b;

    public /* synthetic */ ncn(nco ncoVar, int i) {
        this.b = i;
        this.a = ncoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aujn aujnVar;
        aujn aujnVar2;
        int i = this.b;
        if (i == 0) {
            ncp ncpVar = this.a.j;
            aujm aujmVar = ncpVar.g;
            if (aujmVar == null || (aujmVar.b & 2048) == 0) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ncpVar.g);
            aafo aafoVar = ncpVar.e;
            apzg apzgVar = ncpVar.g.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        } else if (i != 1) {
            ncp ncpVar2 = this.a.j;
            aujm aujmVar2 = ncpVar2.g;
            if (aujmVar2 == null || (aujmVar2.b & 1024) == 0) {
                return;
            }
            aujk aujkVar = aujmVar2.j;
            if (aujkVar == null) {
                aujkVar = aujk.a;
            }
            if (aujkVar.b == 62897987) {
                aujnVar = (aujn) aujkVar.c;
            } else {
                aujnVar = aujn.a;
            }
            if ((aujnVar.b & 4) == 0) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ncpVar2.g);
            aafo aafoVar2 = ncpVar2.e;
            aujk aujkVar2 = ncpVar2.g.j;
            if (aujkVar2 == null) {
                aujkVar2 = aujk.a;
            }
            if (aujkVar2.b == 62897987) {
                aujnVar2 = (aujn) aujkVar2.c;
            } else {
                aujnVar2 = aujn.a;
            }
            apzg apzgVar2 = aujnVar2.d;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, hashMap2);
        } else {
            nco ncoVar = this.a;
            ncp ncpVar3 = ncoVar.j;
            ImageView imageView = ncoVar.f;
            aujm aujmVar3 = ncpVar3.g;
            if (aujmVar3 == null || (aujmVar3.b & 512) == 0) {
                return;
            }
            amuk a = mww.a(aujmVar3.m);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ncpVar3.g);
            ncpVar3.e.d(a, hashMap3);
            aafo aafoVar3 = ncpVar3.e;
            apzg apzgVar3 = ncpVar3.g.i;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            aujm aujmVar4 = ncpVar3.g;
            if (aujmVar4 != null && (aujmVar4.b & 2) != 0) {
                HashMap hashMap4 = new HashMap(hashMap3);
                avhn avhnVar = ncpVar3.g.c;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                hashMap4.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avhnVar);
                if (imageView != null) {
                    hashMap4.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", imageView);
                }
                hashMap3 = hashMap4;
            }
            aafoVar3.c(apzgVar3, hashMap3);
        }
    }
}
