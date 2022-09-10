package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atmu  reason: default package */
/* loaded from: classes2.dex */
public final class atmu implements zfc {
    final /* synthetic */ atmv a;

    public atmu(atmv atmvVar) {
        this.a = atmvVar;
    }

    @Override // defpackage.zfc
    public final void q(int i, cjqm cjqmVar) {
        int length;
        atmv atmvVar = this.a;
        amvh[] amvhVarArr = atmvVar.c;
        if (amvhVarArr == null || i >= (length = amvhVarArr.length)) {
            return;
        }
        atmvVar.a.b(crhx.b(i, length));
    }
}
