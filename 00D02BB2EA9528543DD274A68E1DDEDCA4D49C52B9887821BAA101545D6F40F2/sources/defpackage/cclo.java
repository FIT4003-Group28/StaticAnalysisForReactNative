package defpackage;
/* renamed from: cclo  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class cclo {
    public static boolean a(ilo iloVar, dgfb dgfbVar) {
        dral dralVar = iloVar.h().bk;
        if (dralVar == null) {
            dralVar = dral.b;
        }
        for (draj drajVar : dralVar.a) {
            dgfb b = dgfb.b(drajVar.a);
            if (b == null) {
                b = dgfb.UNKNOWN_OFFERING_TYPE;
                continue;
            }
            if (b == dgfbVar) {
                return true;
            }
        }
        return false;
    }
}
