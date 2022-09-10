package defpackage;
/* compiled from: PG */
/* renamed from: bgj  reason: default package */
/* loaded from: classes3.dex */
final class bgj extends bc<bgh> {
    public bgj(bn bnVar) {
        super(bnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01b2 -> B:94:0x01b6). Please submit an issue!!! */
    @Override // defpackage.bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void c(defpackage.awj r17, defpackage.bgh r18) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgj.c(awj, java.lang.Object):void");
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
