package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: tiy  reason: default package */
/* loaded from: classes4.dex */
public final class tiy {
    public static final String a = String.format("content://%s/publicvalue/lens_oem_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    public static final String b = String.format("content://%s/publicvalue/ar_stickers_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    public static final List c = Collections.unmodifiableList(Arrays.asList("Google"));
    private static final tjl i;
    public final Context d;
    public final PackageManager e;
    public final List f;
    public tjl g;
    public boolean h;

    static {
        aopa createBuilder = tjl.a.createBuilder();
        createBuilder.copyOnWrite();
        tjl tjlVar = (tjl) createBuilder.instance;
        tjlVar.b = 1 | tjlVar.b;
        tjlVar.c = "1.2.1";
        createBuilder.copyOnWrite();
        tjl tjlVar2 = (tjl) createBuilder.instance;
        tjlVar2.b |= 2;
        tjlVar2.d = "";
        createBuilder.copyOnWrite();
        tjl tjlVar3 = (tjl) createBuilder.instance;
        tjlVar3.e = -1;
        tjlVar3.b |= 4;
        createBuilder.copyOnWrite();
        tjl tjlVar4 = (tjl) createBuilder.instance;
        tjlVar4.f = -1;
        tjlVar4.b |= 8;
        i = (tjl) createBuilder.mo39build();
    }

    public tiy(Context context) {
        PackageManager packageManager = context.getPackageManager();
        this.f = new ArrayList();
        this.d = context;
        this.e = packageManager;
        this.h = false;
        tjl tjlVar = i;
        this.g = tjlVar;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null) {
                aopa mo52toBuilder = tjlVar.mo52toBuilder();
                String str = packageInfo.versionName;
                mo52toBuilder.copyOnWrite();
                tjl tjlVar2 = (tjl) mo52toBuilder.instance;
                str.getClass();
                tjlVar2.b |= 2;
                tjlVar2.d = str;
                this.g = (tjl) mo52toBuilder.mo39build();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        new tix(this).execute(new Void[0]);
    }

    public final void a(tiv tivVar) {
        if (this.h) {
            tivVar.a(this.g);
        } else {
            this.f.add(tivVar);
        }
    }
}
