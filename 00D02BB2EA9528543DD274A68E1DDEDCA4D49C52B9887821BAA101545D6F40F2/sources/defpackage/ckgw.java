package defpackage;
/* compiled from: PG */
/* renamed from: ckgw  reason: default package */
/* loaded from: classes.dex */
public final class ckgw extends ckhb<ckgv> {
    ckgv a;
    private final cnkc d;

    public ckgw(String str, ckgy ckgyVar) {
        this(str, ckgyVar, ckde.a);
    }

    @Override // defpackage.ckhb
    /* renamed from: b */
    public final synchronized ckgv a(ckcs ckcsVar) {
        if (this.a == null) {
            this.a = new ckgv(ckcsVar.b(this.b, this.d), ckhh.a);
        }
        return this.a;
    }

    public ckgw(String str, ckgy ckgyVar, cnkc cnkcVar) {
        super(str, ckgyVar);
        this.a = null;
        this.d = cnkcVar;
    }
}
