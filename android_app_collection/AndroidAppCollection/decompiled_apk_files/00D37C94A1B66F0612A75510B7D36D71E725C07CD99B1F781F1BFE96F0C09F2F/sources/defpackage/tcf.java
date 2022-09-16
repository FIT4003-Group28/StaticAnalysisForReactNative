package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: tcf  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tcf implements tfx {
    private final /* synthetic */ int f;
    public static final /* synthetic */ tcf e = new tcf(4);
    public static final /* synthetic */ tcf d = new tcf(3);
    public static final /* synthetic */ tcf c = new tcf(2);
    public static final /* synthetic */ tcf b = new tcf(1);
    public static final /* synthetic */ tcf a = new tcf();

    private /* synthetic */ tcf() {
    }

    private /* synthetic */ tcf(int i) {
        this.f = i;
    }

    @Override // defpackage.tfx
    public final void a(ByteBuffer byteBuffer, aodt aodtVar) {
        int i = this.f;
        if (i == 0) {
            axml.aH(byteBuffer, (axml) aodtVar);
        } else if (i == 1) {
            axne.aO(byteBuffer, (axne) aodtVar);
        } else if (i == 2) {
            axml.aH(byteBuffer, (axml) aodtVar);
        } else if (i == 3) {
            axne.aO(byteBuffer, (axne) aodtVar);
        } else {
            axml.aH(byteBuffer, (axml) aodtVar);
        }
    }
}
