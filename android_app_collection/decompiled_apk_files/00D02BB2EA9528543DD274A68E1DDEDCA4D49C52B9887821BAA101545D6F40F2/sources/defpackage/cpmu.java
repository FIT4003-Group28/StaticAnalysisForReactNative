package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpmu  reason: default package */
/* loaded from: classes5.dex */
public final class cpmu extends BaseAdapter implements Filterable {
    List<cpnc> a = new ArrayList();
    public final cpmx b;
    private final Context c;

    public cpmu(Context context, cpmx cpmxVar) {
        this.c = context;
        this.b = cpmxVar;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final cpnc getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new cpmt(this);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.autocomplete_drop_down, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.autocomplete_text_main)).setText(getItem(i).a());
        ((TextView) view.findViewById(R.id.autocomplete_text_detail)).setText(getItem(i).b());
        return view;
    }
}
