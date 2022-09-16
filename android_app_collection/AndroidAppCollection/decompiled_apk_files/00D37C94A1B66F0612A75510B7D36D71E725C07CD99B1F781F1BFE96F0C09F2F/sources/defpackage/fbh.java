package defpackage;

import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: fbh  reason: default package */
/* loaded from: classes3.dex */
public final class fbh {
    public static final amup a = amup.k(fbg.a, eoo.d);
    public final snc b;
    private final aahf c;
    private final afvn d;

    public fbh(aahf aahfVar, afvn afvnVar, snc sncVar) {
        this.c = aahfVar;
        this.d = afvnVar;
        this.b = sncVar;
    }

    public final ayoc a(final fbg fbgVar) {
        if (!a.containsKey(fbgVar)) {
            return ayoc.p();
        }
        return this.c.a(this.d.c()).f(emn.n(aqqn.b, "")).g(aqqm.class).w(new ayqe() { // from class: fbe
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                Function function = (Function) fbh.a.get(fbg.this);
                function.getClass();
                return (aqpe) function.apply((aqqm) obj);
            }
        }).r(new ayqf() { // from class: fbf
            @Override // defpackage.ayqf
            public final boolean a(Object obj) {
                return fbh.this.b.c() < ((aqpe) obj).b;
            }
        });
    }
}
