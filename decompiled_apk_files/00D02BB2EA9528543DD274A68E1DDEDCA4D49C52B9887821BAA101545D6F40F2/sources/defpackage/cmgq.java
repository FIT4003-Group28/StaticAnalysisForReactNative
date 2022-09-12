package defpackage;
/* compiled from: PG */
/* renamed from: cmgq  reason: default package */
/* loaded from: classes5.dex */
final class cmgq extends cmgd implements Comparable<cmgq> {
    public long g;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cmgq cmgqVar) {
        cmgq cmgqVar2 = cmgqVar;
        if (isEndOfStream() != cmgqVar2.isEndOfStream()) {
            return !isEndOfStream() ? -1 : 1;
        }
        long j = this.d - cmgqVar2.d;
        if (j == 0) {
            j = this.g - cmgqVar2.g;
            if (j == 0) {
                return 0;
            }
        }
        return j <= 0 ? -1 : 1;
    }
}
