package defpackage;
/* compiled from: PG */
/* renamed from: citc  reason: default package */
/* loaded from: classes4.dex */
public class citc implements citb {
    private final Runnable a;

    public citc(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.citb
    public cqkl a() {
        this.a.run();
        return cqkl.a;
    }

    public boolean equals(@dzsi Object obj) {
        return obj instanceof citc;
    }

    public int hashCode() {
        return citb.class.hashCode();
    }
}
