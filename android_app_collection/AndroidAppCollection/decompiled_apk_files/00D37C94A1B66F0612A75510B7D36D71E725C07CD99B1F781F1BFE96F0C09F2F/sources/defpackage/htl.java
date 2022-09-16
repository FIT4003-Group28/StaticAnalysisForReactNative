package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.videoeffects.fragment.StickerCatalogRecyclerView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: htl  reason: default package */
/* loaded from: classes3.dex */
public final class htl extends hse {
    public htf a;
    public boolean b;
    public StickerCatalogRecyclerView c;

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sticker_page_fragment, viewGroup, false);
        StickerCatalogRecyclerView stickerCatalogRecyclerView = (StickerCatalogRecyclerView) inflate.findViewById(R.id.sticker_page);
        this.c = stickerCatalogRecyclerView;
        stickerCatalogRecyclerView.ad(this.a);
        this.a.s = this;
        return inflate;
    }

    public final void o(int i) {
        this.c.W.q(i);
        htf htfVar = this.a;
        aqxo.p(i > 0);
        htfVar.u = i;
        htfVar.q.f = i - 1;
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        this.a.e.removeCallbacksAndMessages(htf.d);
    }

    public final void p(List list) {
        htk htkVar;
        htf htfVar = this.a;
        htfVar.f.clear();
        List list2 = htfVar.f;
        list.getClass();
        list2.addAll(list);
        final hvk hvkVar = htfVar.r;
        if (hvkVar.a != null) {
            final HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri b = hve.b((aunb) it.next());
                String b2 = b == null ? null : zny.b(b.getLastPathSegment());
                if (b2 != null) {
                    hashSet.add(b2);
                }
            }
            hvkVar.c.execute(new Runnable() { // from class: hvj
                @Override // java.lang.Runnable
                public final void run() {
                    hvk hvkVar2 = hvk.this;
                    hvkVar2.a.a(hashSet);
                }
            });
        }
        if (list.isEmpty() && (htkVar = htfVar.t) != null) {
            htkVar.aK(false);
        }
        this.a.mr();
        this.b = true;
    }
}
