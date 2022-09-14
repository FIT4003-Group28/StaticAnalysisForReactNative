package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: csjf  reason: default package */
/* loaded from: classes5.dex */
final class csjf {
    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static ddxz a(csio csioVar, boolean z) {
        List<cshb> a = csioVar.a();
        for (int i = !z ? 1 : 0; i < a.size(); i++) {
            cshb cshbVar = a.get(i);
            ddxx ddxxVar = cshbVar.c;
            if (ddxxVar == null) {
                ddxxVar = ddxx.j;
            }
            if ((ddxxVar.a & 2048) != 0) {
                ddxx ddxxVar2 = cshbVar.c;
                if (ddxxVar2 == null) {
                    ddxxVar2 = ddxx.j;
                }
                ddxz ddxzVar = ddxxVar2.i;
                return ddxzVar == null ? ddxz.d : ddxzVar;
            }
        }
        return null;
    }
}
