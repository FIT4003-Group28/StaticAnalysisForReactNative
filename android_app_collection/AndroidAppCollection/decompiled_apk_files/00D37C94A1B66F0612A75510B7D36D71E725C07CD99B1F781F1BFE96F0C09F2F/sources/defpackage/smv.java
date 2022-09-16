package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: smv  reason: default package */
/* loaded from: classes4.dex */
public final class smv implements smt {
    final /* synthetic */ Pattern a;

    public smv(Pattern pattern) {
        this.a = pattern;
    }

    @Override // defpackage.smt
    public final boolean a(String str) {
        return this.a.matcher(str).find();
    }
}
