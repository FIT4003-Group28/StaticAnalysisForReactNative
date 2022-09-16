package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajug  reason: default package */
/* loaded from: classes.dex */
final class ajug extends ArrayAdapter {
    private final LayoutInflater a;

    public ajug(Context context, aqrd aqrdVar) {
        super(context, R.layout.legal_report_form_option_selected);
        aqrc aqrcVar;
        this.a = LayoutInflater.from(context);
        setDropDownViewResource(R.layout.legal_report_form_option);
        aopa createBuilder = aqrc.a.createBuilder();
        arag h = ajgl.h((aqrdVar.b & 1) != 0 ? aqrdVar.d : null);
        createBuilder.copyOnWrite();
        aqrc aqrcVar2 = (aqrc) createBuilder.instance;
        h.getClass();
        aqrcVar2.e = h;
        aqrcVar2.b |= 1;
        insert((aqrc) createBuilder.mo39build(), 0);
        for (aqra aqraVar : aqrdVar.c) {
            if ((aqraVar.b & 8) != 0) {
                aqrcVar = aqraVar.c;
                if (aqrcVar == null) {
                    aqrcVar = aqrc.a;
                }
            } else {
                aqrcVar = null;
            }
            add(aqrcVar);
        }
    }

    private final TextView a(int i, View view, ViewGroup viewGroup, int i2) {
        arag aragVar;
        arag aragVar2;
        if (view == null) {
            view = this.a.inflate(i2, viewGroup, false);
        }
        aqrc aqrcVar = (aqrc) super.getItem(i);
        TextView textView = (TextView) view;
        if (!isEnabled(i)) {
            if ((aqrcVar.b & 1) != 0) {
                aragVar = aqrcVar.e;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setHint(ajgl.b(aragVar));
            textView.setText((CharSequence) null);
        } else {
            if ((aqrcVar.b & 1) != 0) {
                aragVar2 = aqrcVar.e;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView.setText(ajgl.b(aragVar2));
            textView.setHint((CharSequence) null);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.legal_report_form_option);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        if (i != 0) {
            return (aqrc) super.getItem(i);
        }
        return null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.legal_report_form_option_selected);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return i != 0;
    }
}
