package defpackage;

import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: xef  reason: default package */
/* loaded from: classes4.dex */
public final class xef {
    public static final EnumMap a;
    public boolean b;
    public final arhs c;
    public final arhs d;
    public final apzg e;
    public final apzg f;
    public final CharSequence g;
    public final CharSequence h;

    static {
        EnumMap enumMap = new EnumMap(arhr.class);
        a = enumMap;
        enumMap.put((EnumMap) arhr.LIKE, (arhr) 2131232794);
        enumMap.put((EnumMap) arhr.DISLIKE, (arhr) 2131232784);
    }

    public xef(apos aposVar) {
        arhs arhsVar;
        apzg apzgVar;
        apzg apzgVar2;
        String str;
        this.b = aposVar.e;
        String str2 = null;
        if ((aposVar.b & 32) != 0) {
            arhsVar = aposVar.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
        } else {
            arhsVar = null;
        }
        this.c = arhsVar;
        if ((aposVar.b & 2048) != 0 && (arhsVar = aposVar.m) == null) {
            arhsVar = arhs.a;
        }
        this.d = arhsVar;
        if ((aposVar.b & 512) != 0) {
            apzgVar = aposVar.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        this.e = apzgVar;
        if ((aposVar.b & 16384) != 0) {
            apzgVar2 = aposVar.p;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
        } else {
            apzgVar2 = null;
        }
        this.f = apzgVar2;
        aovs aovsVar = aposVar.r;
        aovr aovrVar = (aovsVar == null ? aovs.a : aovsVar).c;
        if (((aovrVar == null ? aovr.a : aovrVar).b & 2) != 0) {
            aovs aovsVar2 = aposVar.r;
            aovr aovrVar2 = (aovsVar2 == null ? aovs.a : aovsVar2).c;
            str = (aovrVar2 == null ? aovr.a : aovrVar2).c;
        } else {
            str = null;
        }
        this.g = str;
        aovs aovsVar3 = aposVar.s;
        aovr aovrVar3 = (aovsVar3 == null ? aovs.a : aovsVar3).c;
        if (((aovrVar3 == null ? aovr.a : aovrVar3).b & 2) != 0) {
            aovs aovsVar4 = aposVar.s;
            aovr aovrVar4 = (aovsVar4 == null ? aovs.a : aovsVar4).c;
            str2 = (aovrVar4 == null ? aovr.a : aovrVar4).c;
        }
        this.h = str2;
    }
}
