package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvh  reason: default package */
/* loaded from: classes3.dex */
public final class cvh implements jk {
    private final cvg a;
    private final cvj b;
    private final jk c;

    public cvh(jk jkVar, cvg cvgVar, cvj cvjVar) {
        this.c = jkVar;
        this.a = cvgVar;
        this.b = cvjVar;
    }

    @Override // defpackage.jk
    public final Object a() {
        Object a = this.c.a();
        if (a == null) {
            a = this.a.a();
        }
        if (a instanceof cvi) {
            ((cvi) a).jX().a = false;
        }
        return a;
    }

    @Override // defpackage.jk
    public final boolean b(Object obj) {
        if (obj instanceof cvi) {
            ((cvi) obj).jX().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
