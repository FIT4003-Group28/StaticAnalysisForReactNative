package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: brp  reason: default package */
/* loaded from: classes2.dex */
public final class brp extends bkt {
    public final /* synthetic */ WorkDatabase_Impl a;

    public brp(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
    }

    @Override // defpackage.bkt
    public final void a(blv blvVar) {
        blvVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        blvVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        blvVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        blvVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        blvVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        blvVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        blvVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        blvVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        blvVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        blvVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        blvVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        blvVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        blvVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        blvVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        blvVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    @Override // defpackage.bkt
    public final doq b(blv blvVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new blb("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new blb("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new blc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new blc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new ble("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new ble("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        blf blfVar = new blf("Dependency", hashMap, hashSet, hashSet2);
        blf a = blf.a(blvVar, "Dependency");
        if (!blfVar.equals(a)) {
            return new doq(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + blfVar + "\n Found:\n" + a);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new blb("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new blb("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new blb("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new blb("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new blb("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new blb("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new blb("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new blb("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new blb("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new blb("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new blb("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new blb("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_start_time", new blb("period_start_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new blb("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new blb("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new blb("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new blb("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_type", new blb("required_network_type", "INTEGER", false, 0, null, 1));
        hashMap2.put("requires_charging", new blb("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new blb("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new blb("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new blb("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new blb("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new blb("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new blb("content_uri_triggers", "BLOB", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new ble("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new ble("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        blf blfVar2 = new blf("WorkSpec", hashMap2, hashSet3, hashSet4);
        blf a2 = blf.a(blvVar, "WorkSpec");
        if (!blfVar2.equals(a2)) {
            return new doq(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + blfVar2 + "\n Found:\n" + a2);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new blb("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new blb("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new blc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new ble("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        blf blfVar3 = new blf("WorkTag", hashMap3, hashSet5, hashSet6);
        blf a3 = blf.a(blvVar, "WorkTag");
        if (!blfVar3.equals(a3)) {
            return new doq(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + blfVar3 + "\n Found:\n" + a3);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new blb("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("system_id", new blb("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new blc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        blf blfVar4 = new blf("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        blf a4 = blf.a(blvVar, "SystemIdInfo");
        if (!blfVar4.equals(a4)) {
            return new doq(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + blfVar4 + "\n Found:\n" + a4);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new blb("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new blb("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new blc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new ble("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        blf blfVar5 = new blf("WorkName", hashMap5, hashSet8, hashSet9);
        blf a5 = blf.a(blvVar, "WorkName");
        if (!blfVar5.equals(a5)) {
            return new doq(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + blfVar5 + "\n Found:\n" + a5);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new blb("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new blb("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new blc("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        blf blfVar6 = new blf("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        blf a6 = blf.a(blvVar, "WorkProgress");
        if (!blfVar6.equals(a6)) {
            return new doq(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + blfVar6 + "\n Found:\n" + a6);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new blb("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new blb("long_value", "INTEGER", false, 0, null, 1));
        blf blfVar7 = new blf("Preference", hashMap7, new HashSet(0), new HashSet(0));
        blf a7 = blf.a(blvVar, "Preference");
        if (!blfVar7.equals(a7)) {
            return new doq(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + blfVar7 + "\n Found:\n" + a7);
        }
        return new doq(true, (String) null);
    }
}
