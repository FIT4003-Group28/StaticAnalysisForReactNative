package defpackage;

import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: brke  reason: default package */
/* loaded from: classes4.dex */
final class brke implements cqfd {
    @Override // defpackage.cqfd
    public final boolean a(View view) {
        cqkp o = cqjz.o(view);
        cqjz<?> s = cqjz.s(view, jba.a);
        View view2 = s != null ? s.c : null;
        if ((view2 instanceof TextView) && (o instanceof jba)) {
            TextView textView = (TextView) view2;
            if (textView.getLineCount() > 1) {
                jba jbaVar = (jba) o;
                if (textView.getText().toString().equals(jbaVar.af())) {
                    view.setVisibility(8);
                    return true;
                }
                textView.setText(jbaVar.af());
            }
            if (((jba) o).ae().intValue() == 0) {
                view.setVisibility(8);
                return true;
            }
            view.setVisibility(0);
        }
        return true;
    }
}
