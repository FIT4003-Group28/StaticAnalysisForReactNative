package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.List;
/* compiled from: PG */
/* renamed from: agsm  reason: default package */
/* loaded from: classes.dex */
public final class agsm {
    private final zfq a;
    private final int b;

    public agsm(zfq zfqVar, int i) {
        this.a = zfqVar;
        this.b = i;
    }

    private static apji b(String str, int i, int i2, int i3, orv orvVar, List list) {
        boolean z = orvVar.c;
        boolean z2 = orvVar.e && orvVar.f.size() != 0;
        boolean z3 = orvVar.d;
        String encodeToString = Base64.encodeToString(orvVar.toByteArray(), 0);
        aopa createBuilder = apji.a.createBuilder();
        if (z && z2) {
            createBuilder.copyOnWrite();
            apji apjiVar = (apji) createBuilder.instance;
            apjiVar.c = 4;
            apjiVar.b |= 1;
        } else if (z2) {
            createBuilder.copyOnWrite();
            apji apjiVar2 = (apji) createBuilder.instance;
            apjiVar2.c = 2;
            apjiVar2.b |= 1;
        } else if (z) {
            createBuilder.copyOnWrite();
            apji apjiVar3 = (apji) createBuilder.instance;
            apjiVar3.c = 3;
            apjiVar3.b |= 1;
        } else if (z3) {
            createBuilder.copyOnWrite();
            apji apjiVar4 = (apji) createBuilder.instance;
            apjiVar4.c = 6;
            apjiVar4.b |= 1;
        } else {
            createBuilder.copyOnWrite();
            apji apjiVar5 = (apji) createBuilder.instance;
            apjiVar5.c = 1;
            apjiVar5.b |= 1;
        }
        if (true == z2) {
            i2 = i3;
        }
        if (i2 > 0 || z) {
            int i4 = ((i2 + i) - 1) % i;
            if (z2) {
                i4 = orvVar.f.d(i4);
            }
            apzg c = c((String) list.get(i4), str, i4, encodeToString, false);
            createBuilder.copyOnWrite();
            apji apjiVar6 = (apji) createBuilder.instance;
            c.getClass();
            apjiVar6.h = c;
            apjiVar6.b |= 32;
        }
        if (i2 < i - 1 || z) {
            int i5 = (i2 + 1) % i;
            if (z2) {
                i5 = orvVar.f.d(i5);
            }
            apzg c2 = c((String) list.get(i5), str, i5, encodeToString, false);
            createBuilder.copyOnWrite();
            apji apjiVar7 = (apji) createBuilder.instance;
            c2.getClass();
            apjiVar7.f = c2;
            apjiVar7.b |= 8;
            createBuilder.copyOnWrite();
            apji apjiVar8 = (apji) createBuilder.instance;
            c2.getClass();
            apjiVar8.d = c2;
            apjiVar8.b |= 2;
        }
        if (z3) {
            apzg c3 = c((String) list.get(i2), str, i2, encodeToString, true);
            createBuilder.copyOnWrite();
            apji apjiVar9 = (apji) createBuilder.instance;
            c3.getClass();
            apjiVar9.d = c3;
            apjiVar9.b |= 2;
        }
        return (apji) createBuilder.mo39build();
    }

    private static apzg c(String str, String str2, int i, String str3, boolean z) {
        aopa createBuilder = attf.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            attf attfVar = (attf) createBuilder.instance;
            str.getClass();
            attfVar.b |= 1;
            attfVar.c = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            attf attfVar2 = (attf) createBuilder.instance;
            str2.getClass();
            attfVar2.b |= 2;
            attfVar2.d = str2;
        }
        if (i >= 0) {
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
        createBuilder.copyOnWrite();
        attf attfVar5 = (attf) createBuilder.instance;
        attfVar5.b |= 32;
        attfVar5.h = z;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(attg.a, (attf) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a6, code lost:
        if (r15 != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.apjj a(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsm.a(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, java.util.List):apjj");
    }
}
