package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lai  reason: default package */
/* loaded from: classes3.dex */
final class lai implements View.OnClickListener {
    final /* synthetic */ apzg a;
    final /* synthetic */ laj b;
    private final /* synthetic */ int c;

    public lai(laj lajVar, apzg apzgVar) {
        this.b = lajVar;
        this.a = apzgVar;
    }

    public lai(laj lajVar, apzg apzgVar, int i) {
        this.c = i;
        this.b = lajVar;
        this.a = apzgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c != 0) {
            this.b.a.c(this.a, null);
            return;
        }
        apzg apzgVar = this.a;
        if (apzgVar == null) {
            return;
        }
        this.b.a.c(apzgVar, null);
    }
}
