package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qcq  reason: default package */
/* loaded from: classes4.dex */
public final class qcq extends qcv {
    public qcq(int i, String str, Boolean bool) {
        super(i, str, bool);
    }

    @Override // defpackage.qcv
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.b, ((Boolean) this.c).booleanValue()));
    }

    @Override // defpackage.qcv
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        if (bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            String str2 = this.b;
            return Boolean.valueOf(bundle.getBoolean(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
        }
        return (Boolean) this.c;
    }

    @Override // defpackage.qcv
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.b, ((Boolean) this.c).booleanValue()));
    }
}
