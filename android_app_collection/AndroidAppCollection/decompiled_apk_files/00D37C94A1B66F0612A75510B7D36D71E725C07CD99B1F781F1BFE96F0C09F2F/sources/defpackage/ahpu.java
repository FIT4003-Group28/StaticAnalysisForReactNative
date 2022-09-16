package defpackage;
/* compiled from: PG */
/* renamed from: ahpu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahpu {
    public final /* synthetic */ ahpx a;

    public final void a(final long j) {
        final ahpx ahpxVar = this.a;
        ahpxVar.a.post(new Runnable() { // from class: ahps
            @Override // java.lang.Runnable
            public final void run() {
                ahpx ahpxVar2 = ahpx.this;
                long j2 = j;
                ahyo ahyoVar = ahpxVar2.g;
                if (ahyoVar != null) {
                    ahyoVar.r(j2);
                }
            }
        });
        ahpxVar.d();
    }
}
