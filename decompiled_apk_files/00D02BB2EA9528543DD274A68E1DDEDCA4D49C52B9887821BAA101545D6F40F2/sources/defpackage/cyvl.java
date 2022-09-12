package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: cyvl  reason: default package */
/* loaded from: classes5.dex */
final class cyvl implements Comparator<cyvv> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(cyvv cyvvVar, cyvv cyvvVar2) {
        cyvv cyvvVar3 = cyvvVar2;
        int f = cyvvVar.f();
        int i = f - 1;
        if (f != 0) {
            int f2 = cyvvVar3.f();
            int i2 = f2 - 1;
            if (f2 == 0) {
                throw null;
            }
            return i - i2;
        }
        throw null;
    }
}
