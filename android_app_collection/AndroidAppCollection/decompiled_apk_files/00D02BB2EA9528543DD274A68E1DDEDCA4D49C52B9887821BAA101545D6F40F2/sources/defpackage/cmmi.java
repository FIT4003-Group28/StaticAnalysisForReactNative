package defpackage;

import java.util.Comparator;
/* renamed from: cmmi  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cmmi implements Comparator {
    static final Comparator a = new cmmi();

    private cmmi() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        cmly cmlyVar = (cmly) obj;
        cmly cmlyVar2 = (cmly) obj2;
        long j = cmlyVar.f;
        long j2 = cmlyVar2.f;
        if (j - j2 == 0) {
            return cmlyVar.compareTo(cmlyVar2);
        }
        return j >= j2 ? 1 : -1;
    }
}
