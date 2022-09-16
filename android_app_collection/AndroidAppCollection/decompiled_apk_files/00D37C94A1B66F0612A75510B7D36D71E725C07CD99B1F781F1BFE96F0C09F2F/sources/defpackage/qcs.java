package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qcs  reason: default package */
/* loaded from: classes4.dex */
public final class qcs extends qcv {
    public qcs(String str, Long l) {
        super(1, str, l);
    }

    @Override // defpackage.qcv
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.b, ((Long) this.c).longValue()));
    }

    @Override // defpackage.qcv
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        if (bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            String str2 = this.b;
            return Long.valueOf(bundle.getLong(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
        }
        return (Long) this.c;
    }

    @Override // defpackage.qcv
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.b, ((Long) this.c).longValue()));
    }
}
