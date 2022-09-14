package defpackage;
/* compiled from: PG */
/* renamed from: bpec  reason: default package */
/* loaded from: classes3.dex */
public class bpec implements bpwa {
    private final bpvz a;
    private final cqkn<bpwa> b;
    private boolean c;

    public bpec(bpeb bpebVar, boxf boxfVar, boolean z, cqkn<bpwa> cqknVar) {
        this.c = z;
        this.b = cqknVar;
        this.a = bpebVar.a(boxfVar);
    }

    @Override // defpackage.bpwa
    public bpvz a() {
        return this.a;
    }

    @Override // defpackage.bpwa
    public Boolean b() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.bpwa
    public void c(boolean z) {
        this.c = z;
    }

    @Override // defpackage.bpwa
    public cqkn<bpwa> d() {
        return this.b;
    }
}
