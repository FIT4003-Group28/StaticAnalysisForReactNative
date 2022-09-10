package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auu  reason: default package */
/* loaded from: classes2.dex */
public final class auu implements auc {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ auw b;

    public auu(auw auwVar, PreferenceGroup preferenceGroup) {
        this.b = auwVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.auc
    public final boolean a(Preference preference) {
        this.a.m(Integer.MAX_VALUE);
        this.b.a();
        return true;
    }
}
