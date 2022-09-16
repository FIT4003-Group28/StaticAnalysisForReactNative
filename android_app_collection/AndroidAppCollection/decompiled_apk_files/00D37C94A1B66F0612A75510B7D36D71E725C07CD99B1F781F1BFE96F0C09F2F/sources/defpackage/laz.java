package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: laz  reason: default package */
/* loaded from: classes3.dex */
public final class laz {
    private final yni a;
    private final aaqp b;
    private final acvh c;
    private final aadd d;
    private final aafo e;
    private final String f;
    private final String g;

    public laz(yni yniVar, aaqp aaqpVar, acvh acvhVar, aadd aaddVar, aafo aafoVar, String str, String str2) {
        this.a = yniVar;
        this.b = aaqpVar;
        this.c = acvhVar;
        this.d = aaddVar;
        this.e = aafoVar;
        this.f = str;
        this.g = str2;
    }

    public final void a(String str, byte[] bArr, String str2, int i) {
        if (!eog.z(this.d) || !this.c.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.c.t("sr_pa", asny.LATENCY_ACTION_SEARCH_UI);
        } else {
            this.c.t("sr_pa", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        aopc aopcVar = (aopc) aafr.e(str).mo52toBuilder();
        aopa createBuilder = atnp.a.createBuilder();
        if (str2 == null) {
            str2 = "";
        }
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 1;
        atnpVar.c = str2;
        createBuilder.copyOnWrite();
        atnp atnpVar2 = (atnp) createBuilder.instance;
        atnpVar2.b |= 2;
        atnpVar2.d = i;
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        aopc aopcVar2 = (aopc) ((auoy) aopcVar.qm(SearchEndpointOuterClass.searchEndpoint)).mo52toBuilder();
        if (!TextUtils.isEmpty(this.f)) {
            String str3 = this.f;
            aopcVar2.copyOnWrite();
            auoy auoyVar = (auoy) aopcVar2.instance;
            str3.getClass();
            auoyVar.b |= 2;
            auoyVar.d = str3;
        }
        if (!TextUtils.isEmpty(this.g)) {
            String str4 = this.g;
            aopcVar2.copyOnWrite();
            auoy auoyVar2 = (auoy) aopcVar2.instance;
            str4.getClass();
            auoyVar2.b |= 8;
            auoyVar2.f = str4;
        }
        aopcVar.e(SearchEndpointOuterClass.searchEndpoint, (auoy) aopcVar2.mo39build());
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", bArr);
        this.e.c((apzg) aopcVar.mo39build(), hashMap);
    }

    public final void b(byte[] bArr, String str, byte[] bArr2) {
        aoob aoobVar;
        apzg apzgVar;
        try {
            awxk awxkVar = (awxk) aopi.parseFrom(awxk.a, bArr);
            aaqp aaqpVar = this.b;
            if (awxkVar.b == 1) {
                aoobVar = (aoob) awxkVar.c;
            } else {
                aoobVar = aoob.b;
            }
            arkz arkzVar = (arkz) aaqpVar.a(aoobVar.I(), arkz.a);
            if (arkzVar == null) {
                return;
            }
            int i = arkzVar.b;
            if ((32768 & i) != 0) {
                aopc aopcVar = (aopc) atpl.a.createBuilder();
                arkw arkwVar = arkzVar.e;
                if (arkwVar == null) {
                    arkwVar = arkw.a;
                }
                arag aragVar = arkwVar.b;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                aopcVar.copyOnWrite();
                atpl atplVar = (atpl) aopcVar.instance;
                aragVar.getClass();
                atplVar.c = aragVar;
                atplVar.b |= 1;
                this.c.l(asny.LATENCY_ACTION_VOICE_ASSISTANT);
                this.a.d(aabj.b((atpl) aopcVar.mo39build()));
                return;
            }
            if ((i & 128) != 0) {
                apzgVar = arkzVar.d;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = null;
            }
            HashMap hashMap = new HashMap();
            if (apzgVar != null && apzgVar.qn(SearchEndpointOuterClass.searchEndpoint)) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", bArr2);
            } else {
                this.c.l(asny.LATENCY_ACTION_VOICE_ASSISTANT);
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new Bundle());
            }
            if (apzgVar != null && !apzgVar.qn(atno.b) && str != null) {
                aopa createBuilder = atnp.a.createBuilder();
                createBuilder.copyOnWrite();
                atnp atnpVar = (atnp) createBuilder.instance;
                atnpVar.b = 1 | atnpVar.b;
                atnpVar.c = str;
                aopc aopcVar2 = (aopc) apzgVar.mo52toBuilder();
                aopcVar2.e(atno.b, (atnp) createBuilder.mo39build());
                apzgVar = (apzg) aopcVar2.mo39build();
            }
            this.e.c(apzgVar, hashMap);
        } catch (aopx unused) {
        }
    }
}
