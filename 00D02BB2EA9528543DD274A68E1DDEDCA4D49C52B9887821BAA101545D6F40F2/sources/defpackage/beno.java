package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: beno  reason: default package */
/* loaded from: classes3.dex */
public final class beno {
    public static dgab a(bwrs<ilo> bwrsVar) {
        dgac b = b(bwrsVar);
        if (b == null) {
            return null;
        }
        dgab b2 = dgab.b(b.b);
        return b2 == null ? dgab.UNKNOWN_CALL_TRACKING_STATUS : b2;
    }

    public static dgac b(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            return null;
        }
        dvwi dvwiVar = c.bf().v;
        if (dvwiVar == null) {
            dvwiVar = dvwi.m;
        }
        dgde dgdeVar = dvwiVar.l;
        if (dgdeVar == null) {
            dgdeVar = dgde.f;
        }
        dgcw dgcwVar = dgdeVar.d;
        if (dgcwVar == null) {
            dgcwVar = dgcw.c;
        }
        dgac dgacVar = dgcwVar.b;
        return dgacVar == null ? dgac.c : dgacVar;
    }

    public static List<mx<String, String>> c(dqob dqobVar, dgab dgabVar) {
        String name;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mx("geo_vertical", dqobVar.b));
        arrayList.add(new mx("num_calls", String.valueOf(dqobVar.c)));
        arrayList.add(new mx("num_missed_calls", String.valueOf(dqobVar.d)));
        arrayList.add(new mx("average_call_duration", String.valueOf(dqobVar.e)));
        if (dgabVar != null) {
            name = dgabVar.name();
        } else {
            name = dgab.UNKNOWN_CALL_TRACKING_STATUS.name();
        }
        arrayList.add(new mx("call_tracking_status_key", name));
        return arrayList;
    }

    public static jho d(Context context, final cklf cklfVar, bwrs<ilo> bwrsVar) {
        cjtd a;
        String string = context.getString(R.string.MERCHANT_PANEL_HELP_LABEL);
        ilo c = bwrsVar.c();
        if (c == null) {
            a = cjtd.a(dtxv.aO);
        } else {
            cjta c2 = cjtd.c(c.bZ());
            c2.d = dtxv.aO;
            a = c2.a();
        }
        jhm a2 = jhm.a();
        a2.a = string;
        a2.f = a;
        a2.b = string;
        a2.h = 0;
        a2.d(new View.OnClickListener(cklfVar) { // from class: benn
            private final cklf a;

            {
                this.a = cklfVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b("android_calls", "com.google.android.apps.vega");
            }
        });
        return a2.c();
    }
}
