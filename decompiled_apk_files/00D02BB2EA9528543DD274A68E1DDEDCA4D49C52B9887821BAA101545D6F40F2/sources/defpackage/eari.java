package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eari  reason: default package */
/* loaded from: classes6.dex */
public final class eari extends eate {
    private final eaqt b;

    public eari(eaqt eaqtVar, eaox eaoxVar) {
        super(eaop.n, eaoxVar);
        this.b = eaqtVar;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return 7;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int E(Locale locale) {
        return eark.a(locale).k;
    }

    @Override // defpackage.eass
    protected final int Tj(String str, Locale locale) {
        Integer num = eark.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new eapb(eaop.n, str);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        return this.b.aj(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String g(int i, Locale locale) {
        return eark.a(locale).b[i];
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String j(int i, Locale locale) {
        return eark.a(locale).c[i];
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return this.b.d;
    }

    @Override // defpackage.eate, defpackage.eass, defpackage.eaon
    public final int w() {
        return 1;
    }
}
