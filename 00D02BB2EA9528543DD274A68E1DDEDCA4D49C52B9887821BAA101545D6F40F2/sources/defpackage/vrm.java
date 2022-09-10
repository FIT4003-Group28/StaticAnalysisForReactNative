package defpackage;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vrm  reason: default package */
/* loaded from: classes7.dex */
public final class vrm extends BaseAdapter {
    final /* synthetic */ dcdc a;
    final /* synthetic */ Activity b;
    final /* synthetic */ boolean c;

    public vrm(dcdc dcdcVar, Activity activity, boolean z) {
        this.a = dcdcVar;
        this.b = activity;
        this.c = z;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final vqx getItem(int i) {
        return (vqx) this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, @dzsi View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            textView = (TextView) this.b.getLayoutInflater().inflate(17367049, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        vqx item = getItem(i);
        textView.setText(item.b);
        if (this.c) {
            textView.setTextAppearance(this.b, R.style.gmm_chip_text_appearance);
            textView.setTextColor(hyw.I().c(this.b));
        }
        if (vph.a(item.a)) {
            textView.setTextColor(this.b.getResources().getColor(R.color.qu_daynight_black_alpha_54));
        } else {
            textView.setTextColor(this.b.getResources().getColor(R.color.qu_daynight_grey_black_1000));
        }
        return textView;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, @dzsi View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            textView = (TextView) this.b.getLayoutInflater().inflate(17367043, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        vqx item = getItem(i);
        textView.setText(item.b);
        if (this.c) {
            textView.setTextAppearance(this.b, R.style.gmm_chip_text_appearance);
            textView.setTextColor(hyw.I().c(this.b));
            DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
            textView.setPaddingRelative(od.w(textView), (int) TypedValue.applyDimension(1, 12.0f, displayMetrics), (int) TypedValue.applyDimension(1, 30.0f, displayMetrics), (int) TypedValue.applyDimension(1, 12.0f, displayMetrics));
        } else {
            textView.setPaddingRelative(od.w(textView), textView.getPaddingTop(), (int) TypedValue.applyDimension(1, 30.0f, this.b.getResources().getDisplayMetrics()), textView.getPaddingBottom());
        }
        if (vph.a(item.a)) {
            textView.setTextColor(this.b.getResources().getColor(R.color.qu_daynight_grey_700));
        } else {
            textView.setTextColor(this.b.getResources().getColor(R.color.qu_daynight_grey_black_1000));
        }
        return textView;
    }
}
