package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ceup  reason: default package */
/* loaded from: classes4.dex */
public class ceup implements cesn {
    private final cese a;
    private final boolean b;
    private String c = "";

    public ceup(cese ceseVar, boolean z) {
        this.a = ceseVar;
        this.b = z;
    }

    @Override // defpackage.cesn
    public String e() {
        return this.c;
    }

    @Override // defpackage.cesn
    public Boolean f() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.cesn
    public Boolean g() {
        return Boolean.valueOf(this.a.b());
    }

    public void h(String str) {
        this.c = str;
    }

    public void i(Bundle bundle) {
        bundle.putString("profile_leaf_page_statistics_key", this.c);
    }

    public void j(Bundle bundle) {
        this.c = bundle.getString("profile_leaf_page_statistics_key", "");
    }
}
