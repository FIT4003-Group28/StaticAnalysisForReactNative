package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: kdv  reason: default package */
/* loaded from: classes7.dex */
enum kdv {
    NO_LOCKOUT(8, null),
    KOREA_LOCKOUT(0, Integer.valueOf((int) R.string.CAR_KR_NOT_ALLOWED_LOCKOUT)),
    LOCATION_LOCKOUT(0, Integer.valueOf((int) R.string.CAR_AUXILIARY_MAP_LOCKOUT)),
    PIN_LOCKOUT(0, Integer.valueOf((int) R.string.CAR_AUXILIARY_MAP_PIN_LOCKOUT));
    
    @dzsi
    public final Integer e;
    public final int f;

    kdv(int i, @dzsi Integer num) {
        this.f = i;
        this.e = num;
    }
}
