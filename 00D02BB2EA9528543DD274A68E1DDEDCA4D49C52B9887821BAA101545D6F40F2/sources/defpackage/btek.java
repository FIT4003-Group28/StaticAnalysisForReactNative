package defpackage;

import androidx.preference.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btek  reason: default package */
/* loaded from: classes4.dex */
public final class btek implements aub {
    final /* synthetic */ btem a;

    public btek(btem btemVar) {
        this.a = btemVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        Preference Ri;
        if (!((Boolean) obj).booleanValue() || (Ri = this.a.Ri("default_media_app")) == null) {
            return true;
        }
        this.a.i(Ri);
        return false;
    }
}
