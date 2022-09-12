package defpackage;

import java.io.File;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: bzp  reason: default package */
/* loaded from: classes.dex */
public final class bzp implements cap<File, ByteBuffer> {
    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao<ByteBuffer> b(File file, int i, int i2, bua buaVar) {
        File file2 = file;
        return new cao<>(new ciy(file2), new bzn(file2));
    }
}
