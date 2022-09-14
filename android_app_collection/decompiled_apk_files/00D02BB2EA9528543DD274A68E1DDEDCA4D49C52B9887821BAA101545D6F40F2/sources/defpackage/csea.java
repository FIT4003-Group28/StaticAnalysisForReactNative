package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: csea  reason: default package */
/* loaded from: classes5.dex */
public final class csea {
    public static final String a = String.format("content://%s/publicvalue/lens_oem_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    public static final String b = String.format("content://%s/publicvalue/ar_stickers_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    public static final List<String> c = Collections.unmodifiableList(Arrays.asList("Google"));
    private static final csfl i;
    public final Context d;
    public final PackageManager e;
    public final List<csdx> f;
    public csfl g;
    public boolean h;

    static {
        csfi bZ = csfl.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        csfl csflVar = (csfl) bZ.b;
        csflVar.a = 1 | csflVar.a;
        csflVar.b = "1.2.1";
        csfl csflVar2 = (csfl) bZ.b;
        csflVar2.a |= 2;
        csflVar2.c = "";
        csfl csflVar3 = (csfl) bZ.b;
        csflVar3.d = -1;
        csflVar3.a |= 4;
        csfl csflVar4 = (csfl) bZ.b;
        csflVar4.e = -1;
        csflVar4.a |= 8;
        i = bZ.bK();
    }

    public csea(Context context) {
        PackageManager packageManager = context.getPackageManager();
        this.f = new ArrayList();
        this.d = context;
        this.e = packageManager;
        this.h = false;
        csfl csflVar = i;
        this.g = csflVar;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null) {
                dsqp dsqpVar = (dsqp) csflVar.cu(5);
                dsqpVar.bC(csflVar);
                csfi csfiVar = (csfi) dsqpVar;
                String str = packageInfo.versionName;
                if (csfiVar.c) {
                    csfiVar.bF();
                    csfiVar.c = false;
                }
                csfl csflVar2 = (csfl) csfiVar.b;
                csfl csflVar3 = csfl.f;
                str.getClass();
                csflVar2.a |= 2;
                csflVar2.c = str;
                this.g = csfiVar.bK();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        new csdz(this).execute(new Void[0]);
    }

    public final void a(csdx csdxVar) {
        if (this.h) {
            csdxVar.a(this.g);
        } else {
            this.f.add(csdxVar);
        }
    }
}
