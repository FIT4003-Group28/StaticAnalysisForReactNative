package defpackage;

import androidx.preference.Preference;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btbw  reason: default package */
/* loaded from: classes4.dex */
public final class btbw implements auc {
    final /* synthetic */ btbx a;
    private final Locale b;

    public btbw(btbx btbxVar, Locale locale) {
        this.a = btbxVar;
        this.b = locale;
    }

    @Override // defpackage.auc
    public final boolean a(Preference preference) {
        btbt.g(Locale.getDefault(), this.b, this.a.af).aJ(this.a.bb());
        return true;
    }
}
