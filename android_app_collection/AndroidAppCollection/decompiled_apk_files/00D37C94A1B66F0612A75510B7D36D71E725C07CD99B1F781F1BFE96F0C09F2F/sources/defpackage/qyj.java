package defpackage;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: PG */
@Deprecated
/* renamed from: qyj  reason: default package */
/* loaded from: classes4.dex */
public class qyj {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
