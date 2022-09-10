package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ClearcutMetricSnapshotTransmitter implements cxfm {
    private volatile cnjz a;
    private volatile cnjz b;

    ClearcutMetricSnapshotTransmitter() {
        this(null);
    }

    public ClearcutMetricSnapshotTransmitter(byte[] bArr) {
    }

    @Override // defpackage.cxfm
    public final dehn<Void> a(Context context, cxfl cxflVar) {
        Object b;
        cnjz cnjzVar;
        dsqv<cxfl, cxfr> dsqvVar = cxfr.h;
        cxflVar.f(dsqvVar);
        dbsk.b(cxflVar.V.k(dsqvVar.d), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        if (cxflVar.b == null) {
            eacd eacdVar = eacd.u;
        }
        dsqv<cxfl, cxfr> dsqvVar2 = cxfr.h;
        cxflVar.f(dsqvVar2);
        Object l = cxflVar.V.l(dsqvVar2.d);
        if (l == null) {
            b = dsqvVar2.b;
        } else {
            b = dsqvVar2.b(l);
        }
        cxfr cxfrVar = (cxfr) b;
        if (cxfrVar.d) {
            cnjzVar = this.b;
            if (cnjzVar == null) {
                synchronized (this) {
                    cnjzVar = this.b;
                    if (cnjzVar == null) {
                        cnjz a = cnjz.a(context, null);
                        this.b = a;
                        cnjzVar = a;
                    }
                }
            }
        } else {
            cnjzVar = this.a;
            if (cnjzVar == null) {
                synchronized (this) {
                    cnjzVar = this.a;
                    if (cnjzVar == null) {
                        cnjzVar = new cnjz(context, null, null);
                        this.a = cnjzVar;
                    }
                }
            }
        }
        final eacd eacdVar2 = cxflVar.b;
        if (eacdVar2 == null) {
            eacdVar2 = eacd.u;
        }
        cnjv cnjvVar = new cnjv(cnjzVar, new cnjx(eacdVar2) { // from class: cnjr
            private final dssj a;

            {
                this.a = eacdVar2;
            }

            @Override // defpackage.cnjx
            public final byte[] a() {
                dssj dssjVar = this.a;
                cnoa<cnky> cnoaVar = cnjz.a;
                return dssjVar.bS();
            }
        });
        cnjvVar.i = cxfrVar.b;
        String str = cxfrVar.e;
        if (!dbsj.d(str)) {
            if (!cnjvVar.a.i) {
                dujh dujhVar = cnjvVar.c;
                if (dujhVar.c) {
                    dujhVar.bF();
                    dujhVar.c = false;
                }
                duji dujiVar = (duji) dujhVar.b;
                duji dujiVar2 = duji.m;
                str.getClass();
                dujiVar.a |= 16777216;
                dujiVar.l = str;
            } else {
                throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
            }
        }
        if (!cxfrVar.d) {
            if ((cxfrVar.a & 2) != 0) {
                cnjvVar.c(cxfrVar.c);
            }
            if ((cxfrVar.a & 16) != 0) {
                cnjvVar.f(cxfrVar.f);
            }
        }
        return deew.h(csac.b(cnjvVar.a()), dbrs.b(null), dege.a);
    }
}
