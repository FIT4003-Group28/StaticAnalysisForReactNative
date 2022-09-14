package defpackage;

import androidx.preference.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btik  reason: default package */
/* loaded from: classes4.dex */
public final class btik implements aub {
    final /* synthetic */ btil a;

    public btik(btil btilVar) {
        this.a = btilVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.a.i(cjqg.a(booleanValue, cjtd.a(dtxy.bG)));
        this.a.b.S(bvjk.cX, booleanValue);
        return true;
    }
}
