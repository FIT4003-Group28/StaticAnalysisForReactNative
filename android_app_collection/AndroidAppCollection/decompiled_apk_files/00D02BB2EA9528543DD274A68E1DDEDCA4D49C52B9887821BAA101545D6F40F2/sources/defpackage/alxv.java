package defpackage;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alxv  reason: default package */
/* loaded from: classes.dex */
public final class alxv {
    @dzsi
    public final dmve a;
    @dzsi
    public final dmue b;
    public final AtomicLong c = new AtomicLong(0);
    public final byte[] d;
    private final int e;
    @dzsi
    private dzls f;

    public alxv(byte[] bArr, dmwb dmwbVar) {
        dmue dmueVar;
        int d;
        dmwb dmwbVar2 = dmwb.MULTIZOOM_STYLE_TABLE;
        int ordinal = dmwbVar.ordinal();
        dmve dmveVar = null;
        if (ordinal == 0) {
            dmve dmveVar2 = new dmve();
            dmveVar2.R(bArr, 0, bArr.length);
            dmveVar = dmveVar2;
            dmueVar = null;
        } else if (ordinal == 1 || ordinal == 2) {
            dmueVar = new dmue();
            dmueVar.R(bArr, 0, bArr.length);
        } else {
            dmueVar = null;
        }
        if (dmveVar != null) {
            d = dmveVar.d();
        } else {
            dbsk.s(dmueVar);
            d = dmueVar.d();
        }
        this.e = d;
        this.a = dmveVar;
        this.b = dmueVar;
        if (dmveVar != null) {
            this.d = dmveVar.h().toString().getBytes();
            return;
        }
        dbsk.s(dmueVar);
        this.d = dmueVar.z().toString().getBytes();
    }

    public final int a(long j) {
        int binarySearch;
        int i;
        long B;
        dmue dmueVar = this.b;
        if (dmueVar != null) {
            int binarySearch2 = Collections.binarySearch(new alxt(dmueVar), Long.valueOf(j));
            if (binarySearch2 >= 0 && this.b.B(binarySearch2) == j) {
                return binarySearch2;
            }
        } else {
            dmve dmveVar = this.a;
            if (dmveVar != null && (binarySearch = Collections.binarySearch(new alxw(dmveVar), Long.valueOf(j))) >= 0 && this.a.k(binarySearch) == j) {
                return binarySearch;
            }
        }
        synchronized (this) {
            if (this.f == null) {
                dzls dzlsVar = new dzls(this.e);
                this.f = dzlsVar;
                dzlsVar.a = -1;
                for (int i2 = 0; i2 < this.e; i2++) {
                    dmve dmveVar2 = this.a;
                    if (dmveVar2 != null) {
                        B = dmveVar2.k(i2);
                    } else {
                        dmue dmueVar2 = this.b;
                        dbsk.s(dmueVar2);
                        B = dmueVar2.B(i2);
                    }
                    dzls dzlsVar2 = this.f;
                    dbsk.s(dzlsVar2);
                    dzlsVar2.a(B, i2);
                }
            }
            dzls dzlsVar3 = this.f;
            dbsk.s(dzlsVar3);
            i = dzlsVar3.i(j);
        }
        return i;
    }

    public final synchronized int b(long j) {
        int binarySearch;
        dmue dmueVar = this.b;
        if (dmueVar != null) {
            int binarySearch2 = Collections.binarySearch(new alxu(dmueVar), Integer.valueOf((int) j));
            if (binarySearch2 >= 0) {
                return this.b.y(binarySearch2).e();
            }
        } else {
            dmve dmveVar = this.a;
            if (dmveVar != null && (binarySearch = Collections.binarySearch(new alxx(dmveVar), Integer.valueOf((int) j))) >= 0) {
                return this.a.g(binarySearch).e();
            }
        }
        return -1;
    }
}
