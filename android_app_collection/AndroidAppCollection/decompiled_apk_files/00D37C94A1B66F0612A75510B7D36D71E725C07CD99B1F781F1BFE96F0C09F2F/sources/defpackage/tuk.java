package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: tuk  reason: default package */
/* loaded from: classes4.dex */
public final class tuk {
    public final Context a;
    public final tyk b;
    public final trv c;
    public final tul d;
    public final twv e;
    public final snc f;
    public final vjb g;
    public final Executor h;
    public final ampq i;
    public final ampq j;
    public final tqe k;

    public tuk(Context context, tyk tykVar, trv trvVar, tul tulVar, twv twvVar, snc sncVar, Executor executor, ampq ampqVar, vjb vjbVar, ampq ampqVar2, tqe tqeVar) {
        this.a = context;
        this.b = tykVar;
        this.c = trvVar;
        this.d = tulVar;
        this.e = twvVar;
        this.f = sncVar;
        this.h = executor;
        this.i = ampqVar;
        this.g = vjbVar;
        this.j = ampqVar2;
        this.k = tqeVar;
    }

    public static boolean p(tqm tqmVar, tqm tqmVar2) {
        if (q(tqmVar, tqmVar2) && tqmVar2.f == tqmVar.f && tqmVar2.j == tqmVar.j && tqmVar2.k == tqmVar.k) {
            tqp tqpVar = tqmVar2.l;
            if (tqpVar == null) {
                tqpVar = tqp.a;
            }
            tqp tqpVar2 = tqmVar.l;
            if (tqpVar2 == null) {
                tqpVar2 = tqp.a;
            }
            if (tqpVar.equals(tqpVar2)) {
                int b = tqn.b(tqmVar2.i);
                if (b == 0) {
                    b = 1;
                }
                int b2 = tqn.b(tqmVar.i);
                if (b2 == 0) {
                    b2 = 1;
                }
                if (b == b2) {
                    int a = uaw.a(tqmVar2.q);
                    if (a == 0) {
                        a = 1;
                    }
                    int a2 = uaw.a(tqmVar.q);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    return a == a2;
                }
            }
        }
        return false;
    }

    public static boolean q(tqm tqmVar, tqm tqmVar2) {
        return tqmVar.n.equals(tqmVar2.n);
    }

    public static boolean s(tqz tqzVar, long j) {
        return j > tqzVar.f;
    }

    public static void u(int i, tyk tykVar, tqm tqmVar) {
        tykVar.h(i, tqmVar.d, tqmVar.f, tqmVar.r, tqmVar.s);
    }

    public static void v(tyk tykVar, tqm tqmVar, tqk tqkVar, int i) {
        aopa createBuilder = angq.a.createBuilder();
        createBuilder.copyOnWrite();
        angq angqVar = (angq) createBuilder.instance;
        angqVar.c = anhh.f(i);
        angqVar.b |= 1;
        String str = tqmVar.d;
        createBuilder.copyOnWrite();
        angq angqVar2 = (angq) createBuilder.instance;
        str.getClass();
        angqVar2.b |= 2;
        angqVar2.d = str;
        int i2 = tqmVar.f;
        createBuilder.copyOnWrite();
        angq angqVar3 = (angq) createBuilder.instance;
        angqVar3.b |= 4;
        angqVar3.e = i2;
        long j = tqmVar.r;
        createBuilder.copyOnWrite();
        angq angqVar4 = (angq) createBuilder.instance;
        angqVar4.b |= 128;
        angqVar4.i = j;
        String str2 = tqmVar.s;
        createBuilder.copyOnWrite();
        angq angqVar5 = (angq) createBuilder.instance;
        str2.getClass();
        angqVar5.b |= 256;
        angqVar5.j = str2;
        String str3 = tqkVar.c;
        createBuilder.copyOnWrite();
        angq angqVar6 = (angq) createBuilder.instance;
        str3.getClass();
        angqVar6.b |= 8;
        angqVar6.f = str3;
        tykVar.a((angq) createBuilder.mo39build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Uri a(Uri uri, tqk tqkVar, tqm tqmVar) {
        Uri d = tzc.d(this.a, this.i, tqkVar, tqmVar);
        Uri a = tzi.a(this.a, d);
        if (!this.g.h(d) || !a.toString().equals(uri.toString())) {
            throw new IOException("Isolated file uri does not exist or points to an unexpected target");
        }
        return d;
    }

    public final Uri b(tqk tqkVar, tqy tqyVar, tqz tqzVar) {
        Context context = this.a;
        int b = tqn.b(tqyVar.f);
        Uri q = tzc.q(context, b == 0 ? 1 : b, tqzVar.c, tqkVar.g, this.c, this.i, false);
        if (q != null) {
            return q;
        }
        typ.c("%s: Failed to get file uri!", "FileGroupManager");
        throw new tza(28, "Failed to get local file uri");
    }

    public final ankt c(tqm tqmVar) {
        if (!tqmVar.m) {
            return ankq.a;
        }
        try {
            tzc.h(this.a, this.i, tqmVar, this.g);
            ArrayList arrayList = new ArrayList(tqmVar.n.size());
            Iterator it = tqmVar.n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                tqk tqkVar = (tqk) it.next();
                int d = tqn.d(tqkVar.m);
                if (d == 0 || d != 2) {
                    arrayList.add(anii.i(h(tqkVar, tqmVar), new ttj(this, tqkVar, tqmVar, 1), this.h));
                } else {
                    arrayList.add(anlz.p(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing")));
                    break;
                }
            }
            ankt a = anlz.l(arrayList).a(gbb.f, this.h);
            anlz.A(a, new tuh(this, tqmVar), this.h);
            return a;
        } catch (IOException e) {
            tpy a2 = tqa.a();
            a2.a = tpz.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
            a2.b = "Unable to cleanup symlink structure";
            a2.c = e;
            return anlz.p(a2.a());
        }
    }

    public final ankt d(final tqv tqvVar, final tqp tqpVar) {
        final AtomicReference atomicReference = new AtomicReference();
        return anhq.i(anii.i(e(tqvVar, false), new anir() { // from class: ttz
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                final tuk tukVar = tuk.this;
                final tqv tqvVar2 = tqvVar;
                final AtomicReference atomicReference2 = atomicReference;
                final tqp tqpVar2 = tqpVar;
                tqm tqmVar = (tqm) obj;
                if (tqmVar == null) {
                    return anii.i(tukVar.e(tqvVar2, true), new anir() { // from class: ttg
                        @Override // defpackage.anir
                        public final ankt a(Object obj2) {
                            tqv tqvVar3 = tqv.this;
                            AtomicReference atomicReference3 = atomicReference2;
                            tqm tqmVar2 = (tqm) obj2;
                            if (tqmVar2 == null) {
                                tpy a = tqa.a();
                                a.a = tpz.GROUP_NOT_FOUND_ERROR;
                                String valueOf = String.valueOf(tqvVar3.c);
                                a.b = valueOf.length() != 0 ? "Nothing to download for file group: ".concat(valueOf) : new String("Nothing to download for file group: ");
                                return anlz.p(a.a());
                            }
                            atomicReference3.set(tqmVar2);
                            return anlz.q(tqmVar2);
                        }
                    }, tukVar.h);
                }
                atomicReference2.set(tqmVar);
                tql tqlVar = tqmVar.c;
                if (tqlVar == null) {
                    tqlVar = tql.a;
                }
                int i = tqlVar.g;
                aopa mo52toBuilder = tqmVar.mo52toBuilder();
                aopa mo52toBuilder2 = tqlVar.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                tql tqlVar2 = (tql) mo52toBuilder2.instance;
                tqlVar2.b |= 16;
                tqlVar2.g = i + 1;
                mo52toBuilder.copyOnWrite();
                tqm tqmVar2 = (tqm) mo52toBuilder.instance;
                tql tqlVar3 = (tql) mo52toBuilder2.mo39build();
                tqlVar3.getClass();
                tqmVar2.c = tqlVar3;
                tqmVar2.b |= 1;
                final tqm tqmVar3 = (tqm) mo52toBuilder.mo39build();
                final boolean z = !((tqlVar.b & 8) != 0);
                if (z) {
                    long c = tukVar.f.c();
                    tql tqlVar4 = tqmVar3.c;
                    if (tqlVar4 == null) {
                        tqlVar4 = tql.a;
                    }
                    aopa mo52toBuilder3 = tqlVar4.mo52toBuilder();
                    mo52toBuilder3.copyOnWrite();
                    tql tqlVar5 = (tql) mo52toBuilder3.instance;
                    tqlVar5.b |= 8;
                    tqlVar5.f = c;
                    tql tqlVar6 = (tql) mo52toBuilder3.mo39build();
                    aopa mo52toBuilder4 = tqmVar3.mo52toBuilder();
                    mo52toBuilder4.copyOnWrite();
                    tqm tqmVar4 = (tqm) mo52toBuilder4.instance;
                    tqlVar6.getClass();
                    tqmVar4.c = tqlVar6;
                    tqmVar4.b = 1 | tqmVar4.b;
                    tqmVar3 = (tqm) mo52toBuilder4.mo39build();
                }
                aopa mo52toBuilder5 = tqvVar2.mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                tqv tqvVar3 = (tqv) mo52toBuilder5.instance;
                tqvVar3.b |= 8;
                tqvVar3.f = false;
                return anii.i(anhq.i(anko.q(anii.i(tukVar.d.l((tqv) mo52toBuilder5.mo39build(), tqmVar3), new anir() { // from class: tuf
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        tuk tukVar2 = tuk.this;
                        boolean z2 = z;
                        tqm tqmVar5 = tqmVar3;
                        if (!((Boolean) obj2).booleanValue()) {
                            tukVar2.b.g(1036);
                            return anlz.p(new IOException("Unable to update file group metadata"));
                        }
                        if (z2) {
                            tuk.u(1072, tukVar2.b, tqmVar5);
                        }
                        return anlz.q(tqmVar5);
                    }
                }, tukVar.h)), IOException.class, g.g, tukVar.h), new anir() { // from class: ttu
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        ankt p;
                        final tuk tukVar2 = tuk.this;
                        tqp tqpVar3 = tqpVar2;
                        final tqv tqvVar4 = tqvVar2;
                        final tqm tqmVar5 = (tqm) obj2;
                        if (tqpVar3 == null && (tqpVar3 = tqmVar5.l) == null) {
                            tqpVar3 = tqp.a;
                        }
                        final tqp tqpVar4 = tqpVar3;
                        final ArrayList arrayList = new ArrayList();
                        for (final tqk tqkVar : tqmVar5.n) {
                            if (!tzc.l(tqkVar)) {
                                int b = tqn.b(tqmVar5.i);
                                if (b == 0) {
                                    b = 1;
                                }
                                final tqy a = twx.a(tqkVar, b);
                                if (Build.VERSION.SDK_INT >= 30) {
                                    p = anii.i(anii.i(anhq.i(tukVar2.e.c(a), tww.class, new tto(tukVar2, a, tqmVar5, tqkVar, 4), tukVar2.h), new tto(tukVar2, tqmVar5, tqkVar, a), tukVar2.h), new anir() { // from class: ttx
                                        @Override // defpackage.anir
                                        public final ankt a(Object obj3) {
                                            tuk tukVar3 = tuk.this;
                                            tqv tqvVar5 = tqvVar4;
                                            tqk tqkVar2 = tqkVar;
                                            tqy tqyVar = a;
                                            tqp tqpVar5 = tqpVar4;
                                            tqm tqmVar6 = tqmVar5;
                                            Void r15 = (Void) obj3;
                                            try {
                                                return anii.i(tukVar3.e.d(tqvVar5, tqkVar2, tqyVar, tqpVar5, tqmVar6.o, tqmVar6.p), new tto(tukVar3, tqmVar6, tqkVar2, tqyVar, 2), tukVar3.h);
                                            } catch (RuntimeException e) {
                                                tpy a2 = tqa.a();
                                                a2.a = tpz.UNKNOWN_ERROR;
                                                a2.c = e;
                                                return anlz.p(a2.a());
                                            }
                                        }
                                    }, tukVar2.h);
                                } else {
                                    try {
                                        p = tukVar2.e.d(tqvVar4, tqkVar, a, tqpVar4, tqmVar5.o, tqmVar5.p);
                                    } catch (RuntimeException e) {
                                        tpy a2 = tqa.a();
                                        a2.a = tpz.UNKNOWN_ERROR;
                                        a2.c = e;
                                        p = anlz.p(a2.a());
                                    }
                                }
                                arrayList.add(p);
                            }
                        }
                        return anlz.j(arrayList).b(new aniq() { // from class: tug
                            @Override // defpackage.aniq
                            public final ankt a() {
                                final tuk tukVar3 = tuk.this;
                                final tqv tqvVar5 = tqvVar4;
                                final tqm tqmVar6 = tqmVar5;
                                final List list = arrayList;
                                return anii.i(tukVar3.n(tqvVar5, tqmVar6), new anir() { // from class: tub
                                    @Override // defpackage.anir
                                    public final ankt a(Object obj3) {
                                        tuk tukVar4 = tuk.this;
                                        List list2 = list;
                                        tqm tqmVar7 = tqmVar6;
                                        tqv tqvVar6 = tqvVar5;
                                        if (((tui) obj3) != tui.DOWNLOADED) {
                                            typ.e("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", tqvVar6.c, tqvVar6.d);
                                            tpt.b(list2, tqvVar6.c);
                                            typ.c("%s: An unknown error has occurred during download", "FileGroupManager");
                                            tpy a3 = tqa.a();
                                            a3.a = tpz.UNKNOWN_ERROR;
                                            throw a3.a();
                                        }
                                        tyk tykVar = tukVar4.b;
                                        aopa createBuilder = angn.a.createBuilder();
                                        String str = tqvVar6.c;
                                        createBuilder.copyOnWrite();
                                        angn angnVar = (angn) createBuilder.instance;
                                        str.getClass();
                                        angnVar.b = 1 | angnVar.b;
                                        angnVar.c = str;
                                        String str2 = tqvVar6.d;
                                        createBuilder.copyOnWrite();
                                        angn angnVar2 = (angn) createBuilder.instance;
                                        str2.getClass();
                                        angnVar2.b |= 4;
                                        angnVar2.e = str2;
                                        int i2 = tqmVar7.f;
                                        createBuilder.copyOnWrite();
                                        angn angnVar3 = (angn) createBuilder.instance;
                                        angnVar3.b |= 2;
                                        angnVar3.d = i2;
                                        long j = tqmVar7.r;
                                        createBuilder.copyOnWrite();
                                        angn angnVar4 = (angn) createBuilder.instance;
                                        angnVar4.b |= 32;
                                        angnVar4.h = j;
                                        String str3 = tqmVar7.s;
                                        createBuilder.copyOnWrite();
                                        angn angnVar5 = (angn) createBuilder.instance;
                                        str3.getClass();
                                        angnVar5.b |= 64;
                                        angnVar5.i = str3;
                                        tykVar.j(3, (angn) createBuilder.mo39build());
                                        return anlz.q(tqmVar7);
                                    }
                                }, tukVar3.h);
                            }
                        }, tukVar2.h);
                    }
                }, tukVar.h);
            }
        }, this.h), Exception.class, new anir() { // from class: tud
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tuk tukVar = tuk.this;
                AtomicReference atomicReference2 = atomicReference;
                tqv tqvVar2 = tqvVar;
                final Exception exc = (Exception) obj;
                tqm tqmVar = (tqm) atomicReference2.get();
                if (tqmVar == null) {
                    tqmVar = tqm.a;
                }
                tqm tqmVar2 = tqmVar;
                ankt q = anlz.q(null);
                if (exc instanceof tqa) {
                    int i = typ.a;
                    q = anii.i(q, new ttw(tukVar, tqvVar2, (tqa) exc, tqmVar2, 1), tukVar.h);
                } else if (exc instanceof tpt) {
                    int i2 = typ.a;
                    amuk amukVar = ((tpt) exc).a;
                    int i3 = ((amxx) amukVar).c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        Throwable th = (Throwable) amukVar.get(i4);
                        if (!(th instanceof tqa)) {
                            typ.c("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                        } else {
                            q = anii.i(q, new ttw(tukVar, tqvVar2, (tqa) th, tqmVar2), tukVar.h);
                        }
                    }
                }
                return anii.i(q, new anir() { // from class: tte
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        Void r2 = (Void) obj2;
                        throw exc;
                    }
                }, tukVar.h);
            }
        }, this.h);
    }

    public final ankt e(tqv tqvVar, boolean z) {
        aopa mo52toBuilder = tqvVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        tqv tqvVar2 = (tqv) mo52toBuilder.instance;
        tqvVar2.b |= 8;
        tqvVar2.f = z;
        return anii.i(this.d.g((tqv) mo52toBuilder.mo39build()), new tue(this, z, 1), this.h);
    }

    public final ankt f(tqm tqmVar) {
        return g(tqmVar, false, false, 0, tqmVar.n.size());
    }

    public final ankt g(final tqm tqmVar, final boolean z, final boolean z2, final int i, final int i2) {
        if (i >= i2) {
            if (z) {
                return anlz.q(tui.FAILED);
            }
            if (z2) {
                return anlz.q(tui.PENDING);
            }
            return anlz.q(tui.DOWNLOADED);
        }
        final tqk tqkVar = (tqk) tqmVar.n.get(i);
        int i3 = 1;
        if (!tzc.l(tqkVar)) {
            int b = tqn.b(tqmVar.i);
            if (b != 0) {
                i3 = b;
            }
            tqy a = twx.a(tqkVar, i3);
            twv twvVar = this.e;
            return anii.i(anhq.i(anko.q(anii.i(twvVar.c(a), g.l, twvVar.k)), tww.class, new ttm(this, tqmVar), this.h), new anir() { // from class: ttl
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    tuk tukVar = tuk.this;
                    tqk tqkVar2 = tqkVar;
                    tqm tqmVar2 = tqmVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    int i4 = i;
                    int i5 = i2;
                    tqu tquVar = (tqu) obj;
                    if (tquVar == tqu.DOWNLOAD_COMPLETE) {
                        String str = tqkVar2.c;
                        String str2 = tqmVar2.d;
                        int i6 = typ.a;
                        return tukVar.g(tqmVar2, z3, z4, i4 + 1, i5);
                    } else if (tquVar == tqu.SUBSCRIBED || tquVar == tqu.DOWNLOAD_IN_PROGRESS) {
                        String str3 = tqkVar2.c;
                        String str4 = tqmVar2.d;
                        int i7 = typ.a;
                        return tukVar.g(tqmVar2, z3, true, i4 + 1, i5);
                    } else {
                        String str5 = tqkVar2.c;
                        String str6 = tqmVar2.d;
                        int i8 = typ.a;
                        return tukVar.g(tqmVar2, true, z4, i4 + 1, i5);
                    }
                }
            }, this.h);
        }
        return g(tqmVar, z, z2, i + 1, i2);
    }

    public final ankt h(tqk tqkVar, tqm tqmVar) {
        if (!tzc.l(tqkVar)) {
            int b = tqn.b(tqmVar.i);
            if (b == 0) {
                b = 1;
            }
            return this.e.b(twx.a(tqkVar, b));
        }
        return anlz.q(Uri.parse(tqkVar.d));
    }

    public final ankt i(final anir anirVar) {
        final ArrayList arrayList = new ArrayList();
        return anii.i(this.d.d(), new anir() { // from class: tuc
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tuk tukVar = tuk.this;
                List list = arrayList;
                final anir anirVar2 = anirVar;
                for (final tqv tqvVar : (List) obj) {
                    list.add(anii.i(tukVar.d.g(tqvVar), new anir() { // from class: ttd
                        @Override // defpackage.anir
                        public final ankt a(Object obj2) {
                            return anir.this.a(new tuj(tqvVar, (tqm) obj2));
                        }
                    }, tukVar.h));
                }
                return anlz.j(list).a(gbb.h, tukVar.h);
            }
        }, this.h);
    }

    public final ankt j(tqv tqvVar, final tqa tqaVar, long j, String str) {
        final aopa createBuilder = angn.a.createBuilder();
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
        createBuilder.copyOnWrite();
        angn angnVar3 = (angn) createBuilder.instance;
        angnVar3.b |= 32;
        angnVar3.h = j;
        createBuilder.copyOnWrite();
        angn angnVar4 = (angn) createBuilder.instance;
        str.getClass();
        angnVar4.b |= 64;
        angnVar4.i = str;
        tul tulVar = this.d;
        aopa mo52toBuilder = tqvVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        tqv tqvVar2 = (tqv) mo52toBuilder.instance;
        tqvVar2.b |= 8;
        tqvVar2.f = false;
        return anii.i(tulVar.g((tqv) mo52toBuilder.mo39build()), new anir() { // from class: tua
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tuk tukVar = tuk.this;
                aopa aopaVar = createBuilder;
                tqa tqaVar2 = tqaVar;
                tqm tqmVar = (tqm) obj;
                if (tqmVar != null) {
                    int i = tqmVar.f;
                    aopaVar.copyOnWrite();
                    angn angnVar5 = (angn) aopaVar.instance;
                    angn angnVar6 = angn.a;
                    angnVar5.b |= 2;
                    angnVar5.d = i;
                }
                tukVar.b.j(anha.b(tqaVar2.a.an), (angn) aopaVar.mo39build());
                return anlz.q(null);
            }
        }, this.h);
    }

    public final ankt k(final tqm tqmVar, boolean z) {
        this.k.k();
        if (tqmVar == null || !z || !tzc.k(tqmVar)) {
            return anlz.q(true);
        }
        ArrayList arrayList = new ArrayList(tqmVar.n.size());
        for (tqk tqkVar : tqmVar.n) {
            arrayList.add(anii.i(h(tqkVar, tqmVar), new ttj(this, tqkVar, tqmVar), this.h));
        }
        return anhq.h(anlz.l(arrayList).a(gbb.i, this.h), IOException.class, new ampg() { // from class: tta
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                typ.h((IOException) obj, "%s: Detected corruption of isolated structure for group %s", "FileGroupManager", tqm.this.d);
                return false;
            }
        }, this.h);
    }

    public final ankt l(final tqm tqmVar, final int i, final int i2) {
        if (i < i2) {
            tqk tqkVar = (tqk) tqmVar.n.get(i);
            if (!tzc.l(tqkVar)) {
                int b = tqn.b(tqmVar.i);
                if (b == 0) {
                    b = 1;
                }
                tqy a = twx.a(tqkVar, b);
                twv twvVar = this.e;
                return anii.i(anii.i(twvVar.c.e(a), new twu(twvVar, a, 1), twvVar.k), new anir() { // from class: ttn
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        tuk tukVar = tuk.this;
                        tqm tqmVar2 = tqmVar;
                        int i3 = i;
                        int i4 = i2;
                        if (!((Boolean) obj).booleanValue()) {
                            typ.d("%s: Subscribing to file failed for group: %s", "FileGroupManager", tqmVar2.d);
                            return anlz.q(false);
                        }
                        return tukVar.l(tqmVar2, i3 + 1, i4);
                    }
                }, this.h);
            }
            return l(tqmVar, i + 1, i2);
        }
        return anlz.q(true);
    }

    public final ankt m(tqm tqmVar, tqk tqkVar, final tqy tqyVar, final long j) {
        final twv twvVar = this.e;
        return anii.i(anii.i(twvVar.c(tqyVar), new anir() { // from class: twt
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                twv twvVar2 = twv.this;
                long j2 = j;
                tqy tqyVar2 = tqyVar;
                tqz tqzVar = (tqz) obj;
                if (j2 > tqzVar.f) {
                    aopa mo52toBuilder = tqzVar.mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    tqz tqzVar2 = (tqz) mo52toBuilder.instance;
                    tqzVar2.b |= 8;
                    tqzVar2.f = j2;
                    return twvVar2.c.g(tqyVar2, (tqz) mo52toBuilder.mo39build());
                }
                return anlz.q(true);
            }
        }, twvVar.k), new ttj(this, tqkVar, tqmVar, 2), this.h);
    }

    public final ankt n(tqv tqvVar, tqm tqmVar) {
        String str = tqmVar.d;
        int i = typ.a;
        return anii.i(f(tqmVar), new tts(this, tqmVar, tqvVar, 2), this.h);
    }

    public final void o(Uri uri, tqm tqmVar, tqk tqkVar) {
        try {
            this.g.f(uri);
        } catch (IOException unused) {
            typ.e("%s: Failed to delete the local copy after android-sharing the file %s, file group %s", "FileGroupManager", tqkVar.c, tqmVar.d);
            v(this.b, tqmVar, tqkVar, 23);
        }
    }

    public final boolean r(String str) {
        try {
            this.a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt t(final tqm tqmVar, final tqk tqkVar, tqz tqzVar, tqy tqyVar, String str, long j, final int i) {
        String str2 = "";
        if (tqzVar.e && !s(tqzVar, j)) {
            v(this.b, tqmVar, tqkVar, i);
            return anlz.q(true);
        }
        final long max = Math.max(j, tqzVar.f);
        Context context = this.a;
        vjb vjbVar = this.g;
        int i2 = 0;
        try {
            vjh a = vji.a(context);
            a.a = String.valueOf(str).concat(".lease");
            a.b = max;
            OutputStream outputStream = (OutputStream) vjbVar.c(a.a(), vkl.b());
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (vjt unused) {
            typ.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", tqkVar.c, tqmVar.d);
            str2 = String.format("Malformed lease Uri for file %s, group %s", tqkVar.c, tqmVar.d);
            i2 = 18;
        } catch (IOException unused2) {
            typ.e("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", tqkVar.c, tqmVar.d);
            str2 = String.format("Error while acquiring lease for file %s, group %s", tqkVar.c, tqmVar.d);
            i2 = 20;
        } catch (vjo unused3) {
            typ.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", tqkVar.c, tqmVar.d);
            str2 = String.format("System limit exceeded for file %s, group %s", tqkVar.c, tqmVar.d);
            i2 = 25;
        } catch (vjw e) {
            if (!TextUtils.isEmpty(e.getMessage())) {
                str2 = e.getMessage();
            }
            String str3 = tqkVar.c;
            String str4 = tqmVar.d;
            int i3 = typ.a;
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? "UnsupportedFileStorageOperation was thrown: ".concat(valueOf) : new String("UnsupportedFileStorageOperation was thrown: ");
            i2 = 24;
        }
        if (i2 != 0) {
            throw new tza(i2, str2);
        }
        twv twvVar = this.e;
        aopa createBuilder = tqz.a.createBuilder();
        tqu tquVar = tqu.DOWNLOAD_COMPLETE;
        createBuilder.copyOnWrite();
        tqz tqzVar2 = (tqz) createBuilder.instance;
        tqzVar2.d = tquVar.h;
        tqzVar2.b |= 2;
        String valueOf2 = String.valueOf(str);
        String concat = valueOf2.length() != 0 ? "android_shared_".concat(valueOf2) : new String("android_shared_");
        createBuilder.copyOnWrite();
        tqz tqzVar3 = (tqz) createBuilder.instance;
        concat.getClass();
        tqzVar3.b |= 1;
        tqzVar3.c = concat;
        createBuilder.copyOnWrite();
        tqz tqzVar4 = (tqz) createBuilder.instance;
        tqzVar4.b |= 4;
        tqzVar4.e = true;
        createBuilder.copyOnWrite();
        tqz tqzVar5 = (tqz) createBuilder.instance;
        tqzVar5.b |= 8;
        tqzVar5.f = max;
        createBuilder.copyOnWrite();
        tqz tqzVar6 = (tqz) createBuilder.instance;
        str.getClass();
        tqzVar6.b |= 16;
        tqzVar6.g = str;
        return anii.i(twvVar.c.g(tqyVar, (tqz) createBuilder.mo39build()), new anir() { // from class: ttk
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tuk tukVar = tuk.this;
                tqk tqkVar2 = tqkVar;
                tqm tqmVar2 = tqmVar;
                int i4 = i;
                long j2 = max;
                if (!((Boolean) obj).booleanValue()) {
                    typ.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", tqkVar2.c, tqmVar2.d);
                    tuk.v(tukVar.b, tqmVar2, tqkVar2, 15);
                    return anlz.q(false);
                }
                tyk tykVar = tukVar.b;
                aopa createBuilder2 = angq.a.createBuilder();
                createBuilder2.copyOnWrite();
                angq angqVar = (angq) createBuilder2.instance;
                angqVar.c = anhh.f(i4);
                angqVar.b |= 1;
                String str5 = tqmVar2.d;
                createBuilder2.copyOnWrite();
                angq angqVar2 = (angq) createBuilder2.instance;
                str5.getClass();
                angqVar2.b = 2 | angqVar2.b;
                angqVar2.d = str5;
                int i5 = tqmVar2.f;
                createBuilder2.copyOnWrite();
                angq angqVar3 = (angq) createBuilder2.instance;
                angqVar3.b |= 4;
                angqVar3.e = i5;
                long j3 = tqmVar2.r;
                createBuilder2.copyOnWrite();
                angq angqVar4 = (angq) createBuilder2.instance;
                angqVar4.b |= 128;
                angqVar4.i = j3;
                String str6 = tqmVar2.s;
                createBuilder2.copyOnWrite();
                angq angqVar5 = (angq) createBuilder2.instance;
                str6.getClass();
                angqVar5.b |= 256;
                angqVar5.j = str6;
                String str7 = tqkVar2.c;
                createBuilder2.copyOnWrite();
                angq angqVar6 = (angq) createBuilder2.instance;
                str7.getClass();
                angqVar6.b |= 8;
                angqVar6.f = str7;
                createBuilder2.copyOnWrite();
                angq angqVar7 = (angq) createBuilder2.instance;
                angqVar7.b |= 16;
                angqVar7.g = true;
                createBuilder2.copyOnWrite();
                angq angqVar8 = (angq) createBuilder2.instance;
                angqVar8.b |= 32;
                angqVar8.h = j2;
                tykVar.a((angq) createBuilder2.mo39build());
                return anlz.q(true);
            }
        }, this.h);
    }
}
