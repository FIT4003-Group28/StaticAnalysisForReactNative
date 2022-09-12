package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.personalized.PlaceUserData;
/* compiled from: PG */
@Deprecated
/* renamed from: copz  reason: default package */
/* loaded from: classes5.dex */
public final class copz extends cntq<PlaceUserData> implements cnom {
    private final Status b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copz(DataHolder dataHolder) {
        super(dataHolder, PlaceUserData.CREATOR);
        Status a = coor.a(dataHolder.e);
        cnwc.g(dataHolder.e == a.g);
        this.b = a;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.b;
    }
}
