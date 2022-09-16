package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayiy  reason: default package */
/* loaded from: classes2.dex */
public final class ayiy extends axye {
    final /* synthetic */ ayje a;

    public ayiy(ayje ayjeVar) {
        this.a = ayjeVar;
    }

    @Override // defpackage.axye
    public final axyg a(ayax ayaxVar, axyd axydVar) {
        Executor d = this.a.c.d(axydVar);
        ayji ayjiVar = this.a.c;
        ayen ayenVar = new ayen(ayaxVar, d, axydVar, ayjiVar.V, ayjiVar.D ? null : this.a.c.j.b(), this.a.c.E);
        ayenVar.g = this.a.c.p;
        return ayenVar;
    }

    @Override // defpackage.axye
    public final String b() {
        return this.a.b;
    }
}
