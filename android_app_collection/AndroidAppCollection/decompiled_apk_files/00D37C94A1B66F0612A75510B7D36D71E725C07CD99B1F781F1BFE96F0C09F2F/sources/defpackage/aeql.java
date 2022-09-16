package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aeql  reason: default package */
/* loaded from: classes.dex */
final class aeql implements ankb {
    final /* synthetic */ cew a;
    final /* synthetic */ aeqm b;

    public aeql(aeqm aeqmVar, cew cewVar) {
        this.b = aeqmVar;
        this.a = cewVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        aeqm aeqmVar = this.b;
        aeqn.c(aeqmVar.a, aeqmVar.c);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Void r3 = (Void) obj;
        this.b.b.c(ByteBuffer.allocateDirect(this.a.b.length).put(this.a.b));
    }
}
