package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
/* compiled from: PG */
/* renamed from: akpl  reason: default package */
/* loaded from: classes.dex */
public final class akpl {
    public final Drawable a;
    public final CharSequence b;
    public final byte[] c;
    public final apzg d;
    public String e;

    public akpl(PackageManager packageManager, ResolveInfo resolveInfo, apzg apzgVar, byte[] bArr) {
        packageManager.getClass();
        resolveInfo.getClass();
        apzgVar.getClass();
        this.e = resolveInfo.activityInfo.name;
        this.a = resolveInfo.loadIcon(packageManager);
        this.b = resolveInfo.loadLabel(packageManager);
        this.c = bArr;
        String str = this.e;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopa createBuilder = apem.a.createBuilder();
        if (resolveInfo.activityInfo.applicationInfo.packageName != null) {
            String str2 = resolveInfo.activityInfo.applicationInfo.packageName;
            createBuilder.copyOnWrite();
            apem apemVar = (apem) createBuilder.instance;
            str2.getClass();
            apemVar.b |= 1;
            apemVar.c = str2;
        }
        if (str != null) {
            createBuilder.copyOnWrite();
            apem apemVar2 = (apem) createBuilder.instance;
            apemVar2.b |= 2;
            apemVar2.d = str;
        }
        aopcVar.e(AndroidApplicationEndpointOuterClass.androidAppEndpoint, (apem) createBuilder.mo39build());
        aopcVar.mergeFrom((aopi) apzgVar);
        this.d = (apzg) aopcVar.mo39build();
    }

    public static String a(apzg apzgVar) {
        if (apzgVar == null || !apzgVar.qn(AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
            return null;
        }
        return ((apem) apzgVar.qm(AndroidApplicationEndpointOuterClass.androidAppEndpoint)).c;
    }
}
