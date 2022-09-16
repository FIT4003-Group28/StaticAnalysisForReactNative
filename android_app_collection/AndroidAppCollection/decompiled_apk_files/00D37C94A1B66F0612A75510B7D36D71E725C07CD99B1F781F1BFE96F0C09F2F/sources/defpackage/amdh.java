package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: amdh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amdh implements Callable {
    public final /* synthetic */ amdi a;
    private final /* synthetic */ int b;

    public /* synthetic */ amdh(amdi amdiVar, int i) {
        this.b = i;
        this.a = amdiVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            File file = new File(this.a.c.a.getApplicationInfo().dataDir, "shared_prefs/accounts.xml");
            if (!file.exists()) {
                file = new File(String.valueOf(file.getPath()).concat(".bak"));
            }
            return Boolean.valueOf(file.exists());
        }
        amdj amdjVar = (amdj) this.a.a.get();
        SharedPreferences.Editor edit = amdjVar.a.edit();
        ArrayList arrayList = amdjVar.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            edit.remove((String) arrayList.get(i));
        }
        amdjVar.b.clear();
        return Boolean.valueOf(edit.commit());
    }
}
