package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ampj  reason: default package */
/* loaded from: classes.dex */
final class ampj extends ampb implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public ampj(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // defpackage.ampb
    public final ampa a(CharSequence charSequence) {
        return new ampa(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
