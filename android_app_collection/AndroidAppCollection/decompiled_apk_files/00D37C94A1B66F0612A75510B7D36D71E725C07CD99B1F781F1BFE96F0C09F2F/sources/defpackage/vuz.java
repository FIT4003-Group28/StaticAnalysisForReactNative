package defpackage;
/* compiled from: PG */
/* renamed from: vuz  reason: default package */
/* loaded from: classes4.dex */
public final class vuz extends Exception {
    public vuz(String str, Object... objArr) {
        super(String.format(str, objArr));
    }

    public vuz(Throwable th) {
        super(th);
    }
}
