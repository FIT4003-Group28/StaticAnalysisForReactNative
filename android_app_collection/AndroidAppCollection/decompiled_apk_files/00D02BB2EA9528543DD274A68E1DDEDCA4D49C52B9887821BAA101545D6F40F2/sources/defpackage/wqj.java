package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: wqj  reason: default package */
/* loaded from: classes7.dex */
public class wqj {
    public final Context a;
    public final vtn b;
    public final wsm c;

    public wqj(Application application, vtn vtnVar, wsm wsmVar) {
        this.a = application;
        dbsk.s(vtnVar);
        this.b = vtnVar;
        this.c = wsmVar;
    }

    public static dcdc<drij> a(drhd drhdVar, final dopk dopkVar) {
        return dcdc.r(dchl.k(drhdVar.b, new dbrn(dopkVar) { // from class: wqf
            private final dopk a;

            {
                this.a = dopkVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.t.get(((drhc) obj).a);
            }
        }));
    }

    @dzsi
    public static akrk b(drhd drhdVar, dopk dopkVar) {
        final dsrj<doud> dsrjVar = dopkVar.s;
        dsrf dsrfVar = drhdVar.a;
        dsrjVar.getClass();
        List k = dchl.k(dsrfVar, new dbrn(dsrjVar) { // from class: wqg
            private final List a;

            {
                this.a = dsrjVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.get(((Integer) obj).intValue());
            }
        });
        if (k.isEmpty()) {
            return null;
        }
        return akrk.i(k);
    }
}
