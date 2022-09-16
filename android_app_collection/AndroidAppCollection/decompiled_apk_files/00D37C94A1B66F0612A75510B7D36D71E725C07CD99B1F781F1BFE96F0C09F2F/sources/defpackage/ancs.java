package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: ancs  reason: default package */
/* loaded from: classes.dex */
public final class ancs implements anci {
    private final Level a;

    public ancs() {
        this(Level.ALL);
    }

    public ancs(Level level) {
        this.a = level;
    }

    @Override // defpackage.anci
    public final anbf a(String str) {
        return new ancu(str, this.a);
    }
}
