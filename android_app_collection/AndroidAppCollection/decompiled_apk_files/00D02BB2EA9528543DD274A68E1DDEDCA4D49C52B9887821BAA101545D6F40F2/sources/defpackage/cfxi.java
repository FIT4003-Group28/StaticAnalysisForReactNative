package defpackage;
/* compiled from: PG */
/* renamed from: cfxi  reason: default package */
/* loaded from: classes4.dex */
public class cfxi implements cfxh {
    private final Runnable a;

    public cfxi(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.cfxh
    public cqkl a() {
        this.a.run();
        return cqkl.a;
    }
}
