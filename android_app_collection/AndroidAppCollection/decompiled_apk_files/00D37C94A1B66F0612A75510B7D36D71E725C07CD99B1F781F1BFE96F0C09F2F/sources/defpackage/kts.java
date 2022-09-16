package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: kts  reason: default package */
/* loaded from: classes3.dex */
public final class kts extends xo {
    public final ArrayList d = new ArrayList();
    private final View.OnClickListener e;
    private final ColorStateList f;
    private final ColorStateList g;

    public kts(View.OnClickListener onClickListener, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.e = onClickListener;
        colorStateList.getClass();
        this.f = colorStateList;
        colorStateList2.getClass();
        this.g = colorStateList2;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.navigation_dropdown_item_layout, viewGroup, false);
        wcc wccVar = new wcc(inflate);
        inflate.setTag(wccVar);
        inflate.setOnClickListener(this.e);
        return wccVar;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        arag aragVar;
        wcc wccVar = (wcc) yoVar;
        aqrf aqrfVar = (aqrf) this.d.get(i);
        int i2 = wcc.u;
        TextView textView = wccVar.t;
        if ((aqrfVar.b & 1) != 0) {
            aragVar = aqrfVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        wccVar.t.setTextColor(aqrfVar.f ? this.f : this.g);
    }
}
