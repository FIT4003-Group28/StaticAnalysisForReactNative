package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aczp  reason: default package */
/* loaded from: classes.dex */
public final class aczp {
    private static final cqkv a = new aczq(new aczp());

    public static <T extends cqkp> cqnf<T> a(cqlc<T, Integer> cqlcVar) {
        return cqjv.g(aczo.a, cqlcVar, a);
    }

    public static final void b(@dzsi Integer num, View view) {
        if (num == null || num.intValue() == -1) {
            view.setTag(R.id.goldfinger_card_index, null);
        } else {
            view.setTag(R.id.goldfinger_card_index, num);
        }
    }
}
