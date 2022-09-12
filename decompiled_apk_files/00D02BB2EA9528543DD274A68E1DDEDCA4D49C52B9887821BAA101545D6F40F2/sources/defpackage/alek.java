package defpackage;

import java.util.Comparator;
/* renamed from: alek  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class alek implements Comparator {
    static final Comparator a = new alek();

    private alek() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dozl dozlVar;
        dozr dozrVar = (dozr) obj;
        dozr dozrVar2 = (dozr) obj2;
        if (dozrVar.b == 4) {
            dozlVar = (dozl) dozrVar.c;
        } else {
            dozlVar = dozl.e;
        }
        return dozlVar.b - (dozrVar2.b == 4 ? (dozl) dozrVar2.c : dozl.e).b;
    }
}
