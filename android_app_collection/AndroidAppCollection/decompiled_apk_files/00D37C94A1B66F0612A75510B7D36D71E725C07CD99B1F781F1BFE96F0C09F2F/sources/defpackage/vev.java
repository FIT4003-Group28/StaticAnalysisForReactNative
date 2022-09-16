package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vev  reason: default package */
/* loaded from: classes4.dex */
public class vev extends ArrayAdapter {
    public vev(Context context) {
        super(context, R.layout.bottom_sheet_list_item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object a(int i, View view) {
        vex vexVar = (vex) getItem(i);
        if (vexVar instanceof vez) {
            return new vey(view);
        }
        if (vexVar instanceof vfa) {
            return null;
        }
        String valueOf = String.valueOf(vexVar.getClass().getSimpleName());
        throw new IllegalStateException(valueOf.length() != 0 ? "Unsupported item: ".concat(valueOf) : new String("Unsupported item: "));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i, Object obj) {
        vex vexVar = (vex) getItem(i);
        if (vexVar instanceof vez) {
            vez vezVar = (vez) vexVar;
            vey veyVar = (vey) obj;
            veyVar.a.setText(vezVar.c);
            TextView textView = veyVar.a;
            ColorStateList colorStateList = vezVar.d;
            if (colorStateList == null) {
                colorStateList = getContext().getResources().getColorStateList(R.color.quantum_black_text);
            }
            textView.setTextColor(colorStateList);
            Drawable drawable = vezVar.e;
            if (drawable != null) {
                veyVar.b.setImageDrawable(drawable);
                veyVar.b.setVisibility(0);
            } else {
                veyVar.b.setVisibility(8);
            }
            Drawable drawable2 = vezVar.f;
            if (drawable2 != null) {
                veyVar.c.setImageDrawable(drawable2);
                veyVar.c.setVisibility(0);
                return;
            }
            veyVar.c.setVisibility(8);
        } else if (vexVar instanceof vfa) {
        } else {
            String valueOf = String.valueOf(vexVar.getClass().getSimpleName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unsupported item: ".concat(valueOf) : new String("Unsupported item: "));
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return getItem(i) instanceof vez ? 0 : 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        vex vexVar = (vex) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(vexVar.b(), viewGroup, false);
            view.setTag(a(i, view));
        }
        b(i, view.getTag());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((vex) getItem(i)).e();
    }
}
