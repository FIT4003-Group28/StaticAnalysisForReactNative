package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cjtx  reason: default package */
/* loaded from: classes4.dex */
public final class cjtx extends cjtk {
    @dzsi
    private final String a;
    @dzsi
    private final String b;
    private final String c;
    @dzsi
    private final String d;
    @dzsi
    private final akqq e;
    @dzsi
    private final String f;
    @dzsi
    private final String g;
    private final boolean h;
    private final int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjtx(int i, @dzsi String str, @dzsi String str2, String str3, @dzsi String str4, @dzsi akqq akqqVar, @dzsi String str5, @dzsi String str6, boolean z) {
        super(SystemClock.elapsedRealtime());
        int i2 = cqaz.a;
        this.i = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str4 != null ? null : akqqVar;
        this.f = str5;
        this.g = str6;
        this.h = z;
    }

    @dzsi
    public static String b(ilo iloVar) {
        akqi ai = iloVar.ai();
        if (ai == null || akqi.a.equals(ai)) {
            return null;
        }
        return ai.o();
    }

    public static cjtx c(int i, ilo iloVar, boolean z) {
        cjtd bY = iloVar.bY();
        return new cjtx(i, bY != null ? bY.e : null, bY != null ? bY.d : null, iloVar.n(), b(iloVar), iloVar.aj(), null, null, z);
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dvku bZ = dvkw.k.bZ();
        int i = this.i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvkw dvkwVar = (dvkw) bZ.b;
        dvkwVar.b = i - 1;
        int i2 = dvkwVar.a | 1;
        dvkwVar.a = i2;
        String str = this.a;
        if (str != null) {
            str.getClass();
            i2 |= 2;
            dvkwVar.a = i2;
            dvkwVar.c = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            str2.getClass();
            i2 |= 4;
            dvkwVar.a = i2;
            dvkwVar.d = str2;
        }
        String str3 = this.c;
        str3.getClass();
        int i3 = i2 | 8;
        dvkwVar.a = i3;
        dvkwVar.e = str3;
        String str4 = this.d;
        if (str4 != null) {
            str4.getClass();
            dvkwVar.a = i3 | 16;
            dvkwVar.f = str4;
        }
        akqq akqqVar = this.e;
        if (akqqVar != null && str4 == null) {
            dhjz i4 = akqqVar.i();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvkw dvkwVar2 = (dvkw) bZ.b;
            i4.getClass();
            dvkwVar2.g = i4;
            dvkwVar2.a |= 32;
        }
        String str5 = this.f;
        if (str5 != null) {
            dvkw dvkwVar3 = (dvkw) bZ.b;
            str5.getClass();
            dvkwVar3.a |= 64;
            dvkwVar3.h = str5;
        }
        String str6 = this.g;
        if (str6 != null) {
            dvkw dvkwVar4 = (dvkw) bZ.b;
            str6.getClass();
            dvkwVar4.a |= 128;
            dvkwVar4.i = str6;
        }
        if (this.h) {
            dvkw dvkwVar5 = (dvkw) bZ.b;
            dvkwVar5.a |= 256;
            dvkwVar5.j = true;
        }
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dvkw bK = bZ.bK();
        dwun dwunVar2 = dwun.w;
        bK.getClass();
        dwunVar.o = bK;
        dwunVar.a |= 1024;
    }

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }
}
