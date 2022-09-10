package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: zrp  reason: default package */
/* loaded from: classes7.dex */
public final class zrp {
    public static List<zef> a(doph dophVar, vtn vtnVar, @dzsi ddho ddhoVar, @dzsi final dxio<qbt> dxioVar, @dzsi qdb qdbVar) {
        View.OnClickListener onClickListener;
        cjtd a;
        if (dophVar.d.size() != 0) {
            List<jhk> e = xkg.e(dophVar);
            int i = 0;
            jhk jhkVar = e.size() == 1 ? e.get(0) : null;
            HashSet hashSet = new HashSet();
            dccx F = dcdc.F();
            for (dooo doooVar : dophVar.d) {
                if (hashSet.add(qdi.b(doooVar))) {
                    if (dxioVar == null || qdbVar == null) {
                        onClickListener = null;
                    } else {
                        qdbVar.b(doooVar.b);
                        ((qas) qdbVar).a = doooVar.c.get(i);
                        final qdc c = qdbVar.c();
                        onClickListener = new View.OnClickListener(dxioVar, c) { // from class: zro
                            private final dxio a;
                            private final qdc b;

                            {
                                this.a = dxioVar;
                                this.b = c;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                dxio dxioVar2 = this.a;
                                ((qbt) dxioVar2.a()).r(this.b);
                            }
                        };
                    }
                    dsrj<dpce> dsrjVar = doooVar.c;
                    if (ddhoVar == null) {
                        a = cjtd.b;
                    } else {
                        a = cjtd.a(ddhoVar);
                    }
                    F.g(new zsf(vtnVar, dsrjVar, jhkVar, null, null, null, onClickListener, a));
                    i = 0;
                }
            }
            return F.f();
        }
        return Collections.emptyList();
    }
}
