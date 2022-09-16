package defpackage;

import android.graphics.Rect;
import java.util.List;
/* compiled from: PG */
/* renamed from: dbn  reason: default package */
/* loaded from: classes3.dex */
public final class dbn implements Cloneable {
    public final deq a;
    public final cyr b;
    public final Rect c;
    public final int d;
    public final int e;
    public final int f;
    public final def g;
    public final long h;
    public int i;
    public long j;
    public int k = 0;
    public final dab l;
    private final int m;
    private final int n;

    public dbn(dab dabVar, deq deqVar, cyr cyrVar, Rect rect, int i, int i2, int i3, long j, int i4, int i5, def defVar) {
        this.l = dabVar;
        this.a = deqVar;
        this.b = cyrVar;
        this.c = rect;
        this.m = i;
        this.n = i2;
        this.d = i3;
        this.h = j;
        this.e = i4;
        this.f = i5;
        this.g = defVar;
    }

    public static dbn a(dms dmsVar) {
        return (dbn) dmsVar.d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dmw b(dbn dbnVar, dmw dmwVar) {
        List list;
        if (dmwVar != null) {
            int i = dcd.a;
            long j = dbnVar.j;
            if (dbnVar == null) {
                throw new IllegalArgumentException("Null output used for LithoRenderUnit.");
            }
        } else {
            int i2 = dmv.a;
        }
        Rect rect = dbnVar.c;
        deq deqVar = dbnVar.a;
        if (dmwVar != null && (list = dmwVar.c) != null) {
            list.size();
        }
        return new dmw(dbnVar, rect);
    }

    public static boolean e(int i) {
        return (i & 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Rect rect) {
        rect.left = this.c.left - this.m;
        rect.top = this.c.top - this.n;
        rect.right = this.c.right - this.m;
        rect.bottom = this.c.bottom - this.n;
    }

    public final boolean d() {
        if (this.e == 2) {
            return false;
        }
        dab dabVar = this.l;
        return (dabVar != null && dabVar.z()) || this.b.ad();
    }
}
