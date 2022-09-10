package defpackage;

import com.google.android.apps.gmm.car.vms.databack.storage.DataBackDatabase_Impl;
import com.google.android.filament.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: nuh  reason: default package */
/* loaded from: classes7.dex */
public final class nuh extends bo {
    final /* synthetic */ DataBackDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuh(DataBackDatabase_Impl dataBackDatabase_Impl) {
        super(3);
        this.b = dataBackDatabase_Impl;
    }

    @Override // defpackage.bo
    public final void a(avu avuVar) {
        avuVar.h("DROP TABLE IF EXISTS `recent_signs_count`");
        avuVar.h("DROP TABLE IF EXISTS `sensor_observation`");
        avuVar.h("DROP TABLE IF EXISTS `recorded_sensor_observation_event`");
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
        avuVar.h("CREATE TABLE IF NOT EXISTS `recent_signs_count` (`sign_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sign_type` TEXT, `timestamp_ms` INTEGER NOT NULL)");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_recent_signs_count_timestamp_ms` ON `recent_signs_count` (`timestamp_ms`)");
        avuVar.h("CREATE TABLE IF NOT EXISTS `sensor_observation` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `observation_proto` BLOB, `observation_time_millis` INTEGER NOT NULL, `time_since_boot_millis` INTEGER NOT NULL DEFAULT 0, `ttl_millis` INTEGER NOT NULL)");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_sensor_observation_observation_time_millis` ON `sensor_observation` (`observation_time_millis`)");
        avuVar.h("CREATE TABLE IF NOT EXISTS `recorded_sensor_observation_event` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `recorded_time_millis` INTEGER NOT NULL, `observation_size_bytes` INTEGER NOT NULL)");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_recorded_sensor_observation_event_recorded_time_millis` ON `recorded_sensor_observation_event` (`recorded_time_millis`)");
        avuVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        avuVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6936bbb2cac83fecaaf7589cb95c19af')");
    }

    @Override // defpackage.bo
    public final void c(avu avuVar) {
        this.b.a = avuVar;
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
        HashMap hashMap = new HashMap(3);
        hashMap.put("sign_id", new cb("sign_id", "INTEGER", true, 1, null, 1));
        hashMap.put("sign_type", new cb("sign_type", "TEXT", false, 0, null, 1));
        hashMap.put("timestamp_ms", new cb("timestamp_ms", "INTEGER", true, 0, null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new ce("index_recent_signs_count_timestamp_ms", false, Arrays.asList("timestamp_ms")));
        cf cfVar = new cf("recent_signs_count", hashMap, hashSet, hashSet2);
        cf a = cf.a(avuVar, "recent_signs_count");
        if (!cfVar.equals(a)) {
            String valueOf = String.valueOf(cfVar);
            String valueOf2 = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_textColorSearchUrl + String.valueOf(valueOf2).length());
            sb.append("recent_signs_count(com.google.android.apps.gmm.car.vms.databack.storage.RecentSignsCount).\n Expected:\n");
            sb.append(valueOf);
            sb.append("\n Found:\n");
            sb.append(valueOf2);
            return new bp(false, sb.toString());
        }
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put("_id", new cb("_id", "INTEGER", true, 1, null, 1));
        hashMap2.put("observation_proto", new cb("observation_proto", "BLOB", false, 0, null, 1));
        hashMap2.put("observation_time_millis", new cb("observation_time_millis", "INTEGER", true, 0, null, 1));
        hashMap2.put("time_since_boot_millis", new cb("time_since_boot_millis", "INTEGER", true, 0, "0", 1));
        hashMap2.put("ttl_millis", new cb("ttl_millis", "INTEGER", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(new ce("index_sensor_observation_observation_time_millis", false, Arrays.asList("observation_time_millis")));
        cf cfVar2 = new cf("sensor_observation", hashMap2, hashSet3, hashSet4);
        cf a2 = cf.a(avuVar, "sensor_observation");
        if (!cfVar2.equals(a2)) {
            String valueOf3 = String.valueOf(cfVar2);
            String valueOf4 = String.valueOf(a2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + R.styleable.AppCompatTheme_windowActionBarOverlay + String.valueOf(valueOf4).length());
            sb2.append("sensor_observation(com.google.android.apps.gmm.car.vms.databack.storage.SensorObservationEntity).\n Expected:\n");
            sb2.append(valueOf3);
            sb2.append("\n Found:\n");
            sb2.append(valueOf4);
            return new bp(false, sb2.toString());
        }
        HashMap hashMap3 = new HashMap(3);
        hashMap3.put("_id", new cb("_id", "INTEGER", true, 1, null, 1));
        hashMap3.put("recorded_time_millis", new cb("recorded_time_millis", "INTEGER", true, 0, null, 1));
        hashMap3.put("observation_size_bytes", new cb("observation_size_bytes", "INTEGER", true, 0, null, 1));
        HashSet hashSet5 = new HashSet(0);
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new ce("index_recorded_sensor_observation_event_recorded_time_millis", false, Arrays.asList("recorded_time_millis")));
        cf cfVar3 = new cf("recorded_sensor_observation_event", hashMap3, hashSet5, hashSet6);
        cf a3 = cf.a(avuVar, "recorded_sensor_observation_event");
        if (!cfVar3.equals(a3)) {
            String valueOf5 = String.valueOf(cfVar3);
            String valueOf6 = String.valueOf(a3);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 140 + String.valueOf(valueOf6).length());
            sb3.append("recorded_sensor_observation_event(com.google.android.apps.gmm.car.vms.databack.storage.RecordedSensorObservationEvent).\n Expected:\n");
            sb3.append(valueOf5);
            sb3.append("\n Found:\n");
            sb3.append(valueOf6);
            return new bp(false, sb3.toString());
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
