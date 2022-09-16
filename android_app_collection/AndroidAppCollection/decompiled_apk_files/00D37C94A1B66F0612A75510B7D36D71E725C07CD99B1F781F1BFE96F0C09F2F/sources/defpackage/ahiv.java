package defpackage;
/* compiled from: PG */
/* renamed from: ahiv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahiv implements ayqb {
    public final /* synthetic */ ahiw a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahiv(ahiw ahiwVar, int i) {
        this.b = i;
        this.a = ahiwVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        aube aubeVar;
        auay auayVar;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.c = ((ahgn) obj).d();
                return;
            }
            ahiw ahiwVar = this.a;
            aika aikaVar = aika.NEW;
            int ordinal = ((ahhw) obj).c().ordinal();
            if (ordinal == 0) {
                ahiwVar.g = false;
                return;
            } else if (ordinal != 9 || !ahiwVar.a()) {
                return;
            } else {
                ((aire) ahiwVar.a.get()).a(aiqk.d);
                return;
            }
        }
        ahiw ahiwVar2 = this.a;
        ahhm ahhmVar = (ahhm) obj;
        if (ahhmVar.a() == null || (aubeVar = ahhmVar.a().i) == null) {
            return;
        }
        auba aubaVar = aubeVar.h;
        if (aubaVar == null) {
            aubaVar = auba.a;
        }
        if ((1 & aubaVar.b) == 0) {
            return;
        }
        auba aubaVar2 = aubeVar.h;
        if (aubaVar2 == null) {
            aubaVar2 = auba.a;
        }
        auaz auazVar = aubaVar2.c;
        if (auazVar == null) {
            auazVar = auaz.a;
        }
        if ((auazVar.b & 128) != 0) {
            auax auaxVar = auazVar.h;
            if (auaxVar == null) {
                auaxVar = auax.a;
            }
            auayVar = auaxVar.c;
            if (auayVar == null) {
                auayVar = auay.a;
            }
        } else {
            auayVar = null;
        }
        int i2 = -1;
        ahiwVar2.e = auayVar == null ? -1 : auayVar.b;
        if (auayVar != null) {
            i2 = auayVar.c;
        }
        ahiwVar2.f = i2;
    }
}
