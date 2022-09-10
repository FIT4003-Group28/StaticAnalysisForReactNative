package defpackage;
/* compiled from: PG */
/* renamed from: oxc  reason: default package */
/* loaded from: classes7.dex */
public final class oxc {
    public static dtkx a(@dzsi String str, @dzsi String str2, @dzsi int i, @dzsi dthb dthbVar) {
        dtkm bZ = dtkq.f.bZ();
        int i2 = i - 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtkq dtkqVar = (dtkq) bZ.b;
        dtkqVar.a |= 1;
        dtkqVar.b = i2;
        dtkq bK = bZ.bK();
        dtke dtkeVar = (dtke) dtkf.n.bZ();
        if (str != null) {
            dtkeVar.b(str);
        }
        if (str2 != null) {
            dtkeVar.a(str2);
        }
        if (bK != null) {
            if (dtkeVar.c) {
                dtkeVar.bF();
                dtkeVar.c = false;
            }
            dtkf dtkfVar = (dtkf) dtkeVar.b;
            bK.getClass();
            dtkfVar.f = bK;
            dtkfVar.a |= 1;
        }
        if (dthbVar != null) {
            if (dtkeVar.c) {
                dtkeVar.bF();
                dtkeVar.c = false;
            }
            dtkf dtkfVar2 = (dtkf) dtkeVar.b;
            dthbVar.getClass();
            dtkfVar2.h = dthbVar;
            dtkfVar2.a |= 2;
        }
        dtlc bZ2 = dtlf.f.bZ();
        dtle dtleVar = dtle.LIST_ITEM;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtlf dtlfVar = (dtlf) bZ2.b;
        dtlfVar.b = dtleVar.bk;
        dtlfVar.a |= 1;
        dtkw dtkwVar = (dtkw) dtkx.e.bZ();
        dtkt dtktVar = (dtkt) dtku.p.bZ();
        if (dtktVar.c) {
            dtktVar.bF();
            dtktVar.c = false;
        }
        dtku dtkuVar = (dtku) dtktVar.b;
        dtkf dtkfVar3 = (dtkf) dtkeVar.bK();
        dtkfVar3.getClass();
        dtkuVar.b = dtkfVar3;
        dtkuVar.a |= 1;
        if (dtkwVar.c) {
            dtkwVar.bF();
            dtkwVar.c = false;
        }
        dtkx dtkxVar = (dtkx) dtkwVar.b;
        dtku dtkuVar2 = (dtku) dtktVar.bK();
        dtkuVar2.getClass();
        dtkxVar.b = dtkuVar2;
        dtkxVar.a |= 1;
        dtkwVar.a(bZ2);
        return (dtkx) dtkwVar.bK();
    }
}
