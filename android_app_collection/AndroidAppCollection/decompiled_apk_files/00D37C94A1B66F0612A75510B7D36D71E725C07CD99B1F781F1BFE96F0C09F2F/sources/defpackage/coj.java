package defpackage;
/* compiled from: PG */
/* renamed from: coj  reason: default package */
/* loaded from: classes2.dex */
public final class coj implements cnq {
    public static final cib a = cib.c("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final cno b;

    public coj() {
        this(null);
    }

    public coj(cno cnoVar) {
        this.b = cnoVar;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        cnf cnfVar = (cnf) obj;
        cno cnoVar = this.b;
        cnn b = cnn.b(cnfVar);
        Object f = cnoVar.a.f(b);
        b.a();
        cnf cnfVar2 = (cnf) f;
        if (cnfVar2 == null) {
            cno cnoVar2 = this.b;
            cnoVar2.a.g(cnn.b(cnfVar), cnfVar);
        } else {
            cnfVar = cnfVar2;
        }
        return new cnp(cnfVar, new ciu(cnfVar, ((Integer) cicVar.b(a)).intValue()));
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        cnf cnfVar = (cnf) obj;
        return true;
    }
}
