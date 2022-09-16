package defpackage;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cklv  reason: default package */
/* loaded from: classes4.dex */
public final class cklv {
    public final Application a;
    private final Map<dbsg<Locale>, dbty<Resources>> b = new HashMap();

    public cklv(Application application) {
        this.a = application;
    }

    public final Resources a(final dbsg<Locale> dbsgVar) {
        if (!this.b.containsKey(dbsgVar)) {
            this.b.put(dbsgVar, dbud.a(new dbty(this, dbsgVar) { // from class: cklu
                private final cklv a;
                private final dbsg b;

                {
                    this.a = this;
                    this.b = dbsgVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    cklv cklvVar = this.a;
                    dbsg dbsgVar2 = this.b;
                    if (dbsgVar2.a()) {
                        Configuration configuration = new Configuration();
                        if (Build.VERSION.SDK_INT >= 24) {
                            configuration.setLocales(new LocaleList((Locale) dbsgVar2.b()));
                        } else {
                            configuration.locale = (Locale) dbsgVar2.b();
                        }
                        if (configuration.getLayoutDirection() == cklvVar.a.getResources().getConfiguration().getLayoutDirection()) {
                            return cklvVar.a.createConfigurationContext(configuration).getResources();
                        }
                    }
                    return cklvVar.a.getResources();
                }
            }));
        }
        return this.b.get(dbsgVar).a();
    }

    public final Resources b(@dzsi String str) {
        return a(TextUtils.isEmpty(str) ? dbpy.a : dbsg.i(new Locale(str)));
    }
}
