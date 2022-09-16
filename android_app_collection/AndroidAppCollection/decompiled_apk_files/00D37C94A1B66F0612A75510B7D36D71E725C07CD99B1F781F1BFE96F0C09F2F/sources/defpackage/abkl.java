package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: PG */
/* renamed from: abkl  reason: default package */
/* loaded from: classes.dex */
public final class abkl {
    public String a = null;
    public Pattern b = null;

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a = null;
            this.b = null;
        } else if (str.equals(this.a)) {
        } else {
            this.a = str;
            try {
                String valueOf = String.valueOf(str.replaceAll("([^a-zA-Z0-9 ])", "\\\\$1").replace(" ", "([\\uFEFF\\s])*"));
                this.b = Pattern.compile(valueOf.length() != 0 ? "(@|#){1}".concat(valueOf) : new String("(@|#){1}"));
            } catch (PatternSyntaxException e) {
                zep.d("LiveChatAccountNameProvider failed pattern", e);
            }
        }
    }
}
