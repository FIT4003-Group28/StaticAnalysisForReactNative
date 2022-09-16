package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: gfz  reason: default package */
/* loaded from: classes3.dex */
public final class gfz {
    public final SharedPreferences a;
    public final snc b;

    public gfz(SharedPreferences sharedPreferences, snc sncVar) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        sncVar.getClass();
        this.b = sncVar;
    }

    public static final String a(argj argjVar) {
        String valueOf = String.valueOf(argjVar.c);
        return valueOf.length() != 0 ? etk.HINT_LAST_SHOWN.concat(valueOf) : new String(etk.HINT_LAST_SHOWN);
    }

    public static final String b(argj argjVar) {
        String valueOf = String.valueOf(argjVar.c);
        return valueOf.length() != 0 ? etk.HINT_ID_PREFIX.concat(valueOf) : new String(etk.HINT_ID_PREFIX);
    }
}
