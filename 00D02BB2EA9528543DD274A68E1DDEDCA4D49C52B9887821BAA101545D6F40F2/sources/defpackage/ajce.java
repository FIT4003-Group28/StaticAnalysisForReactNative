package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.gmm.locationsharing.modui.shares.AutoValue_CreateSharesFlowFragment_TargetData;
import com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$SavedIntent;
import com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$TargetData;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* compiled from: PG */
/* renamed from: ajce  reason: default package */
/* loaded from: classes2.dex */
public final class ajce extends ajcp {
    public CreateSharesFlowFragment$SavedIntent a;
    public SendKitPickerResult b;
    public Profile c;
    public int d;

    @Override // defpackage.ajcp
    public final CreateSharesFlowFragment$TargetData a() {
        String str = this.d == 0 ? " type" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new AutoValue_CreateSharesFlowFragment_TargetData(this.d, this.a, this.b, this.c);
    }
}
