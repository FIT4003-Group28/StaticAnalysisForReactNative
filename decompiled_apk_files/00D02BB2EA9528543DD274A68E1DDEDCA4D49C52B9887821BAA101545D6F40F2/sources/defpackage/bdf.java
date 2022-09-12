package defpackage;
/* compiled from: PG */
/* renamed from: bdf  reason: default package */
/* loaded from: classes3.dex */
final class bdf extends bw {
    public bdf() {
        super(6, 7);
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        avuVar.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    }
}
