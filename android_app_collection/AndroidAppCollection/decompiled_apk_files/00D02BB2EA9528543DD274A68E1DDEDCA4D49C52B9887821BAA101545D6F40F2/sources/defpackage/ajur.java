package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: ajur  reason: default package */
/* loaded from: classes2.dex */
public final class ajur implements ajup {
    public static final dcqe a = dcqe.c("ajur");
    public final cjqy b;
    public final cjqq c;
    public final dehq d;
    private final dxio<cxqo> e;
    private final dxio<cxrj> f;
    private ajuq g;

    public ajur(cjqy cjqyVar, cjqq cjqqVar, dxio<cxqo> dxioVar, dxio<cxrj> dxioVar2, dehq dehqVar) {
        this.b = cjqyVar;
        this.c = cjqqVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.d = dehqVar;
    }

    @Override // defpackage.ajup
    public final PeopleKitConfig a(Context context, boolean z, String str) {
        czgq czgqVar;
        String string;
        if (z) {
            czgqVar = czgq.MAPS_JOURNEY_SHARING_DEFAULT;
        } else {
            czgqVar = czgq.MAPS_LOCATION_SHARING_DEFAULT;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            string = applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = context.getString(i);
        }
        int i2 = context.getApplicationInfo().icon;
        boolean a2 = bwhl.a(context);
        cxod cxodVar = new cxod();
        cxodVar.a(context);
        cxss u = PeopleKitConfigImpl.u();
        u.a = str;
        u.j = 19;
        u.b = czgqVar;
        u.d = string;
        u.b();
        u.i = false;
        u.e = i2;
        u.h = a2;
        u.c(cxodVar);
        return u.a();
    }

    @Override // defpackage.ajup
    public final cxqo b() {
        if (this.g == null) {
            this.g = new ajuq(this, this.e.a());
        }
        return this.g;
    }

    @Override // defpackage.ajup
    public final cxrj c() {
        return this.f.a();
    }

    @Override // defpackage.ajup
    public final ExecutorService d() {
        return this.d;
    }

    @Override // defpackage.ajup
    public final void e(SendKitPickerResult sendKitPickerResult, Context context) {
        sendKitPickerResult.b(b(), c(), context);
    }

    @Override // defpackage.ajup
    public final void f(Context context) {
        cxqo b = b();
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.S));
        cxod cxodVar = new cxod();
        cxodVar.a(context);
        peopleKitVisualElementPath.b(cxodVar);
        b.d(4, peopleKitVisualElementPath);
    }
}
