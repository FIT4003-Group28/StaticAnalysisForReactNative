package defpackage;
/* compiled from: PG */
/* renamed from: crko  reason: default package */
/* loaded from: classes5.dex */
final class crko implements Comparable<crko> {
    public final dpdf a;
    public final int b;

    public crko(dpdf dpdfVar, int i) {
        this.a = dpdfVar;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(crko crkoVar) {
        return this.b - crkoVar.b;
    }
}
