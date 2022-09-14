package com.facebook.react.views.picker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
/* loaded from: classes.dex */
class b extends ArrayAdapter<c> {

    /* renamed from: b  reason: collision with root package name */
    private final LayoutInflater f6190b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f6191c;

    public b(Context context, List<c> list) {
        super(context, 0, list);
        Object systemService = context.getSystemService("layout_inflater");
        c.d.k.a.a.a(systemService);
        this.f6190b = (LayoutInflater) systemService;
    }

    private View a(int i, View view, ViewGroup viewGroup, boolean z) {
        int intValue;
        Integer num;
        c item = getItem(i);
        boolean z2 = false;
        if (view == null) {
            view = this.f6190b.inflate(z ? 17367049 : 17367048, viewGroup, false);
            view.setTag(((TextView) view).getTextColors());
            z2 = true;
        }
        TextView textView = (TextView) view;
        textView.setText(item.f6192a);
        if (z || (num = this.f6191c) == null) {
            Integer num2 = item.f6193b;
            if (num2 == null) {
                if (textView.getTag() != null && !z2) {
                    textView.setTextColor((ColorStateList) textView.getTag());
                }
                return textView;
            }
            intValue = num2.intValue();
        } else {
            intValue = num.intValue();
        }
        textView.setTextColor(intValue);
        return textView;
    }

    public Integer a() {
        return this.f6191c;
    }

    public void a(Integer num) {
        this.f6191c = num;
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, true);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, false);
    }
}
