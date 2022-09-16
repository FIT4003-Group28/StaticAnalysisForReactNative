package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
/* compiled from: PG */
/* renamed from: zbb  reason: default package */
/* loaded from: classes7.dex */
public final class zbb {
    public final Intent a;
    public final dxio<afha> b;

    public zbb(akqi akqiVar, akqq akqqVar, String str, Context context, dxio<afha> dxioVar) {
        Intent intent;
        if (context != null) {
            dejx bZ = dejy.e.bZ();
            float f = (float) akqqVar.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dejy dejyVar = (dejy) bZ.b;
            int i = dejyVar.a | 2;
            dejyVar.a = i;
            dejyVar.c = f;
            double d = akqqVar.b;
            int i2 = i | 4;
            dejyVar.a = i2;
            dejyVar.d = (float) d;
            str.getClass();
            dejyVar.a = i2 | 1;
            dejyVar.b = str;
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage("com.google.android.googlequicksearchbox");
            intent2.putExtra("log_event", "GMM");
            intent2.putExtra("location", bZ.bK().bS());
            Intent intent3 = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("dynact").authority("velour").appendPath("weather").appendPath("ProxyActivity").build());
            intent3.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.DynamicActivityTrampoline"));
            intent3.putExtra("log_event", "GMM");
            intent3.putExtra("com.google.android.libraries.velour.INNER_INTENT", intent2);
            dgrg bZ2 = dgrh.d.bZ();
            long j = akqiVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dgrh dgrhVar = (dgrh) bZ2.b;
            int i3 = dgrhVar.a | 1;
            dgrhVar.a = i3;
            dgrhVar.b = j;
            long j2 = akqiVar.c;
            dgrhVar.a = i3 | 2;
            dgrhVar.c = j2;
            dgrh bK = bZ2.bK();
            duhd bZ3 = duhe.c.bZ();
            double d2 = akqqVar.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            duhe duheVar = (duhe) bZ3.b;
            duheVar.a = d2;
            duheVar.b = akqqVar.b;
            duhe bK2 = bZ3.bK();
            dhhm bZ4 = dhhn.e.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dhhn dhhnVar = (dhhn) bZ4.b;
            bK.getClass();
            dhhnVar.b = bK;
            int i4 = dhhnVar.a | 1;
            dhhnVar.a = i4;
            bK2.getClass();
            dhhnVar.c = bK2;
            int i5 = i4 | 2;
            dhhnVar.a = i5;
            str.getClass();
            dhhnVar.a = i5 | 8;
            dhhnVar.d = str;
            dhhn bK3 = bZ4.bK();
            dtdu dtduVar = (dtdu) dtdv.c.bZ();
            if (dtduVar.c) {
                dtduVar.bF();
                dtduVar.c = false;
            }
            dtdv dtdvVar = (dtdv) dtduVar.b;
            bK3.getClass();
            dtdvVar.b = bK3;
            dtdvVar.a |= 512;
            dtdv dtdvVar2 = (dtdv) dtduVar.bK();
            Intent intent4 = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
            intent4.setPackage("com.google.android.googlequicksearchbox");
            String valueOf = String.valueOf(str);
            intent4.putExtra("query", valueOf.length() != 0 ? "weather ".concat(valueOf) : new String("weather "));
            duhq duhqVar = (duhq) duht.d.bZ();
            if (duhqVar.c) {
                duhqVar.bF();
                duhqVar.c = false;
            }
            duht duhtVar = (duht) duhqVar.b;
            duhtVar.b = 19;
            duhtVar.a |= 1;
            dtrn dtrnVar = (dtrn) dtro.a.bZ();
            dsqv<dtro, dhhk> dsqvVar = dhhk.b;
            dhhj dhhjVar = (dhhj) dhhk.a.bZ();
            dsqv<dhhk, dhgv> dsqvVar2 = dhhl.a;
            dhgu dhguVar = (dhgu) dhgv.d.bZ();
            if (dhguVar.c) {
                dhguVar.bF();
                dhguVar.c = false;
            }
            dhgv dhgvVar = (dhgv) dhguVar.b;
            dhgvVar.a |= 2;
            dhgvVar.b = "Weather";
            dhgo bZ5 = dhgp.d.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dhgp dhgpVar = (dhgp) bZ5.b;
            dhgpVar.a |= 2;
            dhgpVar.b = "Location";
            dhgq bZ6 = dhgr.c.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dhgr dhgrVar = (dhgr) bZ6.b;
            dtdvVar2.getClass();
            dhgrVar.b = dtdvVar2;
            dhgrVar.a = 5;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dhgp dhgpVar2 = (dhgp) bZ5.b;
            dhgr bK4 = bZ6.bK();
            bK4.getClass();
            dhgpVar2.c = bK4;
            dhgpVar2.a |= 4;
            if (dhguVar.c) {
                dhguVar.bF();
                dhguVar.c = false;
            }
            dhgv dhgvVar2 = (dhgv) dhguVar.b;
            dhgp bK5 = bZ5.bK();
            bK5.getClass();
            dsrj<dhgp> dsrjVar = dhgvVar2.c;
            if (!dsrjVar.a()) {
                dhgvVar2.c = dsqw.cl(dsrjVar);
            }
            dhgvVar2.c.add(bK5);
            dhhjVar.k(dsqvVar2, (dhgv) dhguVar.bK());
            dtrnVar.k(dsqvVar, (dhhk) dhhjVar.bK());
            if (duhqVar.c) {
                duhqVar.bF();
                duhqVar.c = false;
            }
            duht duhtVar2 = (duht) duhqVar.b;
            dtro dtroVar = (dtro) dtrnVar.bK();
            dtroVar.getClass();
            duhtVar2.c = dtroVar;
            duhtVar2.a |= 33554432;
            byte[] bS = ((duht) duhqVar.bK()).bS();
            int length = bS.length;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bS, 0, length);
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                clam bZ7 = clan.c.bZ();
                String i6 = ddae.e.h().i(byteArray);
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                clan clanVar = (clan) bZ7.b;
                i6.getClass();
                clanVar.a |= 2;
                clanVar.b = i6;
                clan bK6 = bZ7.bK();
                dbsk.s(bK6);
                intent4.putExtra("search-options-proto", Base64.encodeToString(bK6.bS(), 11));
                intent4.putExtra("ved", "1t:63317");
                intent3.putExtra("com.google.android.libraries.velour.FALLBACK_INTENT", intent4.toUri(1));
                intent = intent3;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.google.com/search?q=weather"));
        }
        this.a = intent;
        this.b = dxioVar;
    }
}
