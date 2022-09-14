package defpackage;
/* compiled from: PG */
/* renamed from: bkdm  reason: default package */
/* loaded from: classes3.dex */
public class bkdm implements bkdd {
    private final bkdc a;
    private final String b;
    private final dgis c;
    private final cjtd d;

    public bkdm(dgim dgimVar, ddho ddhoVar, bkdc bkdcVar) {
        this.a = bkdcVar;
        this.b = dgimVar.a;
        dgis dgisVar = dgimVar.b;
        this.c = dgisVar == null ? dgis.d : dgisVar;
        this.d = cjtd.a(ddhoVar);
    }

    @Override // defpackage.bkdd
    public cjtd a() {
        return this.d;
    }

    @Override // defpackage.bkdd
    public String b() {
        return this.b;
    }

    @Override // defpackage.bkdd
    public cqkl c() {
        if (bkdc.a(this.c)) {
            this.a.b(this.c);
        }
        return cqkl.a;
    }
}
