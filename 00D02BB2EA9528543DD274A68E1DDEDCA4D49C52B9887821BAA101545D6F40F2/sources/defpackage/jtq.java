package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: jtq  reason: default package */
/* loaded from: classes7.dex */
final class jtq implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ jtu a;

    public jtq(jtu jtuVar) {
        this.a = jtuVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (bvjk.gk.toString().equals(str)) {
            this.a.as.a();
            jtz jtzVar = this.a.ae;
            dbsk.s(jtzVar);
            jtzVar.setNightMode(this.a.u.b());
        }
    }
}
