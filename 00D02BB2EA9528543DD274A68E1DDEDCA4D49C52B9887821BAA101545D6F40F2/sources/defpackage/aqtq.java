package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aqtq  reason: default package */
/* loaded from: classes2.dex */
final class aqtq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(cqiv cqivVar, List<aquu> list) {
        for (aquu aquuVar : list) {
            b(cqivVar, aquuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(cqiv cqivVar, aquu aquuVar) {
        int intValue = aquuVar.d().intValue();
        if (intValue == 0) {
            cqivVar.a(new aquq(), (aqux) aquuVar);
        } else if (intValue == 1) {
            cqivVar.a(new aqtn(), (aqut) aquuVar);
        } else if (intValue != 2) {
        } else {
            cqivVar.a(new aqtf(), (aqva) aquuVar);
        }
    }
}
