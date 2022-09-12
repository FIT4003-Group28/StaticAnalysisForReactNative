package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: algj  reason: default package */
/* loaded from: classes2.dex */
public class algj extends algb {
    public final amub e;

    public algj(amub amubVar, akrk akrkVar) {
        super(akrkVar);
        this.e = amubVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<String> c(int i, boolean z, List<dovn> list) {
        String str;
        String str2;
        dccx dccxVar = new dccx();
        for (int i2 = 0; i2 < list.size(); i2++) {
            dovn dovnVar = list.get(i2);
            int a = dovm.a(dovnVar.d);
            if (a == 0) {
                a = 1;
            }
            if (a == i) {
                if ((dovnVar.a & 1) != 0) {
                    douj doujVar = dovnVar.b;
                    if (doujVar == null) {
                        doujVar = douj.h;
                    }
                    dbsi<String, String> l = alca.l(doujVar);
                    if (z && (str2 = l.b) != null) {
                        str = str2;
                    } else {
                        String str3 = l.a;
                        if (str3 != null) {
                            str = str3;
                        }
                    }
                    dccxVar.g(str);
                }
                str = dovnVar.c;
                dccxVar.g(str);
            }
        }
        return dccxVar.f();
    }
}
