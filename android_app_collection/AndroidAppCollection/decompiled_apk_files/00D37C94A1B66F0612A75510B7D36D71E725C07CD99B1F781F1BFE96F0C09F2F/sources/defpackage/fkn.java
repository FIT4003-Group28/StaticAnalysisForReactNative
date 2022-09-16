package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: fkn  reason: default package */
/* loaded from: classes3.dex */
final class fkn extends BaseAdapter {
    final /* synthetic */ fkp e;
    public int d = 1;
    public final ArrayList a = new ArrayList();
    public final SparseArray b = new SparseArray();
    public final ArrayList c = new ArrayList();

    public fkn(fkp fkpVar) {
        this.e = fkpVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((fkl) this.c.get(i)).a.intValue();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        fkm fkmVar;
        fkl fklVar = (fkl) this.c.get(i);
        if (fklVar == null) {
            return null;
        }
        if (view == null) {
            view = this.e.b.inflate(R.layout.contextual_menu_item_layout, viewGroup, false);
            fkmVar = new fkm(view);
            view.setTag(fkmVar);
        } else {
            fkmVar = (fkm) view.getTag();
        }
        if (fkmVar.a != null) {
            String str = fklVar.b.a;
            if (!TextUtils.isEmpty(str)) {
                fkmVar.a.setText(str);
                fkmVar.a.setVisibility(0);
            } else {
                fkmVar.a.setText((CharSequence) null);
                fkmVar.a.setVisibility(8);
            }
        }
        ImageView imageView = fkmVar.b;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            fkmVar.b.setVisibility(8);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.c.clear();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fkl fklVar = (fkl) arrayList.get(i);
            fkk fkkVar = fklVar.b;
            this.c.add(fklVar);
        }
        super.notifyDataSetChanged();
    }
}
