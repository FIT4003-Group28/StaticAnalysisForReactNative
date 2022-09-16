package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qcr  reason: default package */
/* loaded from: classes4.dex */
public final class qcr extends qcv {
    public qcr(String str, Integer num) {
        super(1, str, num);
    }

    @Override // defpackage.qcv
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.b, ((Integer) this.c).intValue()));
    }

    @Override // defpackage.qcv
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        if (bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            String str2 = this.b;
            return Integer.valueOf(bundle.getInt(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
        }
        return (Integer) this.c;
    }

    @Override // defpackage.qcv
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.b, ((Integer) this.c).intValue()));
    }
}
