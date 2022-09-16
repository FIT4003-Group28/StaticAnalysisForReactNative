package defpackage;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: akp  reason: default package */
/* loaded from: classes.dex */
final class akp implements ako {
    private final LocaleList a;

    public akp(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // defpackage.ako
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.ako
    public final Locale b() {
        return this.a.get(0);
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((ako) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
