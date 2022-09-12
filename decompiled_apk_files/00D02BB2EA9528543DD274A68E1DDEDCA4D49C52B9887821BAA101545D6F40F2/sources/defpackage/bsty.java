package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: bsty  reason: default package */
/* loaded from: classes4.dex */
final class bsty implements aub {
    final /* synthetic */ bstz a;

    public bsty(bstz bstzVar) {
        this.a = bstzVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        bstz bstzVar = this.a;
        if (!bstzVar.aX) {
            return false;
        }
        bstzVar.ad.a().a.get(preference.q).b();
        return true;
    }
}
