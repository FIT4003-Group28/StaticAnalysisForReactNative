package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nje  reason: default package */
/* loaded from: classes3.dex */
public final class nje extends njm implements AdapterView.OnItemClickListener, jxq {
    private aalv[] ae;
    private int af;
    private ahxy ag;

    @Override // defpackage.jxq
    public final void a(ahxy ahxyVar) {
        this.ag = ahxyVar;
    }

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        akav akavVar = new akav(mJ());
        if (this.ae != null) {
            int i = 0;
            while (i < this.ae.length) {
                njh njhVar = new njh(mJ(), this.ae[i]);
                njhVar.a(i == this.af);
                akavVar.add(njhVar);
                i++;
            }
        }
        return akavVar;
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return rh().getString(R.string.audio_tracks_title);
    }

    @Override // defpackage.jxq
    public final void b(aalv[] aalvVarArr, int i) {
        if (this.ae == aalvVarArr && this.af == i) {
            return;
        }
        this.ae = aalvVarArr;
        this.af = i;
        ListAdapter listAdapter = this.aC;
        if (listAdapter == null) {
            return;
        }
        ((akav) listAdapter).notifyDataSetChanged();
    }

    @Override // defpackage.jxq
    public final void c(dt dtVar) {
        if (ap() || at()) {
            return;
        }
        qv(dtVar.getSupportFragmentManager(), "AUDIO_TRACKS_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.vew, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mc = super.mc(layoutInflater, viewGroup, bundle);
        if (mc != null) {
            View findViewById = mc.findViewById(R.id.bottom_sheet_title);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setTextColor(zhn.d(layoutInflater.getContext(), R.attr.ytTextPrimary));
            }
        }
        return mc;
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ahxy ahxyVar = this.ag;
        String str = ((njh) ((akav) this.aC).getItem(i)).a.a;
        ajah ajahVar = ((ahyd) ahxyVar).a.q.a;
        if (ajahVar != null) {
            ajahVar.O(str);
        }
        dismiss();
    }
}
