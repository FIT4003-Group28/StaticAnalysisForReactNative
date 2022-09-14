package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cxne  reason: default package */
/* loaded from: classes5.dex */
public final class cxne extends cxnh {
    private final dcdc<Pattern> a;

    static {
        dcrc.b("RegExUrlChecker");
    }

    public cxne(dcdc<Pattern> dcdcVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            Pattern pattern = dcdcVar.get(i);
            if ((pattern.flags() & 2) == 0) {
                F.g(Pattern.compile(pattern.pattern(), pattern.flags() | 2));
            } else {
                F.g(pattern);
            }
        }
        this.a = F.f();
    }

    @Override // defpackage.cxnh
    protected final boolean a(String str) {
        dcdc<Pattern> dcdcVar = this.a;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dcdcVar.get(i).matcher(str).matches()) {
                return true;
            }
            i = i2;
        }
        cxng.b(Uri.parse(str));
        return false;
    }
}
