package com.google.android.apps.gmm.locationsharing.modui.shares;

import android.os.Parcelable;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class CreateSharesFlowFragment$TargetData implements Parcelable {
    public static ajcp e() {
        return new ajce();
    }

    @dzsi
    public abstract CreateSharesFlowFragment$SavedIntent a();

    @dzsi
    public abstract SendKitPickerResult b();

    @dzsi
    public abstract Profile c();

    public abstract int d();

    public final dbsg<CreateSharesFlowFragment$SavedIntent> f() {
        return dbsg.j(a());
    }

    public final dbsg<SendKitPickerResult> g() {
        return dbsg.j(b());
    }

    public final dbsg<Profile> h() {
        return dbsg.j(c());
    }
}
