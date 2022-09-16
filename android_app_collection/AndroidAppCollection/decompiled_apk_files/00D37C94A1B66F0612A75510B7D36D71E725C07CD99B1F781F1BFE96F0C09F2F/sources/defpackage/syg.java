package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: syg  reason: default package */
/* loaded from: classes4.dex */
public final class syg implements tcu {
    public final azqb a;
    private final amuk b;
    private final amvn c;
    private final tcw d;
    private final syi e;
    private final boolean f;
    private final boolean g;
    private final ayor h;
    private final azqb i;
    private final ampq j;

    public syg(Map map, Set set, tcw tcwVar, teb tebVar, syi syiVar, azqb azqbVar, azqb azqbVar2, ampq ampqVar, ampq ampqVar2, ampq ampqVar3, ayor ayorVar, azqb azqbVar3) {
        amuk g;
        amtf<tct> b = amtf.b(((amup) map).values(), set);
        HashSet hashSet = new HashSet();
        amvl i = amvn.i();
        for (tct tctVar : b) {
            aooq a = tctVar.a();
            if (!hashSet.add(a)) {
                i.c(a);
                int a2 = a.a();
                StringBuilder sb = new StringBuilder(57);
                sb.append("Multiple command handlers found for extension ");
                sb.append(a2);
                tebVar.b(27, sb.toString());
            }
        }
        amvn g2 = i.g();
        this.c = g2;
        if (g2.isEmpty()) {
            amuf f = amuk.f();
            f.j(b);
            e(f, azqbVar3);
            g = f.g();
        } else {
            amuf f2 = amuk.f();
            for (tct tctVar2 : b) {
                if (!g2.contains(tctVar2.a())) {
                    f2.h(tctVar2);
                }
            }
            e(f2, azqbVar3);
            g = f2.g();
        }
        this.b = g;
        this.d = tcwVar;
        this.e = syiVar;
        this.f = ((Boolean) ampqVar.e(false)).booleanValue();
        this.a = azqbVar2;
        this.i = azqbVar;
        this.g = ((Boolean) ampqVar2.e(false)).booleanValue();
        this.j = ampqVar3;
        this.h = ayorVar;
    }

    public static aynr a(tct tctVar, awmt awmtVar, tcs tcsVar) {
        return tctVar.b(awmtVar.qm(tctVar.a()), tcsVar);
    }

    private static void e(amuf amufVar, azqb azqbVar) {
        amuk g = amufVar.g();
        int i = ((amxx) g).c;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            if (((tct) g.get(i2)).a().a() == 342268478) {
                return;
            }
            i2 = i3;
        }
        amufVar.h((tct) azqbVar.get());
    }

    @Override // defpackage.tcu
    public final /* synthetic */ aynr b(awmt awmtVar, tcs tcsVar) {
        return d(awmtVar, tcsVar, 2);
    }

    public final void c(awrg awrgVar, tcy tcyVar, Throwable th) {
        if (tcyVar != null) {
            tcyVar.a(th != null);
        }
        if (awrgVar != null) {
            awra a = awrb.a();
            a.copyOnWrite();
            ((awrb) a.instance).d(awrgVar);
            awro a2 = awrp.a();
            aorw e = tbs.e();
            a2.copyOnWrite();
            ((awrp) a2.instance).p(e);
            a2.copyOnWrite();
            ((awrp) a2.instance).j((awrb) a.mo39build());
            ((DebuggerClient) this.a.get()).sendTimelineEvent(((awrp) a2.mo39build()).toByteArray());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    @Override // defpackage.tcu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aynr d(final defpackage.awmt r15, defpackage.tcs r16, int r17) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.syg.d(awmt, tcs, int):aynr");
    }
}
