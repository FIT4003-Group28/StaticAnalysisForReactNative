package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: akxz  reason: default package */
/* loaded from: classes.dex */
public final class akxz implements akyh {
    public static final /* synthetic */ int s = 0;
    private static final Duration t = Duration.ofHours(24);
    public final Context a;
    public final snc b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final Executor e;
    public final Executor f;
    public final aadd g;
    public final akzf h;
    public final akzp i;
    public final axnm j;
    public final alak k;
    public final algq l;
    public final albf m;
    public final alfz n;
    final alal o;
    final Map p = new HashMap();
    final Map q = new ConcurrentHashMap();
    final Map r = new ConcurrentHashMap();
    private final akzg u;
    private final akze v;
    private final Map w;

    public akxz(Context context, snc sncVar, Map map, Executor executor, ScheduledExecutorService scheduledExecutorService, Executor executor2, aadd aaddVar, akzf akzfVar, akzg akzgVar, akzp akzpVar, algq algqVar, axnm axnmVar, alak alakVar, akze akzeVar, albf albfVar, alfz alfzVar) {
        this.a = context;
        this.b = sncVar;
        this.w = map;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = anlz.g(executor);
        this.f = executor2;
        this.g = aaddVar;
        this.h = akzfVar;
        this.u = akzgVar;
        this.i = akzpVar;
        this.l = algqVar;
        this.j = axnmVar;
        this.v = akzeVar;
        this.m = albfVar;
        akxy akxyVar = new akxy(this);
        this.o = akxyVar;
        alfzVar.getClass();
        this.n = alfzVar;
        this.k = alakVar;
        alakVar.p(akxyVar);
    }

    private final ankt N(ankt anktVar, final String str, final String str2) {
        Long a = this.h.a();
        if (a.longValue() > 0) {
            anktVar = anlz.x(anktVar, a.longValue(), TimeUnit.SECONDS, this.d);
        }
        ylx.j(anktVar, v(), new ylv() { // from class: akxv
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                akxz akxzVar = akxz.this;
                String str3 = str;
                String str4 = str2;
                avug avugVar = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_FAILED;
                if (th instanceof TimeoutException) {
                    avugVar = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_TIMED_OUT;
                }
                akxzVar.D(str3, avugVar, str4, th);
            }
        });
        return anktVar;
    }

    private final ankt O(final String str, final boolean z, final avum avumVar) {
        ankt v = anlz.v(new aniq() { // from class: akxj
            @Override // defpackage.aniq
            public final ankt a() {
                akxz akxzVar = akxz.this;
                String str2 = str;
                avum avumVar2 = avumVar;
                boolean z2 = z;
                alcw b = akxzVar.i.b(str2);
                akyg akygVar = (akyg) akxzVar.r.get(str2);
                ankt q = anlz.q(false);
                if (b == null) {
                    if (akygVar != null) {
                        akxzVar.m.e(str2, null, avumVar2);
                        return anlz.q(true);
                    }
                    akxzVar.F("Cannot cancel an upload that does not exist.");
                    return q;
                } else if (!b.t) {
                    akxzVar.C(b, avumVar2);
                    return anlz.q(true);
                } else if (!z2) {
                    return q;
                } else {
                    ((alci) akxzVar.j.get()).v(str2);
                    return anlz.q(true);
                }
            }
        }, this.e);
        Long a = this.h.a();
        if (a.longValue() > 0) {
            v = anlz.x(v, a.longValue(), TimeUnit.SECONDS, this.d);
        }
        ylx.k(v, v(), new akxu(this, str, 1), new ylw() { // from class: akxw
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                akxz.this.x(str, ((Boolean) obj).booleanValue());
            }
        });
        return v;
    }

    private final synchronized List P(String str) {
        List list = (List) this.p.get(str);
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(String str, albg albgVar) {
        boolean z;
        alcw alcwVar = albgVar.b;
        if (alcwVar == null || (alcwVar.b & 128) == 0) {
            return;
        }
        alcu a = alcu.a(alcwVar.l);
        if (a == null) {
            a = alcu.UNKNOWN_UPLOAD;
        }
        algi algiVar = (algi) this.w.get(Integer.valueOf(a.g));
        if (algiVar == null) {
            throw new UnsupportedOperationException("Cannot reset unknown Upload flavor.");
        }
        if (!algiVar.a(albgVar)) {
            return;
        }
        if (this.l.f(str) || this.l.g(str)) {
            if ((this.g.a().b & 4096) != 0) {
                avvf avvfVar = this.g.a().h;
                if (avvfVar == null) {
                    avvfVar = avvf.a;
                }
                z = avvfVar.D;
            } else {
                z = false;
            }
            this.l.k(str, z);
        }
        akyg akygVar = (akyg) this.r.get(str);
        if (akygVar != null) {
            Map map = this.r;
            akyf b = akygVar.b();
            b.d(false);
            map.put(str, b.a());
        }
        this.i.a(str, algiVar.b());
        if (this.l.e(str)) {
            return;
        }
        this.v.a("Unconfirmed UploadFlow execution was not scheduled.");
        zep.c("UploadClientApi", "Unconfirmed UploadFlow execution was not scheduled.");
        this.m.f(str, avug.UPLOAD_CREATION_FAILURE_REASON_JOB_EXECUTION_NOT_SCHEDULED);
    }

    @Override // defpackage.akyh
    public final synchronized void B(akyv akyvVar) {
        akyvVar.getClass();
        Iterator it = this.p.entrySet().iterator();
        while (it.hasNext()) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((Map.Entry) it.next()).getValue();
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.contains(akyvVar)) {
                copyOnWriteArrayList.remove(akyvVar);
                if (copyOnWriteArrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public final void C(alcw alcwVar, avum avumVar) {
        aqxo.q(!alcwVar.t, "Removal is allowed for the only unconfirmed uploads.");
        String str = alcwVar.k;
        this.m.e(str, null, avumVar);
        if ((alcwVar.b & 128) == 0) {
            this.i.a(str, new akzr(1));
        } else {
            this.l.i(str);
        }
    }

    public final void D(String str, avug avugVar, String str2, Throwable th) {
        if (th == null) {
            this.v.a(str2);
            zep.m("UploadClientApi", str2);
        } else {
            this.v.b(str2, th);
            zep.o("UploadClientApi", str2, th);
        }
        akyg akygVar = (akyg) this.r.get(str);
        if (akygVar != null) {
            Map map = this.r;
            akyf b = akygVar.b();
            b.c(true);
            map.put(str, b.a());
        }
        for (akyv akyvVar : P(str)) {
            akyvVar.b(str);
        }
        this.m.f(str, avugVar);
    }

    public final void E(String str) {
        akyg akygVar = (akyg) this.r.get(str);
        if (akygVar != null) {
            if (!akygVar.o) {
                this.m.f(str, avug.UPLOAD_CREATION_FAILURE_REASON_NOT_OPENABLE_SOURCE_VIDEO);
            }
            Map map = this.r;
            akyf b = akygVar.b();
            b.d(true);
            map.put(str, b.a());
        }
        for (akyv akyvVar : P(str)) {
            akyvVar.a(str);
        }
    }

    public final void F(String str) {
        this.v.a(str);
        zep.c("UploadClientApi", str);
    }

    public final void G(String str, Throwable th) {
        this.v.b(str, th);
        zep.f("UploadClientApi", str, th);
    }

    @Override // defpackage.akyh
    public final void H(final String str, final afvm afvmVar, final avuk avukVar, final boolean z) {
        aed.c(new agr() { // from class: akwu
            @Override // defpackage.agr
            public final Object a(final agp agpVar) {
                ankt i;
                final akxz akxzVar = akxz.this;
                final String str2 = str;
                final afvm afvmVar2 = afvmVar;
                final avuk avukVar2 = avukVar;
                final boolean z2 = z;
                ylr.c();
                akyg akygVar = (akyg) akxzVar.r.get(str2);
                if (akygVar == null || akygVar.n || akygVar.b == null || Uri.EMPTY.equals(akygVar.b)) {
                    zep.m("UploadClientApi", "Falling back to ForegroundService async start.");
                    i = anii.i(akxzVar.k(str2), new anir() { // from class: akxm
                        @Override // defpackage.anir
                        public final ankt a(Object obj) {
                            akxz akxzVar2 = akxz.this;
                            ampq ampqVar = (ampq) obj;
                            if (ampqVar.h() && !((akyg) ampqVar.c()).n) {
                                ((alci) akxzVar2.j.get()).E(((akyg) ampqVar.c()).b);
                            }
                            return anlz.q(ampqVar);
                        }
                    }, akxzVar.f);
                } else {
                    try {
                        ((alci) akxzVar.j.get()).E(akygVar.b);
                        i = anlz.q(ampq.j(akygVar));
                    } catch (RuntimeException e) {
                        zep.f("UploadClientApi", "Cannot start service inline", e);
                        i = anlz.p(e);
                    }
                }
                ankt anktVar = i;
                ankt v = anlz.v(new aniq() { // from class: akxd
                    @Override // defpackage.aniq
                    public final ankt a() {
                        akxz akxzVar2 = akxz.this;
                        final afvm afvmVar3 = afvmVar2;
                        String str3 = str2;
                        avuk avukVar3 = avukVar2;
                        boolean z3 = z2;
                        aqxo.q(!afvmVar3.z(), "Need a signed-in user.");
                        alcw b = akxzVar2.i.b(str3);
                        b.getClass();
                        if (b.t) {
                            akxzVar2.F("Upload cannot be confirmed twice.");
                            return anlz.q(ampq.j(akxzVar2.a(b)));
                        }
                        akyg akygVar2 = (akyg) akxzVar2.r.get(str3);
                        akygVar2.getClass();
                        aqxo.q((b.b & 128) != 0, "Upload type is not set.");
                        aqxo.q(true ^ akygVar2.n, "Cannot confirm an upload which failed its creation.");
                        albg a = akxzVar2.i.a(str3, new akzs() { // from class: akwx
                            @Override // defpackage.akzs
                            public final alcw a(alcw alcwVar) {
                                afvm afvmVar4 = afvm.this;
                                int i2 = akxz.s;
                                alcwVar.getClass();
                                aopa mo52toBuilder = alcwVar.mo52toBuilder();
                                String d = afvmVar4.d();
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar2 = (alcw) mo52toBuilder.instance;
                                alcwVar2.b |= 1;
                                alcwVar2.e = d;
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar3 = (alcw) mo52toBuilder.instance;
                                alcwVar3.b |= 2097152;
                                alcwVar3.t = true;
                                return (alcw) mo52toBuilder.mo39build();
                            }
                        });
                        List c = akys.c(akxzVar2.a);
                        if (b.x) {
                            c.add(avuj.UPLOAD_FEATURE_COPY_FILE);
                        }
                        c.add(avuj.UPLOAD_FEATURE_REUSE_OPEN_SOURCE_VIDEO);
                        alcw alcwVar = a.b;
                        alcwVar.getClass();
                        albf albfVar = akxzVar2.m;
                        String d = afvmVar3.d();
                        alcu a2 = alcu.a(b.l);
                        if (a2 == null) {
                            a2 = alcu.UNKNOWN_UPLOAD;
                        }
                        albfVar.j(str3, d, avukVar3, akyc.m(a2), z3, (avuj[]) c.toArray(new avuj[0]));
                        akxzVar2.k.i(str3, alcwVar);
                        return anlz.q(ampq.j(akxzVar2.a(alcwVar)));
                    }
                }, akxzVar.e);
                ankt i2 = anii.i(anktVar, new akxo(akxzVar, str2), akxzVar.c);
                Long a = akxzVar.h.a();
                if (a.longValue() > 0) {
                    v = anlz.x(v, a.longValue(), TimeUnit.SECONDS, akxzVar.d);
                }
                ylx.k(new anjf(amuk.p(new ankt[]{v, i2}), true), akxzVar.v(), new ylv() { // from class: akxq
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        akxz akxzVar2 = akxz.this;
                        agp agpVar2 = agpVar;
                        String str3 = str2;
                        agpVar2.d(th);
                        ((alci) akxzVar2.j.get()).A(str3);
                        avug avugVar = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_FAILED;
                        if (th instanceof TimeoutException) {
                            avugVar = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_TIMED_OUT;
                        }
                        akxzVar2.D(str3, avugVar, "Failed to confirm upload.", th);
                        akxzVar2.x(str3, false);
                    }
                }, new ylw() { // from class: akwv
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        akxz akxzVar2 = akxz.this;
                        String str3 = str2;
                        agp agpVar2 = agpVar;
                        akxzVar2.x(str3, false);
                        for (ampq ampqVar : (List) obj) {
                            if (ampqVar != null && ampqVar.h()) {
                                agpVar2.c(ampqVar);
                                return;
                            }
                        }
                        agpVar2.c(amon.a);
                    }
                });
                return "UploadApiConfirm";
            }
        });
    }

    @Override // defpackage.akyh
    public final void I(String str, alcp alcpVar) {
        N(d(str, akxt.b, ajcg.j, nti.t, alcpVar), str, "Failed to set video media store metadata.");
    }

    @Override // defpackage.akyh
    public final void J(String str, arxl arxlVar) {
        N(d(str, akxt.c, ajcg.l, akxp.c, arxlVar), str, "Failed to set MetadataUpdateRequest.");
    }

    @Override // defpackage.akyh
    public final void K(String str, alcx alcxVar) {
        N(d(str, zwb.r, ajcg.i, akxp.b, alcxVar), str, "Failed to set UploadMediaStorageInfo.");
    }

    @Override // defpackage.akyh
    public final void L(String str, alda aldaVar) {
        N(d(str, akxt.a, ajcg.k, akxp.a, aldaVar), str, "Failed to set UploadMetadataProto.");
    }

    @Override // defpackage.akyh
    public final ankt M(String str, int i) {
        return N(d(str, akxt.e, ajcg.n, nti.u, akyc.k(i)), str, "Failed to set UploadFlowFlavor.");
    }

    public final akyg a(alcw alcwVar) {
        akyf a = akyg.a();
        a.a = alcwVar.k;
        if ((alcwVar.b & 4) != 0) {
            Uri parse = Uri.parse(alcwVar.g);
            a.b = parse;
            String lastPathSegment = parse.getLastPathSegment();
            if (lastPathSegment != null) {
                a.g = lastPathSegment;
            }
        }
        if ((alcwVar.b & 2) != 0) {
            a.c = Uri.parse(alcwVar.f);
        }
        if ((alcwVar.b & 128) != 0) {
            alcu a2 = alcu.a(alcwVar.l);
            if (a2 == null) {
                a2 = alcu.UNKNOWN_UPLOAD;
            }
            a.m = akyc.m(a2);
        }
        if ((alcwVar.b & 256) != 0) {
            avuk b = avuk.b(alcwVar.m);
            if (b == null) {
                b = avuk.UPLOAD_FLOW_SOURCE_UNKNOWN;
            }
            a.e = b;
        }
        if ((alcwVar.b & 16) != 0) {
            alda aldaVar = alcwVar.i;
            if (aldaVar == null) {
                aldaVar = alda.a;
            }
            a.d = aldaVar;
        }
        if ((alcwVar.b & 32) != 0) {
            arxl arxlVar = alcwVar.j;
            if (arxlVar == null) {
                arxlVar = arxl.a;
            }
            a.f = arxlVar;
        }
        Bitmap bitmap = (Bitmap) this.q.get(alcwVar.k);
        if (bitmap != null) {
            a.h = bitmap;
        } else if ((alcwVar.b & 4096) != 0) {
            a.h = akys.a(alcwVar);
        }
        if ((alcwVar.d & 8) != 0) {
            awbb awbbVar = alcwVar.ao;
            if (awbbVar == null) {
                awbbVar = awbb.a;
            }
            a.i = awbbVar;
        }
        if ((alcwVar.b & 8192) != 0) {
            alcx alcxVar = alcwVar.p;
            if (alcxVar == null) {
                alcxVar = alcx.a;
            }
            a.j = alcxVar;
        }
        if ((alcwVar.b & 16384) != 0) {
            alcp alcpVar = alcwVar.q;
            if (alcpVar == null) {
                alcpVar = alcp.a;
            }
            a.k = alcpVar;
        }
        if (alcwVar.R.size() > 0) {
            a.l = amuk.o(alcwVar.R);
        }
        a.b(alcwVar.t);
        akyg akygVar = (akyg) this.r.get(alcwVar.k);
        boolean z = true;
        a.d(akygVar != null && akygVar.o);
        if (akygVar == null || !akygVar.n) {
            z = false;
        }
        a.c(z);
        akyg a3 = a.a();
        this.r.put(alcwVar.k, a3);
        return a3;
    }

    public final akyg b(alcw alcwVar, albg albgVar) {
        if (albgVar != null) {
            alcwVar = albgVar.b;
            alcwVar.getClass();
        }
        return a(alcwVar);
    }

    @Override // defpackage.akyh
    public final ankt c(String str, avum avumVar) {
        return O(str, false, avumVar);
    }

    final ankt d(final String str, final ayqf ayqfVar, final ayqe ayqeVar, final aypx aypxVar, final Object obj) {
        return anlz.v(new aniq() { // from class: akxk
            @Override // defpackage.aniq
            public final ankt a() {
                albg albgVar;
                akxz akxzVar = akxz.this;
                String str2 = str;
                final Object obj2 = obj;
                ayqf ayqfVar2 = ayqfVar;
                ayqe ayqeVar2 = ayqeVar;
                final aypx aypxVar2 = aypxVar;
                alcw b = akxzVar.i.b(str2);
                b.getClass();
                obj2.getClass();
                ayqfVar2.getClass();
                ayqeVar2.getClass();
                if (!ayqfVar2.a(b) || !obj2.equals(ayqeVar2.a(b))) {
                    albg a = akxzVar.i.a(str2, new akzs() { // from class: akxa
                        @Override // defpackage.akzs
                        public final alcw a(alcw alcwVar) {
                            aypx aypxVar3 = aypx.this;
                            Object obj3 = obj2;
                            int i = akxz.s;
                            alcwVar.getClass();
                            return (alcw) ((aopa) aypxVar3.a(alcwVar.mo52toBuilder(), obj3)).mo39build();
                        }
                    });
                    akxzVar.A(str2, a);
                    albgVar = a;
                } else {
                    albgVar = null;
                }
                return anlz.q(ampq.j(akxzVar.b(b, albgVar)));
            }
        }, this.e);
    }

    @Override // defpackage.akyh
    public final ankt e(String str, avum avumVar) {
        return O(str, true, avumVar);
    }

    @Override // defpackage.akyh
    public final ankt f(String str) {
        return N(g(str, ajcg.f, ajcg.d), str, "Failed to clear the files to delete after upload.");
    }

    final ankt g(final String str, final ayqe ayqeVar, final ayqe ayqeVar2) {
        return anlz.v(new aniq() { // from class: akxf
            @Override // defpackage.aniq
            public final ankt a() {
                final akxz akxzVar = akxz.this;
                final ayqe ayqeVar3 = ayqeVar;
                final ayqe ayqeVar4 = ayqeVar2;
                final String str2 = str;
                ayqeVar3.getClass();
                ayqeVar4.getClass();
                final alcw b = akxzVar.i.b(str2);
                b.getClass();
                final akyg akygVar = (akyg) akxzVar.r.get(str2);
                akygVar.getClass();
                return anlz.q(ampq.j(akxzVar.b(b, akxzVar.i.a(str2, new akzs() { // from class: akwz
                    @Override // defpackage.akzs
                    public final alcw a(alcw alcwVar) {
                        akxz akxzVar2 = akxz.this;
                        alcw alcwVar2 = b;
                        ayqe ayqeVar5 = ayqeVar4;
                        akyg akygVar2 = akygVar;
                        String str3 = str2;
                        ayqe ayqeVar6 = ayqeVar3;
                        alcwVar.getClass();
                        aopa mo52toBuilder = alcwVar.mo52toBuilder();
                        aqxo.q(!alcwVar2.t, "Metadata can be cleared only on unconfirmed uploads.");
                        akxzVar2.r.put(str3, ((akyf) ayqeVar5.a(akygVar2.b())).a());
                        return (alcw) ((aopa) ayqeVar6.a(mo52toBuilder)).mo39build();
                    }
                }))));
            }
        }, this.e);
    }

    @Override // defpackage.akyh
    public final ankt h(String str) {
        return N(g(str, ajcg.g, ajcg.e), str, "Failed to clear VideoShortsCreation.");
    }

    final ankt i(final String str, final avui avuiVar, final Set set) {
        ylx.j(anlz.v(new aniq() { // from class: akxl
            @Override // defpackage.aniq
            public final ankt a() {
                akxz akxzVar = akxz.this;
                final Set set2 = set;
                akxzVar.t(new ayqf() { // from class: akxs
                    @Override // defpackage.ayqf
                    public final boolean a(Object obj) {
                        Set set3 = set2;
                        int i = akxz.s;
                        return !set3.contains(((alcw) obj).k);
                    }
                }, avum.UPLOAD_PROCESSOR_ABANDONMENT_REASON_INCOMPLETE_CREATION);
                return ankq.a;
            }
        }, this.c), this.c, new akxn(this));
        Map map = this.r;
        akyf a = akyg.a();
        a.a = str;
        map.put(str, a.a());
        Long l = (Long) this.h.c.a.a.V(axwv.l).B().aw();
        ankt v = anlz.v(new aniq() { // from class: akxe
            @Override // defpackage.aniq
            public final ankt a() {
                akxz akxzVar = akxz.this;
                avui avuiVar2 = avuiVar;
                String str2 = str;
                avvf avvfVar = akxzVar.g.a().h;
                if (avvfVar == null) {
                    avvfVar = avvf.a;
                }
                boolean z = avuiVar2 == avui.UPLOAD_CREATION_FLOW_SHORTS && Boolean.valueOf(((Boolean) akxzVar.h.a.a.a.V(ajcg.s).B().aw()).booleanValue()).booleanValue();
                aopa createBuilder = alcw.a.createBuilder();
                createBuilder.copyOnWrite();
                alcw alcwVar = (alcw) createBuilder.instance;
                str2.getClass();
                alcwVar.b |= 64;
                alcwVar.k = str2;
                long c = akxzVar.b.c();
                createBuilder.copyOnWrite();
                alcw alcwVar2 = (alcw) createBuilder.instance;
                alcwVar2.b |= 8;
                alcwVar2.h = c;
                createBuilder.copyOnWrite();
                alcw.a((alcw) createBuilder.instance);
                createBuilder.copyOnWrite();
                alcw alcwVar3 = (alcw) createBuilder.instance;
                alcwVar3.b |= 2097152;
                alcwVar3.t = false;
                createBuilder.copyOnWrite();
                alcw alcwVar4 = (alcw) createBuilder.instance;
                alcwVar4.b |= 1048576;
                alcwVar4.s = true;
                createBuilder.copyOnWrite();
                alcw alcwVar5 = (alcw) createBuilder.instance;
                alcwVar5.b |= 4194304;
                alcwVar5.u = z;
                createBuilder.copyOnWrite();
                alcw alcwVar6 = (alcw) createBuilder.instance;
                alcwVar6.r = 1;
                alcwVar6.b |= 65536;
                String valueOf = String.valueOf(akxzVar.a.getDir("youtube_upload", 0));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append("/");
                sb.append(str2);
                sb.append("/");
                String file = new File(sb.toString()).toString();
                createBuilder.copyOnWrite();
                alcw alcwVar7 = (alcw) createBuilder.instance;
                file.getClass();
                alcwVar7.c |= 268435456;
                alcwVar7.aj = file;
                akys.f(str2, createBuilder);
                akys.g(createBuilder, avvfVar);
                alcw alcwVar8 = (alcw) createBuilder.mo39build();
                aqxo.q(akxzVar.i.h(str2, alcwVar8), "Unexpected database insert error.");
                akxzVar.a(alcwVar8);
                albf albfVar = akxzVar.m;
                aopa createBuilder2 = avts.a.createBuilder();
                createBuilder2.copyOnWrite();
                avts avtsVar = (avts) createBuilder2.instance;
                avtsVar.c = avuiVar2.e;
                avtsVar.b |= 1;
                avtu a2 = avtv.a();
                avul avulVar = avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CREATION_STARTED;
                a2.copyOnWrite();
                ((avtv) a2.instance).y(avulVar);
                aopa createBuilder3 = avtw.a.createBuilder();
                createBuilder3.copyOnWrite();
                avtw avtwVar = (avtw) createBuilder3.instance;
                str2.getClass();
                avtwVar.b = 1 | avtwVar.b;
                avtwVar.c = str2;
                a2.copyOnWrite();
                ((avtv) a2.instance).F((avtw) createBuilder3.mo39build());
                a2.copyOnWrite();
                ((avtv) a2.instance).C((avts) createBuilder2.mo39build());
                arrf a3 = arrh.a();
                a3.copyOnWrite();
                ((arrh) a3.instance).dR((avtv) a2.mo39build());
                albfVar.b(null, (arrh) a3.mo39build());
                akxzVar.n.b(str2);
                return anlz.q(str2);
            }
        }, this.e);
        return l.longValue() > 0 ? anlz.x(v, l.longValue(), TimeUnit.SECONDS, this.d) : v;
    }

    @Override // defpackage.akyh
    public final ankt j(String str) {
        ankt k = k(str);
        ylx.j(k, v(), new akxn(this, 2));
        return k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt k(final String str) {
        akyg akygVar = (akyg) this.r.get(str);
        if (akygVar != null) {
            return anlz.q(ampq.j(akygVar));
        }
        return anlz.v(new aniq() { // from class: akxg
            @Override // defpackage.aniq
            public final ankt a() {
                akxz akxzVar = akxz.this;
                alcw b = akxzVar.i.b(str);
                if (b == null) {
                    return anlz.q(amon.a);
                }
                return anlz.q(ampq.j(akxzVar.a(b)));
            }
        }, this.e);
    }

    final ankt l(String str, ankt anktVar) {
        return anii.i(anktVar, new akxo(this, str, 1), this.e);
    }

    @Override // defpackage.akyh
    public final ankt m(String str, amuk amukVar) {
        return N(d(str, akxt.g, ajcg.h, akxp.f, amukVar), str, "Failed to set the files to delete after upload.");
    }

    @Override // defpackage.akyh
    public final ankt n(final String str, final Uri uri) {
        return N(l(str, anlz.v(new aniq() { // from class: akxi
            @Override // defpackage.aniq
            public final ankt a() {
                final akxz akxzVar = akxz.this;
                final String str2 = str;
                final Uri uri2 = uri;
                alcw b = akxzVar.i.b(str2);
                b.getClass();
                uri2.getClass();
                final boolean z = (b.b & 4) != 0;
                albg albgVar = null;
                if (!z || !b.g.equals(uri2.toString())) {
                    albgVar = akxzVar.i.a(str2, new akzs() { // from class: akwy
                        @Override // defpackage.akzs
                        public final alcw a(alcw alcwVar) {
                            akxz akxzVar2 = akxz.this;
                            Uri uri3 = uri2;
                            boolean z2 = z;
                            String str3 = str2;
                            alcwVar.getClass();
                            aopa mo52toBuilder = alcwVar.mo52toBuilder();
                            String uri4 = uri3.toString();
                            mo52toBuilder.copyOnWrite();
                            alcw alcwVar2 = (alcw) mo52toBuilder.instance;
                            uri4.getClass();
                            alcwVar2.b |= 4;
                            alcwVar2.g = uri4;
                            String uri5 = uri3.toString();
                            mo52toBuilder.copyOnWrite();
                            alcw alcwVar3 = (alcw) mo52toBuilder.instance;
                            uri5.getClass();
                            alcwVar3.b |= 2;
                            alcwVar3.f = uri5;
                            if (z2) {
                                akyg akygVar = (akyg) akxzVar2.r.get(str3);
                                akygVar.getClass();
                                akyf a = akyg.a();
                                a.a = str3;
                                a.c(akygVar.n);
                                akxzVar2.r.put(str3, a.a());
                                akxzVar2.q.remove(str3);
                                aqxo.p(((alcw) mo52toBuilder.instance).s);
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar4 = (alcw) mo52toBuilder.instance;
                                alcwVar4.b &= -257;
                                alcwVar4.m = 0;
                                mo52toBuilder.copyOnWrite();
                                ((alcw) mo52toBuilder.instance).R = aopi.emptyProtobufList();
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar5 = (alcw) mo52toBuilder.instance;
                                alcwVar5.q = null;
                                alcwVar5.b &= -16385;
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar6 = (alcw) mo52toBuilder.instance;
                                alcwVar6.j = null;
                                alcwVar6.b &= -33;
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar7 = (alcw) mo52toBuilder.instance;
                                alcwVar7.p = null;
                                alcwVar7.b &= -8193;
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar8 = (alcw) mo52toBuilder.instance;
                                alcwVar8.i = null;
                                alcwVar8.b &= -17;
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar9 = (alcw) mo52toBuilder.instance;
                                alcwVar9.b &= -4097;
                                alcwVar9.o = alcw.a.o;
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar10 = (alcw) mo52toBuilder.instance;
                                alcwVar10.ao = null;
                                alcwVar10.d &= -9;
                            }
                            return (alcw) mo52toBuilder.mo39build();
                        }
                    });
                } else if (b.ad) {
                    akxzVar.E(str2);
                }
                return anlz.q(new Pair(akxzVar.b(b, albgVar), ampq.i(albgVar)));
            }
        }, this.e)), str, "Failed to set source Uri.");
    }

    @Override // defpackage.akyh
    public final ankt o(String str, Uri uri) {
        return N(d(str, akxt.d, ajcg.m, akxp.e, uri.toString()), str, "Failed to set upload Uri.");
    }

    @Override // defpackage.akyh
    public final ankt p(final String str, final Bitmap bitmap) {
        return N(l(str, anlz.v(new aniq() { // from class: akxh
            @Override // defpackage.aniq
            public final ankt a() {
                albg a;
                akxz akxzVar = akxz.this;
                String str2 = str;
                final Bitmap bitmap2 = bitmap;
                alcw b = akxzVar.i.b(str2);
                b.getClass();
                Bitmap bitmap3 = (Bitmap) akxzVar.q.get(str2);
                if (bitmap3 == null || !bitmap3.sameAs(bitmap2)) {
                    akxzVar.q.put(str2, bitmap2);
                    a = akxzVar.i.a(str2, new akzs() { // from class: akww
                        @Override // defpackage.akzs
                        public final alcw a(alcw alcwVar) {
                            Bitmap bitmap4 = bitmap2;
                            int i = akxz.s;
                            alcwVar.getClass();
                            aopa mo52toBuilder = alcwVar.mo52toBuilder();
                            akys.h(bitmap4, mo52toBuilder);
                            return (alcw) mo52toBuilder.mo39build();
                        }
                    });
                } else {
                    a = null;
                }
                return anlz.q(new Pair(akxzVar.b(b, a), ampq.i(a)));
            }
        }, this.e)), str, "Failed to set video file thumbnail.");
    }

    @Override // defpackage.akyh
    public final ankt q(String str, awbb awbbVar) {
        return N(d(str, akxt.f, ajcg.o, akxp.d, awbbVar), str, "Failed to set VideoShortsCreation.");
    }

    public final Duration r() {
        Duration duration = t;
        if ((this.g.a().b & 4096) != 0) {
            avvf avvfVar = this.g.a().h;
            if (avvfVar == null) {
                avvfVar = avvf.a;
            }
            long j = avvfVar.E;
            if (j <= 0) {
                return duration;
            }
            try {
                return Duration.ofHours(j);
            } catch (ArithmeticException e) {
                G("Failed to convert clean up time to hours.", e);
                return t;
            }
        }
        return duration;
    }

    @Override // defpackage.akyh
    public final String s(avui avuiVar, akyv akyvVar) {
        String a = this.u.a(zhn.o(), avuiVar, 0);
        if (akyvVar != null) {
            w(a, akyvVar);
        }
        ylx.j(i(a, avuiVar, amvn.r(a)), v(), new akxu(this, a));
        return a;
    }

    public final List t(ayqf ayqfVar, avum avumVar) {
        ArrayList arrayList = new ArrayList();
        for (alcw alcwVar : this.i.d(akxb.a).values()) {
            if (ayqfVar.a(alcwVar)) {
                x(alcwVar.k, true);
                C(alcwVar, avumVar);
                arrayList.add(alcwVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.akyh
    public final List u(int i, avui avuiVar, akyv akyvVar) {
        akzg akzgVar = this.u;
        aqxo.p(true);
        ArrayList<String> arrayList = new ArrayList(i);
        String o = zhn.o();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(akzgVar.a(o, avuiVar, i2));
        }
        for (String str : arrayList) {
            w(str, akyvVar);
            ylx.j(i(str, avuiVar, amvn.p(arrayList)), v(), new akxu(this, str, 2));
        }
        return arrayList;
    }

    public final Executor v() {
        return Boolean.valueOf(((Boolean) this.h.c.a.a.V(axwv.k).B().aw()).booleanValue()).booleanValue() ? this.c : this.e;
    }

    @Override // defpackage.akyh
    public final synchronized void w(String str, akyv akyvVar) {
        boolean z = true;
        aqxo.p(!TextUtils.isEmpty(str));
        akyvVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.p.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (this.p.put(str, copyOnWriteArrayList) != null) {
                z = false;
            }
            aqxo.y(z);
        }
        copyOnWriteArrayList.addIfAbsent(akyvVar);
    }

    public final void x(String str, boolean z) {
        this.q.remove(str);
        this.r.remove(str);
        if (z) {
            this.n.c(str);
        }
    }

    @Override // defpackage.akyh
    public final void y(String str, avul avulVar) {
        this.m.d(str, null, avulVar);
    }

    @Override // defpackage.akyh
    public final void z(String str, avug avugVar) {
        this.m.f(str, avugVar);
    }
}
