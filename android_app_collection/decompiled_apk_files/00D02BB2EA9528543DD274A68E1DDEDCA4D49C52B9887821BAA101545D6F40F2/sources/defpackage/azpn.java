package defpackage;

import java.util.Comparator;
/* renamed from: azpn  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class azpn implements Comparator {
    static final Comparator a = new azpn();

    private azpn() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        azyh azyhVar = (azyh) obj;
        azyh azyhVar2 = (azyh) obj2;
        if (azyhVar.j().c < azyhVar2.j().c) {
            return -1;
        }
        return azyhVar.j().c == azyhVar2.j().c ? 0 : 1;
    }
}
