package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dadd  reason: default package */
/* loaded from: classes.dex */
public final class dadd extends dadf {
    final /* synthetic */ TextPaint a;
    final /* synthetic */ dadf b;
    final /* synthetic */ dade c;

    public dadd(dade dadeVar, TextPaint textPaint, dadf dadfVar) {
        this.c = dadeVar;
        this.a = textPaint;
        this.b = dadfVar;
    }

    @Override // defpackage.dadf
    public final void a(Typeface typeface, boolean z) {
        this.c.f(this.a, typeface);
        this.b.a(typeface, z);
    }

    @Override // defpackage.dadf
    public final void b(int i) {
        this.b.b(i);
    }
}
