package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akkz  reason: default package */
/* loaded from: classes.dex */
public final class akkz implements View.OnClickListener {
    final /* synthetic */ akfl a;
    private final /* synthetic */ int b;

    public akkz(akfl akflVar) {
        this.a = akflVar;
    }

    public /* synthetic */ akkz(akfl akflVar, int i) {
        this.b = i;
        this.a = akflVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.b();
        } else {
            this.a.b();
        }
    }
}
