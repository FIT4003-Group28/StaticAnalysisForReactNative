package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
/* compiled from: PG */
/* renamed from: aafr  reason: default package */
/* loaded from: classes.dex */
public final class aafr {
    static {
        apzg apzgVar = apzg.a;
    }

    public static apzg a(String str) {
        apnv apnvVar;
        if (str == null) {
            apnvVar = apnv.a;
        } else {
            aopa createBuilder = apnv.a.createBuilder();
            createBuilder.copyOnWrite();
            apnv apnvVar2 = (apnv) createBuilder.instance;
            apnvVar2.b |= 1;
            apnvVar2.c = str;
            apnvVar = (apnv) createBuilder.mo39build();
        }
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, apnvVar);
        return (apzg) aopcVar.mo39build();
    }

    public static apzg b(byte[] bArr) {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        if (bArr != null) {
            try {
                aopcVar.mo38mergeFrom(bArr, aoos.b());
            } catch (aopx unused) {
            }
        }
        return (apzg) aopcVar.mo39build();
    }

    public static apzg c(byte[] bArr) {
        if (bArr != null) {
            try {
                return (apzg) aopi.parseFrom(apzg.a, bArr, aoos.b());
            } catch (aopx unused) {
            }
        }
        return apzg.a;
    }

    public static apzg d(String str) {
        aopa createBuilder = apnv.a.createBuilder();
        createBuilder.copyOnWrite();
        apnv apnvVar = (apnv) createBuilder.instance;
        apnvVar.b |= 1;
        apnvVar.c = str;
        createBuilder.copyOnWrite();
        apnv apnvVar2 = (apnv) createBuilder.instance;
        apnvVar2.b |= 16;
        apnvVar2.f = true;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    public static apzg e(String str) {
        aopc aopcVar = (aopc) auoy.a.createBuilder();
        aopcVar.copyOnWrite();
        auoy auoyVar = (auoy) aopcVar.instance;
        str.getClass();
        auoyVar.b |= 1;
        auoyVar.c = str;
        aopc aopcVar2 = (aopc) apzg.a.createBuilder();
        aopcVar2.e(SearchEndpointOuterClass.searchEndpoint, (auoy) aopcVar.mo39build());
        return (apzg) aopcVar2.mo39build();
    }

    public static apzg f(Uri uri) {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopg aopgVar = UrlEndpointOuterClass.urlEndpoint;
        aopa createBuilder = avvk.a.createBuilder();
        String uri2 = uri.toString();
        createBuilder.copyOnWrite();
        avvk avvkVar = (avvk) createBuilder.instance;
        uri2.getClass();
        avvkVar.b |= 1;
        avvkVar.c = uri2;
        aopcVar.e(aopgVar, (avvk) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }
}
