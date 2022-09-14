package defpackage;
/* compiled from: PG */
/* renamed from: cksp  reason: default package */
/* loaded from: classes4.dex */
public final class cksp implements Comparable<cksp> {
    public final crfk a;
    public final cksq b;
    public final long c;

    public cksp(crfk crfkVar, cksq cksqVar, long j) {
        this.a = crfkVar;
        this.b = cksqVar;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cksp ckspVar) {
        cksp ckspVar2 = ckspVar;
        return dbzx.b.a(ckspVar2.b, this.b).d(this.c, ckspVar2.c).i();
    }
}
