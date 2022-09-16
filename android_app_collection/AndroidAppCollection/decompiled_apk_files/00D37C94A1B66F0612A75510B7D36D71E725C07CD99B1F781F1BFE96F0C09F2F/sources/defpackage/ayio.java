package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayio  reason: default package */
/* loaded from: classes2.dex */
final class ayio extends ayfb {
    final /* synthetic */ Status a;
    final /* synthetic */ axzl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayio(ayip ayipVar, axzl axzlVar, Status status, byte[] bArr) {
        super(ayipVar.a);
        this.b = axzlVar;
        this.a = status;
    }

    @Override // defpackage.ayfb
    public final void a() {
        this.b.a(this.a, new ayat());
    }
}
