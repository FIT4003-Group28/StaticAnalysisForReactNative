package defpackage;
/* compiled from: PG */
/* renamed from: bajr  reason: default package */
/* loaded from: classes3.dex */
final class bajr implements akey {
    final /* synthetic */ akey a;
    final /* synthetic */ bvqg b;
    final /* synthetic */ baju c;

    public bajr(baju bajuVar, akey akeyVar, bvqg bvqgVar) {
        this.c = bajuVar;
        this.a = akeyVar;
        this.b = bvqgVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        akey akeyVar = this.a;
        if (akeyVar != null) {
            akeyVar.a(z);
        }
        this.c.a(this.b);
    }

    @Override // defpackage.akey
    public final void b() {
        akey akeyVar = this.a;
        if (akeyVar != null) {
            akeyVar.b();
        }
    }
}
