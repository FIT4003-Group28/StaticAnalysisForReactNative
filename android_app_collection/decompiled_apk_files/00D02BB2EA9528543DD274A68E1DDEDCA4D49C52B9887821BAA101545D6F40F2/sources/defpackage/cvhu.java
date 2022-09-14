package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: cvhu  reason: default package */
/* loaded from: classes5.dex */
public final class cvhu implements buis {
    private final CronetEngine a;
    private final cqat b;
    private final Executor c;
    private final cvhk d;
    private final dzsj<dvem> e;
    private final dbty<String> f;

    public cvhu(CronetEngine cronetEngine, cqat cqatVar, Executor executor, cvhk cvhkVar, dzsj<dvem> dzsjVar, Context context) {
        dbty<String> a;
        this.a = cronetEngine;
        this.b = cqatVar;
        this.c = executor;
        this.d = cvhkVar;
        this.e = dzsjVar;
        try {
            final Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            a = dbud.a(new dbty(bundle) { // from class: cvhr
                private final Bundle a;

                {
                    this.a = bundle;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return this.a.getString("com.google.android.libraries.navigation.service.usage_server_url_override");
                }
            });
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            a = dbud.a(cvhs.a);
        }
        this.f = a;
    }

    @Override // defpackage.buis
    public final <S extends dssj> buir<S> a(dssj dssjVar, buid buidVar, buad buadVar) {
        String a = this.f.a();
        String str = (cvht.PROD.e.equals(a) ? cvht.PROD : cvht.STAGING.e.equals(a) ? cvht.STAGING : cvht.AUTOPUSH.e.equals(a) ? cvht.AUTOPUSH : cvht.EMPTY).f;
        if (str.isEmpty()) {
            str = this.e.a().a;
        }
        if (str.isEmpty()) {
            str = cvht.PROD.f;
        }
        return new cvhq(dssjVar, str, this.a, buidVar, this.d, this.b, this.c);
    }
}
