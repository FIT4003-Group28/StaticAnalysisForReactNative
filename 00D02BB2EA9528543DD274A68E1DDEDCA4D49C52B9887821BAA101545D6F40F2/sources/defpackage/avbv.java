package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avbv  reason: default package */
/* loaded from: classes2.dex */
public final class avbv {
    @dzsi
    public avkr a;
    public final List<akqs> b;
    public final Executor c;
    public final avbt d;
    public final avzm e;
    public final avzo f;
    public final crzm<avkr> g;
    @dzsi
    private akqs h;
    private boolean i;
    private boolean j;
    private final ckcw k;

    public avbv(ckcw ckcwVar, Executor executor, avzm avzmVar, avzo avzoVar, avij avijVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.i = false;
        this.j = false;
        this.d = new avbt(this);
        this.k = ckcwVar;
        this.c = executor;
        this.e = avzmVar;
        this.f = avzoVar;
        this.g = avijVar.C();
        this.h = null;
        arrayList.clear();
        this.i = false;
        this.j = false;
    }

    public final synchronized void a(dhjx dhjxVar) {
        dhkd dhkdVar = dhjxVar.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        akqs akqsVar = null;
        if (dhkdVar.b > 0) {
            dhkd dhkdVar2 = dhjxVar.d;
            if (dhkdVar2 == null) {
                dhkdVar2 = dhkd.d;
            }
            if (dhkdVar2.c > 0) {
                akqsVar = akyx.m(dhjxVar);
            }
        }
        this.h = akqsVar;
        c(b());
    }

    public final synchronized boolean b() {
        if (this.h == null) {
            return false;
        }
        for (akqs akqsVar : this.b) {
            akqs akqsVar2 = this.h;
            dbsk.s(akqsVar2);
            if (akqsVar.i(akqsVar2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void c(boolean z) {
        if (this.i == z) {
            return;
        }
        this.k.b(ckgx.OFFLINE_STATE, new avbq(z));
        this.i = z;
    }

    public final synchronized void d(boolean z) {
        if (this.j == z) {
            return;
        }
        this.k.b(ckgx.OFFLINE_STATE, new avbr(z));
        this.j = z;
    }
}
