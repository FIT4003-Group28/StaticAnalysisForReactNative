package defpackage;

import java.util.Comparator;
/* renamed from: aydw  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class aydw implements Comparator {
    static final Comparator a = new aydw();

    private aydw() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((dpre) obj).d.compareTo(((dpre) obj2).d);
    }
}
