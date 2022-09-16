package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: syu  reason: default package */
/* loaded from: classes4.dex */
public final class syu implements tek {
    @Override // defpackage.tek
    public final int a() {
        return 386544496;
    }

    @Override // defpackage.tek
    public final /* bridge */ /* synthetic */ aodt b(ByteBuffer byteBuffer) {
        axna axnaVar = new axna();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axnaVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axnaVar;
    }

    @Override // defpackage.tel
    public final /* bridge */ /* synthetic */ void c(cyv cyvVar, tda tdaVar, String str, Object obj, tdq tdqVar, tcr tcrVar) {
        tdqVar.s((axna) obj);
    }

    @Override // defpackage.tel
    public final /* synthetic */ void e(tdq tdqVar) {
    }
}
