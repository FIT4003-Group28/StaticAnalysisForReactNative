package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
/* compiled from: PG */
/* renamed from: amia  reason: default package */
/* loaded from: classes.dex */
public class amia extends BroadcastReceiver {
    public static final amzy a = amzy.l("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver");
    private final Class b;

    /* JADX INFO: Access modifiers changed from: protected */
    public amia(Class cls) {
        this.b = cls;
    }

    public static final void b(ankt anktVar) {
        if (!anktVar.isCancelled()) {
            uwp.h(ammo.f(new amhz(anktVar, 3)));
        }
    }

    /* JADX WARN: Finally extract failed */
    private final ankt c(Context context) {
        ankt p;
        amlp l = amna.l("getEntryPoint");
        try {
            try {
                p = anlz.q(antz.u(context, this.b));
            } catch (IllegalStateException e) {
                p = anlz.p(new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e));
            }
            l.a(p);
            l.close();
            getResultCode();
            l = amna.l("handleBroadcast");
            try {
                ankt i = anii.i(p, ammo.c(new anir() { // from class: amhx
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        ankt e2 = amia.this.a(obj).a.e();
                        e2.getClass();
                        return e2;
                    }
                }), anjk.a);
                l.a(i);
                l.close();
                if (!i.isDone()) {
                    BroadcastReceiver.PendingResult goAsync = goAsync();
                    goAsync.getClass();
                    i.qY(ammo.f(new amhy(goAsync)), anjk.a);
                }
                return i;
            } finally {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public amjt a(Object obj) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
        if (r0.activityInfo.exported != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
        r3 = r9.getPackageManager();
        r5 = r10.setComponent(null).cloneFilter();
        r5.setSelector(null);
        r5.setPackage(r9.getPackageName());
        r3 = r3.queryBroadcastReceivers(r5, 64).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
        if (r3.hasNext() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
        if (r1.equals(r5.activityInfo.name) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
        r1 = r5.filter;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
        if (r1.matchAction(r10.getAction()) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
        if (r1.matchCategories(r10.getCategories()) != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
        r1 = r1.matchData(r10.getType(), r10.getScheme(), r10.getData());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
        if (r1 == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f0, code lost:
        if (r1 == (-2)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
        throw new defpackage.vfr(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
        throw new defpackage.vfr(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
        throw new defpackage.vfr(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
        r3 = r9.getPackageManager();
        r5 = defpackage.vfs.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
        if (defpackage.vfs.b != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0110, code lost:
        r6 = new android.content.Intent();
        r6.setPackage(r9.getPackageName());
        defpackage.vfs.b = r3.queryBroadcastReceivers(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
        r3 = defpackage.vfs.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0124, code lost:
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0125, code lost:
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
        if (r3.hasNext() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
        if (r1.equals(((android.content.pm.ResolveInfo) r3.next()).activityInfo.name) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
        throw new defpackage.vfr(r10);
     */
    /* JADX WARN: Type inference failed for: r10v9, types: [amln, amlv] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amia.onReceive(android.content.Context, android.content.Intent):void");
    }
}
