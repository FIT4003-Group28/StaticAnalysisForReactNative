package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
/* compiled from: PG */
/* renamed from: cvyl  reason: default package */
/* loaded from: classes.dex */
public final class cvyl implements View.OnAttachStateChangeListener {
    final /* synthetic */ cvyo a;

    public cvyl(cvyo cvyoVar) {
        this.a = cvyoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a.a().h(this.a.c);
        cvyo cvyoVar = this.a;
        SelectedAccountDisc<T> selectedAccountDisc = cvyoVar.b;
        selectedAccountDisc.b.i(cvyoVar.e);
        if (this.a.a.g().a()) {
            this.a.a.g().b().b(this.a.d);
        }
        this.a.a();
        cvyo cvyoVar2 = this.a;
        boolean z = false;
        if (cvyoVar2.a.g().a() && this.a.a.g().b().a) {
            z = true;
        }
        cvyoVar2.c(z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a.a.g().a()) {
            this.a.a.g().b().c(this.a.d);
        }
        this.a.a.a().j(this.a.c);
        cvyo cvyoVar = this.a;
        SelectedAccountDisc<T> selectedAccountDisc = cvyoVar.b;
        selectedAccountDisc.b.j(cvyoVar.e);
    }
}
