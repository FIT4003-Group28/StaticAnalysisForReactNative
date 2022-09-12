package defpackage;

import java.lang.Comparable;
/* compiled from: PG */
/* renamed from: anie  reason: default package */
/* loaded from: classes2.dex */
public final class anie<T extends Comparable<? super T>> implements Comparable<anie<T>> {
    public final T a;
    private final long b;

    public anie(T t, long j) {
        this.a = t;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        anie anieVar = (anie) obj;
        return dbzx.b.d(this.b, anieVar.b).a(this.a, anieVar.a).i();
    }
}
