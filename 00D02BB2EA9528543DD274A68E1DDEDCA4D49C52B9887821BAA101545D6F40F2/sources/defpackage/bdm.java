package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdm  reason: default package */
/* loaded from: classes3.dex */
public final class bdm extends bo {
    final /* synthetic */ WorkDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdm(WorkDatabase_Impl workDatabase_Impl) {
        super(11);
        this.b = workDatabase_Impl;
    }

    @Override // defpackage.bo
    public final void a(avu avuVar) {
        avuVar.h("DROP TABLE IF EXISTS `Dependency`");
        avuVar.h("DROP TABLE IF EXISTS `WorkSpec`");
        avuVar.h("DROP TABLE IF EXISTS `WorkTag`");
        avuVar.h("DROP TABLE IF EXISTS `SystemIdInfo`");
        avuVar.h("DROP TABLE IF EXISTS `WorkName`");
        avuVar.h("DROP TABLE IF EXISTS `WorkProgress`");
        avuVar.h("DROP TABLE IF EXISTS `Preference`");
        List<bl> list = this.b.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.b.f.get(i).c();
            }
        }
    }

    @Override // defpackage.bo
    public final void b(avu avuVar) {
        avuVar.h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        avuVar.h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        avuVar.h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        avuVar.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        avuVar.h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        avuVar.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        avuVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        avuVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        avuVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
    }

    @Override // defpackage.bo
    public final void c(avu avuVar) {
        this.b.a = avuVar;
        avuVar.h("PRAGMA foreign_keys = ON");
        this.b.n(avuVar);
        List<bl> list = this.b.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.b.f.get(i).a(avuVar);
            }
        }
    }

    @Override // defpackage.bo
    public final bp d(avu avuVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new cb("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new cb("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new cc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new cc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new ce("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
        hashSet2.add(new ce("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
        cf cfVar = new cf("Dependency", hashMap, hashSet, hashSet2);
        cf a = cf.a(avuVar, "Dependency");
        if (!cfVar.equals(a)) {
            return new bp(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + cfVar + "\n Found:\n" + a);
        }
        HashMap hashMap2 = new HashMap(24);
        hashMap2.put("id", new cb("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new cb("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new cb("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new cb("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new cb("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new cb("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new cb("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new cb("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new cb("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new cb("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new cb("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new cb("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_start_time", new cb("period_start_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new cb("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new cb("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new cb("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_type", new cb("required_network_type", "INTEGER", false, 0, null, 1));
        hashMap2.put("requires_charging", new cb("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new cb("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new cb("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new cb("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new cb("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new cb("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new cb("content_uri_triggers", "BLOB", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new ce("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
        hashSet4.add(new ce("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
        cf cfVar2 = new cf("WorkSpec", hashMap2, hashSet3, hashSet4);
        cf a2 = cf.a(avuVar, "WorkSpec");
        if (!cfVar2.equals(a2)) {
            return new bp(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + cfVar2 + "\n Found:\n" + a2);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new cb("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new cb("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new cc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new ce("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
        cf cfVar3 = new cf("WorkTag", hashMap3, hashSet5, hashSet6);
        cf a3 = cf.a(avuVar, "WorkTag");
        if (!cfVar3.equals(a3)) {
            return new bp(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + cfVar3 + "\n Found:\n" + a3);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new cb("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("system_id", new cb("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new cc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        cf cfVar4 = new cf("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        cf a4 = cf.a(avuVar, "SystemIdInfo");
        if (!cfVar4.equals(a4)) {
            return new bp(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + cfVar4 + "\n Found:\n" + a4);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new cb("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new cb("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new cc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new ce("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
        cf cfVar5 = new cf("WorkName", hashMap5, hashSet8, hashSet9);
        cf a5 = cf.a(avuVar, "WorkName");
        if (!cfVar5.equals(a5)) {
            return new bp(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + cfVar5 + "\n Found:\n" + a5);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new cb("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new cb("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new cc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        cf cfVar6 = new cf("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        cf a6 = cf.a(avuVar, "WorkProgress");
        if (!cfVar6.equals(a6)) {
            return new bp(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + cfVar6 + "\n Found:\n" + a6);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new cb("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new cb("long_value", "INTEGER", false, 0, null, 1));
        cf cfVar7 = new cf("Preference", hashMap7, new HashSet(0), new HashSet(0));
        cf a7 = cf.a(avuVar, "Preference");
        if (!cfVar7.equals(a7)) {
            return new bp(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + cfVar7 + "\n Found:\n" + a7);
        }
        return new bp(true, null);
    }

    @Override // defpackage.bo
    public final void e(avu avuVar) {
        by.a(avuVar);
    }

    @Override // defpackage.bo
    public final void f() {
        List<bl> list = this.b.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.b.f.get(i).b();
            }
        }
    }
}
