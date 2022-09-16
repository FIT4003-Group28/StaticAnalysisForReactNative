package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jdr  reason: default package */
/* loaded from: classes3.dex */
final class jdr extends ArrayAdapter {
    final /* synthetic */ jdx[] a;
    final /* synthetic */ jdy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdr(jdy jdyVar, Context context, jdx[] jdxVarArr, jdx[] jdxVarArr2) {
        super(context, (int) R.layout.dialog_chooser_item, (int) R.id.title, jdxVarArr);
        this.b = jdyVar;
        this.a = jdxVarArr2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(R.id.title);
        textView.setText(this.b.a.getString(this.a[i].a));
        textView.setTextColor(zhn.j(this.b.a, R.attr.ytTextSecondary).orElse(0));
        kz.t(textView, this.a[i].b, 0);
        textView.setCompoundDrawablePadding(zew.i(this.b.a.getResources().getDisplayMetrics(), 16));
        return view2;
    }
}
