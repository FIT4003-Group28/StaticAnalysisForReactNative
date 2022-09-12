package defpackage;
/* compiled from: PG */
/* renamed from: ayxk  reason: default package */
/* loaded from: classes3.dex */
public class ayxk implements ayxi {
    private final ache a;
    private final Runnable b;

    public ayxk(ache acheVar, Runnable runnable) {
        this.a = acheVar;
        this.b = runnable;
    }

    @Override // defpackage.ayxi
    public cqkl a() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.ayxi
    public cqkl b() {
        this.a.q("save_places_to_lists_android");
        return cqkl.a;
    }
}
