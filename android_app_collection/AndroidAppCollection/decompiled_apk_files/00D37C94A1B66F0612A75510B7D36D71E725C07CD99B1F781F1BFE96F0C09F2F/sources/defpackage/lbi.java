package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: lbi  reason: default package */
/* loaded from: classes3.dex */
public final class lbi implements akgt {
    private static final long a = TimeUnit.MINUTES.toSeconds(60);
    private final SharedPreferences b;
    private final aacz c;

    static {
        TimeUnit.MINUTES.toSeconds(300L);
    }

    public lbi(SharedPreferences sharedPreferences, aacz aaczVar) {
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        aaczVar.getClass();
        this.c = aaczVar;
    }

    @Override // defpackage.akgt
    public final int a() {
        int aa = eog.aa(this.c);
        if (aa > 0) {
            return aa;
        }
        return 10;
    }

    @Override // defpackage.akgt
    public final int b() {
        int ab = eog.ab(this.c);
        if (ab > 0) {
            return ab;
        }
        return 2;
    }

    @Override // defpackage.akgt
    public final int c() {
        int ac = eog.ac(this.c);
        if (ac > 0) {
            return ac;
        }
        return 300;
    }

    @Override // defpackage.akgt
    public final long d() {
        long parseLong = Long.parseLong(this.b.getString("on_device_suggest_download_earliest_secs", "-1"));
        return parseLong == -1 ? a : parseLong;
    }

    @Override // defpackage.akgt
    public final ampq e() {
        return ampq.i(this.b.getString("current_on_device_suggest_index_url", null));
    }

    @Override // defpackage.akgt
    public final ampq f() {
        return ampq.i(this.b.getString("latest_on_device_suggest_index_url", null));
    }

    @Override // defpackage.akgt
    public final ampq g() {
        return ampq.i(this.b.getString("on_device_suggest_index_file", null));
    }

    @Override // defpackage.akgt
    public final ampq h() {
        return ampq.i(this.b.getString("on_device_suggest_index_language", null));
    }

    @Override // defpackage.akgt
    public final void i(String str) {
        this.b.edit().putString("current_on_device_suggest_index_url", str).apply();
    }

    @Override // defpackage.akgt
    public final void j(String str) {
        this.b.edit().putString("on_device_suggest_index_file", str).apply();
    }

    @Override // defpackage.akgt
    public final void k(String str) {
        this.b.edit().putString("on_device_suggest_index_language", str).apply();
    }

    @Override // defpackage.akgt
    public final boolean l() {
        return this.b.getBoolean("enable_on_device_suggest", false);
    }

    @Override // defpackage.akgt
    public final boolean m() {
        return this.b.getBoolean("enable_on_device_suggest_counterfactual_logging", false);
    }

    @Override // defpackage.akgt
    public final void n() {
        Long.parseLong(this.b.getString("on_device_suggest_download_latest_secs", "-1"));
    }
}
