package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: ghi  reason: default package */
/* loaded from: classes6.dex */
final class ghi implements bbc {
    @Override // defpackage.bbc
    public final void a(View view, float f) {
        Context context = view.getContext();
        view.setTranslationY(cqrp.d(35.0d).a(context) * ((float) Math.pow((ghj.c(context) / view.getWidth()) - f, 2.0d)));
    }
}
