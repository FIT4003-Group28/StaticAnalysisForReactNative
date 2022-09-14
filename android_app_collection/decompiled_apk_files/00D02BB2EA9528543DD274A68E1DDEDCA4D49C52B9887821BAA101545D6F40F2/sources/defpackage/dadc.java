package defpackage;

import android.graphics.Typeface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dadc  reason: default package */
/* loaded from: classes.dex */
public final class dadc extends jx {
    final /* synthetic */ dadf a;
    final /* synthetic */ dade b;

    public dadc(dade dadeVar, dadf dadfVar) {
        this.b = dadeVar;
        this.a = dadfVar;
    }

    @Override // defpackage.jx
    public final void a(Typeface typeface) {
        dade dadeVar = this.b;
        dadeVar.l = Typeface.create(typeface, dadeVar.d);
        this.b.n = true;
        this.a.a(this.b.l, false);
    }

    @Override // defpackage.jx
    public final void b(int i) {
        this.b.n = true;
        this.a.b(i);
    }
}
