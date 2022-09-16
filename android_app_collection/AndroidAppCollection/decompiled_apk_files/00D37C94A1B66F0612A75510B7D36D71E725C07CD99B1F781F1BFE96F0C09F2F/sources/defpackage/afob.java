package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afob  reason: default package */
/* loaded from: classes.dex */
public final class afob implements tct {
    public final Context a;
    public final tdb b;
    private final /* synthetic */ int c;

    public afob(Context context, tdb tdbVar) {
        this.a = context;
        this.b = tdbVar;
    }

    public afob(Context context, tdb tdbVar, int i) {
        this.c = i;
        this.a = context;
        this.b = tdbVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return aqfl.b;
            }
            if (i == 2) {
                return auvb.b;
            }
            return aqfj.b;
        }
        return aqfk.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        int i = this.c;
        if (i == 0) {
            final aqfk aqfkVar = (aqfk) obj;
            return ahdq.j(this.b, aqfkVar.c).g(new ayqe() { // from class: afoa
                @Override // defpackage.ayqe
                public final Object a(Object obj2) {
                    final afob afobVar = afob.this;
                    final aqfk aqfkVar2 = aqfkVar;
                    final augt augtVar = (augt) obj2;
                    if ((augtVar.b & 32) == 0) {
                        return aynr.t(new aypv() { // from class: afnz
                            @Override // defpackage.aypv
                            public final void a() {
                                afob afobVar2 = afob.this;
                                aqfk aqfkVar3 = aqfkVar2;
                                augt augtVar2 = augtVar;
                                long j = new bahm().d(0).f(0).j().i().a;
                                String k = ahdq.k(j, afobVar2.a);
                                tdb tdbVar = afobVar2.b;
                                String str = aqfkVar3.c;
                                aopa mo52toBuilder = augtVar2.mo52toBuilder();
                                augu auguVar = augtVar2.e;
                                if (auguVar == null) {
                                    auguVar = augu.a;
                                }
                                aopa mo52toBuilder2 = auguVar.mo52toBuilder();
                                mo52toBuilder2.copyOnWrite();
                                augu auguVar2 = (augu) mo52toBuilder2.instance;
                                k.getClass();
                                auguVar2.b |= 2;
                                auguVar2.d = k;
                                long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
                                mo52toBuilder2.copyOnWrite();
                                augu auguVar3 = (augu) mo52toBuilder2.instance;
                                auguVar3.b |= 1;
                                auguVar3.c = seconds;
                                mo52toBuilder.copyOnWrite();
                                augt augtVar3 = (augt) mo52toBuilder.instance;
                                augu auguVar4 = (augu) mo52toBuilder2.mo39build();
                                auguVar4.getClass();
                                augtVar3.e = auguVar4;
                                augtVar3.b |= 32;
                                tdbVar.b(str, ((augt) mo52toBuilder.mo39build()).toByteArray());
                            }
                        });
                    }
                    return aynr.f();
                }
            });
        } else if (i == 1) {
            final aqfl aqflVar = (aqfl) obj;
            return ahdq.j(this.b, aqflVar.c).g(new ayqe(aqflVar, null) { // from class: afod
                public final /* synthetic */ aqfl a;

                @Override // defpackage.ayqe
                public final Object a(Object obj2) {
                    afob afobVar = afob.this;
                    aqfl aqflVar2 = this.a;
                    augt augtVar = (augt) obj2;
                    if ((augtVar.b & 32) == 0) {
                        return aynr.f();
                    }
                    return aynr.t(new aypv(aqflVar2, augtVar, null) { // from class: afoc
                        public final /* synthetic */ aqfl a;
                        public final /* synthetic */ augt b;

                        @Override // defpackage.aypv
                        public final void a() {
                            afob afobVar2 = afob.this;
                            aqfl aqflVar3 = this.a;
                            augt augtVar2 = this.b;
                            augu auguVar = augtVar2.e;
                            if (auguVar == null) {
                                auguVar = augu.a;
                            }
                            String k = ahdq.k(TimeUnit.SECONDS.toMillis(auguVar.c), afobVar2.a);
                            tdb tdbVar = afobVar2.b;
                            String str = aqflVar3.c;
                            aopa mo52toBuilder = augtVar2.mo52toBuilder();
                            augu auguVar2 = augtVar2.e;
                            if (auguVar2 == null) {
                                auguVar2 = augu.a;
                            }
                            aopa mo52toBuilder2 = auguVar2.mo52toBuilder();
                            mo52toBuilder2.copyOnWrite();
                            augu auguVar3 = (augu) mo52toBuilder2.instance;
                            k.getClass();
                            auguVar3.b |= 2;
                            auguVar3.d = k;
                            mo52toBuilder.copyOnWrite();
                            augt augtVar3 = (augt) mo52toBuilder.instance;
                            augu auguVar4 = (augu) mo52toBuilder2.mo39build();
                            auguVar4.getClass();
                            augtVar3.e = auguVar4;
                            augtVar3.b |= 32;
                            tdbVar.b(str, ((augt) mo52toBuilder.mo39build()).toByteArray());
                        }
                    });
                }
            });
        } else if (i == 2) {
            final auvb auvbVar = (auvb) obj;
            return ahdq.j(this.b, auvbVar.c).V(aaku.i).J(new afok(this, 1, null)).J(new afok(this, null)).g(new ayqe(auvbVar, null) { // from class: afol
                public final /* synthetic */ auvb a;

                @Override // defpackage.ayqe
                public final Object a(Object obj2) {
                    return aynr.t(new aypv(this.a, (afom) obj2, null) { // from class: afoi
                        public final /* synthetic */ auvb a;
                        public final /* synthetic */ afom b;

                        @Override // defpackage.aypv
                        public final void a() {
                            String str;
                            afob afobVar = afob.this;
                            auvb auvbVar2 = this.a;
                            afom afomVar = this.b;
                            long j = afomVar.a.a;
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
                            String k = ahdq.k(j, afobVar.a);
                            tdb tdbVar = afobVar.b;
                            String str2 = auvbVar2.c;
                            aopa mo52toBuilder = afomVar.b.mo52toBuilder();
                            int i2 = 5;
                            if (auvbVar2.e) {
                                augt augtVar = afomVar.b;
                                if ((augtVar.b & 2) != 0 && (i2 = awwc.bY(augtVar.c)) == 0) {
                                    i2 = 1;
                                }
                            }
                            mo52toBuilder.copyOnWrite();
                            augt augtVar2 = (augt) mo52toBuilder.instance;
                            augtVar2.c = i2 - 1;
                            augtVar2.b |= 2;
                            if (auvbVar2.e) {
                                augt augtVar3 = afomVar.b;
                                if ((augtVar3.b & 4) != 0) {
                                    str = augtVar3.d;
                                    mo52toBuilder.copyOnWrite();
                                    augt augtVar4 = (augt) mo52toBuilder.instance;
                                    str.getClass();
                                    augtVar4.b |= 4;
                                    augtVar4.d = str;
                                    aopa createBuilder = augu.a.createBuilder();
                                    createBuilder.copyOnWrite();
                                    augu auguVar = (augu) createBuilder.instance;
                                    auguVar.b |= 1;
                                    auguVar.c = seconds;
                                    createBuilder.copyOnWrite();
                                    augu auguVar2 = (augu) createBuilder.instance;
                                    k.getClass();
                                    auguVar2.b |= 2;
                                    auguVar2.d = k;
                                    mo52toBuilder.copyOnWrite();
                                    augt augtVar5 = (augt) mo52toBuilder.instance;
                                    augu auguVar3 = (augu) createBuilder.mo39build();
                                    auguVar3.getClass();
                                    augtVar5.e = auguVar3;
                                    augtVar5.b |= 32;
                                    tdbVar.b(str2, ((augt) mo52toBuilder.mo39build()).toByteArray());
                                }
                            }
                            str = auvbVar2.d;
                            mo52toBuilder.copyOnWrite();
                            augt augtVar42 = (augt) mo52toBuilder.instance;
                            str.getClass();
                            augtVar42.b |= 4;
                            augtVar42.d = str;
                            aopa createBuilder2 = augu.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            augu auguVar4 = (augu) createBuilder2.instance;
                            auguVar4.b |= 1;
                            auguVar4.c = seconds;
                            createBuilder2.copyOnWrite();
                            augu auguVar22 = (augu) createBuilder2.instance;
                            k.getClass();
                            auguVar22.b |= 2;
                            auguVar22.d = k;
                            mo52toBuilder.copyOnWrite();
                            augt augtVar52 = (augt) mo52toBuilder.instance;
                            augu auguVar32 = (augu) createBuilder2.mo39build();
                            auguVar32.getClass();
                            augtVar52.e = auguVar32;
                            augtVar52.b |= 32;
                            tdbVar.b(str2, ((augt) mo52toBuilder.mo39build()).toByteArray());
                        }
                    });
                }
            });
        } else {
            final aqfj aqfjVar = (aqfj) obj;
            return aynr.t(new aypv(aqfjVar, null) { // from class: akrc
                public final /* synthetic */ aqfj a;

                @Override // defpackage.aypv
                public final void a() {
                    int i2;
                    afob afobVar = afob.this;
                    aqfj aqfjVar2 = this.a;
                    int i3 = aqfjVar2.c;
                    if ((i3 & 2) == 0 || (i3 & 1) == 0) {
                        return;
                    }
                    long millis = TimeUnit.SECONDS.toMillis(aqfjVar2.d);
                    String str = aqfjVar2.e;
                    Context context = afobVar.a;
                    if (aqfjVar2.g) {
                        i2 = 65557;
                    } else {
                        i2 = aqfjVar2.f ? 65556 : 0;
                    }
                    String formatDateTime = DateUtils.formatDateTime(context, millis, i2);
                    tdb tdbVar = afobVar.b;
                    aopa createBuilder = avis.a.createBuilder();
                    createBuilder.copyOnWrite();
                    avis avisVar = (avis) createBuilder.instance;
                    str.getClass();
                    avisVar.b |= 1;
                    avisVar.c = str;
                    createBuilder.copyOnWrite();
                    avis avisVar2 = (avis) createBuilder.instance;
                    formatDateTime.getClass();
                    avisVar2.b |= 4;
                    avisVar2.e = formatDateTime;
                    tdbVar.b(str, ((avis) createBuilder.mo39build()).toByteArray());
                }
            });
        }
    }
}
