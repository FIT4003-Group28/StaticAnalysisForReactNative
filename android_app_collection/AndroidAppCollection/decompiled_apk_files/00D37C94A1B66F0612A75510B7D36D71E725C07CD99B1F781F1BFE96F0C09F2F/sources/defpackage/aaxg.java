package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aaxg  reason: default package */
/* loaded from: classes.dex */
public final class aaxg extends aars {
    public final aaoq a;
    private final aarl b;

    public aaxg(aaqj aaqjVar, aaqf aaqfVar, yqw yqwVar, aaoq aaoqVar) {
        super(aaqfVar, yqwVar);
        this.a = aaoqVar;
        this.b = c(asgd.a, aaqjVar, aaxa.d, aawo.l);
    }

    public final aaxf a() {
        return new aaxf(this.e);
    }

    public final ankt b(aaxf aaxfVar, Executor executor) {
        return anii.h(this.b.b(aaxfVar, executor), new ampg() { // from class: aaxe
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                asgd asgdVar = (asgd) obj;
                aaxg.this.a.a(asgdVar);
                return asgdVar;
            }
        }, anjk.a);
    }
}
