package defpackage;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btcr  reason: default package */
/* loaded from: classes4.dex */
final class btcr implements Comparator<dkmt> {
    private final List<Locale> a;

    public btcr(List<Locale> list) {
        this.a = list;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dkmt dkmtVar, dkmt dkmtVar2) {
        return this.a.indexOf(Locale.forLanguageTag(dkmtVar.c)) - this.a.indexOf(Locale.forLanguageTag(dkmtVar2.c));
    }
}
