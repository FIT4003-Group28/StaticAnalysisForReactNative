package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ibb  reason: default package */
/* loaded from: classes3.dex */
public final class ibb implements afzf {
    final /* synthetic */ ReelSequenceController$PendingContinuation a;
    final /* synthetic */ int b;
    final /* synthetic */ ihq c;
    final /* synthetic */ long d;
    final /* synthetic */ ibd e;

    public ibb(ibd ibdVar, ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation, int i, ihq ihqVar, long j) {
        this.e = ibdVar;
        this.a = reelSequenceController$PendingContinuation;
        this.b = i;
        this.c = ihqVar;
        this.d = j;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        int i;
        ArrayList arrayList;
        synchronized (this.e.g) {
            this.a.a = false;
        }
        zep.d("ReelWatchSequence Error", cffVar);
        int i2 = this.b - 1;
        if (i2 >= 0) {
            this.e.a(this.a, this.c, i2);
            return;
        }
        synchronized (this.e.g) {
            arrayList = new ArrayList(this.e.j);
            this.e.j.clear();
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((ibc) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        final arty artyVar = (arty) obj;
        long d = this.e.e.d();
        long j = this.d;
        Executor executor = this.e.f;
        final ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation = this.a;
        final long j2 = d - j;
        executor.execute(new Runnable() { // from class: iba
            @Override // java.lang.Runnable
            public final void run() {
                boolean a;
                boolean a2;
                ArrayList arrayList;
                long j3;
                boolean z;
                Optional of;
                ArrayList arrayList2;
                long j4;
                Optional of2;
                ibb ibbVar = ibb.this;
                ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation2 = reelSequenceController$PendingContinuation;
                arty artyVar2 = artyVar;
                long j5 = j2;
                ibd ibdVar = ibbVar.e;
                String str = (artyVar2 == null || (artyVar2.b & 4) == 0) ? null : artyVar2.g;
                String str2 = (artyVar2 == null || (artyVar2.b & 2) == 0) ? null : artyVar2.e;
                synchronized (ibdVar.g) {
                    reelSequenceController$PendingContinuation2.a = false;
                    reelSequenceController$PendingContinuation2.b = null;
                    if (!amps.e(str)) {
                        ibdVar.h.b = str;
                    }
                    if (!amps.e(str2)) {
                        ibdVar.i.b = str2;
                    }
                    a = ibdVar.h.a();
                    a2 = ibdVar.i.a();
                    ibdVar.k = !a2;
                }
                if (artyVar2 != null) {
                    if (artyVar2.f.size() > 0) {
                        aopu aopuVar = artyVar2.f;
                        ArrayList arrayList3 = new ArrayList(aopuVar.size());
                        ArrayList arrayList4 = new ArrayList(aopuVar.size());
                        for (artw artwVar : amxp.t(aopuVar)) {
                            if ((artwVar.b & 1) != 0) {
                                apzg apzgVar = artwVar.c;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                                if (apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                    apzg apzgVar2 = artwVar.c;
                                    if (apzgVar2 == null) {
                                        apzgVar2 = apzg.a;
                                    }
                                    arrayList3.add(apzgVar2);
                                    if (artwVar.d.d() != 0) {
                                        of2 = Optional.of(artwVar.d);
                                    } else {
                                        of2 = Optional.empty();
                                    }
                                    arrayList4.add(of2);
                                }
                            }
                        }
                        iai iaiVar = ibdVar.b;
                        long f = iaiVar.f();
                        hzs hzsVar = iaiVar.m;
                        aqxo.y(arrayList3.size() == arrayList4.size());
                        if (arrayList3.isEmpty()) {
                            j3 = j5;
                            z = a2;
                        } else {
                            synchronized (hzsVar.d) {
                                if (hzsVar.d.isEmpty()) {
                                    arrayList2 = arrayList3;
                                    j4 = 0;
                                } else {
                                    arrayList2 = arrayList3;
                                    j4 = ((iaj) hzsVar.d.get(0)).a;
                                }
                                int size = arrayList2.size() - 1;
                                while (size >= 0) {
                                    ArrayList arrayList5 = arrayList2;
                                    apzg apzgVar3 = (apzg) arrayList5.get(size);
                                    aqxo.y(apzgVar3.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
                                    j4--;
                                    hzsVar.d.add(0, new iaj(j4, apzgVar3, (aoob) ((Optional) arrayList4.get(size)).orElse(null), false, hzsVar.g));
                                    size--;
                                    a2 = a2;
                                    arrayList2 = arrayList5;
                                    j5 = j5;
                                    arrayList4 = arrayList4;
                                }
                                j3 = j5;
                                z = a2;
                            }
                            hzsVar.mr();
                        }
                        int B = iaiVar.m.B(f);
                        if (B != -1) {
                            iaiVar.x = B;
                            iaiVar.n.ab(B);
                            iag iagVar = iaiVar.l;
                            if (iagVar != null && iagVar.b.i.get() >= 0) {
                                iagVar.b.h.execute(new iaf(iagVar, 3));
                            }
                        }
                    } else {
                        j3 = j5;
                        z = a2;
                    }
                    if (artyVar2.d.size() > 0) {
                        aopu<artw> aopuVar2 = artyVar2.d;
                        ArrayList arrayList6 = new ArrayList(aopuVar2.size());
                        ArrayList arrayList7 = new ArrayList(aopuVar2.size());
                        ArrayList arrayList8 = new ArrayList(aopuVar2.size());
                        for (artw artwVar2 : aopuVar2) {
                            if ((artwVar2.b & 1) != 0) {
                                apzg apzgVar4 = artwVar2.c;
                                if (apzgVar4 == null) {
                                    apzgVar4 = apzg.a;
                                }
                                if (apzgVar4.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                    apzg apzgVar5 = artwVar2.c;
                                    if (apzgVar5 == null) {
                                        apzgVar5 = apzg.a;
                                    }
                                    arrayList6.add(apzgVar5);
                                    apzg apzgVar6 = artwVar2.c;
                                    if (apzgVar6 == null) {
                                        apzgVar6 = apzg.a;
                                    }
                                    arrayList7.add((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar6.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
                                    if (artwVar2.d.d() != 0) {
                                        of = Optional.of(artwVar2.d);
                                    } else {
                                        of = Optional.empty();
                                    }
                                    arrayList8.add(of);
                                }
                            }
                        }
                        ibdVar.b.k(arrayList6, arrayList8);
                        ibdVar.d.f(arrayList7);
                    }
                    hzs hzsVar2 = ibdVar.b.m;
                    if (hzsVar2.f && hzsVar2.h != a) {
                        hzsVar2.h = a;
                        hzsVar2.ok(hzsVar2.C());
                    }
                    ibdVar.b.m.K(z);
                    Optional optional = (Optional) ibdVar.c.get();
                    if (optional.isPresent()) {
                        ((ieh) optional.get()).d.b(j3);
                    }
                }
                synchronized (ibdVar.g) {
                    arrayList = new ArrayList(ibdVar.j);
                    ibdVar.j.clear();
                }
                int size2 = arrayList.size();
                for (int i = 0; i < size2; i++) {
                    ((ibc) arrayList.get(i)).b();
                }
            }
        });
    }
}
