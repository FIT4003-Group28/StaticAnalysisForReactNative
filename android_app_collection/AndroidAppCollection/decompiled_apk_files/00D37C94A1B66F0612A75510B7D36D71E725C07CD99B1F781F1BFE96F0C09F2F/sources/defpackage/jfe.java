package defpackage;

import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: jfe  reason: default package */
/* loaded from: classes3.dex */
final class jfe extends yym {
    final /* synthetic */ jff a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfe(jff jffVar, ImageView imageView) {
        super(imageView, new yyq(imageView.getContext()), null);
        this.a = jffVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yym
    public final void c() {
        super.c();
        View view = this.a.i;
        view.getClass();
        view.setBackground(null);
    }
}
