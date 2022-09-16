package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: ess  reason: default package */
/* loaded from: classes3.dex */
public final class ess {
    private final Context a;
    private final fcl b;

    public ess(Context context, fcl fclVar) {
        this.a = context;
        this.b = fclVar;
    }

    public static final arlt c(arlt arltVar) {
        armc armcVar;
        armc armcVar2;
        armc armcVar3;
        avfo avfoVar;
        avfo avfoVar2;
        arltVar.getClass();
        arlu arluVar = arltVar.f;
        if (arluVar == null) {
            arluVar = arlu.a;
        }
        if (arluVar.b == 58173949) {
            armcVar = (armc) arluVar.c;
        } else {
            armcVar = armc.a;
        }
        if (armcVar.c.size() == 0) {
            return null;
        }
        aopc aopcVar = (aopc) arltVar.mo52toBuilder();
        aopa createBuilder = avfk.a.createBuilder();
        auqh auqhVar = auqh.a;
        createBuilder.copyOnWrite();
        avfk avfkVar = (avfk) createBuilder.instance;
        auqhVar.getClass();
        avfkVar.c = auqhVar;
        avfkVar.b |= 1;
        avfk avfkVar2 = (avfk) createBuilder.mo39build();
        ArrayList o = amxp.o();
        arlu arluVar2 = ((arlt) aopcVar.instance).f;
        if (arluVar2 == null) {
            arluVar2 = arlu.a;
        }
        if (arluVar2.b == 58173949) {
            armcVar2 = (armc) arluVar2.c;
        } else {
            armcVar2 = armc.a;
        }
        aopu aopuVar = armcVar2.c;
        int i = 0;
        while (i < aopuVar.size()) {
            arlw arlwVar = (arlw) aopuVar.get(i);
            if (arlwVar.b == 58174010) {
                avfoVar = (avfo) arlwVar.c;
            } else {
                avfoVar = avfo.a;
            }
            aopa mo52toBuilder = avfoVar.mo52toBuilder();
            boolean z = i == 0;
            mo52toBuilder.copyOnWrite();
            avfo avfoVar3 = (avfo) mo52toBuilder.instance;
            avfoVar3.b |= 8;
            avfoVar3.f = z;
            if (arlwVar.b == 58174010) {
                avfoVar2 = (avfo) arlwVar.c;
            } else {
                avfoVar2 = avfo.a;
            }
            avfk avfkVar3 = avfoVar2.k;
            if (avfkVar3 == null) {
                avfkVar3 = avfk.a;
            }
            auqh auqhVar2 = avfkVar3.c;
            if (auqhVar2 == null) {
                auqhVar2 = auqh.a;
            }
            if (auqhVar2.d.size() != 0) {
                avfk avfkVar4 = avfoVar2.k;
                if (avfkVar4 == null) {
                    avfkVar4 = avfk.a;
                }
                auqh auqhVar3 = avfkVar4.c;
                if (auqhVar3 == null) {
                    auqhVar3 = auqh.a;
                }
                for (auqk auqkVar : auqhVar3.d) {
                    if ((auqkVar.c & 65536) != 0) {
                        break;
                    } else if ((auqkVar.e & 2) != 0) {
                        apwz apwzVar = auqkVar.aY;
                        if (apwzVar == null) {
                            apwzVar = apwz.a;
                        }
                        apwu apwuVar = apwzVar.c;
                        if (apwuVar == null) {
                            apwuVar = apwu.a;
                        }
                        int b = apwt.b(apwuVar.c);
                        if (b != 0 && b == 2) {
                            break;
                        }
                    }
                    aopa mo52toBuilder2 = arlwVar.mo52toBuilder();
                    mo52toBuilder2.copyOnWrite();
                    arlw arlwVar2 = (arlw) mo52toBuilder2.instance;
                    avfo avfoVar4 = (avfo) mo52toBuilder.mo39build();
                    avfoVar4.getClass();
                    arlwVar2.c = avfoVar4;
                    arlwVar2.b = 58174010;
                    o.add((arlw) mo52toBuilder2.mo39build());
                    i++;
                }
            }
            mo52toBuilder.copyOnWrite();
            avfo avfoVar5 = (avfo) mo52toBuilder.instance;
            avfkVar2.getClass();
            avfoVar5.k = avfkVar2;
            avfoVar5.b |= 8192;
            aopa mo52toBuilder22 = arlwVar.mo52toBuilder();
            mo52toBuilder22.copyOnWrite();
            arlw arlwVar22 = (arlw) mo52toBuilder22.instance;
            avfo avfoVar42 = (avfo) mo52toBuilder.mo39build();
            avfoVar42.getClass();
            arlwVar22.c = avfoVar42;
            arlwVar22.b = 58174010;
            o.add((arlw) mo52toBuilder22.mo39build());
            i++;
        }
        arlu arluVar3 = ((arlt) aopcVar.instance).f;
        if (arluVar3 == null) {
            arluVar3 = arlu.a;
        }
        if (arluVar3.b == 58173949) {
            armcVar3 = (armc) arluVar3.c;
        } else {
            armcVar3 = armc.a;
        }
        aopa mo52toBuilder3 = armcVar3.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        ((armc) mo52toBuilder3.instance).c = armc.emptyProtobufList();
        mo52toBuilder3.copyOnWrite();
        armc armcVar4 = (armc) mo52toBuilder3.instance;
        armcVar4.a();
        aonk.addAll((Iterable) o, (List) armcVar4.c);
        armc armcVar5 = (armc) mo52toBuilder3.mo39build();
        arlu arluVar4 = ((arlt) aopcVar.instance).f;
        if (arluVar4 == null) {
            arluVar4 = arlu.a;
        }
        aopa mo52toBuilder4 = arluVar4.mo52toBuilder();
        mo52toBuilder4.copyOnWrite();
        arlu arluVar5 = (arlu) mo52toBuilder4.instance;
        armcVar5.getClass();
        arluVar5.c = armcVar5;
        arluVar5.b = 58173949;
        aopcVar.copyOnWrite();
        arlt arltVar2 = (arlt) aopcVar.instance;
        arlu arluVar6 = (arlu) mo52toBuilder4.mo39build();
        arluVar6.getClass();
        arltVar2.f = arluVar6;
        arltVar2.b |= 64;
        return (arlt) aopcVar.mo39build();
    }

    private final arag d(int i) {
        return ajgl.g(this.a.getString(i));
    }

    private final arlt e(auqk... auqkVarArr) {
        aopa createBuilder = auqh.a.createBuilder();
        createBuilder.aI(Arrays.asList(auqkVarArr));
        auqh auqhVar = (auqh) createBuilder.mo39build();
        aopa createBuilder2 = avfo.a.createBuilder();
        createBuilder2.copyOnWrite();
        avfo avfoVar = (avfo) createBuilder2.instance;
        avfoVar.b |= 8;
        avfoVar.f = true;
        createBuilder2.copyOnWrite();
        avfo avfoVar2 = (avfo) createBuilder2.instance;
        avfoVar2.b |= 4;
        avfoVar2.e = "FElibrary";
        aopa createBuilder3 = avfk.a.createBuilder();
        createBuilder3.copyOnWrite();
        avfk avfkVar = (avfk) createBuilder3.instance;
        auqhVar.getClass();
        avfkVar.c = auqhVar;
        avfkVar.b |= 1;
        createBuilder2.copyOnWrite();
        avfo avfoVar3 = (avfo) createBuilder2.instance;
        avfk avfkVar2 = (avfk) createBuilder3.mo39build();
        avfkVar2.getClass();
        avfoVar3.k = avfkVar2;
        avfoVar3.b |= 8192;
        avfo avfoVar4 = (avfo) createBuilder2.mo39build();
        aopa createBuilder4 = armc.a.createBuilder();
        createBuilder4.copyOnWrite();
        armc armcVar = (armc) createBuilder4.instance;
        armcVar.b |= 1;
        armcVar.d = true;
        createBuilder4.copyOnWrite();
        armc armcVar2 = (armc) createBuilder4.instance;
        armcVar2.b |= 2;
        armcVar2.e = true;
        aopa createBuilder5 = arlw.a.createBuilder();
        createBuilder5.copyOnWrite();
        arlw arlwVar = (arlw) createBuilder5.instance;
        avfoVar4.getClass();
        arlwVar.c = avfoVar4;
        arlwVar.b = 58174010;
        createBuilder4.ag(createBuilder5);
        armc armcVar3 = (armc) createBuilder4.mo39build();
        aopa createBuilder6 = aqye.a.createBuilder();
        arag g = ajgl.g(this.a.getString(R.string.offline_application_name));
        createBuilder6.copyOnWrite();
        aqye aqyeVar = (aqye) createBuilder6.instance;
        g.getClass();
        aqyeVar.c = g;
        aqyeVar.b |= 1;
        aqye aqyeVar2 = (aqye) createBuilder6.mo39build();
        aopc aopcVar = (aopc) arlt.a.createBuilder();
        arpa arpaVar = arpa.a;
        aopcVar.copyOnWrite();
        arlt arltVar = (arlt) aopcVar.instance;
        arpaVar.getClass();
        arltVar.c = arpaVar;
        arltVar.b = 1 | arltVar.b;
        aopa createBuilder7 = arlo.a.createBuilder();
        createBuilder7.copyOnWrite();
        arlo arloVar = (arlo) createBuilder7.instance;
        aqyeVar2.getClass();
        arloVar.c = aqyeVar2;
        arloVar.b = 50236216;
        aopcVar.copyOnWrite();
        arlt arltVar2 = (arlt) aopcVar.instance;
        arlo arloVar2 = (arlo) createBuilder7.mo39build();
        arloVar2.getClass();
        arltVar2.d = arloVar2;
        arltVar2.b |= 2;
        aopa createBuilder8 = arlu.a.createBuilder();
        createBuilder8.copyOnWrite();
        arlu arluVar = (arlu) createBuilder8.instance;
        armcVar3.getClass();
        arluVar.c = armcVar3;
        arluVar.b = 58173949;
        aopcVar.copyOnWrite();
        arlt arltVar3 = (arlt) aopcVar.instance;
        arlu arluVar2 = (arlu) createBuilder8.mo39build();
        arluVar2.getClass();
        arltVar3.f = arluVar2;
        arltVar3.b |= 64;
        return (arlt) aopcVar.mo39build();
    }

    private static apkd f(int i, arag aragVar, apzg apzgVar) {
        aopa createBuilder = apkd.a.createBuilder();
        aopc aopcVar = (aopc) apoj.a.createBuilder();
        aopcVar.copyOnWrite();
        apoj apojVar = (apoj) aopcVar.instance;
        apojVar.d = Integer.valueOf(i - 1);
        apojVar.c = 1;
        aopcVar.copyOnWrite();
        apoj apojVar2 = (apoj) aopcVar.instance;
        apojVar2.e = 3;
        apojVar2.b |= 8;
        aopcVar.copyOnWrite();
        apoj apojVar3 = (apoj) aopcVar.instance;
        aragVar.getClass();
        apojVar3.i = aragVar;
        apojVar3.b |= 256;
        aopcVar.copyOnWrite();
        apoj apojVar4 = (apoj) aopcVar.instance;
        apzgVar.getClass();
        apojVar4.o = apzgVar;
        apojVar4.b |= 16384;
        createBuilder.copyOnWrite();
        apkd apkdVar = (apkd) createBuilder.instance;
        apoj apojVar5 = (apoj) aopcVar.mo39build();
        apojVar5.getClass();
        apkdVar.c = apojVar5;
        apkdVar.b = 65153809;
        return (apkd) createBuilder.mo39build();
    }

    public final arlt a() {
        aslq aslqVar;
        if (this.b.h()) {
            aopa createBuilder = arhu.a.createBuilder();
            aopc aopcVar = (aopc) arhs.a.createBuilder();
            arhr arhrVar = arhr.OFFLINE_DOWNLOAD;
            aopcVar.copyOnWrite();
            arhs arhsVar = (arhs) aopcVar.instance;
            arhsVar.c = arhrVar.pS;
            arhsVar.b |= 1;
            createBuilder.copyOnWrite();
            arhu arhuVar = (arhu) createBuilder.instance;
            arhs arhsVar2 = (arhs) aopcVar.mo39build();
            arhsVar2.getClass();
            arhuVar.c = arhsVar2;
            arhuVar.b |= 1;
            arhu arhuVar2 = (arhu) createBuilder.mo39build();
            aopa createBuilder2 = aqdv.a.createBuilder();
            arag g = ajgl.g(this.a.getString(R.string.fallback_downloads_top_link_title));
            createBuilder2.copyOnWrite();
            aqdv aqdvVar = (aqdv) createBuilder2.instance;
            g.getClass();
            aqdvVar.g = g;
            aqdvVar.b |= 1;
            aopa createBuilder3 = aqdx.a.createBuilder();
            createBuilder3.copyOnWrite();
            aqdx aqdxVar = (aqdx) createBuilder3.instance;
            arhuVar2.getClass();
            aqdxVar.f = arhuVar2;
            aqdxVar.b |= 128;
            createBuilder2.copyOnWrite();
            aqdv aqdvVar2 = (aqdv) createBuilder2.instance;
            aqdx aqdxVar2 = (aqdx) createBuilder3.mo39build();
            aqdxVar2.getClass();
            aqdvVar2.i = aqdxVar2;
            aqdvVar2.b |= 32;
            aopa createBuilder4 = aucf.a.createBuilder();
            createBuilder4.copyOnWrite();
            aucf aucfVar = (aucf) createBuilder4.instance;
            aucfVar.b |= 1;
            aucfVar.c = "PPSV";
            aucf aucfVar2 = (aucf) createBuilder4.mo39build();
            aopa createBuilder5 = aqds.a.createBuilder();
            createBuilder5.copyOnWrite();
            aqds aqdsVar = (aqds) createBuilder5.instance;
            aucfVar2.getClass();
            aqdsVar.c = aucfVar2;
            aqdsVar.b = 135739232;
            createBuilder2.copyOnWrite();
            aqdv aqdvVar3 = (aqdv) createBuilder2.instance;
            aqds aqdsVar2 = (aqds) createBuilder5.mo39build();
            aqdsVar2.getClass();
            aqdvVar3.k = aqdsVar2;
            aqdvVar3.b |= 32768;
            apzg apzgVar = far.a;
            createBuilder2.copyOnWrite();
            aqdv aqdvVar4 = (aqdv) createBuilder2.instance;
            apzgVar.getClass();
            aqdvVar4.d = apzgVar;
            aqdvVar4.c = 4;
            aopc aopcVar2 = (aopc) aslq.a.createBuilder();
            aopa createBuilder6 = aslt.a.createBuilder();
            createBuilder6.copyOnWrite();
            aslt asltVar = (aslt) createBuilder6.instance;
            aqdv aqdvVar5 = (aqdv) createBuilder2.mo39build();
            aqdvVar5.getClass();
            asltVar.x = aqdvVar5;
            asltVar.b |= 4096;
            aopcVar2.copyOnWrite();
            aslq aslqVar2 = (aslq) aopcVar2.instance;
            aslt asltVar2 = (aslt) createBuilder6.mo39build();
            asltVar2.getClass();
            aslqVar2.a();
            aslqVar2.e.add(asltVar2);
            aslqVar = (aslq) aopcVar2.mo39build();
        } else {
            aslqVar = null;
        }
        aopa createBuilder7 = apwx.a.createBuilder();
        arag g2 = ajgl.g(this.a.getString(R.string.fallback_client_sorting_section_renderer_header));
        createBuilder7.copyOnWrite();
        apwx apwxVar = (apwx) createBuilder7.instance;
        g2.getClass();
        apwxVar.c = g2;
        apwxVar.b |= 1;
        aopa createBuilder8 = apwv.a.createBuilder();
        createBuilder8.copyOnWrite();
        apwv apwvVar = (apwv) createBuilder8.instance;
        apwvVar.b |= 8;
        apwvVar.f = false;
        createBuilder8.copyOnWrite();
        apwv apwvVar2 = (apwv) createBuilder8.instance;
        apwvVar2.b |= 2;
        apwvVar2.d = true;
        aopa createBuilder9 = apxa.a.createBuilder();
        createBuilder9.copyOnWrite();
        apxa apxaVar = (apxa) createBuilder9.instance;
        apxaVar.c = 1;
        apxaVar.b |= 1;
        createBuilder8.copyOnWrite();
        apwv apwvVar3 = (apwv) createBuilder8.instance;
        apxa apxaVar2 = (apxa) createBuilder9.mo39build();
        apxaVar2.getClass();
        apwvVar3.e = apxaVar2;
        apwvVar3.b = 4 | apwvVar3.b;
        createBuilder7.copyOnWrite();
        apwx apwxVar2 = (apwx) createBuilder7.instance;
        apwv apwvVar4 = (apwv) createBuilder8.mo39build();
        apwvVar4.getClass();
        aopu aopuVar = apwxVar2.d;
        if (!aopuVar.c()) {
            apwxVar2.d = aopi.mutableCopy(aopuVar);
        }
        apwxVar2.d.add(apwvVar4);
        apwx apwxVar3 = (apwx) createBuilder7.mo39build();
        aopa createBuilder10 = apwz.a.createBuilder();
        aopa createBuilder11 = apwy.a.createBuilder();
        createBuilder11.copyOnWrite();
        apwy apwyVar = (apwy) createBuilder11.instance;
        apwxVar3.getClass();
        apwyVar.c = apwxVar3;
        apwyVar.b = 140080728;
        createBuilder10.copyOnWrite();
        apwz apwzVar = (apwz) createBuilder10.instance;
        apwy apwyVar2 = (apwy) createBuilder11.mo39build();
        apwyVar2.getClass();
        apwzVar.d = apwyVar2;
        apwzVar.b |= 2;
        aopa createBuilder12 = apwu.a.createBuilder();
        createBuilder12.copyOnWrite();
        apwu apwuVar = (apwu) createBuilder12.instance;
        apwuVar.c = 1;
        apwuVar.b |= 1;
        createBuilder10.copyOnWrite();
        apwz apwzVar2 = (apwz) createBuilder10.instance;
        apwu apwuVar2 = (apwu) createBuilder12.mo39build();
        apwuVar2.getClass();
        apwzVar2.c = apwuVar2;
        apwzVar2.b |= 1;
        createBuilder10.copyOnWrite();
        apwz apwzVar3 = (apwz) createBuilder10.instance;
        aopu aopuVar2 = apwzVar3.g;
        if (!aopuVar2.c()) {
            apwzVar3.g = aopi.mutableCopy(aopuVar2);
        }
        apwzVar3.g.add("PPSV");
        apwz apwzVar4 = (apwz) createBuilder10.mo39build();
        aopa createBuilder13 = auqk.a.createBuilder();
        createBuilder13.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder13.instance;
        apwzVar4.getClass();
        auqkVar.aY = apwzVar4;
        auqkVar.e |= 2;
        auqk auqkVar2 = (auqk) createBuilder13.mo39build();
        if (aslqVar != null) {
            aopa createBuilder14 = auqk.a.createBuilder();
            createBuilder14.copyOnWrite();
            auqk auqkVar3 = (auqk) createBuilder14.instance;
            auqkVar3.j = aslqVar;
            auqkVar3.b |= 16;
            return e((auqk) createBuilder14.mo39build(), auqkVar2);
        }
        return e(auqkVar2);
    }

    public final arlt b(arlt arltVar) {
        armc armcVar;
        arhr arhrVar;
        armc armcVar2;
        avfo avfoVar;
        arltVar.getClass();
        arlu arluVar = arltVar.f;
        if (arluVar == null) {
            arluVar = arlu.a;
        }
        if (arluVar.b == 58173949) {
            armcVar = (armc) arluVar.c;
        } else {
            armcVar = armc.a;
        }
        if (armcVar.c.size() == 0) {
            return null;
        }
        aopc aopcVar = (aopc) arltVar.mo52toBuilder();
        aopc aopcVar2 = (aopc) aslq.a.createBuilder();
        boolean h = this.b.h();
        boolean z = arltVar.s;
        aopa createBuilder = apke.a.createBuilder();
        aopa createBuilder2 = apkf.a.createBuilder();
        createBuilder2.copyOnWrite();
        apkf apkfVar = (apkf) createBuilder2.instance;
        apkfVar.c = 1;
        apkfVar.b |= 1;
        createBuilder.copyOnWrite();
        apke apkeVar = (apke) createBuilder.instance;
        apkf apkfVar2 = (apkf) createBuilder2.mo39build();
        apkfVar2.getClass();
        apkeVar.j = apkfVar2;
        apkeVar.b |= 256;
        aopa createBuilder3 = apkg.a.createBuilder();
        if (z || h) {
            arhrVar = arhr.OFFLINE_NO_CONTENT;
        } else {
            arhrVar = arhr.OFFLINE_NO_CONTENT_UPSIDE_DOWN;
        }
        createBuilder3.copyOnWrite();
        apkg apkgVar = (apkg) createBuilder3.instance;
        apkgVar.c = arhrVar.pS;
        apkgVar.b |= 1;
        createBuilder.copyOnWrite();
        apke apkeVar2 = (apke) createBuilder.instance;
        apkg apkgVar2 = (apkg) createBuilder3.mo39build();
        apkgVar2.getClass();
        apkeVar2.d = apkgVar2;
        apkeVar2.c = 3;
        if (h) {
            arag d = d(R.string.offline_no_content_title_offline_eligible_and_has_content);
            createBuilder.copyOnWrite();
            apke apkeVar3 = (apke) createBuilder.instance;
            d.getClass();
            apkeVar3.e = d;
            apkeVar3.b |= 1;
            aopc aopcVar3 = (aopc) apzg.a.createBuilder();
            aopcVar3.e(DownloadsPageEndpointOuterClass.downloadsPageEndpoint, aqpb.a);
            apzg apzgVar = (apzg) aopcVar3.mo39build();
            if (this.b.n()) {
                arag d2 = d(R.string.offline_no_content_title_has_download_recommendations);
                createBuilder.copyOnWrite();
                apke apkeVar4 = (apke) createBuilder.instance;
                d2.getClass();
                apkeVar4.e = d2;
                apkeVar4.b |= 1;
                arag d3 = d(R.string.offline_no_content_body_text_has_download_recommendations);
                createBuilder.copyOnWrite();
                apke apkeVar5 = (apke) createBuilder.instance;
                d3.getClass();
                apkeVar5.f = d3;
                apkeVar5.b |= 2;
                apkd f = f(3, d(R.string.offline_no_content_button_text_has_download_recommendations), apzgVar);
                createBuilder.copyOnWrite();
                apke apkeVar6 = (apke) createBuilder.instance;
                f.getClass();
                apkeVar6.h = f;
                apkeVar6.b |= 64;
            } else if (this.b.e()) {
                arag d4 = d(R.string.offline_no_content_body_text_has_both_downloads_and_recommendations);
                createBuilder.copyOnWrite();
                apke apkeVar7 = (apke) createBuilder.instance;
                d4.getClass();
                apkeVar7.f = d4;
                apkeVar7.b |= 2;
                apkd f2 = f(3, d(R.string.offline_no_content_button_text_has_download_recommendations), apzgVar);
                createBuilder.copyOnWrite();
                apke apkeVar8 = (apke) createBuilder.instance;
                f2.getClass();
                apkeVar8.h = f2;
                apkeVar8.b |= 64;
            } else {
                arag d5 = d(R.string.offline_no_content_body_text_offline_eligible_and_has_only_singletons);
                createBuilder.copyOnWrite();
                apke apkeVar9 = (apke) createBuilder.instance;
                d5.getClass();
                apkeVar9.f = d5;
                apkeVar9.b |= 2;
                apkd f3 = f(3, d(R.string.offline_no_content_downloads_button_text), apzgVar);
                createBuilder.copyOnWrite();
                apke apkeVar10 = (apke) createBuilder.instance;
                f3.getClass();
                apkeVar10.h = f3;
                apkeVar10.b |= 64;
            }
        } else if (z) {
            arag d6 = d(R.string.offline_no_content_title_offline_eligible_and_no_content);
            createBuilder.copyOnWrite();
            apke apkeVar11 = (apke) createBuilder.instance;
            d6.getClass();
            apkeVar11.e = d6;
            apkeVar11.b |= 1;
            arag d7 = d(R.string.offline_no_content_body_text_offline_eligible_and_no_content);
            createBuilder.copyOnWrite();
            apke apkeVar12 = (apke) createBuilder.instance;
            d7.getClass();
            apkeVar12.f = d7;
            apkeVar12.b |= 2;
        } else {
            arag d8 = d(R.string.offline_no_content_title_not_offline_eligible);
            createBuilder.copyOnWrite();
            apke apkeVar13 = (apke) createBuilder.instance;
            d8.getClass();
            apkeVar13.e = d8;
            apkeVar13.b |= 1;
            arag d9 = d(R.string.offline_no_content_body_text_not_offline_eligible);
            createBuilder.copyOnWrite();
            apke apkeVar14 = (apke) createBuilder.instance;
            d9.getClass();
            apkeVar14.f = d9;
            apkeVar14.b |= 2;
        }
        aopa createBuilder4 = RefreshCommandOuterClass$RefreshCommand.a.createBuilder();
        createBuilder4.copyOnWrite();
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = (RefreshCommandOuterClass$RefreshCommand) createBuilder4.instance;
        refreshCommandOuterClass$RefreshCommand.c = 1;
        refreshCommandOuterClass$RefreshCommand.b |= 1;
        aopc aopcVar4 = (aopc) apzg.a.createBuilder();
        aopcVar4.e(RefreshCommandOuterClass$RefreshCommand.refreshCommand, (RefreshCommandOuterClass$RefreshCommand) createBuilder4.mo39build());
        apkd f4 = f(14, d(R.string.offline_retry), (apzg) aopcVar4.mo39build());
        createBuilder.copyOnWrite();
        apke apkeVar15 = (apke) createBuilder.instance;
        f4.getClass();
        apkeVar15.i = f4;
        apkeVar15.b |= 128;
        apke apkeVar16 = (apke) createBuilder.mo39build();
        aopa createBuilder5 = aslt.a.createBuilder();
        createBuilder5.copyOnWrite();
        aslt asltVar = (aslt) createBuilder5.instance;
        apkeVar16.getClass();
        asltVar.ag = apkeVar16;
        asltVar.f |= 512;
        aopcVar2.ck((aslt) createBuilder5.mo39build());
        aslq aslqVar = (aslq) aopcVar2.mo39build();
        aopa createBuilder6 = auqh.a.createBuilder();
        aopa createBuilder7 = auqk.a.createBuilder();
        createBuilder7.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder7.instance;
        aslqVar.getClass();
        auqkVar.j = aslqVar;
        auqkVar.b |= 16;
        createBuilder6.aK(createBuilder7);
        auqh auqhVar = (auqh) createBuilder6.mo39build();
        aopa createBuilder8 = avfk.a.createBuilder();
        createBuilder8.copyOnWrite();
        avfk avfkVar = (avfk) createBuilder8.instance;
        auqhVar.getClass();
        avfkVar.c = auqhVar;
        avfkVar.b |= 1;
        avfk avfkVar2 = (avfk) createBuilder8.mo39build();
        arlu arluVar2 = arltVar.f;
        if (arluVar2 == null) {
            arluVar2 = arlu.a;
        }
        if (arluVar2.b == 58173949) {
            armcVar2 = (armc) arluVar2.c;
        } else {
            armcVar2 = armc.a;
        }
        aopa mo52toBuilder = armcVar2.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((armc) mo52toBuilder.instance).c = armc.emptyProtobufList();
        aopa createBuilder9 = arlw.a.createBuilder();
        arlw arlwVar = (arlw) armcVar2.c.get(0);
        if (arlwVar.b == 58174010) {
            avfoVar = (avfo) arlwVar.c;
        } else {
            avfoVar = avfo.a;
        }
        aopa mo52toBuilder2 = avfoVar.mo52toBuilder();
        mo52toBuilder2.copyOnWrite();
        avfo avfoVar2 = (avfo) mo52toBuilder2.instance;
        avfkVar2.getClass();
        avfoVar2.k = avfkVar2;
        avfoVar2.b |= 8192;
        mo52toBuilder2.copyOnWrite();
        avfo avfoVar3 = (avfo) mo52toBuilder2.instance;
        avfoVar3.b |= 8;
        avfoVar3.f = true;
        String string = this.a.getString(R.string.offline_application_name);
        mo52toBuilder2.copyOnWrite();
        avfo avfoVar4 = (avfo) mo52toBuilder2.instance;
        string.getClass();
        avfoVar4.b |= 4;
        avfoVar4.e = string;
        createBuilder9.copyOnWrite();
        arlw arlwVar2 = (arlw) createBuilder9.instance;
        avfo avfoVar5 = (avfo) mo52toBuilder2.mo39build();
        avfoVar5.getClass();
        arlwVar2.c = avfoVar5;
        arlwVar2.b = 58174010;
        mo52toBuilder.ag(createBuilder9);
        armc armcVar3 = (armc) mo52toBuilder.mo39build();
        arlu arluVar3 = ((arlt) aopcVar.instance).f;
        if (arluVar3 == null) {
            arluVar3 = arlu.a;
        }
        aopa mo52toBuilder3 = arluVar3.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        arlu arluVar4 = (arlu) mo52toBuilder3.instance;
        armcVar3.getClass();
        arluVar4.c = armcVar3;
        arluVar4.b = 58173949;
        aopcVar.copyOnWrite();
        arlt arltVar2 = (arlt) aopcVar.instance;
        arlu arluVar5 = (arlu) mo52toBuilder3.mo39build();
        arluVar5.getClass();
        arltVar2.f = arluVar5;
        arltVar2.b |= 64;
        return (arlt) aopcVar.mo39build();
    }
}
