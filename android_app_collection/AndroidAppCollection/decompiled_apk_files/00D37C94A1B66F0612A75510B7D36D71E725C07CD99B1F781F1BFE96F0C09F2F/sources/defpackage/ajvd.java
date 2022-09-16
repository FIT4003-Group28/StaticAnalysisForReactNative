package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajvd  reason: default package */
/* loaded from: classes.dex */
final class ajvd extends ArrayAdapter implements ListAdapter {
    private LayoutInflater a;
    private atui b;
    private final Map c;
    private final aken d;

    public ajvd(Context context, aken akenVar) {
        super(context, R.layout.report_form_item);
        this.c = new HashMap();
        this.d = akenVar;
    }

    public final atui a() {
        ajva ajvaVar;
        atui atuiVar = this.b;
        return (atuiVar == null || (ajvaVar = (ajva) this.c.get(atuiVar)) == null) ? this.b : ajvaVar.b(ajvaVar.a);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final void b(atui atuiVar) {
        if ((atuiVar != null || this.b == null) && (atuiVar == null || atuiVar.equals(this.b))) {
            return;
        }
        this.b = atuiVar;
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter
    public final void clear() {
        super.clear();
        this.b = null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ajvc ajvcVar;
        TextView textView;
        if (view == null) {
            if (this.a == null) {
                this.a = LayoutInflater.from(getContext());
            }
            view = this.a.inflate(R.layout.report_form_item, viewGroup, false);
        }
        atug atugVar = (atug) getItem(i);
        if (view.getTag() instanceof ajvc) {
            ajvcVar = (ajvc) view.getTag();
        } else {
            ajvcVar = new ajvc(this, view);
            view.setTag(ajvcVar);
            view.setOnClickListener(ajvcVar);
        }
        if (atugVar != null) {
            atui atuiVar = atugVar.e;
            if (atuiVar == null) {
                atuiVar = atui.a;
            }
            ajva ajvaVar = (ajva) this.c.get(atuiVar);
            arag aragVar = null;
            if (ajvaVar == null && !this.c.containsKey(atuiVar)) {
                if (atuiVar.d.size() > 0) {
                    Spinner spinner = ajvcVar.b;
                    ajvaVar = new ajva(spinner == null ? null : spinner.getContext(), atuiVar.d);
                }
                this.c.put(atuiVar, ajvaVar);
            }
            boolean equals = atuiVar.equals(this.b);
            if (atuiVar != null && (textView = ajvcVar.a) != null && ajvcVar.c != null && ajvcVar.b != null) {
                if ((atuiVar.b & 1) != 0 && (aragVar = atuiVar.c) == null) {
                    aragVar = arag.a;
                }
                textView.setText(ajgl.b(aragVar));
                ajvcVar.c.setTag(atuiVar);
                ajvcVar.c.setChecked(equals);
                boolean z = equals && ajvaVar != null;
                ajvcVar.b.setAdapter((SpinnerAdapter) ajvaVar);
                Spinner spinner2 = ajvcVar.b;
                int i2 = true != z ? 8 : 0;
                spinner2.setVisibility(i2);
                ajvcVar.d.setVisibility(i2);
                if (z) {
                    ajvcVar.b.setSelection(ajvaVar.a);
                    ajvcVar.b.setOnItemSelectedListener(new ajvb(ajvcVar, ajvaVar));
                }
            }
        }
        if (this.d.a) {
            RadioButton radioButton = (RadioButton) view.findViewById(R.id.report_form_top_level_radio);
            YouTubeTextView youTubeTextView = (YouTubeTextView) view.findViewById(R.id.report_form_top_level_text);
            aken akenVar = this.d;
            akenVar.b(radioButton);
            if (akenVar.a) {
                youTubeTextView.getClass();
                youTubeTextView.setTextColor(zhn.d(youTubeTextView.getContext(), R.attr.ytTextPrimary));
            }
            int dimension = (int) getContext().getResources().getDimension(R.dimen.report_form_item_spacing_vertical);
            zgd.t(radioButton, zgd.b(zgd.p(dimension), zgd.e(dimension)), ViewGroup.MarginLayoutParams.class);
        }
        return view;
    }
}
