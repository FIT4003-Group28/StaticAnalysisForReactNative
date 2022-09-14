package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxdy  reason: default package */
/* loaded from: classes5.dex */
public final class cxdy {
    public static final cxdy a;
    String b;
    final long c;
    long d;
    final long e;
    @dzsi
    public volatile List<cxdy> f;
    final int g;
    final int h;

    static {
        int i = cqaz.a;
        a = new cxdy("", SystemClock.elapsedRealtime(), -1L, Thread.currentThread().getId(), 3);
    }

    public cxdy(String str, long j, long j2, long j3, int i) {
        this.b = str;
        this.g = 1;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.h = i;
        if (i == 1) {
            this.f = Collections.synchronizedList(new ArrayList());
        } else {
            this.f = Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(List<cxdy> list) {
        if (this.f == Collections.EMPTY_LIST) {
            this.f = new ArrayList();
        }
        if (this.f != null) {
            this.f.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.h == 1;
    }

    public final long c() {
        long j = this.d;
        if (j == -1) {
            return -1L;
        }
        return j - this.c;
    }

    public cxdy(String str, long j, int i) {
        this(str, SystemClock.elapsedRealtime(), -1L, j, i);
    }
}
