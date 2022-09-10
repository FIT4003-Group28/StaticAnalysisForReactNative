package defpackage;

import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zyv  reason: default package */
/* loaded from: classes7.dex */
public final class zyv implements zzj {
    final /* synthetic */ zyy a;
    @dzsi
    private akqq b;
    @dzsi
    private akqq c;

    public zyv(zyy zyyVar) {
        this.a = zyyVar;
    }

    private final void c() {
        akqq akqqVar = this.b;
        akqq akqqVar2 = this.c;
        if (akqqVar == null || akqqVar2 == null) {
            return;
        }
        zzh a = this.a.d.a();
        a.g.a(a.d(Arrays.asList(akqqVar2, akqqVar)));
    }

    @Override // defpackage.zzj
    public final void a(List<akqq> list) {
        this.c = this.a.aj.j();
        zzh a = this.a.d.a();
        if (list.size() > 1) {
            a.f.a(a.d(list));
        } else {
            a.f.a(null);
        }
        a.c();
        for (aldl aldlVar : aldn.a(list)) {
            akta a2 = a.b.a(aldlVar, bntp.DISTANCE_TOOL_MEASLE.c());
            aksz d = a2.d();
            d.c(0.75f, aksy.PIXEL);
            a2.c(d);
            a.d.add(a2);
        }
        c();
        this.a.d.a().a();
    }

    @Override // defpackage.zzj
    public final void b(akqq akqqVar) {
        this.b = akqqVar;
        c();
        this.a.d.a().a();
    }
}
