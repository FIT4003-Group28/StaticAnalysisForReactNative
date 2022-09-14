package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: zag  reason: default package */
/* loaded from: classes7.dex */
public final class zag {
    public static final boolean a(amte amteVar, amte amteVar2) {
        HashSet hashSet = new HashSet(b(amteVar2));
        for (String str : b(amteVar)) {
            if (!hashSet.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> b(amte amteVar) {
        amtr[] amtrVarArr;
        ArrayList arrayList = new ArrayList();
        for (amve amveVar : amteVar.a.d) {
            for (amtr amtrVar : amveVar.b) {
                int i = 0;
                while (true) {
                    if (i < amtrVar.e()) {
                        amuq d = amtrVar.d(i);
                        dqvj c = dqvj.c(d.a().b);
                        if (c == null) {
                            c = dqvj.DRIVE;
                        }
                        if (c == dqvj.TRANSIT) {
                            for (doyp doypVar : d.h().b) {
                                if ((doypVar.a & 4096) != 0) {
                                    arrayList.add(doypVar.j);
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
