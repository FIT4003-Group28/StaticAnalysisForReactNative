package defpackage;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: bahj  reason: default package */
/* loaded from: classes2.dex */
public final class bahj implements URLStreamHandlerFactory {
    private final ExperimentalCronetEngine a;

    public bahj(ExperimentalCronetEngine experimentalCronetEngine) {
        this.a = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new bahg(this.a);
        }
        return null;
    }
}
