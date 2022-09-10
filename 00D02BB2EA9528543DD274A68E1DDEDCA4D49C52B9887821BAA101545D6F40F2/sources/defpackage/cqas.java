package defpackage;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cqas  reason: default package */
/* loaded from: classes.dex */
public abstract class cqas extends BackupAgentHelper {
    public static void c(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else {
            Class<?> cls = null;
            if (obj instanceof Set) {
                Set<String> set = (Set) obj;
                for (String str2 : set) {
                    if (!(str2 instanceof String)) {
                        if (obj != null) {
                            cls = obj.getClass();
                        }
                        String valueOf = String.valueOf(cls);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82 + String.valueOf(valueOf).length());
                        sb.append("Skipping restore of key ");
                        sb.append(str);
                        sb.append(" because its value is a set containing an object of type ");
                        sb.append(valueOf);
                        sb.append(".");
                        sb.toString();
                        return;
                    }
                }
                editor.putStringSet(str, set);
                return;
            }
            if (obj != null) {
                cls = obj.getClass();
            }
            String valueOf2 = String.valueOf(cls);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 69 + String.valueOf(valueOf2).length());
            sb2.append("Skipping restore of key ");
            sb2.append(str);
            sb2.append(" because its value is the unrecognized type ");
            sb2.append(valueOf2);
            sb2.append(".");
            sb2.toString();
        }
    }

    public static boolean e(String str) {
        return !str.contains(File.separator) && !str.contains("/") && !"persistent_backup_agent_helper".equals(str);
    }

    private final void f() {
        getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }

    protected abstract Map<String, dyv> a();

    protected void b(Set<String> set) {
    }

    protected final SharedPreferences d(String str) {
        return getSharedPreferences(str, 0);
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Map<String, dyv> a = a();
        SharedPreferences.Editor edit = getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        edit.clear();
        for (Map.Entry<String, dyv> entry : a.entrySet()) {
            String key = entry.getKey();
            entry.getValue();
            if (e(key)) {
                for (Map.Entry<String, ?> entry2 : d(key).getAll().entrySet()) {
                    String key2 = entry2.getKey();
                    Object value = entry2.getValue();
                    bvjk bvjkVar = dyx.a().get(bvjj.d(key2.endsWith("@OLD_PREFERENCE_VALUE") ? key2.substring(0, key2.length() - 21) : key2));
                    if (bvjkVar != null && bvjkVar.kA.a()) {
                        StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 1 + String.valueOf(key2).length());
                        sb.append(key);
                        sb.append("/");
                        sb.append(key2);
                        c(edit, sb.toString(), value);
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(key).length() + 43);
                sb2.append("Unsupported shared preferences file name \"");
                sb2.append(key);
                sb2.append("\"");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        edit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        f();
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_backup_agent_helper", 0);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            int indexOf = key.indexOf("/");
            if (indexOf < 0 || indexOf >= key.length() - 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 57);
                sb.append("Format of key \"");
                sb.append(key);
                sb.append("\" not understood, so skipping its restore.");
                sb.toString();
            } else {
                String substring = key.substring(0, indexOf);
                String substring2 = key.substring(indexOf + 1);
                SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap.get(substring);
                if (editor == null) {
                    if (!e(substring)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 52);
                        sb2.append("Skipping unsupported shared preferences file name \"");
                        sb2.append(substring);
                        sb2.append("\"");
                        sb2.toString();
                    } else {
                        editor = d(substring).edit();
                        hashMap.put(substring, editor);
                    }
                }
                c(editor, substring2, value);
            }
        }
        for (SharedPreferences.Editor editor2 : hashMap.values()) {
            editor2.apply();
        }
        b(hashMap.keySet());
        f();
    }
}
