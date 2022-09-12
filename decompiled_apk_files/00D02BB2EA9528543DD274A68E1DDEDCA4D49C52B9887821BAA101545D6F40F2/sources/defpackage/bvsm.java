package defpackage;

import android.content.res.Resources;
import android.icu.text.ListFormatter;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bvsm  reason: default package */
/* loaded from: classes4.dex */
public final class bvsm {
    public static <T> String a(List<T> list, Resources resources) {
        if (Build.VERSION.SDK_INT >= 26) {
            LocaleList locales = resources.getConfiguration().getLocales();
            return ListFormatter.getInstance(locales.isEmpty() ? Locale.getDefault() : locales.get(0)).format(list);
        }
        int size = list.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            T t = list.get(0);
            dbsk.s(t);
            return t.toString();
        } else if (size != 2) {
            T t2 = list.get(0);
            dbsk.s(t2);
            T t3 = list.get(1);
            dbsk.s(t3);
            String string = resources.getString(R.string.LIST_FORMAT_AND_START, t2, t3);
            int size2 = list.size() - 1;
            for (int i = 2; i < size2; i++) {
                T t4 = list.get(i);
                dbsk.s(t4);
                string = resources.getString(R.string.LIST_FORMAT_AND_MIDDLE, string, t4);
            }
            T t5 = list.get(size2);
            dbsk.s(t5);
            return resources.getString(R.string.LIST_FORMAT_AND_END, string, t5);
        } else {
            T t6 = list.get(0);
            dbsk.s(t6);
            T t7 = list.get(1);
            dbsk.s(t7);
            return resources.getString(R.string.LIST_FORMAT_AND_TWO_ITEMS, t6, t7);
        }
    }
}
