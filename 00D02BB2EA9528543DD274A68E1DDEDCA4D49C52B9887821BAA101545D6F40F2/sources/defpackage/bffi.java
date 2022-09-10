package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bffi  reason: default package */
/* loaded from: classes3.dex */
final class bffi implements cqfd {
    @Override // defpackage.cqfd
    public final boolean a(View view) {
        cqkp o = cqjz.o(view);
        if ((view instanceof TextView) && (o instanceof bfgt)) {
            TextView textView = (TextView) view;
            if (textView.getLineCount() > 1) {
                textView.setText(view.getContext().getString(R.string.PERSONAL_SCORE_SHORT, ((bfgt) o).W()));
                textView.setMaxLines(1);
            }
        }
        return true;
    }
}
