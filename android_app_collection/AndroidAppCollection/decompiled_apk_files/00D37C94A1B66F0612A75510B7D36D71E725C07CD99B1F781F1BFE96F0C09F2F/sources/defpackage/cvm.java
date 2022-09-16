package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cvm  reason: default package */
/* loaded from: classes3.dex */
final class cvm extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
