package defpackage;
/* compiled from: PG */
/* renamed from: dbqm  reason: default package */
/* loaded from: classes.dex */
public final class dbqm extends dbrb {
    public static final dbrb a = new dbqm();

    private dbqm() {
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        if (c != ' ' && c != 133 && c != 5760) {
            if (c != 8199) {
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c >= 8192 && c <= 8202) {
                                return true;
                            }
                            break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
