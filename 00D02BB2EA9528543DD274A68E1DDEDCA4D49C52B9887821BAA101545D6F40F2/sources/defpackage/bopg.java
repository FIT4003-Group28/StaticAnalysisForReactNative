package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bopg  reason: default package */
/* loaded from: classes3.dex */
public class bopg extends iwf {
    final /* synthetic */ bopi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bopg(bopi bopiVar, Context context, cqsn cqsnVar, ddho ddhoVar) {
        super(context, cqsnVar, ddhoVar);
        this.a = bopiVar;
    }

    @Override // defpackage.iwf, defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        bopl boplVar = this.a.f;
        if (boplVar != null) {
            boplVar.j(b().booleanValue());
        }
        return super.f(cjqmVar);
    }
}
