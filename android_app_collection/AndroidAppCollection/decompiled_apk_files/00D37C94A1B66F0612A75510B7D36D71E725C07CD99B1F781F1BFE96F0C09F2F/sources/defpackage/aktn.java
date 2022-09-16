package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aktn  reason: default package */
/* loaded from: classes.dex */
final class aktn extends aktm {
    public aktn(Pattern pattern, String str) {
        super(pattern, str);
    }

    @Override // defpackage.aktm
    public final String a(String str) {
        if (this.a.matcher(str).find()) {
            boolean contains = str.contains("owc=yes");
            boolean contains2 = str.contains("itag=0");
            if (!contains) {
                return this.b;
            }
            if (!contains2) {
                return this.b.concat("-prewarm");
            }
            return this.b.concat("-prewarm-itag0");
        }
        return null;
    }
}
