package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cxrl  reason: default package */
/* loaded from: classes5.dex */
public final class cxrl {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    private static final long d = TimeUnit.DAYS.toMillis(14);
    private static final cxrk e = new cxrk();
    public List<CoalescedChannels> b = new ArrayList();
    public long c;

    private cxrl() {
    }

    public static cxrl a(PeopleKitConfig peopleKitConfig) {
        cxrk cxrkVar = e;
        if (!TextUtils.equals(cxrkVar.b, peopleKitConfig.a())) {
            cxrkVar.a = new SparseArray<>();
            cxrkVar.b = peopleKitConfig.a();
        }
        SparseArray<cxrl> sparseArray = cxrkVar.a;
        int t = peopleKitConfig.t();
        int i = t - 1;
        if (t != 0) {
            cxrl cxrlVar = sparseArray.get(i);
            if (cxrlVar != null) {
                return cxrlVar;
            }
            cxrl cxrlVar2 = new cxrl();
            SparseArray<cxrl> sparseArray2 = cxrkVar.a;
            int t2 = peopleKitConfig.t();
            int i2 = t2 - 1;
            if (t2 == 0) {
                throw null;
            }
            sparseArray2.put(i2, cxrlVar2);
            return cxrlVar2;
        }
        throw null;
    }

    public final boolean b() {
        return this.b.isEmpty() || System.currentTimeMillis() - this.c >= d;
    }

    public final List<CoalescedChannels> c() {
        if (b()) {
            this.b = new ArrayList();
        }
        return this.b;
    }
}
