package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: kpl  reason: default package */
/* loaded from: classes3.dex */
final class kpl extends ArrayAdapter {
    final /* synthetic */ kpm a;
    private final LayoutInflater b;
    private final kpk c;
    private final ajxz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpl(kpm kpmVar, Context context, ajxz ajxzVar, List list) {
        super(context, 0);
        this.a = kpmVar;
        this.b = LayoutInflater.from(context);
        this.d = ajxzVar;
        this.c = new kpk(kpmVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            add((aqrc) it.next());
        }
    }

    private final void a(View view, int i) {
        aqrc aqrcVar = (aqrc) getItem(i);
        if (view.findViewById(R.id.label) != null) {
            TextView textView = (TextView) view.findViewById(R.id.label);
            arag aragVar = aqrcVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            zag.m(textView, ajgl.b(aragVar));
        }
        if (view.findViewById(R.id.description) != null) {
            TextView textView2 = (TextView) view.findViewById(R.id.description);
            arag aragVar2 = aqrcVar.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            zag.m(textView2, ajgl.b(aragVar2));
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        if (imageView != null) {
            ajxz ajxzVar = this.d;
            arhs arhsVar = aqrcVar.k;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            int a = ajxzVar.a(b);
            if (a == 0) {
                imageView.setImageDrawable(null);
            } else {
                imageView.setImageResource(a);
            }
        }
        view.setTag(aqrcVar);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(R.layout.privacy_dropdown, (ViewGroup) null);
        }
        a(view, i);
        lj.M(view, this.c);
        if (this.a.b.getSelectedItem().equals(view.getTag())) {
            view.findViewById(R.id.inner_item_container).setBackgroundColor(zhn.d(getContext(), R.attr.yt10PercentLayer));
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(R.layout.privacy_item, (ViewGroup) null);
        }
        a(view, i);
        return view;
    }
}
