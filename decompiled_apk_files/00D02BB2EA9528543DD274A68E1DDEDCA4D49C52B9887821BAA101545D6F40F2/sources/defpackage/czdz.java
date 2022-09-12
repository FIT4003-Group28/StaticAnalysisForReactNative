package defpackage;

import java.text.Normalizer;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: czdz  reason: default package */
/* loaded from: classes5.dex */
final class czdz extends czfd {
    private final Locale b;

    public czdz(Locale locale) {
        this.b = locale;
    }

    @Override // defpackage.czfd
    public final String a(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFKD);
    }

    @Override // defpackage.czfd
    public final String b(String str) {
        return str.toUpperCase(this.b).toLowerCase(this.b);
    }
}
