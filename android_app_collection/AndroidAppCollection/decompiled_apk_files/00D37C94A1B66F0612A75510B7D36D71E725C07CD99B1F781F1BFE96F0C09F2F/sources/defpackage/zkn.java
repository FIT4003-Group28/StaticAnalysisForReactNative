package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.libraries.youtube.edit.audioswap.model.TrackSelection;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zkn  reason: default package */
/* loaded from: classes4.dex */
public final class zkn extends zkm {
    public ajmr a;
    public TrackSelection b;
    private zkr c;

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle != null) {
            this.b = (TrackSelection) bundle.getParcelable("track_selection");
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dt mJ = mJ();
        this.c = new zkr(mJ, this.b.a(mJ()), ((zjx) mJ).b(), this.a, true);
        View inflate = layoutInflater.inflate(R.layout.audio_swap_track_selection_view, viewGroup, false);
        zkr zkrVar = this.c;
        zkrVar.getClass();
        ((GridView) inflate.findViewById(R.id.audio_swap_track_selection_view)).setAdapter((ListAdapter) zkrVar);
        return inflate;
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putParcelable("track_selection", this.b);
    }
}
