package defpackage;
/* compiled from: PG */
/* renamed from: wva  reason: default package */
/* loaded from: classes7.dex */
abstract class wva implements Comparable<wva> {
    public abstract long a();

    public abstract dopk b();

    public abstract qdv c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(wva wvaVar) {
        return (a() > wvaVar.a() ? 1 : (a() == wvaVar.a() ? 0 : -1));
    }
}
