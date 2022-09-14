package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aakm  reason: default package */
/* loaded from: classes2.dex */
final class aakm extends cqmr<aazp> {
    final /* synthetic */ View a;

    public aakm(View view) {
        this.a = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(aazp aazpVar, boolean z) {
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new aako(aazpVar, this.a));
    }
}
