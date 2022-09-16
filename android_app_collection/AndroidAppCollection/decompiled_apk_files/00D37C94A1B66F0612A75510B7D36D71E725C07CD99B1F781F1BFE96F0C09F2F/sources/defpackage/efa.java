package defpackage;

import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: efa  reason: default package */
/* loaded from: classes3.dex */
public abstract class efa extends eeq {
    @Override // android.app.Activity
    public final Intent getIntent() {
        Intent intent = super.getIntent();
        try {
            intent.getExtras().isEmpty();
        } catch (Exception unused) {
            intent.replaceExtras((Bundle) null);
        }
        return intent;
    }
}
