package defpackage;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: aidc  reason: default package */
/* loaded from: classes.dex */
public final class aidc extends ylz implements airt {
    public final airw d;
    public final aypf e = new aypf();
    public aaks f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final apzg j;
    private final WillAutonavInformer k;

    public aidc(apzg apzgVar, WillAutonavInformer willAutonavInformer, airw airwVar) {
        apzgVar.getClass();
        this.j = apzgVar;
        this.k = willAutonavInformer;
        this.d = airwVar;
    }

    private static final boolean e(apzg apzgVar, apzg apzgVar2) {
        if (apzgVar != null) {
            String str = ((awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint)).c;
            String str2 = ((awel) apzgVar2.qm(WatchEndpointOuterClass.watchEndpoint)).c;
            if (apzgVar.c.equals(apzgVar2.c) && apzgVar.qn(WatchEndpointOuterClass.watchEndpoint) && str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ylz
    public final void b() {
        this.e.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.g((defpackage.awvc) r0.a.c()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r5 = this;
            aaks r0 = r5.f
            r1 = 0
            if (r0 != 0) goto L8
            r5.c = r1
            return
        L8:
            boolean r2 = r5.g
            boolean r3 = r5.h
            boolean r4 = r5.i
            aako r0 = r0.a(r2, r3, r4, r1)
            if (r0 != 0) goto L17
            r5.c = r1
            return
        L17:
            apzg r2 = r0.b()
            apzg r3 = r5.j
            boolean r2 = e(r2, r3)
            if (r2 != 0) goto L43
            apzg r0 = r0.a()
            apzg r2 = r5.j
            boolean r0 = e(r0, r2)
            if (r0 == 0) goto L40
            com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer r0 = r5.k
            yve r2 = r0.a
            aoqu r2 = r2.c()
            awvc r2 = (defpackage.awvc) r2
            boolean r0 = r0.g(r2)
            if (r0 == 0) goto L40
            goto L43
        L40:
            r5.c = r1
            return
        L43:
            r0 = 1
            r5.c = r0
            r5.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidc.d():void");
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.am().h(aiwv.n(airwVar.aB(), 16777216L)).h(aiwv.l(1)).aa(new aidb(this, 1), aiax.h), airwVar.ao().h(aiwv.n(airwVar.aB(), 16777216L)).h(aiwv.l(1)).aa(new aidb(this), aiax.h)};
    }
}
