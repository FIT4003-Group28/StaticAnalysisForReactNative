package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rmh  reason: default package */
/* loaded from: classes7.dex */
public final class rmh implements View.OnLayoutChangeListener {
    final /* synthetic */ rmi a;

    public rmh(rmi rmiVar) {
        this.a = rmiVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View a = cqhu.a(this.a.e, rxy.a);
        dbsk.s(a);
        View view2 = this.a.f;
        view2.setPadding(view2.getPaddingLeft(), this.a.f.getPaddingTop(), this.a.f.getPaddingRight(), this.a.e.getHeight() - a.getHeight());
    }
}
