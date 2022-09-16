package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aktj  reason: default package */
/* loaded from: classes.dex */
public final class aktj implements yqm {
    private final acud a;
    private final yme b;
    private final snc c;
    private final zex d;

    public aktj(acud acudVar, yme ymeVar, snc sncVar, zex zexVar) {
        this.a = acudVar;
        this.b = ymeVar;
        this.c = sncVar;
        this.d = zexVar;
    }

    @Override // defpackage.yqm
    public final void a(yql yqlVar) {
        InteractionLoggingScreen c;
        avfd avfdVar = this.b.d().e;
        if (avfdVar == null) {
            avfdVar = avfd.a;
        }
        boolean z = avfdVar.g;
        avfd avfdVar2 = this.b.d().e;
        if (avfdVar2 == null) {
            avfdVar2 = avfd.a;
        }
        boolean z2 = avfdVar2.p;
        Integer num = yqlVar.k;
        int i = 0;
        if (num != null) {
            ArrayList arrayList = new ArrayList();
            Collection collection = yqlVar.m;
            if (collection != null && !collection.isEmpty()) {
                for (Object obj : collection) {
                    if (obj instanceof aapr) {
                        arrayList.addAll(((aapr) obj).d);
                    }
                }
            }
            this.d.a(yqlVar.o, yqlVar.a, String.format(Locale.US, "Request failure captured by PRIMES. Failed reason: %d. Annotations: %s", yqlVar.k, TextUtils.join(",", arrayList)), yqlVar.n);
        }
        if (z || (z2 && num != null)) {
            Long l = yqlVar.e;
            uyc d = uyc.d(utq.a, yqlVar.a, l == null ? this.c.c() : l.longValue());
            String str = yqlVar.i;
            if (str != null) {
                d.i(str);
            }
            String str2 = yqlVar.b;
            if (str2 != null) {
                d.f(str2);
            }
            Long l2 = yqlVar.c;
            int intValue = l2 != null ? l2.intValue() : 0;
            Long l3 = yqlVar.d;
            if (l3 != null) {
                i = l3.intValue();
            }
            d.e(intValue, i);
            Integer num2 = yqlVar.h;
            if (num2 != null) {
                d.g(num2.intValue());
            }
            Long l4 = yqlVar.f;
            if (l4 != null) {
                d.o(utq.a, l4.longValue());
            }
            Long l5 = yqlVar.g;
            if (l5 != null) {
                d.n(utq.a, l5.longValue());
            }
            azzy b = azzy.b(yqlVar.j);
            if (b != null) {
                d.l(b);
            }
            Integer num3 = yqlVar.k;
            if (num3 != null) {
                d.k(num3.intValue());
            }
            Integer num4 = yqlVar.l;
            if (num4 != null) {
                d.j(num4.intValue());
            }
            aopa createBuilder = azzl.a.createBuilder();
            avfd avfdVar3 = this.b.d().e;
            if (avfdVar3 == null) {
                avfdVar3 = avfd.a;
            }
            if (avfdVar3.k && (c = this.a.c()) != null) {
                int i2 = c.c().a;
                createBuilder.copyOnWrite();
                azzl azzlVar = (azzl) createBuilder.instance;
                azzlVar.b |= 4;
                azzlVar.f = i2;
            }
            avfd avfdVar4 = this.b.d().e;
            if (avfdVar4 == null) {
                avfdVar4 = avfd.a;
            }
            if (avfdVar4.g) {
                createBuilder.copyOnWrite();
                azzl azzlVar2 = (azzl) createBuilder.instance;
                azzlVar2.g = 1;
                azzlVar2.b |= 8;
            } else {
                createBuilder.copyOnWrite();
                azzl azzlVar3 = (azzl) createBuilder.instance;
                azzlVar3.g = 2;
                azzlVar3.b |= 8;
            }
            Collection collection2 = yqlVar.m;
            if (collection2 != null && !collection2.isEmpty()) {
                for (Object obj2 : collection2) {
                    if (obj2 instanceof aapr) {
                        aapr aaprVar = (aapr) obj2;
                        d.m(aaprVar.c);
                        long longValue = aaprVar.a.longValue();
                        createBuilder.copyOnWrite();
                        azzl azzlVar4 = (azzl) createBuilder.instance;
                        azzlVar4.b |= 1;
                        azzlVar4.c = longValue;
                        int i3 = aaprVar.b;
                        createBuilder.copyOnWrite();
                        azzl azzlVar5 = (azzl) createBuilder.instance;
                        azzlVar5.b |= 2;
                        azzlVar5.d = i3;
                        amuk amukVar = aaprVar.d;
                        createBuilder.copyOnWrite();
                        azzl azzlVar6 = (azzl) createBuilder.instance;
                        aopu aopuVar = azzlVar6.e;
                        if (!aopuVar.c()) {
                            azzlVar6.e = aopi.mutableCopy(aopuVar);
                        }
                        aonk.addAll((Iterable) amukVar, (List) azzlVar6.e);
                        aaqv aaqvVar = aaprVar.e;
                        if (aaqvVar != null) {
                            int i4 = aaqvVar.a;
                            createBuilder.copyOnWrite();
                            azzl azzlVar7 = (azzl) createBuilder.instance;
                            azzlVar7.b |= 16;
                            azzlVar7.h = i4;
                            amuk amukVar2 = aaqvVar.b;
                            createBuilder.copyOnWrite();
                            azzl azzlVar8 = (azzl) createBuilder.instance;
                            aopu aopuVar2 = azzlVar8.i;
                            if (!aopuVar2.c()) {
                                azzlVar8.i = aopi.mutableCopy(aopuVar2);
                            }
                            aonk.addAll((Iterable) amukVar2, (List) azzlVar8.i);
                        }
                    }
                }
            }
            azzl azzlVar9 = (azzl) createBuilder.mo39build();
            if (!akzj.f(azzlVar9, azzl.a)) {
                aopc aopcVar = (aopc) azzk.a.createBuilder();
                aopg aopgVar = azzm.b;
                aopa createBuilder2 = azzm.a.createBuilder();
                createBuilder2.copyOnWrite();
                azzm azzmVar = (azzm) createBuilder2.instance;
                azzlVar9.getClass();
                azzmVar.d = azzlVar9;
                azzmVar.c |= 1;
                aopcVar.e(aopgVar, (azzm) createBuilder2.mo39build());
                d.h((azzk) aopcVar.mo39build());
            }
            utd.a().a.a(d);
        }
    }
}
