package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cvme  reason: default package */
/* loaded from: classes5.dex */
public final class cvme implements cvmd {
    private final cvot a;
    private final cqat b;
    private final dxio<Set<cvpv>> c;
    private final dxio<dbsg<cvto>> d;
    private final cvlr e;

    public cvme(cvot cvotVar, dxio dxioVar, dxio dxioVar2, cvlr cvlrVar, cqat cqatVar) {
        this.a = cvotVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = cvlrVar;
        this.b = cqatVar;
    }

    private final void c(@dzsi cvkc cvkcVar, List<cvkj> list, @dzsi cvlq cvlqVar) {
        cvlp a = this.e.a(drwv.DISMISSED_REMOTE);
        a.i(cvkcVar);
        a.e(list);
        a.p(cvlqVar);
        a.a();
    }

    private final void d() {
        for (cvpv cvpvVar : this.c.a()) {
            cvpvVar.e();
        }
    }

    @Override // defpackage.cvmd
    public final void a(@dzsi cvkc cvkcVar, List<cvkj> list, cvix cvixVar, @dzsi cvlq cvlqVar) {
        EnumMap enumMap = new EnumMap(cvtm.class);
        ArrayList arrayList = new ArrayList();
        for (cvkj cvkjVar : list) {
            if (cvkjVar.s() != 3 && cvkjVar.q() != 3 && (cvkjVar.k().longValue() <= 0 || TimeUnit.MILLISECONDS.convert(cvkjVar.k().longValue(), TimeUnit.MICROSECONDS) > System.currentTimeMillis())) {
                Iterator<cvpv> it = this.c.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        int d = it.next().d(cvkcVar, cvkjVar);
                        if (d == 0) {
                            throw null;
                        }
                        if (d != 1) {
                            break;
                        }
                    } else {
                        if (this.d.a().a()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            cvtn a = this.d.a().b().a(cvkcVar, cvkjVar);
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            if (a.a()) {
                                cvtm b = a.b();
                                if (!enumMap.containsKey(b)) {
                                    enumMap.put((EnumMap) b, (cvtm) new ArrayList());
                                }
                                ((List) enumMap.get(b)).add(cvkjVar);
                            } else {
                                if (cvlqVar != null) {
                                    cvlqVar.d = Long.valueOf(currentTimeMillis2);
                                }
                                this.a.a(cvkcVar, cvkjVar, false, false, cvixVar, null, cvlqVar);
                            }
                        } else {
                            this.a.a(cvkcVar, cvkjVar, false, false, cvixVar, null, cvlqVar);
                        }
                        d();
                    }
                }
            } else {
                arrayList.add(cvkjVar.a());
                d();
            }
        }
        if (!arrayList.isEmpty()) {
            List<cvkj> b2 = this.a.b(cvkcVar, arrayList, 1, cvlqVar, 8);
            if (!b2.isEmpty()) {
                c(cvkcVar, b2, cvlqVar);
            }
        }
        for (cvtm cvtmVar : enumMap.keySet()) {
            cvlp b3 = this.e.b(4);
            b3.i(cvkcVar);
            b3.e((List) enumMap.get(cvtmVar));
            b3.s(2);
            b3.f(cvtmVar);
            b3.p(cvlqVar);
            b3.a();
        }
    }

    @Override // defpackage.cvmd
    public final void b(@dzsi cvkc cvkcVar, List<String> list, dsef dsefVar, int i, int i2) {
        int a;
        int i3;
        if (!list.isEmpty()) {
            int a2 = dsdz.a(dsefVar.e);
            if ((a2 != 0 && a2 == 3) || ((a = dscl.a(dsefVar.c)) != 0 && a == 3)) {
                cvot cvotVar = this.a;
                int i4 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i4 == 0 || i4 == 1 || i4 == 2) {
                    i3 = 2;
                } else if (i4 != 3) {
                    throw new AssertionError("Unknown notificationEventSource");
                } else {
                    i3 = 1;
                }
                List<cvkj> b = cvotVar.b(cvkcVar, list, i3, null, i2);
                if (i == 4 && !b.isEmpty()) {
                    c(cvkcVar, b, null);
                }
            }
            for (cvpv cvpvVar : this.c.a()) {
                cvpvVar.g(cvkcVar, list, dsefVar);
            }
        }
    }
}
