package defpackage;
/* compiled from: PG */
/* renamed from: eamv  reason: default package */
/* loaded from: classes6.dex */
public enum eamv {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    INTERN_FIELD_NAMES(true),
    CANONICALIZE_FIELD_NAMES(true);
    
    final boolean k;

    eamv(boolean z) {
        this.k = z;
    }

    public final boolean a(int i) {
        return (i & b()) != 0;
    }

    public final int b() {
        return 1 << ordinal();
    }
}
