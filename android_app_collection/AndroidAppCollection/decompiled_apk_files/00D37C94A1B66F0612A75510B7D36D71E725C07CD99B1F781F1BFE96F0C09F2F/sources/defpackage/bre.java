package defpackage;
/* compiled from: PG */
/* renamed from: bre  reason: default package */
/* loaded from: classes2.dex */
final class bre extends bla {
    public bre() {
        super(1, 2);
    }

    @Override // defpackage.bla
    public final void a(blv blvVar) {
        blvVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        blvVar.g("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
        blvVar.g("DROP TABLE IF EXISTS alarmInfo");
        blvVar.g("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
    }
}
