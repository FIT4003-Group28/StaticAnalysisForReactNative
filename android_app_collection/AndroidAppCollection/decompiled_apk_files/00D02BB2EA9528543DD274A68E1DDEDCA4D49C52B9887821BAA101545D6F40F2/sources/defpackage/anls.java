package defpackage;

import com.google.android.apps.gmm.mapsactivity.instant.TimelineWrapper;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anls  reason: default package */
/* loaded from: classes2.dex */
public final class anls implements anlq {
    private static final dcqe a = dcqe.c("anls");

    private static <P extends dmki<anms, anmq>> dcdc<P> b(eapd eapdVar, eapd eapdVar2, Iterable<P> iterable) {
        dccx F = dcdc.F();
        for (P p : iterable) {
            long c = p.c();
            long d = p.d();
            long j = eapdVar.a;
            if (c < eapdVar2.a && j < d) {
                F.g(p);
            }
        }
        return F.f();
    }

    @Override // defpackage.anlq
    public final dbsg<aoge> a(aoge aogeVar, dcdc<anlp> dcdcVar) {
        TimelineWrapper timelineWrapper;
        Throwable th;
        dbsg<aoge> a2;
        int i;
        TimelineWrapper timelineWrapper2;
        anms d;
        long j;
        int i2;
        int i3;
        TimelineWrapper timelineWrapper3;
        int i4;
        dcdc<anms> dcdcVar2;
        dbrn dbrnVar;
        dcdc<anlp> dcdcVar3 = dcdcVar;
        TimelineWrapper timelineWrapper4 = new TimelineWrapper();
        try {
            dbrn dbrnVar2 = anlr.a;
            dngs dngsVar = aogeVar.a().b;
            if (dngsVar == null) {
                try {
                    dngsVar = dngs.h;
                } catch (Throwable th2) {
                    th = th2;
                    timelineWrapper = timelineWrapper4;
                    try {
                        timelineWrapper.close();
                    } catch (Throwable th3) {
                        deki.a(th, th3);
                    }
                    throw th;
                }
            }
            if (anlw.b(dngsVar, dcdcVar3).isEmpty()) {
                a2 = dbsg.i(aogeVar);
                timelineWrapper = timelineWrapper4;
            } else {
                dcdc<anms> c = anlw.c(aogeVar.c());
                int i5 = 0;
                while (i5 < c.size()) {
                    anms anmsVar = c.get(i5);
                    long micros = TimeUnit.MILLISECONDS.toMicros(anmsVar.g);
                    long micros2 = TimeUnit.MILLISECONDS.toMicros(anmsVar.h);
                    int i6 = c.get(i5).m;
                    int i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    }
                    if (i7 != 0) {
                        if (i7 == 1) {
                            if (!anmsVar.g()) {
                                TimelineWrapper.nativeInsertInferredActivitySegment(timelineWrapper4.a, i5, micros, micros2, anmsVar.f);
                            } else {
                                timelineWrapper4.b(i5, micros, micros2, 0L, anmsVar.f);
                            }
                        }
                        i4 = i5;
                        dcdcVar2 = c;
                        dbrnVar = dbrnVar2;
                    } else {
                        akqi d2 = anmq.d(anmsVar.j.c(new anmq(dbpy.a, 0.0f)).c());
                        long micros3 = TimeUnit.MILLISECONDS.toMicros(anmsVar.i.c(Long.valueOf(((eapd) dmjw.a).a)).longValue());
                        if (!anmsVar.g()) {
                            i4 = i5;
                            dcdcVar2 = c;
                            dbrnVar = dbrnVar2;
                            timelineWrapper4 = timelineWrapper4;
                            TimelineWrapper.nativeInsertInferredPlaceVisit(timelineWrapper4.a, i4, micros, micros2, d2.b, d2.c, anmsVar.f, micros3);
                        } else {
                            long j2 = d2.b;
                            long j3 = d2.c;
                            boolean z = anmsVar.f;
                            i4 = i5;
                            dcdcVar2 = c;
                            dbrnVar = dbrnVar2;
                            timelineWrapper = timelineWrapper4;
                            try {
                                timelineWrapper4.a(i5, micros, micros2, 0L, false, j2, j3, z, z, micros3);
                                timelineWrapper4 = timelineWrapper;
                            } catch (Throwable th4) {
                                th = th4;
                                th = th;
                                timelineWrapper.close();
                                throw th;
                            }
                        }
                    }
                    i5 = i4 + 1;
                    c = dcdcVar2;
                    dbrnVar2 = dbrnVar;
                }
                dcdc<anms> dcdcVar4 = c;
                dbrn dbrnVar3 = dbrnVar2;
                int size = dcdcVar4.size();
                int i8 = 0;
                while (i8 < dcdcVar.size()) {
                    anlp anlpVar = dcdcVar3.get(i8);
                    akqi d3 = anmq.d(anlpVar.c());
                    int i9 = size + i8;
                    long micros4 = TimeUnit.MILLISECONDS.toMicros(anlpVar.g());
                    long micros5 = TimeUnit.MILLISECONDS.toMicros(anlpVar.h());
                    if (anlpVar instanceof anlg) {
                        timelineWrapper4.b(i9, micros4, micros5, anlpVar.i(), anlpVar.e());
                        i2 = i8;
                        i3 = size;
                        timelineWrapper3 = timelineWrapper4;
                    } else {
                        long i10 = anlpVar.i();
                        boolean b = anlpVar.b();
                        int i11 = i8;
                        long j4 = d3.b;
                        int i12 = size;
                        long j5 = d3.c;
                        boolean e = anlpVar.e();
                        boolean f = anlpVar.f();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        if (!(anlpVar instanceof anmt)) {
                            j = ((eapd) dmjw.a).a;
                        } else {
                            j = ((anmt) anlpVar).a;
                        }
                        i2 = i11;
                        i3 = i12;
                        timelineWrapper3 = timelineWrapper4;
                        try {
                            timelineWrapper4.a(i9, micros4, micros5, i10, b, j4, j5, e, f, timeUnit.toMicros(j));
                        } catch (Throwable th5) {
                            th = th5;
                            timelineWrapper = timelineWrapper3;
                            timelineWrapper.close();
                            throw th;
                        }
                    }
                    i8 = i2 + 1;
                    dcdcVar3 = dcdcVar;
                    size = i3;
                    timelineWrapper4 = timelineWrapper3;
                }
                int i13 = size;
                TimelineWrapper timelineWrapper5 = timelineWrapper4;
                int i14 = 1;
                try {
                    long nativeExtractItems = TimelineWrapper.nativeExtractItems(timelineWrapper5.a);
                    int nativeGetItemsCount = TimelineWrapper.nativeGetItemsCount(nativeExtractItems);
                    dccx dccxVar = new dccx();
                    for (int i15 = 0; i15 < nativeGetItemsCount; i15++) {
                        long nativeGetItemCheckinTimeMicros = TimelineWrapper.nativeGetItemCheckinTimeMicros(nativeExtractItems, i15);
                        dccxVar.g(new anlh(TimelineWrapper.nativeGetItemId(nativeExtractItems, i15), TimeUnit.MICROSECONDS.toMillis(TimelineWrapper.nativeGetItemStartMicros(nativeExtractItems, i15)), TimeUnit.MICROSECONDS.toMillis(TimelineWrapper.nativeGetItemEndMicros(nativeExtractItems, i15)), nativeGetItemCheckinTimeMicros == deba.c(((eapd) dmjw.a).a, 1000L) ? dbpy.a : dbsg.i(Long.valueOf(TimeUnit.MICROSECONDS.toMillis(nativeGetItemCheckinTimeMicros))), TimelineWrapper.nativeGetItemIsConfirmed(nativeExtractItems, i15), TimelineWrapper.nativeGetItemIsOngoing(nativeExtractItems, i15)));
                    }
                    dcdc f2 = dccxVar.f();
                    TimelineWrapper.nativeDestroyItems(nativeExtractItems);
                    dmjy dmjyVar = (dmjy) dbrnVar3.a(dcdc.w(dclu.d(anlw.a).c(), dcdcVar4));
                    dccx F = dcdc.F();
                    int size2 = f2.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        annc anncVar = (annc) f2.get(i16);
                        if (anncVar.a() < 0) {
                            Object[] objArr = new Object[i14];
                            objArr[0] = Integer.valueOf(anncVar.a());
                            bvoo.h("Invalid edited item ID: %s", objArr);
                            timelineWrapper2 = timelineWrapper5;
                            i = i13;
                        } else {
                            i = i13;
                            if (anncVar.a() < i) {
                                d = dcdcVar4.get(anncVar.a());
                                if (!anncVar.e() || d.m != i14 || !d.j.a()) {
                                    timelineWrapper2 = timelineWrapper5;
                                } else {
                                    String c2 = d.j.b().c();
                                    if (c2 == null) {
                                        bvoo.h("Missing feature ID of existing place visit.", new Object[0]);
                                        timelineWrapper2 = timelineWrapper5;
                                    } else {
                                        eapd eapdVar = new eapd(anncVar.b());
                                        timelineWrapper2 = timelineWrapper5;
                                        eapd eapdVar2 = new eapd(anncVar.c());
                                        anmr j6 = d.j();
                                        j6.c();
                                        d = (anms) dmjy.a(c2, j6.a(), b(eapdVar, eapdVar2, dcdcVar4));
                                    }
                                }
                            } else {
                                timelineWrapper2 = timelineWrapper5;
                                anlp anlpVar2 = dcdcVar.get(anncVar.a() - i);
                                if (!anlpVar2.a()) {
                                    d = anlpVar2.d(dbpy.a);
                                } else {
                                    d = (anms) dmjy.a(anlpVar2.c(), anlpVar2.d(dbsg.j((anmq) dmjyVar.a.get(anlpVar2.c()))), b(new eapd(anlpVar2.g()), new eapd(anlpVar2.h()), dcdcVar4));
                                }
                            }
                            anmr j7 = d.j();
                            j7.b = anncVar.b();
                            j7.c = anncVar.c();
                            j7.d = anncVar.d();
                            j7.f = anncVar.f();
                            F.g(j7.a());
                            i16++;
                            i13 = i;
                            timelineWrapper5 = timelineWrapper2;
                            i14 = 1;
                        }
                        i16++;
                        i13 = i;
                        timelineWrapper5 = timelineWrapper2;
                        i14 = 1;
                    }
                    timelineWrapper = timelineWrapper5;
                    a2 = anlw.a(aogeVar, F.f());
                } catch (Throwable th6) {
                    th = th6;
                    timelineWrapper = timelineWrapper5;
                    th = th;
                    timelineWrapper.close();
                    throw th;
                }
            }
            timelineWrapper.close();
            return a2;
        } catch (Throwable th7) {
            th = th7;
            timelineWrapper = timelineWrapper4;
        }
    }
}
