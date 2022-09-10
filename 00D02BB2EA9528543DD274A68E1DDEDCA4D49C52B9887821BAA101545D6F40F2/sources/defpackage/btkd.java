package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: btkd  reason: default package */
/* loaded from: classes4.dex */
final class btkd implements aub {
    final /* synthetic */ btke a;

    public btkd(btke btkeVar) {
        this.a = btkeVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.b.i(cjqg.a(booleanValue, cjtd.a(dtyd.cp)));
        this.a.a.T(bvjk.hL, this.a.d.j(), booleanValue);
        this.a.c.b();
        return true;
    }
}
