package defpackage;

import java.io.Serializable;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: aosv  reason: default package */
/* loaded from: classes.dex */
public final class aosv extends Enum implements Comparator, Serializable {
    public static final aosv a;
    private static final /* synthetic */ aosv[] b;

    static {
        aosv aosvVar = new aosv();
        a = aosvVar;
        b = new aosv[]{aosvVar};
    }

    private aosv() {
    }

    public static aosv[] values() {
        return (aosv[]) b.clone();
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public final int compare(aorw aorwVar, aorw aorwVar2) {
        aosw.g(aorwVar);
        aosw.g(aorwVar2);
        long j = aorwVar.b;
        long j2 = aorwVar2.b;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (j == j2) {
            int i2 = aorwVar.c;
            int i3 = aorwVar2.c;
            if (i2 == i3) {
                return 0;
            }
            return i2 >= i3 ? 1 : -1;
        }
        return i;
    }
}
