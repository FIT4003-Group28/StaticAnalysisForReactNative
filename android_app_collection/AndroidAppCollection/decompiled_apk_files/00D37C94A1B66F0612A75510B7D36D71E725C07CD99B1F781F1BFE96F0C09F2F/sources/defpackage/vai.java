package defpackage;
/* compiled from: PG */
/* renamed from: vai  reason: default package */
/* loaded from: classes4.dex */
final class vai extends val {
    private final boolean a;

    public vai(baaw baawVar, boolean z) {
        super(baawVar);
        this.a = z;
    }

    private final baaw f(Long l) {
        if (this.a) {
            return e(l);
        }
        return d();
    }

    @Override // defpackage.val
    public final long a(String str) {
        baaw f = f(null);
        if (f.equals(baaw.a)) {
            return 1000L;
        }
        return f.c;
    }

    @Override // defpackage.val
    public final baaw b(Long l) {
        return f(l);
    }

    @Override // defpackage.val
    public final boolean c() {
        return this.a;
    }
}
