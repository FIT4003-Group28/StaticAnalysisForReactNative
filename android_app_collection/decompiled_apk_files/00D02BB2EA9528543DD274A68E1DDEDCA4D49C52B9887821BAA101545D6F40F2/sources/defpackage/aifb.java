package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aifb  reason: default package */
/* loaded from: classes2.dex */
public final class aifb {
    private final aigf a;
    private final cqat b;
    private final akty c;

    public aifb(aigf aigfVar, cqat cqatVar, akox akoxVar) {
        this.a = aigfVar;
        this.b = cqatVar;
        this.c = akoxVar.aj().aC();
    }

    public final aifa a(dmpn dmpnVar, aifq aifqVar, List<aify> list, @dzsi Runnable runnable) {
        return c(dmpnVar, aifqVar, list, null, runnable);
    }

    public final aifa b(dmpn dmpnVar, aifq aifqVar, List<akuh> list, akvx akvxVar, List<aify> list2, @dzsi Runnable runnable) {
        return c(dmpnVar, aifqVar, list2, new aieo(list, akvxVar), runnable);
    }

    public final aifa c(dmpn dmpnVar, aifq aifqVar, List<aify> list, @dzsi aifj aifjVar, @dzsi Runnable runnable) {
        dbsk.m(list.size() >= aifqVar.f().size(), "Missing secondary renderable?");
        return new aifk(this.a, this.b, this.c, dmpnVar, aifqVar, list, aifjVar, runnable);
    }
}
