package defpackage;
/* compiled from: PG */
/* renamed from: eane  reason: default package */
/* loaded from: classes6.dex */
public abstract class eane extends eamw {
    /* JADX INFO: Access modifiers changed from: protected */
    public static final String H(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i + ")";
        } else if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        } else {
            return "'" + c + "' (code " + i + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void K() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(int i, String str) {
        String str2 = "Unexpected character (" + H(i) + ")";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw l(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(String str) {
        throw l("Unexpected end-of-input" + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E() {
        D(" in a value");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F(int i) {
        throw l("Illegal character (" + H(i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(int i, String str) {
        if (!a(eamv.ALLOW_UNQUOTED_CONTROL_CHARS) || i >= 32) {
            throw l("Illegal unquoted character (" + H(i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final eamu I(String str, Throwable th) {
        return new eamu(str, d(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(char c) {
        if (a(eamv.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return;
        }
        if (c == '\'') {
            if (a(eamv.ALLOW_SINGLE_QUOTES)) {
                return;
            }
            c = '\'';
        }
        throw l("Unrecognized character escape " + H(c));
    }

    @Override // defpackage.eamw
    public abstract eamz b();

    @Override // defpackage.eamw
    public abstract String e();

    @Override // defpackage.eamw
    public final void m() {
        if (this.b == eamz.START_OBJECT || this.b == eamz.START_ARRAY) {
            int i = 1;
            while (true) {
                eamz b = b();
                if (b != null) {
                    int ordinal = b.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    continue;
                                }
                            }
                        }
                        i--;
                        if (i == 0) {
                            return;
                        }
                    }
                    i++;
                } else {
                    r();
                    return;
                }
            }
        }
    }

    protected abstract void r();
}
