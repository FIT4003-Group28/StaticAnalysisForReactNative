package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
@Deprecated
/* renamed from: mtv  reason: default package */
/* loaded from: classes3.dex */
public final class mtv extends ArrayAdapter {
    private final int a;
    private int b;

    public mtv(Context context) {
        super(context, 17367048);
        this.b = 17367048;
        this.a = 17367048;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (view == null) {
            textView = (TextView) from.inflate(this.b, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = -2;
        textView.setLayoutParams(layoutParams);
        textView.setSingleLine(false);
        arar ararVar = (arar) getItem(i);
        if (!ararVar.c.isEmpty()) {
            textView.setText(ararVar.c);
        } else {
            textView.setText(ararVar.b);
        }
        if (ararVar.e) {
            textView.setTextColor(zhn.d(getContext(), R.attr.adText2));
        } else {
            textView.setTextColor(zhn.d(getContext(), R.attr.adText1));
        }
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (view == null) {
            textView = (TextView) from.inflate(this.a, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        textView.setSingleLine(false);
        arar ararVar = (arar) getItem(i);
        if (!ararVar.c.isEmpty()) {
            textView.setText(ararVar.c);
        } else {
            textView.setText(ararVar.b);
        }
        if (ararVar.e) {
            textView.setTextColor(zhn.d(getContext(), R.attr.adText2));
        } else {
            textView.setTextColor(zhn.d(getContext(), R.attr.adText1));
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return !((arar) getItem(i)).e;
    }

    @Override // android.widget.ArrayAdapter
    public final void setDropDownViewResource(int i) {
        super.setDropDownViewResource(i);
        this.b = i;
    }
}
