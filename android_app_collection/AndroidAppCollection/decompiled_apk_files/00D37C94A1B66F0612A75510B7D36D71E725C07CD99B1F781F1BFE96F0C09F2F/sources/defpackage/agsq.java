package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agsq  reason: default package */
/* loaded from: classes.dex */
public final class agsq implements ague {
    private final agsm a;
    private final zfq b;
    private final int c;
    private final axwu d;

    public agsq(agsm agsmVar, zfq zfqVar, int i, axwu axwuVar) {
        this.a = agsmVar;
        this.b = zfqVar;
        this.c = i;
        this.d = axwuVar;
    }

    private static apji b(String str, List list, int i, int i2, orv orvVar) {
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
            i = i2;
        }
        int size = list.size();
        if (i > 0 || z) {
            int i3 = ((i + size) - 1) % size;
            if (z2) {
                i3 = orvVar.f.d(i3);
            }
            apzg c = c(((agqo) list.get(i3)).f(), str, i3, encodeToString, false);
            createBuilder.copyOnWrite();
            apji apjiVar6 = (apji) createBuilder.instance;
            c.getClass();
            apjiVar6.h = c;
            apjiVar6.b |= 32;
        }
        if (i < size - 1 || z) {
            int i4 = (i + 1) % size;
            if (z2) {
                i4 = orvVar.f.d(i4);
            }
            apzg c2 = c(((agqo) list.get(i4)).f(), str, i4, encodeToString, false);
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
            apzg c3 = c(((agqo) list.get(i)).f(), str, i, encodeToString, true);
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

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0089, code lost:
        if (r0 != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List d(java.lang.String r9, java.util.List r10, int r11, int r12, int r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsq.d(java.lang.String, java.util.List, int, int, int, java.util.List):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [zfq] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18, types: [aopq, java.util.List] */
    @Override // defpackage.ague
    public final synchronized apjj a(PlaybackStartDescriptor playbackStartDescriptor, agsp agspVar) {
        Boolean bool;
        List d;
        ?? arrayList;
        List d2 = agspVar.d();
        aqxe aqxeVar = this.d.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        int i = 0;
        if (aqxeVar.a(45352939L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352939L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352939L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            return this.a.a(playbackStartDescriptor, (List) Collection.EL.stream(d2).map(adgi.o).collect(Collectors.toList()));
        }
        String k = playbackStartDescriptor.k();
        int size = d2.size();
        int max = Math.max(playbackStartDescriptor.a(), 0);
        String i2 = playbackStartDescriptor.i();
        apzg apzgVar = playbackStartDescriptor.b;
        if (apzgVar == null || !apzgVar.qn(attg.a)) {
            i2 = null;
        }
        aopa createBuilder = orv.a.createBuilder();
        if (!TextUtils.isEmpty(i2)) {
            try {
                byte[] decode = Base64.decode(i2, 0);
                if (decode != null) {
                    createBuilder.mo38mergeFrom(decode, aoos.b());
                }
            } catch (aopx | IllegalArgumentException unused) {
            }
        }
        orv orvVar = (orv) createBuilder.mo39build();
        if (size > 1 && (this.c & 2) != 0) {
            if (orvVar.e && orvVar.f.size() != 0 && orvVar.f.size() == d2.size()) {
                arrayList = orvVar.f;
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    if (((Integer) arrayList.get(i3)).intValue() == max) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
            } else {
                arrayList = new ArrayList();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(Integer.valueOf(i4));
                }
                arrayList.set(0, Integer.valueOf(max));
                arrayList.set(max, 0);
                this.b.c(arrayList, size);
            }
            d = d(k, d2, max, i, this.c, arrayList);
        } else {
            int i5 = this.c & (-3);
            if (size <= 1 && TextUtils.isEmpty(k)) {
                i5 &= -2;
            }
            d = d(k, d2, max, max, i5, new ArrayList());
        }
        aopc aopcVar = (aopc) apjj.a.createBuilder();
        aopcVar.cg(d);
        aopcVar.cf(d);
        return (apjj) aopcVar.mo39build();
    }
}
