package defpackage;
/* compiled from: PG */
/* renamed from: cfoc  reason: default package */
/* loaded from: classes4.dex */
public class cfoc implements cfnt {
    private final CharSequence a;
    private final Runnable b;

    public cfoc(CharSequence charSequence, Runnable runnable, cqhn cqhnVar) {
        this.a = charSequence;
        this.b = runnable;
    }

    @Override // defpackage.cfnt
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.cfnt
    public cqkl b() {
        this.b.run();
        cqkx.p(this);
        return cqkl.a;
    }
}
