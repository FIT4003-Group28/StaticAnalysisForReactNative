package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: afsd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afsd implements Runnable {
    public final /* synthetic */ afse a;
    private final /* synthetic */ int b;

    public /* synthetic */ afsd(afse afseVar, int i) {
        this.b = i;
        this.a = afseVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ((afui) this.a.a.get()).a();
            return;
        }
        afse afseVar = this.a;
        if (!((SharedPreferences) afseVar.c.get()).contains("ap_dev_reg")) {
            return;
        }
        ((SharedPreferences) afseVar.c.get()).edit().remove("ap_dev_reg").remove(String.format("%s_%s", "apiary_device_id", afseVar.d.get())).remove(String.format("%s_%s", "apiary_device_key", afseVar.d.get())).commit();
    }
}
