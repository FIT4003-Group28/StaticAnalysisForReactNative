package defpackage;
/* compiled from: PG */
/* renamed from: wuz  reason: default package */
/* loaded from: classes7.dex */
public abstract class wuz implements Comparable<wuz> {
    public abstract long a();

    public abstract akqi b();

    public abstract dvvo c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(wuz wuzVar) {
        return (a() > wuzVar.a() ? 1 : (a() == wuzVar.a() ? 0 : -1));
    }

    public abstract String d();
}
