package defpackage;
/* compiled from: PG */
/* renamed from: kpd  reason: default package */
/* loaded from: classes7.dex */
public class kpd implements kpc {
    private final Runnable a;

    public kpd(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.kpc
    public cqkl a() {
        this.a.run();
        return cqkl.a;
    }
}
