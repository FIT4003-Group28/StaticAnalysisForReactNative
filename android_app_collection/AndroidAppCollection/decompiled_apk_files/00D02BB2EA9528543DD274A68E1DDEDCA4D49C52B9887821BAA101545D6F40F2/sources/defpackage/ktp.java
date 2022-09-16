package defpackage;
/* compiled from: PG */
/* renamed from: ktp  reason: default package */
/* loaded from: classes7.dex */
public final class ktp implements kto {
    private CharSequence a = "";
    private boolean b;

    @Override // defpackage.kto
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.kto
    public void b(CharSequence charSequence) {
        this.a = charSequence;
        cqkx.p(this);
    }

    @Override // defpackage.kto
    public Boolean c() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.kto
    public void d(boolean z) {
        this.b = z;
        cqkx.p(this);
    }
}
