package defpackage;

import android.graphics.Rect;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: pgl  reason: default package */
/* loaded from: classes4.dex */
public final class pgl extends IllegalStateException {
    private final Surface a;

    public pgl(Throwable th, Surface surface) {
        super(th);
        this.a = surface;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String concat;
        Throwable cause = getCause();
        if (cause == null) {
            return null;
        }
        String message = cause.getMessage();
        if (message != null && !message.isEmpty()) {
            return message.length() != 0 ? "m.".concat(message) : new String("m.");
        } else if (!(cause instanceof IllegalArgumentException)) {
            return message;
        } else {
            Surface surface = this.a;
            if (surface == null) {
                concat = "null";
            } else if (!surface.isValid()) {
                concat = "invalid";
            } else {
                try {
                    surface.unlockCanvasAndPost(surface.lockCanvas(new Rect()));
                    concat = "valid";
                } catch (IllegalArgumentException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    concat = valueOf.length() != 0 ? "locked.".concat(valueOf) : new String("locked.");
                }
            }
            String valueOf2 = String.valueOf(concat);
            return valueOf2.length() != 0 ? "sur.".concat(valueOf2) : new String("sur.");
        }
    }
}
