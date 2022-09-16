package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: gmi  reason: default package */
/* loaded from: classes3.dex */
public final class gmi implements aafl, yiu {
    private static final Pattern a = Pattern.compile("(?i)android-app://([^/]+)/?(?:([^/]+)/([^/?#]*)(.+)?)?");
    private final aafo b;
    private final PackageManager c;
    private final wxc d;
    private final enc e;
    private final Context f;
    private final yjk g;

    public gmi(wxc wxcVar, enc encVar, yjk yjkVar, aafo aafoVar, Context context) {
        wxcVar.getClass();
        this.d = wxcVar;
        encVar.getClass();
        this.e = encVar;
        this.g = yjkVar;
        aafoVar.getClass();
        this.b = aafoVar;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.c = packageManager;
        this.f = context;
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aafl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kD(defpackage.apzg r8, java.util.Map r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmi.kD(apzg, java.util.Map):void");
    }
}
