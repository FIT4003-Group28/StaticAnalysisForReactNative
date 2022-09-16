package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: aodp  reason: default package */
/* loaded from: classes.dex */
public final class aodp extends aodo {
    public static final aodp a = new aodp();

    @Override // defpackage.aodo
    public final ByteBuffer a(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }
}
