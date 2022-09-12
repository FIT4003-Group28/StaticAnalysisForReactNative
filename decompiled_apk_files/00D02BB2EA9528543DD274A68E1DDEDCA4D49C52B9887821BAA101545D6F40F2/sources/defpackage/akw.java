package defpackage;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: akw  reason: default package */
/* loaded from: classes2.dex */
final class akw implements akv {
    private final LocaleList a;

    public akw(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // defpackage.akv
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.akv
    public final Locale b() {
        return this.a.get(0);
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((akv) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
