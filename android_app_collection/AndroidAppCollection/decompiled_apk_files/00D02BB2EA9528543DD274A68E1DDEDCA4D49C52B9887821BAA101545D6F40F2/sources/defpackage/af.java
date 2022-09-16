package defpackage;

import android.app.Application;
import android.arch.lifecycle.SavedStateHandleController;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: af  reason: default package */
/* loaded from: classes.dex */
public final class af extends ar {
    private static final Class<?>[] f = {Application.class, ad.class};
    private static final Class<?>[] g = {ad.class};
    private final Application a;
    private final aq b;
    private final Bundle c;
    private final k d;
    private final avp e;

    public af(Application application, avr avrVar, Bundle bundle) {
        aq a;
        this.e = avrVar.Qg();
        this.d = avrVar.Nh();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (ap.a == null) {
                ap.a = new ap(application);
            }
            a = ap.a;
        } else {
            a = as.a();
        }
        this.b = a;
    }

    private static <T> Constructor<T> d(Class<T> cls, Class[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends defpackage.an> T a(java.lang.String r12, java.lang.Class<T> r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af.a(java.lang.String, java.lang.Class):an");
    }

    @Override // defpackage.at
    public final void c(an anVar) {
        SavedStateHandleController.c(anVar, this.e, this.d);
    }

    @Override // defpackage.ar, defpackage.aq
    public final <T extends an> T b(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) a(canonicalName, cls);
    }
}
