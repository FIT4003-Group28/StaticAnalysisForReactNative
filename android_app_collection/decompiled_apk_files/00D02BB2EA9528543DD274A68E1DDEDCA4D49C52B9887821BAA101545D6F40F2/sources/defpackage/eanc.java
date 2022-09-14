package defpackage;
/* compiled from: PG */
/* renamed from: eanc  reason: default package */
/* loaded from: classes6.dex */
public abstract class eanc extends eams {
    protected final int b;
    protected eang d = new eang(0, null);
    protected final boolean c = t(eamr.WRITE_NUMBERS_AS_STRINGS);

    /* JADX INFO: Access modifiers changed from: protected */
    public eanc(int i) {
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void u() {
        throw new RuntimeException("Internal error: should never end up through this code path");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void v(String str) {
        throw new eamq(str);
    }

    @Override // defpackage.eams
    public void a() {
        throw null;
    }

    @Override // defpackage.eams
    public void b() {
        throw null;
    }

    @Override // defpackage.eams
    public void c() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.eams
    public void d() {
        throw null;
    }

    @Override // defpackage.eams
    public final void r() {
        this.a = new eaoh();
    }

    public final boolean t(eamr eamrVar) {
        return (eamrVar.i & this.b) != 0;
    }
}
