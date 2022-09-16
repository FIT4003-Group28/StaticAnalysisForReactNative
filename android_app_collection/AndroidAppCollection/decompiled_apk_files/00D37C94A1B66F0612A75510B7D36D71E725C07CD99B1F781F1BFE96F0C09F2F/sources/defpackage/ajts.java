package defpackage;
/* compiled from: PG */
/* renamed from: ajts  reason: default package */
/* loaded from: classes.dex */
public abstract class ajts extends ajtq implements ajtj {
    public ajti a;

    protected abstract boolean c();

    protected abstract boolean d(ajtg ajtgVar);

    @Override // defpackage.ajtj
    public final boolean e(ajti ajtiVar) {
        this.a = ajtiVar;
        return c();
    }

    @Override // defpackage.ajtj
    public final boolean f(ajtg ajtgVar) {
        boolean d = d(ajtgVar);
        if (d) {
            this.a = this.a.b(ajtgVar);
        }
        return d;
    }
}
