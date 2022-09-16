package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahcw  reason: default package */
/* loaded from: classes.dex */
public class ahcw extends ArrayAdapter {
    public final ListView b;

    public ahcw(Context context, ListView listView) {
        super(context, 0);
        this.b = listView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        agqb agqbVar = (agqb) getItem(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (view == null) {
            view = from.inflate(R.layout.offline_stream_quality_option, viewGroup, false);
        }
        ahcv ahcvVar = (ahcv) view.getTag();
        if (ahcvVar == null) {
            ahcvVar = new ahcv(view);
            view.setTag(ahcvVar);
        }
        if (agqbVar == null) {
            ahcvVar.b.setVisibility(8);
        } else {
            ahcvVar.a.setText(agqbVar.b);
            Spanned spanned = agqbVar.c;
            if (spanned == null) {
                ahcvVar.b.setVisibility(8);
            } else {
                ahcvVar.b.setText(spanned);
                ahcvVar.b.setVisibility(0);
            }
        }
        return view;
    }
}
