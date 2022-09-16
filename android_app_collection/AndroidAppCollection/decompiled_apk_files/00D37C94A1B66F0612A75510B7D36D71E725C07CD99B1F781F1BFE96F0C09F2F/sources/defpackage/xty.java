package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: xty  reason: default package */
/* loaded from: classes4.dex */
public final class xty extends BaseAdapter {
    public aqrg a;
    public boolean b;
    private final LayoutInflater c;
    private final ajxz d;
    private final Context e;
    private final int f;
    private final List g = new ArrayList();

    public xty(Context context, ajxz ajxzVar) {
        this.c = LayoutInflater.from(context);
        this.d = ajxzVar;
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.post_dialog_filter_top_bottom_padding);
        this.e = context;
    }

    private final View c(int i, View view, ViewGroup viewGroup, boolean z) {
        xtx xtxVar;
        int i2;
        aqrg item = getItem(i);
        int i3 = 0;
        if (view == null) {
            xtxVar = new xtx(this.c.inflate(R.layout.backstage_access_restriction_item, viewGroup, false), this.e, this.b);
            xtxVar.a.setTag(xtxVar);
        } else {
            xtxVar = (xtx) view.getTag();
        }
        boolean z2 = (item.b & 2) != 0;
        if (z2) {
            ImageView imageView = xtxVar.d;
            ajxz ajxzVar = this.d;
            arhs arhsVar = item.f;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(ajxzVar.a(b));
            xtxVar.d.setColorFilter(zhn.j(this.e, R.attr.ytTextSecondary).orElse(0));
            ImageView imageView2 = xtxVar.d;
            arag aragVar = item.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            imageView2.setContentDescription(ajgl.b(aragVar));
        }
        zag.o(xtxVar.d, z2);
        YouTubeTextView youTubeTextView = xtxVar.c;
        arag aragVar2 = item.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        youTubeTextView.setText(ajgl.b(aragVar2));
        if (z) {
            xtxVar.b.setBackgroundColor(item.equals(this.a) ? ake.d(this.e, R.color.quantum_grey300) : 0);
            View view2 = xtxVar.a;
            int paddingLeft = view2.getPaddingLeft();
            if (i == 0) {
                i2 = this.f;
                i = 0;
            } else {
                i2 = 0;
            }
            int paddingRight = xtxVar.a.getPaddingRight();
            if (i == getCount() - 1) {
                i3 = this.f;
            }
            view2.setPadding(paddingLeft, i2, paddingRight, i3);
        } else {
            View view3 = xtxVar.b;
            view3.setPadding(this.b ? 0 : view3.getPaddingLeft(), 0, this.b ? 0 : xtxVar.b.getPaddingRight(), 0);
        }
        return xtxVar.a;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final aqrg getItem(int i) {
        return (aqrg) this.g.get(i);
    }

    public final void b(List list) {
        this.g.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqrg aqrgVar = ((aqra) it.next()).d;
            if (aqrgVar == null) {
                aqrgVar = aqrg.a;
            }
            this.g.add(aqrgVar);
            if (aqrgVar.h) {
                this.a = aqrgVar;
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return c(i, view, viewGroup, true);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return c(i, view, viewGroup, false);
    }
}
