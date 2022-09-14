package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cmbf  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cmbf implements cmbn {
    static final cmbn a = new cmbf();

    private cmbf() {
    }

    @Override // defpackage.cmbn
    public final int a(Object obj) {
        int i = cmbo.a;
        String str = ((cmaz) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (cmny.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
