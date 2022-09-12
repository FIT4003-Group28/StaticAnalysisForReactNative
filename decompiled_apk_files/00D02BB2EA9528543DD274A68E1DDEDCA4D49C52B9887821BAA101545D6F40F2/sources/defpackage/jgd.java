package defpackage;

import java.util.Comparator;
/* renamed from: jgd  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class jgd implements Comparator {
    static final Comparator a = new jgd();

    private jgd() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        jge jgeVar = (jge) obj;
        jge jgeVar2 = (jge) obj2;
        int compare = Float.compare(jgeVar2.b, jgeVar.b);
        return compare != 0 ? compare : jgeVar.a - jgeVar2.a;
    }
}
