package defpackage;
/* compiled from: PG */
/* renamed from: aqrt  reason: default package */
/* loaded from: classes2.dex */
public final class aqrt implements Runnable {
    private final apyz a;
    private final String b;

    public aqrt(apyz apyzVar, String str) {
        this.a = apyzVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b);
    }
}
