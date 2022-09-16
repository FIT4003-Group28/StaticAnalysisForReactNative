package com.google.android.libraries.youtube.player.features.markers.sync;

import android.util.Pair;
import com.google.android.libraries.youtube.player.features.markers.sync.TimedSyncObserverImpl;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class TimedSyncObserverImpl implements ahxo {
    public long a;
    private final airw b;
    private final aypf c = new aypf();
    private final Map d = new HashMap();
    private final ahxn e;

    public TimedSyncObserverImpl(airw airwVar, ahxn ahxnVar) {
        this.b = airwVar;
        this.e = ahxnVar;
    }

    @Override // defpackage.ahxo
    public final void g(String str, String str2) {
        Pair create = Pair.create(str, str2);
        ahxj ahxjVar = (ahxj) this.d.get(create);
        if (ahxjVar == null) {
            return;
        }
        ahxjVar.c();
        this.d.remove(create);
    }

    @Override // defpackage.ahxo
    public final void i(String str, String str2, ampq ampqVar) {
        Pair create = Pair.create(str, str2);
        if (this.d.containsKey(create)) {
            return;
        }
        ahxn ahxnVar = this.e;
        aagi aagiVar = (aagi) ahxnVar.a.get();
        aagiVar.getClass();
        afvn afvnVar = (afvn) ahxnVar.b.get();
        afvnVar.getClass();
        aafo aafoVar = (aafo) ahxnVar.c.get();
        aafoVar.getClass();
        str.getClass();
        str2.getClass();
        ahxm ahxmVar = new ahxm(aagiVar, afvnVar, aafoVar, str, str2, ampqVar);
        ahxmVar.b();
        this.d.put(create, ahxmVar);
        j(this.a);
    }

    public final void j(long j) {
        for (ahxj ahxjVar : this.d.values()) {
            ahxjVar.a(j);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.c.c();
        for (ahxj ahxjVar : this.d.values()) {
            ahxjVar.c();
        }
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        if (i == 4 || i == 5 || j == this.a) {
            return;
        }
        this.a = j;
        j(j);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        for (ahxj ahxjVar : this.d.values()) {
            ahxjVar.b();
        }
        this.c.d(this.b.G().e.aa(new ayqb() { // from class: ahxp
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                TimedSyncObserverImpl timedSyncObserverImpl = TimedSyncObserverImpl.this;
                long e = ((ahhx) obj).e();
                if (e == timedSyncObserverImpl.a) {
                    return;
                }
                timedSyncObserverImpl.a = e;
                timedSyncObserverImpl.j(e);
            }
        }, ahqs.j));
    }
}
