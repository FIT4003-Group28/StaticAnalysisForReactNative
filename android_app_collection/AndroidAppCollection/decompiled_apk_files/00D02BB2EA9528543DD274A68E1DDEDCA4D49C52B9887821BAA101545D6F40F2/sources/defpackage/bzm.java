package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: bzm  reason: default package */
/* loaded from: classes.dex */
public final class bzm implements btl<ByteBuffer> {
    @Override // defpackage.btl
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, File file, bua buaVar) {
        try {
            cjb.b(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
