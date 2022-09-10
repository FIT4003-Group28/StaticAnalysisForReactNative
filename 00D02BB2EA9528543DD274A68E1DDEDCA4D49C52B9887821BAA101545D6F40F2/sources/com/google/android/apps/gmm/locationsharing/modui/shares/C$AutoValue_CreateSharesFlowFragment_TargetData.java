package com.google.android.apps.gmm.locationsharing.modui.shares;

import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.locationsharing.modui.shares.$AutoValue_CreateSharesFlowFragment_TargetData  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_CreateSharesFlowFragment_TargetData extends CreateSharesFlowFragment$TargetData {
    public final CreateSharesFlowFragment$SavedIntent a;
    public final SendKitPickerResult b;
    public final Profile c;
    public final int d;

    public C$AutoValue_CreateSharesFlowFragment_TargetData(int i, @dzsi CreateSharesFlowFragment$SavedIntent createSharesFlowFragment$SavedIntent, @dzsi SendKitPickerResult sendKitPickerResult, @dzsi Profile profile) {
        if (i != 0) {
            this.d = i;
            this.a = createSharesFlowFragment$SavedIntent;
            this.b = sendKitPickerResult;
            this.c = profile;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$TargetData
    @dzsi
    public final CreateSharesFlowFragment$SavedIntent a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$TargetData
    @dzsi
    public final SendKitPickerResult b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$TargetData
    @dzsi
    public final Profile c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$TargetData
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        CreateSharesFlowFragment$SavedIntent createSharesFlowFragment$SavedIntent;
        SendKitPickerResult sendKitPickerResult;
        Profile profile;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreateSharesFlowFragment$TargetData) {
            CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData = (CreateSharesFlowFragment$TargetData) obj;
            if (this.d == createSharesFlowFragment$TargetData.d() && ((createSharesFlowFragment$SavedIntent = this.a) != null ? createSharesFlowFragment$SavedIntent.equals(createSharesFlowFragment$TargetData.a()) : createSharesFlowFragment$TargetData.a() == null) && ((sendKitPickerResult = this.b) != null ? sendKitPickerResult.equals(createSharesFlowFragment$TargetData.b()) : createSharesFlowFragment$TargetData.b() == null) && ((profile = this.c) != null ? profile.equals(createSharesFlowFragment$TargetData.c()) : createSharesFlowFragment$TargetData.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.d ^ 1000003) * 1000003;
        CreateSharesFlowFragment$SavedIntent createSharesFlowFragment$SavedIntent = this.a;
        int i2 = 0;
        int hashCode = (i ^ (createSharesFlowFragment$SavedIntent == null ? 0 : createSharesFlowFragment$SavedIntent.hashCode())) * 1000003;
        SendKitPickerResult sendKitPickerResult = this.b;
        int hashCode2 = (hashCode ^ (sendKitPickerResult == null ? 0 : sendKitPickerResult.hashCode())) * 1000003;
        Profile profile = this.c;
        if (profile != null) {
            i2 = profile.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public final String toString() {
        String a = ajcq.a(this.d);
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = a.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 87 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TargetData{type=");
        sb.append(a);
        sb.append(", nullableSavedIntent=");
        sb.append(valueOf);
        sb.append(", nullableSendKitPickerResult=");
        sb.append(valueOf2);
        sb.append(", nullableProfile=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
