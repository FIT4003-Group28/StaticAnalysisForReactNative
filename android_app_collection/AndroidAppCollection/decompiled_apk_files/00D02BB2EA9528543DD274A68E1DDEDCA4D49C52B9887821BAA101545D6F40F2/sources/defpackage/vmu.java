package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vmu  reason: default package */
/* loaded from: classes7.dex */
public final class vmu {
    private static final vmp a;
    private static final vms b;
    private static final vmq c;
    private static final EnumMap<dqvj, vmr[]> d;

    static {
        vmp vmpVar = new vmp();
        a = vmpVar;
        vms vmsVar = new vms();
        b = vmsVar;
        vmq vmqVar = new vmq();
        c = vmqVar;
        EnumMap<dqvj, vmr[]> k = dcjz.k(dqvj.class);
        d = k;
        k.put((EnumMap<dqvj, vmr[]>) dqvj.DRIVE, (dqvj) new vmr[]{vmqVar, vmsVar});
        k.put((EnumMap<dqvj, vmr[]>) dqvj.TWO_WHEELER, (dqvj) new vmr[]{vmsVar});
        k.put((EnumMap<dqvj, vmr[]>) dqvj.WALK, (dqvj) new vmr[]{vmpVar});
        k.put((EnumMap<dqvj, vmr[]>) dqvj.BICYCLE, (dqvj) new vmr[]{vmpVar});
        k.put((EnumMap<dqvj, vmr[]>) dqvj.TRANSIT, (dqvj) new vmr[]{new vmt()});
    }

    private vmu() {
    }

    @dzsi
    public static String getAppliedDirectionsOptionsText(vpd vpdVar, dqvj dqvjVar, Context context, dwao dwaoVar) {
        EnumMap<dqvj, vmr[]> enumMap = d;
        if (!enumMap.containsKey(dqvjVar)) {
            return null;
        }
        for (vmr vmrVar : (vmr[]) dbsk.s(enumMap.get(dqvjVar))) {
            String a2 = vmrVar.a(dwaoVar, context, vpdVar);
            if (!dbsj.d(a2)) {
                return a2;
            }
        }
        return null;
    }

    public static String getDefaultDirectionsOptionsText(Context context) {
        return context.getString(R.string.DIRECTIONS_OPTIONS_TITLE_QUANTUM);
    }

    public static String getDirectionsOptionsMenuItemText(vpd vpdVar, dqvj dqvjVar, Context context, dwao dwaoVar) {
        if (d.containsKey(dqvjVar)) {
            String appliedDirectionsOptionsText = getAppliedDirectionsOptionsText(vpdVar, dqvjVar, context, dwaoVar);
            return !dbsj.d(appliedDirectionsOptionsText) ? appliedDirectionsOptionsText : getDefaultDirectionsOptionsText(context);
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if ((r0.a & 2048) == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getTransitDateTimeOptionsMenuItemText(android.content.Context r2, long r3, defpackage.cqat r5, defpackage.dwao r6) {
        /*
            long r3 = defpackage.vxb.b(r3)
            int r0 = r6.a
            r1 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto Lc
            goto L1d
        Lc:
            r0 = r0 & 2
            if (r0 == 0) goto L22
            dwbk r0 = r6.f
            if (r0 != 0) goto L16
            dwbk r0 = defpackage.dwbk.s
        L16:
            int r0 = r0.a
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L1d
            goto L22
        L1d:
            java.lang.String r2 = getTransitDateTimeOptionsMenuItemTextFromNewFields(r2, r3, r5, r6)
            return r2
        L22:
            java.lang.String r2 = getTransitDateTimeOptionsMenuItemTextFromDeprecatedFields(r2, r3, r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmu.getTransitDateTimeOptionsMenuItemText(android.content.Context, long, cqat, dwao):java.lang.String");
    }

    @Deprecated
    private static String getTransitDateTimeOptionsMenuItemTextFromDeprecatedFields(Context context, long j, cqat cqatVar, dwao dwaoVar) {
        int i;
        int a2;
        int a3;
        dwbk dwbkVar = dwaoVar.f;
        if (dwbkVar == null) {
            dwbkVar = dwbk.s;
        }
        if ((dwbkVar.a & 4) != 0 || ((a3 = dquq.a(dwbkVar.c)) != 0 && a3 == 2)) {
            if ((dwbkVar.a & 1) != 0) {
                i = dqvd.a(dwbkVar.b);
                if (i == 0) {
                    i = 1001;
                }
            } else {
                i = 1;
            }
            if ((dwbkVar.a & 4) != 0) {
                TimeZone timeZone = TimeZone.getDefault();
                dbsk.s(dwbkVar);
                dbsk.a((dwbkVar.a & 4) != 0);
                if ((dwbkVar.a & 2) == 0 || (a2 = dquq.a(dwbkVar.c)) == 0 || a2 != 2) {
                    j = vxb.c(TimeUnit.SECONDS.toMillis(dwbkVar.d), timeZone);
                } else {
                    j = TimeUnit.SECONDS.toMillis(dwbkVar.d);
                }
            }
            int c2 = bvsk.c(cqatVar, vxb.e(j));
            int i2 = i - 1;
            if (i2 == 0) {
                return context.getString(R.string.DIRECTIONS_DEPART_AT, bvsk.a(context, vxb.e(j), c2));
            }
            if (i2 == 1) {
                return context.getString(R.string.DIRECTIONS_ARRIVE_BY, bvsk.a(context, vxb.e(j), c2));
            }
            return i2 != 2 ? "" : context.getString(R.string.DIRECTIONS_LAST_AVAILABLE_TIME);
        }
        return context.getString(R.string.DIRECTIONS_DEPART_NOW);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
        if ((r0.a & 4) != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getTransitDateTimeOptionsMenuItemTextFromNewFields(android.content.Context r4, long r5, defpackage.cqat r7, defpackage.dwao r8) {
        /*
            dwbk r0 = r8.f
            if (r0 != 0) goto L6
            dwbk r0 = defpackage.dwbk.s
        L6:
            int r0 = r0.k
            int r0 = defpackage.dqvf.a(r0)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            r1 = 6
            if (r0 != r1) goto L1a
            r5 = 2131953327(0x7f1306af, float:1.9543122E38)
            java.lang.String r4 = r4.getString(r5)
            return r4
        L1a:
            dosz r0 = r8.B
            if (r0 != 0) goto L20
            dosz r0 = defpackage.dosz.e
        L20:
            int r0 = r0.a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L33
            dosz r0 = r8.B
            if (r0 != 0) goto L2c
            dosz r0 = defpackage.dosz.e
        L2c:
            int r0 = r0.a
            r0 = r0 & 4
            if (r0 == 0) goto L33
            goto L4d
        L33:
            dosz r0 = r8.B
            if (r0 != 0) goto L39
            dosz r0 = defpackage.dosz.e
        L39:
            int r0 = r0.c
            int r0 = defpackage.dquq.a(r0)
            if (r0 != 0) goto L42
            goto L45
        L42:
            r2 = 2
            if (r0 == r2) goto L4d
        L45:
            r5 = 2131953307(0x7f13069b, float:1.9543081E38)
            java.lang.String r4 = r4.getString(r5)
            return r4
        L4d:
            dosz r0 = r8.B
            if (r0 != 0) goto L53
            dosz r0 = defpackage.dosz.e
        L53:
            int r0 = r0.b
            int r0 = defpackage.dquo.a(r0)
            if (r0 != 0) goto L5c
            r0 = 1
        L5c:
            int r2 = r8.a
            r3 = 1073741824(0x40000000, float:2.0)
            r2 = r2 & r3
            if (r2 == 0) goto L79
            dosz r2 = r8.B
            if (r2 != 0) goto L69
            dosz r2 = defpackage.dosz.e
        L69:
            int r2 = r2.a
            r2 = r2 & 4
            if (r2 == 0) goto L79
            dosz r5 = r8.B
            if (r5 != 0) goto L75
            dosz r5 = defpackage.dosz.e
        L75:
            long r5 = defpackage.vxb.a(r5)
        L79:
            java.util.Calendar r8 = defpackage.vxb.e(r5)
            int r7 = defpackage.bvsk.c(r7, r8)
            int r0 = r0 + (-1)
            r8 = 0
            if (r0 == 0) goto L9a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.util.Calendar r5 = defpackage.vxb.e(r5)
            java.lang.String r5 = defpackage.bvsk.a(r4, r5, r7)
            r0[r8] = r5
            r5 = 2131953256(0x7f130668, float:1.9542978E38)
            java.lang.String r4 = r4.getString(r5, r0)
            return r4
        L9a:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.util.Calendar r5 = defpackage.vxb.e(r5)
            java.lang.String r5 = defpackage.bvsk.a(r4, r5, r7)
            r0[r8] = r5
            r5 = 2131953305(0x7f130699, float:1.9543077E38)
            java.lang.String r4 = r4.getString(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmu.getTransitDateTimeOptionsMenuItemTextFromNewFields(android.content.Context, long, cqat, dwao):java.lang.String");
    }
}
