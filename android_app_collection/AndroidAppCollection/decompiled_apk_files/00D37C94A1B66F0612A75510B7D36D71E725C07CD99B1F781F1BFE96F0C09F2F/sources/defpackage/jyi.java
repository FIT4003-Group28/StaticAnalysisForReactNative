package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jyi  reason: default package */
/* loaded from: classes3.dex */
final class jyi implements jxs {
    final /* synthetic */ jyk a;

    public jyi(jyk jykVar) {
        this.a = jykVar;
    }

    @Override // defpackage.jxs
    public final void a() {
        jyk jykVar = this.a;
        if (jykVar.d) {
            nw nwVar = new nw(jykVar.a, 2132083916);
            nwVar.n(R.string.varispeed_unavailable_title);
            nwVar.f(R.string.varispeed_unavailable_message);
            nwVar.k(R.string.ok, null);
            nwVar.b().show();
            return;
        }
        jykVar.c.c(jykVar.a);
    }
}
