package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: yhs  reason: default package */
/* loaded from: classes4.dex */
final class yhs implements View.OnClickListener {
    final /* synthetic */ yhw a;

    public yhs(yhw yhwVar) {
        this.a = yhwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yhw yhwVar = this.a;
        awix a = yhwVar.ar.a();
        if (a == null || yhwVar.as) {
            return;
        }
        yhwVar.aI(true);
        ybo yboVar = yhwVar.ao;
        String str = a.k;
        long d = yic.d(a);
        byte[] I = yhwVar.ap.c.I();
        abfa b = yhwVar.ai.b();
        b.u(str);
        b.b = d;
        b.k(I);
        yboVar.g(b);
    }
}
