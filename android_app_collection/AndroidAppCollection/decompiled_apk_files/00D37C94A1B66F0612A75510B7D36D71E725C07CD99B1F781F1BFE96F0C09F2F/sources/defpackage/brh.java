package defpackage;
/* compiled from: PG */
/* renamed from: brh  reason: default package */
/* loaded from: classes2.dex */
final class brh extends bla {
    public brh() {
        super(6, 7);
    }

    @Override // defpackage.bla
    public final void a(blv blvVar) {
        blvVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    }
}
