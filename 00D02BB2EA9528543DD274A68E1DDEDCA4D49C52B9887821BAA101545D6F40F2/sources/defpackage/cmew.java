package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cmew  reason: default package */
/* loaded from: classes5.dex */
public final class cmew implements cmle, cmdx {
    public final Uri b;
    public final cmlm c;
    public final clup d;
    public final cmmt e;
    public volatile boolean g;
    public long i;
    public clvk l;
    public boolean m;
    public final /* synthetic */ cmfb n;
    public final cmdk o;
    public final clvd f = new clvd();
    public boolean h = true;
    public long k = -1;
    public final long a = cmdz.a.getAndIncrement();
    public cmkj j = a(0);

    public cmew(cmfb cmfbVar, Uri uri, cmkg cmkgVar, cmdk cmdkVar, clup clupVar, cmmt cmmtVar) {
        this.n = cmfbVar;
        this.b = uri;
        this.c = new cmlm(cmkgVar);
        this.o = cmdkVar;
        this.d = clupVar;
        this.e = cmmtVar;
    }

    public final cmkj a(long j) {
        cmki cmkiVar = new cmki();
        cmkiVar.a = this.b;
        cmkiVar.e = j;
        cmkiVar.g = null;
        cmkiVar.h = 6;
        cmkiVar.d = cmfb.b;
        return cmkiVar.a();
    }

    public final void b(long j, long j2) {
        this.f.a = j;
        this.i = j2;
        this.h = true;
        this.m = false;
    }
}
