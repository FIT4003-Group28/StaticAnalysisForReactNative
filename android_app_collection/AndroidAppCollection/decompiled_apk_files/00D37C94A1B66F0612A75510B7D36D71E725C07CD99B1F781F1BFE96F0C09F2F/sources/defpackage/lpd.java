package defpackage;
/* compiled from: PG */
/* renamed from: lpd  reason: default package */
/* loaded from: classes3.dex */
final class lpd implements akad {
    private static final ampt a = jny.l;

    @Override // defpackage.akad
    public final /* bridge */ /* synthetic */ void b(Object obj, akac akacVar) {
        aquj aqujVar = ((aslt) obj).ab;
        if (aqujVar == null) {
            aqujVar = aquj.a;
        }
        akacVar.a(aqujVar);
        aquk aqukVar = aqujVar.d;
        if (aqukVar == null) {
            aqukVar = aquk.a;
        }
        if ((aqukVar.b & 2) != 0) {
            aquk aqukVar2 = aqujVar.d;
            if (aqukVar2 == null) {
                aqukVar2 = aquk.a;
            }
            Object obj2 = aqukVar2.c;
            if (obj2 == null) {
                obj2 = aqul.a;
            }
            akacVar.a(obj2);
        }
        aquk aqukVar3 = aqujVar.e;
        if (aqukVar3 == null) {
            aqukVar3 = aquk.a;
        }
        if ((aqukVar3.b & 2) != 0) {
            aquk aqukVar4 = aqujVar.e;
            if (aqukVar4 == null) {
                aqukVar4 = aquk.a;
            }
            Object obj3 = aqukVar4.c;
            if (obj3 == null) {
                obj3 = aqul.a;
            }
            akacVar.a(obj3);
        }
    }

    @Override // defpackage.akad
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.akad
    public final ampt e() {
        return a;
    }
}
