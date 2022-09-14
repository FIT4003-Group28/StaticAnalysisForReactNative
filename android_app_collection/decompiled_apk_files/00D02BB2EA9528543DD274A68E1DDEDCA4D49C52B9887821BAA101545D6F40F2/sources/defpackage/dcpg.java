package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcpg  reason: default package */
/* loaded from: classes.dex */
public abstract class dcpg extends dcpj {
    private final char[][] a;
    private final int b;
    private final char c;
    private final char d;

    /* JADX INFO: Access modifiers changed from: protected */
    public dcpg(Map<Character, String> map) {
        char[][] cArr = dcph.a(map).a;
        this.a = cArr;
        this.b = cArr.length;
        this.c = ' ';
        this.d = '~';
    }

    @Override // defpackage.dcpj, defpackage.dcpn
    public final String a(String str) {
        dbsk.s(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.b && this.a[charAt] != null) || charAt > this.d || charAt < this.c) {
                return d(str, i);
            }
        }
        return str;
    }

    @Override // defpackage.dcpj
    protected final char[] b(char c) {
        char[] cArr;
        if (c >= this.b || (cArr = this.a[c]) == null) {
            if (c >= this.c && c <= this.d) {
                return null;
            }
            return c(c);
        }
        return cArr;
    }

    protected abstract char[] c(char c);
}
