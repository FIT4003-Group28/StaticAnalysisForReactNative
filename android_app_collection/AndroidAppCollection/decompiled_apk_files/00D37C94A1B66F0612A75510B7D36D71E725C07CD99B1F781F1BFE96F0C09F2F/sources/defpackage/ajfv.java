package defpackage;
/* compiled from: PG */
/* renamed from: ajfv  reason: default package */
/* loaded from: classes.dex */
public final class ajfv {
    public final ajav a;
    public final aeov b;
    private final aijg c;

    public ajfv(ajav ajavVar, aijg aijgVar, aeov aeovVar) {
        this.a = ajavVar;
        this.c = aijgVar;
        this.b = aeovVar;
    }

    public final void a() {
        this.c.a.n().Z(new ayqb() { // from class: ajfu
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ajfv ajfvVar = ajfv.this;
                afmu a = ((aiij) obj).a();
                if (a == null && ajfvVar.equals(ajfvVar.a.b)) {
                    ajfvVar.b.r();
                } else if (a == null) {
                    zep.b("Trying to detachMediaView when it wasn't the most recent MediaView Setter");
                } else {
                    ajfvVar.b.n(a);
                    ajav ajavVar = ajfvVar.a;
                    ajfv ajfvVar2 = ajavVar.b;
                    ajavVar.b = ajfvVar;
                }
            }
        });
    }
}
