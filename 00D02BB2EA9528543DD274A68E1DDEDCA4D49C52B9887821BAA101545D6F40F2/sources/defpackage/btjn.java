package defpackage;

import androidx.preference.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btjn  reason: default package */
/* loaded from: classes4.dex */
public final class btjn implements aub {
    final /* synthetic */ btjo a;

    public btjn(btjo btjoVar) {
        this.a = btjoVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.a.i(cjqg.a(booleanValue, cjtd.a(dtxy.bH)));
        this.a.b.i(booleanValue);
        return true;
    }
}
