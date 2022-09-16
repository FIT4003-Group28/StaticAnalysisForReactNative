package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: tru  reason: default package */
/* loaded from: classes4.dex */
public final class tru implements trc {
    public final Context a;
    public final tyk b;
    public final ampq c;
    public final tvs d;
    public final vjb e;
    public final Executor f;
    public final ampq g;
    private final List h;
    private final anju i = anju.a();

    public tru(Context context, tyk tykVar, tvs tvsVar, Executor executor, List list, ampq ampqVar, vjb vjbVar, ampq ampqVar2) {
        new HashMap();
        this.a = context;
        this.b = tykVar;
        this.h = list;
        this.c = ampqVar;
        this.f = executor;
        this.d = tvsVar;
        this.e = vjbVar;
        this.g = ampqVar2;
    }

    public static tpo f(String str, int i, int i2, String str2, aono aonoVar) {
        aopa createBuilder = tpo.a.createBuilder();
        createBuilder.copyOnWrite();
        tpo tpoVar = (tpo) createBuilder.instance;
        str.getClass();
        tpoVar.b |= 1;
        tpoVar.c = str;
        createBuilder.copyOnWrite();
        tpo tpoVar2 = (tpo) createBuilder.instance;
        tpoVar2.b |= 4;
        tpoVar2.e = i;
        if (i2 > 0) {
            createBuilder.copyOnWrite();
            tpo tpoVar3 = (tpo) createBuilder.instance;
            tpoVar3.b |= 8;
            tpoVar3.f = i2;
        }
        if (str2 != null) {
            createBuilder.copyOnWrite();
            tpo tpoVar4 = (tpo) createBuilder.instance;
            tpoVar4.b |= 2;
            tpoVar4.d = str2;
        }
        if (aonoVar != null) {
            createBuilder.copyOnWrite();
            tpo tpoVar5 = (tpo) createBuilder.instance;
            tpoVar5.g = aonoVar;
            tpoVar5.b |= 16;
        }
        return (tpo) createBuilder.mo39build();
    }

    private final ankt j(boolean z) {
        return anii.i(anii.i(anii.i(anko.q(g()), new trq(this, z, 1), this.f), new trk(this), this.f), new trq(this, z), this.f);
    }

    @Override // defpackage.trc
    public final ankt a(final tps tpsVar) {
        return this.i.b(ammo.b(new aniq() { // from class: trf
            @Override // defpackage.aniq
            public final ankt a() {
                tru truVar = tru.this;
                tps tpsVar2 = tpsVar;
                String str = tpsVar2.a.c;
                int i = typ.a;
                tpw tpwVar = tpsVar2.a;
                if ((tpwVar.b & 2) == 0) {
                    aopa mo52toBuilder = tpwVar.mo52toBuilder();
                    String packageName = truVar.a.getPackageName();
                    mo52toBuilder.copyOnWrite();
                    tpw tpwVar2 = (tpw) mo52toBuilder.instance;
                    packageName.getClass();
                    tpwVar2.b |= 2;
                    tpwVar2.d = packageName;
                    tpwVar = (tpw) mo52toBuilder.mo39build();
                } else if (!truVar.a.getPackageName().equals(tpwVar.d)) {
                    typ.e("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", tpwVar.c, truVar.a.getPackageName(), tpwVar.d);
                    return anlz.q(false);
                }
                aopa createBuilder = tqv.a.createBuilder();
                String str2 = tpwVar.c;
                createBuilder.copyOnWrite();
                tqv tqvVar = (tqv) createBuilder.instance;
                str2.getClass();
                tqvVar.b |= 1;
                tqvVar.c = str2;
                String str3 = tpwVar.d;
                createBuilder.copyOnWrite();
                tqv tqvVar2 = (tqv) createBuilder.instance;
                str3.getClass();
                tqvVar2.b = 2 | tqvVar2.b;
                tqvVar2.d = str3;
                try {
                    final tqm tqmVar = (tqm) aopi.parseFrom(tqm.a, tpwVar.toByteArray(), aoos.a());
                    final tvs tvsVar = truVar.d;
                    final tqv tqvVar3 = (tqv) createBuilder.mo39build();
                    String str4 = tqvVar3.c;
                    return amnt.f(tvsVar.c(), new anir() { // from class: tvm
                        /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
                            r15 = true;
                         */
                        @Override // defpackage.anir
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final defpackage.ankt a(java.lang.Object r18) {
                            /*
                                Method dump skipped, instructions count: 1165
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.tvm.a(java.lang.Object):ankt");
                        }
                    }, tvsVar.n);
                } catch (aopx e) {
                    typ.f(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
                    return anlz.q(false);
                }
            }
        }), this.f);
    }

    @Override // defpackage.trc
    public final ankt b(final tqg tqgVar) {
        return this.i.b(new aniq() { // from class: trh
            @Override // defpackage.aniq
            public final ankt a() {
                final tru truVar = tru.this;
                final tqg tqgVar2 = tqgVar;
                tvs tvsVar = truVar.d;
                int i = typ.a;
                return anii.i(anii.i(tvsVar.c(), new tvj(tvsVar, 5), tvsVar.n), new anir() { // from class: tro
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        final tru truVar2 = tru.this;
                        final tqg tqgVar3 = tqgVar2;
                        ankt q = anlz.q(amuk.f());
                        for (final Pair pair : (List) obj) {
                            q = anii.i(q, new anir() { // from class: trl
                                @Override // defpackage.anir
                                public final ankt a(Object obj2) {
                                    final tru truVar3 = tru.this;
                                    Pair pair2 = pair;
                                    tqg tqgVar4 = tqgVar3;
                                    final amuf amufVar = (amuf) obj2;
                                    tqv tqvVar = (tqv) pair2.first;
                                    tqm tqmVar = (tqm) pair2.second;
                                    if (!tqgVar4.a) {
                                        ampq ampqVar = tqgVar4.c;
                                        if ((ampqVar.h() && !TextUtils.equals((CharSequence) ampqVar.c(), tqvVar.c)) || (tqgVar4.b && (tqvVar.b & 4) != 0)) {
                                            return anlz.q(amufVar);
                                        }
                                    }
                                    return anii.h(anii.h(truVar3.i(tqmVar, (tqvVar.b & 4) != 0 ? tqvVar.e : null, true != tqvVar.f ? 3 : 2), new ampg() { // from class: tri
                                        @Override // defpackage.ampg
                                        public final Object apply(Object obj3) {
                                            tru truVar4 = tru.this;
                                            tpp tppVar = (tpp) obj3;
                                            if (tppVar != null) {
                                                tyk tykVar = truVar4.b;
                                                aopa createBuilder = angn.a.createBuilder();
                                                String str = tppVar.c;
                                                createBuilder.copyOnWrite();
                                                angn angnVar = (angn) createBuilder.instance;
                                                str.getClass();
                                                angnVar.b |= 1;
                                                angnVar.c = str;
                                                String str2 = tppVar.d;
                                                createBuilder.copyOnWrite();
                                                angn angnVar2 = (angn) createBuilder.instance;
                                                str2.getClass();
                                                angnVar2.b |= 4;
                                                angnVar2.e = str2;
                                                int i2 = tppVar.f;
                                                createBuilder.copyOnWrite();
                                                angn angnVar3 = (angn) createBuilder.instance;
                                                angnVar3.b |= 2;
                                                angnVar3.d = i2;
                                                int size = tppVar.h.size();
                                                createBuilder.copyOnWrite();
                                                angn angnVar4 = (angn) createBuilder.instance;
                                                angnVar4.b |= 8;
                                                angnVar4.f = size;
                                                String str3 = tppVar.j;
                                                createBuilder.copyOnWrite();
                                                angn angnVar5 = (angn) createBuilder.instance;
                                                str3.getClass();
                                                angnVar5.b |= 64;
                                                angnVar5.i = str3;
                                                long j = tppVar.i;
                                                createBuilder.copyOnWrite();
                                                angn angnVar6 = (angn) createBuilder.instance;
                                                angnVar6.b |= 32;
                                                angnVar6.h = j;
                                                tykVar.c((angn) createBuilder.mo39build());
                                            }
                                            return tppVar;
                                        }
                                    }, truVar3.f), new ampg() { // from class: trs
                                        @Override // defpackage.ampg
                                        public final Object apply(Object obj3) {
                                            amuf amufVar2 = amuf.this;
                                            tpp tppVar = (tpp) obj3;
                                            if (tppVar != null) {
                                                amufVar2.h(tppVar);
                                            }
                                            return amufVar2;
                                        }
                                    }, truVar3.f);
                                }
                            }, truVar2.f);
                        }
                        return anii.h(q, ryj.m, truVar2.f);
                    }
                }, truVar.f);
            }
        }, this.f);
    }

    @Override // defpackage.trc
    public final void d(final tqc tqcVar) {
        final String str = tqcVar.a;
        aopa createBuilder = tqv.a.createBuilder();
        createBuilder.copyOnWrite();
        tqv tqvVar = (tqv) createBuilder.instance;
        str.getClass();
        tqvVar.b |= 1;
        tqvVar.c = str;
        String packageName = this.a.getPackageName();
        createBuilder.copyOnWrite();
        tqv tqvVar2 = (tqv) createBuilder.instance;
        packageName.getClass();
        tqvVar2.b |= 2;
        tqvVar2.d = packageName;
        final tqv tqvVar3 = (tqv) createBuilder.mo39build();
        anlz.A(anii.h(anlz.v(new aniq() { // from class: trg
            @Override // defpackage.aniq
            public final ankt a() {
                final ampq ampqVar;
                tru truVar = tru.this;
                tqc tqcVar2 = tqcVar;
                String str2 = str;
                final tqv tqvVar4 = tqvVar3;
                if (tqcVar2.c.h()) {
                    if (truVar.g.h()) {
                        tzo tzoVar = (tzo) truVar.g.c();
                        aaek aaekVar = (aaek) tqcVar2.c.c();
                        synchronized (tzo.class) {
                            if (!tzoVar.d.containsKey(str2)) {
                                tzoVar.d.put(str2, new vkf(new tzn(tzoVar, str2, aaekVar), tzoVar.a, 1000L, TimeUnit.MILLISECONDS));
                            }
                        }
                    } else {
                        tpy a = tqa.a();
                        a.a = tpz.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
                        a.b = "downloadFileGroup: DownloadListener is present but Download Monitor is not provided!";
                        return anlz.p(a.a());
                    }
                }
                if (tqcVar2.b.h()) {
                    ampqVar = ampq.j((tqp) aopi.parseFrom(tqp.a, ((tpx) tqcVar2.b.c()).toByteArray(), aoos.a()));
                } else {
                    ampqVar = amon.a;
                }
                final tvs tvsVar = truVar.d;
                String str3 = tqvVar4.c;
                String str4 = tqvVar4.d;
                int i = typ.a;
                return anii.i(anii.i(tvsVar.c(), new anir() { // from class: tvo
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        tvs tvsVar2 = tvs.this;
                        Void r4 = (Void) obj;
                        return tvsVar2.d.d(tqvVar4, (tqp) ampqVar.f());
                    }
                }, tvsVar.n), new trk(truVar, 2), truVar.f);
            }
        }, this.f), new ampg() { // from class: trp
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                tru truVar = tru.this;
                tqc tqcVar2 = tqcVar;
                String str2 = str;
                tpp tppVar = (tpp) obj;
                if (tqcVar2.c.h()) {
                    aaek aaekVar = (aaek) tqcVar2.c.c();
                    aael aaelVar = aaekVar.a;
                    aaelVar.g.put(tppVar.c, new aaes(tppVar, aaelVar.e, aaelVar.c, aaelVar.d));
                    aael aaelVar2 = aaekVar.a;
                    aaelVar2.h.c(amup.j(aaelVar2.g));
                    if (truVar.g.h()) {
                        ((tzo) truVar.g.c()).h(str2);
                    }
                }
                return tppVar;
            }
        }, this.f), new trt(this, tqcVar, str), this.f);
    }

    @Override // defpackage.trc
    public final void e() {
        anju anjuVar = this.i;
        Callable g = ammo.g(new Callable() { // from class: trr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                tru truVar = tru.this;
                if (!truVar.c.h()) {
                    typ.c("%s: Called schedulePeriodicTasksInternal when taskScheduler is not provided.", "MobileDataDownload");
                    return null;
                }
                Ctry ctry = (Ctry) truVar.c.c();
                ctry.a("MDD.CHARGING.PERIODIC.TASK", 21600L, 3, amon.a);
                ctry.a("MDD.MAINTENANCE.PERIODIC.GCM.TASK", 86400L, 3, amon.a);
                ctry.a("MDD.CELLULAR.CHARGING.PERIODIC.TASK", 21600L, 1, amon.a);
                ctry.a("MDD.WIFI.CHARGING.PERIODIC.TASK", 21600L, 2, amon.a);
                return null;
            }
        });
        anjuVar.b(new anjo(g), this.f);
    }

    public final ankt g() {
        ArrayList arrayList = new ArrayList();
        for (tqd tqdVar : this.h) {
            arrayList.add(tqdVar.a());
        }
        return anlz.j(arrayList).a(gbb.e, this.f);
    }

    public final List h(Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : this.e.b(uri)) {
            if (this.e.i(uri2)) {
                arrayList.addAll(h(uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    aopa createBuilder = tpo.a.createBuilder();
                    String replaceFirst = path.replaceFirst(str, "");
                    createBuilder.copyOnWrite();
                    tpo tpoVar = (tpo) createBuilder.instance;
                    replaceFirst.getClass();
                    tpoVar.b |= 1;
                    tpoVar.c = replaceFirst;
                    long a = this.e.a(uri2);
                    createBuilder.copyOnWrite();
                    tpo tpoVar2 = (tpo) createBuilder.instance;
                    tpoVar2.b |= 4;
                    tpoVar2.e = (int) a;
                    String uri3 = uri2.toString();
                    createBuilder.copyOnWrite();
                    tpo tpoVar3 = (tpo) createBuilder.instance;
                    uri3.getClass();
                    tpoVar3.b |= 2;
                    tpoVar3.d = uri3;
                    arrayList.add((tpo) createBuilder.mo39build());
                }
            }
        }
        return arrayList;
    }

    public final ankt i(final tqm tqmVar, String str, final int i) {
        if (tqmVar == null) {
            return anlz.q(null);
        }
        aopa createBuilder = tpp.a.createBuilder();
        String str2 = tqmVar.d;
        createBuilder.copyOnWrite();
        tpp tppVar = (tpp) createBuilder.instance;
        str2.getClass();
        tppVar.b |= 1;
        tppVar.c = str2;
        String str3 = tqmVar.e;
        createBuilder.copyOnWrite();
        tpp tppVar2 = (tpp) createBuilder.instance;
        str3.getClass();
        tppVar2.b |= 2;
        tppVar2.d = str3;
        int i2 = tqmVar.f;
        createBuilder.copyOnWrite();
        tpp tppVar3 = (tpp) createBuilder.instance;
        tppVar3.b |= 8;
        tppVar3.f = i2;
        aono aonoVar = tqmVar.g;
        if (aonoVar == null) {
            aonoVar = aono.a;
        }
        createBuilder.copyOnWrite();
        tpp tppVar4 = (tpp) createBuilder.instance;
        aonoVar.getClass();
        tppVar4.l = aonoVar;
        tppVar4.b |= 128;
        long j = tqmVar.r;
        createBuilder.copyOnWrite();
        tpp tppVar5 = (tpp) createBuilder.instance;
        tppVar5.b |= 32;
        tppVar5.i = j;
        String str4 = tqmVar.s;
        createBuilder.copyOnWrite();
        tpp tppVar6 = (tpp) createBuilder.instance;
        str4.getClass();
        tppVar6.b |= 64;
        tppVar6.j = str4;
        createBuilder.copyOnWrite();
        tpp tppVar7 = (tpp) createBuilder.instance;
        tppVar7.g = i - 1;
        tppVar7.b |= 16;
        aopu aopuVar = tqmVar.t;
        createBuilder.copyOnWrite();
        tpp tppVar8 = (tpp) createBuilder.instance;
        aopu aopuVar2 = tppVar8.k;
        if (!aopuVar2.c()) {
            tppVar8.k = aopi.mutableCopy(aopuVar2);
        }
        aonk.addAll((Iterable) aopuVar, (List) tppVar8.k);
        if (str != null) {
            createBuilder.copyOnWrite();
            tpp tppVar9 = (tpp) createBuilder.instance;
            tppVar9.b |= 4;
            tppVar9.e = str;
        }
        if ((tqmVar.b & 32) != 0) {
            aono aonoVar2 = tqmVar.h;
            if (aonoVar2 == null) {
                aonoVar2 = aono.a;
            }
            createBuilder.copyOnWrite();
            tpp tppVar10 = (tpp) createBuilder.instance;
            aonoVar2.getClass();
            tppVar10.m = aonoVar2;
            tppVar10.b |= 256;
        }
        ankt q = anlz.q(createBuilder);
        for (final tqk tqkVar : tqmVar.n) {
            q = anii.i(q, new anir() { // from class: trn
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    aono aonoVar3;
                    final tru truVar = tru.this;
                    int i3 = i;
                    final tqk tqkVar2 = tqkVar;
                    final tqm tqmVar2 = tqmVar;
                    final aopa aopaVar = (aopa) obj;
                    if (i3 != 2) {
                        String str5 = tqkVar2.c;
                        int i4 = tqkVar2.e;
                        int i5 = tqkVar2.j;
                        if ((tqkVar2.b & 8192) != 0) {
                            aonoVar3 = tqkVar2.q;
                            if (aonoVar3 == null) {
                                aonoVar3 = aono.a;
                            }
                        } else {
                            aonoVar3 = null;
                        }
                        aopaVar.x(tru.f(str5, i4, i5, null, aonoVar3));
                        return anlz.q(aopaVar);
                    }
                    final tvs tvsVar = truVar.d;
                    String str6 = tqkVar2.c;
                    int i6 = typ.a;
                    return anii.i(anii.i(tvsVar.c(), new anir() { // from class: tvl
                        @Override // defpackage.anir
                        public final ankt a(Object obj2) {
                            final tvs tvsVar2 = tvs.this;
                            final tqk tqkVar3 = tqkVar2;
                            final tqm tqmVar3 = tqmVar2;
                            Void r5 = (Void) obj2;
                            return anii.h(tvsVar2.d.h(tqkVar3, tqmVar3), new ampg() { // from class: tvr
                                @Override // defpackage.ampg
                                public final Object apply(Object obj3) {
                                    tvs tvsVar3 = tvs.this;
                                    tqm tqmVar4 = tqmVar3;
                                    tqk tqkVar4 = tqkVar3;
                                    Uri uri = (Uri) obj3;
                                    if (uri != null && tzc.k(tqmVar4)) {
                                        try {
                                            uri = tvsVar3.d.a(uri, tqkVar4, tqmVar4);
                                        } catch (IOException e) {
                                            typ.f(e, "%s getDataFileUri %s %s unable to get isolated file uri!", "MDDManager", tqkVar4.c, tqmVar4.d);
                                            uri = null;
                                        }
                                    }
                                    if (uri == null || (tqkVar4.b & 256) == 0) {
                                        return uri;
                                    }
                                    awxs awxsVar = tqkVar4.k;
                                    if (awxsVar == null) {
                                        awxsVar = awxs.a;
                                    }
                                    tvsVar3.p.h();
                                    return awxsVar.b.size() != 0 ? uri.buildUpon().encodedFragment(vks.a(awxsVar)).build() : uri;
                                }
                            }, tvsVar2.n);
                        }
                    }, tvsVar.n), new anir() { // from class: trm
                        @Override // defpackage.anir
                        public final ankt a(Object obj2) {
                            aono aonoVar4;
                            tru truVar2 = tru.this;
                            aopa aopaVar2 = aopaVar;
                            tqk tqkVar3 = tqkVar2;
                            Uri uri = (Uri) obj2;
                            if (uri == null) {
                                tpy a = tqa.a();
                                a.a = tpz.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                                a.b = "getDataFileUri() resolved to null";
                                return anlz.p(a.a());
                            }
                            try {
                                if (truVar2.e.i(uri)) {
                                    String path = uri.getPath();
                                    if (path != null) {
                                        List h = truVar2.h(uri, path);
                                        aopaVar2.copyOnWrite();
                                        tpp tppVar11 = (tpp) aopaVar2.instance;
                                        tpp tppVar12 = tpp.a;
                                        tppVar11.a();
                                        aonk.addAll((Iterable) h, (List) tppVar11.h);
                                    }
                                } else {
                                    String str7 = tqkVar3.c;
                                    int i7 = tqkVar3.e;
                                    int i8 = tqkVar3.j;
                                    String uri2 = uri.toString();
                                    if ((tqkVar3.b & 8192) != 0) {
                                        aonoVar4 = tqkVar3.q;
                                        if (aonoVar4 == null) {
                                            aonoVar4 = aono.a;
                                        }
                                    } else {
                                        aonoVar4 = null;
                                    }
                                    aopaVar2.x(tru.f(str7, i7, i8, uri2, aonoVar4));
                                }
                            } catch (IOException e) {
                                String valueOf = String.valueOf(uri);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                                sb.append("Failed to list files under directory:");
                                sb.append(valueOf);
                                typ.i(e, sb.toString());
                            }
                            return anlz.q(aopaVar2);
                        }
                    }, truVar.f);
                }
            }, this.f);
        }
        return anhq.h(anii.h(anko.q(q), ryj.n, this.f), tqa.class, ryj.p, this.f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.trc
    public final ankt c(String str) {
        char c;
        switch (str.hashCode()) {
            case -2105562759:
                if (str.equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1202768674:
                if (str.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -69128772:
                if (str.equals("MDD.CHARGING.PERIODIC.TASK")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 437964371:
                if (str.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            anju anjuVar = this.i;
            final tvs tvsVar = this.d;
            return anjuVar.b(new aniq() { // from class: trj
                @Override // defpackage.aniq
                public final ankt a() {
                    final tvs tvsVar2 = tvs.this;
                    int i = typ.a;
                    return anii.i(anii.i(anko.q(tvsVar2.c()), new tvj(tvsVar2, 8), anjk.a), new anir() { // from class: tvi
                        @Override // defpackage.anir
                        public final ankt a(Object obj) {
                            ankt i2;
                            ankt i3;
                            tvs tvsVar3;
                            ArrayList arrayList;
                            long j;
                            long j2;
                            ankt q;
                            ArrayList arrayList2;
                            tvs tvsVar4 = tvs.this;
                            Integer num = (Integer) obj;
                            ArrayList arrayList3 = new ArrayList();
                            int i4 = typ.a;
                            int i5 = 1;
                            arrayList3.add(anii.i(tvsVar4.c(), new tvj(tvsVar4, 1), tvsVar4.n));
                            tvsVar4.p.s();
                            tuk tukVar = tvsVar4.d;
                            arrayList3.add(tukVar.i(new tth(tukVar)));
                            tvsVar4.p.u();
                            tuk tukVar2 = tvsVar4.d;
                            int i6 = 4;
                            arrayList3.add(anii.i(tukVar2.d.d(), new tth(tukVar2, 4), tukVar2.h));
                            tvsVar4.p.t();
                            tvsVar4.p.k();
                            tuk tukVar3 = tvsVar4.d;
                            int i7 = 2;
                            arrayList3.add(tukVar3.i(new tth(tukVar3, 2)));
                            tvsVar4.p.w();
                            tsy tsyVar = tvsVar4.h;
                            arrayList3.add(anii.i(anii.i(tsyVar.b.e(), new tsx(tsyVar, 6), tsyVar.j), new tsx(tsyVar, 3), tsyVar.j));
                            tvsVar4.c.g(1053);
                            final tyo tyoVar = tvsVar4.k;
                            final int intValue = num.intValue();
                            tyoVar.e.r();
                            if (!typ.a(100L)) {
                                i2 = anlz.q(null);
                            } else {
                                i2 = anii.i(tyoVar.b.c(), new anir() { // from class: tym
                                    @Override // defpackage.anir
                                    public final ankt a(Object obj2) {
                                        final tyo tyoVar2 = tyo.this;
                                        final int i8 = intValue;
                                        ankt q2 = anlz.q(null);
                                        ankt anktVar = q2;
                                        for (Pair pair : (List) obj2) {
                                            final tqv tqvVar = (tqv) pair.first;
                                            final tqm tqmVar = (tqm) pair.second;
                                            if (tqmVar != null) {
                                                aopa createBuilder = angn.a.createBuilder();
                                                String str2 = tqvVar.c;
                                                createBuilder.copyOnWrite();
                                                angn angnVar = (angn) createBuilder.instance;
                                                str2.getClass();
                                                angnVar.b |= 1;
                                                angnVar.c = str2;
                                                String str3 = tqvVar.d;
                                                createBuilder.copyOnWrite();
                                                angn angnVar2 = (angn) createBuilder.instance;
                                                str3.getClass();
                                                angnVar2.b |= 4;
                                                angnVar2.e = str3;
                                                int i9 = tqmVar.f;
                                                createBuilder.copyOnWrite();
                                                angn angnVar3 = (angn) createBuilder.instance;
                                                angnVar3.b |= 2;
                                                angnVar3.d = i9;
                                                int size = tqmVar.n.size();
                                                createBuilder.copyOnWrite();
                                                angn angnVar4 = (angn) createBuilder.instance;
                                                angnVar4.b |= 8;
                                                angnVar4.f = size;
                                                boolean isEmpty = tqvVar.e.isEmpty();
                                                createBuilder.copyOnWrite();
                                                angn angnVar5 = (angn) createBuilder.instance;
                                                angnVar5.b |= 16;
                                                angnVar5.g = !isEmpty;
                                                long j3 = tqmVar.r;
                                                createBuilder.copyOnWrite();
                                                angn angnVar6 = (angn) createBuilder.instance;
                                                angnVar6.b |= 32;
                                                angnVar6.h = j3;
                                                String str4 = tqmVar.s;
                                                createBuilder.copyOnWrite();
                                                angn angnVar7 = (angn) createBuilder.instance;
                                                str4.getClass();
                                                angnVar7.b |= 64;
                                                angnVar7.i = str4;
                                                final angn angnVar8 = (angn) createBuilder.mo39build();
                                                anktVar = anii.i(anktVar, new anir() { // from class: tyn
                                                    @Override // defpackage.anir
                                                    public final ankt a(Object obj3) {
                                                        ankt h;
                                                        final tyo tyoVar3 = tyo.this;
                                                        tqm tqmVar2 = tqmVar;
                                                        tqv tqvVar2 = tqvVar;
                                                        int i10 = i8;
                                                        final angn angnVar9 = angnVar8;
                                                        Void r13 = (Void) obj3;
                                                        aopa createBuilder2 = angu.a.createBuilder();
                                                        createBuilder2.copyOnWrite();
                                                        angu anguVar = (angu) createBuilder2.instance;
                                                        anguVar.b |= 8;
                                                        anguVar.f = i10;
                                                        tql tqlVar = tqmVar2.c;
                                                        if (tqlVar == null) {
                                                            tqlVar = tql.a;
                                                        }
                                                        if ((tqlVar.b & 2) == 0) {
                                                            createBuilder2.copyOnWrite();
                                                            angu anguVar2 = (angu) createBuilder2.instance;
                                                            anguVar2.b |= 2;
                                                            anguVar2.d = -1L;
                                                        } else {
                                                            tql tqlVar2 = tqmVar2.c;
                                                            if (tqlVar2 == null) {
                                                                tqlVar2 = tql.a;
                                                            }
                                                            long j4 = tqlVar2.d;
                                                            createBuilder2.copyOnWrite();
                                                            angu anguVar3 = (angu) createBuilder2.instance;
                                                            anguVar3.b |= 2;
                                                            anguVar3.d = j4 / 1000;
                                                        }
                                                        if (!tqvVar2.f) {
                                                            createBuilder2.copyOnWrite();
                                                            angu anguVar4 = (angu) createBuilder2.instance;
                                                            anguVar4.b |= 4;
                                                            anguVar4.e = -1L;
                                                            h = anii.h(tyoVar3.a.f(tqmVar2), new acsm(createBuilder2, 1), tyoVar3.d);
                                                        } else {
                                                            createBuilder2.copyOnWrite();
                                                            angu anguVar5 = (angu) createBuilder2.instance;
                                                            anguVar5.c = anha.a(3);
                                                            anguVar5.b = 1 | anguVar5.b;
                                                            tql tqlVar3 = tqmVar2.c;
                                                            if (tqlVar3 == null) {
                                                                tqlVar3 = tql.a;
                                                            }
                                                            if ((tqlVar3.b & 4) == 0) {
                                                                createBuilder2.copyOnWrite();
                                                                angu anguVar6 = (angu) createBuilder2.instance;
                                                                anguVar6.b |= 4;
                                                                anguVar6.e = -1L;
                                                            } else {
                                                                tql tqlVar4 = tqmVar2.c;
                                                                if (tqlVar4 == null) {
                                                                    tqlVar4 = tql.a;
                                                                }
                                                                long j5 = tqlVar4.e;
                                                                createBuilder2.copyOnWrite();
                                                                angu anguVar7 = (angu) createBuilder2.instance;
                                                                anguVar7.b |= 4;
                                                                anguVar7.e = j5 / 1000;
                                                            }
                                                            h = anlz.q((angu) createBuilder2.mo39build());
                                                        }
                                                        return anii.h(h, new ampg() { // from class: tyl
                                                            @Override // defpackage.ampg
                                                            public final Object apply(Object obj4) {
                                                                tyo.this.c.d(angnVar9, (angu) obj4);
                                                                return null;
                                                            }
                                                        }, tyoVar3.d);
                                                    }
                                                }, tyoVar2.d);
                                            }
                                        }
                                        return anktVar;
                                    }
                                }, tyoVar.d);
                            }
                            arrayList3.add(i2);
                            final tyz tyzVar = tvsVar4.j;
                            final int intValue2 = num.intValue();
                            tyzVar.i.C();
                            if (!typ.a(100L)) {
                                i3 = anlz.q(null);
                            } else {
                                i3 = anii.i(tyzVar.a.c(), new anir() { // from class: tyw
                                    @Override // defpackage.anir
                                    public final ankt a(Object obj2) {
                                        final tyz tyzVar2 = tyz.this;
                                        final int i8 = intValue2;
                                        final List list = (List) obj2;
                                        return anii.i(tyzVar2.a.e(), new anir() { // from class: tyx
                                            @Override // defpackage.anir
                                            public final ankt a(Object obj3) {
                                                Set set;
                                                final tyz tyzVar3 = tyz.this;
                                                List list2 = list;
                                                final int i9 = i8;
                                                for (tqm tqmVar : (List) obj3) {
                                                    aopa createBuilder = tqv.a.createBuilder();
                                                    String str2 = tqmVar.d;
                                                    createBuilder.copyOnWrite();
                                                    tqv tqvVar = (tqv) createBuilder.instance;
                                                    str2.getClass();
                                                    tqvVar.b = 1 | tqvVar.b;
                                                    tqvVar.c = str2;
                                                    if (amps.e(tqmVar.e)) {
                                                        createBuilder.copyOnWrite();
                                                        tqv tqvVar2 = (tqv) createBuilder.instance;
                                                        tqvVar2.b |= 2;
                                                        tqvVar2.d = "com.google.android.gms";
                                                    } else {
                                                        String str3 = tqmVar.e;
                                                        createBuilder.copyOnWrite();
                                                        tqv tqvVar3 = (tqv) createBuilder.instance;
                                                        str3.getClass();
                                                        tqvVar3.b |= 2;
                                                        tqvVar3.d = str3;
                                                    }
                                                    list2.add(Pair.create((tqv) createBuilder.mo39build(), tqmVar));
                                                }
                                                final HashMap hashMap = new HashMap();
                                                HashMap hashMap2 = new HashMap();
                                                HashMap hashMap3 = new HashMap();
                                                final HashMap hashMap4 = new HashMap();
                                                HashSet hashSet = new HashSet();
                                                AtomicLong atomicLong = new AtomicLong(0L);
                                                ArrayList arrayList4 = new ArrayList();
                                                Iterator it = list2.iterator();
                                                while (it.hasNext()) {
                                                    Pair pair = (Pair) it.next();
                                                    tqv tqvVar4 = (tqv) pair.first;
                                                    tqm tqmVar2 = (tqm) pair.second;
                                                    Set b = tyz.b(hashMap2, tyz.a(tqvVar4));
                                                    String a = tyz.a(tqvVar4);
                                                    vum vumVar = (vum) hashMap.get(a);
                                                    if (vumVar == null) {
                                                        hashMap.put(a, new vum());
                                                        vumVar = (vum) hashMap.get(a);
                                                    }
                                                    vum vumVar2 = vumVar;
                                                    if (tqvVar4.f) {
                                                        set = tyz.b(hashMap3, tyz.a(tqvVar4));
                                                        hashMap4.put(tyz.a(tqvVar4), tqmVar2);
                                                    } else {
                                                        set = null;
                                                    }
                                                    Set set2 = set;
                                                    for (tqk tqkVar : tqmVar2.n) {
                                                        int b2 = tqn.b(tqmVar2.i);
                                                        if (b2 == 0) {
                                                            b2 = 1;
                                                        }
                                                        tqy a2 = twx.a(tqkVar, b2);
                                                        tqv tqvVar5 = tqvVar4;
                                                        Iterator it2 = it;
                                                        ArrayList arrayList5 = arrayList4;
                                                        arrayList5.add(anii.h(anii.h(anhq.i(anko.q(tyzVar3.b.b(a2)), tww.class, g.n, tyzVar3.h), new ampg() { // from class: tyu
                                                            @Override // defpackage.ampg
                                                            public final Object apply(Object obj4) {
                                                                tyz tyzVar4 = tyz.this;
                                                                Uri uri = (Uri) obj4;
                                                                if (uri != null) {
                                                                    try {
                                                                        return Long.valueOf(tyzVar4.c.a(uri));
                                                                    } catch (IOException e) {
                                                                        typ.f(e, "%s: Failed to call mobstore fileSize on uri %s!", "StorageLogger", uri);
                                                                    }
                                                                }
                                                                return 0L;
                                                            }
                                                        }, tyzVar3.h), new ampg(hashSet, a2, atomicLong, b, vumVar2, tqvVar5, set2, null) { // from class: tyv
                                                            public final /* synthetic */ Set a;
                                                            public final /* synthetic */ tqy b;
                                                            public final /* synthetic */ AtomicLong c;
                                                            public final /* synthetic */ Set d;
                                                            public final /* synthetic */ tqv e;
                                                            public final /* synthetic */ Set f;
                                                            public final /* synthetic */ vum g;

                                                            @Override // defpackage.ampg
                                                            public final Object apply(Object obj4) {
                                                                Set set3 = this.a;
                                                                tqy tqyVar = this.b;
                                                                AtomicLong atomicLong2 = this.c;
                                                                Set set4 = this.d;
                                                                vum vumVar3 = this.g;
                                                                tqv tqvVar6 = this.e;
                                                                Set set5 = this.f;
                                                                Long l = (Long) obj4;
                                                                if (!set3.contains(tqyVar)) {
                                                                    atomicLong2.getAndAdd(l.longValue());
                                                                    set3.add(tqyVar);
                                                                }
                                                                if (!set4.contains(tqyVar)) {
                                                                    vumVar3.a += l.longValue();
                                                                    set4.add(tqyVar);
                                                                }
                                                                if (tqvVar6.f) {
                                                                    set5.getClass();
                                                                    if (set5.contains(tqyVar)) {
                                                                        return null;
                                                                    }
                                                                    vumVar3.b += l.longValue();
                                                                    set5.add(tqyVar);
                                                                    return null;
                                                                }
                                                                return null;
                                                            }
                                                        }, tyzVar3.h));
                                                        arrayList4 = arrayList5;
                                                        tqmVar2 = tqmVar2;
                                                        tqvVar4 = tqvVar5;
                                                        it = it2;
                                                        atomicLong = atomicLong;
                                                    }
                                                }
                                                final AtomicLong atomicLong2 = atomicLong;
                                                return anlz.j(arrayList4).a(new Callable() { // from class: tyy
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        tyz tyzVar4 = tyz.this;
                                                        Map map = hashMap;
                                                        Map map2 = hashMap4;
                                                        AtomicLong atomicLong3 = atomicLong2;
                                                        int i10 = i9;
                                                        aopa createBuilder2 = angz.a.createBuilder();
                                                        for (String str4 : map.keySet()) {
                                                            List h = amqf.c("|").h(str4);
                                                            aopa createBuilder3 = angn.a.createBuilder();
                                                            String str5 = (String) h.get(0);
                                                            createBuilder3.copyOnWrite();
                                                            angn angnVar = (angn) createBuilder3.instance;
                                                            str5.getClass();
                                                            angnVar.b |= 1;
                                                            angnVar.c = str5;
                                                            String str6 = (String) h.get(1);
                                                            createBuilder3.copyOnWrite();
                                                            angn angnVar2 = (angn) createBuilder3.instance;
                                                            str6.getClass();
                                                            angnVar2.b |= 4;
                                                            angnVar2.e = str6;
                                                            tqm tqmVar3 = (tqm) map2.get(str4);
                                                            if (tqmVar3 == null) {
                                                                createBuilder3.copyOnWrite();
                                                                angn angnVar3 = (angn) createBuilder3.instance;
                                                                angnVar3.b |= 2;
                                                                angnVar3.d = -1;
                                                            } else {
                                                                int i11 = tqmVar3.f;
                                                                createBuilder3.copyOnWrite();
                                                                angn angnVar4 = (angn) createBuilder3.instance;
                                                                angnVar4.b |= 2;
                                                                angnVar4.d = i11;
                                                                long j3 = tqmVar3.r;
                                                                createBuilder3.copyOnWrite();
                                                                angn angnVar5 = (angn) createBuilder3.instance;
                                                                angnVar5.b |= 32;
                                                                angnVar5.h = j3;
                                                                String str7 = tqmVar3.s;
                                                                createBuilder3.copyOnWrite();
                                                                angn angnVar6 = (angn) createBuilder3.instance;
                                                                str7.getClass();
                                                                angnVar6.b |= 64;
                                                                angnVar6.i = str7;
                                                            }
                                                            angn angnVar7 = (angn) createBuilder3.mo39build();
                                                            createBuilder2.copyOnWrite();
                                                            angz angzVar = (angz) createBuilder2.instance;
                                                            angnVar7.getClass();
                                                            aopu aopuVar = angzVar.c;
                                                            if (!aopuVar.c()) {
                                                                angzVar.c = aopi.mutableCopy(aopuVar);
                                                            }
                                                            angzVar.c.add(angnVar7);
                                                            vum vumVar3 = (vum) map.get(str4);
                                                            long j4 = vumVar3.a;
                                                            createBuilder2.copyOnWrite();
                                                            angz angzVar2 = (angz) createBuilder2.instance;
                                                            aopt aoptVar = angzVar2.d;
                                                            if (!aoptVar.c()) {
                                                                angzVar2.d = aopi.mutableCopy(aoptVar);
                                                            }
                                                            angzVar2.d.f(j4);
                                                            long j5 = vumVar3.b;
                                                            createBuilder2.copyOnWrite();
                                                            angz angzVar3 = (angz) createBuilder2.instance;
                                                            aopt aoptVar2 = angzVar3.e;
                                                            if (!aoptVar2.c()) {
                                                                angzVar3.e = aopi.mutableCopy(aoptVar2);
                                                            }
                                                            angzVar3.e.f(j5);
                                                        }
                                                        long j6 = atomicLong3.get();
                                                        createBuilder2.copyOnWrite();
                                                        angz angzVar4 = (angz) createBuilder2.instance;
                                                        angzVar4.b |= 1;
                                                        angzVar4.f = j6;
                                                        long j7 = 0;
                                                        try {
                                                            Uri m = tzc.m(tyzVar4.e, tyzVar4.g);
                                                            if (tyzVar4.c.h(m)) {
                                                                j7 = ((Long) tyzVar4.c.c(m, vkg.b())).longValue();
                                                            }
                                                        } catch (IOException e) {
                                                            typ.f(e, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", "StorageLogger");
                                                            tyzVar4.f.a(e, "Failed to call Mobstore to compute MDD Directory bytes used!", new Object[0]);
                                                        }
                                                        createBuilder2.copyOnWrite();
                                                        angz angzVar5 = (angz) createBuilder2.instance;
                                                        angzVar5.b |= 2;
                                                        angzVar5.g = j7;
                                                        createBuilder2.copyOnWrite();
                                                        angz angzVar6 = (angz) createBuilder2.instance;
                                                        angzVar6.b |= 4;
                                                        angzVar6.h = i10;
                                                        tyzVar4.d.f((angz) createBuilder2.mo39build());
                                                        return null;
                                                    }
                                                }, tyzVar3.h);
                                            }
                                        }, tyzVar2.h);
                                    }
                                }, tyzVar.h);
                            }
                            arrayList3.add(i3);
                            tys tysVar = tvsVar4.l;
                            tysVar.d.z();
                            if (!typ.a(100L)) {
                                synchronized (tzq.class) {
                                    uaw.b(tysVar.b, "gms_icing_mdd_network_usage_monitor", tysVar.c).edit().clear().commit();
                                }
                                q = anlz.q(null);
                                tvsVar3 = tvsVar4;
                                arrayList2 = arrayList3;
                            } else {
                                HashSet hashSet = new HashSet();
                                aopa createBuilder = angx.a.createBuilder();
                                synchronized (tzq.class) {
                                    SharedPreferences b = uaw.b(tysVar.b, "gms_icing_mdd_network_usage_monitor", tysVar.c);
                                    Iterator<String> it = b.getAll().keySet().iterator();
                                    long j3 = 0;
                                    long j4 = 0;
                                    while (it.hasNext()) {
                                        List h = amqf.c("|").h(it.next());
                                        if (h.size() >= i6) {
                                            String str2 = (String) h.get(i5);
                                            int parseInt = Integer.parseInt((String) h.get(i7));
                                            String c2 = tzq.c((String) h.get(0), str2, parseInt);
                                            if (!hashSet.contains(c2)) {
                                                hashSet.add(c2);
                                                String d = tzq.d(c2, "w");
                                                String d2 = tzq.d(c2, "c");
                                                tvs tvsVar5 = tvsVar4;
                                                long j5 = b.getLong(d, 0L);
                                                ArrayList arrayList4 = arrayList3;
                                                HashSet hashSet2 = hashSet;
                                                long j6 = b.getLong(d2, 0L);
                                                aopa createBuilder2 = angn.a.createBuilder();
                                                String str3 = (String) h.get(0);
                                                createBuilder2.copyOnWrite();
                                                angn angnVar = (angn) createBuilder2.instance;
                                                str3.getClass();
                                                Iterator<String> it2 = it;
                                                angnVar.b |= 4;
                                                angnVar.e = str3;
                                                String str4 = (String) h.get(1);
                                                createBuilder2.copyOnWrite();
                                                angn angnVar2 = (angn) createBuilder2.instance;
                                                str4.getClass();
                                                angnVar2.b |= 1;
                                                angnVar2.c = str4;
                                                createBuilder2.copyOnWrite();
                                                angn angnVar3 = (angn) createBuilder2.instance;
                                                angnVar3.b |= 2;
                                                angnVar3.d = parseInt;
                                                angn angnVar4 = (angn) createBuilder2.mo39build();
                                                aopa createBuilder3 = angw.a.createBuilder();
                                                createBuilder3.copyOnWrite();
                                                angw angwVar = (angw) createBuilder3.instance;
                                                angnVar4.getClass();
                                                angwVar.c = angnVar4;
                                                angwVar.b |= 1;
                                                createBuilder3.copyOnWrite();
                                                angw angwVar2 = (angw) createBuilder3.instance;
                                                angwVar2.b |= 2;
                                                angwVar2.d = j5;
                                                createBuilder3.copyOnWrite();
                                                angw angwVar3 = (angw) createBuilder3.instance;
                                                angwVar3.b |= 4;
                                                angwVar3.e = j6;
                                                angw angwVar4 = (angw) createBuilder3.mo39build();
                                                createBuilder.copyOnWrite();
                                                angx angxVar = (angx) createBuilder.instance;
                                                angwVar4.getClass();
                                                aopu aopuVar = angxVar.c;
                                                if (!aopuVar.c()) {
                                                    angxVar.c = aopi.mutableCopy(aopuVar);
                                                }
                                                angxVar.c.add(angwVar4);
                                                j3 += j5;
                                                j4 += j6;
                                                tvsVar4 = tvsVar5;
                                                it = it2;
                                                arrayList3 = arrayList4;
                                                hashSet = hashSet2;
                                                i5 = 1;
                                                i7 = 2;
                                                i6 = 4;
                                            }
                                        }
                                        j3 = j3;
                                        tvsVar4 = tvsVar4;
                                        j4 = j4;
                                        it = it;
                                        arrayList3 = arrayList3;
                                        hashSet = hashSet;
                                        i5 = 1;
                                        i7 = 2;
                                        i6 = 4;
                                    }
                                    tvsVar3 = tvsVar4;
                                    arrayList = arrayList3;
                                    j = j3;
                                    j2 = j4;
                                    b.edit().clear().commit();
                                }
                                createBuilder.copyOnWrite();
                                angx angxVar2 = (angx) createBuilder.instance;
                                angxVar2.b |= 1;
                                angxVar2.d = j;
                                createBuilder.copyOnWrite();
                                angx angxVar3 = (angx) createBuilder.instance;
                                angxVar3.b |= 2;
                                angxVar3.e = j2;
                                tysVar.a.e((angx) createBuilder.mo39build());
                                q = anlz.q(null);
                                arrayList2 = arrayList;
                            }
                            arrayList2.add(q);
                            if (tvsVar3.o.h()) {
                                tuk tukVar4 = tvsVar3.d;
                                arrayList2.add(anii.i(tukVar4.d.d(), new tth(tukVar4, 5), tukVar4.h));
                            }
                            uaw.b(tvsVar3.b, "gms_icing_mdd_manager_metadata", tvsVar3.m).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
                            return anlz.j(arrayList2).a(gbb.m, tvsVar3.n);
                        }
                    }, tvsVar2.n);
                }
            }, this.f);
        } else if (c == 1) {
            return anii.i(g(), new trk(this, 1), this.f);
        } else {
            if (c == 2) {
                return j(false);
            }
            if (c == 3) {
                return j(true);
            }
            int i = typ.a;
            return anlz.p(new IllegalArgumentException(str.length() != 0 ? "Unknown task tag sent to MDD.handleTask() ".concat(str) : new String("Unknown task tag sent to MDD.handleTask() ")));
        }
    }
}
