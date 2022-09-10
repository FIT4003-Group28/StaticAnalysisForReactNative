package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crcb  reason: default package */
/* loaded from: classes5.dex */
public final class crcb {
    public final Locale a;
    public final String b;
    @dzsi
    public final crbz c;
    public int d = 2;
    private final String e = "CannedSpeechManager#loadBundleByFilename()";

    public crcb(Locale locale, String str, @dzsi crbz crbzVar) {
        this.a = locale;
        this.b = str;
        this.c = crbzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dxai a() {
        dxah bZ = dxai.e.bZ();
        String valueOf = String.valueOf(this.b);
        String concat = valueOf.length() != 0 ? "/file/".concat(valueOf) : new String("/file/");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxai dxaiVar = (dxai) bZ.b;
        concat.getClass();
        int i = dxaiVar.a | 2;
        dxaiVar.a = i;
        dxaiVar.c = concat;
        String str = this.e;
        str.getClass();
        int i2 = i | 8;
        dxaiVar.a = i2;
        dxaiVar.d = str;
        crbz crbzVar = this.c;
        if (crbzVar != null) {
            long j = crbzVar.b;
            dxaiVar.a = i2 | 1;
            dxaiVar.b = j;
        }
        return bZ.bK();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(str).length());
        sb.append("Locale=");
        sb.append(valueOf);
        sb.append(", filename=");
        sb.append(str);
        return sb.toString();
    }
}
