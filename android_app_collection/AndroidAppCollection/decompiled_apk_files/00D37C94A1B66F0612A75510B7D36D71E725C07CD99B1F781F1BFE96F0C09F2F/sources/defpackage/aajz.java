package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aajz  reason: default package */
/* loaded from: classes.dex */
public final class aajz {
    public static final aorw a = aorw.a;

    public static aajj b(amup amupVar, aajj aajjVar, aajj aajjVar2) {
        ahxi ahxiVar;
        if (aajjVar != null && aajjVar2 != null && (ahxiVar = (ahxi) amupVar.get(aajjVar2.getClass())) != null && (aajjVar instanceof atad) && (aajjVar2 instanceof atad)) {
            atad atadVar = (atad) aajjVar;
            atad atadVar2 = (atad) aajjVar2;
            if (atadVar.f() && !atadVar2.f()) {
                atab e = atadVar2.e();
                e.b(atadVar.getCurrentSyncMode());
                ((aagi) ahxiVar.a.get()).c();
                return e.c();
            }
        }
        return aajjVar2;
    }

    public static aorw c(aorw aorwVar, aorw aorwVar2) {
        return aosw.a(aorwVar, aorwVar2) < 0 ? aorwVar2 : aorwVar;
    }

    public static boolean d(aorw aorwVar, aorw aorwVar2) {
        return aorwVar2.equals(a) || aosw.a(aorwVar2, aorwVar) > 0;
    }

    public static aajj a(aake aakeVar, aqvy aqvyVar, String str, aajj aajjVar, byte[] bArr) {
        alzi alziVar;
        char c = 2;
        if (aajjVar == null) {
            if ((aqvyVar.b & 2) == 0) {
                return aakeVar.a(str, bArr);
            }
            String valueOf = String.valueOf(str);
            zep.b(valueOf.length() != 0 ? "Can't do a masked update of non-existent entity ".concat(valueOf) : new String("Can't do a masked update of non-existent entity "));
            return null;
        }
        aqvx aqvxVar = aqvyVar.c;
        if (aqvxVar == null) {
            aqvxVar = aqvx.a;
        }
        int bs = awwc.bs(aqvxVar.c);
        if (bs == 0 || bs != 3) {
            c = 1;
        }
        alzl alzlVar = aqvyVar.d;
        if (alzlVar == null) {
            alzlVar = alzl.a;
        }
        alzi d = alzi.d(alzlVar);
        try {
            byte[] c2 = aajjVar.c();
            if (c == 1) {
                alziVar = d.f();
            } else {
                alziVar = alzi.b;
            }
            abgd a2 = abgd.a(aoog.O(c2), alziVar);
            abgd a3 = abgd.a(aoog.O(bArr), d);
            byte[] bArr2 = new byte[a2.b + a3.b];
            aool ak = aool.ak(bArr2);
            a2.b(ak);
            a3.b(ak);
            return aakeVar.a(aajjVar.d(), bArr2);
        } catch (IOException unused) {
            String valueOf2 = String.valueOf(str);
            zep.b(valueOf2.length() != 0 ? "applyUpdates couldn't mergeSerialized for entity ".concat(valueOf2) : new String("applyUpdates couldn't mergeSerialized for entity "));
            return null;
        }
    }
}
