package defpackage;
/* compiled from: PG */
/* renamed from: phw  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class phw implements pwe {
    public final /* synthetic */ pjs a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ phw(pjs pjsVar, int i) {
        this.a = pjsVar;
        this.b = i;
    }

    public /* synthetic */ phw(pjs pjsVar, int i, int i2) {
        this.c = i2;
        this.a = pjsVar;
        this.b = i;
    }

    @Override // defpackage.pwe
    public final void a(Object obj) {
        if (this.c == 0) {
            pjs pjsVar = this.a;
            int i = this.b;
            pkt pktVar = pjsVar.a;
            ((pjv) obj).ae(i);
            return;
        }
        boolean z = this.a.j;
        ((pjv) obj).al();
    }
}
