package defpackage;
/* compiled from: PG */
/* renamed from: eamr  reason: default package */
/* loaded from: classes6.dex */
public enum eamr {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    WRITE_NUMBERS_AS_STRINGS(false),
    FLUSH_PASSED_TO_STREAM(true),
    ESCAPE_NON_ASCII(false);
    
    final boolean h;
    public final int i = 1 << ordinal();

    eamr(boolean z) {
        this.h = z;
    }
}
