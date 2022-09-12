package defpackage;
/* compiled from: PG */
/* renamed from: aqql  reason: default package */
/* loaded from: classes2.dex */
public abstract class aqql implements Comparable<aqql> {
    public abstract String a();

    public abstract int b();

    public abstract aqqe c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(aqql aqqlVar) {
        aqql aqqlVar2 = aqqlVar;
        int b = b();
        if (b != 0) {
            if (b == 1) {
                return 0;
            }
            int b2 = aqqlVar2.b();
            if (b2 == 0) {
                throw null;
            }
            if (b2 != 1) {
                return c().c().compareToIgnoreCase(aqqlVar2.c().c());
            }
            return 0;
        }
        throw null;
    }
}
