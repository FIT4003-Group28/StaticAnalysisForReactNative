package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.libraries.youtube.edit.audioswap.model.CategorySelection;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zkd  reason: default package */
/* loaded from: classes4.dex */
public final class zkd extends zkl {
    public ajmr a;
    public CategorySelection b;
    private zkh c;

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle != null) {
            this.b = (CategorySelection) bundle.getParcelable("category_selection");
        }
        this.c = new zkh(mJ(), this.b.b, this.a);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.audio_swap_category_selection_view, viewGroup, false);
        zkh zkhVar = this.c;
        zkhVar.getClass();
        ((GridView) inflate.findViewById(R.id.audio_swap_category_selection_view)).setAdapter((ListAdapter) zkhVar);
        return inflate;
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putParcelable("category_selection", this.b);
    }
}
