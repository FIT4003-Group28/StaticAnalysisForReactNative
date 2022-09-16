package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
/* compiled from: PG */
/* renamed from: tto  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tto implements anir {
    public final /* synthetic */ tuk a;
    public final /* synthetic */ tqm b;
    public final /* synthetic */ tqk c;
    public final /* synthetic */ tqy d;
    private final /* synthetic */ int e;

    public /* synthetic */ tto(tuk tukVar, tqk tqkVar, tqm tqmVar, tqy tqyVar, int i) {
        this.e = i;
        this.a = tukVar;
        this.c = tqkVar;
        this.b = tqmVar;
        this.d = tqyVar;
    }

    public /* synthetic */ tto(tuk tukVar, tqm tqmVar, tqk tqkVar, tqy tqyVar) {
        this.a = tukVar;
        this.b = tqmVar;
        this.c = tqkVar;
        this.d = tqyVar;
    }

    public /* synthetic */ tto(tuk tukVar, tqm tqmVar, tqk tqkVar, tqy tqyVar, int i) {
        this.e = i;
        this.a = tukVar;
        this.b = tqmVar;
        this.c = tqkVar;
        this.d = tqyVar;
    }

    public /* synthetic */ tto(tuk tukVar, tqy tqyVar, tqm tqmVar, tqk tqkVar, int i) {
        this.e = i;
        this.a = tukVar;
        this.d = tqyVar;
        this.b = tqmVar;
        this.c = tqkVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.e;
        if (i == 0) {
            tuk tukVar = this.a;
            tqm tqmVar = this.b;
            tqk tqkVar = this.c;
            tqy tqyVar = this.d;
            tqz tqzVar = (tqz) obj;
            long j = tqmVar.k;
            try {
            } catch (tza e) {
                tuk.v(tukVar.b, tqmVar, tqkVar, e.a);
            }
            if (tqzVar.e) {
                String str = tqkVar.c;
                String str2 = tqmVar.d;
                int i2 = typ.a;
                return anii.i(tukVar.t(tqmVar, tqkVar, tqzVar, tqyVar, tqzVar.g, j, 3), g.h, tukVar.h);
            }
            String str3 = tqkVar.o;
            if (!TextUtils.isEmpty(str3)) {
                if (tzc.t(tukVar.a, str3, tqmVar, tqkVar, tukVar.g)) {
                    String str4 = tqkVar.c;
                    String str5 = tqmVar.d;
                    int i3 = typ.a;
                    return anii.i(tukVar.t(tqmVar, tqkVar, tqzVar, tqyVar, str3, j, 4), g.i, tukVar.h);
                }
                int d = tqn.d(tqkVar.m);
                if (d != 0 && d == 2) {
                    tqu a = tqu.a(tqzVar.d);
                    if (a == null) {
                        a = tqu.NONE;
                    }
                    if (a == tqu.DOWNLOAD_COMPLETE) {
                        String str6 = tqkVar.c;
                        String str7 = tqmVar.d;
                        int i4 = typ.a;
                        tzc.s(tukVar.a, str3, tukVar.b(tqkVar, tqyVar, tqzVar), tqmVar, tqkVar, tukVar.g, false);
                        return anii.i(tukVar.t(tqmVar, tqkVar, tqzVar, tqyVar, str3, j, 6), g.j, tukVar.h);
                    }
                }
            }
            String str8 = tqkVar.c;
            String str9 = tqmVar.d;
            int i5 = typ.a;
            return ankq.a;
        } else if (i != 1) {
            if (i == 2) {
                tuk tukVar2 = this.a;
                tqm tqmVar2 = this.b;
                tqk tqkVar2 = this.c;
                tqy tqyVar2 = this.d;
                Void r2 = (Void) obj;
                return anii.i(anhq.i(tukVar2.e.c(tqyVar2), tww.class, new tto(tukVar2, tqyVar2, tqmVar2, tqkVar2, 3), tukVar2.h), new tto(tukVar2, tqkVar2, tqmVar2, tqyVar2, 1), tukVar2.h);
            } else if (i == 3) {
                tuk tukVar3 = this.a;
                tqy tqyVar3 = this.d;
                tqm tqmVar3 = this.b;
                tqk tqkVar3 = this.c;
                tww twwVar = (tww) obj;
                typ.d("%s: Shared file not found, newFileKey = %s", "FileGroupManager", tqyVar3);
                tukVar3.c.a(twwVar, "Shared file not found in downloadFileGroup", new Object[0]);
                tuk.v(tukVar3.b, tqmVar3, tqkVar3, 26);
                return anlz.p(twwVar);
            } else {
                tuk tukVar4 = this.a;
                tqy tqyVar4 = this.d;
                tqm tqmVar4 = this.b;
                tqk tqkVar4 = this.c;
                tww twwVar2 = (tww) obj;
                typ.d("%s: Shared file not found, newFileKey = %s", "FileGroupManager", tqyVar4);
                tukVar4.c.a(twwVar2, "Shared file not found in downloadFileGroup", new Object[0]);
                tuk.v(tukVar4.b, tqmVar4, tqkVar4, 26);
                return anlz.p(twwVar2);
            }
        } else {
            final tuk tukVar5 = this.a;
            final tqk tqkVar5 = this.c;
            final tqm tqmVar5 = this.b;
            final tqy tqyVar5 = this.d;
            tqz tqzVar2 = (tqz) obj;
            String str10 = tqkVar5.o;
            final long j2 = tqmVar5.k;
            tqu a2 = tqu.a(tqzVar2.d);
            if (a2 == null) {
                a2 = tqu.NONE;
            }
            if (a2 != tqu.DOWNLOAD_COMPLETE) {
                return ankq.a;
            }
            if (tqzVar2.e) {
                if (!tuk.s(tqzVar2, j2)) {
                    return ankq.a;
                }
                String str11 = tqkVar5.c;
                String str12 = tqmVar5.d;
                int i6 = typ.a;
                return anii.i(tukVar5.t(tqmVar5, tqkVar5, tqzVar2, tqyVar5, tqzVar2.g, j2, 27), new anir() { // from class: ttp
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        tuk tukVar6 = tuk.this;
                        tqm tqmVar6 = tqmVar5;
                        tqk tqkVar6 = tqkVar5;
                        tqy tqyVar6 = tqyVar5;
                        long j3 = j2;
                        if (((Boolean) obj2).booleanValue()) {
                            return ankq.a;
                        }
                        return tukVar6.m(tqmVar6, tqkVar6, tqyVar6, j3);
                    }
                }, tukVar5.h);
            }
            try {
                if (!TextUtils.isEmpty(str10)) {
                    Uri b = tukVar5.b(tqkVar5, tqyVar5, tqzVar2);
                    if (tzc.t(tukVar5.a, str10, tqmVar5, tqkVar5, tukVar5.g)) {
                        String str13 = tqkVar5.c;
                        String str14 = tqmVar5.d;
                        int i7 = typ.a;
                        return anii.i(tukVar5.t(tqmVar5, tqkVar5, tqzVar2, tqyVar5, str10, j2, 5), new tti(tukVar5, b, tqmVar5, tqkVar5, tqyVar5, j2, 1), tukVar5.h);
                    }
                    int d2 = tqn.d(tqkVar5.m);
                    if (d2 != 0 && d2 == 2) {
                        String str15 = tqkVar5.c;
                        String str16 = tqmVar5.d;
                        int i8 = typ.a;
                        tzc.s(tukVar5.a, str10, b, tqmVar5, tqkVar5, tukVar5.g, true);
                        return anii.i(tukVar5.t(tqmVar5, tqkVar5, tqzVar2, tqyVar5, str10, j2, 7), new tti(tukVar5, b, tqmVar5, tqkVar5, tqyVar5, j2), tukVar5.h);
                    }
                }
                int d3 = tqn.d(tqkVar5.m);
                if (d3 != 0 && d3 == 2) {
                    tuk.v(tukVar5.b, tqmVar5, tqkVar5, 16);
                }
            } catch (tza e2) {
                tuk.v(tukVar5.b, tqmVar5, tqkVar5, e2.a);
            }
            String str17 = tqkVar5.c;
            String str18 = tqmVar5.d;
            int i9 = typ.a;
            return tukVar5.m(tqmVar5, tqkVar5, tqyVar5, j2);
        }
    }
}
