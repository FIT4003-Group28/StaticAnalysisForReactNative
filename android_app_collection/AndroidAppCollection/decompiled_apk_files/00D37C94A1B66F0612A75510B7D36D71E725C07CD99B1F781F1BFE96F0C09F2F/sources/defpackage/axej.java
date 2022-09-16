package defpackage;

import android.content.Context;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
/* compiled from: PG */
/* renamed from: axej  reason: default package */
/* loaded from: classes2.dex */
public final class axej implements axfg {
    private final Context a;

    public axej(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.axfg
    public final anfs a(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return null;
    }

    @Override // defpackage.axfg
    public final CardboardDevice$DeviceParams b() {
        return axdv.a();
    }

    @Override // defpackage.axfg
    public final CardboardDevice$DeviceParamsList c() {
        return CardboardDevice$DeviceParamsList.getDefaultInstance();
    }

    @Override // defpackage.axfg
    public final Display$DisplayParams d() {
        Display$DisplayParams b = axdv.b();
        return b == null ? axem.a(this.a) : b;
    }

    @Override // defpackage.axfg
    public final Preferences$UserPrefs e() {
        return null;
    }

    @Override // defpackage.axfg
    public final void f() {
    }

    @Override // defpackage.axfg
    public final boolean g(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams == null) {
            return axdv.c();
        }
        return axdv.d(cardboardDevice$DeviceParams);
    }
}
