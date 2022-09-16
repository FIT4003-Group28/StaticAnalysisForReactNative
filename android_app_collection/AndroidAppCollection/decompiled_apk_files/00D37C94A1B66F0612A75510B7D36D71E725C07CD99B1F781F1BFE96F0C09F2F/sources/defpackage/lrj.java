package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lrj */
/* loaded from: classes3.dex */
public final class lrj extends ajwd implements ynl {
    public final Context a;
    public final Executor b;
    public final yni c;
    public final aldn d;
    public final aldl e;
    public final ajrj f;
    public final ajsm g;
    public final ajsm h;
    public final Map i;
    public final Map j;
    public final Map k;
    public final akze l;
    public boolean m;
    private final afvn n;
    private final ajsm o;
    private final Executor p;
    private final aadd q;
    private final List r;
    private final akys s;
    private final lrd t;
    private final ankt u;
    private final alaz v;
    private final alax w;
    private final arag x;
    private final arag y;
    private final boolean z;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lrj(android.content.Context r3, java.util.concurrent.Executor r4, defpackage.yni r5, defpackage.afvn r6, defpackage.aldn r7, defpackage.aldl r8, defpackage.alaz r9, java.util.concurrent.Executor r10, defpackage.aadd r11, defpackage.akys r12, defpackage.akze r13, defpackage.atvg r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrj.<init>(android.content.Context, java.util.concurrent.Executor, yni, afvn, aldn, aldl, alaz, java.util.concurrent.Executor, aadd, akys, akze, atvg):void");
    }

    public static /* synthetic */ void h(Throwable th) {
        zep.d("Error occurred getting resumable uploads", th);
    }

    public static final void k(Map map, ggp ggpVar) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == ggpVar) {
                map.remove(entry.getKey());
                return;
            }
        }
    }

    public static final int l(alcz alczVar) {
        alcz alczVar2 = alcz.PRIVATE;
        int ordinal = alczVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 2;
            }
            if (ordinal == 2) {
                return 3;
            }
            int i = alczVar.d;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unhandled Privacy enum: ");
            sb.append(i);
            throw new AssertionError(sb.toString());
        }
        return 1;
    }

    public final ggp b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            ggp ggpVar = (ggp) this.i.get(str);
            return ggpVar != null ? ggpVar : (ggp) this.j.get(str);
        } else if (!TextUtils.isEmpty(str2)) {
            return (ggp) this.k.get(str2);
        } else {
            return null;
        }
    }

    public final void c() {
        for (ankt anktVar : this.r) {
            if (anktVar != null && !anktVar.isDone()) {
                anktVar.cancel(true);
            }
        }
        this.r.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x02d1, code lost:
        if (defpackage.alht.j(r1, defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_MAX_STORAGE_USAGE_TIME_EXCEEDED) != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(final defpackage.alcw r19) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrj.d(alcw):void");
    }

    public final void i(ggp ggpVar) {
        if (this.h.contains(ggpVar)) {
            this.h.o(ggpVar, ggpVar);
            return;
        }
        int size = this.h.size();
        while (size > 0) {
            int i = size - 1;
            if (ggpVar.a < ((ggp) this.h.get(i)).a) {
                this.h.add(size, ggpVar);
                return;
            }
            size = i;
        }
        this.h.add(0, ggpVar);
    }

    @Override // defpackage.ajwd, defpackage.zdx
    public final void j() {
        c();
        this.v.c();
        this.v.f(this.w);
        this.m = false;
        ankt anktVar = this.u;
        if (anktVar != null && !anktVar.isDone()) {
            this.u.cancel(true);
        }
        this.s.e(this.t);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aawi aawiVar = (aawi) obj;
                if (aawiVar.b() == null) {
                    return null;
                }
                this.g.remove(aawiVar.b());
                this.h.remove(aawiVar.b());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aawi.class};
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.f;
    }
}
