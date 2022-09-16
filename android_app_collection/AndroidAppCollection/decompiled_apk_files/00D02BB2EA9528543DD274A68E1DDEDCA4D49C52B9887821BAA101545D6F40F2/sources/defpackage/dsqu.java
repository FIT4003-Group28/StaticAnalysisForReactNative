package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsqu  reason: default package */
/* loaded from: classes.dex */
public final class dsqu implements Comparable {
    final dsrc<?> a;
    final int b;
    final dsur c;
    final boolean d;
    final boolean e;

    public dsqu(dsrc<?> dsrcVar, int i, dsur dsurVar, boolean z, boolean z2) {
        this.a = dsrcVar;
        this.b = i;
        this.c = dsurVar;
        this.d = z;
        this.e = z2;
    }

    public final dsus a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((dsqu) obj).b;
    }
}
