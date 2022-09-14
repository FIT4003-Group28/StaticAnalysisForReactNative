package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpth  reason: default package */
/* loaded from: classes4.dex */
public final class bpth extends ArrayAdapter<String> {
    private static final dcqe a = dcqe.c("bpth");

    public bpth(Context context, int i, List<String> list) {
        super(context, i, list);
    }

    private static void a(TextView textView) {
        textView.setTextAlignment(5);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, @dzsi View view, ViewGroup viewGroup) {
        if (i == 0) {
            TextView textView = new TextView(getContext());
            textView.setHeight(0);
            textView.setVisibility(8);
            return textView;
        }
        View dropDownView = super.getDropDownView(i, null, viewGroup);
        if (dropDownView instanceof TextView) {
            TextView textView2 = (TextView) dropDownView;
            a(textView2);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            bvoo.h("ArrayAdapter.getDropDownView returned unexpected type '%s' (expecting TextView).", dropDownView.getClass().getName());
        }
        return dropDownView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            a(textView);
            view2.setPadding(0, 0, 0, 0);
            if (i == 0) {
                textView.setTextColor(ibm.n().b(getContext()));
            }
        } else {
            bvoo.h("ArrayAdapter.getView returned unexpected type '%s' (expecting TextView).", view2.getClass().getName());
        }
        return view2;
    }
}
