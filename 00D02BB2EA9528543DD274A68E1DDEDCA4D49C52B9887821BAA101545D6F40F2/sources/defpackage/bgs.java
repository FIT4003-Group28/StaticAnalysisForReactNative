package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgs  reason: default package */
/* loaded from: classes3.dex */
public final class bgs implements bgi {
    private final bn a;
    private final bc<bgh> b;
    private final bt c;
    private final bt d;
    private final bt e;
    private final bt f;
    private final bt g;
    private final bt h;
    private final bt i;

    public bgs(bn bnVar) {
        this.a = bnVar;
        this.b = new bgj(bnVar);
        this.c = new bgk(bnVar);
        this.d = new bgl(bnVar);
        this.e = new bgm(bnVar);
        this.f = new bgn(bnVar);
        this.g = new bgo(bnVar);
        this.h = new bgp(bnVar);
        this.i = new bgq(bnVar);
        new bgr(bnVar);
    }

    @Override // defpackage.bgi
    public final void a(bgh bghVar) {
        this.a.E();
        this.a.F();
        try {
            this.b.a(bghVar);
            this.a.l();
        } finally {
            this.a.k();
        }
    }

    @Override // defpackage.bgi
    public final void b(String str) {
        this.a.E();
        awj e = this.c.e();
        if (str == null) {
            e.f(1);
        } else {
            e.i(1, str);
        }
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.c.f(e);
        }
    }

    @Override // defpackage.bgi
    public final bgh c(String str) {
        br brVar;
        bgh bghVar;
        br a = br.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.f(1);
        } else {
            a.i(1, str);
        }
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int a2 = bx.a(q, "required_network_type");
            int a3 = bx.a(q, "requires_charging");
            int a4 = bx.a(q, "requires_device_idle");
            int a5 = bx.a(q, "requires_battery_not_low");
            int a6 = bx.a(q, "requires_storage_not_low");
            int a7 = bx.a(q, "trigger_content_update_delay");
            int a8 = bx.a(q, "trigger_max_content_delay");
            int a9 = bx.a(q, "content_uri_triggers");
            int a10 = bx.a(q, "id");
            int a11 = bx.a(q, "state");
            int a12 = bx.a(q, "worker_class_name");
            int a13 = bx.a(q, "input_merger_class_name");
            int a14 = bx.a(q, "input");
            int a15 = bx.a(q, "output");
            brVar = a;
            try {
                int a16 = bx.a(q, "initial_delay");
                int a17 = bx.a(q, "interval_duration");
                int a18 = bx.a(q, "flex_duration");
                int a19 = bx.a(q, "run_attempt_count");
                int a20 = bx.a(q, "backoff_policy");
                int a21 = bx.a(q, "backoff_delay_duration");
                int a22 = bx.a(q, "period_start_time");
                int a23 = bx.a(q, "minimum_retention_duration");
                int a24 = bx.a(q, "schedule_requested_at");
                int a25 = bx.a(q, "run_in_foreground");
                if (q.moveToFirst()) {
                    String string = q.getString(a10);
                    String string2 = q.getString(a12);
                    bbl bblVar = new bbl();
                    bblVar.i = bgw.e(q.getInt(a2));
                    bblVar.b = q.getInt(a3) != 0;
                    bblVar.c = q.getInt(a4) != 0;
                    bblVar.d = q.getInt(a5) != 0;
                    bblVar.e = q.getInt(a6) != 0;
                    bblVar.f = q.getLong(a7);
                    bblVar.g = q.getLong(a8);
                    bblVar.h = bgw.a(q.getBlob(a9));
                    bghVar = new bgh(string, string2);
                    bghVar.p = bgw.c(q.getInt(a11));
                    bghVar.c = q.getString(a13);
                    bghVar.d = bbp.g(q.getBlob(a14));
                    bghVar.e = bbp.g(q.getBlob(a15));
                    bghVar.f = q.getLong(a16);
                    bghVar.g = q.getLong(a17);
                    bghVar.h = q.getLong(a18);
                    bghVar.j = q.getInt(a19);
                    bghVar.q = bgw.d(q.getInt(a20));
                    bghVar.k = q.getLong(a21);
                    bghVar.l = q.getLong(a22);
                    bghVar.m = q.getLong(a23);
                    bghVar.n = q.getLong(a24);
                    bghVar.o = q.getInt(a25) != 0;
                    bghVar.i = bblVar;
                } else {
                    bghVar = null;
                }
                q.close();
                brVar.c();
                return bghVar;
            } catch (Throwable th) {
                th = th;
                q.close();
                brVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            brVar = a;
        }
    }

    @Override // defpackage.bgi
    public final List<bgg> d(String str) {
        br a = br.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.f(1);
        } else {
            a.i(1, str);
        }
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int a2 = bx.a(q, "id");
            int a3 = bx.a(q, "state");
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                bgg bggVar = new bgg();
                bggVar.a = q.getString(a2);
                bggVar.b = bgw.c(q.getInt(a3));
                arrayList.add(bggVar);
            }
            return arrayList;
        } finally {
            q.close();
            a.c();
        }
    }

    @Override // defpackage.bgi
    public final void e(String str, bbp bbpVar) {
        this.a.E();
        awj e = this.d.e();
        byte[] f = bbp.f(bbpVar);
        if (f == null) {
            e.f(1);
        } else {
            e.j(1, f);
        }
        if (str == null) {
            e.f(2);
        } else {
            e.i(2, str);
        }
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.d.f(e);
        }
    }

    @Override // defpackage.bgi
    public final void f(String str, long j) {
        this.a.E();
        awj e = this.e.e();
        e.g(1, j);
        if (str == null) {
            e.f(2);
        } else {
            e.i(2, str);
        }
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.e.f(e);
        }
    }

    @Override // defpackage.bgi
    public final List<bbp> g(String str) {
        br a = br.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a.f(1);
        } else {
            a.i(1, str);
        }
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                arrayList.add(bbp.g(q.getBlob(0)));
            }
            return arrayList;
        } finally {
            q.close();
            a.c();
        }
    }

    @Override // defpackage.bgi
    public final List<String> h(String str) {
        br a = br.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        a.i(1, str);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                arrayList.add(q.getString(0));
            }
            return arrayList;
        } finally {
            q.close();
            a.c();
        }
    }

    @Override // defpackage.bgi
    public final List<String> i(String str) {
        br a = br.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.f(1);
        } else {
            a.i(1, str);
        }
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                arrayList.add(q.getString(0));
            }
            return arrayList;
        } finally {
            q.close();
            a.c();
        }
    }

    @Override // defpackage.bgi
    public final List<String> j() {
        br a = br.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                arrayList.add(q.getString(0));
            }
            return arrayList;
        } finally {
            q.close();
            a.c();
        }
    }

    @Override // defpackage.bgi
    public final List<bgh> k(int i) {
        br brVar;
        br a = br.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a.g(1, i);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int a2 = bx.a(q, "required_network_type");
            int a3 = bx.a(q, "requires_charging");
            int a4 = bx.a(q, "requires_device_idle");
            int a5 = bx.a(q, "requires_battery_not_low");
            int a6 = bx.a(q, "requires_storage_not_low");
            int a7 = bx.a(q, "trigger_content_update_delay");
            int a8 = bx.a(q, "trigger_max_content_delay");
            int a9 = bx.a(q, "content_uri_triggers");
            int a10 = bx.a(q, "id");
            int a11 = bx.a(q, "state");
            int a12 = bx.a(q, "worker_class_name");
            int a13 = bx.a(q, "input_merger_class_name");
            int a14 = bx.a(q, "input");
            int a15 = bx.a(q, "output");
            brVar = a;
            try {
                int a16 = bx.a(q, "initial_delay");
                int a17 = bx.a(q, "interval_duration");
                int a18 = bx.a(q, "flex_duration");
                int a19 = bx.a(q, "run_attempt_count");
                int a20 = bx.a(q, "backoff_policy");
                int a21 = bx.a(q, "backoff_delay_duration");
                int a22 = bx.a(q, "period_start_time");
                int a23 = bx.a(q, "minimum_retention_duration");
                int a24 = bx.a(q, "schedule_requested_at");
                int a25 = bx.a(q, "run_in_foreground");
                int i2 = a15;
                ArrayList arrayList = new ArrayList(q.getCount());
                while (q.moveToNext()) {
                    String string = q.getString(a10);
                    int i3 = a10;
                    String string2 = q.getString(a12);
                    int i4 = a12;
                    bbl bblVar = new bbl();
                    int i5 = a2;
                    bblVar.i = bgw.e(q.getInt(a2));
                    bblVar.b = q.getInt(a3) != 0;
                    bblVar.c = q.getInt(a4) != 0;
                    bblVar.d = q.getInt(a5) != 0;
                    bblVar.e = q.getInt(a6) != 0;
                    int i6 = a3;
                    int i7 = a4;
                    bblVar.f = q.getLong(a7);
                    bblVar.g = q.getLong(a8);
                    bblVar.h = bgw.a(q.getBlob(a9));
                    bgh bghVar = new bgh(string, string2);
                    bghVar.p = bgw.c(q.getInt(a11));
                    bghVar.c = q.getString(a13);
                    bghVar.d = bbp.g(q.getBlob(a14));
                    int i8 = i2;
                    bghVar.e = bbp.g(q.getBlob(i8));
                    int i9 = a16;
                    i2 = i8;
                    bghVar.f = q.getLong(i9);
                    int i10 = a14;
                    int i11 = a17;
                    bghVar.g = q.getLong(i11);
                    int i12 = a5;
                    int i13 = a18;
                    bghVar.h = q.getLong(i13);
                    int i14 = a19;
                    bghVar.j = q.getInt(i14);
                    int i15 = a20;
                    bghVar.q = bgw.d(q.getInt(i15));
                    a18 = i13;
                    int i16 = a21;
                    bghVar.k = q.getLong(i16);
                    int i17 = a22;
                    bghVar.l = q.getLong(i17);
                    a22 = i17;
                    int i18 = a23;
                    bghVar.m = q.getLong(i18);
                    int i19 = a24;
                    bghVar.n = q.getLong(i19);
                    int i20 = a25;
                    bghVar.o = q.getInt(i20) != 0;
                    bghVar.i = bblVar;
                    arrayList.add(bghVar);
                    a3 = i6;
                    a24 = i19;
                    a25 = i20;
                    a14 = i10;
                    a16 = i9;
                    a17 = i11;
                    a19 = i14;
                    a10 = i3;
                    a12 = i4;
                    a2 = i5;
                    a23 = i18;
                    a4 = i7;
                    a21 = i16;
                    a5 = i12;
                    a20 = i15;
                }
                q.close();
                brVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                q.close();
                brVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            brVar = a;
        }
    }

    @Override // defpackage.bgi
    public final List<bgh> l() {
        br brVar;
        br a = br.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int a2 = bx.a(q, "required_network_type");
            int a3 = bx.a(q, "requires_charging");
            int a4 = bx.a(q, "requires_device_idle");
            int a5 = bx.a(q, "requires_battery_not_low");
            int a6 = bx.a(q, "requires_storage_not_low");
            int a7 = bx.a(q, "trigger_content_update_delay");
            int a8 = bx.a(q, "trigger_max_content_delay");
            int a9 = bx.a(q, "content_uri_triggers");
            int a10 = bx.a(q, "id");
            int a11 = bx.a(q, "state");
            int a12 = bx.a(q, "worker_class_name");
            int a13 = bx.a(q, "input_merger_class_name");
            int a14 = bx.a(q, "input");
            int a15 = bx.a(q, "output");
            brVar = a;
            try {
                int a16 = bx.a(q, "initial_delay");
                int a17 = bx.a(q, "interval_duration");
                int a18 = bx.a(q, "flex_duration");
                int a19 = bx.a(q, "run_attempt_count");
                int a20 = bx.a(q, "backoff_policy");
                int a21 = bx.a(q, "backoff_delay_duration");
                int a22 = bx.a(q, "period_start_time");
                int a23 = bx.a(q, "minimum_retention_duration");
                int a24 = bx.a(q, "schedule_requested_at");
                int a25 = bx.a(q, "run_in_foreground");
                int i = a15;
                ArrayList arrayList = new ArrayList(q.getCount());
                while (q.moveToNext()) {
                    String string = q.getString(a10);
                    int i2 = a10;
                    String string2 = q.getString(a12);
                    int i3 = a12;
                    bbl bblVar = new bbl();
                    int i4 = a2;
                    bblVar.i = bgw.e(q.getInt(a2));
                    bblVar.b = q.getInt(a3) != 0;
                    bblVar.c = q.getInt(a4) != 0;
                    bblVar.d = q.getInt(a5) != 0;
                    bblVar.e = q.getInt(a6) != 0;
                    int i5 = a3;
                    int i6 = a4;
                    bblVar.f = q.getLong(a7);
                    bblVar.g = q.getLong(a8);
                    bblVar.h = bgw.a(q.getBlob(a9));
                    bgh bghVar = new bgh(string, string2);
                    bghVar.p = bgw.c(q.getInt(a11));
                    bghVar.c = q.getString(a13);
                    bghVar.d = bbp.g(q.getBlob(a14));
                    int i7 = i;
                    bghVar.e = bbp.g(q.getBlob(i7));
                    i = i7;
                    int i8 = a16;
                    bghVar.f = q.getLong(i8);
                    int i9 = a14;
                    int i10 = a17;
                    bghVar.g = q.getLong(i10);
                    int i11 = a5;
                    int i12 = a18;
                    bghVar.h = q.getLong(i12);
                    int i13 = a19;
                    bghVar.j = q.getInt(i13);
                    int i14 = a20;
                    bghVar.q = bgw.d(q.getInt(i14));
                    a18 = i12;
                    int i15 = a21;
                    bghVar.k = q.getLong(i15);
                    int i16 = a22;
                    bghVar.l = q.getLong(i16);
                    a22 = i16;
                    int i17 = a23;
                    bghVar.m = q.getLong(i17);
                    int i18 = a24;
                    bghVar.n = q.getLong(i18);
                    int i19 = a25;
                    bghVar.o = q.getInt(i19) != 0;
                    bghVar.i = bblVar;
                    arrayList.add(bghVar);
                    a24 = i18;
                    a25 = i19;
                    a3 = i5;
                    a14 = i9;
                    a16 = i8;
                    a17 = i10;
                    a19 = i13;
                    a10 = i2;
                    a12 = i3;
                    a2 = i4;
                    a23 = i17;
                    a4 = i6;
                    a21 = i15;
                    a5 = i11;
                    a20 = i14;
                }
                q.close();
                brVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                q.close();
                brVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            brVar = a;
        }
    }

    @Override // defpackage.bgi
    public final List<bgh> m() {
        br brVar;
        br a = br.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int a2 = bx.a(q, "required_network_type");
            int a3 = bx.a(q, "requires_charging");
            int a4 = bx.a(q, "requires_device_idle");
            int a5 = bx.a(q, "requires_battery_not_low");
            int a6 = bx.a(q, "requires_storage_not_low");
            int a7 = bx.a(q, "trigger_content_update_delay");
            int a8 = bx.a(q, "trigger_max_content_delay");
            int a9 = bx.a(q, "content_uri_triggers");
            int a10 = bx.a(q, "id");
            int a11 = bx.a(q, "state");
            int a12 = bx.a(q, "worker_class_name");
            int a13 = bx.a(q, "input_merger_class_name");
            int a14 = bx.a(q, "input");
            int a15 = bx.a(q, "output");
            brVar = a;
            try {
                int a16 = bx.a(q, "initial_delay");
                int a17 = bx.a(q, "interval_duration");
                int a18 = bx.a(q, "flex_duration");
                int a19 = bx.a(q, "run_attempt_count");
                int a20 = bx.a(q, "backoff_policy");
                int a21 = bx.a(q, "backoff_delay_duration");
                int a22 = bx.a(q, "period_start_time");
                int a23 = bx.a(q, "minimum_retention_duration");
                int a24 = bx.a(q, "schedule_requested_at");
                int a25 = bx.a(q, "run_in_foreground");
                int i = a15;
                ArrayList arrayList = new ArrayList(q.getCount());
                while (q.moveToNext()) {
                    String string = q.getString(a10);
                    int i2 = a10;
                    String string2 = q.getString(a12);
                    int i3 = a12;
                    bbl bblVar = new bbl();
                    int i4 = a2;
                    bblVar.i = bgw.e(q.getInt(a2));
                    bblVar.b = q.getInt(a3) != 0;
                    bblVar.c = q.getInt(a4) != 0;
                    bblVar.d = q.getInt(a5) != 0;
                    bblVar.e = q.getInt(a6) != 0;
                    int i5 = a3;
                    int i6 = a4;
                    bblVar.f = q.getLong(a7);
                    bblVar.g = q.getLong(a8);
                    bblVar.h = bgw.a(q.getBlob(a9));
                    bgh bghVar = new bgh(string, string2);
                    bghVar.p = bgw.c(q.getInt(a11));
                    bghVar.c = q.getString(a13);
                    bghVar.d = bbp.g(q.getBlob(a14));
                    int i7 = i;
                    bghVar.e = bbp.g(q.getBlob(i7));
                    i = i7;
                    int i8 = a16;
                    bghVar.f = q.getLong(i8);
                    int i9 = a14;
                    int i10 = a17;
                    bghVar.g = q.getLong(i10);
                    int i11 = a5;
                    int i12 = a18;
                    bghVar.h = q.getLong(i12);
                    int i13 = a19;
                    bghVar.j = q.getInt(i13);
                    int i14 = a20;
                    bghVar.q = bgw.d(q.getInt(i14));
                    a18 = i12;
                    int i15 = a21;
                    bghVar.k = q.getLong(i15);
                    int i16 = a22;
                    bghVar.l = q.getLong(i16);
                    a22 = i16;
                    int i17 = a23;
                    bghVar.m = q.getLong(i17);
                    int i18 = a24;
                    bghVar.n = q.getLong(i18);
                    int i19 = a25;
                    bghVar.o = q.getInt(i19) != 0;
                    bghVar.i = bblVar;
                    arrayList.add(bghVar);
                    a24 = i18;
                    a25 = i19;
                    a3 = i5;
                    a14 = i9;
                    a16 = i8;
                    a17 = i10;
                    a19 = i13;
                    a10 = i2;
                    a12 = i3;
                    a2 = i4;
                    a23 = i17;
                    a4 = i6;
                    a21 = i15;
                    a5 = i11;
                    a20 = i14;
                }
                q.close();
                brVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                q.close();
                brVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            brVar = a;
        }
    }

    @Override // defpackage.bgi
    public final List<bgh> n(long j) {
        br brVar;
        br a = br.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        a.g(1, j);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int a2 = bx.a(q, "required_network_type");
            int a3 = bx.a(q, "requires_charging");
            int a4 = bx.a(q, "requires_device_idle");
            int a5 = bx.a(q, "requires_battery_not_low");
            int a6 = bx.a(q, "requires_storage_not_low");
            int a7 = bx.a(q, "trigger_content_update_delay");
            int a8 = bx.a(q, "trigger_max_content_delay");
            int a9 = bx.a(q, "content_uri_triggers");
            int a10 = bx.a(q, "id");
            int a11 = bx.a(q, "state");
            int a12 = bx.a(q, "worker_class_name");
            int a13 = bx.a(q, "input_merger_class_name");
            int a14 = bx.a(q, "input");
            int a15 = bx.a(q, "output");
            brVar = a;
            try {
                int a16 = bx.a(q, "initial_delay");
                int a17 = bx.a(q, "interval_duration");
                int a18 = bx.a(q, "flex_duration");
                int a19 = bx.a(q, "run_attempt_count");
                int a20 = bx.a(q, "backoff_policy");
                int a21 = bx.a(q, "backoff_delay_duration");
                int a22 = bx.a(q, "period_start_time");
                int a23 = bx.a(q, "minimum_retention_duration");
                int a24 = bx.a(q, "schedule_requested_at");
                int a25 = bx.a(q, "run_in_foreground");
                int i = a15;
                ArrayList arrayList = new ArrayList(q.getCount());
                while (q.moveToNext()) {
                    String string = q.getString(a10);
                    int i2 = a10;
                    String string2 = q.getString(a12);
                    int i3 = a12;
                    bbl bblVar = new bbl();
                    int i4 = a2;
                    bblVar.i = bgw.e(q.getInt(a2));
                    bblVar.b = q.getInt(a3) != 0;
                    bblVar.c = q.getInt(a4) != 0;
                    bblVar.d = q.getInt(a5) != 0;
                    bblVar.e = q.getInt(a6) != 0;
                    int i5 = a3;
                    int i6 = a4;
                    bblVar.f = q.getLong(a7);
                    bblVar.g = q.getLong(a8);
                    bblVar.h = bgw.a(q.getBlob(a9));
                    bgh bghVar = new bgh(string, string2);
                    bghVar.p = bgw.c(q.getInt(a11));
                    bghVar.c = q.getString(a13);
                    bghVar.d = bbp.g(q.getBlob(a14));
                    int i7 = i;
                    bghVar.e = bbp.g(q.getBlob(i7));
                    int i8 = a16;
                    i = i7;
                    bghVar.f = q.getLong(i8);
                    int i9 = a17;
                    int i10 = a14;
                    bghVar.g = q.getLong(i9);
                    int i11 = a5;
                    int i12 = a18;
                    bghVar.h = q.getLong(i12);
                    int i13 = a19;
                    bghVar.j = q.getInt(i13);
                    int i14 = a20;
                    bghVar.q = bgw.d(q.getInt(i14));
                    a18 = i12;
                    int i15 = a21;
                    bghVar.k = q.getLong(i15);
                    int i16 = a22;
                    bghVar.l = q.getLong(i16);
                    a22 = i16;
                    int i17 = a23;
                    bghVar.m = q.getLong(i17);
                    int i18 = a24;
                    bghVar.n = q.getLong(i18);
                    int i19 = a25;
                    bghVar.o = q.getInt(i19) != 0;
                    bghVar.i = bblVar;
                    arrayList.add(bghVar);
                    a3 = i5;
                    a14 = i10;
                    a24 = i18;
                    a25 = i19;
                    a16 = i8;
                    a17 = i9;
                    a19 = i13;
                    a10 = i2;
                    a12 = i3;
                    a2 = i4;
                    a23 = i17;
                    a4 = i6;
                    a21 = i15;
                    a5 = i11;
                    a20 = i14;
                }
                q.close();
                brVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                q.close();
                brVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            brVar = a;
        }
    }

    @Override // defpackage.bgi
    public final int o(String str) {
        br a = br.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.f(1);
        } else {
            a.i(1, str);
        }
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int i = 0;
            if (q.moveToFirst()) {
                i = bgw.c(q.getInt(0));
            }
            return i;
        } finally {
            q.close();
            a.c();
        }
    }

    @Override // defpackage.bgi
    public final List<bgh> p() {
        br brVar;
        br a = br.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        a.g(1, 200L);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int a2 = bx.a(q, "required_network_type");
            int a3 = bx.a(q, "requires_charging");
            int a4 = bx.a(q, "requires_device_idle");
            int a5 = bx.a(q, "requires_battery_not_low");
            int a6 = bx.a(q, "requires_storage_not_low");
            int a7 = bx.a(q, "trigger_content_update_delay");
            int a8 = bx.a(q, "trigger_max_content_delay");
            int a9 = bx.a(q, "content_uri_triggers");
            int a10 = bx.a(q, "id");
            int a11 = bx.a(q, "state");
            int a12 = bx.a(q, "worker_class_name");
            int a13 = bx.a(q, "input_merger_class_name");
            int a14 = bx.a(q, "input");
            int a15 = bx.a(q, "output");
            brVar = a;
            try {
                int a16 = bx.a(q, "initial_delay");
                int a17 = bx.a(q, "interval_duration");
                int a18 = bx.a(q, "flex_duration");
                int a19 = bx.a(q, "run_attempt_count");
                int a20 = bx.a(q, "backoff_policy");
                int a21 = bx.a(q, "backoff_delay_duration");
                int a22 = bx.a(q, "period_start_time");
                int a23 = bx.a(q, "minimum_retention_duration");
                int a24 = bx.a(q, "schedule_requested_at");
                int a25 = bx.a(q, "run_in_foreground");
                int i = a15;
                ArrayList arrayList = new ArrayList(q.getCount());
                while (q.moveToNext()) {
                    String string = q.getString(a10);
                    int i2 = a10;
                    String string2 = q.getString(a12);
                    int i3 = a12;
                    bbl bblVar = new bbl();
                    int i4 = a2;
                    bblVar.i = bgw.e(q.getInt(a2));
                    bblVar.b = q.getInt(a3) != 0;
                    bblVar.c = q.getInt(a4) != 0;
                    bblVar.d = q.getInt(a5) != 0;
                    bblVar.e = q.getInt(a6) != 0;
                    int i5 = a3;
                    int i6 = a4;
                    bblVar.f = q.getLong(a7);
                    bblVar.g = q.getLong(a8);
                    bblVar.h = bgw.a(q.getBlob(a9));
                    bgh bghVar = new bgh(string, string2);
                    bghVar.p = bgw.c(q.getInt(a11));
                    bghVar.c = q.getString(a13);
                    bghVar.d = bbp.g(q.getBlob(a14));
                    int i7 = i;
                    bghVar.e = bbp.g(q.getBlob(i7));
                    i = i7;
                    int i8 = a16;
                    bghVar.f = q.getLong(i8);
                    int i9 = a14;
                    int i10 = a17;
                    bghVar.g = q.getLong(i10);
                    int i11 = a5;
                    int i12 = a18;
                    bghVar.h = q.getLong(i12);
                    int i13 = a19;
                    bghVar.j = q.getInt(i13);
                    int i14 = a20;
                    bghVar.q = bgw.d(q.getInt(i14));
                    a18 = i12;
                    int i15 = a21;
                    bghVar.k = q.getLong(i15);
                    int i16 = a22;
                    bghVar.l = q.getLong(i16);
                    a22 = i16;
                    int i17 = a23;
                    bghVar.m = q.getLong(i17);
                    int i18 = a24;
                    bghVar.n = q.getLong(i18);
                    int i19 = a25;
                    bghVar.o = q.getInt(i19) != 0;
                    bghVar.i = bblVar;
                    arrayList.add(bghVar);
                    a24 = i18;
                    a25 = i19;
                    a3 = i5;
                    a14 = i9;
                    a16 = i8;
                    a17 = i10;
                    a19 = i13;
                    a10 = i2;
                    a12 = i3;
                    a2 = i4;
                    a23 = i17;
                    a4 = i6;
                    a21 = i15;
                    a5 = i11;
                    a20 = i14;
                }
                q.close();
                brVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                q.close();
                brVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            brVar = a;
        }
    }

    @Override // defpackage.bgi
    public final void q(String str) {
        this.a.E();
        awj e = this.f.e();
        if (str == null) {
            e.f(1);
        } else {
            e.i(1, str);
        }
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.f.f(e);
        }
    }

    @Override // defpackage.bgi
    public final void r(String str, long j) {
        this.a.E();
        awj e = this.h.e();
        e.g(1, j);
        if (str == null) {
            e.f(2);
        } else {
            e.i(2, str);
        }
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.h.f(e);
        }
    }

    @Override // defpackage.bgi
    public final void s() {
        this.a.E();
        awj e = this.i.e();
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.i.f(e);
        }
    }

    @Override // defpackage.bgi
    public final void t(String str) {
        this.a.E();
        awj e = this.g.e();
        if (str == null) {
            e.f(1);
        } else {
            e.i(1, str);
        }
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.g.f(e);
        }
    }

    @Override // defpackage.bgi
    public final void u(int i, String... strArr) {
        this.a.E();
        StringBuilder a = ca.a();
        a.append("UPDATE workspec SET state=");
        a.append("?");
        a.append(" WHERE id IN (");
        ca.b(a, strArr.length);
        a.append(")");
        awj p = this.a.p(a.toString());
        p.g(1, bgw.b(i));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                p.f(i2);
            } else {
                p.i(i2, str);
            }
            i2++;
        }
        this.a.F();
        try {
            p.a();
            this.a.l();
        } finally {
            this.a.k();
        }
    }
}
