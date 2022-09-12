package defpackage;
/* compiled from: PG */
/* renamed from: cpqe  reason: default package */
/* loaded from: classes5.dex */
public final class cpqe implements cppx {
    private final int a;

    public cpqe(int i) {
        cpwl.c(i >= 0, "Margins can not be negative");
        this.a = i;
    }

    @Override // defpackage.cppx
    public final int a(int i) {
        return Math.min(this.a, i);
    }
}
