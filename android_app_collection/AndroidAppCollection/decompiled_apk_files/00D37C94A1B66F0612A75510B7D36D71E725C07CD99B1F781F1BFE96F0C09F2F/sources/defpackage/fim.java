package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: fim  reason: default package */
/* loaded from: classes3.dex */
final class fim implements fin {
    final /* synthetic */ ImageView a;
    final /* synthetic */ azqb b;

    public fim(ImageView imageView, azqb azqbVar) {
        this.a = imageView;
        this.b = azqbVar;
    }

    @Override // defpackage.fin
    public final void a(boolean z) {
        ((zao) this.b.get()).c(z ? this.a : null);
        if (!z) {
            this.a.setImageDrawable(null);
        }
    }

    @Override // defpackage.fin
    public final void b(mcr mcrVar) {
        ImageView imageView = this.a;
        mct mctVar = mcrVar.a;
        mctVar.a.k(imageView, mctVar.b, mctVar.c);
    }
}
