package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class d6 implements l6 {

    /* renamed from: a  reason: collision with root package name */
    private l6[] f4103a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6(l6... l6VarArr) {
        this.f4103a = l6VarArr;
    }

    @Override // c.e.a.b.d.g.l6
    public final boolean a(Class<?> cls) {
        for (l6 l6Var : this.f4103a) {
            if (l6Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.e.a.b.d.g.l6
    public final i6 b(Class<?> cls) {
        l6[] l6VarArr;
        for (l6 l6Var : this.f4103a) {
            if (l6Var.a(cls)) {
                return l6Var.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
