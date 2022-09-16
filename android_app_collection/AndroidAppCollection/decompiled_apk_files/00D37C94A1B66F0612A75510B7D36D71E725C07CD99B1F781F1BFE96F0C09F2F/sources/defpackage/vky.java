package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: vky  reason: default package */
/* loaded from: classes4.dex */
final class vky implements ankb {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ amqi c;
    final /* synthetic */ vlb d;
    final /* synthetic */ Integer e;
    final /* synthetic */ vlc f;

    public vky(vlc vlcVar, AtomicBoolean atomicBoolean, Set set, amqi amqiVar, vlb vlbVar, Integer num) {
        this.f = vlcVar;
        this.a = atomicBoolean;
        this.b = set;
        this.c = amqiVar;
        this.d = vlbVar;
        this.e = num;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Void r4 = (Void) obj;
        if (!this.a.get()) {
            this.b.size();
            vlb vlbVar = this.d;
            synchronized (vlbVar.c) {
                amvn.p(vlbVar.b);
            }
            vlc.a.convert(this.e.intValue(), this.f.g);
            return;
        }
        this.b.size();
        this.c.a(vlc.a);
    }
}
