package defpackage;
/* compiled from: PG */
/* renamed from: aoql  reason: default package */
/* loaded from: classes.dex */
final class aoql implements aoqs {
    private final aoqs[] a;

    public aoql(aoqs... aoqsVarArr) {
        this.a = aoqsVarArr;
    }

    @Override // defpackage.aoqs
    public final aoqr a(Class cls) {
        aoqs[] aoqsVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            aoqs aoqsVar = aoqsVarArr[i];
            if (aoqsVar.b(cls)) {
                return aoqsVar.a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    @Override // defpackage.aoqs
    public final boolean b(Class cls) {
        aoqs[] aoqsVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (aoqsVarArr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
