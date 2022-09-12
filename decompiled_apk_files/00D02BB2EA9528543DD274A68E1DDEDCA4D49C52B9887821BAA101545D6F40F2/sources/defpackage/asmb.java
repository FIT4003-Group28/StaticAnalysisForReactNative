package defpackage;
/* compiled from: PG */
/* renamed from: asmb  reason: default package */
/* loaded from: classes2.dex */
public final class asmb implements alht {
    @dzsi
    public asmn a;
    public final akpm b;
    public final asma c;
    @dzsi
    public akra d = null;
    @dzsi
    public Float e = null;

    public asmb(asmn asmnVar, akpm akpmVar, asma asmaVar) {
        dbsk.t(asmnVar, "host");
        this.a = asmnVar;
        this.b = akpmVar;
        dbsk.t(asmaVar, "listener");
        this.c = asmaVar;
    }

    public static boolean c(@dzsi asmn asmnVar) {
        return asmnVar != null && asmnVar.bb();
    }

    @Override // defpackage.alht
    public final boolean a(alhr alhrVar) {
        if (!c(this.a)) {
            return false;
        }
        return this.c.i();
    }

    public final void b() {
        this.a = null;
    }
}
