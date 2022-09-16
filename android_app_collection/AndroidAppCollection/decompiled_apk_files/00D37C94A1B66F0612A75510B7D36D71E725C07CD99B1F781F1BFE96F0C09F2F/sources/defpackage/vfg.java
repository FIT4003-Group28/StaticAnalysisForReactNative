package defpackage;
/* compiled from: PG */
/* renamed from: vfg  reason: default package */
/* loaded from: classes4.dex */
final class vfg {
    private int a;

    private static boolean b(char c) {
        return "\\[]?*(|)^$.{}+".indexOf(c) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(char[] cArr, StringBuilder sb, boolean z) {
        int length = cArr.length;
        loop0: while (true) {
            int i = this.a;
            if (i >= length) {
                return i == length;
            }
            int i2 = i + 1;
            this.a = i2;
            char c = cArr[i];
            if (c == '*') {
                sb.append(".*");
            } else if (c == ',') {
                if (true == z) {
                    c = '|';
                }
                sb.append(c);
            } else if (c == '?') {
                sb.append('.');
            } else if (c == '{') {
                sb.append('(');
                if (!a(cArr, sb, true)) {
                    return false;
                }
            } else if (c != '}') {
                if (c == '[') {
                    sb.append(c);
                    int i3 = this.a;
                    if (i3 == length) {
                        break;
                    }
                    this.a = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == '!') {
                        sb.append('^');
                        int i4 = this.a;
                        if (i4 == length) {
                            break;
                        }
                        this.a = i4 + 1;
                        c2 = cArr[i4];
                    }
                    if (c2 == ']') {
                        sb.append(']');
                        int i5 = this.a;
                        if (i5 != length) {
                            this.a = i5 + 1;
                            c2 = cArr[i5];
                        } else {
                            continue;
                        }
                    }
                    while (c2 != ']') {
                        sb.append(c2);
                        int i6 = this.a;
                        if (i6 == length) {
                            break loop0;
                        }
                        this.a = i6 + 1;
                        c2 = cArr[i6];
                    }
                    sb.append(']');
                } else if (c != '\\') {
                    if (b(c)) {
                        sb.append('\\');
                    }
                    sb.append(c);
                } else if (i2 == length) {
                    return false;
                } else {
                    this.a = i2 + 1;
                    char c3 = cArr[i2];
                    if (b(c3)) {
                        sb.append('\\');
                    }
                    sb.append(c3);
                }
            } else if (!z) {
                sb.append("\\}");
            } else {
                sb.append(')');
                return true;
            }
        }
        return false;
    }
}
