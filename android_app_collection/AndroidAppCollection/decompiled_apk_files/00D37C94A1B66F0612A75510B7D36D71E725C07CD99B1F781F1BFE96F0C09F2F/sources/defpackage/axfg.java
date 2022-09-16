package defpackage;

import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
/* compiled from: PG */
/* renamed from: axfg  reason: default package */
/* loaded from: classes2.dex */
public interface axfg {
    anfs a(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest);

    CardboardDevice$DeviceParams b();

    CardboardDevice$DeviceParamsList c();

    Display$DisplayParams d();

    Preferences$UserPrefs e();

    void f();

    boolean g(CardboardDevice$DeviceParams cardboardDevice$DeviceParams);
}
