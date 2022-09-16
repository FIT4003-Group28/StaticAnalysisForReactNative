package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aegp  reason: default package */
/* loaded from: classes.dex */
public final class aegp extends IOException {
    public aegp() {
        super("Transfer timed out.");
    }

    public aegp(Throwable th) {
        super("[Offline] Thumbnail transfer timed out.", th);
    }
}
