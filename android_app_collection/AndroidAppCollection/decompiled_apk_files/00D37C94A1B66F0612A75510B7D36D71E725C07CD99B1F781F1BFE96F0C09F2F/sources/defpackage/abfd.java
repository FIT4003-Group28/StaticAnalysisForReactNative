package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abfd  reason: default package */
/* loaded from: classes.dex */
public final class abfd extends aaqs {
    public final List a;
    public String b;
    public String c;
    public String d;
    public String s;
    public byte[] t;
    public byte[] u;
    public long v;
    public assu w;
    public CharSequence x;
    public int y;

    public abfd(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/handle_transaction", aaqfVar, afvmVar);
        this.b = "";
        this.c = "";
        this.d = "";
        this.s = "";
        this.t = aadi.a;
        this.u = aadi.a;
        this.v = -1L;
        this.w = assu.a;
        this.x = "";
        this.y = 1;
        this.a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        if ((r0.b & 2) != 0) goto L19;
     */
    @Override // defpackage.aapd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r5 = this;
            aopa r0 = r5.a()
            aopi r0 = r0.mo39build()
            ashd r0 = (defpackage.ashd) r0
            java.lang.String r1 = r0.d
            defpackage.zgh.m(r1)
            int r1 = r5.y
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L2f
            r4 = 2
            if (r1 != r4) goto L30
            avka r0 = r0.j
            if (r0 != 0) goto L1e
            avka r0 = defpackage.avka.a
        L1e:
            avjy r0 = r0.c
            if (r0 != 0) goto L24
            avjy r0 = defpackage.avjy.a
        L24:
            apox r0 = r0.c
            if (r0 != 0) goto L2a
            apox r0 = defpackage.apox.a
        L2a:
            int r0 = r0.b
            r0 = r0 & r4
            if (r0 == 0) goto L30
        L2f:
            r2 = 1
        L30:
            defpackage.aqxo.y(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abfd.c():void");
    }

    @Override // defpackage.aaqs
    /* renamed from: t */
    public final aopa a() {
        aopa createBuilder = ashd.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        ashd ashdVar = (ashd) createBuilder.instance;
        str.getClass();
        ashdVar.b |= 2;
        ashdVar.d = str;
        String str2 = this.c;
        createBuilder.copyOnWrite();
        ashd ashdVar2 = (ashd) createBuilder.instance;
        str2.getClass();
        ashdVar2.b |= 4;
        ashdVar2.e = str2;
        String str3 = this.d;
        createBuilder.copyOnWrite();
        ashd ashdVar3 = (ashd) createBuilder.instance;
        str3.getClass();
        ashdVar3.b |= 8;
        ashdVar3.f = str3;
        String str4 = this.s;
        createBuilder.copyOnWrite();
        ashd ashdVar4 = (ashd) createBuilder.instance;
        str4.getClass();
        ashdVar4.b |= 16;
        ashdVar4.g = str4;
        aoob x = aoob.x(this.t);
        createBuilder.copyOnWrite();
        ashd ashdVar5 = (ashd) createBuilder.instance;
        ashdVar5.b |= 32;
        ashdVar5.h = x;
        aoob x2 = aoob.x(this.u);
        createBuilder.copyOnWrite();
        ashd ashdVar6 = (ashd) createBuilder.instance;
        ashdVar6.b |= 64;
        ashdVar6.i = x2;
        if (!this.a.isEmpty()) {
            List list = this.a;
            createBuilder.copyOnWrite();
            ashd ashdVar7 = (ashd) createBuilder.instance;
            aopu aopuVar = ashdVar7.k;
            if (!aopuVar.c()) {
                ashdVar7.k = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list, (List) ashdVar7.k);
        }
        if (this.v != -1) {
            aopa createBuilder2 = atur.a.createBuilder();
            long j = this.v;
            createBuilder2.copyOnWrite();
            atur aturVar = (atur) createBuilder2.instance;
            aturVar.b |= 1;
            aturVar.e = j;
            aopa createBuilder3 = apox.a.createBuilder();
            long j2 = this.v;
            createBuilder3.copyOnWrite();
            apox apoxVar = (apox) createBuilder3.instance;
            apoxVar.b |= 2;
            apoxVar.f = j2;
            if (this.w.c.size() > 0) {
                assu assuVar = this.w;
                createBuilder2.copyOnWrite();
                atur aturVar2 = (atur) createBuilder2.instance;
                assuVar.getClass();
                aturVar2.d = assuVar;
                aturVar2.c = 3;
                assu assuVar2 = this.w;
                createBuilder3.copyOnWrite();
                apox apoxVar2 = (apox) createBuilder3.instance;
                assuVar2.getClass();
                apoxVar2.d = assuVar2;
                apoxVar2.c = 4;
            }
            if (!TextUtils.isEmpty(this.x)) {
                String charSequence = this.x.toString();
                createBuilder2.copyOnWrite();
                atur aturVar3 = (atur) createBuilder2.instance;
                charSequence.getClass();
                aturVar3.c = 2;
                aturVar3.d = charSequence;
                String charSequence2 = this.x.toString();
                createBuilder3.copyOnWrite();
                apox apoxVar3 = (apox) createBuilder3.instance;
                charSequence2.getClass();
                apoxVar3.c = 3;
                apoxVar3.d = charSequence2;
            }
            aopa createBuilder4 = avka.a.createBuilder();
            createBuilder4.copyOnWrite();
            avka avkaVar = (avka) createBuilder4.instance;
            atur aturVar4 = (atur) createBuilder2.mo39build();
            aturVar4.getClass();
            avkaVar.e = aturVar4;
            avkaVar.b |= 4;
            aopa createBuilder5 = avjy.a.createBuilder();
            createBuilder5.copyOnWrite();
            avjy avjyVar = (avjy) createBuilder5.instance;
            apox apoxVar4 = (apox) createBuilder3.mo39build();
            apoxVar4.getClass();
            avjyVar.c = apoxVar4;
            avjyVar.b |= 1;
            createBuilder4.copyOnWrite();
            avka avkaVar2 = (avka) createBuilder4.instance;
            avjy avjyVar2 = (avjy) createBuilder5.mo39build();
            avjyVar2.getClass();
            avkaVar2.c = avjyVar2;
            avkaVar2.b |= 1;
            createBuilder.copyOnWrite();
            ashd ashdVar8 = (ashd) createBuilder.instance;
            avka avkaVar3 = (avka) createBuilder4.mo39build();
            avkaVar3.getClass();
            ashdVar8.j = avkaVar3;
            ashdVar8.b |= 256;
        }
        return createBuilder;
    }
}
