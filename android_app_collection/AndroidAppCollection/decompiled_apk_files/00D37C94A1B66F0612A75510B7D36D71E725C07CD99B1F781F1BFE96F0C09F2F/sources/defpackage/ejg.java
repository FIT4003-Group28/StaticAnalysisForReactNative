package defpackage;
/* compiled from: PG */
/* renamed from: ejg  reason: default package */
/* loaded from: classes3.dex */
public final class ejg extends ajwd {
    private final ajsm a;

    public ejg(ajyi ajyiVar, apuj apujVar) {
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        if (b(apujVar) != null) {
            ajyiVar.a(apul.class);
            ajsmVar.add(b(apujVar));
            return;
        }
        ajyiVar.a(apuj.class);
        ajsmVar.add(apujVar);
    }

    private static apul b(apuj apujVar) {
        apun apunVar = apujVar.c;
        if (apunVar == null) {
            apunVar = apun.a;
        }
        if ((apunVar.b & 4) != 0) {
            apun apunVar2 = apujVar.c;
            if (apunVar2 == null) {
                apunVar2 = apun.a;
            }
            apul apulVar = apunVar2.c;
            return apulVar == null ? apul.a : apulVar;
        }
        return null;
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.a;
    }
}
