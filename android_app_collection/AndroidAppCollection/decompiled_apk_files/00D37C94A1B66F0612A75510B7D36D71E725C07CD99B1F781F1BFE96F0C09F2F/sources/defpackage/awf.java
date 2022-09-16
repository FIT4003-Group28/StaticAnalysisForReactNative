package defpackage;
/* compiled from: PG */
/* renamed from: awf  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class awf implements awm {
    public static final /* synthetic */ awf a = new awf();

    private /* synthetic */ awf() {
    }

    @Override // defpackage.awm
    public final int a(Object obj) {
        int i = awn.a;
        String str = ((avz) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (pxi.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
