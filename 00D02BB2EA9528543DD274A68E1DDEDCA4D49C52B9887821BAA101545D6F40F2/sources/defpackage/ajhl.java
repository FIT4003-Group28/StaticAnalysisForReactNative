package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ajhl  reason: default package */
/* loaded from: classes2.dex */
public final class ajhl {
    public static final ajih a(fd fdVar, gz gzVar, String str, int i, cqkj cqkjVar) {
        ajhm ajhmVar = (ajhm) fdVar.R().H("PREREQUISITE_CONTROLLER_FRAGMENT_TAG");
        if (ajhmVar == null) {
            ajhmVar = new ajhm();
            Bundle bundle = new Bundle();
            bundle.putString("account_id", str);
            ajhmVar.B(bundle);
            ajhmVar.aB = i;
            gzVar.y(ajhmVar, "PREREQUISITE_CONTROLLER_FRAGMENT_TAG");
        }
        ajhmVar.ak = cqkjVar;
        ajhmVar.aB = i;
        return ajhmVar;
    }
}
