package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: btkv  reason: default package */
/* loaded from: classes4.dex */
final class btkv implements auc {
    final /* synthetic */ btkx a;

    public btkv(btkx btkxVar) {
        this.a = btkxVar;
    }

    @Override // defpackage.auc
    public final boolean a(Preference preference) {
        if (!this.a.f.getEnableFeatureParameters().bq) {
            this.a.i(new btku(this));
            return true;
        }
        btkt btktVar = new btkt(this);
        btkx btkxVar = this.a;
        btkx.j(btktVar, btkxVar.h, btkxVar.e);
        return true;
    }
}
