package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aaun  reason: default package */
/* loaded from: classes.dex */
public final class aaun extends aars implements aari {
    public final afvn a;
    public final aaqj b;

    public aaun(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        this.b = aaqjVar;
    }

    @Override // defpackage.aari
    public final aaqs a(ajfz ajfzVar) {
        aauq aauqVar = new aauq(this.e, this.a.c());
        aauqVar.a = ajfzVar.b();
        return aauqVar;
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        new aauk(this).j((aauq) aaqsVar, aarhVar, afzfVar);
    }

    @Deprecated
    public final void d(String str, List list, afzf afzfVar, boolean z) {
        aaut aautVar = new aaut(this.e, this.a.c());
        aautVar.a = str;
        aautVar.b = list;
        aautVar.j = z;
        aautVar.d = 2;
        new aaum(this).i(aautVar, afzfVar);
    }
}
