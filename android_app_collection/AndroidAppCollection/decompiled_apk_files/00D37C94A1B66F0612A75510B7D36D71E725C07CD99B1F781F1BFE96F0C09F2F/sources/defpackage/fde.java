package defpackage;
/* compiled from: PG */
/* renamed from: fde  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fde implements zdq {
    public final /* synthetic */ yuy a;
    private final /* synthetic */ int b;

    public /* synthetic */ fde(yuy yuyVar) {
        this.a = yuyVar;
    }

    public /* synthetic */ fde(yuy yuyVar, int i) {
        this.b = i;
        this.a = yuyVar;
    }

    @Override // defpackage.zdq
    public final void a(Object obj, Object obj2) {
        if (this.b == 0) {
            String str = (String) obj;
            boolean booleanValue = ((Boolean) this.a.a(fcw.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, true)).booleanValue();
            aopa aopaVar = (aopa) obj2;
            aopaVar.copyOnWrite();
            fcy fcyVar = (fcy) aopaVar.instance;
            fcy fcyVar2 = fcy.a;
            fcyVar.b |= 4;
            fcyVar.e = booleanValue;
            return;
        }
        String str2 = (String) obj;
        boolean booleanValue2 = ((Boolean) this.a.a(fcw.OFFLINE_FIRST_ADD_TOOLTIP, true)).booleanValue();
        aopa aopaVar2 = (aopa) obj2;
        aopaVar2.copyOnWrite();
        fcy fcyVar3 = (fcy) aopaVar2.instance;
        fcy fcyVar4 = fcy.a;
        fcyVar3.b |= 2;
        fcyVar3.d = booleanValue2;
    }
}
