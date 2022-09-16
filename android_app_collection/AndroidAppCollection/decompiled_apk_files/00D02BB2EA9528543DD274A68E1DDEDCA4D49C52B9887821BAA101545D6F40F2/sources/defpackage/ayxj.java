package defpackage;
/* compiled from: PG */
/* renamed from: ayxj  reason: default package */
/* loaded from: classes3.dex */
public class ayxj implements ayxh {
    private final Runnable a;

    public ayxj(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.ayxh
    public cqkl a() {
        this.a.run();
        return cqkl.a;
    }
}
