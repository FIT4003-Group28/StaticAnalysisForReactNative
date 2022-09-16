package defpackage;
/* compiled from: PG */
/* renamed from: rcv  reason: default package */
/* loaded from: classes4.dex */
public final class rcv extends Exception {
    public final int a;

    public rcv(int i, String str) {
        super(str);
        this.a = i;
    }

    public rcv(int i, Throwable th) {
        super(th);
        this.a = i;
    }
}
