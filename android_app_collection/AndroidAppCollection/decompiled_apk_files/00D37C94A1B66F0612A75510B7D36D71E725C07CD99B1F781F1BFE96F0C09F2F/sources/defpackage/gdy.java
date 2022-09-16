package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gdy  reason: default package */
/* loaded from: classes3.dex */
final class gdy implements afzf {
    final /* synthetic */ String a;
    final /* synthetic */ gea b;

    public gdy(gea geaVar, String str) {
        this.b = geaVar;
        this.a = str;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.c.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asba asbaVar = (asba) obj;
        this.b.d.f(new gds(this.a));
        zag.q(this.b.a, R.string.delete_playlist_done, 1);
    }
}
