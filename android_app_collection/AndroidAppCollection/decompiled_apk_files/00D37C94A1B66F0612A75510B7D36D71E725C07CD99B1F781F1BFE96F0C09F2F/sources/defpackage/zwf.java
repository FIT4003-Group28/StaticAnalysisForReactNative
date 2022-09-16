package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zwf  reason: default package */
/* loaded from: classes4.dex */
public final class zwf extends zwg {
    final aypf a = new aypf();
    public zwj b;

    @Override // defpackage.dp
    public final void U() {
        super.U();
        if (!this.a.b) {
            this.a.qr();
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.album_list_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.album_list_recycler_view);
        rb();
        recyclerView.ag(new LinearLayoutManager(1));
        final zvx zvxVar = new zvx(rb(), this.b);
        recyclerView.ad(zvxVar);
        this.a.d(this.b.d.R().as(new ayqb() { // from class: zwe
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                zvx zvxVar2 = zvx.this;
                zvxVar2.e.clear();
                zvxVar2.e.addAll((amuk) obj);
                zvxVar2.f = false;
                zvxVar2.g = false;
                for (int i = 0; i < zvxVar2.b(); i++) {
                    zvs zvsVar = ((zvu) zvxVar2.e.get(i)).a;
                    if (zvsVar == zvs.IMAGE) {
                        zvxVar2.f = true;
                    } else if (zvsVar == zvs.VIDEO) {
                        zvxVar2.g = true;
                    }
                }
                zvxVar2.mr();
            }
        }));
        this.a.d(this.b.a().as(new zwd((TextView) inflate.findViewById(R.id.album_list_header_selected_album))));
        return inflate;
    }
}
