package defpackage;
/* renamed from: ssy  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ssy implements dbrn {
    static final dbrn a = new ssy();

    private ssy() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        qee qeeVar = (qee) obj;
        boolean z = true;
        if (qeeVar != qee.ENABLED && qeeVar != qee.ENABLED_DUE_TO_STICKINESS && qeeVar != qee.ENABLED_DUE_TO_DOGFOOD_OPT_IN) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
