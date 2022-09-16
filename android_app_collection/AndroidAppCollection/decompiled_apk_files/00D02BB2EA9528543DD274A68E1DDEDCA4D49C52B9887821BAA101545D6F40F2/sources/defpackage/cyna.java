package defpackage;

import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: cyna  reason: default package */
/* loaded from: classes5.dex */
public final class cyna {
    public static boolean a(dzsj<CronetEngine> dzsjVar) {
        try {
            return dzsjVar.a().getVersionString().contains("CronetHttpURLConnection");
        } catch (IllegalStateException | UnsatisfiedLinkError unused) {
            return false;
        }
    }
}
