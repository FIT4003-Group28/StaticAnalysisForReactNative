package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bajh  reason: default package */
/* loaded from: classes2.dex */
final class bajh extends baja {
    public bajh(baiw baiwVar) {
        super(baiwVar);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int b(Locale locale) {
        return bajg.a(locale).l;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String j(int i, Locale locale) {
        return bajg.a(locale).e[i];
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String l(int i, Locale locale) {
        return bajg.a(locale).d[i];
    }

    @Override // defpackage.bajr
    protected final int sz(String str, Locale locale) {
        Integer num = (Integer) bajg.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new bahy(bahp.i, str);
    }
}
