package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: jgg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jgg implements anir {
    public final /* synthetic */ jgk a;
    private final /* synthetic */ int b;

    public /* synthetic */ jgg(jgk jgkVar, int i, byte[] bArr) {
        this.b = i;
        this.a = jgkVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ampr amprVar = (ampr) obj;
            return this.a.a.b((Optional) amprVar.a, (Optional) amprVar.b);
        } else if (i == 1) {
            ampr amprVar2 = (ampr) obj;
            return this.a.a.a((Optional) amprVar2.a, (Optional) amprVar2.b);
        } else if (i == 2) {
            ampr amprVar3 = (ampr) obj;
            return this.a.a.c((Optional) amprVar3.a, (Optional) amprVar3.b);
        } else {
            ampr amprVar4 = (ampr) obj;
            return this.a.a.d((Optional) amprVar4.a, (Optional) amprVar4.b);
        }
    }
}
