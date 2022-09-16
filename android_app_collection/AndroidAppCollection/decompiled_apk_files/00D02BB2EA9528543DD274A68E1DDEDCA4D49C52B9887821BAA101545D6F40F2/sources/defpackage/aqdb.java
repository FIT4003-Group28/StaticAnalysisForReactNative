package defpackage;
/* compiled from: PG */
/* renamed from: aqdb  reason: default package */
/* loaded from: classes2.dex */
public final class aqdb {
    public static cjta a(ddho ddhoVar, @dzsi String str) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        if (str != null) {
            ddes bZ = ddet.D.bZ();
            ddii bZ2 = ddij.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddij ddijVar = (ddij) bZ2.b;
            str.getClass();
            ddijVar.a |= 2;
            ddijVar.c = str;
            ddij bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            bK.getClass();
            ddetVar.m = bK;
            ddetVar.a |= 1024;
            b.s(bZ.bK());
        }
        return b;
    }
}
