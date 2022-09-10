package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: btje  reason: default package */
/* loaded from: classes4.dex */
final class btje implements auc {
    final /* synthetic */ btjf a;

    public btje(btjf btjfVar) {
        this.a = btjfVar;
    }

    @Override // defpackage.auc
    public final boolean a(Preference preference) {
        btjf btjfVar = this.a;
        btjfVar.c.i(cjqg.a(!btjfVar.d, cjtd.a(dtyi.bP)));
        btjf btjfVar2 = this.a;
        if (btjfVar2.d) {
            btjfVar2.b.i();
        } else {
            btjfVar2.a.f(true, new btjd(this));
        }
        return true;
    }
}
