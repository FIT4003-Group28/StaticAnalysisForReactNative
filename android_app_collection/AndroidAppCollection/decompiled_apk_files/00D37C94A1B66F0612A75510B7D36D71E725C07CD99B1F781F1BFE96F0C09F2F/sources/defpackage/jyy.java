package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jyy  reason: default package */
/* loaded from: classes3.dex */
final class jyy implements jxs {
    final /* synthetic */ jzb a;

    public jyy(jzb jzbVar) {
        this.a = jzbVar;
    }

    @Override // defpackage.jxs
    public final void a() {
        jzb jzbVar = this.a;
        if (jzbVar.d) {
            jzbVar.b.c(jzbVar.a);
            return;
        }
        akfg akfgVar = jzbVar.c;
        fvg d = fvl.d();
        d.e(true);
        d.k(this.a.a.getString(R.string.video_quality_unavailable_announcement));
        d.i(0);
        akfgVar.n(d.b());
    }
}
