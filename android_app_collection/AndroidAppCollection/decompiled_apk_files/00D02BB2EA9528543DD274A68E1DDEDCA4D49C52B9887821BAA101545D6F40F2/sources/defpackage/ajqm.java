package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ajqm  reason: default package */
/* loaded from: classes2.dex */
final class ajqm extends dzvy implements dzut<dztc> {
    final /* synthetic */ ajqq a;

    public ajqm(ajqq ajqqVar) {
        this.a = ajqqVar;
    }

    @Override // defpackage.dzut
    public final /* bridge */ /* synthetic */ dztc a() {
        Intent intent = new Intent();
        intent.setAction("android.settings.BATTERY_SAVER_SETTINGS");
        gga ggaVar = this.a.aE;
        if (ggaVar != null) {
            ggaVar.startActivity(intent);
        }
        this.a.b.b();
        return dztc.a;
    }
}
