package defpackage;
/* compiled from: PG */
/* renamed from: bri  reason: default package */
/* loaded from: classes2.dex */
final class bri extends bla {
    public bri() {
        super(7, 8);
    }

    @Override // defpackage.bla
    public final void a(blv blvVar) {
        blvVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
    }
}
