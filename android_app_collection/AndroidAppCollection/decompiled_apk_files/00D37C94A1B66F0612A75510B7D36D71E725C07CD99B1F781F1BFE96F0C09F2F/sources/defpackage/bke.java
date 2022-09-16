package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: bke  reason: default package */
/* loaded from: classes2.dex */
public final class bke extends yo {
    public final Drawable t;
    public ColorStateList u;
    public boolean v;
    public boolean w;
    private final SparseArray x;

    public bke(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.x = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.t = view.getBackground();
        if (textView != null) {
            this.u = textView.getTextColors();
        }
    }

    public final View E(int i) {
        View view = (View) this.x.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.a.findViewById(i);
        if (findViewById != null) {
            this.x.put(i, findViewById);
        }
        return findViewById;
    }
}
