package defpackage;
/* compiled from: PG */
/* renamed from: dsrz  reason: default package */
/* loaded from: classes.dex */
final class dsrz implements dssh {
    private final dssh[] a;

    public dsrz(dssh... dsshVarArr) {
        this.a = dsshVarArr;
    }

    @Override // defpackage.dssh
    public final boolean a(Class<?> cls) {
        dssh[] dsshVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (dsshVarArr[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dssh
    public final dssg b(Class<?> cls) {
        dssh[] dsshVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            dssh dsshVar = dsshVarArr[i];
            if (dsshVar.a(cls)) {
                return dsshVar.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
