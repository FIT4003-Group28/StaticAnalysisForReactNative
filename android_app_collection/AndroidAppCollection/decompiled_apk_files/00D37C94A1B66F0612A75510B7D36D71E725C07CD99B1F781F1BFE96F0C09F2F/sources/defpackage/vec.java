package defpackage;

import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: vec  reason: default package */
/* loaded from: classes4.dex */
public final class vec {
    private final vef a = new vef();

    public final boolean a(CharSequence charSequence, vea veaVar) {
        String str = veaVar.a;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = this.a.a(str).matcher(charSequence);
        return matcher.lookingAt() && matcher.matches();
    }
}
