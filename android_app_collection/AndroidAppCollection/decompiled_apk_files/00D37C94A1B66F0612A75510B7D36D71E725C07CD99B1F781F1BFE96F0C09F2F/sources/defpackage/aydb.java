package defpackage;
/* compiled from: PG */
/* renamed from: aydb  reason: default package */
/* loaded from: classes2.dex */
public final class aydb {
    private aydb() {
    }

    public static ayie a() {
        if (aykq.a != null) {
            return new aydv();
        }
        return new aykq();
    }

    public static azrd b(azrd azrdVar, azrd azrdVar2) {
        return azrdVar2 == azre.a ? azrdVar : (azrd) azrdVar2.fold(azrdVar, azrc.a);
    }

    public static int c(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
