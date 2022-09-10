package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bmrn  reason: default package */
/* loaded from: classes3.dex */
final class bmrn extends cqmr<bmtv> {
    final /* synthetic */ View a;
    final /* synthetic */ bmro b;

    public bmrn(bmro bmroVar, View view) {
        this.b = bmroVar;
        this.a = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(bmtv bmtvVar, boolean z) {
        View view = this.a;
        bmro bmroVar = this.b;
        bmog.b(view, bmroVar.b.a, (bmpj) ((cqlb) bmroVar.a).a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        bmog.a(this.a);
    }
}
