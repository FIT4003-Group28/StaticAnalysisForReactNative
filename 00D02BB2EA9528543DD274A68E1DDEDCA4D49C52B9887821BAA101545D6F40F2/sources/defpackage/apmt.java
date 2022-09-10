package defpackage;
/* compiled from: PG */
/* renamed from: apmt  reason: default package */
/* loaded from: classes2.dex */
public final class apmt extends bvwr<anhc> {
    private final bvws a;

    public apmt(bvws bvwsVar) {
        super(anhc.class);
        this.a = bvwsVar;
    }

    @Override // defpackage.bvwr
    public final /* bridge */ /* synthetic */ void a(anhc anhcVar) {
        bvws bvwsVar = this.a;
        dmdg bZ = dmdh.c.bZ();
        String a = anhcVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmdh dmdhVar = (dmdh) bZ.b;
        a.getClass();
        dmdhVar.a |= 1;
        dmdhVar.b = a;
        bvwsVar.b(bZ.bK(), dmdh.d);
    }
}
