package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ptp  reason: default package */
/* loaded from: classes4.dex */
public final class ptp extends psi {
    private static final Pattern a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean b;
    private final ptq c;
    private Map d;
    private float e;
    private float f;

    public ptp() {
        this(null);
    }

    private static float s(int i) {
        if (i != 0) {
            if (i == 1) {
                return 0.5f;
            }
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.05f;
    }

    private static int t(long j, List list, List list2) {
        int i;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            } else if (((Long) list.get(size)).longValue() != j) {
                if (((Long) list.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
            } else {
                return size;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    private static long u(String str) {
        Matcher matcher = a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = pxi.a;
        return (Long.parseLong(group) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024f A[Catch: RuntimeException -> 0x02dc, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:100:0x01a9, B:102:0x01b7, B:104:0x01c6, B:106:0x01ca, B:107:0x01d0, B:109:0x01da, B:115:0x01f3, B:117:0x0200, B:121:0x024b, B:123:0x024f, B:124:0x0255, B:130:0x0282, B:132:0x0286, B:136:0x0297, B:138:0x029b, B:142:0x02ac, B:144:0x02b0, B:148:0x02c1, B:150:0x02c5, B:154:0x02d6, B:128:0x025e, B:110:0x01e3, B:119:0x0228), top: B:169:0x01a9, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0286 A[Catch: RuntimeException -> 0x02dc, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:100:0x01a9, B:102:0x01b7, B:104:0x01c6, B:106:0x01ca, B:107:0x01d0, B:109:0x01da, B:115:0x01f3, B:117:0x0200, B:121:0x024b, B:123:0x024f, B:124:0x0255, B:130:0x0282, B:132:0x0286, B:136:0x0297, B:138:0x029b, B:142:0x02ac, B:144:0x02b0, B:148:0x02c1, B:150:0x02c5, B:154:0x02d6, B:128:0x025e, B:110:0x01e3, B:119:0x0228), top: B:169:0x01a9, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029b A[Catch: RuntimeException -> 0x02dc, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:100:0x01a9, B:102:0x01b7, B:104:0x01c6, B:106:0x01ca, B:107:0x01d0, B:109:0x01da, B:115:0x01f3, B:117:0x0200, B:121:0x024b, B:123:0x024f, B:124:0x0255, B:130:0x0282, B:132:0x0286, B:136:0x0297, B:138:0x029b, B:142:0x02ac, B:144:0x02b0, B:148:0x02c1, B:150:0x02c5, B:154:0x02d6, B:128:0x025e, B:110:0x01e3, B:119:0x0228), top: B:169:0x01a9, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b0 A[Catch: RuntimeException -> 0x02dc, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:100:0x01a9, B:102:0x01b7, B:104:0x01c6, B:106:0x01ca, B:107:0x01d0, B:109:0x01da, B:115:0x01f3, B:117:0x0200, B:121:0x024b, B:123:0x024f, B:124:0x0255, B:130:0x0282, B:132:0x0286, B:136:0x0297, B:138:0x029b, B:142:0x02ac, B:144:0x02b0, B:148:0x02c1, B:150:0x02c5, B:154:0x02d6, B:128:0x025e, B:110:0x01e3, B:119:0x0228), top: B:169:0x01a9, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c5 A[Catch: RuntimeException -> 0x02dc, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:100:0x01a9, B:102:0x01b7, B:104:0x01c6, B:106:0x01ca, B:107:0x01d0, B:109:0x01da, B:115:0x01f3, B:117:0x0200, B:121:0x024b, B:123:0x024f, B:124:0x0255, B:130:0x0282, B:132:0x0286, B:136:0x0297, B:138:0x029b, B:142:0x02ac, B:144:0x02b0, B:148:0x02c1, B:150:0x02c5, B:154:0x02d6, B:128:0x025e, B:110:0x01e3, B:119:0x0228), top: B:169:0x01a9, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(defpackage.pwu r26) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptp.v(pwu):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:51|52|53|54|(2:55|56)|(5:(1:59)|60|61|62|63)(2:82|(1:84)(8:85|(1:66)|67|68|(1:70)(1:77)|71|(2:73|74)(1:76)|75))|64|(0)|67|68|(0)(0)|71|(0)(0)|75|49) */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172 A[Catch: RuntimeException -> 0x0184, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0184, blocks: (B:73:0x0166, B:75:0x0172), top: B:158:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    @Override // defpackage.psi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.psk g(byte[] r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptp.g(byte[], int, boolean):psk");
    }

    public ptp(List list) {
        super("SsaDecoder");
        this.e = -3.4028235E38f;
        this.f = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.b = false;
            this.c = null;
            return;
        }
        this.b = true;
        String A = pxi.A((byte[]) list.get(0));
        ptx.c(A.startsWith("Format:"));
        ptq a2 = ptq.a(A);
        ptx.a(a2);
        this.c = a2;
        v(new pwu((byte[]) list.get(1)));
    }
}
