package defpackage;

import android.view.View;
import android.widget.RadioGroup;
/* compiled from: PG */
/* renamed from: cpli  reason: default package */
/* loaded from: classes5.dex */
final class cpli implements View.OnClickListener {
    final /* synthetic */ cplj a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;

    public cpli(cplj cpljVar, int i, String str) {
        this.a = cpljVar;
        this.b = i;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.k(((RadioGroup) view.getParent()).indexOfChild(view), this.b, this.c);
    }
}
