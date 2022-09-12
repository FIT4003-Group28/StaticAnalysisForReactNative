package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: zvq  reason: default package */
/* loaded from: classes7.dex */
final class zvq extends bas {
    final /* synthetic */ zvt a;

    public zvq(zvt zvtVar) {
        this.a = zvtVar;
    }

    @Override // defpackage.bas
    public final int OV() {
        return this.a.a;
    }

    @Override // defpackage.bas
    public final boolean OW(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.bas
    public final Object c(ViewGroup viewGroup, int i) {
        ArrayList<TextView> arrayList = this.a.b;
        dbsk.s(arrayList);
        TextView textView = arrayList.get(i);
        viewGroup.addView(textView);
        return textView;
    }

    @Override // defpackage.bas
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
