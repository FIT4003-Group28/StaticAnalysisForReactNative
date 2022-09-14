package defpackage;

import android.graphics.Typeface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daav  reason: default package */
/* loaded from: classes.dex */
public final class daav extends dadf {
    final /* synthetic */ daax a;

    public daav(daax daaxVar) {
        this.a = daaxVar;
    }

    @Override // defpackage.dadf
    public final void a(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        this.a.c = true;
        daaw daawVar = this.a.d.get();
        if (daawVar == null) {
            return;
        }
        daawVar.g();
    }

    @Override // defpackage.dadf
    public final void b(int i) {
        this.a.c = true;
        daaw daawVar = this.a.d.get();
        if (daawVar != null) {
            daawVar.g();
        }
    }
}
