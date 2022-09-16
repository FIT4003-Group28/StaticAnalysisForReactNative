package defpackage;
/* compiled from: PG */
/* renamed from: zsw  reason: default package */
/* loaded from: classes4.dex */
final class zsw extends yua {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ zsy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsw(zsy zsyVar, String str, cez cezVar, String str2, String str3) {
        super(1, str, cezVar);
        this.c = zsyVar;
        this.a = str2;
        this.b = str3;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        return cfb.b(cewVar.b, null);
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        byte[] bArr = (byte[]) obj;
        String valueOf = String.valueOf(this.a);
        if (valueOf.length() != 0) {
            "Asset fetched: ".concat(valueOf);
        }
        new zsv(this, bArr).execute(new Void[0]);
    }
}
