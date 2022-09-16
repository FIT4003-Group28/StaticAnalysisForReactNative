package defpackage;
/* compiled from: PG */
/* renamed from: azvy  reason: default package */
/* loaded from: classes2.dex */
public abstract class azvy extends azur {
    /* JADX INFO: Access modifiers changed from: protected */
    public final String e() {
        azvy azvyVar;
        azur azurVar = azvd.a;
        azvy a = azvd.a();
        if (this == a) {
            return "Dispatchers.Main";
        }
        try {
            azvyVar = a.f();
        } catch (UnsupportedOperationException unused) {
            azvyVar = null;
        }
        if (this != azvyVar) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    public abstract azvy f();

    @Override // defpackage.azur
    public String toString() {
        String e = e();
        if (e == null) {
            return banl.j(this) + '@' + banl.k(this);
        }
        return e;
    }
}
