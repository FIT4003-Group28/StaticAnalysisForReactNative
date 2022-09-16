package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: vef  reason: default package */
/* loaded from: classes4.dex */
public final class vef {
    private final vee a = new vee();

    public final Pattern a(String str) {
        Pattern pattern = (Pattern) this.a.a(str);
        if (pattern == null) {
            Pattern compile = Pattern.compile(str);
            this.a.b(str, compile);
            return compile;
        }
        return pattern;
    }
}
