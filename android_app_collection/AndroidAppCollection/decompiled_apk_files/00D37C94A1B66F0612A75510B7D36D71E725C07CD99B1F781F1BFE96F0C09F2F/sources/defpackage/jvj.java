package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jvj  reason: default package */
/* loaded from: classes3.dex */
public final class jvj implements ruz {
    final /* synthetic */ String a;
    final /* synthetic */ jvk b;

    public jvj(jvk jvkVar, String str) {
        this.b = jvkVar;
        this.a = str;
    }

    @Override // defpackage.ruz
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Void r5 = (Void) obj;
        qst qstVar = this.b.a.get();
        String str = this.a;
        String packageName = qstVar.w.getPackageName();
        qvx b = qvy.b();
        b.a = new rtf(str, packageName);
        b.b = new Feature[]{rtb.c};
        b.b();
        rve s = qstVar.s(b.a());
        s.r(new ruz() { // from class: jvi
            @Override // defpackage.ruz
            public final void d(Object obj2) {
                jvj jvjVar = jvj.this;
                ExperimentTokens experimentTokens = (ExperimentTokens) obj2;
                anva anvaVar = null;
                if (experimentTokens != null) {
                    aopa createBuilder = anva.a.createBuilder();
                    int[] iArr = experimentTokens.h;
                    if (!tfo.r(iArr) || !tfo.r(null)) {
                        aopa createBuilder2 = anuz.a.createBuilder();
                        if (iArr != null) {
                            for (int i : iArr) {
                                createBuilder2.copyOnWrite();
                                anuz anuzVar = (anuz) createBuilder2.instance;
                                aopq aopqVar = anuzVar.b;
                                if (!aopqVar.c()) {
                                    anuzVar.b = aopi.mutableCopy(aopqVar);
                                }
                                anuzVar.b.g(i);
                            }
                        }
                        aoob byteString = ((anuz) createBuilder2.mo39build()).toByteString();
                        createBuilder.copyOnWrite();
                        anva anvaVar2 = (anva) createBuilder.instance;
                        anvaVar2.b |= 1;
                        anvaVar2.c = byteString;
                    }
                    byte[] bArr = experimentTokens.c;
                    if (bArr != null && bArr.length != 0) {
                        createBuilder.K(aoob.x(bArr));
                    }
                    byte[][] bArr2 = experimentTokens.i;
                    if (bArr2 != null) {
                        for (byte[] bArr3 : bArr2) {
                            if (bArr3 != null && bArr3.length != 0) {
                                createBuilder.K(aoob.x(bArr3));
                            }
                        }
                    }
                    createBuilder.copyOnWrite();
                    anva anvaVar3 = (anva) createBuilder.instance;
                    anvaVar3.b |= 4;
                    anvaVar3.e = false;
                    byte[][][] bArr4 = {experimentTokens.e, experimentTokens.f, experimentTokens.g};
                    for (int i2 = 0; i2 < 3; i2++) {
                        byte[][] bArr5 = bArr4[i2];
                        if (bArr5 != null) {
                            List u = amxp.u(Arrays.asList(bArr5), aosn.a.e());
                            createBuilder.copyOnWrite();
                            anva anvaVar4 = (anva) createBuilder.instance;
                            anvaVar4.a();
                            aonk.addAll((Iterable) u, (List) anvaVar4.d);
                        }
                    }
                    anvaVar = (anva) createBuilder.mo39build();
                }
                if (anvaVar != null) {
                    jvjVar.b.b.put("com.youtube.mainapp.android", anvaVar);
                }
            }
        });
        s.n(new ruw() { // from class: jvh
            @Override // defpackage.ruw
            public final void c(Exception exc) {
                jvj.this.b.b.remove("com.youtube.mainapp.android");
                afus.c(1, 12, "Failed to get Heterodyne IDs for Mendel package com.youtube.mainapp.android", exc);
            }
        });
    }
}
