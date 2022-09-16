package defpackage;
/* compiled from: PG */
/* renamed from: bvn  reason: default package */
/* loaded from: classes2.dex */
public final class bvn implements Runnable {
    private final brq a;
    private final String b;
    private final aed c;

    public bvn(brq brqVar, String str, aed aedVar, byte[] bArr) {
        this.a = brqVar;
        this.b = str;
        this.c = aedVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f.g(this.b);
    }
}
