package defpackage;

import j$.util.function.ToIntFunction;
/* compiled from: PG */
/* renamed from: aaow  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aaow implements ToIntFunction {
    public static final /* synthetic */ aaow a = new aaow();

    private /* synthetic */ aaow() {
    }

    @Override // j$.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        augh aughVar;
        avfx avfxVar = ((aaoz) obj).a.a;
        if (avfxVar.b == 6) {
            aughVar = (augh) avfxVar.c;
        } else {
            aughVar = augh.a;
        }
        int bZ = awwc.bZ(aughVar.b);
        if (bZ == 0) {
            bZ = 1;
        }
        return bZ - 1;
    }
}
