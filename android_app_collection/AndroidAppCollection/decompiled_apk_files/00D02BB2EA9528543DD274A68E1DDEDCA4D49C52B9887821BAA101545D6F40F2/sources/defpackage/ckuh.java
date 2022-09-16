package defpackage;
/* compiled from: PG */
/* renamed from: ckuh  reason: default package */
/* loaded from: classes4.dex */
final class ckuh implements cnon<cood> {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ ckuj c;

    public ckuh(ckuj ckujVar, String str, String str2) {
        this.c = ckujVar;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cnon
    public final /* bridge */ /* synthetic */ void Om(cood coodVar) {
        cood coodVar2 = coodVar;
        try {
            if (coodVar2.b.d() && coodVar2.c() != 0) {
                this.c.a(this.a, this.b, coodVar2.d(0).b().toString());
                return;
            }
            this.c.a(this.a, this.b, null);
        } finally {
            coodVar2.b();
        }
    }
}
