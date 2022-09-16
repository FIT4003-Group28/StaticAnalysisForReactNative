package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjt  reason: default package */
/* loaded from: classes3.dex */
final class mjt extends jo {
    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        TextView textView = (TextView) view.findViewById(R.id.title);
        mhVar.D(textView.getText());
        lj.V(textView, 2);
    }
}
