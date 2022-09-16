package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aadf  reason: default package */
/* loaded from: classes.dex */
public final class aadf {
    public static final asfs a;
    private static final apgt b;
    private static final amuk c;

    static {
        aopa createBuilder = apgt.a.createBuilder();
        createBuilder.copyOnWrite();
        apgt apgtVar = (apgt) createBuilder.instance;
        apgtVar.b |= 1;
        apgtVar.c = true;
        createBuilder.copyOnWrite();
        apgt apgtVar2 = (apgt) createBuilder.instance;
        apgtVar2.b |= 2;
        apgtVar2.d = true;
        b = (apgt) createBuilder.mo39build();
        amuk A = amuk.A(1000L, 1000L, 1000L, 1000L, 15000L, 15000L, 15000L, 15000L, 60000L, 60000L, 60000L, 60000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L);
        c = A;
        aopa createBuilder2 = asfs.a.createBuilder();
        createBuilder2.copyOnWrite();
        asfs asfsVar = (asfs) createBuilder2.instance;
        asfsVar.b = 1 | asfsVar.b;
        asfsVar.c = "innertube_android";
        createBuilder2.copyOnWrite();
        asfs asfsVar2 = (asfs) createBuilder2.instance;
        asfsVar2.b |= 2;
        asfsVar2.d = "https://upload.youtube.com/upload/youtubei";
        createBuilder2.copyOnWrite();
        asfs asfsVar3 = (asfs) createBuilder2.instance;
        aopt aoptVar = asfsVar3.e;
        if (!aoptVar.c()) {
            asfsVar3.e = aopi.mutableCopy(aoptVar);
        }
        aonk.addAll((Iterable) A, (List) asfsVar3.e);
        createBuilder2.copyOnWrite();
        asfs asfsVar4 = (asfs) createBuilder2.instance;
        aopt aoptVar2 = asfsVar4.g;
        if (!aoptVar2.c()) {
            asfsVar4.g = aopi.mutableCopy(aoptVar2);
        }
        aonk.addAll((Iterable) A, (List) asfsVar4.g);
        createBuilder2.copyOnWrite();
        asfs asfsVar5 = (asfs) createBuilder2.instance;
        aopt aoptVar3 = asfsVar5.h;
        if (!aoptVar3.c()) {
            asfsVar5.h = aopi.mutableCopy(aoptVar3);
        }
        aonk.addAll((Iterable) A, (List) asfsVar5.h);
        createBuilder2.copyOnWrite();
        asfs asfsVar6 = (asfs) createBuilder2.instance;
        aopt aoptVar4 = asfsVar6.i;
        if (!aoptVar4.c()) {
            asfsVar6.i = aopi.mutableCopy(aoptVar4);
        }
        aonk.addAll((Iterable) A, (List) asfsVar6.i);
        createBuilder2.copyOnWrite();
        asfs asfsVar7 = (asfs) createBuilder2.instance;
        aopt aoptVar5 = asfsVar7.j;
        if (!aoptVar5.c()) {
            asfsVar7.j = aopi.mutableCopy(aoptVar5);
        }
        aonk.addAll((Iterable) A, (List) asfsVar7.j);
        createBuilder2.copyOnWrite();
        asfs asfsVar8 = (asfs) createBuilder2.instance;
        aopt aoptVar6 = asfsVar8.k;
        if (!aoptVar6.c()) {
            asfsVar8.k = aopi.mutableCopy(aoptVar6);
        }
        aonk.addAll((Iterable) A, (List) asfsVar8.k);
        a = (asfs) createBuilder2.mo39build();
    }

    public static asfs a(aacz aaczVar) {
        atfw atfwVar = aaczVar.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        if ((atfwVar.b & 8) != 0) {
            asfs asfsVar = atfwVar.f;
            return asfsVar == null ? asfs.a : asfsVar;
        }
        return a;
    }

    public static boolean b(aacz aaczVar) {
        apgt apgtVar;
        atfw atfwVar = aaczVar.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        if ((atfwVar.c & 16) != 0) {
            apgtVar = atfwVar.v;
            if (apgtVar == null) {
                apgtVar = apgt.a;
            }
        } else {
            apgtVar = b;
        }
        return apgtVar.c;
    }
}
