package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;
/* compiled from: PG */
/* renamed from: cvpf  reason: default package */
/* loaded from: classes5.dex */
public final class cvpf extends coye {
    private final dxio<SharedPreferences> d;

    public cvpf(coxz coxzVar, String str, dxio<SharedPreferences> dxioVar) {
        super(coxzVar, str);
        this.d = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.coye
    public final boolean a(Configurations configurations) {
        if (configurations != null) {
            f(this.d.a(), configurations);
            return true;
        }
        return true;
    }
}
