package defpackage;
/* compiled from: PG */
/* renamed from: ckhf  reason: default package */
/* loaded from: classes.dex */
public final class ckhf extends ckhb<ckhe> {
    ckhe a;
    private final cnkc d;

    public ckhf(String str, ckgy ckgyVar) {
        this(str, ckgyVar, ckde.a);
    }

    @Override // defpackage.ckhb
    /* renamed from: b */
    public final synchronized ckhe a(ckcs ckcsVar) {
        if (this.a == null) {
            this.a = new ckhe(ckcsVar.c(this.b, this.d));
        }
        return this.a;
    }

    public ckhf(String str, ckgy ckgyVar, cnkc cnkcVar) {
        super(str, ckgyVar);
        this.a = null;
        this.d = cnkcVar;
    }
}
