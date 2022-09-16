package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import com.google.vr.sdk.base.HeadsetSelector;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahsv  reason: default package */
/* loaded from: classes.dex */
public final class ahsv extends ahsd implements AdapterView.OnItemClickListener {
    public static final String ae = "ahsv";
    public yve af;
    public ahst ag;

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        return new akav(mJ());
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return N(R.string.vr_pick_different_viewer_title);
    }

    @Override // defpackage.akas, defpackage.vew, defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        Context rb = rb();
        List<HeadsetSelector.HeadsetInfo> b = ahsp.b(rb, this.af);
        aqxo.p(b.size() >= 2);
        HeadsetSelector.HeadsetInfo a = ahsp.a(rb, this.af);
        akav akavVar = (akav) this.aC;
        akavVar.clear();
        for (HeadsetSelector.HeadsetInfo headsetInfo : b) {
            ahsa ahsaVar = new ahsa(rb, headsetInfo);
            ahsaVar.a(headsetInfo.equals(a));
            akavVar.add(ahsaVar);
        }
        akavVar.notifyDataSetChanged();
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ahsp.f(rb(), this.af, ((ahsa) ((akav) this.aC).getItem(i)).a);
        ahst ahstVar = this.ag;
        if (ahstVar != null) {
            ahstVar.b();
        }
        dismiss();
    }
}
