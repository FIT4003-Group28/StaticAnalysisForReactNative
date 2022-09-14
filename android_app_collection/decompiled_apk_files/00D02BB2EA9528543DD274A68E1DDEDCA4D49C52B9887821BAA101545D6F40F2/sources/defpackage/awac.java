package defpackage;

import java.util.Comparator;
/* renamed from: awac  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class awac implements Comparator {
    static final Comparator a = new awac();

    private awac() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dlsa dlsaVar = (dlsa) obj2;
        int a2 = dluw.a(((dlsa) obj).a);
        int i = 1;
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = awaq.c(a2).f;
        int a3 = dluw.a(dlsaVar.a);
        if (a3 != 0) {
            i = a3;
        }
        return i2 - awaq.c(i).f;
    }
}
