package defpackage;
/* compiled from: PG */
/* renamed from: avmg  reason: default package */
/* loaded from: classes3.dex */
public class avmg implements avmf {
    private final String a;
    private final avlz b;
    private final czwe c;

    public avmg(String str, avlz avlzVar, czwe czweVar) {
        this.a = str;
        this.b = avlzVar;
        this.c = czweVar;
    }

    @Override // defpackage.avmf
    public String a() {
        return this.a;
    }

    @Override // defpackage.avmf
    public cqkl b() {
        this.c.dismiss();
        return cqkl.a;
    }

    @Override // defpackage.avmf
    public cqkl c() {
        avgn avgnVar = ((avgf) this.b).a;
        if (avgnVar.w()) {
            avgnVar.j();
        }
        this.c.dismiss();
        return cqkl.a;
    }
}
