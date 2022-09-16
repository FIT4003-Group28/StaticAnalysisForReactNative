package com.google.android.apps.youtube.app.common.ui.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PaneDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new asq(19);
    public final Class a;
    public final Bundle b;
    public ampt c;

    public PaneDescriptor(Parcel parcel) {
        try {
            this.a = Class.forName(parcel.readString());
            ClassLoader classLoader = getClass().getClassLoader();
            Bundle bundle = (Bundle) parcel.readParcelable(classLoader);
            this.b = bundle;
            if (bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("Failed to read fragmentClass.");
        }
    }

    public static Bundle a() {
        return new Bundle();
    }

    public static PaneDescriptor b(gbd gbdVar) {
        Bundle bundle = gbdVar.m;
        Class<?> cls = gbdVar.getClass();
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new PaneDescriptor(cls, bundle);
    }

    public static PaneDescriptor c(Class cls, apzg apzgVar, Bundle bundle) {
        apzgVar.getClass();
        PaneDescriptor paneDescriptor = new PaneDescriptor(cls, bundle);
        paneDescriptor.i(apzgVar);
        return paneDescriptor;
    }

    public static apzg f(Bundle bundle) {
        return aafr.c(bundle.getByteArray("navigation_endpoint"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r4 = r4.b;
        r5 = r5.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r4, com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r5, defpackage.aafd r6) {
        /*
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 == 0) goto L46
            if (r5 != 0) goto La
            goto L46
        La:
            java.lang.Class r2 = r4.a
            java.lang.Class r3 = r5.a
            if (r2 != r3) goto L46
            android.os.Bundle r2 = r4.b
            android.os.Bundle r2 = n(r2)
            android.os.Bundle r3 = r5.b
            android.os.Bundle r3 = n(r3)
            boolean r2 = defpackage.zgt.e(r2, r3)
            if (r2 == 0) goto L46
            android.os.Bundle r4 = r4.b
            android.os.Bundle r5 = r5.b
            java.lang.String r2 = "navigation_endpoint"
            boolean r3 = r4.containsKey(r2)
            boolean r2 = r5.containsKey(r2)
            if (r3 == r2) goto L33
            goto L46
        L33:
            if (r3 != 0) goto L37
            if (r2 == 0) goto L45
        L37:
            apzg r4 = f(r4)
            apzg r5 = f(r5)
            boolean r4 = r6.a(r4, r5)
            if (r4 == 0) goto L46
        L45:
            return r0
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor.k(com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor, com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor, aafd):boolean");
    }

    private static Bundle n(Bundle bundle) {
        amuk amukVar = etj.a;
        int i = ((amxx) amukVar).c;
        Bundle bundle2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) amukVar.get(i2);
            if (bundle.containsKey(str)) {
                if (bundle2 == null) {
                    bundle2 = new Bundle(bundle);
                }
                bundle2.remove(str);
            }
        }
        return bundle2 != null ? bundle2 : bundle;
    }

    public final gbd d() {
        gbd gbdVar;
        try {
            gbdVar = (gbd) this.a.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            gbdVar = null;
        }
        if (gbdVar != null) {
            gbdVar.ae(new Bundle(this.b));
        }
        return gbdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final apzg e() {
        return f(this.b);
    }

    public final String g(String str) {
        return this.b.getString(str);
    }

    public final void h(ClassLoader classLoader) {
        this.b.setClassLoader(classLoader);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final void i(apzg apzgVar) {
        this.b.putByteArray("navigation_endpoint", apzgVar.toByteArray());
    }

    public final void j(atnp atnpVar) {
        this.b.putByteArray("navigation_endpoint_interaction_logging_extension", atnpVar.toByteArray());
    }

    public final boolean l() {
        return this.b.getBoolean("pivot", false);
    }

    public final void m(boolean z) {
        this.b.putBoolean("split_pane_library_opened_in_offline_mode", z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.getName());
        parcel.writeParcelable(this.b, i);
    }

    public PaneDescriptor(Class cls, Bundle bundle) {
        cls.getClass();
        this.a = cls;
        this.b = bundle;
    }
}
