package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbru  reason: default package */
/* loaded from: classes5.dex */
public final class dbru extends dbre implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public dbru(Pattern pattern) {
        dbsk.s(pattern);
        this.a = pattern;
    }

    @Override // defpackage.dbre
    public final dbrd a(CharSequence charSequence) {
        return new dbrt(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
