package defpackage;
/* compiled from: PG */
/* renamed from: td  reason: default package */
/* loaded from: classes7.dex */
final class td extends tp {
    final /* synthetic */ tf a;

    public td(tf tfVar) {
        this.a = tfVar;
    }

    @Override // defpackage.tp
    public final int a() {
        return this.a.a.size();
    }

    @Override // defpackage.tp
    public final int b() {
        return this.a.b.size();
    }

    @Override // defpackage.tp
    public final boolean c(int i, int i2) {
        Object obj = this.a.a.get(i);
        Object obj2 = this.a.b.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return this.a.d.b.b.a(obj, obj2);
    }

    @Override // defpackage.tp
    public final boolean d(int i, int i2) {
        Object obj = this.a.a.get(i);
        Object obj2 = this.a.b.get(i2);
        if (obj == null || obj2 == null) {
            if (obj != null || obj2 != null) {
                throw new AssertionError();
            }
            return true;
        }
        return this.a.d.b.b.b(obj, obj2);
    }

    @Override // defpackage.tp
    public final Object e(int i, int i2) {
        Object obj = this.a.a.get(i);
        Object obj2 = this.a.b.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return this.a.d.b.b.c(obj, obj2);
    }
}
