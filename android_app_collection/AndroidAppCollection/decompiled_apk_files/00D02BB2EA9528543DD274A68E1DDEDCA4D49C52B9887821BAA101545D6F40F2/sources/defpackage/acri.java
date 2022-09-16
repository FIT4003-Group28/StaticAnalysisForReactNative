package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: acri  reason: default package */
/* loaded from: classes2.dex */
final class acri extends ArrayAdapter<String> {
    final /* synthetic */ acrk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acri(acrk acrkVar, Context context, List list) {
        super(context, (int) R.layout.spinner_open_button, list);
        this.a = acrkVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            ((TextView) view2).setTextColor(view2.getResources().getColor(true != this.a.b.h() ? R.color.qu_black_alpha_87 : R.color.qu_night_black_alpha_87));
        }
        return view2;
    }
}
