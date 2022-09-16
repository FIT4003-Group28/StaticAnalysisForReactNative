package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import java.util.List;
/* compiled from: PG */
/* renamed from: gil  reason: default package */
/* loaded from: classes3.dex */
final class gil implements afzf {
    final /* synthetic */ Intent a;
    final /* synthetic */ gim b;

    public gil(gim gimVar, Intent intent) {
        this.b = gimVar;
        this.a = intent;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.l("Failed to load get_settings response");
        this.b.b(this.a);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        abcn abcnVar = (abcn) obj;
        if (abcnVar.c == null) {
            ascu ascuVar = abcnVar.a.e;
            if (ascuVar == null) {
                ascuVar = ascu.a;
            }
            List d = abir.d(ascuVar, null);
            if (!d.isEmpty()) {
                abcnVar.c = d.get(0);
            }
        }
        Object obj2 = abcnVar.c;
        if (obj2 instanceof aurd) {
            this.a.putExtra(":android:show_fragment", NotificationPrefsFragment.class.getName());
        } else if (obj2 instanceof aurh) {
            Intent intent = this.a;
            int bh = awwc.bh(((aurh) obj2).e);
            if (bh == 0) {
                bh = 1;
            }
            gim.c(intent, String.valueOf(bh - 1));
        }
        this.b.b(this.a);
    }
}
