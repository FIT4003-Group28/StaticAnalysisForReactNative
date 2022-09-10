package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: atcg  reason: default package */
/* loaded from: classes2.dex */
final class atcg implements View.OnLayoutChangeListener {
    final /* synthetic */ atcp a;

    public atcg(atcp atcpVar) {
        this.a = atcpVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 == i8 - i6) {
            atcp atcpVar = this.a;
            if (atcpVar.h == atcpVar.d.b()) {
                return;
            }
        }
        this.a.e();
    }
}
