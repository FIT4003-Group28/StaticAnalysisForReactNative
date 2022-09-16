package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.backup.Backup;
/* compiled from: PG */
/* renamed from: ymf  reason: default package */
/* loaded from: classes4.dex */
public final class ymf {
    @Backup
    public static final String UPLOAD_NETWORK_POLICY = "upload_policy";
    @Backup
    public static final String VIDEO_QUALITY_PROMO_LAST_DISPLAYED = "video_quality_promo_last_displayed";

    public static apfz a(apyy apyyVar) {
        apfo apfoVar = apyyVar.d;
        if (apfoVar == null) {
            apfoVar = apfo.a;
        }
        apfq apfqVar = apfoVar.e;
        if (apfqVar == null) {
            apfqVar = apfq.a;
        }
        if ((apfqVar.b & 1) != 0) {
            apfq apfqVar2 = apfoVar.e;
            if (apfqVar2 == null) {
                apfqVar2 = apfq.a;
            }
            apfz apfzVar = apfqVar2.c;
            return apfzVar == null ? apfz.a : apfzVar;
        }
        aopa createBuilder = apfz.a.createBuilder();
        createBuilder.copyOnWrite();
        apfz apfzVar2 = (apfz) createBuilder.instance;
        apfzVar2.c = 2;
        apfzVar2.b |= 1;
        createBuilder.copyOnWrite();
        apfz apfzVar3 = (apfz) createBuilder.instance;
        apfzVar3.b |= 64;
        apfzVar3.f = true;
        createBuilder.copyOnWrite();
        apfz apfzVar4 = (apfz) createBuilder.instance;
        aopu aopuVar = apfzVar4.g;
        if (!aopuVar.c()) {
            apfzVar4.g = aopi.mutableCopy(aopuVar);
        }
        apfzVar4.g.add("https://youtubei.googleapis.com/generate_204");
        aopa createBuilder2 = apfy.a.createBuilder();
        createBuilder2.copyOnWrite();
        apfy apfyVar = (apfy) createBuilder2.instance;
        apfyVar.b |= 1;
        apfyVar.c = true;
        apfy apfyVar2 = (apfy) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        apfz apfzVar5 = (apfz) createBuilder.instance;
        apfyVar2.getClass();
        apfzVar5.i = apfyVar2;
        apfzVar5.b |= 512;
        return (apfz) createBuilder.mo39build();
    }

    public static final boolean b(String str, vlq vlqVar) {
        return vlqVar.f(str, false);
    }

    public static yve c(Context context, String str, String str2, vlk vlkVar, aoqu aoquVar) {
        vjf a = vjg.a(context);
        a.e(str);
        a.f(str2);
        Uri a2 = a.a();
        vli a3 = vlj.a();
        a3.e(aoquVar);
        a3.f(a2);
        return new yvc(vmu.b(vlkVar.a(a3.a())), aoquVar);
    }

    public static amfb d(Context context, String str, ankw ankwVar, vlk vlkVar, amvn amvnVar, Uri uri, aoqu aoquVar, vlp vlpVar) {
        vlo d = vlr.d(context, ankwVar);
        d.b();
        d.c = str;
        d.d((String[]) amvnVar.toArray(new String[0]));
        d.e(vlpVar);
        vlr a = d.a();
        vli a2 = vlj.a();
        a2.f(uri);
        a2.e(aoquVar);
        a2.b(a);
        return vmu.b(vlkVar.a(a2.a()));
    }

    public static yjy e(String str, Context context, vlk vlkVar, ankw ankwVar, String str2, yjc yjcVar, aoqu aoquVar, amvn amvnVar, yke ykeVar) {
        return ykeVar.a(vmu.b(f(str, context, vlkVar, ankwVar, str2, yjcVar, aoquVar, amvnVar)), aoquVar);
    }

    public static vne f(String str, Context context, vlk vlkVar, ankw ankwVar, String str2, yjc yjcVar, aoqu aoquVar, amvn amvnVar) {
        vjf a = vjg.a(context);
        a.e("commonui");
        a.f(str);
        Uri a2 = a.a();
        vlo d = vlr.d(context, ankwVar);
        d.d((String[]) amvnVar.toArray(new String[amvnVar.size()]));
        d.b();
        d.c = str2;
        yjcVar.getClass();
        d.e(new abfi(yjcVar, 1));
        vlr a3 = d.a();
        vli a4 = vlj.a();
        a4.e(aoquVar);
        a4.f(a2);
        a4.b(a3);
        return vlkVar.a(a4.a());
    }

    public static void g(amvn amvnVar, aoqt aoqtVar, amup amupVar) {
        amzs it = amvnVar.iterator();
        while (it.hasNext()) {
            ((zdq) amupVar.get(it.next())).getClass();
        }
        amzs it2 = amvnVar.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            ((zdq) amupVar.get(next)).a(next, aoqtVar);
        }
    }
}
