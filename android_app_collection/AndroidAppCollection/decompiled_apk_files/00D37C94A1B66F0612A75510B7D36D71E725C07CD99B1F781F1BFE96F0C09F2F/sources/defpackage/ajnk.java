package defpackage;
/* compiled from: PG */
/* renamed from: ajnk  reason: default package */
/* loaded from: classes.dex */
public final class ajnk implements axou {
    private final /* synthetic */ int a;

    public ajnk() {
    }

    public ajnk(int i) {
        this.a = i;
    }

    public static ajmu a() {
        ajmu ajmuVar = ajmu.a;
        axzl.o(ajmuVar);
        return ajmuVar;
    }

    public static ajbj b() {
        return new ajbj();
    }

    public static akqo c() {
        return new akqo();
    }

    public static akto d() {
        return new akto();
    }

    public static arey e() {
        return new arey();
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return b();
            }
            return i != 2 ? i != 3 ? d() : e() : c();
        }
        return a();
    }
}
