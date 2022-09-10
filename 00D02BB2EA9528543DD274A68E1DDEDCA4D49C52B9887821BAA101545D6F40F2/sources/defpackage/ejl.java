package defpackage;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.SystemClock;
import java.io.File;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ejl  reason: default package */
/* loaded from: classes.dex */
public abstract class ejl extends Application implements czhe, btst, dxiw, bbi, bnov {
    public eje a;
    public byte[] b;
    @dzsi
    private eix d;
    private Map<Class<?>, dzsj<Object>> f;
    private afff h;
    private final dbty<czhd> c = dbud.a(new ejj(this));
    private final cjwy e = new cjwy();
    private final Handler g = new Handler();

    static {
        cxbe cxbeVar = cxbe.a;
        if (cxbeVar.c == 0) {
            cxbeVar.c = SystemClock.elapsedRealtime();
            cxbeVar.i.a = true;
        }
        dspd.b.u();
    }

    public ejl() {
        String property = System.getProperty("java.vm.version");
        if (property == null || !property.startsWith("1") || 1.048576E7f / ((float) Runtime.getRuntime().maxMemory()) >= 0.15d) {
            return;
        }
        byte[] bArr = new byte[10485760];
        this.b = bArr;
        bArr[6] = 1;
    }

    private final void m() {
        cjwy cjwyVar = this.e;
        if (cjwyVar != null) {
            cjwyVar.a();
        }
    }

    private final void n() {
        final cjwy cjwyVar = this.e;
        if (cjwyVar != null) {
            Handler handler = this.g;
            cjwyVar.getClass();
            handler.post(new Runnable(cjwyVar) { // from class: eji
                private final cjwy a;

                {
                    this.a = cjwyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
    }

    @Override // defpackage.dxiw
    public final dxis<Object> NK() {
        eje ejeVar = this.a;
        dbsk.s(ejeVar);
        return ejeVar.b();
    }

    @Override // defpackage.bbi
    public final bbj a() {
        dbsk.s(this.a);
        fyu fyuVar = (fyu) this.a;
        dzsj dzsjVar = fyuVar.by;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 342);
            fyuVar.by = dzsjVar;
        }
        return (bbj) dzsjVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0407 A[Catch: all -> 0x057a, TryCatch #15 {all -> 0x057a, blocks: (B:107:0x03e9, B:113:0x0407, B:114:0x040a, B:116:0x040f, B:118:0x042e, B:121:0x045b, B:123:0x0465, B:126:0x046b, B:128:0x04ae, B:130:0x04b5, B:131:0x04be, B:133:0x04ce, B:135:0x04ef, B:134:0x04db, B:137:0x04fa, B:138:0x0528, B:136:0x04f3, B:139:0x0529, B:141:0x052c, B:110:0x03ee, B:167:0x0578, B:155:0x0550, B:159:0x056a, B:160:0x056d, B:161:0x0570, B:157:0x0554, B:163:0x0573, B:40:0x0103), top: B:186:0x0103, inners: #5, #6, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040f A[Catch: all -> 0x057a, TryCatch #15 {all -> 0x057a, blocks: (B:107:0x03e9, B:113:0x0407, B:114:0x040a, B:116:0x040f, B:118:0x042e, B:121:0x045b, B:123:0x0465, B:126:0x046b, B:128:0x04ae, B:130:0x04b5, B:131:0x04be, B:133:0x04ce, B:135:0x04ef, B:134:0x04db, B:137:0x04fa, B:138:0x0528, B:136:0x04f3, B:139:0x0529, B:141:0x052c, B:110:0x03ee, B:167:0x0578, B:155:0x0550, B:159:0x056a, B:160:0x056d, B:161:0x0570, B:157:0x0554, B:163:0x0573, B:40:0x0103), top: B:186:0x0103, inners: #5, #6, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x052c A[Catch: all -> 0x057a, TRY_LEAVE, TryCatch #15 {all -> 0x057a, blocks: (B:107:0x03e9, B:113:0x0407, B:114:0x040a, B:116:0x040f, B:118:0x042e, B:121:0x045b, B:123:0x0465, B:126:0x046b, B:128:0x04ae, B:130:0x04b5, B:131:0x04be, B:133:0x04ce, B:135:0x04ef, B:134:0x04db, B:137:0x04fa, B:138:0x0528, B:136:0x04f3, B:139:0x0529, B:141:0x052c, B:110:0x03ee, B:167:0x0578, B:155:0x0550, B:159:0x056a, B:160:0x056d, B:161:0x0570, B:157:0x0554, B:163:0x0573, B:40:0x0103), top: B:186:0x0103, inners: #5, #6, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x056a A[Catch: all -> 0x057a, TryCatch #15 {all -> 0x057a, blocks: (B:107:0x03e9, B:113:0x0407, B:114:0x040a, B:116:0x040f, B:118:0x042e, B:121:0x045b, B:123:0x0465, B:126:0x046b, B:128:0x04ae, B:130:0x04b5, B:131:0x04be, B:133:0x04ce, B:135:0x04ef, B:134:0x04db, B:137:0x04fa, B:138:0x0528, B:136:0x04f3, B:139:0x0529, B:141:0x052c, B:110:0x03ee, B:167:0x0578, B:155:0x0550, B:159:0x056a, B:160:0x056d, B:161:0x0570, B:157:0x0554, B:163:0x0573, B:40:0x0103), top: B:186:0x0103, inners: #5, #6, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0550 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Set<java.lang.String>] */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void attachBaseContext(android.content.Context r29) {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejl.attachBaseContext(android.content.Context):void");
    }

    protected abstract void b();

    @Override // defpackage.bnov
    public final File c() {
        return new File(new File(getBaseContext().getFilesDir().getParentFile(), "no_backup"), "recovery_markers");
    }

    @Override // defpackage.czhe
    public final czhd d() {
        return this.c.a();
    }

    @Override // defpackage.btst
    public final <T extends btsz> T e(Class<T> cls) {
        Map<Class<?>, dzsj<Object>> map = this.f;
        if (map == null || !map.containsKey(cls)) {
            eje ejeVar = this.a;
            dbsk.s(ejeVar);
            return cls.cast(ejeVar);
        }
        return cls.cast(this.f.get(cls).a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final eje f() {
        eje ejeVar = this.a;
        if (ejeVar != null) {
            return ejeVar;
        }
        throw new NullPointerException("ApplicationComponent is not yet available. Wait for it to be saved to a field.");
    }

    @Override // defpackage.btst
    public final <T extends btsy> T g(Class<T> cls, rb rbVar) {
        if (rbVar instanceof gga) {
            eje ejeVar = this.a;
            dbsk.s(ejeVar);
            elb elbVar = new elb((fyu) ejeVar);
            elbVar.a = rbVar;
            dxjg.a(elbVar.a, rb.class);
            ftt fttVar = new ftt(elbVar.b, elbVar.a);
            boolean isInstance = cls.isInstance(fttVar);
            String simpleName = cls.getSimpleName();
            StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 76);
            sb.append("Activity component doesn't implement ");
            sb.append(simpleName);
            sb.append(". Did you add a dep to gmm/base/inject?");
            dbsk.b(isInstance, sb.toString());
            T cast = cls.cast(fttVar);
            n();
            return cast;
        }
        eje ejeVar2 = this.a;
        dbsk.s(ejeVar2);
        fxo fxoVar = new fxo((fyu) ejeVar2);
        fxoVar.a = rbVar;
        dxjg.a(fxoVar.a, rb.class);
        T cast2 = cls.cast(new fxp(fxoVar.b, fxoVar.a));
        n();
        return cast2;
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        Context baseContext = super.getBaseContext();
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return baseContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalCacheDirs() {
        try {
            return super.getExternalCacheDirs();
        } catch (Exception e) {
            bvoo.j(e);
            return new File[0];
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalFilesDirs(@dzsi String str) {
        try {
            return super.getExternalFilesDirs(str);
        } catch (Exception e) {
            bvoo.j(e);
            return new File[0];
        }
    }

    @Override // defpackage.btst
    public final <T extends bttb> T h(Class<T> cls, Service service) {
        eje ejeVar = this.a;
        dbsk.s(ejeVar);
        fxj fxjVar = new fxj((fyu) ejeVar);
        fxjVar.a = service;
        dxjg.a(fxjVar.a, Service.class);
        fxl fxlVar = new fxl(fxjVar.b, fxjVar.a);
        dbsk.g(cls.isInstance(fxlVar), "Service component doesn't implement %s. Did you add a dep to gmm/base/inject?", cls.getSimpleName());
        T cast = cls.cast(fxlVar);
        n();
        return cast;
    }

    @Override // defpackage.btst
    public final <T extends btta> T i(Class<T> cls, fd fdVar, btsy btsyVar) {
        eva EX = ((gif) btsyVar).EX();
        EX.a = fdVar;
        dxjg.a(EX.a, fd.class);
        evc evcVar = new evc(EX.b, EX.a);
        boolean isInstance = cls.isInstance(evcVar);
        String simpleName = cls.getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 76);
        sb.append("Fragment component doesn't implement ");
        sb.append(simpleName);
        sb.append(". Did you add a dep to gmm/base/inject?");
        dbsk.b(isInstance, sb.toString());
        T cast = cls.cast(evcVar);
        n();
        return cast;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            r9 = this;
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getAppTasks()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L88
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L18
            goto L88
        L18:
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L88
            java.lang.Object r3 = r0.next()
            android.app.ActivityManager$AppTask r3 = (android.app.ActivityManager.AppTask) r3
            r4 = 0
            android.app.ActivityManager$RecentTaskInfo r5 = r3.getTaskInfo()     // Catch: java.lang.RuntimeException -> L37
            if (r5 != 0) goto L30
            goto L37
        L30:
            android.app.ActivityManager$RecentTaskInfo r5 = r3.getTaskInfo()     // Catch: java.lang.RuntimeException -> L37
            android.content.Intent r5 = r5.baseIntent     // Catch: java.lang.RuntimeException -> L37
            goto L38
        L37:
            r5 = r4
        L38:
            if (r5 != 0) goto L3c
            r5 = r4
            goto L40
        L3c:
            android.content.ComponentName r5 = r5.getComponent()
        L40:
            java.lang.String r6 = ""
            if (r5 != 0) goto L46
            r5 = r6
            goto L4a
        L46:
            java.lang.String r5 = r5.getShortClassName()
        L4a:
            java.lang.String r7 = "Activity"
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.toLowerCase(r8)
            java.lang.String r8 = defpackage.dbqa.a(r7)
            boolean r5 = r5.endsWith(r8)
            if (r5 == 0) goto L5f
            goto L89
        L5f:
            android.app.ActivityManager$RecentTaskInfo r5 = r3.getTaskInfo()     // Catch: java.lang.RuntimeException -> L6d
            if (r5 != 0) goto L66
            goto L6e
        L66:
            android.app.ActivityManager$RecentTaskInfo r3 = r3.getTaskInfo()     // Catch: java.lang.RuntimeException -> L6d
            android.content.ComponentName r4 = r3.origActivity     // Catch: java.lang.RuntimeException -> L6d
            goto L6e
        L6d:
        L6e:
            if (r4 != 0) goto L71
            goto L75
        L71:
            java.lang.String r6 = r4.getShortClassName()
        L75:
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r6.toLowerCase(r3)
            java.lang.String r4 = defpackage.dbqa.a(r7)
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L1c
            goto L89
        L88:
            r1 = 0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejl.k():boolean");
    }

    protected abstract ejk l(cjwt cjwtVar, bvjj bvjjVar);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r6 < 0) goto L24;
     */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.app.Application, btst] */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejl.onCreate():void");
    }

    @Override // android.app.Application
    public final void onTerminate() {
        eix eixVar = this.d;
        if (eixVar != null) {
            ambz ambzVar = eixVar.b.to();
            for (akry akryVar : akry.values()) {
                ambzVar.g(akrw.a(akryVar));
            }
            for (akrw akrwVar : ambzVar.a.keySet()) {
                akry akryVar2 = akrwVar.b;
                if (akryVar2 == null || !dbsd.a(akrwVar, akrw.a(akryVar2))) {
                    ambzVar.g(akrwVar);
                }
            }
            ambzVar.a.clear();
            eixVar.b.tn().j();
            eixVar.b.sB().a();
            ((fyu) eixVar.b).ea().i();
            eixVar.b.qk().a();
        }
        super.onTerminate();
    }
}
