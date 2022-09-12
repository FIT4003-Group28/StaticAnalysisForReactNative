package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import dagger.internal.Factory;
import java.io.File;
/* compiled from: PG */
/* renamed from: dalp  reason: default package */
/* loaded from: classes5.dex */
public final class dalp implements Factory<File> {
    private final dzsj<Context> a;

    public dalp(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        String string;
        Context a = ((dalo) this.a).a();
        try {
            Bundle bundle = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(a.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
