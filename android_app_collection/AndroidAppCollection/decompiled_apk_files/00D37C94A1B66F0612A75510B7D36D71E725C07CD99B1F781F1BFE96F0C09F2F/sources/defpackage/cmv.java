package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cmv  reason: default package */
/* loaded from: classes2.dex */
public final class cmv implements chn {
    @Override // defpackage.chn
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, cic cicVar) {
        try {
            cus.e((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
