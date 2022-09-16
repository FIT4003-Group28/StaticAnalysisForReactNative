package defpackage;
/* compiled from: PG */
/* renamed from: bdc  reason: default package */
/* loaded from: classes3.dex */
final class bdc extends bw {
    public bdc() {
        super(1, 2);
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        avuVar.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        avuVar.h("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
        avuVar.h("DROP TABLE IF EXISTS alarmInfo");
        avuVar.h("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
    }
}
