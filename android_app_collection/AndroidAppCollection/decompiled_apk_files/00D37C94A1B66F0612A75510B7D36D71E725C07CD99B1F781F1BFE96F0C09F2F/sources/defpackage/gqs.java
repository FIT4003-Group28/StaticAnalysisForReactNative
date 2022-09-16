package defpackage;

import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
/* compiled from: PG */
/* renamed from: gqs  reason: default package */
/* loaded from: classes3.dex */
public final class gqs extends cyr {
    @dfs(a = 13)
    public grk a;
    @dfs(a = 3)
    public boolean b;
    @dfs(a = 13)
    public aihr c;
    @dfs(a = 3)
    public long d;
    @dfs(a = 3)
    public long e;

    public gqs() {
        super("ClipScrubber");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        aihr aihrVar = this.c;
        long j = this.d;
        long j2 = this.e;
        grk grkVar = this.a;
        boolean z = this.b;
        cyk a = cyl.a(cyvVar);
        gqv gqvVar = new gqv();
        gqv.c(gqvVar, cyvVar, new gqw());
        gqvVar.a.a = grkVar;
        gqvVar.d.set(0);
        gqvVar.a.b = z;
        gqvVar.d.set(1);
        gqvVar.I(16.0f);
        a.l(gqvVar.n(YogaEdge.BOTTOM, 20.0f));
        ddf a2 = ddg.a(cyvVar);
        gqt gqtVar = new gqt();
        gqt.c(gqtVar, cyvVar, new gqu());
        gqtVar.a.b = aihrVar;
        gqtVar.d.set(2);
        gqtVar.a.a = z;
        gqtVar.d.set(0);
        gqtVar.S(100.0f);
        gqtVar.I(66.0f);
        gqtVar.a.d = j;
        gqtVar.d.set(4);
        gqtVar.a.e = grkVar;
        gqtVar.d.set(1);
        gqtVar.a.c = j2;
        gqtVar.d.set(3);
        a2.j(gqtVar);
        gql gqlVar = new gql();
        gql.c(gqlVar, cyvVar, new gqm());
        gqlVar.a.a = grkVar;
        gqlVar.d.set(0);
        gqlVar.a.b = z;
        gqlVar.d.set(1);
        gqlVar.S(100.0f);
        gqlVar.J(100.0f);
        gqlVar.O(YogaPositionType.ABSOLUTE);
        gqlVar.P(YogaEdge.ALL, 10.0f);
        a2.j(gqlVar);
        gqp gqpVar = new gqp();
        gqp.c(gqpVar, cyvVar, new gqq());
        gqpVar.a.a = grkVar;
        gqpVar.d.set(0);
        gqpVar.a.b = z;
        gqpVar.d.set(1);
        gqpVar.S(100.0f);
        gqpVar.J(100.0f);
        gqpVar.O(YogaPositionType.ABSOLUTE);
        a2.j(gqpVar);
        a.l(a2);
        gqn gqnVar = new gqn();
        gqn.c(gqnVar, cyvVar, new gqo());
        gqnVar.a.a = grkVar;
        gqnVar.d.set(0);
        gqnVar.I(16.0f);
        cyp cypVar = (gqn) gqnVar.n(YogaEdge.TOP, 20.0f);
        cypVar.S(100.0f);
        a.l(cypVar);
        return ((cyk) ((cyk) a.n(YogaEdge.BOTTOM, 12.0f)).n(YogaEdge.TOP, 12.0f)).a;
    }
}
