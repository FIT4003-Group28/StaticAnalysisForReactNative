package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: btkk  reason: default package */
/* loaded from: classes4.dex */
final class btkk implements aub {
    final /* synthetic */ btkl a;

    public btkk(btkl btklVar) {
        this.a = btklVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.b.i(cjqg.a(booleanValue, cjtd.a(dtyi.bn)));
        this.a.a.S(bvjk.dL, !booleanValue);
        this.a.c.b();
        return true;
    }
}
