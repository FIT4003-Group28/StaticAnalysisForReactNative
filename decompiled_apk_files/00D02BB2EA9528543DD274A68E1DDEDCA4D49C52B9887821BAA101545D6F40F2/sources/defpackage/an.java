package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: an  reason: default package */
/* loaded from: classes.dex */
public class an {
    public final Map<String, Object> b = new HashMap();
    public volatile boolean c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }
}
