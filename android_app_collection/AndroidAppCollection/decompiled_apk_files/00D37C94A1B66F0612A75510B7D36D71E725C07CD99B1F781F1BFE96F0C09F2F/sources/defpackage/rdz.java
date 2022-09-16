package defpackage;

import android.app.Activity;
import android.content.Context;
/* compiled from: PG */
/* renamed from: rdz  reason: default package */
/* loaded from: classes4.dex */
public final class rdz {
    public static final qso a;
    public static final twx b;
    public static final tzc c;

    static {
        twx twxVar = new twx();
        b = twxVar;
        rdy rdyVar = new rdy();
        c = rdyVar;
        a = new qso("Help.API", rdyVar, twxVar, null, null, null);
    }

    public static rem a(Activity activity) {
        return new rem(activity);
    }

    public static rem b(Context context) {
        return new rem(context);
    }
}
