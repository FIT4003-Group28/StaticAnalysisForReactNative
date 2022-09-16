package defpackage;

import java.util.Collection;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: jqt  reason: default package */
/* loaded from: classes3.dex */
public final class jqt implements yiw {
    final /* synthetic */ jqu a;
    private final /* synthetic */ int b;

    public jqt(jqu jquVar) {
        this.a = jquVar;
    }

    public jqt(jqu jquVar, int i) {
        this.b = i;
        this.a = jquVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (this.b == 0) {
            Void r1 = (Void) obj;
        } else {
            String str = (String) obj;
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        if (this.b == 0) {
            Void r3 = (Void) obj;
            Collection collection = (Collection) obj2;
            Future future = this.a.l;
            if (future == null || future.isCancelled() || !"PPSV".equals(this.a.j)) {
                this.a.l = null;
                return;
            }
            jqu jquVar = this.a;
            jquVar.b(jquVar.d.a());
            return;
        }
        String str = (String) obj;
        agqh agqhVar = (agqh) obj2;
        Future future2 = this.a.l;
        if (future2 == null || future2.isCancelled() || !str.equals(this.a.j)) {
            this.a.l = null;
        } else if (agqhVar == null) {
        } else {
            jqu jquVar2 = this.a;
            jquVar2.b(jquVar2.d.b(((agrf) jquVar2.e.get()).a().i().d(str)));
        }
    }
}
