package defpackage;
/* compiled from: PG */
/* renamed from: ply  reason: default package */
/* loaded from: classes4.dex */
public final class ply {
    public final pky[] a;
    public final pmk b;
    public final pmm c;

    public ply(pky... pkyVarArr) {
        pmk pmkVar = new pmk();
        pmm pmmVar = new pmm();
        int length = pkyVarArr.length;
        pky[] pkyVarArr2 = new pky[length + 2];
        this.a = pkyVarArr2;
        System.arraycopy(pkyVarArr, 0, pkyVarArr2, 0, length);
        this.b = pmkVar;
        this.c = pmmVar;
        pkyVarArr2[length] = pmkVar;
        pkyVarArr2[length + 1] = pmmVar;
    }
}
