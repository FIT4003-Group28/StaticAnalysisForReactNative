package defpackage;

import com.google.android.filament.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcpi  reason: default package */
/* loaded from: classes.dex */
public abstract class dcpi extends dcpx {
    private final char[][] a;
    private final int b;
    private final int c;
    private final int d;
    private final char e;
    private final char f;

    /* JADX INFO: Access modifiers changed from: protected */
    public dcpi(Map<Character, String> map) {
        char[][] cArr = dcph.a(map).a;
        this.a = cArr;
        this.b = cArr.length;
        this.c = 32;
        this.d = R.styleable.AppCompatTheme_windowNoTitle;
        this.e = ' ';
        this.f = (char) Math.min((int) R.styleable.AppCompatTheme_windowNoTitle, 55295);
    }

    @Override // defpackage.dcpx, defpackage.dcpn
    public final String a(String str) {
        dbsk.s(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.b && this.a[charAt] != null) || charAt > this.f || charAt < this.e) {
                return e(str, i);
            }
        }
        return str;
    }

    @Override // defpackage.dcpx
    protected final char[] b(int i) {
        char[] cArr;
        if (i >= this.b || (cArr = this.a[i]) == null) {
            if (i >= this.c && i <= this.d) {
                return null;
            }
            return d(i);
        }
        return cArr;
    }

    @Override // defpackage.dcpx
    protected final int c(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if ((charAt < this.b && this.a[charAt] != null) || charAt > this.f || charAt < this.e) {
                break;
            }
            i++;
        }
        return i;
    }

    protected abstract char[] d(int i);
}
