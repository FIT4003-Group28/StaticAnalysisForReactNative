package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bux  reason: default package */
/* loaded from: classes2.dex */
public final class bux implements bun {
    public final bks a;
    public final bkm b;
    public final bkw c;
    public final bkw d;
    public final bkw e;
    private final bkw f;
    private final bkw g;
    private final bkw h;
    private final bkw i;

    public bux(bks bksVar) {
        this.a = bksVar;
        this.b = new buo(bksVar);
        this.f = new bup(bksVar);
        this.g = new buq(bksVar);
        this.h = new bur(bksVar);
        this.c = new bus(bksVar);
        this.d = new but(bksVar);
        this.i = new buu(bksVar);
        this.e = new buv(bksVar);
        new buw(bksVar);
    }

    @Override // defpackage.bun
    public final bum a(String str) {
        bku bkuVar;
        bum bumVar;
        bku a = bku.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.e();
        Cursor f = ld.f(this.a, a, false);
        try {
            int h = ld.h(f, "required_network_type");
            int h2 = ld.h(f, "requires_charging");
            int h3 = ld.h(f, "requires_device_idle");
            int h4 = ld.h(f, "requires_battery_not_low");
            int h5 = ld.h(f, "requires_storage_not_low");
            int h6 = ld.h(f, "trigger_content_update_delay");
            int h7 = ld.h(f, "trigger_max_content_delay");
            int h8 = ld.h(f, "content_uri_triggers");
            int h9 = ld.h(f, "id");
            int h10 = ld.h(f, "state");
            int h11 = ld.h(f, "worker_class_name");
            int h12 = ld.h(f, "input_merger_class_name");
            int h13 = ld.h(f, "input");
            int h14 = ld.h(f, "output");
            bkuVar = a;
            try {
                int h15 = ld.h(f, "initial_delay");
                int h16 = ld.h(f, "interval_duration");
                int h17 = ld.h(f, "flex_duration");
                int h18 = ld.h(f, "run_attempt_count");
                int h19 = ld.h(f, "backoff_policy");
                int h20 = ld.h(f, "backoff_delay_duration");
                int h21 = ld.h(f, "period_start_time");
                int h22 = ld.h(f, "minimum_retention_duration");
                int h23 = ld.h(f, "schedule_requested_at");
                int h24 = ld.h(f, "run_in_foreground");
                int h25 = ld.h(f, "out_of_quota_policy");
                if (f.moveToFirst()) {
                    String string = f.getString(h9);
                    String string2 = f.getString(h11);
                    bpu bpuVar = new bpu();
                    bpuVar.i = aeh.f(f.getInt(h));
                    bpuVar.b = f.getInt(h2) != 0;
                    bpuVar.c = f.getInt(h3) != 0;
                    bpuVar.d = f.getInt(h4) != 0;
                    bpuVar.e = f.getInt(h5) != 0;
                    bpuVar.f = f.getLong(h6);
                    bpuVar.g = f.getLong(h7);
                    bpuVar.h = aeh.c(f.getBlob(h8));
                    bumVar = new bum(string, string2);
                    bumVar.r = aeh.g(f.getInt(h10));
                    bumVar.e = f.getString(h12);
                    bumVar.f = bpx.a(f.getBlob(h13));
                    bumVar.g = bpx.a(f.getBlob(h14));
                    bumVar.h = f.getLong(h15);
                    bumVar.i = f.getLong(h16);
                    bumVar.j = f.getLong(h17);
                    bumVar.l = f.getInt(h18);
                    bumVar.s = aeh.e(f.getInt(h19));
                    bumVar.m = f.getLong(h20);
                    bumVar.n = f.getLong(h21);
                    bumVar.o = f.getLong(h22);
                    bumVar.p = f.getLong(h23);
                    bumVar.q = f.getInt(h24) != 0;
                    bumVar.t = aeh.h(f.getInt(h25));
                    bumVar.k = bpuVar;
                } else {
                    bumVar = null;
                }
                f.close();
                bkuVar.i();
                return bumVar;
            } catch (Throwable th) {
                th = th;
                f.close();
                bkuVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bkuVar = a;
        }
    }

    @Override // defpackage.bun
    public final List b() {
        bku bkuVar;
        int h;
        int h2;
        int h3;
        int h4;
        int h5;
        int h6;
        int h7;
        int h8;
        int h9;
        int h10;
        int h11;
        int h12;
        int h13;
        int h14;
        bku a = bku.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.e();
        Cursor f = ld.f(this.a, a, false);
        try {
            h = ld.h(f, "required_network_type");
            h2 = ld.h(f, "requires_charging");
            h3 = ld.h(f, "requires_device_idle");
            h4 = ld.h(f, "requires_battery_not_low");
            h5 = ld.h(f, "requires_storage_not_low");
            h6 = ld.h(f, "trigger_content_update_delay");
            h7 = ld.h(f, "trigger_max_content_delay");
            h8 = ld.h(f, "content_uri_triggers");
            h9 = ld.h(f, "id");
            h10 = ld.h(f, "state");
            h11 = ld.h(f, "worker_class_name");
            h12 = ld.h(f, "input_merger_class_name");
            h13 = ld.h(f, "input");
            h14 = ld.h(f, "output");
            bkuVar = a;
        } catch (Throwable th) {
            th = th;
            bkuVar = a;
        }
        try {
            int h15 = ld.h(f, "initial_delay");
            int h16 = ld.h(f, "interval_duration");
            int h17 = ld.h(f, "flex_duration");
            int h18 = ld.h(f, "run_attempt_count");
            int h19 = ld.h(f, "backoff_policy");
            int h20 = ld.h(f, "backoff_delay_duration");
            int h21 = ld.h(f, "period_start_time");
            int h22 = ld.h(f, "minimum_retention_duration");
            int h23 = ld.h(f, "schedule_requested_at");
            int h24 = ld.h(f, "run_in_foreground");
            int h25 = ld.h(f, "out_of_quota_policy");
            int i = h14;
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                String string = f.getString(h9);
                int i2 = h9;
                String string2 = f.getString(h11);
                int i3 = h11;
                bpu bpuVar = new bpu();
                int i4 = h;
                bpuVar.i = aeh.f(f.getInt(h));
                bpuVar.b = f.getInt(h2) != 0;
                bpuVar.c = f.getInt(h3) != 0;
                bpuVar.d = f.getInt(h4) != 0;
                bpuVar.e = f.getInt(h5) != 0;
                int i5 = h2;
                int i6 = h3;
                bpuVar.f = f.getLong(h6);
                bpuVar.g = f.getLong(h7);
                bpuVar.h = aeh.c(f.getBlob(h8));
                bum bumVar = new bum(string, string2);
                bumVar.r = aeh.g(f.getInt(h10));
                bumVar.e = f.getString(h12);
                bumVar.f = bpx.a(f.getBlob(h13));
                int i7 = i;
                bumVar.g = bpx.a(f.getBlob(i7));
                i = i7;
                int i8 = h15;
                bumVar.h = f.getLong(i8);
                int i9 = h13;
                int i10 = h16;
                bumVar.i = f.getLong(i10);
                int i11 = h4;
                int i12 = h17;
                bumVar.j = f.getLong(i12);
                int i13 = h18;
                bumVar.l = f.getInt(i13);
                int i14 = h19;
                bumVar.s = aeh.e(f.getInt(i14));
                h17 = i12;
                int i15 = h20;
                bumVar.m = f.getLong(i15);
                int i16 = h21;
                bumVar.n = f.getLong(i16);
                h21 = i16;
                int i17 = h22;
                bumVar.o = f.getLong(i17);
                int i18 = h23;
                bumVar.p = f.getLong(i18);
                int i19 = h24;
                bumVar.q = f.getInt(i19) != 0;
                int i20 = h25;
                bumVar.t = aeh.h(f.getInt(i20));
                bumVar.k = bpuVar;
                arrayList.add(bumVar);
                h25 = i20;
                h2 = i5;
                h13 = i9;
                h15 = i8;
                h16 = i10;
                h18 = i13;
                h23 = i18;
                h9 = i2;
                h11 = i3;
                h = i4;
                h24 = i19;
                h22 = i17;
                h3 = i6;
                h20 = i15;
                h4 = i11;
                h19 = i14;
            }
            f.close();
            bkuVar.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            f.close();
            bkuVar.i();
            throw th;
        }
    }

    @Override // defpackage.bun
    public final List c() {
        bku bkuVar;
        int h;
        int h2;
        int h3;
        int h4;
        int h5;
        int h6;
        int h7;
        int h8;
        int h9;
        int h10;
        int h11;
        int h12;
        int h13;
        int h14;
        bku a = bku.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.e();
        Cursor f = ld.f(this.a, a, false);
        try {
            h = ld.h(f, "required_network_type");
            h2 = ld.h(f, "requires_charging");
            h3 = ld.h(f, "requires_device_idle");
            h4 = ld.h(f, "requires_battery_not_low");
            h5 = ld.h(f, "requires_storage_not_low");
            h6 = ld.h(f, "trigger_content_update_delay");
            h7 = ld.h(f, "trigger_max_content_delay");
            h8 = ld.h(f, "content_uri_triggers");
            h9 = ld.h(f, "id");
            h10 = ld.h(f, "state");
            h11 = ld.h(f, "worker_class_name");
            h12 = ld.h(f, "input_merger_class_name");
            h13 = ld.h(f, "input");
            h14 = ld.h(f, "output");
            bkuVar = a;
        } catch (Throwable th) {
            th = th;
            bkuVar = a;
        }
        try {
            int h15 = ld.h(f, "initial_delay");
            int h16 = ld.h(f, "interval_duration");
            int h17 = ld.h(f, "flex_duration");
            int h18 = ld.h(f, "run_attempt_count");
            int h19 = ld.h(f, "backoff_policy");
            int h20 = ld.h(f, "backoff_delay_duration");
            int h21 = ld.h(f, "period_start_time");
            int h22 = ld.h(f, "minimum_retention_duration");
            int h23 = ld.h(f, "schedule_requested_at");
            int h24 = ld.h(f, "run_in_foreground");
            int h25 = ld.h(f, "out_of_quota_policy");
            int i = h14;
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                String string = f.getString(h9);
                int i2 = h9;
                String string2 = f.getString(h11);
                int i3 = h11;
                bpu bpuVar = new bpu();
                int i4 = h;
                bpuVar.i = aeh.f(f.getInt(h));
                bpuVar.b = f.getInt(h2) != 0;
                bpuVar.c = f.getInt(h3) != 0;
                bpuVar.d = f.getInt(h4) != 0;
                bpuVar.e = f.getInt(h5) != 0;
                int i5 = h2;
                int i6 = h3;
                bpuVar.f = f.getLong(h6);
                bpuVar.g = f.getLong(h7);
                bpuVar.h = aeh.c(f.getBlob(h8));
                bum bumVar = new bum(string, string2);
                bumVar.r = aeh.g(f.getInt(h10));
                bumVar.e = f.getString(h12);
                bumVar.f = bpx.a(f.getBlob(h13));
                int i7 = i;
                bumVar.g = bpx.a(f.getBlob(i7));
                i = i7;
                int i8 = h15;
                bumVar.h = f.getLong(i8);
                int i9 = h13;
                int i10 = h16;
                bumVar.i = f.getLong(i10);
                int i11 = h4;
                int i12 = h17;
                bumVar.j = f.getLong(i12);
                int i13 = h18;
                bumVar.l = f.getInt(i13);
                int i14 = h19;
                bumVar.s = aeh.e(f.getInt(i14));
                h17 = i12;
                int i15 = h20;
                bumVar.m = f.getLong(i15);
                int i16 = h21;
                bumVar.n = f.getLong(i16);
                h21 = i16;
                int i17 = h22;
                bumVar.o = f.getLong(i17);
                int i18 = h23;
                bumVar.p = f.getLong(i18);
                int i19 = h24;
                bumVar.q = f.getInt(i19) != 0;
                int i20 = h25;
                bumVar.t = aeh.h(f.getInt(i20));
                bumVar.k = bpuVar;
                arrayList.add(bumVar);
                h25 = i20;
                h2 = i5;
                h13 = i9;
                h15 = i8;
                h16 = i10;
                h18 = i13;
                h23 = i18;
                h9 = i2;
                h11 = i3;
                h = i4;
                h24 = i19;
                h22 = i17;
                h3 = i6;
                h20 = i15;
                h4 = i11;
                h19 = i14;
            }
            f.close();
            bkuVar.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            f.close();
            bkuVar.i();
            throw th;
        }
    }

    @Override // defpackage.bun
    public final List d(String str) {
        bku a = bku.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.e();
        Cursor f = ld.f(this.a, a, false);
        try {
            int h = ld.h(f, "id");
            int h2 = ld.h(f, "state");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                buk bukVar = new buk();
                bukVar.a = f.getString(h);
                bukVar.b = aeh.g(f.getInt(h2));
                arrayList.add(bukVar);
            }
            return arrayList;
        } finally {
            f.close();
            a.i();
        }
    }

    @Override // defpackage.bun
    public final void e(String str) {
        this.a.e();
        bmb d = this.f.d();
        if (str == null) {
            d.e(1);
        } else {
            d.f(1, str);
        }
        this.a.f();
        try {
            d.a();
            this.a.h();
        } finally {
            this.a.g();
            this.f.e(d);
        }
    }

    @Override // defpackage.bun
    public final void f(String str, bpx bpxVar) {
        this.a.e();
        bmb d = this.g.d();
        byte[] e = bpx.e(bpxVar);
        if (e == null) {
            d.e(1);
        } else {
            d.c(1, e);
        }
        if (str == null) {
            d.e(2);
        } else {
            d.f(2, str);
        }
        this.a.f();
        try {
            d.a();
            this.a.h();
        } finally {
            this.a.g();
            this.g.e(d);
        }
    }

    @Override // defpackage.bun
    public final void g(String str, long j) {
        this.a.e();
        bmb d = this.h.d();
        d.d(1, j);
        if (str == null) {
            d.e(2);
        } else {
            d.f(2, str);
        }
        this.a.f();
        try {
            d.a();
            this.a.h();
        } finally {
            this.a.g();
            this.h.e(d);
        }
    }

    @Override // defpackage.bun
    public final int h(String str) {
        bku a = bku.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.e();
        int i = 0;
        Cursor f = ld.f(this.a, a, false);
        try {
            if (f.moveToFirst()) {
                i = aeh.g(f.getInt(0));
            }
            return i;
        } finally {
            f.close();
            a.i();
        }
    }

    @Override // defpackage.bun
    public final List i() {
        bku bkuVar;
        bku a = bku.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        a.d(1, 200L);
        this.a.e();
        Cursor f = ld.f(this.a, a, false);
        try {
            int h = ld.h(f, "required_network_type");
            int h2 = ld.h(f, "requires_charging");
            int h3 = ld.h(f, "requires_device_idle");
            int h4 = ld.h(f, "requires_battery_not_low");
            int h5 = ld.h(f, "requires_storage_not_low");
            int h6 = ld.h(f, "trigger_content_update_delay");
            int h7 = ld.h(f, "trigger_max_content_delay");
            int h8 = ld.h(f, "content_uri_triggers");
            int h9 = ld.h(f, "id");
            int h10 = ld.h(f, "state");
            int h11 = ld.h(f, "worker_class_name");
            int h12 = ld.h(f, "input_merger_class_name");
            int h13 = ld.h(f, "input");
            int h14 = ld.h(f, "output");
            bkuVar = a;
            try {
                int h15 = ld.h(f, "initial_delay");
                int h16 = ld.h(f, "interval_duration");
                int h17 = ld.h(f, "flex_duration");
                int h18 = ld.h(f, "run_attempt_count");
                int h19 = ld.h(f, "backoff_policy");
                int h20 = ld.h(f, "backoff_delay_duration");
                int h21 = ld.h(f, "period_start_time");
                int h22 = ld.h(f, "minimum_retention_duration");
                int h23 = ld.h(f, "schedule_requested_at");
                int h24 = ld.h(f, "run_in_foreground");
                int h25 = ld.h(f, "out_of_quota_policy");
                int i = h14;
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    String string = f.getString(h9);
                    int i2 = h9;
                    String string2 = f.getString(h11);
                    int i3 = h11;
                    bpu bpuVar = new bpu();
                    int i4 = h;
                    bpuVar.i = aeh.f(f.getInt(h));
                    bpuVar.b = f.getInt(h2) != 0;
                    bpuVar.c = f.getInt(h3) != 0;
                    bpuVar.d = f.getInt(h4) != 0;
                    bpuVar.e = f.getInt(h5) != 0;
                    int i5 = h2;
                    int i6 = h3;
                    bpuVar.f = f.getLong(h6);
                    bpuVar.g = f.getLong(h7);
                    bpuVar.h = aeh.c(f.getBlob(h8));
                    bum bumVar = new bum(string, string2);
                    bumVar.r = aeh.g(f.getInt(h10));
                    bumVar.e = f.getString(h12);
                    bumVar.f = bpx.a(f.getBlob(h13));
                    int i7 = i;
                    bumVar.g = bpx.a(f.getBlob(i7));
                    i = i7;
                    int i8 = h15;
                    bumVar.h = f.getLong(i8);
                    int i9 = h12;
                    int i10 = h16;
                    bumVar.i = f.getLong(i10);
                    int i11 = h4;
                    int i12 = h17;
                    bumVar.j = f.getLong(i12);
                    int i13 = h18;
                    bumVar.l = f.getInt(i13);
                    int i14 = h19;
                    bumVar.s = aeh.e(f.getInt(i14));
                    h17 = i12;
                    int i15 = h20;
                    bumVar.m = f.getLong(i15);
                    int i16 = h21;
                    bumVar.n = f.getLong(i16);
                    h21 = i16;
                    int i17 = h22;
                    bumVar.o = f.getLong(i17);
                    int i18 = h23;
                    bumVar.p = f.getLong(i18);
                    int i19 = h24;
                    bumVar.q = f.getInt(i19) != 0;
                    int i20 = h25;
                    bumVar.t = aeh.h(f.getInt(i20));
                    bumVar.k = bpuVar;
                    arrayList.add(bumVar);
                    h25 = i20;
                    h2 = i5;
                    h12 = i9;
                    h15 = i8;
                    h16 = i10;
                    h18 = i13;
                    h23 = i18;
                    h9 = i2;
                    h11 = i3;
                    h = i4;
                    h24 = i19;
                    h22 = i17;
                    h3 = i6;
                    h20 = i15;
                    h4 = i11;
                    h19 = i14;
                }
                f.close();
                bkuVar.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f.close();
                bkuVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bkuVar = a;
        }
    }

    @Override // defpackage.bun
    public final void j(String str, long j) {
        this.a.e();
        bmb d = this.i.d();
        d.d(1, j);
        if (str == null) {
            d.e(2);
        } else {
            d.f(2, str);
        }
        this.a.f();
        try {
            d.a();
            this.a.h();
        } finally {
            this.a.g();
            this.i.e(d);
        }
    }

    @Override // defpackage.bun
    public final void k(int i, String... strArr) {
        this.a.e();
        StringBuilder e = le.e();
        e.append("UPDATE workspec SET state=? WHERE id IN (");
        le.f(e, 1);
        e.append(")");
        bmb j = this.a.j(e.toString());
        j.d(1, aeh.d(i));
        int i2 = 2;
        for (char c = 0; c <= 0; c = 1) {
            String str = strArr[0];
            if (str == null) {
                j.e(i2);
            } else {
                j.f(i2, str);
            }
            i2++;
        }
        this.a.f();
        try {
            j.a();
            this.a.h();
        } finally {
            this.a.g();
        }
    }

    public final void l(afw afwVar) {
        ArrayList arrayList;
        int i;
        Set<String> keySet = afwVar.keySet();
        if (!keySet.isEmpty()) {
            if (afwVar.j > 999) {
                afw afwVar2 = new afw(999);
                int i2 = afwVar.j;
                int i3 = 0;
                loop0: while (true) {
                    i = 0;
                    while (i3 < i2) {
                        afwVar2.put((String) afwVar.f(i3), (ArrayList) afwVar.i(i3));
                        i3++;
                        i++;
                        if (i == 999) {
                            break;
                        }
                    }
                    l(afwVar2);
                    afwVar2 = new afw(999);
                }
                if (i <= 0) {
                    return;
                }
                l(afwVar2);
                return;
            }
            StringBuilder e = le.e();
            e.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            le.f(e, size);
            e.append(")");
            bku a = bku.a(e.toString(), size);
            int i4 = 1;
            for (String str : keySet) {
                if (str == null) {
                    a.e(i4);
                } else {
                    a.f(i4, str);
                }
                i4++;
            }
            Cursor f = ld.f(this.a, a, false);
            try {
                int g = ld.g(f, "work_spec_id");
                if (g == -1) {
                    return;
                }
                while (f.moveToNext()) {
                    if (!f.isNull(g) && (arrayList = (ArrayList) afwVar.get(f.getString(g))) != null) {
                        arrayList.add(bpx.a(f.getBlob(0)));
                    }
                }
            } finally {
                f.close();
            }
        }
    }

    public final void m(afw afwVar) {
        ArrayList arrayList;
        int i;
        Set<String> keySet = afwVar.keySet();
        if (!keySet.isEmpty()) {
            if (afwVar.j > 999) {
                afw afwVar2 = new afw(999);
                int i2 = afwVar.j;
                int i3 = 0;
                loop0: while (true) {
                    i = 0;
                    while (i3 < i2) {
                        afwVar2.put((String) afwVar.f(i3), (ArrayList) afwVar.i(i3));
                        i3++;
                        i++;
                        if (i == 999) {
                            break;
                        }
                    }
                    m(afwVar2);
                    afwVar2 = new afw(999);
                }
                if (i <= 0) {
                    return;
                }
                m(afwVar2);
                return;
            }
            StringBuilder e = le.e();
            e.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            le.f(e, size);
            e.append(")");
            bku a = bku.a(e.toString(), size);
            int i4 = 1;
            for (String str : keySet) {
                if (str == null) {
                    a.e(i4);
                } else {
                    a.f(i4, str);
                }
                i4++;
            }
            Cursor f = ld.f(this.a, a, false);
            try {
                int g = ld.g(f, "work_spec_id");
                if (g == -1) {
                    return;
                }
                while (f.moveToNext()) {
                    if (!f.isNull(g) && (arrayList = (ArrayList) afwVar.get(f.getString(g))) != null) {
                        arrayList.add(f.getString(0));
                    }
                }
            } finally {
                f.close();
            }
        }
    }
}
