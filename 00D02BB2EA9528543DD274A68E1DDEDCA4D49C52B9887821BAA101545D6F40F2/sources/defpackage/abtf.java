package defpackage;
/* compiled from: PG */
/* renamed from: abtf  reason: default package */
/* loaded from: classes2.dex */
public class abtf implements absp {
    private final cqix<? extends cqkp> a;
    private boolean b;
    private final Boolean c;

    public <T extends cqkp> abtf(cqiw<T> cqiwVar, T t, Boolean bool) {
        this.a = cqgr.fT(cqiwVar, t);
        this.c = bool;
    }

    @Override // defpackage.absp
    public final boolean a(boolean z) {
        boolean z2 = this.b;
        this.b = z;
        return z2;
    }

    @Override // defpackage.absp
    public cqix<? extends cqkp> b() {
        return this.a;
    }

    @Override // defpackage.absp
    public Boolean c() {
        return this.c;
    }
}
