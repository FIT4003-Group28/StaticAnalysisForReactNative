package defpackage;
/* compiled from: PG */
/* renamed from: bdg  reason: default package */
/* loaded from: classes3.dex */
final class bdg extends bw {
    public bdg() {
        super(7, 8);
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
    }
}
