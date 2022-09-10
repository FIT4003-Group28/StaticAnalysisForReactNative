package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: afmz  reason: default package */
/* loaded from: classes2.dex */
public final class afmz implements afof {
    public final gga a;
    public final Resources b;
    public final dxio<afgy> c;
    public final cjqy d;
    private final dxio<afha> e;

    public afmz(gga ggaVar, Resources resources, dxio<afgy> dxioVar, dxio<afha> dxioVar2, cjqy cjqyVar) {
        this.a = ggaVar;
        this.b = resources;
        this.c = dxioVar;
        this.e = dxioVar2;
        this.d = cjqyVar;
    }

    @Override // defpackage.afof
    public final Runnable a(String str, duqi duqiVar) {
        duqi duqiVar2 = duqi.ERROR;
        int ordinal = duqiVar.ordinal();
        if (ordinal != 11) {
            if (ordinal == 12) {
                return new afmw(this, str);
            }
            throw new afkt(String.format("Non matching actiontype for (%s, %s) ", str, duqiVar));
        } else if (afku.c(str)) {
            return new afmx(this, str);
        } else {
            return new afmy(this, this.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://")), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE), str);
        }
    }

    public final void b(Intent intent, final String str) {
        this.e.a().n(this.a, intent, 4, new Runnable(this, str) { // from class: afmv
            private final afmz a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afmz afmzVar = this.a;
                afoi.g(afmzVar.a, afmzVar.d, this.b);
            }
        });
    }
}
