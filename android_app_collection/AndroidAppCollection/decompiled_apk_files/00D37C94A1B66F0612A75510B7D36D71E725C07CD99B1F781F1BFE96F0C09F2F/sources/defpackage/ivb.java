package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ivb  reason: default package */
/* loaded from: classes3.dex */
final class ivb implements ajry {
    final /* synthetic */ ivc a;

    public ivb(ivc ivcVar) {
        this.a = ivcVar;
    }

    @Override // defpackage.ajry
    public final ajru b(ViewGroup viewGroup) {
        ivc ivcVar = this.a;
        iuy iuyVar = ivcVar.a;
        Context context = (Context) iuyVar.a.get();
        context.getClass();
        aafo aafoVar = (aafo) iuyVar.b.get();
        aafoVar.getClass();
        return new abma(context, aafoVar, iuyVar.c, ivcVar);
    }
}
