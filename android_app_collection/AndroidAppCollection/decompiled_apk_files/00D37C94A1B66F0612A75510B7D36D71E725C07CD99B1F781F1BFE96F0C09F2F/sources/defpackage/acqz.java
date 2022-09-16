package defpackage;
/* compiled from: PG */
/* renamed from: acqz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acqz {
    public final /* synthetic */ acrb a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ acqz(acrb acrbVar, boolean z, boolean z2) {
        this.a = acrbVar;
        this.b = z;
        this.c = z2;
    }

    public final qqe a(qqe qqeVar) {
        acrb acrbVar = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        if (z) {
            return null;
        }
        if (!z2) {
            return qqeVar;
        }
        avgk a = avgl.a();
        String str = qqeVar.i;
        a.copyOnWrite();
        avgl.c((avgl) a.instance, str);
        int a2 = qqeVar.a();
        a.copyOnWrite();
        avgl.d((avgl) a.instance, a2);
        avgm a3 = avgn.a();
        a3.copyOnWrite();
        avgn.c((avgn) a3.instance, (avgl) a.mo39build());
        arrf a4 = arrh.a();
        a4.copyOnWrite();
        ((arrh) a4.instance).dJ((avgn) a3.mo39build());
        ((acrr) acrbVar.a.get()).c((arrh) a4.mo39build());
        return qqeVar;
    }
}
