package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajva  reason: default package */
/* loaded from: classes.dex */
public final class ajva extends ArrayAdapter implements SpinnerAdapter {
    public int a;
    private LayoutInflater b;

    public ajva(Context context, List list) {
        super(context, (int) R.layout.report_form_suboption, list);
        for (int i = 0; i < list.size(); i++) {
            atui atuiVar = ((atug) list.get(i)).e;
            if ((atuiVar == null ? atui.a : atuiVar).f) {
                this.a = i;
                return;
            }
        }
    }

    public final View a(int i, View view, ViewGroup viewGroup, int i2, int i3) {
        ajuz ajuzVar;
        TextView textView;
        arag aragVar;
        if (view == null) {
            if (this.b == null) {
                this.b = LayoutInflater.from(getContext());
            }
            view = this.b.inflate(i2, viewGroup, false);
        }
        atug atugVar = (atug) getItem(i);
        if (view.getTag() instanceof ajuz) {
            ajuzVar = (ajuz) view.getTag();
        } else {
            ajuzVar = new ajuz(view, i3);
            view.setTag(ajuzVar);
        }
        if (atugVar != null) {
            atui atuiVar = atugVar.e;
            if (atuiVar == null) {
                atuiVar = atui.a;
            }
            boolean isEnabled = isEnabled(i);
            if (atuiVar != null && (textView = ajuzVar.a) != null) {
                if ((atuiVar.b & 1) != 0) {
                    aragVar = atuiVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView.setText(ajgl.b(aragVar));
                ajuzVar.a.setEnabled(isEnabled);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final atui b(int i) {
        atui atuiVar;
        atug atugVar = (atug) getItem(i);
        if (atugVar == null) {
            atuiVar = null;
        } else {
            atuiVar = atugVar.e;
            if (atuiVar == null) {
                atuiVar = atui.a;
            }
        }
        if (atuiVar == null || atuiVar.f) {
            return null;
        }
        return atuiVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.report_form_suboption, R.id.report_form_sub_option_text);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.report_form_suboption_selected, R.id.report_form_sub_option_selected_text);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return b(i) != null;
    }
}
