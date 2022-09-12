package defpackage;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: PG */
@Deprecated
/* renamed from: cnxr  reason: default package */
/* loaded from: classes5.dex */
public final class cnxr {
    public static void a(@dzsi Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
