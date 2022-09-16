package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aiuy */
/* loaded from: classes.dex */
public final class aiuy implements afuc {
    static final int a = (int) TimeUnit.DAYS.toHours(30);
    static final aswe[] b = {aswe.USER_AUTH, aswe.VISITOR_ID, aswe.PLUS_PAGE_ID};
    public final aiut c;
    public final aqlc d;
    public aswi e;
    private final afvn f;
    private final aasw g;
    private afta h;

    public aiuy(afvn afvnVar, aasw aaswVar, aiut aiutVar, aacz aaczVar) {
        afvnVar.getClass();
        this.f = afvnVar;
        aaswVar.getClass();
        this.g = aaswVar;
        this.c = aiutVar;
        aaczVar.getClass();
        this.d = aius.e(aaczVar);
    }

    public static /* synthetic */ void d(Throwable th) {
        zep.d("Request failed for attestation challenge", th);
    }

    @Override // defpackage.afuc
    public final afta a() {
        if (this.h == null) {
            aopa createBuilder = aqlf.a.createBuilder();
            aqlc aqlcVar = this.d;
            if (aqlcVar != null && (aqlcVar.b & 8) != 0) {
                aqlf aqlfVar = aqlcVar.e;
                if (aqlfVar == null) {
                    aqlfVar = aqlf.a;
                }
                int i = aqlfVar.c;
                createBuilder.copyOnWrite();
                aqlf aqlfVar2 = (aqlf) createBuilder.instance;
                aqlfVar2.b |= 1;
                aqlfVar2.c = i;
                aqlf aqlfVar3 = this.d.e;
                if (aqlfVar3 == null) {
                    aqlfVar3 = aqlf.a;
                }
                int i2 = aqlfVar3.d;
                createBuilder.copyOnWrite();
                aqlf aqlfVar4 = (aqlf) createBuilder.instance;
                aqlfVar4.b |= 2;
                aqlfVar4.d = i2;
            } else {
                int i3 = a;
                createBuilder.copyOnWrite();
                aqlf aqlfVar5 = (aqlf) createBuilder.instance;
                aqlfVar5.b |= 1;
                aqlfVar5.c = i3;
                createBuilder.copyOnWrite();
                aqlf aqlfVar6 = (aqlf) createBuilder.instance;
                aqlfVar6.b |= 2;
                aqlfVar6.d = 30;
            }
            this.h = new aiux(createBuilder);
        }
        return this.h;
    }

    @Override // defpackage.afuc
    public final String b() {
        return "attestation";
    }

    @Override // defpackage.afuc
    public final void c(String str, aftv aftvVar, List list) {
        final afvm d = this.f.d(str);
        if (d == null) {
            d = afvl.a;
            zep.l("Cannot resolve Identity from identityId. Dispatching as Identities.PSEUDONYMOUS.");
        }
        afuq afuqVar = aftvVar.a;
        aasv a2 = this.g.a(d, afuqVar.a, afuqVar.b);
        a2.b = 2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aopa aopaVar = (aopa) it.next();
            aopa createBuilder = apig.a.createBuilder();
            try {
                createBuilder.m29mergeFrom(((oro) aopaVar.instance).e, aoos.b());
                a2.a.add((apig) createBuilder.mo39build());
            } catch (aopx unused) {
                afus.b(2, 12, "AttestationDelayedEventDispatcher.dispatchEvents() could not deserialize AttestationObjectId");
            }
        }
        if (a2.t()) {
            return;
        }
        ylx.k(this.g.b(a2, anjk.a), anjk.a, aiuv.a, new ylw() { // from class: aiuw
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                aiuy aiuyVar = aiuy.this;
                final afvm afvmVar = d;
                arlb arlbVar = (arlb) obj;
                if (arlbVar == null || (arlbVar.b & 2) == 0) {
                    afus.b(2, 12, "AttestationDelayedEventDispatcher.dispatchEvents() response from AttestationChallengeService is null");
                    return;
                }
                aiut aiutVar = aiuyVar.c;
                String str2 = arlbVar.d;
                aopa createBuilder2 = atzm.a.createBuilder();
                createBuilder2.copyOnWrite();
                atzm atzmVar = (atzm) createBuilder2.instance;
                str2.getClass();
                atzmVar.b |= 1;
                atzmVar.c = str2;
                atzm atzmVar2 = (atzm) createBuilder2.mo39build();
                if (aiuyVar.e == null) {
                    aqlc aqlcVar = aiuyVar.d;
                    if (aqlcVar != null) {
                        aswi aswiVar = aqlcVar.d;
                        if (aswiVar == null) {
                            aswiVar = aswi.a;
                        }
                        if (!aswiVar.c.isEmpty()) {
                            aswi aswiVar2 = aiuyVar.d.d;
                            if (aswiVar2 == null) {
                                aswiVar2 = aswi.a;
                            }
                            aiuyVar.e = aswiVar2;
                        }
                    }
                    aopa createBuilder3 = aswi.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    aswi aswiVar3 = (aswi) createBuilder3.instance;
                    aswiVar3.b |= 1;
                    aswiVar3.c = "https://m.youtube.com/api/stats/atr?ns=yt&ver=2";
                    aswe[] asweVarArr = aiuy.b;
                    int length = asweVarArr.length;
                    for (int i = 0; i < 3; i++) {
                        aswe asweVar = asweVarArr[i];
                        aopa createBuilder4 = aswf.a.createBuilder();
                        createBuilder4.copyOnWrite();
                        aswf aswfVar = (aswf) createBuilder4.instance;
                        aswfVar.c = asweVar.g;
                        aswfVar.b |= 1;
                        createBuilder3.copyOnWrite();
                        aswi aswiVar4 = (aswi) createBuilder3.instance;
                        aswf aswfVar2 = (aswf) createBuilder4.mo39build();
                        aswfVar2.getClass();
                        aopu aopuVar = aswiVar4.e;
                        if (!aopuVar.c()) {
                            aswiVar4.e = aopi.mutableCopy(aopuVar);
                        }
                        aswiVar4.e.add(aswfVar2);
                    }
                    aiuyVar.e = (aswi) createBuilder3.mo39build();
                }
                TrackingUrlModel trackingUrlModel = new TrackingUrlModel(aiuyVar.e);
                afwu afwuVar = (afwu) aiutVar.a.get();
                afwuVar.getClass();
                Executor executor = (Executor) aiutVar.b.get();
                executor.getClass();
                ((Context) aiutVar.c.get()).getClass();
                qys qysVar = (qys) aiutVar.d.get();
                qysVar.getClass();
                afvn afvnVar = (afvn) aiutVar.e.get();
                afvnVar.getClass();
                yrj yrjVar = (yrj) aiutVar.f.get();
                yrjVar.getClass();
                afug afugVar = (afug) aiutVar.g.get();
                afugVar.getClass();
                aacz aaczVar = (aacz) aiutVar.h.get();
                aaczVar.getClass();
                atzmVar2.getClass();
                final aius aiusVar = new aius(afwuVar, executor, qysVar, afvnVar, yrjVar, afugVar, aaczVar, atzmVar2, trackingUrlModel);
                aiusVar.a.execute(new Runnable() { // from class: aiuq
                    @Override // java.lang.Runnable
                    public final void run() {
                        aius.this.c(afvmVar);
                    }
                });
            }
        });
    }
}
