package defpackage;

import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: ufz  reason: default package */
/* loaded from: classes4.dex */
public final class ufz implements ufs {
    private final ufw a;
    private final uje b;
    private final uga c;
    private final ugb d;
    private final ugc e;
    private final uge f;
    private final ugg g;
    private final ugh h;
    private final ues i;
    private final ugb j;

    public ufz(ufw ufwVar, uje ujeVar, ugb ugbVar, uga ugaVar, ugb ugbVar2, ugc ugcVar, uge ugeVar, ugg uggVar, ugh ughVar, ues uesVar, byte[] bArr) {
        this.a = ufwVar;
        this.b = ujeVar;
        this.j = ugbVar;
        this.c = ugaVar;
        this.d = ugbVar2;
        this.e = ugcVar;
        this.f = ugeVar;
        this.g = uggVar;
        this.h = ughVar;
        this.i = uesVar;
    }

    private final void j(String str, ujf ujfVar, int i) {
        if (ujfVar.b != null) {
            uep c = this.i.c(i);
            ((ueu) c).l = str;
            c.i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
        if (r9.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED") == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    @Override // defpackage.ufs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ufr a(java.lang.String r17, java.util.List r18, defpackage.aomk r19) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufz.a(java.lang.String, java.util.List, aomk):ufr");
    }

    @Override // defpackage.ufs
    public final ufr b(String str, List list, aomk aomkVar) {
        try {
            ugb ugbVar = this.j;
            aolo b = ugbVar.c.b();
            aopa createBuilder = aokp.a.createBuilder();
            String str2 = ugbVar.a.a;
            createBuilder.copyOnWrite();
            aokp aokpVar = (aokp) createBuilder.instance;
            str2.getClass();
            aokpVar.b |= 1;
            aokpVar.c = str2;
            createBuilder.copyOnWrite();
            aokp aokpVar2 = (aokp) createBuilder.instance;
            aopu aopuVar = aokpVar2.d;
            if (!aopuVar.c()) {
                aokpVar2.d = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list, (List) aokpVar2.d);
            aopa createBuilder2 = aokf.a.createBuilder();
            createBuilder2.copyOnWrite();
            aokf aokfVar = (aokf) createBuilder2.instance;
            b.getClass();
            aokfVar.c = b;
            aokfVar.b |= 1;
            aolm b2 = ugbVar.b.b();
            createBuilder2.copyOnWrite();
            aokf aokfVar2 = (aokf) createBuilder2.instance;
            b2.getClass();
            aokfVar2.d = b2;
            aokfVar2.b |= 2;
            aokf aokfVar3 = (aokf) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            aokp aokpVar3 = (aokp) createBuilder.instance;
            aokfVar3.getClass();
            aopu aopuVar2 = aokpVar3.e;
            if (!aopuVar2.c()) {
                aokpVar3.e = aopi.mutableCopy(aopuVar2);
            }
            aokpVar3.e.add(aokfVar3);
            createBuilder.copyOnWrite();
            aokp aokpVar4 = (aokp) createBuilder.instance;
            aomkVar.getClass();
            aokpVar4.f = aomkVar;
            aokpVar4.b |= 2;
            aokp aokpVar5 = (aokp) createBuilder.mo39build();
            ujf b3 = this.b.b(str, aokpVar5);
            j(str, b3, 19);
            return ufr.a(aokpVar5, b3);
        } catch (ufm e) {
            ufq c = ufr.c();
            c.c = e;
            c.b(true);
            return c.a();
        }
    }

    @Override // defpackage.ufs
    public final ufr c(String str, List list, aomk aomkVar) {
        try {
            uga ugaVar = this.c;
            aopa createBuilder = aokr.a.createBuilder();
            String str2 = ugaVar.a.a;
            createBuilder.copyOnWrite();
            aokr aokrVar = (aokr) createBuilder.instance;
            str2.getClass();
            aokrVar.b |= 1;
            aokrVar.c = str2;
            createBuilder.copyOnWrite();
            aokr aokrVar2 = (aokr) createBuilder.instance;
            aopu aopuVar = aokrVar2.d;
            if (!aopuVar.c()) {
                aokrVar2.d = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list, (List) aokrVar2.d);
            aolo b = ugaVar.b.b();
            createBuilder.copyOnWrite();
            aokr aokrVar3 = (aokr) createBuilder.instance;
            b.getClass();
            aopu aopuVar2 = aokrVar3.e;
            if (!aopuVar2.c()) {
                aokrVar3.e = aopi.mutableCopy(aopuVar2);
            }
            aokrVar3.e.add(b);
            createBuilder.copyOnWrite();
            aokr aokrVar4 = (aokr) createBuilder.instance;
            aomkVar.getClass();
            aokrVar4.f = aomkVar;
            aokrVar4.b |= 2;
            aokr aokrVar5 = (aokr) createBuilder.mo39build();
            ujf c = this.b.c(str, aokrVar5);
            j(str, c, 20);
            return ufr.a(aokrVar5, c);
        } catch (ufm e) {
            ufq c2 = ufr.c();
            c2.c = e;
            c2.b(true);
            return c2.a();
        }
    }

    @Override // defpackage.ufs
    public final ufr d(String str, Long l, aomb aombVar, aomk aomkVar) {
        if (new aops(axqn.a.get().a().c, uik.a).contains(aombVar)) {
            ufq c = ufr.c();
            c.c = new ufy(aombVar);
            c.b(false);
            return c.a();
        }
        try {
            ugb ugbVar = this.d;
            aopa createBuilder = aokt.a.createBuilder();
            String str2 = ugbVar.a.a;
            createBuilder.copyOnWrite();
            aokt aoktVar = (aokt) createBuilder.instance;
            str2.getClass();
            aoktVar.b |= 1;
            aoktVar.c = str2;
            aolp c2 = ugbVar.c.c();
            createBuilder.copyOnWrite();
            aokt aoktVar2 = (aokt) createBuilder.instance;
            c2.getClass();
            aoktVar2.d = c2;
            aoktVar2.b |= 2;
            createBuilder.copyOnWrite();
            aokt aoktVar3 = (aokt) createBuilder.instance;
            aoktVar3.g = aombVar.j;
            aoktVar3.b |= 32;
            aolm b = ugbVar.b.b();
            createBuilder.copyOnWrite();
            aokt aoktVar4 = (aokt) createBuilder.instance;
            b.getClass();
            aoktVar4.f = b;
            aoktVar4.b |= 16;
            createBuilder.copyOnWrite();
            aokt aoktVar5 = (aokt) createBuilder.instance;
            aomkVar.getClass();
            aoktVar5.h = aomkVar;
            aoktVar5.b |= 64;
            if (l.longValue() > 0) {
                long longValue = l.longValue();
                createBuilder.copyOnWrite();
                aokt aoktVar6 = (aokt) createBuilder.instance;
                aoktVar6.b |= 4;
                aoktVar6.e = longValue;
            }
            aokt aoktVar7 = (aokt) createBuilder.mo39build();
            ujf d = this.b.d(str, aoktVar7);
            j(str, d, 13);
            return ufr.a(aoktVar7, d);
        } catch (ufm e) {
            ufq c3 = ufr.c();
            c3.c = e;
            c3.b(true);
            return c3.a();
        }
    }

    @Override // defpackage.ufs
    public final ufr e(String str, long j, List list, aomb aombVar, aomk aomkVar) {
        if (new aops(axqn.a.get().b().c, uik.a).contains(aombVar)) {
            ufq c = ufr.c();
            c.c = new ufy(aombVar);
            c.b(false);
            return c.a();
        }
        try {
            ugc ugcVar = this.e;
            aopa createBuilder = aokv.a.createBuilder();
            String str2 = ugcVar.a.a;
            createBuilder.copyOnWrite();
            aokv aokvVar = (aokv) createBuilder.instance;
            str2.getClass();
            aokvVar.b |= 1;
            aokvVar.c = str2;
            aolp c2 = ugcVar.c.c();
            createBuilder.copyOnWrite();
            aokv aokvVar2 = (aokv) createBuilder.instance;
            c2.getClass();
            aokvVar2.d = c2;
            aokvVar2.b |= 2;
            aolm b = ugcVar.b.b();
            createBuilder.copyOnWrite();
            aokv aokvVar3 = (aokv) createBuilder.instance;
            b.getClass();
            aokvVar3.g = b;
            aokvVar3.b |= 32;
            createBuilder.copyOnWrite();
            aokv aokvVar4 = (aokv) createBuilder.instance;
            aokvVar4.h = aombVar.j;
            aokvVar4.b |= 64;
            createBuilder.copyOnWrite();
            aokv aokvVar5 = (aokv) createBuilder.instance;
            aokvVar5.f = 1;
            aokvVar5.b |= 16;
            createBuilder.copyOnWrite();
            aokv aokvVar6 = (aokv) createBuilder.instance;
            aokvVar6.b |= 4;
            aokvVar6.e = j;
            createBuilder.copyOnWrite();
            aokv aokvVar7 = (aokv) createBuilder.instance;
            aopu aopuVar = aokvVar7.i;
            if (!aopuVar.c()) {
                aokvVar7.i = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list, (List) aokvVar7.i);
            createBuilder.copyOnWrite();
            aokv aokvVar8 = (aokv) createBuilder.instance;
            aomkVar.getClass();
            aokvVar8.j = aomkVar;
            aokvVar8.b |= 128;
            aokv aokvVar9 = (aokv) createBuilder.mo39build();
            ujf e = this.b.e(str, aokvVar9);
            j(str, e, 14);
            return ufr.a(aokvVar9, e);
        } catch (ufm e2) {
            ufq c3 = ufr.c();
            c3.c = e2;
            c3.b(true);
            return c3.a();
        }
    }

    @Override // defpackage.ufs
    public final ufr f(String str, aomk aomkVar) {
        try {
            uge ugeVar = this.f;
            aopa createBuilder = aokx.a.createBuilder();
            String str2 = ugeVar.a.a;
            createBuilder.copyOnWrite();
            aokx aokxVar = (aokx) createBuilder.instance;
            str2.getClass();
            aokxVar.b |= 1;
            aokxVar.c = str2;
            aolo b = ugeVar.c.b();
            createBuilder.copyOnWrite();
            aokx aokxVar2 = (aokx) createBuilder.instance;
            b.getClass();
            aokxVar2.d = b;
            aokxVar2.b |= 2;
            aopa createBuilder2 = aolh.a.createBuilder();
            aopa createBuilder3 = aolg.a.createBuilder();
            long parseLong = Long.parseLong(ugeVar.a.b);
            createBuilder3.copyOnWrite();
            aolg aolgVar = (aolg) createBuilder3.instance;
            aolgVar.b |= 1;
            aolgVar.c = parseLong;
            String b2 = ugeVar.b.b();
            createBuilder3.copyOnWrite();
            aolg aolgVar2 = (aolg) createBuilder3.instance;
            b2.getClass();
            aolgVar2.b |= 2;
            aolgVar2.d = b2;
            createBuilder2.copyOnWrite();
            aolh aolhVar = (aolh) createBuilder2.instance;
            aolg aolgVar3 = (aolg) createBuilder3.mo39build();
            aolgVar3.getClass();
            aolhVar.c = aolgVar3;
            aolhVar.b |= 1;
            createBuilder.copyOnWrite();
            aokx aokxVar3 = (aokx) createBuilder.instance;
            aolh aolhVar2 = (aolh) createBuilder2.mo39build();
            aolhVar2.getClass();
            aokxVar3.e = aolhVar2;
            aokxVar3.b |= 4;
            createBuilder.copyOnWrite();
            aokx aokxVar4 = (aokx) createBuilder.instance;
            aomkVar.getClass();
            aokxVar4.f = aomkVar;
            aokxVar4.b |= 8;
            aokx aokxVar5 = (aokx) createBuilder.mo39build();
            ujf f = this.b.f(str, aokxVar5);
            j(str, f, 16);
            return ufr.a(aokxVar5, f);
        } catch (ufm e) {
            ufq c = ufr.c();
            c.c = e;
            c.b(true);
            return c.a();
        }
    }

    @Override // defpackage.ufs
    public final ufr g(String str, ucf ucfVar, boolean z, aomk aomkVar) {
        try {
            ugg uggVar = this.g;
            aopa createBuilder = aokz.a.createBuilder();
            String str2 = uggVar.a.a;
            createBuilder.copyOnWrite();
            aokz aokzVar = (aokz) createBuilder.instance;
            str2.getClass();
            aokzVar.b |= 1;
            aokzVar.c = str2;
            createBuilder.copyOnWrite();
            aokz aokzVar2 = (aokz) createBuilder.instance;
            aomkVar.getClass();
            aokzVar2.f = aomkVar;
            aokzVar2.b |= 8;
            for (ucc uccVar : ucfVar.a) {
                aopa createBuilder2 = aolf.a.createBuilder();
                uce uceVar = uccVar.a;
                aopa createBuilder3 = aoki.a.createBuilder();
                String str3 = uceVar.a;
                createBuilder3.copyOnWrite();
                aoki aokiVar = (aoki) createBuilder3.instance;
                str3.getClass();
                aokiVar.b |= 1;
                aokiVar.c = str3;
                if (!TextUtils.isEmpty(uceVar.b)) {
                    String str4 = uceVar.b;
                    createBuilder3.copyOnWrite();
                    aoki aokiVar2 = (aoki) createBuilder3.instance;
                    str4.getClass();
                    aokiVar2.b |= 2;
                    aokiVar2.d = str4;
                }
                aoki aokiVar3 = (aoki) createBuilder3.mo39build();
                createBuilder2.copyOnWrite();
                aolf aolfVar = (aolf) createBuilder2.instance;
                aokiVar3.getClass();
                aolfVar.c = aokiVar3;
                aolfVar.b |= 1;
                int i = uccVar.b;
                int i2 = i - 1;
                if (i != 0) {
                    int i3 = i2 != 1 ? i2 != 2 ? 1 : 2 : 3;
                    createBuilder2.copyOnWrite();
                    aolf aolfVar2 = (aolf) createBuilder2.instance;
                    aolfVar2.d = i3 - 1;
                    aolfVar2.b |= 2;
                    aolf aolfVar3 = (aolf) createBuilder2.mo39build();
                    createBuilder.copyOnWrite();
                    aokz aokzVar3 = (aokz) createBuilder.instance;
                    aolfVar3.getClass();
                    aopu aopuVar = aokzVar3.d;
                    if (!aopuVar.c()) {
                        aokzVar3.d = aopi.mutableCopy(aopuVar);
                    }
                    aokzVar3.d.add(aolfVar3);
                } else {
                    throw null;
                }
            }
            if (z) {
                aolo b = uggVar.b.b();
                createBuilder.copyOnWrite();
                aokz aokzVar4 = (aokz) createBuilder.instance;
                b.getClass();
                aokzVar4.e = b;
                aokzVar4.b |= 4;
            }
            aokz aokzVar5 = (aokz) createBuilder.mo39build();
            ujf g = this.b.g(str, aokzVar5);
            j(str, g, 22);
            return ufr.a(aokzVar5, g);
        } catch (ufm e) {
            ufq c = ufr.c();
            c.c = e;
            c.b(true);
            return c.a();
        }
    }

    @Override // defpackage.ufs
    public final ufr h(String str, aomi aomiVar, aomk aomkVar) {
        if (new aops(axqh.a.get().a().c, uim.a).contains(aomiVar)) {
            ufq c = ufr.c();
            c.c = new ufy(aomiVar);
            c.b(false);
            return c.a();
        }
        try {
            aolb a = this.h.a(str, aomiVar, aomkVar);
            ujf h = this.b.h(str, a);
            j(str, h, 15);
            return ufr.a(a, h);
        } catch (ufm e) {
            ufq c2 = ufr.c();
            c2.c = e;
            c2.b(true);
            return c2.a();
        }
    }

    @Override // defpackage.ufs
    public final void i(String str, aomr aomrVar) {
        aopa createBuilder = aold.a.createBuilder();
        createBuilder.copyOnWrite();
        aold aoldVar = (aold) createBuilder.instance;
        str.getClass();
        aoldVar.b |= 1;
        aoldVar.c = str;
        createBuilder.copyOnWrite();
        aold aoldVar2 = (aold) createBuilder.instance;
        aomrVar.getClass();
        aoldVar2.d = aomrVar;
        aoldVar2.b |= 2;
        aold aoldVar3 = (aold) createBuilder.mo39build();
        ujf i = this.b.i(aoldVar3);
        j(null, i, 18);
        ufr.a(aoldVar3, i);
    }
}
