package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afxj  reason: default package */
/* loaded from: classes.dex */
public class afxj implements afyf {
    public final afts a;
    public final Executor b;
    private final afyf c;
    private final aftr d;

    /* JADX INFO: Access modifiers changed from: protected */
    public afxj(aftr aftrVar, afts aftsVar) {
        this.c = null;
        this.d = aftrVar;
        this.a = aftsVar;
        this.b = null;
    }

    public afxj(afyf afyfVar, afts aftsVar, Executor executor) {
        this.c = afyfVar;
        this.d = null;
        this.a = aftsVar;
        this.b = executor;
    }

    @Override // defpackage.afyf
    public final void a(Object obj, yiw yiwVar) {
        try {
            aftr aftrVar = this.d;
            Object c = aftrVar != null ? aftrVar.c(obj) : obj;
            b(c, new afxi(this, obj, c, yiwVar));
        } catch (zhy e) {
            c(obj, null, yiwVar, e);
        }
    }

    protected void b(Object obj, yiw yiwVar) {
        afyf afyfVar = this.c;
        afyfVar.getClass();
        afyfVar.a(obj, yiwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(Object obj, Object obj2, yiw yiwVar, Exception exc) {
        yiwVar.a(obj, exc);
    }
}
