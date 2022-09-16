package defpackage;
/* compiled from: PG */
/* renamed from: rxv  reason: default package */
/* loaded from: classes4.dex */
public final class rxv extends Exception {
    public final int a;

    public rxv(int i, String str) {
        this(i, str, null);
    }

    public rxv(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
