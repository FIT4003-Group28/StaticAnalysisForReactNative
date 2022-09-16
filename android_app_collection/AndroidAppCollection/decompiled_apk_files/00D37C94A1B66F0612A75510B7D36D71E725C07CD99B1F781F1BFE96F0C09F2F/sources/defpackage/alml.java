package defpackage;

import android.graphics.Typeface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alml  reason: default package */
/* loaded from: classes.dex */
public final class alml extends gt {
    final /* synthetic */ almn a;
    final /* synthetic */ almm b;

    public alml(almm almmVar, almn almnVar) {
        this.b = almmVar;
        this.a = almnVar;
    }

    @Override // defpackage.gt
    public final void a(Typeface typeface) {
        almm almmVar = this.b;
        almmVar.k = Typeface.create(typeface, almmVar.c);
        this.b.m = true;
        this.a.b(this.b.k);
    }

    @Override // defpackage.gt
    public final void e() {
        this.b.m = true;
        this.a.c();
    }
}
