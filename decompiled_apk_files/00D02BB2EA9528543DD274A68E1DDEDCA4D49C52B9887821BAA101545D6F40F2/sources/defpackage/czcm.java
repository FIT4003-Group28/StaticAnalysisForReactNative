package defpackage;

import java.text.RuleBasedCollator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: czcm  reason: default package */
/* loaded from: classes5.dex */
public final class czcm extends czda {
    public static final ConcurrentHashMap<Locale, RuleBasedCollator> a = new ConcurrentHashMap<>();
    private final RuleBasedCollator b;

    public czcm(RuleBasedCollator ruleBasedCollator) {
        this.b = ruleBasedCollator;
    }

    @Override // defpackage.czda
    protected final int a(String str, String str2) {
        return this.b.compare(str, str2);
    }
}
