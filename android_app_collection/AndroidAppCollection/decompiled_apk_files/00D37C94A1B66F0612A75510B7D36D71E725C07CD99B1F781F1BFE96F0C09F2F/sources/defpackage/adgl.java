package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adgl  reason: default package */
/* loaded from: classes.dex */
public final class adgl {
    public static final String a = zep.a("MDX.RouteUtil");
    final Handler b = new Handler(Looper.getMainLooper());
    private final String c;
    private final azqb d;
    private final adeo e;

    public adgl(String str, azqb azqbVar, adeo adeoVar) {
        this.c = str;
        this.d = azqbVar;
        this.e = adeoVar;
    }

    public static boolean c(String str, String str2) {
        boolean z = false;
        aqxo.p(!str.contains(":") || str.lastIndexOf(":") != str.length() + (-1));
        if (!str2.contains(":") || str2.lastIndexOf(":") != str2.length() - 1) {
            z = true;
        }
        aqxo.p(z);
        return str.substring(str.lastIndexOf(":") + 1).replace("-", "").equals(str2.substring(str2.lastIndexOf(":") + 1).replace("-", ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(adnq adnqVar, bhc bhcVar) {
        adig c = adnqVar.c(bhcVar.q);
        if (c == null) {
            zep.m(a, "Route was not found in screen monitor");
            return false;
        }
        return TextUtils.isEmpty(((adid) c).f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(bhc bhcVar) {
        for (IntentFilter intentFilter : bhcVar.j) {
            Iterator<String> categoriesIterator = intentFilter.categoriesIterator();
            while (categoriesIterator.hasNext()) {
                if (categoriesIterator.next().contains("MDX_MEDIA_ROUTE_CONTROL_CATEGORY_")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h(bhc bhcVar) {
        Bundle bundle = bhcVar.q;
        return bundle != null && g(bhcVar) && adig.q(bundle) == 4;
    }

    public static boolean i(bhc bhcVar) {
        Bundle bundle = bhcVar.q;
        return bundle != null && g(bhcVar) && adig.q(bundle) == 3;
    }

    public final List b(String str, Context context) {
        ArrayList arrayList = new ArrayList();
        for (bhc bhcVar : j()) {
            if (str.equals(bhcVar.d)) {
                arrayList.add(bhcVar);
            }
        }
        return arrayList;
    }

    public final boolean e(bhc bhcVar) {
        for (IntentFilter intentFilter : bhcVar.j) {
            if (intentFilter.hasCategory("android.media.intent.category.LIVE_AUDIO")) {
                bhd bhdVar = (bhd) this.d.get();
                return !bhcVar.equals(bhd.g());
            }
        }
        return false;
    }

    public final boolean f(bhc bhcVar) {
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (IntentFilter intentFilter : bhcVar.j) {
            if (intentFilter.hasCategory(tfo.t(str))) {
                return true;
            }
        }
        return false;
    }

    public final List j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return this.e.a();
        }
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.b.post(new adgk(synchronizedList, countDownLatch, this.e));
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            zep.o(a, "Timed out getting available media routes.", e);
        }
        return synchronizedList;
    }

    public final bhc a(atcr atcrVar, Context context) {
        if (atcrVar == null || (atcrVar.b & 2) == 0) {
            zep.m(a, "Invalid MdxScreen.");
            return null;
        }
        for (bhc bhcVar : j()) {
            if (c(atcrVar.d, bhcVar.c)) {
                return bhcVar;
            }
        }
        return null;
    }
}
