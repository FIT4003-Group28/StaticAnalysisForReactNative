package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bhr  reason: default package */
/* loaded from: classes2.dex */
final class bhr extends ku {
    @Override // defpackage.ku
    public final void i(String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error: ");
        sb.append(str);
        sb.append(", data: ");
        sb.append(bundle);
    }

    @Override // defpackage.ku
    public final void j(Bundle bundle) {
        bundle.getString("groupableTitle");
        bundle.getString("transferableTitle");
    }
}
