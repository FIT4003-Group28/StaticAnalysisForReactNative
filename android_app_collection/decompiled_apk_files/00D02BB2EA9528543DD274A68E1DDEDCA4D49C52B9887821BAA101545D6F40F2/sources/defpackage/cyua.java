package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cyua  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyua {
    public final ClientConfigInternal h;
    protected final czct i;
    protected final cyph j;

    /* JADX INFO: Access modifiers changed from: protected */
    public cyua(ClientConfigInternal clientConfigInternal, czct czctVar, cyph cyphVar) {
        this.h = clientConfigInternal;
        this.i = czctVar;
        this.j = cyphVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Iterable<cywi> d(Iterable<cywi> iterable) {
        return dcft.i(iterable, cytu.a);
    }

    public static void e(cyvs cyvsVar) {
        if (cyvsVar.g().size() > 1) {
            HashMap hashMap = new HashMap();
            dcdc<cyvi> a = cyvsVar.a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                cyvi cyviVar = a.get(i);
                hashMap.put(cyviVar.k(), Double.valueOf(cyviVar.b().i));
            }
            cyvsVar.f(dcdc.f((InAppNotificationTarget) new cytz(hashMap).j(cyvsVar.g())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double f(InAppNotificationTarget inAppNotificationTarget, Map<CharSequence, Double> map) {
        Double valueOf = Double.valueOf((double) dcyn.a);
        dcdc<ContactMethodField> d = inAppNotificationTarget.d();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            Double d2 = map.get(d.get(i).k());
            if (d2 != null && d2.compareTo(valueOf) > 0) {
                valueOf = d2;
            }
        }
        return valueOf.doubleValue();
    }

    public abstract void a(cytq cytqVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public dcdc<InAppNotificationTarget> b(cyvi cyviVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
        if (r8.w == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0143, code lost:
        r7.remove();
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: Exception -> 0x01f8, CancellationException -> 0x0211, TryCatch #2 {CancellationException -> 0x0211, Exception -> 0x01f8, blocks: (B:8:0x0013, B:9:0x001c, B:11:0x0022, B:13:0x002e, B:15:0x0044, B:17:0x0050, B:18:0x0053, B:19:0x0056, B:20:0x005e, B:21:0x0063, B:22:0x0064, B:24:0x006a, B:27:0x006f, B:29:0x0078, B:30:0x0088, B:32:0x008e, B:34:0x0094, B:36:0x00a1, B:70:0x0143, B:71:0x0148, B:39:0x00ad, B:41:0x00b6, B:44:0x00c6, B:46:0x00e5, B:50:0x00f9, B:52:0x0102, B:54:0x0108, B:63:0x011d, B:65:0x0121, B:68:0x012a, B:58:0x0111, B:60:0x0117, B:47:0x00ea, B:49:0x00f0, B:72:0x014d, B:73:0x0152, B:74:0x0153, B:76:0x015b, B:77:0x0161, B:79:0x0167, B:81:0x0173, B:82:0x0177, B:83:0x017c, B:84:0x017d, B:85:0x0191, B:87:0x0197, B:89:0x019d, B:90:0x01a7, B:91:0x01ac, B:93:0x01af, B:95:0x01b7, B:97:0x01ca, B:98:0x01e7, B:100:0x01ed, B:101:0x01f3, B:28:0x0074), top: B:108:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b A[Catch: Exception -> 0x01f8, CancellationException -> 0x0211, TryCatch #2 {CancellationException -> 0x0211, Exception -> 0x01f8, blocks: (B:8:0x0013, B:9:0x001c, B:11:0x0022, B:13:0x002e, B:15:0x0044, B:17:0x0050, B:18:0x0053, B:19:0x0056, B:20:0x005e, B:21:0x0063, B:22:0x0064, B:24:0x006a, B:27:0x006f, B:29:0x0078, B:30:0x0088, B:32:0x008e, B:34:0x0094, B:36:0x00a1, B:70:0x0143, B:71:0x0148, B:39:0x00ad, B:41:0x00b6, B:44:0x00c6, B:46:0x00e5, B:50:0x00f9, B:52:0x0102, B:54:0x0108, B:63:0x011d, B:65:0x0121, B:68:0x012a, B:58:0x0111, B:60:0x0117, B:47:0x00ea, B:49:0x00f0, B:72:0x014d, B:73:0x0152, B:74:0x0153, B:76:0x015b, B:77:0x0161, B:79:0x0167, B:81:0x0173, B:82:0x0177, B:83:0x017c, B:84:0x017d, B:85:0x0191, B:87:0x0197, B:89:0x019d, B:90:0x01a7, B:91:0x01ac, B:93:0x01af, B:95:0x01b7, B:97:0x01ca, B:98:0x01e7, B:100:0x01ed, B:101:0x01f3, B:28:0x0074), top: B:108:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b7 A[Catch: Exception -> 0x01f8, CancellationException -> 0x0211, TryCatch #2 {CancellationException -> 0x0211, Exception -> 0x01f8, blocks: (B:8:0x0013, B:9:0x001c, B:11:0x0022, B:13:0x002e, B:15:0x0044, B:17:0x0050, B:18:0x0053, B:19:0x0056, B:20:0x005e, B:21:0x0063, B:22:0x0064, B:24:0x006a, B:27:0x006f, B:29:0x0078, B:30:0x0088, B:32:0x008e, B:34:0x0094, B:36:0x00a1, B:70:0x0143, B:71:0x0148, B:39:0x00ad, B:41:0x00b6, B:44:0x00c6, B:46:0x00e5, B:50:0x00f9, B:52:0x0102, B:54:0x0108, B:63:0x011d, B:65:0x0121, B:68:0x012a, B:58:0x0111, B:60:0x0117, B:47:0x00ea, B:49:0x00f0, B:72:0x014d, B:73:0x0152, B:74:0x0153, B:76:0x015b, B:77:0x0161, B:79:0x0167, B:81:0x0173, B:82:0x0177, B:83:0x017c, B:84:0x017d, B:85:0x0191, B:87:0x0197, B:89:0x019d, B:90:0x01a7, B:91:0x01ac, B:93:0x01af, B:95:0x01b7, B:97:0x01ca, B:98:0x01e7, B:100:0x01ed, B:101:0x01f3, B:28:0x0074), top: B:108:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dcdc<defpackage.cyvs> c(java.util.LinkedList<defpackage.cyvs> r16, defpackage.cytq r17, defpackage.cywa r18, boolean r19, boolean r20, defpackage.cyer r21) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyua.c(java.util.LinkedList, cytq, cywa, boolean, boolean, cyer):dcdc");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final dcdc<cyvs> g(List<cywi> list, cytq cytqVar, cywa cywaVar, boolean z, boolean z2, cyer cyerVar) {
        LinkedList<cyvs> linkedList = new LinkedList<>();
        if (!z2 || cywaVar.a() == cygp.COALESCED) {
            for (cywi cywiVar : list) {
                linkedList.add(cywiVar.u(false));
            }
        } else {
            for (cywi cywiVar2 : d(list)) {
                linkedList.add(cywiVar2.u(true));
            }
        }
        return c(linkedList, cytqVar, cywaVar, z, false, cyerVar);
    }
}
