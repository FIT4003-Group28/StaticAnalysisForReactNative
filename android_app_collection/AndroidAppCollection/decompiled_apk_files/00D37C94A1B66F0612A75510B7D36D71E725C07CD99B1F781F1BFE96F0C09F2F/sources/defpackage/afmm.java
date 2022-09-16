package defpackage;
/* compiled from: PG */
/* renamed from: afmm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afmm implements ayqb {
    public final /* synthetic */ afmq a;
    private final /* synthetic */ int b;

    public /* synthetic */ afmm(afmq afmqVar, int i) {
        this.b = i;
        this.a = afmqVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            afmq afmqVar = this.a;
            int intValue = ((Integer) obj).intValue();
            afmqVar.d = intValue == 3 || intValue == 10;
            return;
        }
        afmq afmqVar2 = this.a;
        awuj awujVar = (awuj) obj;
        awan b = awan.b(awujVar.n);
        if (b == null) {
            b = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        afmqVar2.b = b;
        awan b2 = awan.b(awujVar.m);
        if (b2 == null) {
            b2 = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        afmqVar2.c = b2;
    }
}
