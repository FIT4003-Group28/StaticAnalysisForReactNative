package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: zzs  reason: default package */
/* loaded from: classes7.dex */
final class zzs implements zzj {
    final /* synthetic */ zzt a;
    private final Runnable b = new Runnable(this) { // from class: zzr
        private final zzs a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            cqkx.p(this.a.a);
        }
    };

    public zzs(zzt zztVar) {
        this.a = zztVar;
    }

    @Override // defpackage.zzj
    public final void a(List<akqq> list) {
        cqkx.p(this.a);
    }

    @Override // defpackage.zzj
    public final void b(akqq akqqVar) {
        this.a.a.b(this.b, bvrj.UI_THREAD);
    }
}
