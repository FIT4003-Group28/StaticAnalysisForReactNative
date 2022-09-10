package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: afiw  reason: default package */
/* loaded from: classes.dex */
public final class afiw implements afip {
    private ddjr a;
    private dmcf b;
    private boolean c;

    public static boolean c(Intent intent) {
        Uri data = intent.getData();
        return data != null && "google.maps".equalsIgnoreCase(data.getScheme()) && data.toString().startsWith("google.maps:");
    }

    private static int d(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    @Override // defpackage.afip
    public final boolean a(Intent intent) {
        return c(intent);
    }

    @Override // defpackage.afip
    public final afia b(Intent intent, @dzsi String str) {
        afif afifVar;
        dbsk.l(c(intent));
        String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
        if (dbsj.d(encodedSchemeSpecificPart)) {
            return afia.R;
        }
        afiv afivVar = new afiv();
        afivVar.parseUrl(encodedSchemeSpecificPart);
        String value = afivVar.getValue("act");
        if (value == null) {
            return afia.R;
        }
        dmcf b = dmcf.b(d(value));
        this.b = b;
        if (b == null) {
            this.b = dmcf.ERROR;
        }
        afif[] values = afif.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            afifVar = null;
            if (i >= length) {
                break;
            }
            afif afifVar2 = values[i];
            String value2 = afivVar.getValue(afifVar2.f);
            if (value2 != null) {
                try {
                    if (afifVar2.g == Integer.parseInt(value2)) {
                        afifVar = afifVar2;
                        break;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i++;
        }
        this.a = afhw.a(afivVar.getValue("entry"));
        if (d(afivVar.getValue("notts")) != 1) {
            z = true;
        }
        this.c = z;
        afhz afhzVar = new afhz();
        afhzVar.a = afib.VOICE;
        afhzVar.D = this.b;
        afhzVar.E = afifVar;
        afhzVar.b(Boolean.valueOf(this.c));
        afhzVar.z = this.a;
        afhzVar.G = str;
        return afhzVar.a();
    }
}
