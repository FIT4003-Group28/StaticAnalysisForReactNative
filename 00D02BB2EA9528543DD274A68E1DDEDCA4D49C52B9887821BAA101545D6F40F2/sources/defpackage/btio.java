package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: btio  reason: default package */
/* loaded from: classes4.dex */
final class btio implements aub {
    final /* synthetic */ btip a;

    public btio(btip btipVar) {
        this.a = btipVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.b.i(cjqg.a(booleanValue, cjtd.a(dtyi.aI)));
        btip btipVar = this.a;
        btipVar.a.S(bvjk.dK, !booleanValue);
        bsvn bsvnVar = btipVar.c;
        btau c = btav.c();
        c.c(true);
        ((bsvj) bsvnVar).d(dbsg.i(c.a()));
        btipVar.f();
        return true;
    }
}
