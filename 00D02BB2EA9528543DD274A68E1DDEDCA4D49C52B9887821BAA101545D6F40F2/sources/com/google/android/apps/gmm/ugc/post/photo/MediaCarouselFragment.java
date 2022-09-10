package com.google.android.apps.gmm.ugc.post.photo;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gmm.ugc.post.photo.MediaData;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MediaCarouselFragment extends cdvg<cdxx> {
    public cdwu a;
    private RecyclerView b;

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.mediaCarousel);
        this.b = recyclerView;
        dbsk.s(recyclerView);
        recyclerView.setLayoutManager(new aag(1, false));
        RecyclerView recyclerView2 = this.b;
        cdwu cdwuVar = this.a;
        dbsk.s(cdwuVar);
        recyclerView2.setAdapter(cdwuVar);
        this.b.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = this.b;
        abn abnVar = recyclerView3.C;
        if (abnVar instanceof adw) {
            ((adw) abnVar).z();
        } else {
            recyclerView3.setItemAnimator(null);
        }
    }

    @Override // defpackage.cdvg
    protected final Class<cdxx> g() {
        return cdxx.class;
    }

    @Override // defpackage.cdvg
    protected final int i() {
        return R.layout.photo_posts_media_carousel;
    }

    @Override // defpackage.cdvg, defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        cdxx w = w();
        cdwu cdwuVar = this.a;
        dbsk.s(cdwuVar);
        w.getClass();
        cdwuVar.f = new cdwv(w);
        v<dcdc<MediaData>> vVar = w.g;
        final cdwu cdwuVar2 = this.a;
        cdwuVar2.getClass();
        vVar.b(this, new aa(cdwuVar2) { // from class: cdww
            private final cdwu a;

            {
                this.a = cdwuVar2;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cdwu cdwuVar3 = this.a;
                dcdc dcdcVar = (dcdc) obj;
                dccx F = dcdc.F();
                for (int i = 0; i < dcdcVar.size(); i++) {
                    F.g(new cdup((MediaData) dcdcVar.get(i), i));
                }
                cdwuVar3.a = F.f();
                dccx F2 = dcdc.F();
                F2.i(dcbg.b(cdwuVar3.a).s(cdws.a).z());
                dcdc<cdxd> dcdcVar2 = cdwuVar3.e;
                dcdc<cdxd> f = F2.f();
                cdwuVar3.e = f;
                tx.a(new cdxg(dcdcVar2, f)).a(cdwuVar3);
            }
        });
    }
}
