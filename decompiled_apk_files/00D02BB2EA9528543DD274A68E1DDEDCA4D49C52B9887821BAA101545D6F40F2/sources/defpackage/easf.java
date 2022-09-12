package defpackage;

import java.util.Date;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: easf  reason: default package */
/* loaded from: classes6.dex */
public final class easf extends earz implements easg, easj {
    static final easf a = new easf();

    protected easf() {
    }

    @Override // defpackage.earz, defpackage.easg
    public final long a(Object obj, eaok eaokVar) {
        return ((Date) obj).getTime();
    }

    @Override // defpackage.easb
    public final Class<?> f() {
        return Date.class;
    }
}
