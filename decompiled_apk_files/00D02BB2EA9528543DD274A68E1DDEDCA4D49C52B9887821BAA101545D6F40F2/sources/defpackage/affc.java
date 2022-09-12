package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import java.io.File;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: affc  reason: default package */
/* loaded from: classes.dex */
public final class affc extends ContextWrapper {
    private final affi a;

    public affc(Context context) {
        super(context);
        this.a = new affi(new affg(context));
    }

    private final void a() {
        hashCode();
    }

    private static final Context b(Context context) {
        return new affc(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createConfigurationContext(Configuration configuration) {
        return b(super.createConfigurationContext(configuration));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createContextForSplit(String str) {
        return b(super.createContextForSplit(str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDeviceProtectedStorageContext() {
        return b(super.createDeviceProtectedStorageContext());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return b(super.createDisplayContext(display));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createPackageContext(String str, int i) {
        return b(super.createPackageContext(str, i));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createWindowContext(int i, @dzsi Bundle bundle) {
        throw new UnsupportedOperationException("Not supported unitl R: createWindowContext");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteSharedPreferences(String str) {
        a();
        return this.a.b.a(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDatabasePath(String str) {
        File databasePath = super.getDatabasePath(str);
        databasePath.getPath();
        return databasePath;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        a();
        return this.a.a(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean moveSharedPreferencesFrom(Context context, String str) {
        a();
        SharedPreferences.Editor edit = this.a.a(str, 0).edit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Map<String, ?> all = sharedPreferences.getAll();
        edit.clear();
        for (String str2 : all.keySet()) {
            Object obj = all.get(str2);
            if (obj instanceof Boolean) {
                edit.putBoolean(str2, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                edit.putFloat(str2, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                edit.putInt(str2, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                edit.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                edit.putString(str2, (String) obj);
            } else if (obj instanceof Set) {
                edit.putStringSet(str2, sharedPreferences.getStringSet(str2, null));
            }
        }
        if (edit.commit()) {
            if (Build.VERSION.SDK_INT < 24) {
                return true;
            }
            context.deleteSharedPreferences(str);
            return true;
        }
        return false;
    }
}
