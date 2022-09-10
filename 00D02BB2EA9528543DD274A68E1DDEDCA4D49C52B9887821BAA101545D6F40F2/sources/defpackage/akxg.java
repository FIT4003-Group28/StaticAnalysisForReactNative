package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: akxg  reason: default package */
/* loaded from: classes2.dex */
public final class akxg {
    public static dmpe a(List<String> list, akuh akuhVar) {
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        b(list, akuhVar, dmpeVar);
        return dmpeVar;
    }

    public static void b(List<String> list, akuh akuhVar, dmpe dmpeVar) {
        for (int i = 0; i < list.size(); i++) {
            dmpc e = akuhVar.e();
            String str = list.get(i);
            if (e.c) {
                e.bF();
                e.c = false;
            }
            dmpd dmpdVar = (dmpd) e.b;
            dmpd dmpdVar2 = dmpd.h;
            str.getClass();
            boolean z = true;
            int i2 = dmpdVar.a | 1;
            dmpdVar.a = i2;
            dmpdVar.b = str;
            if (i <= 0) {
                z = false;
            }
            dmpdVar.a = i2 | 16;
            dmpdVar.f = z;
            dmpeVar.b(e);
        }
    }
}
