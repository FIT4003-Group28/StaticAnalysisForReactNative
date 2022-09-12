package defpackage;

import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: dbrt  reason: default package */
/* loaded from: classes5.dex */
final class dbrt extends dbrd {
    final Matcher a;

    public dbrt(Matcher matcher) {
        dbsk.s(matcher);
        this.a = matcher;
    }

    @Override // defpackage.dbrd
    public final boolean a() {
        return this.a.matches();
    }

    @Override // defpackage.dbrd
    public final boolean b(int i) {
        return this.a.find(i);
    }

    @Override // defpackage.dbrd
    public final int c() {
        return this.a.end();
    }

    @Override // defpackage.dbrd
    public final int d() {
        return this.a.start();
    }
}
