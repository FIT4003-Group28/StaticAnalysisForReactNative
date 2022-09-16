package defpackage;

import com.google.android.libraries.youtube.gaming.thirdpartylinking.ThirdPartyAccountPreference;
/* compiled from: PG */
/* renamed from: zyo  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zyo implements zyu {
    public final /* synthetic */ ThirdPartyAccountPreference a;
    private final /* synthetic */ int b;

    public /* synthetic */ zyo(ThirdPartyAccountPreference thirdPartyAccountPreference, int i) {
        this.b = i;
        this.a = thirdPartyAccountPreference;
    }

    @Override // defpackage.zyu
    public final void a(boolean z) {
        apzg apzgVar;
        if (this.b == 0) {
            this.a.l(z);
            return;
        }
        ThirdPartyAccountPreference thirdPartyAccountPreference = this.a;
        aafo aafoVar = thirdPartyAccountPreference.b;
        if (z) {
            apzgVar = thirdPartyAccountPreference.a.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = thirdPartyAccountPreference.a.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        }
        aafoVar.a(apzgVar);
    }
}
