package defpackage;

import android.content.Intent;
/* renamed from: bzgr  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bzgr implements dbsl {
    static final dbsl a = new bzgr();

    private bzgr() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        Intent intent;
        afga afgaVar = (afga) obj;
        if (afgaVar != null && afgaVar.a().endsWith(".CommuteBoardActivity") && (intent = afgaVar.a) != null) {
            if (intent.hasExtra("DESTINATION_FEATURE_ID") || intent.hasExtra("DESTINATION_TYPE")) {
                return true;
            }
            if (intent.hasExtra("DESTINATION_LAT") && intent.hasExtra("DESTINATION_LONG")) {
                return true;
            }
        }
        return false;
    }
}
