package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: aklx  reason: default package */
/* loaded from: classes.dex */
public final class aklx implements akko, ajgy, ynl {
    private final ajsa A;
    private final ajsf B;
    private final ajsf C;
    private final SharedPreferences D;
    private final ajsk E;
    private boolean F;
    public final apzg a;
    public final aaun b;
    public final yzj c;
    public final ExecutorService d;
    public final yni e;
    public final apgv f;
    public final Context g;
    public final aklw h;
    public final List i;
    public final aknz j;
    public final ces k;
    public final ajgz l;
    public final akli m;
    public Future n;
    public boolean o;
    public argj p;
    public View q;
    public boolean r;
    private final Executor s;
    private final ankw t;
    private final acti u;
    private final ajmy v;
    private final aafo w;
    private final ajxz x;
    private final akkp y;
    private final ajsa z;

    public aklx(apzg apzgVar, aaun aaunVar, acti actiVar, yzj yzjVar, ExecutorService executorService, yni yniVar, ajmy ajmyVar, apgv apgvVar, Context context, aafo aafoVar, ajxz ajxzVar, aklw aklwVar, akkp akkpVar, aknz aknzVar, ces cesVar, ajgz ajgzVar, akli akliVar, SharedPreferences sharedPreferences, ajsg ajsgVar, ajsk ajskVar, int i, int i2, Executor executor, ankw ankwVar) {
        apzgVar.getClass();
        this.a = apzgVar;
        executor.getClass();
        this.s = executor;
        this.t = ankwVar;
        aqxo.p(apzgVar.qn(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint));
        aaunVar.getClass();
        this.b = aaunVar;
        actiVar.getClass();
        this.u = actiVar;
        yzjVar.getClass();
        this.c = yzjVar;
        executorService.getClass();
        this.d = executorService;
        yniVar.getClass();
        this.e = yniVar;
        ajmyVar.getClass();
        this.v = ajmyVar;
        apgvVar.getClass();
        this.f = apgvVar;
        context.getClass();
        this.g = context;
        aafoVar.getClass();
        this.w = aafoVar;
        ajxzVar.getClass();
        this.x = ajxzVar;
        this.h = aklwVar;
        this.y = akkpVar;
        aknzVar.getClass();
        this.j = aknzVar;
        cesVar.getClass();
        this.k = cesVar;
        ajskVar.getClass();
        this.E = ajskVar;
        this.i = new ArrayList();
        ajqw ajqwVar = new ajqw();
        this.z = ajqwVar;
        this.B = ajsgVar.a(ajqwVar);
        ajqw ajqwVar2 = new ajqw();
        this.A = ajqwVar2;
        ajsf a = ajsgVar.a(ajqwVar2);
        this.C = a;
        a.rZ(new ajqy(i, i2));
        new aklu(this);
        ajgzVar.getClass();
        this.l = ajgzVar;
        akliVar.getClass();
        this.m = akliVar;
        sharedPreferences.getClass();
        this.D = sharedPreferences;
        ylr.c();
        aknzVar.a.clear();
        for (akny aknyVar : aknzVar.c) {
            aknzVar.b(aknyVar);
        }
    }

    public final List b() {
        try {
            return (List) this.n.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            zep.d("Error retrieving share-capable activities.", e);
            return new ArrayList();
        }
    }

    public final void c() {
        argj argjVar;
        View view;
        if (!this.r || (argjVar = this.p) == null || (view = this.q) == null) {
            return;
        }
        this.y.a(argjVar, view, this.j);
    }

    public final void d(aauu aauuVar) {
        Iterator it;
        aklk akloVar;
        apoj apojVar;
        aopc aopcVar;
        avnk avnkVar;
        avmx avmxVar;
        if (!this.o) {
            if (aauuVar.b == null) {
                aqia aqiaVar = aauuVar.a.d;
                if (aqiaVar == null) {
                    aqiaVar = aqia.a;
                }
                if ((aqiaVar.b & 1) != 0) {
                    aqia aqiaVar2 = aauuVar.a.d;
                    if (aqiaVar2 == null) {
                        aqiaVar2 = aqia.a;
                    }
                    avnq avnqVar = aqiaVar2.c;
                    if (avnqVar == null) {
                        avnqVar = avnq.a;
                    }
                    aauuVar.b = new aaux(avnqVar);
                }
            }
            aaux aauxVar = aauuVar.b;
            if (aauxVar == null) {
                zep.b("Unified share panel not returned.");
                this.c.c(R.string.common_error_generic);
                this.h.h();
                return;
            }
            aauxVar.b();
            avmy avmyVar = aauxVar.a.e;
            if (avmyVar == null) {
                avmyVar = avmy.a;
            }
            this.F = avmyVar.b == 133836655;
            this.u.d(acuo.a(21760), this.a, null);
            ((acsx) this.u).D(new acte(aauuVar.a()));
            if (aauuVar.a() != null) {
                this.u.u(new acte(aauuVar.a()), null);
            }
            avnd a = aauxVar.a();
            if (a != null) {
                aklj akljVar = new aklj(a, this.g, this.w);
                this.i.add(akljVar);
                akljVar.c(this.z);
                this.B.h(akljVar.a);
            }
            ajrj ajrjVar = new ajrj();
            if (aauxVar.b == null) {
                aauxVar.b = new ArrayList();
                avng avngVar = aauxVar.a.h;
                if (avngVar == null) {
                    avngVar = avng.a;
                }
                if ((avngVar.b & 1) != 0) {
                    List list = aauxVar.b;
                    avng avngVar2 = aauxVar.a.h;
                    if (avngVar2 == null) {
                        avngVar2 = avng.a;
                    }
                    avnf avnfVar = avngVar2.c;
                    if (avnfVar == null) {
                        avnfVar = avnf.a;
                    }
                    list.add(avnfVar);
                }
                for (avnh avnhVar : aauxVar.a.d) {
                    int i = avnhVar.b;
                    if ((i & 2) != 0) {
                        List list2 = aauxVar.b;
                        avmu avmuVar = avnhVar.c;
                        if (avmuVar == null) {
                            avmuVar = avmu.a;
                        }
                        aauxVar.b();
                        list2.add(new abgc(avmuVar));
                    } else if ((i & 4) != 0) {
                        List list3 = aauxVar.b;
                        avmz avmzVar = avnhVar.d;
                        if (avmzVar == null) {
                            avmzVar = avmz.a;
                        }
                        list3.add(avmzVar);
                    } else if ((i & 8) != 0) {
                        List list4 = aauxVar.b;
                        avnn avnnVar = avnhVar.e;
                        if (avnnVar == null) {
                            avnnVar = avnn.a;
                        }
                        list4.add(avnnVar);
                    } else if ((i & 64) != 0) {
                        List list5 = aauxVar.b;
                        avmq avmqVar = avnhVar.g;
                        if (avmqVar == null) {
                            avmqVar = avmq.a;
                        }
                        list5.add(avmqVar);
                    } else if ((i & 16) != 0) {
                        List list6 = aauxVar.b;
                        avnm avnmVar = avnhVar.f;
                        if (avnmVar == null) {
                            avnmVar = avnm.a;
                        }
                        list6.add(avnmVar);
                    }
                }
                avmy avmyVar2 = aauxVar.a.e;
                if (avmyVar2 == null) {
                    avmyVar2 = avmy.a;
                }
                if (avmyVar2.b == 133836655) {
                    List list7 = aauxVar.b;
                    avmy avmyVar3 = aauxVar.a.e;
                    if (avmyVar3 == null) {
                        avmyVar3 = avmy.a;
                    }
                    if (avmyVar3.b == 133836655) {
                        avmxVar = (avmx) avmyVar3.c;
                    } else {
                        avmxVar = avmx.a;
                    }
                    list7.add(avmxVar);
                }
            }
            List list8 = aauxVar.b;
            avnd a2 = aauxVar.a();
            if (a2 != null) {
                avnj avnjVar = a2.c;
                if (avnjVar == null) {
                    avnjVar = avnj.a;
                }
                if (avnjVar.b == 133737618) {
                    avnj avnjVar2 = a2.c;
                    if (avnjVar2 == null) {
                        avnjVar2 = avnj.a;
                    }
                    if (avnjVar2.b == 133737618) {
                        avnkVar = (avnk) avnjVar2.c;
                    } else {
                        avnkVar = avnk.a;
                    }
                    list8.add(0, avnkVar);
                }
                avnc avncVar = a2.b;
                if (avncVar == null) {
                    avncVar = avnc.a;
                }
                if ((avncVar.b & 1) != 0) {
                    avnc avncVar2 = a2.b;
                    if (avncVar2 == null) {
                        avncVar2 = avnc.a;
                    }
                    avms avmsVar = avncVar2.c;
                    if (avmsVar == null) {
                        avmsVar = avms.a;
                    }
                    list8.add(0, avmsVar);
                }
            }
            Iterator it2 = list8.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof avnn) {
                    it = it2;
                    akloVar = new akls((avnn) next, this.g, this.w, this.f, b(), this.h, this.e, this.v, this.j, this.u, this.F, this.s, this.t);
                } else {
                    it = it2;
                    if (next instanceof avnk) {
                        akloVar = new aklm((avnk) next, this.g, this.w);
                    } else if (next instanceof avnf) {
                        akloVar = new akld((avnf) next, this.g, this.v, this.w, this.x, this.D);
                    } else if (next instanceof avms) {
                        akloVar = new akkq((avms) next, this.g, this.w, this.E, this.u, this.h, this);
                    } else {
                        akloVar = next instanceof avnm ? new aklo((avnm) next, this.g, this.h, this.x, this.w) : null;
                    }
                }
                if (akloVar != null) {
                    this.i.add(akloVar);
                    akloVar.c(this.A);
                    ajrjVar.m(akloVar.lA());
                } else if (next instanceof avmx) {
                    avmx avmxVar2 = (avmx) next;
                    aknz aknzVar = this.j;
                    apok apokVar = avmxVar2.b;
                    if (apokVar == null) {
                        apokVar = apok.a;
                    }
                    if ((apokVar.b & 1) != 0) {
                        apok apokVar2 = avmxVar2.b;
                        if (apokVar2 == null) {
                            apokVar2 = apok.a;
                        }
                        apojVar = apokVar2.c;
                        if (apojVar == null) {
                            apojVar = apoj.a;
                        }
                    } else {
                        apojVar = null;
                    }
                    if (apojVar != null && (apojVar.b & 8192) != 0) {
                        apzg apzgVar = apojVar.n;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aopcVar = (aopc) apzgVar.mo52toBuilder();
                    } else if (aknzVar.d == null) {
                        aopcVar = (aopc) apzg.a.createBuilder();
                        aopcVar.e(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, SendShareEndpoint$SendShareToContactsEndpoint.a);
                    }
                    aopa mo52toBuilder = ((SendShareEndpoint$SendShareToContactsEndpoint) aopcVar.qm(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint)).mo52toBuilder();
                    if ((((SendShareEndpoint$SendShareToContactsEndpoint) mo52toBuilder.instance).b & 1) == 0) {
                        arnf arnfVar = arnf.a;
                        mo52toBuilder.copyOnWrite();
                        SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint) mo52toBuilder.instance;
                        arnfVar.getClass();
                        sendShareEndpoint$SendShareToContactsEndpoint.c = arnfVar;
                        sendShareEndpoint$SendShareToContactsEndpoint.b |= 1;
                    }
                    if ((((SendShareEndpoint$SendShareToContactsEndpoint) mo52toBuilder.instance).b & 2) == 0) {
                        arne arneVar = arne.a;
                        mo52toBuilder.copyOnWrite();
                        SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint2 = (SendShareEndpoint$SendShareToContactsEndpoint) mo52toBuilder.instance;
                        arneVar.getClass();
                        sendShareEndpoint$SendShareToContactsEndpoint2.d = arneVar;
                        sendShareEndpoint$SendShareToContactsEndpoint2.b |= 2;
                    }
                    aopcVar.e(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, (SendShareEndpoint$SendShareToContactsEndpoint) mo52toBuilder.mo39build());
                    aknzVar.d = (apzg) aopcVar.mo39build();
                }
                it2 = it;
            }
            this.C.h(ajrjVar);
            yni yniVar = this.e;
            this.C.b();
            yniVar.d(new ewq());
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            arrayList.addAll(this.i);
            for (aklk aklkVar : this.i) {
                aklkVar.b(arrayList);
            }
            akli akliVar = this.m;
            for (Object obj : arrayList) {
                if (obj instanceof akoj) {
                    akliVar.b.add((akoj) obj);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            for (apzg apzgVar2 : aauxVar.a.g) {
                this.w.c(apzgVar2, hashMap);
            }
            this.h.d(this.B, this.C);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.h.k((aabj) obj);
                return null;
            } else if (i == 1) {
                akly aklyVar = (akly) obj;
                this.h.h();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{aabj.class, akly.class};
    }

    @Override // defpackage.ajgy
    public final void lL() {
        this.h.h();
    }
}
