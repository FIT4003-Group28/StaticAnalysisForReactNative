package defpackage;
/* compiled from: PG */
/* renamed from: aczs  reason: default package */
/* loaded from: classes.dex */
public abstract class aczs implements aczr {
    private int a = -1;

    @Override // defpackage.aczr
    public Integer d() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.aczr
    public void i(int i) {
        this.a = i;
    }
}
