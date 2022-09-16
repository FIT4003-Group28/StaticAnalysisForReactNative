package defpackage;

import androidx.preference.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btjk  reason: default package */
/* loaded from: classes4.dex */
public final class btjk implements aub {
    final /* synthetic */ btjl a;

    public btjk(btjl btjlVar) {
        this.a = btjlVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.c.i(cjqg.a(booleanValue, cjtd.a(dtyd.bf)));
        this.a.b.T(bvjk.gK, this.a.e.j(), !booleanValue);
        this.a.d.b();
        return true;
    }
}
