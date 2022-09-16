package defpackage;

import android.net.Uri;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bovv  reason: default package */
/* loaded from: classes3.dex */
public class bovv {
    private final bvjj a;
    private final btvo b;

    public bovv(bvjj bvjjVar, btvo btvoVar) {
        this.a = bvjjVar;
        this.b = btvoVar;
    }

    public final bvxu a(String str, String str2, dnqb dnqbVar) {
        return b(str, str2, dnqbVar, null);
    }

    public final bvxu b(String str, String str2, dnqb dnqbVar, @dzsi String str3) {
        if (this.a.m(bvjk.hU, false)) {
            String z = this.a.z(bvjk.hT, "http://0.0.0.0");
            Uri parse = Uri.parse(str);
            str = Uri.parse(z).buildUpon().path(parse.getPath()).encodedQuery(parse.getEncodedQuery()).build().toString();
        }
        Uri build = Uri.parse(str).buildUpon().appendQueryParameter("entryPoint", String.valueOf(dnqbVar.ah)).build();
        bvxn bZ = bvxu.A.bZ();
        String uri = build.toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        uri.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = uri;
        int i2 = i | 4;
        bvxuVar.a = i2;
        bvxuVar.d = true;
        bvxuVar.a = i2 | 32;
        bvxuVar.g = true;
        bvxu.b(bvxuVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        bvxuVar2.a |= 512;
        bvxuVar2.k = true;
        bvxu.c(bvxuVar2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        str2.getClass();
        bvxuVar3.a |= 64;
        bvxuVar3.h = str2;
        int D = this.b.getUgcParameters().D();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        int i3 = bvxuVar4.a | 16;
        bvxuVar4.a = i3;
        bvxuVar4.f = D;
        bvxuVar4.a = i3 | 2048;
        bvxuVar4.m = true;
        if (!dbsj.d(str3)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar5 = (bvxu) bZ.b;
            str3.getClass();
            bvxuVar5.a |= 8192;
            bvxuVar5.o = str3;
        }
        if ((this.b.getEnableFeatureParameters().b & ImageMetadata.LENS_APERTURE) == 0) {
            dkyw bZ2 = dkyx.f.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkyx.b((dkyx) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkyx.c((dkyx) bZ2.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar6 = (bvxu) bZ.b;
            dkyx bK = bZ2.bK();
            bK.getClass();
            bvxuVar6.j = bK;
            bvxuVar6.a |= 256;
        } else {
            dkyx dkyxVar = this.b.getEnableFeatureParameters().aq;
            if (dkyxVar == null) {
                dkyxVar = dkyx.f;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar7 = (bvxu) bZ.b;
            dkyxVar.getClass();
            bvxuVar7.j = dkyxVar;
            bvxuVar7.a |= 256;
        }
        return bZ.bK();
    }
}
