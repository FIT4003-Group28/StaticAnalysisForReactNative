package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: agvf  reason: default package */
/* loaded from: classes.dex */
public final class agvf extends aars {
    private final afvn a;
    private final String b;
    private final agvd c;

    public agvf(Context context, aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        afvnVar.getClass();
        this.a = afvnVar;
        String A = zew.A(context);
        zgh.m(A);
        this.b = A;
        this.c = new agvd(this, aaqjVar);
    }

    public final agve a() {
        agve agveVar = new agve(this.e, this.a.c());
        agveVar.k = this.b;
        return agveVar;
    }

    public final arzh b(agve agveVar) {
        return (arzh) this.c.d(agveVar);
    }
}
