package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
/* compiled from: PG */
/* renamed from: bju  reason: default package */
/* loaded from: classes2.dex */
final class bju implements bjg {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ bjw b;

    public bju(bjw bjwVar, PreferenceGroup preferenceGroup) {
        this.b = bjwVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.bjg
    public final boolean b(Preference preference) {
        this.a.ac(Integer.MAX_VALUE);
        this.b.a();
        return true;
    }
}
