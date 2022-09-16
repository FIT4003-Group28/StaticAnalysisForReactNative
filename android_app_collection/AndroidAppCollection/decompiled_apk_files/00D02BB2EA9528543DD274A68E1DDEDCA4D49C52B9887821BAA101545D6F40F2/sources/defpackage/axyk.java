package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: axyk  reason: default package */
/* loaded from: classes3.dex */
public final class axyk {
    public static final String a(String str) {
        if (dbsj.d(str)) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("token");
    }

    public static final drrp b(baad baadVar, boolean z) {
        drrg bZ = drri.e.bZ();
        String l = baadVar.l();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drri drriVar = (drri) bZ.b;
        l.getClass();
        int i = 1;
        drriVar.a |= 1;
        drriVar.b = l;
        baab o = baadVar.o();
        baab baabVar = baab.FAVORITES;
        int ordinal = o.ordinal();
        if (ordinal == 0) {
            i = 2;
        } else if (ordinal == 1) {
            i = 3;
        } else if (ordinal == 2) {
            i = 5;
        } else if (ordinal == 5) {
            i = 4;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drri drriVar2 = (drri) bZ.b;
        drriVar2.d = i - 1;
        drriVar2.a = 4 | drriVar2.a;
        if (z && !dbsj.d(baadVar.v())) {
            String v = baadVar.v();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drri drriVar3 = (drri) bZ.b;
            v.getClass();
            drriVar3.a |= 2;
            drriVar3.c = v;
        }
        drro bZ2 = drrp.d.bZ();
        drrq bZ3 = drrr.j.bZ();
        drri bK = bZ.bK();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drrr drrrVar = (drrr) bZ3.b;
        bK.getClass();
        drrrVar.f = bK;
        drrrVar.a |= 1024;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drrp drrpVar = (drrp) bZ2.b;
        drrr bK2 = bZ3.bK();
        bK2.getClass();
        drrpVar.c = bK2;
        drrpVar.a |= 8;
        return bZ2.bK();
    }
}
