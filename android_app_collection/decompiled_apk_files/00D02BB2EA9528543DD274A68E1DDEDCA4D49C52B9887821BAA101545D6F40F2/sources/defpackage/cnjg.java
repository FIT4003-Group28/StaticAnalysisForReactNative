package defpackage;

import java.util.Comparator;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: cnjg  reason: default package */
/* loaded from: classes5.dex */
public final class cnjg extends Enum<cnjg> implements Comparator<Long> {
    public static final cnjg a;
    private static final /* synthetic */ cnjg[] b;

    static {
        cnjg cnjgVar = new cnjg();
        a = cnjgVar;
        b = new cnjg[]{cnjgVar};
    }

    private cnjg() {
    }

    private static final long a(long j) {
        return ((j / 1000000) * 1000000) + (((j % 100000) / 10) * 10);
    }

    public static cnjg[] values() {
        return (cnjg[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Long l, Long l2) {
        return (a(l.longValue()) > a(l2.longValue()) ? 1 : (a(l.longValue()) == a(l2.longValue()) ? 0 : -1));
    }
}
