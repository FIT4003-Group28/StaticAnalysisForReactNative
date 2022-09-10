package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: btit  reason: default package */
/* loaded from: classes4.dex */
final class btit implements aub {
    final /* synthetic */ btiu a;

    public btit(btiu btiuVar) {
        this.a = btiuVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.c.i(cjqg.a(booleanValue, cjtd.a(dtxu.ad)));
        btiu btiuVar = this.a;
        btiuVar.b.i(booleanValue, btiuVar.d);
        return true;
    }
}
