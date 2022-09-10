package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: bcil  reason: default package */
/* loaded from: classes3.dex */
final class bcil extends cqmr<bcly> {
    @dzsi
    ViewTreeObserver.OnPreDrawListener a = null;
    final /* synthetic */ RecyclerView b;

    public bcil(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(bcly bclyVar, boolean z) {
        b(false);
        this.a = bclyVar.m(this.b);
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.a;
        dbuh.d(onPreDrawListener);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        if (this.a != null) {
            ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.a;
            dbuh.d(onPreDrawListener);
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.a = null;
        }
    }
}
