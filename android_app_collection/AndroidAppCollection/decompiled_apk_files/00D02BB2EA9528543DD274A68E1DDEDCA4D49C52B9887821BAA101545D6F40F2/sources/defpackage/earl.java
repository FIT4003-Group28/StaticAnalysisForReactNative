package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: earl  reason: default package */
/* loaded from: classes6.dex */
public final class earl extends eaqx {
    public earl(eaqt eaqtVar) {
        super(eaqtVar);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int E(Locale locale) {
        return eark.a(locale).l;
    }

    @Override // defpackage.eass
    protected final int Tj(String str, Locale locale) {
        Integer num = eark.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new eapb(eaop.i, str);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String g(int i, Locale locale) {
        return eark.a(locale).d[i];
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String j(int i, Locale locale) {
        return eark.a(locale).e[i];
    }
}
