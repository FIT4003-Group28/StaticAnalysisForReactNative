package defpackage;
/* compiled from: PG */
/* renamed from: scc  reason: default package */
/* loaded from: classes4.dex */
public final class scc {
    private final int a;

    public scc(int i) {
        sho.a(i >= 0, "Margins can not be negative");
        this.a = i;
    }

    public final int a(int i) {
        return Math.min(this.a, i);
    }
}
