package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;
/* compiled from: PG */
/* renamed from: coyf  reason: default package */
/* loaded from: classes5.dex */
public final class coyf extends coye {
    private final SharedPreferences d;

    public coyf(coxz coxzVar, String str, SharedPreferences sharedPreferences) {
        super(coxzVar, str);
        this.d = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.coye
    public final boolean a(Configurations configurations) {
        boolean f = f(this.d, configurations);
        cxjw.c();
        return f;
    }

    @Override // defpackage.coye
    @dzsi
    protected final String b() {
        return this.d.getString("__phenotype_snapshot_token", null);
    }
}
