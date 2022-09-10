package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqas  reason: default package */
/* loaded from: classes4.dex */
public class bqas extends ivw {
    public boolean c;
    private final jaq d;
    private final jaq e;
    private final Runnable f;

    public bqas(Context context, jaq jaqVar, jaq jaqVar2, cqtd cqtdVar, String str, @dzsi cjtd cjtdVar, Runnable runnable) {
        super(context, ivu.FIXED, jaqVar2, cqtdVar, str, cjtdVar, true, 0, ivv.MEDIUM);
        this.c = false;
        this.d = jaqVar;
        this.e = jaqVar2;
        this.f = runnable;
    }

    @Override // defpackage.ivw
    protected final boolean NE() {
        return false;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        this.f.run();
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        D(o().booleanValue() ? this.d : this.e);
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean o() {
        return Boolean.valueOf(this.c);
    }
}
