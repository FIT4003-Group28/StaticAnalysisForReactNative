package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tws  reason: default package */
/* loaded from: classes7.dex */
public class tws implements tvx {
    private final cqtd a;
    @dzsi
    private final CharSequence b;

    public tws(Activity activity, dntm dntmVar, dbsg<dpzh> dbsgVar) {
        cqtd e;
        if (!dbsgVar.a() || dbsgVar.b() != dpzh.HAS_PARKING) {
            int ordinal = dntmVar.ordinal();
            if (ordinal == 0) {
                e = iup.e(R.raw.ic_mod_parking_unknown);
            } else if (ordinal == 1 || ordinal == 2) {
                e = iup.e(R.raw.ic_mod_parking_onsite);
            } else if (ordinal == 3) {
                e = iup.e(R.raw.ic_mod_parking_limited);
            } else {
                e = cqtt.c();
            }
        } else {
            e = iup.e(R.raw.ic_mod_parking_onsite);
        }
        this.a = e;
        String str = null;
        if (!dbsgVar.a() || dbsgVar.b() != dpzh.HAS_PARKING) {
            int ordinal2 = dntmVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    str = activity.getString(R.string.PARKING_DIFFICULTY_EASY);
                } else if (ordinal2 == 2) {
                    str = activity.getString(R.string.PARKING_DIFFICULTY_MEDIUM);
                } else if (ordinal2 == 3) {
                    str = activity.getString(R.string.PARKING_DIFFICULTY_HARD);
                }
            }
        } else {
            str = activity.getString(R.string.PARKING_DIFFICULTY_ONSITE);
        }
        this.b = str;
    }

    @Override // defpackage.tvx
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.tvx
    public Boolean b() {
        return true;
    }

    @Override // defpackage.tvx
    public Boolean c() {
        return false;
    }

    @Override // defpackage.tvx
    @dzsi
    public CharSequence d() {
        return this.b;
    }

    @Override // defpackage.tvx
    public Integer e() {
        return Integer.valueOf((int) R.id.trip_card_parking_notice);
    }
}
