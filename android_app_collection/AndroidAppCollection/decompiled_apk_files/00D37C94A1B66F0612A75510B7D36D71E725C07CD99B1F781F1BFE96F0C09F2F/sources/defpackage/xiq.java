package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: xiq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xiq implements Runnable {
    public final /* synthetic */ xir a;
    public final /* synthetic */ apbz b;
    public final /* synthetic */ xdu c;
    public final /* synthetic */ xci d;
    public final /* synthetic */ xeh e;
    public final /* synthetic */ List f;
    public final /* synthetic */ xdj g;
    public final /* synthetic */ xcb h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    private final /* synthetic */ int m;

    public /* synthetic */ xiq(xir xirVar, apbz apbzVar, xdu xduVar, xci xciVar, xeh xehVar, int i, List list, xdj xdjVar, xcb xcbVar, boolean z, long j, int i2) {
        this.a = xirVar;
        this.b = apbzVar;
        this.c = xduVar;
        this.d = xciVar;
        this.e = xehVar;
        this.l = i;
        this.f = list;
        this.g = xdjVar;
        this.h = xcbVar;
        this.i = z;
        this.j = j;
        this.k = i2;
    }

    public /* synthetic */ xiq(xir xirVar, apbz apbzVar, xdu xduVar, xci xciVar, xeh xehVar, int i, List list, xdj xdjVar, xcb xcbVar, boolean z, long j, int i2, int i3) {
        this.m = i3;
        this.a = xirVar;
        this.b = apbzVar;
        this.c = xduVar;
        this.d = xciVar;
        this.e = xehVar;
        this.l = i;
        this.f = list;
        this.g = xdjVar;
        this.h = xcbVar;
        this.i = z;
        this.j = j;
        this.k = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.m == 0) {
            this.a.f(this.b, this.c, this.d, this.e, this.l, this.f, this.g, this.h, this.i, this.j, this.k);
        } else {
            this.a.f(this.b, this.c, this.d, this.e, this.l, this.f, this.g, this.h, this.i, this.j, this.k);
        }
    }
}
