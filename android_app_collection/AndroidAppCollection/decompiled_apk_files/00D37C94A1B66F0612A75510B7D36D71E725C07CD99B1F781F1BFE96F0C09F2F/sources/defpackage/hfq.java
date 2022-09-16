package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hfq  reason: default package */
/* loaded from: classes3.dex */
public final class hfq extends yua {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ hfs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfq(hfs hfsVar, String str, cez cezVar, String str2, long j) {
        super(1, str, cezVar);
        this.c = hfsVar;
        this.a = str2;
        this.b = j;
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
            "Response delivered for ".concat(valueOf);
        }
        ((hfn) this.c.b).n(this.b, ampq.j(bArr));
        gyn gynVar = this.c.c;
        acvg acvgVar = gynVar.f;
        if (acvgVar == null) {
            return;
        }
        acvgVar.c("aft");
        gynVar.f = null;
    }
}
