package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ozt  reason: default package */
/* loaded from: classes7.dex */
class ozt extends yye {
    final /* synthetic */ dthb a;
    final /* synthetic */ cjzt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozt(Context context, djyo djyoVar, cjtd cjtdVar, dthb dthbVar, cjzt cjztVar) {
        super(context, djyoVar, cjtdVar);
        this.a = dthbVar;
        this.b = cjztVar;
    }

    @Override // defpackage.yyb
    public cqkl a(cjqm cjqmVar) {
        dthb dthbVar = this.a;
        if (dthbVar != null) {
            cjzt cjztVar = this.b;
            cjztVar.c.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }
}
