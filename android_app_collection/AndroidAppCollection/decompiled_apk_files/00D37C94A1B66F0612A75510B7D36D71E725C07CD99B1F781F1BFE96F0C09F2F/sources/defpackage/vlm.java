package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: vlm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vlm implements Callable {
    public final /* synthetic */ vlr a;
    private final /* synthetic */ int b;

    public /* synthetic */ vlm(vlr vlrVar, int i) {
        this.b = i;
        this.a = vlrVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            vlr vlrVar = this.a;
            vlrVar.e = vlrVar.a.getSharedPreferences(vlrVar.b, 0);
            Set<String> set = vlrVar.c;
            if (set == null) {
                return Boolean.valueOf(!vlrVar.e.getAll().isEmpty());
            }
            for (String str : set) {
                if (vlrVar.e.contains(str)) {
                    return true;
                }
            }
            return false;
        }
        vlr vlrVar2 = this.a;
        Set<String> set2 = vlrVar2.c;
        if (set2 == null) {
            set2 = vlrVar2.e.getAll().keySet();
        }
        SharedPreferences.Editor edit = vlrVar2.e.edit();
        for (String str2 : set2) {
            edit.remove(str2);
        }
        if (!edit.commit()) {
            String valueOf = String.valueOf(vlrVar2.b);
            throw new IOException(valueOf.length() != 0 ? "Failed to remove migrated SharedPreferences keys: ".concat(valueOf) : new String("Failed to remove migrated SharedPreferences keys: "));
        } else if (!vlrVar2.d || !vlrVar2.e.getAll().isEmpty()) {
            return null;
        } else {
            File file = new File(new File(vlrVar2.a.getApplicationInfo().dataDir, "shared_prefs"), String.valueOf(vlrVar2.b).concat(".xml"));
            File file2 = new File(String.valueOf(file.getPath()).concat(".bak"));
            file.delete();
            file2.delete();
            if (!file.exists() && !file2.exists()) {
                return null;
            }
            String valueOf2 = String.valueOf(vlrVar2.b);
            throw new IOException(valueOf2.length() != 0 ? "Failed to delete empty SharedPreferences file: ".concat(valueOf2) : new String("Failed to delete empty SharedPreferences file: "));
        }
    }
}
