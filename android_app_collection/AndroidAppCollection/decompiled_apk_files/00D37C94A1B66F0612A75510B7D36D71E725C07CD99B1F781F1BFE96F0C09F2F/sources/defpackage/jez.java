package defpackage;

import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: jez  reason: default package */
/* loaded from: classes3.dex */
final class jez extends yym {
    final /* synthetic */ jfa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jez(jfa jfaVar, ImageView imageView) {
        super(imageView, new yyq(imageView.getContext()), null);
        this.a = jfaVar;
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
