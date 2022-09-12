package defpackage;

import android.os.Build;
/* renamed from: cboy  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cboy implements cqlc {
    static final cqlc a = new cboy();

    private cboy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cbrm cbrmVar = (cbrm) cqkpVar;
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 26);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
