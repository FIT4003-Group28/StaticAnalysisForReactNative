package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: gej  reason: default package */
/* loaded from: classes3.dex */
public final class gej extends BaseAdapter {
    final /* synthetic */ PrivacySpinner b;
    private final geh c = new geh(this);
    public final List a = Arrays.asList(ghi.values());

    public gej(PrivacySpinner privacySpinner) {
        this.b = privacySpinner;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        geg gegVar;
        if (view == null) {
            view = this.b.a.inflate(R.layout.privacy_dropdown, (ViewGroup) null);
            gegVar = new geg(this, view);
            view.setTag(gegVar);
        } else {
            gegVar = (geg) view.getTag();
        }
        lj.M(view, this.c);
        gegVar.a(i);
        return view;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        gei geiVar;
        if (view == null) {
            view = this.b.a.inflate(R.layout.privacy_item, (ViewGroup) null);
            geiVar = new gei(this, view);
            view.setTag(geiVar);
        } else {
            geiVar = (gei) view.getTag();
        }
        geiVar.a(i);
        return view;
    }
}
