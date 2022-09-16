package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zme  reason: default package */
/* loaded from: classes7.dex */
public class zme implements zcy {
    private final dntm a;
    private final String b;
    private final String c;

    private zme(dntm dntmVar, String str, String str2) {
        this.a = dntmVar;
        this.b = str;
        this.c = str2;
    }

    @dzsi
    public static zme e(Resources resources, dpzh dpzhVar, dntm dntmVar) {
        String string;
        if (dpzhVar == dpzh.HAS_PARKING) {
            return new zme(dntm.EASY, resources.getString(R.string.PARKING_DIFFICULTY_ONSITE), resources.getString(R.string.PARKING_DIFFICULTY_ONSITE_FULL_TEXT));
        }
        if (dntmVar == dntm.UNKNOWN_PARKING_DIFFICULTY) {
            return null;
        }
        int ordinal = dntmVar.ordinal();
        String str = "";
        if (ordinal == 1) {
            str = resources.getString(R.string.PARKING_DIFFICULTY_EASY);
            string = resources.getString(R.string.PARKING_DIFFICULTY_EASY_FULL_TEXT);
        } else if (ordinal == 2) {
            str = resources.getString(R.string.PARKING_DIFFICULTY_MEDIUM);
            string = resources.getString(R.string.PARKING_DIFFICULTY_MEDIUM_FULL_TEXT);
        } else if (ordinal != 3) {
            string = str;
        } else {
            str = resources.getString(R.string.PARKING_DIFFICULTY_HARD);
            string = resources.getString(R.string.PARKING_DIFFICULTY_HARD_FULL_TEXT);
        }
        return new zme(dntmVar, str, string);
    }

    @Override // defpackage.zcy
    public dntm a() {
        return this.a;
    }

    @Override // defpackage.zcy
    public String b() {
        return this.b;
    }

    @Override // defpackage.zcy
    public String c() {
        return this.c;
    }

    @Override // defpackage.zcy
    public String d() {
        return this.c;
    }
}
