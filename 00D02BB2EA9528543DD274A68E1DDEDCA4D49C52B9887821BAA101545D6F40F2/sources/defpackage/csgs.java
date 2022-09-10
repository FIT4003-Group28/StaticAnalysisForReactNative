package defpackage;
/* compiled from: PG */
/* renamed from: csgs  reason: default package */
/* loaded from: classes5.dex */
public final class csgs {
    public final ddxw a;

    private csgs(ddxw ddxwVar) {
        dbsk.a(((ddxx) ddxwVar.b).d != 0);
        this.a = ddxwVar;
    }

    public static csgs a(int i) {
        ddxw bZ = ddxx.j.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ.b;
        ddxxVar.a |= 8;
        ddxxVar.d = i;
        return new csgs(bZ);
    }
}
