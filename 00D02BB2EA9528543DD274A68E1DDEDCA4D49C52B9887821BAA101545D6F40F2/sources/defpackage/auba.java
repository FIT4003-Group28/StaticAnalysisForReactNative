package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: auba  reason: default package */
/* loaded from: classes2.dex */
final class auba implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ aubb a;

    public auba(aubb aubbVar) {
        this.a = aubbVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        auas auasVar;
        auas auasVar2;
        if (str.equals(bvjk.eS.toString()) || str.equals(bvjk.aV.toString())) {
            aubb aubbVar = this.a;
            boolean z = aubbVar.b;
            aubbVar.a();
            aubb aubbVar2 = this.a;
            boolean z2 = aubbVar2.b;
            if (z2 == z || (auasVar = aubbVar2.e) == null) {
                return;
            }
            auasVar.a(z2);
        } else if (!str.equals(bvjk.eU.toString())) {
        } else {
            aubb aubbVar3 = this.a;
            boolean z3 = aubbVar3.c;
            aubbVar3.b();
            aubb aubbVar4 = this.a;
            boolean z4 = aubbVar4.c;
            if (z4 == z3 || (auasVar2 = aubbVar4.e) == null) {
                return;
            }
            auasVar2.b(z4);
        }
    }
}
