package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcdb  reason: default package */
/* loaded from: classes3.dex */
final class bcdb extends cqmr<bcdf> {
    final /* synthetic */ View a;

    public bcdb(View view) {
        this.a = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(bcdf bcdfVar, boolean z) {
        if (this.a.getLayoutParams() != null) {
            this.a.getLayoutParams().width = -2;
            this.a.getLayoutParams().height = -2;
            this.a.requestLayout();
        }
    }
}
