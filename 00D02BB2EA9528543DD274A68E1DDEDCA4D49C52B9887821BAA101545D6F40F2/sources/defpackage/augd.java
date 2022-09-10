package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: augd  reason: default package */
/* loaded from: classes2.dex */
public final class augd implements augg {
    private final cjsu a;
    private final dcdn<auoc, Integer> b;

    public augd(cjsu cjsuVar, dcdn<auoc, Integer> dcdnVar) {
        this.a = cjsuVar;
        this.b = dcdnVar;
    }

    @dzsi
    private final cjtd g() {
        return this.a.f(0);
    }

    @dzsi
    private final cjtd h(aufx aufxVar) {
        return this.a.f(aufxVar.d);
    }

    @dzsi
    private final cjtd i(auoc auocVar) {
        Integer num = this.b.get(auocVar);
        if (num != null) {
            return this.a.f(num.intValue());
        }
        return null;
    }

    @dzsi
    private static String j(@dzsi cjtd cjtdVar) {
        if (cjtdVar != null) {
            return cjtdVar.e;
        }
        return null;
    }

    @dzsi
    private static String k(@dzsi cjtd cjtdVar) {
        if (cjtdVar != null) {
            return cjtdVar.d;
        }
        return null;
    }

    @Override // defpackage.augg
    @dzsi
    public final String a() {
        return j(g());
    }

    @Override // defpackage.augg
    @dzsi
    public final String b() {
        return k(g());
    }

    @Override // defpackage.augg
    @dzsi
    public final String c(aufx aufxVar) {
        return j(h(aufxVar));
    }

    @Override // defpackage.augg
    @dzsi
    public final String d(augf augfVar, aufx aufxVar) {
        return k(h(aufxVar));
    }

    @Override // defpackage.augg
    @dzsi
    public final String e(auoc auocVar) {
        return j(i(auocVar));
    }

    @Override // defpackage.augg
    @dzsi
    public final String f(auoc auocVar) {
        return k(i(auocVar));
    }
}
