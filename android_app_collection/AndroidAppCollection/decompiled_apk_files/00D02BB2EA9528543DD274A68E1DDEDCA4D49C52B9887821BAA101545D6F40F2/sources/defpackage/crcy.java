package defpackage;

import com.google.android.apps.maps.R;
import com.google.android.libraries.geo.navcore.service.alert.events.GuidanceAlertDataEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: crcy  reason: default package */
/* loaded from: classes5.dex */
public final class crcy<T> extends btrh<T> {
    private final int d;

    public crcy(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            crcx crcxVar = (crcx) this.a;
            amub a = ((crmj) obj).b.a();
            crcxVar.a.a().q().e = a.I;
            crcxVar.c.a = a.h == dqvj.WALK;
            crcxVar.c.b = true;
            crcxVar.a.a().g();
        } else if (i != 1) {
            crfg crfgVar = null;
            if (i != 2) {
                crcx crcxVar2 = (crcx) this.a;
                ahju ahjuVar = (ahju) obj;
                if (crcxVar2.f && !ahjuVar.a) {
                    crcxVar2.a.a().b(crfj.c(crfi.ERROR, crcxVar2.c().a.getString(R.string.DA_SPEECH_LOST_GPS), new amsu(12)), crej.CONNECTIVITY, null);
                }
                crcxVar2.f = ahjuVar.a;
                return;
            }
            crcx crcxVar3 = (crcx) this.a;
            cqzy cqzyVar = (cqzy) obj;
            crfj a2 = crcxVar3.c().a(cqzyVar.a, cqzyVar.f, cqzyVar.b, cqzyVar.e);
            amuo a3 = cqzyVar.a.a();
            int i2 = cqzyVar.c;
            int i3 = cqzyVar.d;
            String e = a2 == null ? null : a2.e();
            if (a2 != null) {
                crfgVar = a2.h;
            }
            crcxVar3.a.a().b(a2, crej.GUIDANCE, new crcv(crcxVar3, a3, i2, i3, e));
            crcxVar3.b.b(new crew(a3, e));
            if (crfgVar == null) {
                return;
            }
            amuw amuwVar = crfgVar.b;
            crcxVar3.d.a();
            String str = crfgVar.a;
            int i4 = amuwVar.b;
            int i5 = amuwVar.a;
            Double valueOf = Double.valueOf(crfgVar.c);
            boolean z = amuwVar.d;
            amvw amvwVar = crfgVar.d;
            dbsb b = dbsc.b(amvwVar);
            b.d("totalProb", amvwVar.g());
            b.b("matchedRouteIds", amvwVar.c);
            b.h("isFake", amvwVar.a);
            ArrayList arrayList = new ArrayList(amvwVar.b);
            Collections.sort(arrayList, amvv.a);
            ArrayList<amvl> arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i6 = 0;
            float f = 0.0f;
            while (i6 < size) {
                amvl amvlVar = (amvl) arrayList.get(i6);
                arrayList2.add(amvlVar);
                f += amvlVar.b();
                i6++;
                if (f > 0.98d) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (amvl amvlVar2 : arrayList2) {
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                dbsb b2 = dbsc.b(amvlVar2);
                b2.e("probScale", amvlVar2.b);
                b2.b("bearing", decimalFormat.format(amvlVar2.c));
                b2.b("speedGaussian", amvlVar2.d);
                b2.b("segStartDistAlongRoute", amvlVar2.h);
                b2.b("distLength", decimalFormat.format(amvlVar2.g - amvlVar2.f));
                b2.b("posDistnAlongSeg", amvlVar2.e);
                b2.h("tunnel", amvlVar2.i);
                sb.append(b2.toString());
                if (!amvlVar2.equals(dcft.s(arrayList2))) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            b.b("contents", sb.toString());
            new GuidanceAlertDataEvent(str, i4, i5, i2, valueOf, z, b.toString());
        } else {
            crcx crcxVar4 = (crcx) this.a;
            cqzx cqzxVar = (cqzx) obj;
            crfe c = crcxVar4.c();
            amut amutVar = cqzxVar.a;
            amvw amvwVar2 = cqzxVar.c;
            long j = cqzxVar.d;
            int i7 = cqzxVar.b;
            ArrayList a4 = dchl.a();
            crfj k = c.k(j, amutVar, amvwVar2, i7);
            if (k != null) {
                c.c.put(amutVar, Integer.valueOf(i7));
                a4.add(k);
            }
            crfd crfdVar = new crfd(amutVar);
            crfdVar.next();
            for (int i8 = 0; i8 < 10 && crfdVar.hasNext(); i8++) {
                amut next = crfdVar.next();
                if (!c.d.contains(next)) {
                    if (next.a == doxu.PREPARE) {
                        next.a();
                        int i9 = next.d;
                        int i10 = next.c;
                    }
                    boolean z2 = false;
                    for (amuw amuwVar2 : next.c()) {
                        amul b3 = amuwVar2.b();
                        if (amuwVar2.c && b3 != null) {
                            a4.add(crfj.a(next, b3.a, amsv.b(b3.b), b3.c));
                            int i11 = amuwVar2.a;
                            z2 = true;
                        }
                    }
                    if (z2) {
                        c.d.add(next);
                    }
                }
            }
            crcxVar4.a.a().f(a4);
        }
    }
}
