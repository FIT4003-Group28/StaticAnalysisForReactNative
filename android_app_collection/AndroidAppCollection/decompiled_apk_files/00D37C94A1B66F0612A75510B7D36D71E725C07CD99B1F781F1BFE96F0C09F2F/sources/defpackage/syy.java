package defpackage;

import com.facebook.yoga.YogaAlign;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: syy  reason: default package */
/* loaded from: classes4.dex */
public final class syy implements tek {
    public static final /* synthetic */ int a = 0;
    private static final amup b;
    private final boolean c;

    static {
        amum h = amup.h();
        h.f(1, YogaAlign.AUTO);
        h.f(2, YogaAlign.FLEX_START);
        h.f(3, YogaAlign.FLEX_END);
        h.f(4, YogaAlign.CENTER);
        h.f(5, YogaAlign.STRETCH);
        h.f(6, YogaAlign.BASELINE);
        h.f(7, YogaAlign.BASELINE);
        b = h.b();
    }

    public syy(ampq ampqVar) {
        this.c = ((Boolean) ampqVar.e(true)).booleanValue();
    }

    private static void d(axne axneVar, aodt aodtVar, cyp cypVar) {
        aodt aodtVar2;
        int b2 = axneVar.b(20);
        if (b2 != 0) {
            aodtVar.f(axneVar.a(b2 + axneVar.a), axneVar.b);
            aodtVar2 = aodtVar;
        } else {
            aodtVar2 = null;
        }
        if (aodtVar2 != null) {
            tfo.j(aodtVar, new syx(cypVar, 2));
        }
    }

    @Override // defpackage.tek
    public final int a() {
        return 168772996;
    }

    @Override // defpackage.tek
    public final /* bridge */ /* synthetic */ aodt b(ByteBuffer byteBuffer) {
        return axne.aJ(byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x03a5, code lost:
        if (r9 != 4) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0373  */
    @Override // defpackage.tel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void c(defpackage.cyv r9, defpackage.tda r10, java.lang.String r11, java.lang.Object r12, defpackage.tdq r13, defpackage.tcr r14) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.syy.c(cyv, tda, java.lang.String, java.lang.Object, tdq, tcr):void");
    }

    @Override // defpackage.tel
    public final void e(tdq tdqVar) {
        tdqVar.a().H(1.0f);
    }
}
