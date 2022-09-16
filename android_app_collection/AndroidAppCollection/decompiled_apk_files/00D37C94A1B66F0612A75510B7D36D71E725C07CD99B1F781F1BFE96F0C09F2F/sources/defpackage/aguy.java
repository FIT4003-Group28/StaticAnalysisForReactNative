package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aguy  reason: default package */
/* loaded from: classes.dex */
public final class aguy {
    public static final int a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        String lowerCase2 = str2.toLowerCase(Locale.getDefault());
        String lowerCase3 = str3.toLowerCase(Locale.getDefault());
        if (lowerCase2.contains(lowerCase) || lowerCase3.contains(lowerCase)) {
            return 3;
        }
        String[] split = lowerCase.split("\\s+");
        int i = 0;
        for (String str4 : split) {
            if (lowerCase2.contains(str4) || lowerCase3.contains(str4)) {
                i++;
            }
        }
        int length = split.length;
        if (i == length) {
            return 2;
        }
        return (i < (length >> 1) || i <= 0) ? 0 : 1;
    }

    public static apzg b(String str, aspb aspbVar) {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopg aopgVar = LikeEndpointOuterClass$LikeEndpoint.likeEndpoint;
        aopa createBuilder = LikeEndpointOuterClass$LikeEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) createBuilder.instance;
        likeEndpointOuterClass$LikeEndpoint.e = aspbVar.e;
        likeEndpointOuterClass$LikeEndpoint.b |= 1;
        aopa createBuilder2 = aspc.a.createBuilder();
        createBuilder2.copyOnWrite();
        aspc aspcVar = (aspc) createBuilder2.instance;
        str.getClass();
        aspcVar.b |= 1;
        aspcVar.c = str;
        createBuilder.copyOnWrite();
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint2 = (LikeEndpointOuterClass$LikeEndpoint) createBuilder.instance;
        aspc aspcVar2 = (aspc) createBuilder2.mo39build();
        aspcVar2.getClass();
        likeEndpointOuterClass$LikeEndpoint2.f = aspcVar2;
        likeEndpointOuterClass$LikeEndpoint2.b |= 2;
        aopcVar.e(aopgVar, (LikeEndpointOuterClass$LikeEndpoint) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    public static apzg c(String str, agqo agqoVar, int i, String str2, byte[] bArr) {
        agqoVar.getClass();
        return d(str, agqoVar.f(), i, str2, bArr != null ? aoob.x(bArr) : aoob.b);
    }

    public static apzg d(String str, String str2, int i, String str3, aoob aoobVar) {
        aopa createBuilder = attf.a.createBuilder();
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            attf attfVar = (attf) createBuilder.instance;
            str2.getClass();
            attfVar.b |= 1;
            attfVar.c = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            attf attfVar2 = (attf) createBuilder.instance;
            str.getClass();
            attfVar2.b |= 2;
            attfVar2.d = str;
        }
        if (i != -1) {
            createBuilder.copyOnWrite();
            attf attfVar3 = (attf) createBuilder.instance;
            attfVar3.b |= 4;
            attfVar3.e = i;
        }
        if (!TextUtils.isEmpty(str3)) {
            createBuilder.copyOnWrite();
            attf attfVar4 = (attf) createBuilder.instance;
            str3.getClass();
            attfVar4.b |= 8;
            attfVar4.f = str3;
        }
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(attg.a, (attf) createBuilder.mo39build());
        if (aoobVar != null && !aoobVar.H()) {
            aopcVar.copyOnWrite();
            apzg apzgVar = (apzg) aopcVar.instance;
            apzgVar.b |= 1;
            apzgVar.c = aoobVar;
        }
        return (apzg) aopcVar.mo39build();
    }

    public static aunb e(String str, boolean z) {
        aopc aopcVar = (aopc) auxb.a.createBuilder();
        if (z) {
            aopcVar.copyOnWrite();
            auxb auxbVar = (auxb) aopcVar.instance;
            auxbVar.b |= 1;
            auxbVar.c = true;
        } else {
            aopcVar.copyOnWrite();
            auxb auxbVar2 = (auxb) aopcVar.instance;
            auxbVar2.b |= 2;
            auxbVar2.d = true;
        }
        String f = aakj.f(62, str);
        aopcVar.copyOnWrite();
        auxb auxbVar3 = (auxb) aopcVar.instance;
        f.getClass();
        auxbVar3.b |= 16;
        auxbVar3.f = f;
        aopa createBuilder = apok.a.createBuilder();
        aopa createBuilder2 = apos.a.createBuilder();
        aopc aopcVar2 = (aopc) arhs.a.createBuilder();
        arhr arhrVar = z ? arhr.LIKE : arhr.DISLIKE;
        aopcVar2.copyOnWrite();
        arhs arhsVar = (arhs) aopcVar2.instance;
        arhsVar.c = arhrVar.pS;
        arhsVar.b |= 1;
        createBuilder2.copyOnWrite();
        apos aposVar = (apos) createBuilder2.instance;
        arhs arhsVar2 = (arhs) aopcVar2.mo39build();
        arhsVar2.getClass();
        aposVar.g = arhsVar2;
        aposVar.b |= 32;
        aopc aopcVar3 = (aopc) arhs.a.createBuilder();
        arhr arhrVar2 = z ? arhr.LIKE_SELECTED : arhr.DISLIKE_SELECTED;
        aopcVar3.copyOnWrite();
        arhs arhsVar3 = (arhs) aopcVar3.instance;
        arhsVar3.c = arhrVar2.pS;
        arhsVar3.b = 1 | arhsVar3.b;
        createBuilder2.copyOnWrite();
        apos aposVar2 = (apos) createBuilder2.instance;
        arhs arhsVar4 = (arhs) aopcVar3.mo39build();
        arhsVar4.getClass();
        aposVar2.m = arhsVar4;
        aposVar2.b |= 2048;
        apzg b = b(str, z ? aspb.LIKE : aspb.DISLIKE);
        createBuilder2.copyOnWrite();
        apos aposVar3 = (apos) createBuilder2.instance;
        b.getClass();
        aposVar3.k = b;
        aposVar3.b |= 512;
        apzg b2 = b(str, aspb.INDIFFERENT);
        createBuilder2.copyOnWrite();
        apos aposVar4 = (apos) createBuilder2.instance;
        b2.getClass();
        aposVar4.p = b2;
        aposVar4.b |= 16384;
        createBuilder.copyOnWrite();
        apok apokVar = (apok) createBuilder.instance;
        apos aposVar5 = (apos) createBuilder2.mo39build();
        aposVar5.getClass();
        apokVar.d = aposVar5;
        apokVar.b |= 2;
        aopcVar.copyOnWrite();
        auxb auxbVar4 = (auxb) aopcVar.instance;
        apok apokVar2 = (apok) createBuilder.mo39build();
        apokVar2.getClass();
        auxbVar4.g = apokVar2;
        auxbVar4.b |= 32;
        aopc aopcVar4 = (aopc) aunb.a.createBuilder();
        aopcVar4.e(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer, (auxb) aopcVar.mo39build());
        return (aunb) aopcVar4.mo39build();
    }
}
