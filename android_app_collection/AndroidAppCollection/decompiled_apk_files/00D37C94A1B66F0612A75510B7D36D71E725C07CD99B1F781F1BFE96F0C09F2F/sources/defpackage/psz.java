package defpackage;
/* compiled from: PG */
/* renamed from: psz  reason: default package */
/* loaded from: classes4.dex */
final class psz extends psn implements Comparable {
    public long b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        psz pszVar = (psz) obj;
        if (isEndOfStream() != pszVar.isEndOfStream()) {
            return !isEndOfStream() ? -1 : 1;
        }
        long j = this.f - pszVar.f;
        if (j == 0) {
            j = this.b - pszVar.b;
            if (j == 0) {
                return 0;
            }
        }
        return j <= 0 ? -1 : 1;
    }
}
