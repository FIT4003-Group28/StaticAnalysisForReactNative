package defpackage;
/* compiled from: PG */
/* renamed from: cres  reason: default package */
/* loaded from: classes.dex */
public enum cres {
    LOUDER(20),
    NORMAL(10),
    SOFTER(0);
    
    public final int d;

    cres(int i) {
        this.d = i;
    }

    public static cres a(bvjj bvjjVar) {
        cres cresVar = (cres) bvjjVar.H(bvjk.eL, cres.class, NORMAL);
        dbsk.s(cresVar);
        return cresVar;
    }
}
