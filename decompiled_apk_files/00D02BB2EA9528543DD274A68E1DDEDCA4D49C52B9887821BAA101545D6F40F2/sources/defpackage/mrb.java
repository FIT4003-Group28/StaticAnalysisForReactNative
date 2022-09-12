package defpackage;
/* compiled from: PG */
/* renamed from: mrb  reason: default package */
/* loaded from: classes7.dex */
public class mrb implements mqz {
    private final Runnable a;
    private final ldm b;
    private final int c;

    public mrb(ldm ldmVar, int i, Runnable runnable) {
        this.b = ldmVar;
        this.a = runnable;
        this.c = i;
    }

    @Override // defpackage.mqz
    @dzsi
    public CharSequence a() {
        return this.b.b;
    }

    @Override // defpackage.mqz
    public cqtd b() {
        return nqu.az(this.c + 1);
    }

    @Override // defpackage.mqz
    public cqkl c() {
        this.a.run();
        return cqkl.a;
    }
}
