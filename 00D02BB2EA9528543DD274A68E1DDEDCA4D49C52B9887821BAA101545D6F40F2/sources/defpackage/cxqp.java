package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxqp  reason: default package */
/* loaded from: classes5.dex */
public final class cxqp implements cxqo {
    String a;
    eayu b;
    private final Context d;
    private final cxqm f;
    private final cxnz g;
    private int h;
    private int i;
    final Map<String, Stopwatch> c = new HashMap();
    private final Map<cxof, Set<Integer>> e = new HashMap();

    public cxqp(cxnz cxnzVar, Context context, cxqm cxqmVar) {
        this.g = cxnzVar;
        this.d = context;
        this.f = cxqmVar;
    }

    private final void j(cxnv cxnvVar) {
        if (!TextUtils.isEmpty(this.a)) {
            cxnz cxnzVar = this.g;
            SystemClock.elapsedRealtimeNanos();
            cxnvVar.a();
            new Bundle();
            for (cxob cxobVar : cxnzVar.a()) {
                cxobVar.b();
            }
            for (cxob cxobVar2 : cxnzVar.a()) {
                cxobVar2.a(cxnvVar);
            }
            SystemClock.elapsedRealtimeNanos();
        }
    }

    @Override // defpackage.cxqo
    public final Stopwatch a(String str) {
        Stopwatch stopwatch = this.c.get(str);
        if (stopwatch == null) {
            Stopwatch stopwatch2 = new Stopwatch();
            this.c.put(str, stopwatch2);
            return stopwatch2;
        }
        return stopwatch;
    }

    @Override // defpackage.cxqo
    public final void b(eaze eazeVar) {
        j(new cxqq(this.a, eazeVar, this.b));
    }

    @Override // defpackage.cxqo
    public final void c() {
        this.e.clear();
    }

    @Override // defpackage.cxqo
    public final void d(int i, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        cxnx cxnxVar = new cxnx(i, peopleKitVisualElementPath.a);
        cxnxVar.c = this.a;
        boolean z = false;
        cxoc cxocVar = peopleKitVisualElementPath.a.a.get(0);
        if (!this.e.containsKey(cxocVar.a)) {
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(i));
            this.e.put(cxocVar.a, hashSet);
        } else {
            Integer valueOf = Integer.valueOf(i);
            if (!this.e.get(cxocVar.a).contains(valueOf)) {
                this.e.get(cxocVar.a).add(valueOf);
            }
            cxnv cxqrVar = new cxqr(this.a, cxnxVar, this.b, z);
            j(cxnxVar);
            j(cxqrVar);
        }
        z = true;
        cxnv cxqrVar2 = new cxqr(this.a, cxnxVar, this.b, z);
        j(cxnxVar);
        j(cxqrVar2);
    }

    @Override // defpackage.cxqo
    public final void e(int i) {
        this.h = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cxqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r10, int r11) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxqp.f(com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig, int):void");
    }

    @Override // defpackage.cxqo
    public final int g() {
        return this.h;
    }

    @Override // defpackage.cxqo
    public final void h(int i) {
        this.i = i;
    }

    @Override // defpackage.cxqo
    public final int i() {
        return this.i;
    }
}
