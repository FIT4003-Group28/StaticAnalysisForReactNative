package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: muo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class muo implements View.OnClickListener {
    public final /* synthetic */ muu a;
    private final /* synthetic */ int b;

    public /* synthetic */ muo(muu muuVar) {
        this.a = muuVar;
    }

    public /* synthetic */ muo(muu muuVar, int i) {
        this.b = i;
        this.a = muuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            muu muuVar = this.a;
            View view2 = new muz(muuVar.a, new muq(muuVar)).c;
            nw nwVar = new nw(muuVar.a);
            nwVar.p(view2);
            nwVar.k(R.string.cancel, null);
            muuVar.j = nwVar.b();
            muuVar.j.show();
            return;
        }
        this.a.j();
    }
}
