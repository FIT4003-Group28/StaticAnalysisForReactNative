package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dsh  reason: default package */
/* loaded from: classes6.dex */
public final class dsh<T> extends btrh<T> {
    public dsh(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        Map.Entry<dmr, dsj> next;
        dmr key;
        dse dseVar;
        dsd dsdVar = (dsd) this.a;
        amqo amqoVar = (amqo) obj;
        if (amqoVar.a() != null) {
            GmmLocation gmmLocation = dsdVar.a;
            if (gmmLocation != null && gmmLocation.F(amqoVar.a().B()) < 1.0f) {
                return;
            }
            dsdVar.a = amqoVar.a();
            dsf dsfVar = dsdVar.b;
            bvrj.UI_THREAD.c();
            boolean contains = dsf.b.contains(dsfVar.l);
            Iterator<Map.Entry<dmr, dsj>> it = dsfVar.e.entrySet().iterator();
            while (it.hasNext() && (dseVar = dsfVar.j.get((key = (next = it.next()).getKey()))) != null) {
                dsj value = next.getValue();
                if (key.a() == dmq.PRIMARY_PIN) {
                    if (!contains) {
                        value.b(((dsu) dseVar.a).j, true);
                    } else {
                        value.b(dsfVar.f.getString(R.string.LIGHTHOUSE_OFFSCREEN_INDICATOR_GO_TO, dsfVar.m), false);
                    }
                }
            }
            dcpd it2 = dcep.K(dsdVar.b.j.keySet()).iterator();
            while (it2.hasNext()) {
                dmr dmrVar = (dmr) it2.next();
                if (dmrVar.a() == dmq.VENUE_LEVEL_CHANGE) {
                    dsdVar.b.f(dmrVar);
                }
            }
        }
    }
}
