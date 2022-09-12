package defpackage;
/* compiled from: PG */
/* renamed from: apmv  reason: default package */
/* loaded from: classes2.dex */
public final class apmv extends bvwr<anhe> {
    private final bvws a;

    public apmv(bvws bvwsVar) {
        super(anhe.class);
        this.a = bvwsVar;
    }

    @Override // defpackage.bvwr
    public final /* bridge */ /* synthetic */ void a(anhe anheVar) {
        bvws bvwsVar = this.a;
        dmde bZ = dmdf.c.bZ();
        String a = anheVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmdf dmdfVar = (dmdf) bZ.b;
        a.getClass();
        dmdfVar.a |= 1;
        dmdfVar.b = a;
        bvwsVar.b(bZ.bK(), dmdf.d);
    }
}
