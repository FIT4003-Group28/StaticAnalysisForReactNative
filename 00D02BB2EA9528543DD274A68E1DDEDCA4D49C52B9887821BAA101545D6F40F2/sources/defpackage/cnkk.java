package defpackage;
/* compiled from: PG */
/* renamed from: cnkk  reason: default package */
/* loaded from: classes.dex */
public final class cnkk implements Comparable<cnkk> {
    public final byte[] a;

    public cnkk() {
        this(null);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cnkk cnkkVar) {
        return cnkr.f.compare(this.a, cnkkVar.a);
    }

    public final String toString() {
        return new String(this.a, cnkr.b);
    }

    public cnkk(byte[] bArr) {
        this.a = bArr == null ? cnkr.c : bArr;
    }
}
