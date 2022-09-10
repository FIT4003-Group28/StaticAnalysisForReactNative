package defpackage;
/* compiled from: PG */
/* renamed from: brcl  reason: default package */
/* loaded from: classes4.dex */
public final class brcl {
    public final String a;
    public final cqsn b;
    public final cqtd c;
    public final int d;
    public final int e;

    public brcl(dupr duprVar) {
        if ((duprVar.a & 8) != 0) {
            this.a = duprVar.d;
        } else {
            this.a = duprVar.c;
        }
        this.b = cqsk.a(duprVar.c);
        int i = duprVar.b;
        this.d = i;
        owz a = oxa.a(i);
        dbsk.t(a, "iconSpec");
        this.c = a.b();
        this.e = duprVar.e;
    }
}
