package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: tth  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tth implements anir {
    public final /* synthetic */ tuk a;
    private final /* synthetic */ int b;

    public /* synthetic */ tth(tuk tukVar) {
        this.a = tukVar;
    }

    public /* synthetic */ tth(tuk tukVar, int i) {
        this.b = i;
        this.a = tukVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int a;
        int i = this.b;
        if (i == 0) {
            final tuk tukVar = this.a;
            final tuj tujVar = (tuj) obj;
            final tqm tqmVar = tujVar.b;
            if (tqmVar == null) {
                return ankq.a;
            }
            for (final tqk tqkVar : tqmVar.n) {
                int b = tqn.b(tqmVar.i);
                if (b == 0) {
                    b = 1;
                }
                final tqy a2 = twx.a(tqkVar, b);
                final twv twvVar = tukVar.e;
                anhq.i(anii.i(anko.q(twvVar.c(a2)), new anir() { // from class: twi
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        final twv twvVar2 = twv.this;
                        final tqy tqyVar = a2;
                        final tqk tqkVar2 = tqkVar;
                        final tqz tqzVar = (tqz) obj2;
                        tqu a3 = tqu.a(tqzVar.d);
                        if (a3 == null) {
                            a3 = tqu.NONE;
                        }
                        if (a3 != tqu.DOWNLOAD_COMPLETE) {
                            return ankq.a;
                        }
                        return anhq.i(anii.i(anko.q(twvVar2.b(tqyVar)), new anir() { // from class: twn
                            @Override // defpackage.anir
                            public final ankt a(Object obj3) {
                                twv twvVar3 = twv.this;
                                tqz tqzVar2 = tqzVar;
                                tqk tqkVar3 = tqkVar2;
                                Uri uri = (Uri) obj3;
                                if (uri == null) {
                                    tpy a4 = tqa.a();
                                    a4.a = tpz.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                                    throw a4.a();
                                }
                                if (tqzVar2.e) {
                                    if (!twvVar3.e.h(uri)) {
                                        tpy a5 = tqa.a();
                                        a5.a = tpz.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                                        throw a5.a();
                                    }
                                } else {
                                    tyc.b(twvVar3.e, tqkVar3, uri, tqkVar3.g);
                                }
                                return ankq.a;
                            }
                        }, twvVar2.k), tqa.class, new anir() { // from class: twp
                            @Override // defpackage.anir
                            public final ankt a(Object obj3) {
                                twv twvVar3 = twv.this;
                                tqz tqzVar2 = tqzVar;
                                tqy tqyVar2 = tqyVar;
                                typ.d("%s: reVerifyFile lost or corrupted code %s", "SharedFileManager", ((tqa) obj3).a);
                                aopa mo52toBuilder = tqzVar2.mo52toBuilder();
                                tqu tquVar = tqu.CORRUPTED;
                                mo52toBuilder.copyOnWrite();
                                tqz tqzVar3 = (tqz) mo52toBuilder.instance;
                                tqzVar3.d = tquVar.h;
                                tqzVar3.b |= 2;
                                return anii.i(anko.q(twvVar3.c.g(tqyVar2, (tqz) mo52toBuilder.mo39build())), g.m, twvVar3.k);
                            }
                        }, twvVar2.k);
                    }
                }, twvVar.k), tww.class, new anir() { // from class: ttt
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        tuk tukVar2 = tuk.this;
                        tqm tqmVar2 = tqmVar;
                        tuj tujVar2 = tujVar;
                        tww twwVar = (tww) obj2;
                        typ.c("%s: Missing file. Logging and deleting file group.", "FileGroupManager");
                        tuk.u(1062, tukVar2.b, tqmVar2);
                        tukVar2.k.e();
                        return anii.h(tukVar2.d.i(tujVar2.a), ryj.q, tukVar2.h);
                    }
                }, tukVar.h);
            }
            return ankq.a;
        } else if (i == 1) {
            tuk tukVar2 = this.a;
            tqm tqmVar2 = (tqm) obj;
            if (tqmVar2 == null || (a = uaw.a(tqmVar2.q)) == 0 || a == 1) {
                return anlz.q(true);
            }
            return ((tzx) ((amqo) tukVar2.j.c()).get()).a();
        } else if (i == 2) {
            tuk tukVar3 = this.a;
            tuj tujVar2 = (tuj) obj;
            tqv tqvVar = tujVar2.a;
            tqm tqmVar3 = tujVar2.b;
            if (tqmVar3 == null || !tqvVar.f || !tzc.k(tqmVar3)) {
                return ankq.a;
            }
            return anii.i(tukVar3.k(tqmVar3, true), new ttm(tukVar3, tqmVar3, 2), tukVar3.h);
        } else if (i == 3) {
            tuk tukVar4 = this.a;
            if (((Boolean) obj).booleanValue()) {
                return ankq.a;
            }
            tukVar4.b.g(1036);
            return anlz.p(new IOException("Failed to commit new group metadata to disk."));
        } else if (i == 4) {
            tuk tukVar5 = this.a;
            ArrayList arrayList = new ArrayList();
            for (tqv tqvVar2 : (List) obj) {
                if (!tukVar5.r(tqvVar2.d)) {
                    arrayList.add(anii.i(tukVar5.d.g(tqvVar2), new ttv(tukVar5, tqvVar2), tukVar5.h));
                }
            }
            return anlz.j(arrayList).a(gbb.g, tukVar5.h);
        } else if (i == 5) {
            tuk tukVar6 = this.a;
            ArrayList arrayList2 = new ArrayList();
            for (tqv tqvVar3 : (List) obj) {
                if (!tqvVar3.f) {
                    arrayList2.add(anii.i(tukVar6.d.g(tqvVar3), new tth(tukVar6, 1), tukVar6.h));
                }
            }
            return anlz.j(arrayList2).a(gbb.k, tukVar6.h);
        } else {
            tuk tukVar7 = this.a;
            ArrayList arrayList3 = new ArrayList();
            for (tqv tqvVar4 : (List) obj) {
                if (!tqvVar4.f) {
                    arrayList3.add(anii.i(tukVar7.d.g(tqvVar4), new ttv(tukVar7, tqvVar4, 2), tukVar7.h));
                }
            }
            return anlz.j(arrayList3).a(gbb.l, tukVar7.h);
        }
    }
}
