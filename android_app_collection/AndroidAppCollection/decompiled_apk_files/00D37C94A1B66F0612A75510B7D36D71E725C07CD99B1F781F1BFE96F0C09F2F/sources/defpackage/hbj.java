package defpackage;
/* compiled from: PG */
/* renamed from: hbj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hbj implements ayqb {
    public final /* synthetic */ hbm a;
    private final /* synthetic */ int b;

    public /* synthetic */ hbj(hbm hbmVar) {
        this.a = hbmVar;
    }

    public /* synthetic */ hbj(hbm hbmVar, int i) {
        this.b = i;
        this.a = hbmVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            hbm hbmVar = this.a;
            Boolean bool = (Boolean) obj;
            hbmVar.b.h(Long.MIN_VALUE, gyq.d(hbmVar.a.g, apzg.a, actj.SHORTS_ADD_TEXT_EDITOR_DONE_BUTTON.II));
        } else if (i == 1) {
            hbm hbmVar2 = this.a;
            Boolean bool2 = (Boolean) obj;
            hbmVar2.a.i(hbmVar2.b.a() != null ? gyq.d(hbmVar2.b.a().a, apzg.a, actj.SHORTS_CREATION_EDITOR_TIMELINE_EDITOR_ADD_TRACK_BUTTON.II) : null);
        } else {
            hbm hbmVar3 = this.a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            hbmVar3.c.setEnabled(booleanValue);
            zxq.a(hbmVar3.c.getContext(), hbmVar3.c, booleanValue);
        }
    }
}
