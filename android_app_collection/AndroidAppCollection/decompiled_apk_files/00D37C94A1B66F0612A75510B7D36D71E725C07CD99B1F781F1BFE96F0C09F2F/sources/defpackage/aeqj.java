package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aeqj  reason: default package */
/* loaded from: classes.dex */
final class aeqj implements ankb {
    final /* synthetic */ azpm a;
    final /* synthetic */ String b;
    final /* synthetic */ aeqn c;

    public aeqj(aeqn aeqnVar, azpm azpmVar, String str) {
        this.c = aeqnVar;
        this.a = azpmVar;
        this.b = str;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        String str = this.b;
        aeqn aeqnVar = this.c;
        aeqnVar.b.b(new aeqm(str, aeqnVar.a, aeqnVar.c, aeqnVar.d, this.a, aeqnVar.e));
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        byte[] bArr = (byte[]) obj;
        this.a.c(ByteBuffer.allocateDirect(bArr.length).put(bArr));
    }
}
