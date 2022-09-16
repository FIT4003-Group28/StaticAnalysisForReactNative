package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ljc  reason: default package */
/* loaded from: classes3.dex */
public final class ljc implements zbu {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ Context b;
    final /* synthetic */ yve c;

    public ljc(SharedPreferences sharedPreferences, Context context, yve yveVar) {
        this.a = sharedPreferences;
        this.b = context;
        this.c = yveVar;
    }

    @Override // defpackage.zbu
    public final ankt a() {
        boolean equals = this.a.getString(ymf.UPLOAD_NETWORK_POLICY, "").equals(this.b.getString(R.string.upload_network_policy_pref_value_wifi));
        return anii.h(this.c.b(new ehf(equals, 16)), new ehf(equals, 17), anjk.a);
    }

    @Override // defpackage.zbu
    public final /* bridge */ /* synthetic */ ankt b(Object obj) {
        String string;
        Boolean bool = (Boolean) obj;
        SharedPreferences.Editor edit = this.a.edit();
        if (bool.booleanValue()) {
            string = this.b.getString(R.string.upload_network_policy_pref_value_wifi);
        } else {
            string = this.b.getString(R.string.upload_network_policy_pref_value_any);
        }
        edit.putString(ymf.UPLOAD_NETWORK_POLICY, string).apply();
        return this.c.b(new liw(bool, 4));
    }
}
