package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: twv  reason: default package */
/* loaded from: classes4.dex */
public final class twv {
    public final Context a;
    public final trv b;
    public final twy c;
    public final tyi d;
    public final vjb e;
    public final ampq f;
    public final ampq g;
    public final tyk h;
    public final tul i;
    public final ampq j;
    public final Executor k;

    public twv(Context context, trv trvVar, twy twyVar, vjb vjbVar, tyi tyiVar, ampq ampqVar, ampq ampqVar2, tyk tykVar, tul tulVar, ampq ampqVar3, Executor executor) {
        this.a = context;
        this.b = trvVar;
        this.c = twyVar;
        this.e = vjbVar;
        this.d = tyiVar;
        this.f = ampqVar;
        this.g = ampqVar2;
        this.h = tykVar;
        this.i = tulVar;
        this.j = ampqVar3;
        this.k = executor;
    }

    public final ankt a() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                vjh a = vji.a(this.a);
                a.a = "*.lease";
                this.e.f(a.a());
                this.h.g(1077);
            } catch (vjw unused) {
                int i = typ.a;
            } catch (IOException e) {
                typ.f(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
                this.h.g(1078);
            }
        }
        try {
            this.e.j(tzc.m(this.a, this.j));
        } catch (IOException e2) {
            this.b.a(e2, "Failure while deleting mdd storage during clear", new Object[0]);
        }
        return ankq.a;
    }

    public final ankt b(tqy tqyVar) {
        return anii.i(this.c.e(tqyVar), new twu(this, tqyVar, 2), this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt c(tqy tqyVar) {
        return anii.i(this.c.e(tqyVar), new twr(tqyVar, 1), this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt d(final tqv tqvVar, final tqk tqkVar, final tqy tqyVar, final tqp tqpVar, final int i, final List list) {
        if (tqkVar.d.startsWith("inlinefile")) {
            tpy a = tqa.a();
            a.a = tpz.INVALID_INLINE_FILE_URL_SCHEME;
            a.b = "downloading a file with an inlinefile scheme is not supported, use importFiles instead.";
            return anlz.p(a.a());
        }
        return anii.i(this.c.e(tqyVar), new anir() { // from class: twk
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                ankt q;
                final twv twvVar = twv.this;
                final tqy tqyVar2 = tqyVar;
                final tqv tqvVar2 = tqvVar;
                final tqk tqkVar2 = tqkVar;
                final tqp tqpVar2 = tqpVar;
                final int i2 = i;
                final List list2 = list;
                final tqz tqzVar = (tqz) obj;
                if (tqzVar == null) {
                    typ.d("%s: Start download called on file that doesn't exists. Key = %s!", "SharedFileManager", tqyVar2);
                    tww twwVar = new tww();
                    twvVar.b.a(twwVar, "Shared file not found in downloadFileGroup", new Object[0]);
                    tpy a2 = tqa.a();
                    a2.a = tpz.SHARED_FILE_NOT_FOUND_ERROR;
                    a2.c = twwVar;
                    return anlz.p(a2.a());
                }
                tqu a3 = tqu.a(tqzVar.d);
                if (a3 == null) {
                    a3 = tqu.NONE;
                }
                if (a3 != tqu.DOWNLOAD_COMPLETE) {
                    int b = tqn.b(tqyVar2.f);
                    if (b == 0) {
                        b = 1;
                    }
                    if (twx.b(twvVar.a, twvVar.b).d < tvg.USE_CHECKSUM_ONLY.d || !twvVar.f.h() || ((tsb) twvVar.f.c()).b() == 1) {
                        q = anlz.q(null);
                    } else {
                        q = twvVar.f(tqkVar2.l, 0, b);
                    }
                    return anii.i(q, new anir() { // from class: two
                        @Override // defpackage.anir
                        public final ankt a(Object obj2) {
                            final twv twvVar2 = twv.this;
                            tqz tqzVar2 = tqzVar;
                            final tqk tqkVar3 = tqkVar2;
                            final tqv tqvVar3 = tqvVar2;
                            final tqy tqyVar3 = tqyVar2;
                            final tqp tqpVar3 = tqpVar2;
                            final int i3 = i2;
                            final List list3 = list2;
                            final tqo tqoVar = (tqo) obj2;
                            final aopa mo52toBuilder = tqzVar2.mo52toBuilder();
                            String str = tqzVar2.c;
                            if (tqoVar != null) {
                                str = tzc.v(str, tqoVar.e);
                            } else if ((tqkVar3.b & 32) != 0) {
                                str = tzc.v(str, tqkVar3.i);
                            }
                            final String str2 = str;
                            return anii.i(anii.i(twvVar2.i.g(tqvVar3), g.k, twvVar2.k), new anir() { // from class: twm
                                @Override // defpackage.anir
                                public final ankt a(Object obj3) {
                                    ankt q2;
                                    final twv twvVar3 = twv.this;
                                    final aopa aopaVar = mo52toBuilder;
                                    final tqy tqyVar4 = tqyVar3;
                                    String str3 = str2;
                                    final tqv tqvVar4 = tqvVar3;
                                    final tqk tqkVar4 = tqkVar3;
                                    final tqo tqoVar2 = tqoVar;
                                    final tqp tqpVar4 = tqpVar3;
                                    final int i4 = i3;
                                    final List list4 = list3;
                                    tqm tqmVar = (tqm) obj3;
                                    final int i5 = tqmVar.f;
                                    final long j = tqmVar.r;
                                    final String str4 = tqmVar.s;
                                    int b2 = tqn.b(tqyVar4.f);
                                    Uri q3 = tzc.q(twvVar3.a, b2 == 0 ? 1 : b2, str3, tqkVar4.g, twvVar3.b, twvVar3.j, false);
                                    if (q3 == null) {
                                        typ.c("%s: Failed to get file uri!", "SharedFileManager");
                                        tpy a4 = tqa.a();
                                        a4.a = tpz.UNABLE_TO_CREATE_FILE_URI_ERROR;
                                        q2 = anlz.p(a4.a());
                                    } else {
                                        q2 = anlz.q(q3);
                                    }
                                    final ankt anktVar = q2;
                                    return anii.i(anii.i(anko.q(anktVar), new anir() { // from class: twl
                                        @Override // defpackage.anir
                                        public final ankt a(Object obj4) {
                                            twv twvVar4 = twv.this;
                                            aopa aopaVar2 = aopaVar;
                                            tqy tqyVar5 = tqyVar4;
                                            Uri uri = (Uri) obj4;
                                            tqu tquVar = tqu.DOWNLOAD_IN_PROGRESS;
                                            aopaVar2.copyOnWrite();
                                            tqz tqzVar3 = (tqz) aopaVar2.instance;
                                            tqz tqzVar4 = tqz.a;
                                            tqzVar3.d = tquVar.h;
                                            tqzVar3.b |= 2;
                                            return twvVar4.c.g(tqyVar5, (tqz) aopaVar2.mo39build());
                                        }
                                    }, twvVar3.k), new anir() { // from class: twq
                                        @Override // defpackage.anir
                                        public final ankt a(Object obj4) {
                                            twv twvVar4 = twv.this;
                                            ankt anktVar2 = anktVar;
                                            tqo tqoVar3 = tqoVar2;
                                            tqk tqkVar5 = tqkVar4;
                                            tqy tqyVar5 = tqyVar4;
                                            tqv tqvVar5 = tqvVar4;
                                            int i6 = i5;
                                            long j2 = j;
                                            String str5 = str4;
                                            tqp tqpVar5 = tqpVar4;
                                            int i7 = i4;
                                            List list5 = list4;
                                            Boolean bool = (Boolean) obj4;
                                            Uri uri = (Uri) anlz.y(anktVar2);
                                            if (!twvVar4.f.h() || tqoVar3 == null) {
                                                twy twyVar = twvVar4.c;
                                                vjb vjbVar = twvVar4.e;
                                                int b3 = tqn.b(tqyVar5.f);
                                                tyb tybVar = new tyb(twyVar, vjbVar, tqkVar5, b3 == 0 ? 1 : b3, twvVar4.h, tqvVar5, i6, j2, str5, twvVar4.k);
                                                twvVar4.e(tqvVar5, uri);
                                                return twvVar4.d.a(tqvVar5, i6, uri, tqkVar5.d, tqkVar5.e, tqpVar5, tybVar, i7, list5);
                                            }
                                            Context context = twvVar4.a;
                                            twy twyVar2 = twvVar4.c;
                                            vjb vjbVar2 = twvVar4.e;
                                            trv trvVar = twvVar4.b;
                                            int b4 = tqn.b(tqyVar5.f);
                                            txz txzVar = new txz(context, twyVar2, vjbVar2, trvVar, tqkVar5, b4 == 0 ? 1 : b4, (tsb) twvVar4.f.c(), tqoVar3, twvVar4.h, tqvVar5, i6, j2, str5, twvVar4.j, twvVar4.k);
                                            twvVar4.e(tqvVar5, uri);
                                            return twvVar4.d.a(tqvVar5, i6, uri, tqoVar3.c, tqoVar3.d, tqpVar5, txzVar, i7, list5);
                                        }
                                    }, twvVar3.k);
                                }
                            }, twvVar2.k);
                        }
                    }, twvVar.k);
                }
                if (twvVar.g.h()) {
                    ((tzo) twvVar.g.c()).g(tqvVar2.c, tqkVar2.e);
                }
                return ankq.a;
            }
        }, this.k);
    }

    public final void e(tqv tqvVar, Uri uri) {
        if (this.g.h()) {
            try {
                long a = this.e.a(uri);
                if (a <= 0) {
                    return;
                }
                ((tzo) this.g.c()).g(tqvVar.c, a);
            } catch (IOException unused) {
            }
        }
    }

    public final ankt f(final List list, final int i, final int i2) {
        if (i == list.size()) {
            return anlz.q(null);
        }
        final tqo tqoVar = (tqo) list.get(i);
        int a = tqn.a(tqoVar.f);
        if (a == 0) {
            a = 1;
        }
        if (a != ((tsb) this.f.c()).b()) {
            return f(list, i + 1, i2);
        }
        aopa createBuilder = tqy.a.createBuilder();
        tqi tqiVar = tqoVar.g;
        if (tqiVar == null) {
            tqiVar = tqi.a;
        }
        String str = tqiVar.b;
        createBuilder.copyOnWrite();
        tqy tqyVar = (tqy) createBuilder.instance;
        str.getClass();
        tqyVar.b |= 4;
        tqyVar.e = str;
        createBuilder.copyOnWrite();
        tqy tqyVar2 = (tqy) createBuilder.instance;
        tqyVar2.f = i2 - 1;
        tqyVar2.b |= 8;
        final tqy tqyVar3 = (tqy) createBuilder.mo39build();
        return anii.i(this.c.e(tqyVar3), new anir() { // from class: twj
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                twv twvVar = twv.this;
                tqy tqyVar4 = tqyVar3;
                tqo tqoVar2 = tqoVar;
                List list2 = list;
                int i3 = i;
                int i4 = i2;
                tqz tqzVar = (tqz) obj;
                if (tqzVar != null) {
                    tqu a2 = tqu.a(tqzVar.d);
                    if (a2 == null) {
                        a2 = tqu.NONE;
                    }
                    if (a2 == tqu.DOWNLOAD_COMPLETE) {
                        Context context = twvVar.a;
                        int b = tqn.b(tqyVar4.f);
                        if (tzc.q(context, b == 0 ? 1 : b, tqzVar.c, tqyVar4.e, twvVar.b, twvVar.j, false) != null) {
                            return anlz.q(tqoVar2);
                        }
                    }
                }
                return twvVar.f(list2, i3 + 1, i4);
            }
        }, this.k);
    }
}
