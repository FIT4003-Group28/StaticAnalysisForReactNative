package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayfl  reason: default package */
/* loaded from: classes2.dex */
public final class ayfl extends ayfb {
    final Status a;
    final axzl b;

    public ayfl(ayfr ayfrVar, axzl axzlVar, Status status, byte[] bArr) {
        super(ayfrVar.a);
        this.b = axzlVar;
        this.a = status;
    }

    @Override // defpackage.ayfb
    public final void a() {
        this.b.a(this.a, new ayat());
    }
}
