package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmhl  reason: default package */
/* loaded from: classes5.dex */
public final class cmhl extends cmfy {
    private static final Pattern f = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean g;
    private final cmhm h;
    private Map<String, cmhp> i;
    private float j;
    private float k;

    public cmhl() {
        this(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(defpackage.cmnk r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmhl.n(cmnk):void");
    }

    private static long o(String str) {
        Matcher matcher = f.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = cmny.a;
        return (Long.parseLong(group) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float p(int i) {
        if (i != 0) {
            if (i == 1) {
                return 0.5f;
            }
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.05f;
    }

    private static int q(long j, List<Long> list, List<List<cmfw>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() != j) {
                if (list.get(size).longValue() < j) {
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
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:42|43|44|45|(2:46|47)|(2:(4:50|51|52|53)(1:73)|54)(2:74|(1:76)(8:77|(1:57)|58|59|(1:61)(1:68)|62|(2:64|65)(1:67)|66))|55|(0)|58|59|(0)(0)|62|(0)(0)|66|40) */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169 A[Catch: RuntimeException -> 0x017b, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x017b, blocks: (B:65:0x015d, B:67:0x0169), top: B:122:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017a  */
    @Override // defpackage.cmfy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.cmga m(byte[] r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmhl.m(byte[], int, boolean):cmga");
    }

    public cmhl(List<byte[]> list) {
        this.j = -3.4028235E38f;
        this.k = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.g = false;
            this.h = null;
            return;
        }
        this.g = true;
        String r = cmny.r(list.get(0));
        cmmn.a(r.startsWith("Format:"));
        cmhm a = cmhm.a(r);
        cmmn.f(a);
        this.h = a;
        n(new cmnk(list.get(1)));
    }
}
