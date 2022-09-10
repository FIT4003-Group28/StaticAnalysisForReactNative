package defpackage;
/* compiled from: PG */
/* renamed from: abtl  reason: default package */
/* loaded from: classes2.dex */
public class abtl implements abjp {
    private final acwt a;
    private final abwj b;
    @dzsi
    private dviz c = null;

    public abtl(acwt acwtVar, abwj abwjVar) {
        this.a = acwtVar;
        this.b = abwjVar;
    }

    @Override // defpackage.abjp
    public void a(@dzsi dviz dvizVar) {
        if (dvizVar == null || (dvizVar.a & 4) == 0) {
            return;
        }
        djrs djrsVar = dvizVar.d;
        if (djrsVar == null) {
            djrsVar = djrs.g;
        }
        if (djrsVar.a.isEmpty()) {
            return;
        }
        dviz dvizVar2 = this.c;
        if (dvizVar2 != null && dvizVar2.equals(dvizVar)) {
            return;
        }
        this.c = dvizVar;
        abwj abwjVar = this.b;
        djrs djrsVar2 = dvizVar.d;
        if (djrsVar2 == null) {
            djrsVar2 = djrs.g;
        }
        abwjVar.a(djrsVar2.a.get(0), this.a, dtxj.co, absg.AREA_EXPLORE);
    }
}
