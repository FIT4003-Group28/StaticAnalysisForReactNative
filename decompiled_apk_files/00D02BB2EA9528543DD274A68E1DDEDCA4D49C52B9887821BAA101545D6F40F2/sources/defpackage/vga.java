package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vga  reason: default package */
/* loaded from: classes7.dex */
public final class vga {
    public static final cqjb<zcy, cqtd> a = new vfy();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqtd a(dntm dntmVar) {
        cqtd c = cqtt.c();
        dntm dntmVar2 = dntm.UNKNOWN_PARKING_DIFFICULTY;
        int ordinal = dntmVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return iup.e(R.raw.ic_mod_parking_onsite);
            }
            return ordinal != 3 ? c : iup.e(R.raw.ic_mod_parking_limited);
        }
        return iup.e(R.raw.ic_mod_parking_unknown);
    }
}
