package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aulv  reason: default package */
/* loaded from: classes2.dex */
public final class aulv {
    private final Context a;
    private final dxio<akfa> b;
    private final auhi c;
    private final auhj d;

    public aulv(Application application, dxio<akfa> dxioVar, auhi auhiVar, auhj auhjVar) {
        this.a = application;
        this.b = dxioVar;
        this.c = auhiVar;
        this.d = auhjVar;
    }

    public static final int b() {
        return dpyv.RATE_AND_REVIEW.dm;
    }

    public static final int c() {
        return dpyv.RIDDLER.dm;
    }

    private final Intent d() {
        Intent intent = new Intent();
        String packageName = this.a.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 19);
        sb.append(packageName);
        sb.append(".");
        sb.append("RiddlerUgcActivity");
        intent.setComponent(new ComponentName(packageName, sb.toString()));
        return intent;
    }

    public final augj a(pas pasVar, dlil dlilVar, pau pauVar, int i) {
        String str;
        btlu n = this.b.a().n(pauVar.b);
        String str2 = null;
        if ((dlilVar.a & 1) != 0) {
            dlii dliiVar = dlilVar.c;
            if (dliiVar == null) {
                dliiVar = dlii.c;
            }
            str = dliiVar.a;
        } else {
            str = null;
        }
        if ((dlilVar.a & 1) != 0) {
            dlii dliiVar2 = dlilVar.c;
            if (dliiVar2 == null) {
                dliiVar2 = dlii.c;
            }
            str2 = dliiVar2.b;
        }
        Intent putExtra = d().putExtra("payload", dlilVar.bS()).putExtra("obfuscated_gaia_id", pauVar.b).putExtra("notification_id", i);
        augc a = this.d.a(str, str2, i, this.c.g(dpyv.RIDDLER.dm));
        a.R = pauVar;
        a.S = n;
        a.E(putExtra, auhw.ACTIVITY);
        pap papVar = pasVar.b;
        if (papVar == null) {
            papVar = pap.d;
        }
        a.f = papVar.b;
        pap papVar2 = pasVar.b;
        if (papVar2 == null) {
            papVar2 = pap.d;
        }
        a.g = papVar2.c;
        a.v = -1;
        a.C(true);
        a.I();
        a.D(this.a.getResources().getColor(R.color.quantum_googblue));
        Intent putExtra2 = d().putExtra("action_type", "settings_action");
        auod l = auoe.l(ddcu.Jp);
        l.b(1);
        l.c(2131232818);
        l.g(this.a.getResources().getString(R.string.TURN_OFF));
        l.j(putExtra2, auhw.ACTIVITY);
        l.f(true);
        a.B(l.h());
        return a.a();
    }
}
