package defpackage;

import android.view.View;
import android.widget.TextView;
/* renamed from: bhfr  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhfr implements cqfd {
    static final cqfd a = new bhfr();

    private bhfr() {
    }

    @Override // defpackage.cqfd
    public final boolean a(View view) {
        cqkp o = cqjz.o(view);
        cqjz<?> s = cqjz.s(view, bhfs.a);
        View view2 = s != null ? s.c : null;
        if ((view2 instanceof TextView) && (o instanceof bhiq) && ((TextView) view2).getLineCount() > 1) {
            ((bhiq) o).e();
        }
        return true;
    }
}
