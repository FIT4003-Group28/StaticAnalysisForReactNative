package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jkt  reason: default package */
/* loaded from: classes3.dex */
public final class jkt implements ankb {
    final /* synthetic */ jku a;
    private final /* synthetic */ int b;

    public jkt(jku jkuVar) {
        this.a = jkuVar;
    }

    public jkt(jku jkuVar, int i) {
        this.b = i;
        this.a = jkuVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean z = true;
        if (this.b == 0) {
            ampq ampqVar = (ampq) obj;
            ankt anktVar = this.a.c;
            if (anktVar == null || anktVar.isCancelled()) {
                return;
            }
            jku jkuVar = this.a;
            if (ampqVar == null || !ampqVar.h() || ((agqv) ampqVar.c()).i() != agqp.PLAYABLE) {
                z = false;
            }
            jkuVar.d(z);
            return;
        }
        List<agqv> list = (List) obj;
        ankt anktVar2 = this.a.d;
        if (anktVar2 == null || anktVar2.isCancelled()) {
            return;
        }
        if (list != null) {
            for (agqv agqvVar : list) {
                if (agqvVar.i() == agqp.PLAYABLE) {
                    this.a.d(true);
                    return;
                }
            }
        }
        this.a.d(false);
    }
}
