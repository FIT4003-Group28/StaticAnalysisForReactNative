package defpackage;

import com.google.android.apps.gmm.location.model.DeviceLocation;
/* compiled from: PG */
/* renamed from: awju  reason: default package */
/* loaded from: classes3.dex */
public final class awju {
    public final avjy a;
    public final /* synthetic */ awjv d;
    @dzsi
    public DeviceLocation c = null;
    public final deig<avjg> b = deig.d();

    public awju(awjv awjvVar, avjy avjyVar) {
        this.d = awjvVar;
        this.a = avjyVar;
    }

    public final void a(@dzsi DeviceLocation deviceLocation) {
        this.c = deviceLocation;
        this.d.j.N(new awjr(this));
    }

    public final bvjk b() {
        return this.a.k ? bvjk.es : bvjk.er;
    }
}
