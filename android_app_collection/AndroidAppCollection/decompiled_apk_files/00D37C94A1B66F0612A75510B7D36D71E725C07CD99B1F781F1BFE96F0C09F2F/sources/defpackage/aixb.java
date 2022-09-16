package defpackage;
/* compiled from: PG */
/* renamed from: aixb  reason: default package */
/* loaded from: classes.dex */
public final class aixb implements Comparable {
    public final int a;

    public aixb(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((aixb) obj).a;
    }
}
