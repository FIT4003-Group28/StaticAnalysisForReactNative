package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: buo  reason: default package */
/* loaded from: classes2.dex */
public final class buo extends bkm {
    public buo(bks bksVar) {
        super(bksVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01dc -> B:100:0x01e0). Please submit an issue!!! */
    @Override // defpackage.bkm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(defpackage.bmb r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buo.b(bmb, java.lang.Object):void");
    }

    @Override // defpackage.bkw
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
