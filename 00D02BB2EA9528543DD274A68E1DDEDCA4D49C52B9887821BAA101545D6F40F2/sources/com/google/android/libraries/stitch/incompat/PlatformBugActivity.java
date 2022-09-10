package com.google.android.libraries.stitch.incompat;

import android.os.Bundle;
import java.util.HashMap;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class PlatformBugActivity extends ff {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("extra_error_type")) {
            throw new IllegalStateException("This needs a type to tell the user about!");
        }
        HashMap hashMap = new HashMap();
        for (czhh czhhVar : czhd.g(this, czhq.class)) {
            Object a = czhhVar.a();
            if (a != null) {
                if (hashMap.put(a, czhhVar) != null) {
                    String valueOf = String.valueOf(a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                    sb.append("Instantiating multiple extensions with the same key: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                throw new IllegalArgumentException("Extension key must not be null");
            }
        }
        ((czhq) ((czhh) hashMap.get(getIntent().getStringExtra("extra_error_type")))).c().e(g(), "dialog");
    }
}
