package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kmn  reason: default package */
/* loaded from: classes3.dex */
public abstract class kmn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static kmn b(boolean z, avch avchVar) {
        return c(z, avchVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kmn c(boolean z, avch avchVar, int i) {
        return new kmo(z, avchVar, i);
    }

    public abstract int a();

    public abstract avch d();

    public abstract boolean e();
}
