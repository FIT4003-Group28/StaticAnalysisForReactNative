package defpackage;
/* compiled from: PG */
/* renamed from: cowb  reason: default package */
/* loaded from: classes5.dex */
final class cowb implements cnsc<coun> {
    private final String a;
    private final String b;
    private final int c;

    public cowb(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // defpackage.cnsc
    public final /* bridge */ /* synthetic */ void a(coun counVar) {
        counVar.g(this.a, this.b, this.c);
    }

    @Override // defpackage.cnsc
    public final void b() {
    }
}
