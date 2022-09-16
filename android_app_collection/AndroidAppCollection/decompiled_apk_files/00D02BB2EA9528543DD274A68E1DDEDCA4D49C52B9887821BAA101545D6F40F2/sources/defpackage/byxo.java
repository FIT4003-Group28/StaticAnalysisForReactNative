package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byxo  reason: default package */
/* loaded from: classes4.dex */
public final class byxo implements byxw {
    private final byuf a;
    private final qjp b;
    private final bysv c;
    private final btvo d;
    private final cqat e;
    private final byyg f;
    private final byxb g;
    private final dxio<qjk> h;
    private final dxio<qqb> i;
    private final dxio<byxn> j;
    private final dxio<rot> k;

    public byxo(byuf byufVar, qjp qjpVar, bysv bysvVar, btvo btvoVar, cqat cqatVar, byyg byygVar, byxb byxbVar, dxio<qjk> dxioVar, dxio<qqb> dxioVar2, dxio<byxn> dxioVar3, dxio<rot> dxioVar4) {
        this.a = byufVar;
        this.b = qjpVar;
        this.c = bysvVar;
        this.d = btvoVar;
        this.e = cqatVar;
        this.f = byygVar;
        this.g = byxbVar;
        this.h = dxioVar;
        this.i = dxioVar2;
        this.j = dxioVar3;
        this.k = dxioVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v7, types: [dbsg] */
    @Override // defpackage.byxw
    public final void a(Intent intent) {
        dlkb dlkbVar;
        dlkb dlkbVar2;
        bzhn bzhnVar;
        bzhj c;
        int a;
        String str;
        Iterator<dlkq> it;
        Iterator<dlkn> it2;
        dbsg dbsgVar;
        boolean z;
        dbsg dbsgVar2;
        dpyy dpyyVar;
        byxo byxoVar = this;
        dkqr dkqrVar = byxoVar.d.getNotificationsParameters().o;
        if (dkqrVar == null) {
            dkqrVar = dkqr.d;
        }
        dkhd dkhdVar = dkqrVar.a;
        if (dkhdVar == null) {
            dkhdVar = dkhd.h;
        }
        if (dkhdVar.b) {
            byxoVar.c.c(cken.RECEIVED_INTENT_COMMUTE_SERVER_PAYLOAD_RECEIVED);
            dbsk.a(intent.hasExtra(byxy.l));
            dlkv dlkvVar = (dlkv) bvrs.f(intent.getExtras(), byxy.k, (dssr) dlkv.s.cu(7));
            dbsk.s(dlkvVar);
            String stringExtra = intent.getStringExtra(byxy.l);
            if ((dlkvVar.a & 256) != 0) {
                long j = dlkvVar.l;
                bzhj c2 = byxoVar.a.c();
                if (c2 != null) {
                    dlkv dlkvVar2 = c2.d;
                    if (dlkvVar2 == null) {
                        dlkvVar2 = dlkv.s;
                    }
                    if ((dlkvVar2.a & 256) != 0) {
                        dlkv dlkvVar3 = c2.d;
                        if (dlkvVar3 == null) {
                            dlkvVar3 = dlkv.s;
                        }
                        if (j < dlkvVar3.l) {
                            byxoVar.c.c(cken.INFO_COMMUTE_DEPARTURE_PAYLOAD_OUT_OF_ORDER);
                            byxoVar.c.c(cken.SUCCESSFULLY_PROCESSED_INTENT_COMMUTE_SERVER_PAYLOAD_RECEIVED);
                        }
                    }
                }
            }
            if (dlkvVar.c.isEmpty()) {
                byxoVar.c.c(cken.ERROR_PAYLOAD_RECEIVED_SESSION_ID_IS_MISSING);
            } else {
                dlkc dlkcVar = dlkvVar.b;
                if (dlkcVar == null) {
                    dlkcVar = dlkc.c;
                }
                if (dlkcVar.a == 1) {
                    dlkbVar = dlkb.b(((Integer) dlkcVar.b).intValue());
                    if (dlkbVar == null) {
                        dlkbVar = dlkb.UNKNOWN_KNOWN_PLACE_NAME;
                    }
                } else {
                    dlkbVar = dlkb.UNKNOWN_KNOWN_PLACE_NAME;
                }
                String str2 = "";
                if (dlkbVar == dlkb.UNKNOWN_KNOWN_PLACE_NAME) {
                    dlkc dlkcVar2 = dlkvVar.b;
                    if (dlkcVar2 == null) {
                        dlkcVar2 = dlkc.c;
                    }
                    if ((dlkcVar2.a == 2 ? (String) dlkcVar2.b : str2).isEmpty()) {
                        byxoVar.c.c(cken.ERROR_PAYLOAD_RECEIVED_DESTINATION_IS_MISSING);
                    }
                }
                if (byxoVar.b.a(qjj.TRANSIT_TO_PLACE, dlkvVar.c)) {
                    byxoVar.c.c(cken.INFO_NOTIFICATION_SUPPRESSED);
                } else if (dlkvVar.k == 0) {
                    byxoVar.c.c(cken.ERROR_PAYLOAD_RECEIVED_DATA_EXPIRATION_IS_MISSING);
                    byxoVar.f.a();
                } else {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(byxoVar.e.b());
                    if ((dlkvVar.a & 256) != 0) {
                        long j2 = dlkvVar.l;
                        if (seconds >= j2) {
                            ((ckcp) byxoVar.c.a.a(ckeo.G)).a(seconds - j2);
                        } else {
                            byxoVar.c.c(cken.WARNING_NEGATIVE_SERVER_TO_CLIENT_LATENCY);
                        }
                    } else {
                        byxoVar.c.c(cken.ERROR_PAYLOAD_RECEIVED_SENT_TIMESTAMP_IS_MISSING);
                    }
                    long j3 = dlkvVar.k;
                    if (seconds > j3) {
                        ((ckcp) byxoVar.c.a.a(ckeo.H)).a(seconds - j3);
                        byxoVar.c.c(cken.WARNING_RECEIVED_EXPIRED_PAYLOAD);
                        byxoVar.f.a();
                    } else {
                        byxoVar.c.c(cken.INFO_PAYLOAD_PROCESSING);
                        byxoVar.i.a().a(null, dlkvVar.c, dlkvVar.i, TimeUnit.SECONDS.toMillis(dlkvVar.j), qjj.TRANSIT_TO_PLACE);
                        byxn a2 = byxoVar.j.a();
                        String str3 = dlkvVar.c;
                        Map unmodifiableMap = Collections.unmodifiableMap(dlkvVar.n);
                        bzhf bzhfVar = (bzhf) a2.a.L(bvjk.cP, (dssr) bzhf.b.cu(7), bzhf.b);
                        dkqt dkqtVar = a2.c.getNotificationsParameters().p;
                        if (dkqtVar == null) {
                            dkqtVar = dkqt.b;
                        }
                        final byxm byxmVar = new byxm(a2, bzhfVar, str3, dkqtVar.a);
                        Map s = dcjz.s(unmodifiableMap, byxi.a);
                        dcep keySet = dcdn.s(dcft.i(s.entrySet(), new dbsl(byxmVar) { // from class: byxj
                            private final byxm a;

                            {
                                this.a = byxmVar;
                            }

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                byxm byxmVar2 = this.a;
                                final int intValue = ((Integer) ((Map.Entry) obj).getValue()).intValue();
                                List subList = Collections.unmodifiableList(((bzhf) byxmVar2.a.b).a).subList((((bzhf) byxmVar2.a.b).a.size() <= 0 || !byxmVar2.a.a().b.equals(byxmVar2.b)) ? 0 : 1, ((bzhf) byxmVar2.a.b).a.size());
                                int n = dcft.n(subList, new dbsl(intValue) { // from class: byxk
                                    private final int a;

                                    {
                                        this.a = intValue;
                                    }

                                    @Override // defpackage.dbsl
                                    public final boolean a(Object obj2) {
                                        final int i = this.a;
                                        return !dcft.m(((bzhe) obj2).c, new dbsl(i) { // from class: byxl
                                            private final int a;

                                            {
                                                this.a = i;
                                            }

                                            @Override // defpackage.dbsl
                                            public final boolean a(Object obj3) {
                                                return ((bzhb) obj3).b == this.a;
                                            }
                                        }).a();
                                    }
                                });
                                if (n == -1) {
                                    n = subList.size();
                                }
                                return n >= byxmVar2.c;
                            }
                        })).keySet();
                        Collection values = s.values();
                        if (((bzhf) byxmVar.a.b).a.size() == 0 || !byxmVar.a.a().b.equals(byxmVar.b)) {
                            bzhc bzhcVar = byxmVar.a;
                            String str4 = byxmVar.b;
                            bzhd bZ = bzhe.d.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            bzhe bzheVar = (bzhe) bZ.b;
                            str4.getClass();
                            bzheVar.a |= 1;
                            bzheVar.b = str4;
                            bzhe a3 = byxn.a(bZ.bK(), values);
                            if (bzhcVar.c) {
                                bzhcVar.bF();
                                bzhcVar.c = false;
                            }
                            bzhf bzhfVar2 = (bzhf) bzhcVar.b;
                            a3.getClass();
                            bzhfVar2.b();
                            bzhfVar2.a.add(0, a3);
                        } else {
                            bzhc bzhcVar2 = byxmVar.a;
                            bzhe a4 = byxn.a(bzhcVar2.a(), values);
                            if (bzhcVar2.c) {
                                bzhcVar2.bF();
                                bzhcVar2.c = false;
                            }
                            bzhf bzhfVar3 = (bzhf) bzhcVar2.b;
                            a4.getClass();
                            bzhfVar3.b();
                            bzhfVar3.a.set(0, a4);
                        }
                        List unmodifiableList = Collections.unmodifiableList(((bzhf) byxmVar.a.b).a);
                        if (unmodifiableList.size() > 25) {
                            bzhc bzhcVar3 = byxmVar.a;
                            if (bzhcVar3.c) {
                                bzhcVar3.bF();
                                bzhcVar3.c = false;
                            }
                            ((bzhf) bzhcVar3.b).a = bzhf.ck();
                            bzhc bzhcVar4 = byxmVar.a;
                            List subList = unmodifiableList.subList(0, 25);
                            if (bzhcVar4.c) {
                                bzhcVar4.bF();
                                bzhcVar4.c = false;
                            }
                            bzhf bzhfVar4 = (bzhf) bzhcVar4.b;
                            bzhfVar4.b();
                            dsod.bv(subList, bzhfVar4.a);
                        }
                        if (!keySet.isEmpty()) {
                            ((ckcn) byxmVar.d.b.a(ckeo.F)).a();
                        }
                        a2.a.al(bvjk.cP, byxmVar.a.bK());
                        byxb byxbVar = byxoVar.g;
                        bzhg bZ2 = bzhj.h.bZ();
                        dlks dlksVar = dlkvVar.d;
                        if (dlksVar == null) {
                            dlksVar = dlks.e;
                        }
                        Map unmodifiableMap2 = Collections.unmodifiableMap(dlkvVar.n);
                        bzji bZ3 = bzjj.i.bZ();
                        if ((dlksVar.a & 1) != 0) {
                            String str5 = dlksVar.b;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            bzjj bzjjVar = (bzjj) bZ3.b;
                            str5.getClass();
                            bzjjVar.a |= 1;
                            bzjjVar.b = str5;
                        }
                        if ((dlksVar.a & 2) != 0) {
                            String str6 = dlksVar.c;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            bzjj bzjjVar2 = (bzjj) bZ3.b;
                            str6.getClass();
                            bzjjVar2.a |= 2;
                            bzjjVar2.c = str6;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator<dlkq> it3 = dlksVar.d.iterator();
                        while (true) {
                            int i = 4;
                            if (it3.hasNext()) {
                                final dlkq next = it3.next();
                                Iterator<dlkn> it4 = next.i.iterator();
                                while (it4.hasNext()) {
                                    dlkn next2 = it4.next();
                                    int a5 = dlkk.a(next2.k);
                                    if (a5 == 0 || a5 != i) {
                                        bzjr bZ4 = bzju.e.bZ();
                                        dbsg dbsgVar3 = dbpy.a;
                                        if ((next.a & 2) != 0) {
                                            dlke dlkeVar = next.c;
                                            if (dlkeVar == null) {
                                                dlkeVar = dlke.c;
                                            }
                                            str = str2;
                                            it = it3;
                                            dbsk.a(dlkeVar.b.endsWith(".svg"));
                                            doue doueVar = (doue) douj.h.bZ();
                                            if (doueVar.c) {
                                                doueVar.bF();
                                                doueVar.c = false;
                                            }
                                            douj doujVar = (douj) doueVar.b;
                                            it2 = it4;
                                            doujVar.b = 3;
                                            doujVar.a |= 1;
                                            douh bZ5 = doui.e.bZ();
                                            String str7 = dlkeVar.b;
                                            if (bZ5.c) {
                                                bZ5.bF();
                                                bZ5.c = false;
                                            }
                                            doui douiVar = (doui) bZ5.b;
                                            str7.getClass();
                                            douiVar.a |= 1;
                                            douiVar.b = str7;
                                            dquc dqucVar = dquc.SVG;
                                            if (bZ5.c) {
                                                bZ5.bF();
                                                bZ5.c = false;
                                            }
                                            doui douiVar2 = (doui) bZ5.b;
                                            douiVar2.c = dqucVar.d;
                                            douiVar2.a |= 2;
                                            if (doueVar.c) {
                                                doueVar.bF();
                                                doueVar.c = false;
                                            }
                                            douj doujVar2 = (douj) doueVar.b;
                                            doui bK = bZ5.bK();
                                            bK.getClass();
                                            dsrj<doui> dsrjVar = doujVar2.d;
                                            if (!dsrjVar.a()) {
                                                doujVar2.d = dsqw.cl(dsrjVar);
                                            }
                                            doujVar2.d.add(bK);
                                            ?? i2 = dbsg.i((douj) doueVar.bK());
                                            z = next.d;
                                            dbsgVar = i2;
                                        } else {
                                            str = str2;
                                            it = it3;
                                            it2 = it4;
                                            dbsgVar = dbsgVar3;
                                            z = false;
                                        }
                                        dbsg dbsgVar4 = dbpy.a;
                                        if ((next.a & 1) == 0) {
                                            dbsgVar2 = dbsgVar;
                                        } else if (z) {
                                            dbsgVar2 = dbsgVar.h(new dbrn(next) { // from class: bywy
                                                private final dlkq a;

                                                {
                                                    this.a = next;
                                                }

                                                @Override // defpackage.dbrn
                                                public final Object a(Object obj) {
                                                    dlkq dlkqVar = this.a;
                                                    douj doujVar3 = (douj) obj;
                                                    dcco<dlkb, bzhm> dccoVar = byxb.a;
                                                    dsqp dsqpVar = (dsqp) doujVar3.cu(5);
                                                    dsqpVar.bC(doujVar3);
                                                    doue doueVar2 = (doue) dsqpVar;
                                                    dlku dlkuVar = dlkqVar.b;
                                                    if (dlkuVar == null) {
                                                        dlkuVar = dlku.e;
                                                    }
                                                    String str8 = dlkuVar.b;
                                                    if (doueVar2.c) {
                                                        doueVar2.bF();
                                                        doueVar2.c = false;
                                                    }
                                                    douj doujVar4 = (douj) doueVar2.b;
                                                    douj doujVar5 = douj.h;
                                                    str8.getClass();
                                                    doujVar4.a |= 4;
                                                    doujVar4.e = str8;
                                                    return (douj) doueVar2.bK();
                                                }
                                            });
                                        } else {
                                            dlku dlkuVar = next.b;
                                            if (dlkuVar == null) {
                                                dlkuVar = dlku.e;
                                            }
                                            douk bZ6 = doul.f.bZ();
                                            String str8 = dlkuVar.b;
                                            if (bZ6.c) {
                                                bZ6.bF();
                                                bZ6.c = false;
                                            }
                                            doul doulVar = (doul) bZ6.b;
                                            str8.getClass();
                                            dbsg dbsgVar5 = dbsgVar;
                                            doulVar.a |= 1;
                                            doulVar.b = str8;
                                            if ((dlkuVar.a & 2) != 0) {
                                                String e = bvoa.e(dlkuVar.c);
                                                if (bZ6.c) {
                                                    bZ6.bF();
                                                    bZ6.c = false;
                                                }
                                                doul doulVar2 = (doul) bZ6.b;
                                                e.getClass();
                                                doulVar2.a |= 8;
                                                doulVar2.e = e;
                                            }
                                            if ((dlkuVar.a & 4) != 0) {
                                                String e2 = bvoa.e(dlkuVar.d);
                                                if (bZ6.c) {
                                                    bZ6.bF();
                                                    bZ6.c = false;
                                                }
                                                doul doulVar3 = (doul) bZ6.b;
                                                e2.getClass();
                                                doulVar3.a |= 4;
                                                doulVar3.d = e2;
                                            }
                                            dbsgVar4 = dbsg.i(bZ6.bK());
                                            dbsgVar2 = dbsgVar5;
                                        }
                                        bZ4.a(dcdc.q(dcbg.d(dbsgVar2.h(bywz.a).g(), dbsgVar4.h(byxa.a).g())));
                                        dcdn<dlkp, bzjt> dcdnVar = byxb.c;
                                        dlkp b = dlkp.b(next.g);
                                        if (b == null) {
                                            b = dlkp.UNKNOWN_VEHICLE_TYPE;
                                        }
                                        bzjt bzjtVar = dcdnVar.get(b);
                                        if (bzjtVar != null) {
                                            if (bZ4.c) {
                                                bZ4.bF();
                                                bZ4.c = false;
                                            }
                                            bzju bzjuVar = (bzju) bZ4.b;
                                            bzjuVar.d = bzjtVar.f;
                                            bzjuVar.a |= 1;
                                        }
                                        bzhy bZ7 = bzia.j.bZ();
                                        if (bZ7.c) {
                                            bZ7.bF();
                                            bZ7.c = false;
                                        }
                                        bzia bziaVar = (bzia) bZ7.b;
                                        bzju bK2 = bZ4.bK();
                                        bK2.getClass();
                                        bziaVar.d = bK2;
                                        bziaVar.a |= 4;
                                        if ((next.a & 64) != 0) {
                                            String str9 = next.h;
                                            if (bZ7.c) {
                                                bZ7.bF();
                                                bZ7.c = false;
                                            }
                                            bzia bziaVar2 = (bzia) bZ7.b;
                                            str9.getClass();
                                            bziaVar2.a |= 16;
                                            bziaVar2.f = str9;
                                        }
                                        if ((next.a & 8) != 0) {
                                            String str10 = next.e;
                                            if (bZ7.c) {
                                                bZ7.bF();
                                                bZ7.c = false;
                                            }
                                            bzia bziaVar3 = (bzia) bZ7.b;
                                            str10.getClass();
                                            bziaVar3.a |= 8;
                                            bziaVar3.e = str10;
                                        }
                                        if ((next.a & 16) != 0) {
                                            String str11 = next.f;
                                            if (bZ7.c) {
                                                bZ7.bF();
                                                bZ7.c = false;
                                            }
                                            bzia bziaVar4 = (bzia) bZ7.b;
                                            str11.getClass();
                                            bziaVar4.a |= 32;
                                            bziaVar4.h = str11;
                                        }
                                        bzje bZ8 = bzjh.j.bZ();
                                        long j4 = next2.b;
                                        if (bZ8.c) {
                                            bZ8.bF();
                                            bZ8.c = false;
                                        }
                                        bzjh bzjhVar = (bzjh) bZ8.b;
                                        bzjhVar.a |= 1;
                                        bzjhVar.b = j4;
                                        long j5 = next2.b;
                                        dlkq dlkqVar = next;
                                        long j6 = next2.c;
                                        int a6 = dlkk.a(next2.k);
                                        byxb byxbVar2 = byxbVar;
                                        if (a6 == 0) {
                                            a6 = 1;
                                        }
                                        int i3 = a6 == 4 ? 4 : j6 == 0 ? 1 : Math.abs(j5 - j6) < 60 ? 2 : 3;
                                        if (bZ8.c) {
                                            bZ8.bF();
                                            bZ8.c = false;
                                        }
                                        bzjh bzjhVar2 = (bzjh) bZ8.b;
                                        bzjhVar2.c = i3 - 1;
                                        int i4 = bzjhVar2.a | 2;
                                        bzjhVar2.a = i4;
                                        long j7 = next2.c;
                                        if (j7 != 0) {
                                            i4 |= 4;
                                            bzjhVar2.a = i4;
                                            bzjhVar2.d = j7;
                                        }
                                        long j8 = next2.d;
                                        if (j8 != 0) {
                                            i4 |= 8;
                                            bzjhVar2.a = i4;
                                            bzjhVar2.e = j8;
                                        }
                                        int i5 = next2.a;
                                        if ((i5 & 8) != 0 && (i5 & 16) != 0) {
                                            String str12 = next2.f;
                                            str12.getClass();
                                            int i6 = i4 | 16;
                                            bzjhVar2.a = i6;
                                            bzjhVar2.f = str12;
                                            String str13 = next2.g;
                                            str13.getClass();
                                            bzjhVar2.a = i6 | 32;
                                            bzjhVar2.g = str13;
                                        }
                                        if ((next2.a & 64) != 0) {
                                            dpja bZ9 = dpjb.e.bZ();
                                            dpyw bZ10 = dpzb.d.bZ();
                                            int a7 = dlkm.a(next2.i);
                                            if (a7 == 0) {
                                                a7 = 1;
                                            }
                                            switch (a7 - 1) {
                                                case 0:
                                                    dpyyVar = dpyy.OCCUPANCY_RATE_UNKNOWN;
                                                    break;
                                                case 1:
                                                    dpyyVar = dpyy.EMPTY;
                                                    break;
                                                case 2:
                                                    dpyyVar = dpyy.MANY_SEATS_AVAILABLE;
                                                    break;
                                                case 3:
                                                    dpyyVar = dpyy.FEW_SEATS_AVAILABLE;
                                                    break;
                                                case 4:
                                                    dpyyVar = dpyy.STANDING_ROOM_ONLY;
                                                    break;
                                                case 5:
                                                    dpyyVar = dpyy.CRUSHED_STANDING_ROOM_ONLY;
                                                    break;
                                                case 6:
                                                    dpyyVar = dpyy.FULL;
                                                    break;
                                                case 7:
                                                    dpyyVar = dpyy.NOT_ACCEPTING_PASSENGERS;
                                                    break;
                                                default:
                                                    dpyyVar = dpyy.NOT_BOARDABLE;
                                                    break;
                                            }
                                            if (bZ10.c) {
                                                bZ10.bF();
                                                bZ10.c = false;
                                            }
                                            dpzb dpzbVar = (dpzb) bZ10.b;
                                            dpzbVar.c = dpyyVar.j;
                                            dpzbVar.a |= 2;
                                            if (bZ9.c) {
                                                bZ9.bF();
                                                bZ9.c = false;
                                            }
                                            dpjb dpjbVar = (dpjb) bZ9.b;
                                            dpzb bK3 = bZ10.bK();
                                            bK3.getClass();
                                            dpjbVar.c = bK3;
                                            dpjbVar.a |= 2;
                                            if (bZ8.c) {
                                                bZ8.bF();
                                                bZ8.c = false;
                                            }
                                            bzjh bzjhVar3 = (bzjh) bZ8.b;
                                            dpjb bK4 = bZ9.bK();
                                            bK4.getClass();
                                            bzjhVar3.h = bK4;
                                            bzjhVar3.a |= 64;
                                        }
                                        if (bZ7.c) {
                                            bZ7.bF();
                                            bZ7.c = false;
                                        }
                                        bzia bziaVar5 = (bzia) bZ7.b;
                                        bzjh bK5 = bZ8.bK();
                                        bK5.getClass();
                                        bziaVar5.c = bK5;
                                        bziaVar5.b = 1;
                                        for (Long l : next2.e) {
                                            dljv dljvVar = (dljv) unmodifiableMap2.get(l);
                                            dbsk.s(dljvVar);
                                            bzja bZ11 = bzjd.g.bZ();
                                            dcdn<dlju, bzjc> dcdnVar2 = byxb.b;
                                            dlju b2 = dlju.b(dljvVar.b);
                                            if (b2 == null) {
                                                b2 = dlju.SEVERITY_UNKNOWN;
                                            }
                                            bzjc bzjcVar = dcdnVar2.get(b2);
                                            if (bzjcVar != null) {
                                                if (bZ11.c) {
                                                    bZ11.bF();
                                                    bZ11.c = false;
                                                }
                                                bzjd bzjdVar = (bzjd) bZ11.b;
                                                bzjdVar.f = bzjcVar.e;
                                                bzjdVar.a |= 16;
                                            }
                                            if ((dljvVar.a & 4) != 0) {
                                                String str14 = dljvVar.d;
                                                if (bZ11.c) {
                                                    bZ11.bF();
                                                    bZ11.c = false;
                                                }
                                                bzjd bzjdVar2 = (bzjd) bZ11.b;
                                                str14.getClass();
                                                bzjdVar2.a |= 4;
                                                bzjdVar2.d = str14;
                                            }
                                            if ((dljvVar.a & 8) != 0) {
                                                String str15 = dljvVar.e;
                                                if (bZ11.c) {
                                                    bZ11.bF();
                                                    bZ11.c = false;
                                                }
                                                bzjd bzjdVar3 = (bzjd) bZ11.b;
                                                str15.getClass();
                                                bzjdVar3.a |= 8;
                                                bzjdVar3.e = str15;
                                            }
                                            bZ7.a(bZ11.bK());
                                        }
                                        if ((next2.a & 128) != 0) {
                                            int i7 = next2.j;
                                            if (bZ7.c) {
                                                bZ7.bF();
                                                bZ7.c = false;
                                            }
                                            bzia bziaVar6 = (bzia) bZ7.b;
                                            bziaVar6.a |= 128;
                                            bziaVar6.i = i7;
                                        }
                                        arrayList.add(bZ7.bK());
                                        next = dlkqVar;
                                        str2 = str;
                                        it3 = it;
                                        it4 = it2;
                                        byxbVar = byxbVar2;
                                        i = 4;
                                    }
                                }
                            } else {
                                byxb byxbVar3 = byxbVar;
                                String str16 = str2;
                                Collections.sort(arrayList, new byul());
                                bZ3.a(arrayList);
                                bzjj bzjjVar3 = (bzjj) bZ3.bK();
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                bzhj bzhjVar = (bzhj) bZ2.b;
                                bzjjVar3.getClass();
                                bzhjVar.b = bzjjVar3;
                                bzhjVar.a |= 1;
                                dlkc dlkcVar3 = dlkvVar.b;
                                if (dlkcVar3 == null) {
                                    dlkcVar3 = dlkc.c;
                                }
                                dcco<dlkb, bzhm> dccoVar = byxb.a;
                                if (dlkcVar3.a == 1) {
                                    dlkbVar2 = dlkb.b(((Integer) dlkcVar3.b).intValue());
                                    if (dlkbVar2 == null) {
                                        dlkbVar2 = dlkb.UNKNOWN_KNOWN_PLACE_NAME;
                                    }
                                } else {
                                    dlkbVar2 = dlkb.UNKNOWN_KNOWN_PLACE_NAME;
                                }
                                bzhm bzhmVar = dccoVar.get(dlkbVar2);
                                if (bzhmVar != null) {
                                    bzhk bZ12 = bzhn.d.bZ();
                                    if (bZ12.c) {
                                        bZ12.bF();
                                        bZ12.c = false;
                                    }
                                    bzhn bzhnVar2 = (bzhn) bZ12.b;
                                    bzhnVar2.b = bzhmVar.d;
                                    bzhnVar2.a |= 1;
                                    bzhnVar = bZ12.bK();
                                } else if (!(dlkcVar3.a == 2 ? (String) dlkcVar3.b : str16).isEmpty()) {
                                    bzhk bZ13 = bzhn.d.bZ();
                                    String str17 = dlkcVar3.a == 2 ? (String) dlkcVar3.b : str16;
                                    if (bZ13.c) {
                                        bZ13.bF();
                                        bZ13.c = false;
                                    }
                                    bzhn bzhnVar3 = (bzhn) bZ13.b;
                                    str17.getClass();
                                    bzhnVar3.a |= 2;
                                    bzhnVar3.c = str17;
                                    bzhnVar = bZ13.bK();
                                } else {
                                    bzhnVar = bzhn.d;
                                }
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                bzhj bzhjVar2 = (bzhj) bZ2.b;
                                bzhnVar.getClass();
                                bzhjVar2.c = bzhnVar;
                                int i8 = bzhjVar2.a | 2;
                                bzhjVar2.a = i8;
                                dlkvVar.getClass();
                                bzhjVar2.d = dlkvVar;
                                bzhjVar2.a = i8 | 4;
                                bzhj bzhjVar3 = (bzhj) bZ2.b;
                                dsri dsriVar = bzhjVar3.f;
                                if (!dsriVar.a()) {
                                    bzhjVar3.f = dsqw.ci(dsriVar);
                                }
                                dsod.bv(keySet, bzhjVar3.f);
                                if (stringExtra != null) {
                                    if (bZ2.c) {
                                        bZ2.bF();
                                        bZ2.c = false;
                                    }
                                    bzhj bzhjVar4 = (bzhj) bZ2.b;
                                    stringExtra.getClass();
                                    bzhjVar4.a |= 8;
                                    bzhjVar4.e = stringExtra;
                                }
                                int i9 = byxbVar3.d.getTripAssistanceNotificationsParameters().b ? 3 : 2;
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                bzhj bzhjVar5 = (bzhj) bZ2.b;
                                bzhjVar5.g = i9 - 1;
                                bzhjVar5.a |= 16;
                                bzhj bK6 = bZ2.bK();
                                byxoVar = this;
                                byuf byufVar = byxoVar.a;
                                try {
                                    byufVar.d("commute_data", bK6);
                                    String str18 = dlkvVar.c;
                                    byyg byygVar = byxoVar.f;
                                    bvrj.UI_THREAD.d();
                                    byygVar.d();
                                    byygVar.e();
                                    byygVar.b(str18);
                                    if (!byygVar.f() || ((c = byygVar.a.c()) != null && (a = bzhi.a(c.g)) != 0 && a == 2)) {
                                        byygVar.c(str18);
                                    }
                                    byxoVar.c.c(cken.INFO_PAYLOAD_PROCESSED);
                                    if (byxoVar.k.a().b() && byxoVar.h.a().f() == domy.TRANSIT) {
                                        byxoVar.k.a().a();
                                    }
                                } catch (RuntimeException e3) {
                                    byufVar.b.c(cken.ERROR_IN_DATA_STORAGE_PUT_COMMUTE_NOTIFICATION);
                                    throw e3;
                                }
                            }
                        }
                    }
                }
            }
            byxoVar.c.c(cken.SUCCESSFULLY_PROCESSED_INTENT_COMMUTE_SERVER_PAYLOAD_RECEIVED);
        }
    }

    @Override // defpackage.byxw
    public final boolean b(Intent intent) {
        return byxy.j.equals(intent.getAction());
    }
}
